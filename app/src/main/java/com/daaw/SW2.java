package com.daaw;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public final class SW2 implements InterfaceC5681jT2 {
    public static final ThreadLocal b = new RW2();
    public static final boolean c;
    public final SecretKey a;

    static {
        boolean z;
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        c = z;
    }

    public SW2(byte[] bArr) throws InvalidAlgorithmParameterException {
        W23.a(bArr.length);
        this.a = new SecretKeySpec(bArr, "AES");
    }

    @Override // com.daaw.InterfaceC5681jT2
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        AlgorithmParameterSpec ivParameterSpec;
        int length = bArr.length;
        if (length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (c) {
            ivParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
        } else {
            if (!V23.a()) {
                throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
            }
            ivParameterSpec = new IvParameterSpec(bArr, 0, 12);
        }
        ThreadLocal threadLocal = b;
        ((Cipher) threadLocal.get()).init(2, this.a, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) threadLocal.get()).updateAAD(bArr2);
        }
        return ((Cipher) threadLocal.get()).doFinal(bArr, 12, length - 12);
    }
}
