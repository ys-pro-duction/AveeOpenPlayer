package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class GW2 extends HW2 {
    public GW2(byte[] bArr, int i) {
        super(bArr, i);
    }

    @Override // com.daaw.HW2
    public final int a() {
        return 12;
    }

    @Override // com.daaw.HW2
    public final int[] b(int[] iArr, int i) {
        int length = iArr.length;
        if (length != 3) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        DW2.b(iArr2, this.a);
        iArr2[12] = i;
        System.arraycopy(iArr, 0, iArr2, 13, 3);
        return iArr2;
    }
}
