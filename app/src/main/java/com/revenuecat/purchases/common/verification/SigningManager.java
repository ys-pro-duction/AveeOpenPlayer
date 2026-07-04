package com.revenuecat.purchases.common.verification;

import android.util.Base64;
import com.daaw.AbstractC1599Mm;
import com.daaw.AbstractC1703Nm;
import com.daaw.AbstractC2455Um;
import com.daaw.AbstractC2911Yw;
import com.daaw.BY0;
import com.daaw.C0335Ak;
import com.daaw.C0576Cs0;
import com.daaw.C6902no0;
import com.daaw.G10;
import com.daaw.G91;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Constants;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.strings.NetworkStrings;
import com.revenuecat.purchases.utils.Result;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 %2\u00020\u0001:\u0002%&B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\n2\u001a\u0010\u0013\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0012\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015JQ\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$¨\u0006'"}, d2 = {"Lcom/revenuecat/purchases/common/verification/SigningManager;", "", "Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode;", "signatureVerificationMode", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "", "apiKey", "<init>", "(Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode;Lcom/revenuecat/purchases/common/AppConfig;Ljava/lang/String;)V", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "endpoint", "", "shouldVerifyEndpoint", "(Lcom/revenuecat/purchases/common/networking/Endpoint;)Z", "createRandomNonce", "()Ljava/lang/String;", "", "Lcom/daaw/Cs0;", "postFieldsToSign", "getPostParamsForSigningHeaderIfNeeded", "(Lcom/revenuecat/purchases/common/networking/Endpoint;Ljava/util/List;)Ljava/lang/String;", "urlPath", "signatureString", "nonce", "body", "requestTime", "eTag", "postFieldsToSignHeader", "Lcom/revenuecat/purchases/VerificationResult;", "verifyResponse", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/VerificationResult;", "Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode;", "getSignatureVerificationMode", "()Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode;", "Lcom/revenuecat/purchases/common/AppConfig;", "Ljava/lang/String;", "Companion", "Parameters", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SigningManager {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int NONCE_BYTES_SIZE = 12;

    @Deprecated
    public static final String POST_PARAMS_ALGORITHM = "sha256";

    @Deprecated
    public static final byte POST_PARAMS_SEPARATOR = 0;
    private final String apiKey;
    private final AppConfig appConfig;
    private final SignatureVerificationMode signatureVerificationMode;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0005\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/revenuecat/purchases/common/verification/SigningManager$Companion;", "", "()V", "NONCE_BYTES_SIZE", "", "POST_PARAMS_ALGORITHM", "", "POST_PARAMS_SEPARATOR", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003Ja\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010#\u001a\u00020$H\u0016J\u0006\u0010%\u001a\u00020\u0003J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006'"}, d2 = {"Lcom/revenuecat/purchases/common/verification/SigningManager$Parameters;", "", "salt", "", "apiKey", "", "nonce", "urlPath", "postParamsHashHeader", "requestTime", "eTag", "body", "([BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApiKey", "()Ljava/lang/String;", "getBody", "getETag", "getNonce", "getPostParamsHashHeader", "getRequestTime", "getSalt", "()[B", "getUrlPath", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toSignatureToVerify", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class Parameters {
        private final String apiKey;
        private final String body;
        private final String eTag;
        private final String nonce;
        private final String postParamsHashHeader;
        private final String requestTime;
        private final byte[] salt;
        private final String urlPath;

        public Parameters(byte[] bArr, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            G10.g(bArr, "salt");
            G10.g(str, "apiKey");
            G10.g(str3, "urlPath");
            G10.g(str5, "requestTime");
            this.salt = bArr;
            this.apiKey = str;
            this.nonce = str2;
            this.urlPath = str3;
            this.postParamsHashHeader = str4;
            this.requestTime = str5;
            this.eTag = str6;
            this.body = str7;
        }

        public static /* synthetic */ Parameters copy$default(Parameters parameters, byte[] bArr, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
            if ((i & 1) != 0) {
                bArr = parameters.salt;
            }
            if ((i & 2) != 0) {
                str = parameters.apiKey;
            }
            if ((i & 4) != 0) {
                str2 = parameters.nonce;
            }
            if ((i & 8) != 0) {
                str3 = parameters.urlPath;
            }
            if ((i & 16) != 0) {
                str4 = parameters.postParamsHashHeader;
            }
            if ((i & 32) != 0) {
                str5 = parameters.requestTime;
            }
            if ((i & 64) != 0) {
                str6 = parameters.eTag;
            }
            if ((i & 128) != 0) {
                str7 = parameters.body;
            }
            String str8 = str6;
            String str9 = str7;
            String str10 = str4;
            String str11 = str5;
            return parameters.copy(bArr, str, str2, str3, str10, str11, str8, str9);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final byte[] getSalt() {
            return this.salt;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getApiKey() {
            return this.apiKey;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getNonce() {
            return this.nonce;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getUrlPath() {
            return this.urlPath;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getPostParamsHashHeader() {
            return this.postParamsHashHeader;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getRequestTime() {
            return this.requestTime;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getETag() {
            return this.eTag;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getBody() {
            return this.body;
        }

        public final Parameters copy(byte[] salt, String apiKey, String nonce, String urlPath, String postParamsHashHeader, String requestTime, String eTag, String body) {
            G10.g(salt, "salt");
            G10.g(apiKey, "apiKey");
            G10.g(urlPath, "urlPath");
            G10.g(requestTime, "requestTime");
            return new Parameters(salt, apiKey, nonce, urlPath, postParamsHashHeader, requestTime, eTag, body);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!G10.c(Parameters.class, other != null ? other.getClass() : null)) {
                return false;
            }
            G10.e(other, "null cannot be cast to non-null type com.revenuecat.purchases.common.verification.SigningManager.Parameters");
            Parameters parameters = (Parameters) other;
            return Arrays.equals(this.salt, parameters.salt) && G10.c(this.apiKey, parameters.apiKey) && G10.c(this.nonce, parameters.nonce) && G10.c(this.urlPath, parameters.urlPath) && G10.c(this.postParamsHashHeader, parameters.postParamsHashHeader) && G10.c(this.requestTime, parameters.requestTime) && G10.c(this.eTag, parameters.eTag) && G10.c(this.body, parameters.body);
        }

        public final String getApiKey() {
            return this.apiKey;
        }

        public final String getBody() {
            return this.body;
        }

        public final String getETag() {
            return this.eTag;
        }

        public final String getNonce() {
            return this.nonce;
        }

        public final String getPostParamsHashHeader() {
            return this.postParamsHashHeader;
        }

        public final String getRequestTime() {
            return this.requestTime;
        }

        public final byte[] getSalt() {
            return this.salt;
        }

        public final String getUrlPath() {
            return this.urlPath;
        }

        public int hashCode() {
            int iHashCode = ((Arrays.hashCode(this.salt) * 31) + this.apiKey.hashCode()) * 31;
            String str = this.nonce;
            int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.urlPath.hashCode()) * 31;
            String str2 = this.postParamsHashHeader;
            int iHashCode3 = (((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.requestTime.hashCode()) * 31;
            String str3 = this.eTag;
            int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.body;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final byte[] toSignatureToVerify() {
            /*
                r5 = this;
                byte[] r0 = r5.salt
                java.lang.String r1 = r5.apiKey
                java.nio.charset.Charset r2 = com.daaw.C0335Ak.b
                byte[] r1 = r1.getBytes(r2)
                java.lang.String r3 = "this as java.lang.String).getBytes(charset)"
                com.daaw.G10.f(r1, r3)
                byte[] r0 = com.daaw.AbstractC5152hb.r(r0, r1)
                java.lang.String r1 = r5.nonce
                r4 = 0
                if (r1 == 0) goto L1d
                byte[] r1 = android.util.Base64.decode(r1, r4)
                goto L1e
            L1d:
                r1 = 0
            L1e:
                if (r1 != 0) goto L22
                byte[] r1 = new byte[r4]
            L22:
                byte[] r0 = com.daaw.AbstractC5152hb.r(r0, r1)
                java.lang.String r1 = r5.urlPath
                byte[] r1 = r1.getBytes(r2)
                com.daaw.G10.f(r1, r3)
                byte[] r0 = com.daaw.AbstractC5152hb.r(r0, r1)
                java.lang.String r1 = r5.postParamsHashHeader
                if (r1 == 0) goto L40
                byte[] r1 = r1.getBytes(r2)
                com.daaw.G10.f(r1, r3)
                if (r1 != 0) goto L42
            L40:
                byte[] r1 = new byte[r4]
            L42:
                byte[] r0 = com.daaw.AbstractC5152hb.r(r0, r1)
                java.lang.String r1 = r5.requestTime
                byte[] r1 = r1.getBytes(r2)
                com.daaw.G10.f(r1, r3)
                byte[] r0 = com.daaw.AbstractC5152hb.r(r0, r1)
                java.lang.String r1 = r5.eTag
                if (r1 == 0) goto L60
                byte[] r1 = r1.getBytes(r2)
                com.daaw.G10.f(r1, r3)
                if (r1 != 0) goto L62
            L60:
                byte[] r1 = new byte[r4]
            L62:
                byte[] r0 = com.daaw.AbstractC5152hb.r(r0, r1)
                java.lang.String r1 = r5.body
                if (r1 == 0) goto L73
                byte[] r1 = r1.getBytes(r2)
                com.daaw.G10.f(r1, r3)
                if (r1 != 0) goto L75
            L73:
                byte[] r1 = new byte[r4]
            L75:
                byte[] r0 = com.daaw.AbstractC5152hb.r(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.common.verification.SigningManager.Parameters.toSignatureToVerify():byte[]");
        }

        public String toString() {
            return "Parameters(salt=" + Arrays.toString(this.salt) + ", apiKey=" + this.apiKey + ", nonce=" + this.nonce + ", urlPath=" + this.urlPath + ", postParamsHashHeader=" + this.postParamsHashHeader + ", requestTime=" + this.requestTime + ", eTag=" + this.eTag + ", body=" + this.body + ')';
        }
    }

    public SigningManager(SignatureVerificationMode signatureVerificationMode, AppConfig appConfig, String str) {
        G10.g(signatureVerificationMode, "signatureVerificationMode");
        G10.g(appConfig, "appConfig");
        G10.g(str, "apiKey");
        this.signatureVerificationMode = signatureVerificationMode;
        this.appConfig = appConfig;
        this.apiKey = str;
    }

    public final String createRandomNonce() {
        byte[] bArr = new byte[12];
        new SecureRandom().nextBytes(bArr);
        byte[] bArrEncode = Base64.encode(bArr, 0);
        G10.f(bArrEncode, "encode(bytes, Base64.DEFAULT)");
        return BY0.D0(new String(bArrEncode, C0335Ak.b)).toString();
    }

    public final String getPostParamsForSigningHeaderIfNeeded(Endpoint endpoint, List<C0576Cs0> postFieldsToSign) {
        G10.g(endpoint, "endpoint");
        List<C0576Cs0> list = postFieldsToSign;
        if (list == null || list.isEmpty() || !shouldVerifyEndpoint(endpoint)) {
            return null;
        }
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        List<C0576Cs0> list2 = postFieldsToSign;
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC1599Mm.u();
            }
            C0576Cs0 c0576Cs0 = (C0576Cs0) obj;
            if (i > 0) {
                messageDigest.update((byte) 0);
            }
            byte[] bytes = ((String) c0576Cs0.d()).getBytes(C0335Ak.b);
            G10.f(bytes, "this as java.lang.String).getBytes(charset)");
            messageDigest.update(bytes);
            arrayList.add(G91.a);
            i = i2;
        }
        byte[] bArrDigest = messageDigest.digest();
        G10.f(bArrDigest, "sha256Digest.digest()");
        String string = "";
        for (byte b : bArrDigest) {
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
            G10.f(str, "format(this, *args)");
            sb.append(str);
            string = sb.toString();
        }
        return AbstractC2455Um.n0(AbstractC1599Mm.n(AbstractC2455Um.n0(list2, ",", null, null, 0, null, SigningManager$getPostParamsForSigningHeaderIfNeeded$header$1.INSTANCE, 30, null), POST_PARAMS_ALGORITHM, string), Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, null, null, 0, null, null, 62, null);
    }

    public final SignatureVerificationMode getSignatureVerificationMode() {
        return this.signatureVerificationMode;
    }

    public final boolean shouldVerifyEndpoint(Endpoint endpoint) {
        G10.g(endpoint, "endpoint");
        return endpoint.getSupportsSignatureVerification() && this.signatureVerificationMode.getShouldVerify();
    }

    public final VerificationResult verifyResponse(String urlPath, String signatureString, String nonce, String body, String requestTime, String eTag, String postFieldsToSignHeader) {
        G10.g(urlPath, "urlPath");
        if (this.appConfig.getForceSigningErrors()) {
            LogUtilsKt.warnLog("Forcing signing error for request with path: " + urlPath);
            return VerificationResult.FAILED;
        }
        IntermediateSignatureHelper intermediateSignatureHelper = this.signatureVerificationMode.getIntermediateSignatureHelper();
        if (intermediateSignatureHelper == null) {
            return VerificationResult.NOT_REQUESTED;
        }
        if (signatureString == null) {
            String str = String.format(NetworkStrings.VERIFICATION_MISSING_SIGNATURE, Arrays.copyOf(new Object[]{urlPath}, 1));
            G10.f(str, "format(this, *args)");
            LogUtilsKt.errorLog$default(str, null, 2, null);
            return VerificationResult.FAILED;
        }
        if (requestTime == null) {
            String str2 = String.format(NetworkStrings.VERIFICATION_MISSING_REQUEST_TIME, Arrays.copyOf(new Object[]{urlPath}, 1));
            G10.f(str2, "format(this, *args)");
            LogUtilsKt.errorLog$default(str2, null, 2, null);
            return VerificationResult.FAILED;
        }
        if (body == null && eTag == null) {
            String str3 = String.format(NetworkStrings.VERIFICATION_MISSING_BODY_OR_ETAG, Arrays.copyOf(new Object[]{urlPath}, 1));
            G10.f(str3, "format(this, *args)");
            LogUtilsKt.errorLog$default(str3, null, 2, null);
            return VerificationResult.FAILED;
        }
        try {
            Signature signatureFromString$purchases_defaultsRelease = Signature.INSTANCE.fromString$purchases_defaultsRelease(signatureString);
            Result<SignatureVerifier, PurchasesError> resultCreateIntermediateKeyVerifierIfVerified = intermediateSignatureHelper.createIntermediateKeyVerifierIfVerified(signatureFromString$purchases_defaultsRelease);
            if (resultCreateIntermediateKeyVerifierIfVerified instanceof Result.Error) {
                String str4 = String.format(NetworkStrings.VERIFICATION_INTERMEDIATE_KEY_FAILED, Arrays.copyOf(new Object[]{urlPath, ((PurchasesError) ((Result.Error) resultCreateIntermediateKeyVerifierIfVerified).getValue()).getUnderlyingErrorMessage()}, 2));
                G10.f(str4, "format(this, *args)");
                LogUtilsKt.errorLog$default(str4, null, 2, null);
                return VerificationResult.FAILED;
            }
            if (!(resultCreateIntermediateKeyVerifierIfVerified instanceof Result.Success)) {
                throw new C6902no0();
            }
            if (((SignatureVerifier) ((Result.Success) resultCreateIntermediateKeyVerifierIfVerified).getValue()).verify(signatureFromString$purchases_defaultsRelease.getPayload(), new Parameters(signatureFromString$purchases_defaultsRelease.getSalt(), this.apiKey, nonce, urlPath, postFieldsToSignHeader, requestTime, eTag, body).toSignatureToVerify())) {
                String str5 = String.format(NetworkStrings.VERIFICATION_SUCCESS, Arrays.copyOf(new Object[]{urlPath}, 1));
                G10.f(str5, "format(this, *args)");
                LogUtilsKt.verboseLog(str5);
                return VerificationResult.VERIFIED;
            }
            String str6 = String.format(NetworkStrings.VERIFICATION_ERROR, Arrays.copyOf(new Object[]{urlPath}, 1));
            G10.f(str6, "format(this, *args)");
            LogUtilsKt.errorLog$default(str6, null, 2, null);
            return VerificationResult.FAILED;
        } catch (InvalidSignatureSizeException e) {
            String str7 = String.format(NetworkStrings.VERIFICATION_INVALID_SIZE, Arrays.copyOf(new Object[]{urlPath, e.getMessage()}, 2));
            G10.f(str7, "format(this, *args)");
            LogUtilsKt.errorLog$default(str7, null, 2, null);
            return VerificationResult.FAILED;
        }
    }
}
