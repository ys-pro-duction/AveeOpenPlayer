package com.daaw;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.t23, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8364t23 implements InterfaceC5681jT2 {
    public final IW2 a;

    public C8364t23(byte[] bArr) {
        this.a = new IW2(bArr);
    }

    @Override // com.daaw.InterfaceC5681jT2
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return this.a.b(ByteBuffer.wrap(bArr, 12, length - 12), Arrays.copyOf(bArr, 12), bArr2);
    }
}
