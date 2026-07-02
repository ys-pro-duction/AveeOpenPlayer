package com.daaw;

import android.text.TextUtils;
import android.util.Base64;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class AO0 {
    public static final AO0 a = new AO0();

    public final PublicKey a(String str) throws IOException {
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
            G10.f(publicKeyGeneratePublic, "generatePublic(...)");
            return publicKeyGeneratePublic;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (InvalidKeySpecException e2) {
            String str2 = "Invalid key specification: " + e2;
            b(str2);
            throw new IOException(str2);
        }
    }

    public final boolean c(PublicKey publicKey, String str, String str2) {
        G10.g(str, "signedData");
        try {
            byte[] bArrDecode = Base64.decode(str2, 0);
            G10.f(bArrDecode, "decode(...)");
            try {
                Signature signature = Signature.getInstance("SHA1withRSA");
                signature.initVerify(publicKey);
                byte[] bytes = str.getBytes(C0335Ak.b);
                G10.f(bytes, "getBytes(...)");
                signature.update(bytes);
                if (signature.verify(bArrDecode)) {
                    return true;
                }
                b("Signature verification failed.");
                return false;
            } catch (InvalidKeyException unused) {
                b("Invalid key specification.");
                return false;
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            } catch (SignatureException unused2) {
                b("Signature exception.");
                return false;
            }
        } catch (IllegalArgumentException unused3) {
            b("Base64 decoding failed.");
            return false;
        }
    }

    public final boolean d(String str, String str2, String str3) {
        G10.g(str2, "signedData");
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str3)) {
            return c(a(str), str2, str3);
        }
        b("Purchase verification failed: missing data.");
        return false;
    }

    public final void b(String str) {
    }
}
