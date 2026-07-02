package com.daaw;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class CZ2 implements LT2 {
    public static final byte[] d = {0};
    public final LT2 a;
    public final EnumC3603c23 b;
    public final byte[] c;

    public CZ2(LT2 lt2, EnumC3603c23 enumC3603c23, byte[] bArr) {
        this.a = lt2;
        this.b = enumC3603c23;
        this.c = bArr;
    }

    public static LT2 b(C6264lX2 c6264lX2) throws GeneralSecurityException {
        byte[] bArrArray;
        XX2 xx2A = c6264lX2.a(AbstractC8479tT2.a());
        C6128l13 c6128l13M = C6965o13.M();
        c6128l13M.o(xx2A.f());
        c6128l13M.p(xx2A.d());
        c6128l13M.n(xx2A.b());
        LT2 lt2 = (LT2) AbstractC3165aU2.c((C6965o13) c6128l13M.j(), LT2.class);
        EnumC3603c23 enumC3603c23C = xx2A.c();
        EnumC3603c23 enumC3603c23 = EnumC3603c23.UNKNOWN_PREFIX;
        int iOrdinal = enumC3603c23C.ordinal();
        if (iOrdinal == 1) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 1).putInt(c6264lX2.b().intValue()).array();
        } else if (iOrdinal == 2) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(c6264lX2.b().intValue()).array();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(c6264lX2.b().intValue()).array();
        } else {
            bArrArray = new byte[0];
        }
        return new CZ2(lt2, enumC3603c23C, bArrArray);
    }

    @Override // com.daaw.LT2
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 10) {
            throw new GeneralSecurityException("tag too short");
        }
        if (this.b.equals(EnumC3603c23.LEGACY)) {
            bArr2 = AbstractC8085s23.b(bArr2, d);
        }
        byte[] bArr3 = new byte[0];
        if (!this.b.equals(EnumC3603c23.RAW)) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            bArr = Arrays.copyOfRange(bArr, 5, length);
            bArr3 = bArrCopyOf;
        }
        if (!Arrays.equals(this.c, bArr3)) {
            throw new GeneralSecurityException("wrong prefix");
        }
        this.a.a(bArr, bArr2);
    }
}
