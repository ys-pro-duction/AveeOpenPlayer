package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class LN1 extends WO1 {
    public final byte[] b;
    public int c;
    public int d;
    public int e;

    public /* synthetic */ LN1(byte[] bArr, int i, int i2, boolean z, AbstractC5097hN1 abstractC5097hN1) {
        super(null);
        this.e = Integer.MAX_VALUE;
        this.b = bArr;
        this.c = 0;
    }

    public final int c(int i) {
        int i2 = this.e;
        this.e = 0;
        int i3 = this.c + this.d;
        this.c = i3;
        if (i3 <= 0) {
            this.d = 0;
            return i2;
        }
        this.d = i3;
        this.c = 0;
        return i2;
    }
}
