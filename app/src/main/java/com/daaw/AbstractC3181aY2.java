package com.daaw;

import java.lang.reflect.InvocationTargetException;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;
import org.conscrypt.Conscrypt;

/* JADX INFO: renamed from: com.daaw.aY2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3181aY2 {
    public static final ThreadLocal a = new ZX2();

    public static /* synthetic */ SecureRandom a() {
        SecureRandom secureRandomC = c();
        secureRandomC.nextLong();
        return secureRandomC;
    }

    public static byte[] b(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) a.get()).nextBytes(bArr);
        return bArr;
    }

    public static SecureRandom c() {
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                return SecureRandom.getInstance("SHA1PRNG", "GmsCore_OpenSSL");
                            } catch (IllegalAccessException e) {
                                e = e;
                                throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
                            } catch (IllegalArgumentException e2) {
                                e = e2;
                                throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
                            } catch (NoSuchMethodException e3) {
                                e = e3;
                                throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
                            } catch (InvocationTargetException e4) {
                                e = e4;
                                throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
                            }
                        } catch (GeneralSecurityException unused) {
                            int i = Conscrypt.a;
                            return SecureRandom.getInstance("SHA1PRNG", (Provider) Conscrypt.class.getMethod("newProvider", null).invoke(null, null));
                        }
                    } catch (GeneralSecurityException unused2) {
                        return SecureRandom.getInstance("SHA1PRNG", "AndroidOpenSSL");
                    }
                } catch (GeneralSecurityException unused3) {
                    return new SecureRandom();
                }
            } catch (GeneralSecurityException unused4) {
                return SecureRandom.getInstance("SHA1PRNG", "Conscrypt");
            }
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e5) {
            e = e5;
            throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
        }
    }
}
