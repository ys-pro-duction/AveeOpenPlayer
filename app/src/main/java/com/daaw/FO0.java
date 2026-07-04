package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public final class FO0 {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public FO0 f;
    public FO0 g;

    public FO0() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public final void a() {
        FO0 fo0 = this.g;
        if (fo0 == this) {
            throw new IllegalStateException();
        }
        if (fo0.e) {
            int i = this.c - this.b;
            if (i > (8192 - fo0.c) + (fo0.d ? 0 : fo0.b)) {
                return;
            }
            f(fo0, i);
            b();
            YO0.a(this);
        }
    }

    public final FO0 b() {
        FO0 fo0 = this.f;
        FO0 fo02 = fo0 != this ? fo0 : null;
        FO0 fo03 = this.g;
        fo03.f = fo0;
        this.f.g = fo03;
        this.f = null;
        this.g = null;
        return fo02;
    }

    public final FO0 c(FO0 fo0) {
        fo0.g = this;
        fo0.f = this.f;
        this.f.g = fo0;
        this.f = fo0;
        return fo0;
    }

    public final FO0 d() {
        this.d = true;
        return new FO0(this.a, this.b, this.c, true, false);
    }

    public final FO0 e(int i) {
        FO0 fo0B;
        if (i <= 0 || i > this.c - this.b) {
            throw new IllegalArgumentException();
        }
        if (i >= 1024) {
            fo0B = d();
        } else {
            fo0B = YO0.b();
            System.arraycopy(this.a, this.b, fo0B.a, 0, i);
        }
        fo0B.c = fo0B.b + i;
        this.b += i;
        this.g.c(fo0B);
        return fo0B;
    }

    public final void f(FO0 fo0, int i) {
        if (!fo0.e) {
            throw new IllegalArgumentException();
        }
        int i2 = fo0.c;
        if (i2 + i > 8192) {
            if (fo0.d) {
                throw new IllegalArgumentException();
            }
            int i3 = fo0.b;
            if ((i2 + i) - i3 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = fo0.a;
            System.arraycopy(bArr, i3, bArr, 0, i2 - i3);
            fo0.c -= fo0.b;
            fo0.b = 0;
        }
        System.arraycopy(this.a, this.b, fo0.a, fo0.c, i);
        fo0.c += i;
        this.b += i;
    }

    public FO0(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }
}
