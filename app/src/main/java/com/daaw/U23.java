package com.daaw;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public final class U23 implements LT2 {
    public static final byte[] e = {0};
    public final RZ2 a;
    public final int b;
    public final byte[] c;
    public final byte[] d;

    public U23(C7663qY2 c7663qY2) {
        this.a = new R23(c7663qY2.d().c(AbstractC8479tT2.a()));
        this.b = c7663qY2.c().a();
        this.c = c7663qY2.b().c();
        if (c7663qY2.c().d().equals(CY2.d)) {
            this.d = Arrays.copyOf(e, 1);
        } else {
            this.d = new byte[0];
        }
    }

    public static LT2 b(C7663qY2 c7663qY2) {
        return new U23(c7663qY2);
    }

    public static LT2 c(RY2 ry2) {
        return new U23(ry2);
    }

    @Override // com.daaw.LT2
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.d;
        if (!MessageDigest.isEqual(bArr3.length > 0 ? AbstractC8085s23.b(this.c, this.a.a(AbstractC8085s23.b(bArr2, bArr3), this.b)) : AbstractC8085s23.b(this.c, this.a.a(bArr2, this.b)), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    public U23(RY2 ry2) {
        String strValueOf = String.valueOf(ry2.d().e());
        this.a = new T23("HMAC".concat(strValueOf), new SecretKeySpec(ry2.e().c(AbstractC8479tT2.a()), "HMAC"));
        this.b = ry2.d().a();
        this.c = ry2.b().c();
        if (ry2.d().f().equals(C4299eZ2.d)) {
            this.d = Arrays.copyOf(e, 1);
        } else {
            this.d = new byte[0];
        }
    }

    public U23(RZ2 rz2, int i) throws InvalidAlgorithmParameterException {
        this.a = rz2;
        this.b = i;
        this.c = new byte[0];
        this.d = new byte[0];
        if (i >= 10) {
            rz2.a(new byte[0], i);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }
}
