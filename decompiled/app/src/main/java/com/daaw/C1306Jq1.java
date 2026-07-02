package com.daaw;

/* JADX INFO: renamed from: com.daaw.Jq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1306Jq1 {
    public final int a;
    public int b;
    public int c;
    public long d;
    public final boolean e;
    public final C5900kE2 f;
    public final C5900kE2 g;
    public int h;
    public int i;

    public C1306Jq1(C5900kE2 c5900kE2, C5900kE2 c5900kE22, boolean z) throws QT1 {
        this.g = c5900kE2;
        this.f = c5900kE22;
        this.e = z;
        c5900kE22.g(12);
        this.a = c5900kE22.x();
        c5900kE2.g(12);
        this.i = c5900kE2.x();
        AbstractC1502Ln1.b(c5900kE2.o() == 1, "first_chunk must be 1");
        this.b = -1;
    }

    public final boolean a() {
        int i = this.b + 1;
        this.b = i;
        if (i == this.a) {
            return false;
        }
        this.d = this.e ? this.f.D() : this.f.C();
        if (this.b == this.h) {
            this.c = this.g.x();
            this.g.h(4);
            int i2 = this.i - 1;
            this.i = i2;
            this.h = i2 > 0 ? (-1) + this.g.x() : -1;
        }
        return true;
    }
}
