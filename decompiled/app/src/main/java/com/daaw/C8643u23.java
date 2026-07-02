package com.daaw;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.u23, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8643u23 implements InterfaceC5681jT2 {
    public final Q23 a;
    public final LT2 b;
    public final int c;

    public C8643u23(Q23 q23, LT2 lt2, int i) {
        this.a = q23;
        this.b = lt2;
        this.c = i;
    }

    @Override // com.daaw.InterfaceC5681jT2
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.c;
        if (length < i) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, length - i);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, length - this.c, length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.b.a(bArrCopyOfRange2, AbstractC8085s23.b(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8)));
        return this.a.a(bArrCopyOfRange);
    }
}
