package com.daaw;

/* JADX INFO: renamed from: com.daaw.os3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7204os3 extends AbstractC7762qs3 implements Comparable {
    public final int F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final boolean N;

    public C7204os3(int i, A62 a62, int i2, Vr3 vr3, int i3, String str) {
        int iK;
        super(i, a62, i2);
        int i4 = 0;
        this.G = C8877us3.s(i3, false);
        int i5 = this.E.d;
        int i6 = vr3.v;
        this.H = 1 == (i5 & 1);
        this.I = (i5 & 2) != 0;
        OP2 op2K = vr3.t.isEmpty() ? OP2.K("") : vr3.t;
        int i7 = 0;
        while (true) {
            if (i7 >= op2K.size()) {
                i7 = Integer.MAX_VALUE;
                iK = 0;
                break;
            } else {
                iK = C8877us3.k(this.E, (String) op2K.get(i7), false);
                if (iK > 0) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        this.J = i7;
        this.K = iK;
        int i8 = this.E.e;
        int iBitCount = Integer.bitCount(0);
        this.L = iBitCount;
        int i9 = this.E.e;
        this.N = false;
        int iK2 = C8877us3.k(this.E, str, C8877us3.o(str) == null);
        this.M = iK2;
        boolean z = iK > 0 || (vr3.t.isEmpty() && iBitCount > 0) || this.H || (this.I && iK2 > 0);
        if (C8877us3.s(i3, vr3.r0) && z) {
            i4 = 1;
        }
        this.F = i4;
    }

    @Override // com.daaw.AbstractC7762qs3
    public final int a() {
        return this.F;
    }

    @Override // com.daaw.AbstractC7762qs3
    public final /* bridge */ /* synthetic */ boolean c(AbstractC7762qs3 abstractC7762qs3) {
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C7204os3 c7204os3) {
        DP2 dp2B = DP2.i().d(this.G, c7204os3.G).c(Integer.valueOf(this.J), Integer.valueOf(c7204os3.J), DQ2.c().a()).b(this.K, c7204os3.K).b(this.L, c7204os3.L).d(this.H, c7204os3.H).c(Boolean.valueOf(this.I), Boolean.valueOf(c7204os3.I), this.K == 0 ? DQ2.c() : DQ2.c().a()).b(this.M, c7204os3.M);
        if (this.L == 0) {
            dp2B = dp2B.e(false, false);
        }
        return dp2B.a();
    }
}
