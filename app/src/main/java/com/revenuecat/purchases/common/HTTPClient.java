package com.revenuecat.purchases.common;

import android.os.Build;
import com.daaw.AbstractC1473Lg0;
import com.daaw.AbstractC2911Yw;
import com.daaw.BY0;
import com.daaw.C0576Cs0;
import com.daaw.D61;
import com.daaw.G10;
import com.daaw.LE;
import com.daaw.N21;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.common.networking.ETagManager;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.HTTPRequest;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.common.networking.MapConverter;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.strings.NetworkStrings;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u0000 \\2\u00020\u0001:\u0001\\B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0013\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0013\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u0019H\u0002¢\u0006\u0004\b#\u0010$Jq\u00101\u001a\u0004\u0018\u0001002\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010)2\u001a\u0010,\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190+\u0018\u00010*2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190)2\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b1\u00102J1\u00107\u001a\u00020\"2\u0006\u0010(\u001a\u00020'2\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020.2\b\u00106\u001a\u0004\u0018\u000100H\u0002¢\u0006\u0004\b7\u00108J[\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190)2\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190)2\u0006\u0010:\u001a\u00020\u00192\u0006\u0010/\u001a\u00020.2\b\u0010;\u001a\u0004\u0018\u00010\u00192\u0006\u0010<\u001a\u00020.2\b\u0010=\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010B\u001a\u00020\u001c2\u0006\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u0019H\u0002¢\u0006\u0004\bD\u0010EJ=\u0010I\u001a\u00020H2\u0006\u0010:\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020F2\b\u0010G\u001a\u0004\u0018\u00010\u00192\b\u0010;\u001a\u0004\u0018\u00010\u00192\b\u0010=\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\bI\u0010JJ\u001f\u0010L\u001a\n K*\u0004\u0018\u00010\u00190\u00192\u0006\u0010\u001d\u001a\u00020FH\u0002¢\u0006\u0004\bL\u0010MJ\u0019\u0010N\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001d\u001a\u00020FH\u0002¢\u0006\u0004\bN\u0010MJ\u0019\u0010O\u001a\u0004\u0018\u0001032\u0006\u0010\u001d\u001a\u00020FH\u0002¢\u0006\u0004\bO\u0010PJo\u0010Q\u001a\u0002002\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010)2\u001a\u0010,\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190+\u0018\u00010*2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190)2\b\b\u0002\u0010/\u001a\u00020.¢\u0006\u0004\bQ\u00102J\r\u0010R\u001a\u00020\"¢\u0006\u0004\bR\u0010SR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010TR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010UR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010VR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010W\u001a\u0004\bX\u0010YR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010ZR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010[¨\u0006]"}, d2 = {"Lcom/revenuecat/purchases/common/HTTPClient;", "", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/common/networking/ETagManager;", "eTagManager", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "diagnosticsTrackerIfEnabled", "Lcom/revenuecat/purchases/common/verification/SigningManager;", "signingManager", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "Lcom/revenuecat/purchases/common/networking/MapConverter;", "mapConverter", "<init>", "(Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/networking/ETagManager;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;Lcom/revenuecat/purchases/common/verification/SigningManager;Lcom/revenuecat/purchases/common/DateProvider;Lcom/revenuecat/purchases/common/networking/MapConverter;)V", "Ljava/io/InputStream;", "inputStream", "Ljava/io/BufferedReader;", "buffer", "(Ljava/io/InputStream;)Ljava/io/BufferedReader;", "Ljava/io/OutputStream;", "outputStream", "Ljava/io/BufferedWriter;", "(Ljava/io/OutputStream;)Ljava/io/BufferedWriter;", "", "readFully", "(Ljava/io/InputStream;)Ljava/lang/String;", "Ljava/net/HttpURLConnection;", "connection", "getInputStream", "(Ljava/net/HttpURLConnection;)Ljava/io/InputStream;", "writer", "body", "Lcom/daaw/G91;", "writeFully", "(Ljava/io/BufferedWriter;Ljava/lang/String;)V", "Ljava/net/URL;", "baseURL", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "endpoint", "", "", "Lcom/daaw/Cs0;", "postFieldsToSign", "requestHeaders", "", "refreshETag", "Lcom/revenuecat/purchases/common/networking/HTTPResult;", "performCall", "(Ljava/net/URL;Lcom/revenuecat/purchases/common/networking/Endpoint;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;Z)Lcom/revenuecat/purchases/common/networking/HTTPResult;", "Ljava/util/Date;", "requestStartTime", "callSuccessful", "callResult", "trackHttpRequestPerformedIfNeeded", "(Lcom/revenuecat/purchases/common/networking/Endpoint;Ljava/util/Date;ZLcom/revenuecat/purchases/common/networking/HTTPResult;)V", "authenticationHeaders", "urlPath", "nonce", "shouldSignResponse", "postFieldsToSignHeader", "getHeaders", "(Ljava/util/Map;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;)Ljava/util/Map;", "Lcom/revenuecat/purchases/common/networking/HTTPRequest;", "request", "getConnection", "(Lcom/revenuecat/purchases/common/networking/HTTPRequest;)Ljava/net/HttpURLConnection;", "getXPlatformHeader", "()Ljava/lang/String;", "Ljava/net/URLConnection;", "payload", "Lcom/revenuecat/purchases/VerificationResult;", "verifyResponse", "(Ljava/lang/String;Ljava/net/URLConnection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/VerificationResult;", "kotlin.jvm.PlatformType", "getETagHeader", "(Ljava/net/URLConnection;)Ljava/lang/String;", "getRequestTimeHeader", "getRequestDateHeader", "(Ljava/net/URLConnection;)Ljava/util/Date;", "performRequest", "clearCaches", "()V", "Lcom/revenuecat/purchases/common/AppConfig;", "Lcom/revenuecat/purchases/common/networking/ETagManager;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "Lcom/revenuecat/purchases/common/verification/SigningManager;", "getSigningManager", "()Lcom/revenuecat/purchases/common/verification/SigningManager;", "Lcom/revenuecat/purchases/common/DateProvider;", "Lcom/revenuecat/purchases/common/networking/MapConverter;", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class HTTPClient {
    public static final int NO_STATUS_CODE = -1;
    private final AppConfig appConfig;
    private final DateProvider dateProvider;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final ETagManager eTagManager;
    private final MapConverter mapConverter;
    private final SigningManager signingManager;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Store.values().length];
            try {
                iArr[Store.AMAZON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public HTTPClient(AppConfig appConfig, ETagManager eTagManager, DiagnosticsTracker diagnosticsTracker, SigningManager signingManager, DateProvider dateProvider, MapConverter mapConverter) {
        G10.g(appConfig, "appConfig");
        G10.g(eTagManager, "eTagManager");
        G10.g(signingManager, "signingManager");
        G10.g(dateProvider, "dateProvider");
        G10.g(mapConverter, "mapConverter");
        this.appConfig = appConfig;
        this.eTagManager = eTagManager;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.signingManager = signingManager;
        this.dateProvider = dateProvider;
        this.mapConverter = mapConverter;
    }

    private final BufferedReader buffer(InputStream inputStream) {
        return new BufferedReader(new InputStreamReader(inputStream));
    }

    private final HttpURLConnection getConnection(HTTPRequest request) throws IOException {
        URLConnection uRLConnectionOpenConnection = request.getFullURL().openConnection();
        G10.e(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        for (Map.Entry<String, String> entry : request.getHeaders().entrySet()) {
            httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
        }
        JSONObject body = request.getBody();
        if (body != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            OutputStream outputStream = httpURLConnection.getOutputStream();
            G10.f(outputStream, "os");
            BufferedWriter bufferedWriterBuffer = buffer(outputStream);
            String string = body.toString();
            G10.f(string, "body.toString()");
            writeFully(bufferedWriterBuffer, string);
        }
        return httpURLConnection;
    }

    private final String getETagHeader(URLConnection connection) {
        return connection.getHeaderField("X-RevenueCat-ETag");
    }

    private final Map<String, String> getHeaders(Map<String, String> authenticationHeaders, String urlPath, boolean refreshETag, String nonce, boolean shouldSignResponse, String postFieldsToSignHeader) {
        return MapExtensionsKt.filterNotNullValues(AbstractC1473Lg0.n(AbstractC1473Lg0.n(AbstractC1473Lg0.k(D61.a("Content-Type", "application/json"), D61.a("X-Platform", getXPlatformHeader()), D61.a("X-Platform-Flavor", this.appConfig.getPlatformInfo().getFlavor()), D61.a("X-Platform-Flavor-Version", this.appConfig.getPlatformInfo().getVersion()), D61.a("X-Platform-Version", String.valueOf(Build.VERSION.SDK_INT)), D61.a("X-Version", "7.0.0"), D61.a("X-Client-Locale", this.appConfig.getLanguageTag()), D61.a("X-Client-Version", this.appConfig.getVersionName()), D61.a("X-Client-Bundle-ID", this.appConfig.getPackageName()), D61.a("X-Observer-Mode-Enabled", this.appConfig.getFinishTransactions() ? "false" : "true"), D61.a("X-Nonce", nonce), D61.a(HTTPRequest.POST_PARAMS_HASH, postFieldsToSignHeader), D61.a("X-Custom-Entitlements-Computation", this.appConfig.getCustomEntitlementComputation() ? "true" : null)), authenticationHeaders), this.eTagManager.getETagHeaders$purchases_defaultsRelease(urlPath, shouldSignResponse, refreshETag)));
    }

    private final InputStream getInputStream(HttpURLConnection connection) throws Exception {
        try {
            return connection.getInputStream();
        } catch (Exception e) {
            if (!(e instanceof IllegalArgumentException ? true : e instanceof IOException)) {
                throw e;
            }
            LogIntent logIntent = LogIntent.WARNING;
            String str = String.format(NetworkStrings.PROBLEM_CONNECTING, Arrays.copyOf(new Object[]{e.getMessage()}, 1));
            G10.f(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
            return connection.getErrorStream();
        }
    }

    private final Date getRequestDateHeader(URLConnection connection) {
        String requestTimeHeader = getRequestTimeHeader(connection);
        if (requestTimeHeader != null) {
            return new Date(Long.parseLong(requestTimeHeader));
        }
        return null;
    }

    private final String getRequestTimeHeader(URLConnection connection) {
        String headerField = connection.getHeaderField(HTTPResult.REQUEST_TIME_HEADER_NAME);
        if (headerField == null || BY0.O(headerField)) {
            return null;
        }
        return headerField;
    }

    private final String getXPlatformHeader() {
        return WhenMappings.$EnumSwitchMapping$0[this.appConfig.getStore().ordinal()] == 1 ? "amazon" : "android";
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.revenuecat.purchases.common.networking.HTTPResult performCall(java.net.URL r25, com.revenuecat.purchases.common.networking.Endpoint r26, java.util.Map<java.lang.String, ? extends java.lang.Object> r27, java.util.List<com.daaw.C0576Cs0> r28, java.util.Map<java.lang.String, java.lang.String> r29, boolean r30) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.common.HTTPClient.performCall(java.net.URL, com.revenuecat.purchases.common.networking.Endpoint, java.util.Map, java.util.List, java.util.Map, boolean):com.revenuecat.purchases.common.networking.HTTPResult");
    }

    private final String readFully(InputStream inputStream) {
        return N21.c(buffer(inputStream));
    }

    private final void trackHttpRequestPerformedIfNeeded(Endpoint endpoint, Date requestStartTime, boolean callSuccessful, HTTPResult callResult) {
        VerificationResult verificationResult;
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker != null) {
            long jBetween = DurationExtensionsKt.between(LE.B, requestStartTime, this.dateProvider.getNow());
            int responseCode = callSuccessful ? callResult != null ? callResult.getResponseCode() : RCHTTPStatusCodes.NOT_MODIFIED : -1;
            HTTPResult.Origin origin = callResult != null ? callResult.getOrigin() : null;
            if (callResult == null || (verificationResult = callResult.getVerificationResult()) == null) {
                verificationResult = VerificationResult.NOT_REQUESTED;
            }
            diagnosticsTracker.m104trackHttpRequestPerformedNcHsxvU(endpoint, jBetween, callSuccessful && RCHTTPStatusCodes.INSTANCE.isSuccessful(responseCode), responseCode, origin, verificationResult);
        }
    }

    private final VerificationResult verifyResponse(String urlPath, URLConnection connection, String payload, String nonce, String postFieldsToSignHeader) {
        return this.signingManager.verifyResponse(urlPath, connection.getHeaderField(HTTPResult.SIGNATURE_HEADER_NAME), nonce, payload, getRequestTimeHeader(connection), getETagHeader(connection), postFieldsToSignHeader);
    }

    private final void writeFully(BufferedWriter writer, String body) throws IOException {
        writer.write(body);
        writer.flush();
    }

    public final void clearCaches() {
        this.eTagManager.clearCaches$purchases_defaultsRelease();
    }

    public final SigningManager getSigningManager() {
        return this.signingManager;
    }

    public final HTTPResult performRequest(URL baseURL, Endpoint endpoint, Map<String, ? extends Object> body, List<C0576Cs0> postFieldsToSign, Map<String, String> requestHeaders, boolean refreshETag) {
        G10.g(baseURL, "baseURL");
        G10.g(endpoint, "endpoint");
        G10.g(requestHeaders, "requestHeaders");
        if (this.appConfig.getForceServerErrors()) {
            LogUtilsKt.warnLog("Forcing server error for request to " + endpoint.getPath());
            return new HTTPResult(500, "", HTTPResult.Origin.BACKEND, null, VerificationResult.NOT_REQUESTED);
        }
        Date now = this.dateProvider.getNow();
        try {
            HTTPResult hTTPResultPerformCall = performCall(baseURL, endpoint, body, postFieldsToSign, requestHeaders, refreshETag);
            trackHttpRequestPerformedIfNeeded(endpoint, now, true, hTTPResultPerformCall);
            if (hTTPResultPerformCall != null) {
                return hTTPResultPerformCall;
            }
            LogWrapperKt.log(LogIntent.WARNING, NetworkStrings.ETAG_RETRYING_CALL);
            return performRequest(baseURL, endpoint, body, postFieldsToSign, requestHeaders, true);
        } catch (Throwable th) {
            trackHttpRequestPerformedIfNeeded(endpoint, now, false, null);
            throw th;
        }
    }

    private final BufferedWriter buffer(OutputStream outputStream) {
        return new BufferedWriter(new OutputStreamWriter(outputStream));
    }

    public /* synthetic */ HTTPClient(AppConfig appConfig, ETagManager eTagManager, DiagnosticsTracker diagnosticsTracker, SigningManager signingManager, DateProvider dateProvider, MapConverter mapConverter, int i, AbstractC2911Yw abstractC2911Yw) {
        this(appConfig, eTagManager, diagnosticsTracker, signingManager, (i & 16) != 0 ? new DefaultDateProvider() : dateProvider, (i & 32) != 0 ? new MapConverter() : mapConverter);
    }
}
