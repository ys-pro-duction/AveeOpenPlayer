package com.daaw;

/* JADX INFO: renamed from: com.daaw.ts3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8598ts3 extends AbstractC7762qs3 {
    public final boolean F;
    public final Vr3 G;
    public final boolean H;
    public final boolean I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final boolean N;
    public final int O;
    public final boolean P;
    public final boolean Q;
    public final int R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C8598ts3(int r5, com.daaw.A62 r6, int r7, com.daaw.Vr3 r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C8598ts3.<init>(int, com.daaw.A62, int, com.daaw.Vr3, int, int, boolean):void");
    }

    public static /* synthetic */ int g(C8598ts3 c8598ts3, C8598ts3 c8598ts32) {
        DQ2 dq2A = (c8598ts3.F && c8598ts3.I) ? C8877us3.k : C8877us3.k.a();
        DP2 dp2I = DP2.i();
        Integer numValueOf = Integer.valueOf(c8598ts3.J);
        Integer numValueOf2 = Integer.valueOf(c8598ts32.J);
        boolean z = c8598ts3.G.x;
        return dp2I.c(numValueOf, numValueOf2, C8877us3.l).c(Integer.valueOf(c8598ts3.K), Integer.valueOf(c8598ts32.K), dq2A).c(Integer.valueOf(c8598ts3.J), Integer.valueOf(c8598ts32.J), dq2A).a();
    }

    public static /* synthetic */ int h(C8598ts3 c8598ts3, C8598ts3 c8598ts32) {
        DP2 dp2C = DP2.i().d(c8598ts3.I, c8598ts32.I).b(c8598ts3.M, c8598ts32.M).d(true, true).d(c8598ts3.F, c8598ts32.F).d(c8598ts3.H, c8598ts32.H).c(Integer.valueOf(c8598ts3.L), Integer.valueOf(c8598ts32.L), DQ2.c().a());
        boolean z = c8598ts3.P;
        DP2 dp2D = dp2C.d(z, c8598ts32.P);
        boolean z2 = c8598ts3.Q;
        DP2 dp2D2 = dp2D.d(z2, c8598ts32.Q);
        if (z && z2) {
            dp2D2 = dp2D2.b(c8598ts3.R, c8598ts32.R);
        }
        return dp2D2.a();
    }

    @Override // com.daaw.AbstractC7762qs3
    public final int a() {
        return this.O;
    }

    @Override // com.daaw.AbstractC7762qs3
    public final /* bridge */ /* synthetic */ boolean c(AbstractC7762qs3 abstractC7762qs3) {
        C8598ts3 c8598ts3 = (C8598ts3) abstractC7762qs3;
        if (!AbstractC9004vJ2.e(this.E.l, c8598ts3.E.l)) {
            return false;
        }
        boolean z = this.G.k0;
        return this.P == c8598ts3.P && this.Q == c8598ts3.Q;
    }
}
