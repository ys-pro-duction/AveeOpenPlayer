package com.daaw;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class Pr3 extends AbstractC7762qs3 implements Comparable {
    public final int F;
    public final boolean G;
    public final String H;
    public final Vr3 I;
    public final boolean J;
    public final int K;
    public final int L;
    public final int M;
    public final boolean N;
    public final int O;
    public final int P;
    public final boolean Q;
    public final int R;
    public final int S;
    public final int T;
    public final int U;
    public final boolean V;
    public final boolean W;

    public Pr3(int i, A62 a62, int i2, Vr3 vr3, int i3, boolean z, InterfaceC5661jO2 interfaceC5661jO2) {
        int i4;
        int iK;
        int iK2;
        boolean z2;
        super(i, a62, i2);
        this.I = vr3;
        this.H = C8877us3.o(this.E.c);
        int i5 = 0;
        this.J = C8877us3.s(i3, false);
        int i6 = 0;
        while (true) {
            i4 = Integer.MAX_VALUE;
            if (i6 >= vr3.n.size()) {
                i6 = Integer.MAX_VALUE;
                iK = 0;
                break;
            } else {
                iK = C8877us3.k(this.E, (String) vr3.n.get(i6), false);
                if (iK > 0) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        this.L = i6;
        this.K = iK;
        int i7 = this.E.e;
        this.M = Integer.bitCount(0);
        C2485Ut1 c2485Ut1 = this.E;
        int i8 = c2485Ut1.e;
        this.N = true;
        this.Q = 1 == (c2485Ut1.d & 1);
        this.R = c2485Ut1.y;
        this.S = c2485Ut1.z;
        this.T = c2485Ut1.h;
        this.G = interfaceC5661jO2.zza(c2485Ut1);
        Configuration configuration = Resources.getSystem().getConfiguration();
        String[] strArrSplit = AbstractC9004vJ2.a >= 24 ? configuration.getLocales().toLanguageTags().split(",", -1) : new String[]{AbstractC9004vJ2.L(configuration.locale)};
        for (int i9 = 0; i9 < strArrSplit.length; i9++) {
            strArrSplit[i9] = AbstractC9004vJ2.b(strArrSplit[i9]);
        }
        int i10 = 0;
        while (true) {
            if (i10 >= strArrSplit.length) {
                i10 = Integer.MAX_VALUE;
                iK2 = 0;
                break;
            } else {
                iK2 = C8877us3.k(this.E, strArrSplit[i10], false);
                if (iK2 > 0) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.O = i10;
        this.P = iK2;
        int i11 = 0;
        while (true) {
            if (i11 >= vr3.r.size()) {
                break;
            }
            String str = this.E.l;
            if (str != null && str.equals(vr3.r.get(i11))) {
                i4 = i11;
                break;
            }
            i11++;
        }
        this.U = i4;
        this.V = (i3 & 384) == 128;
        this.W = (i3 & 64) == 64;
        Vr3 vr32 = this.I;
        if (C8877us3.s(i3, vr32.r0) && ((z2 = this.G) || vr32.l0)) {
            i5 = (!C8877us3.s(i3, false) || !z2 || this.E.h == -1 || (!vr32.t0 && z)) ? 1 : 2;
        }
        this.F = i5;
    }

    @Override // com.daaw.AbstractC7762qs3
    public final int a() {
        return this.F;
    }

    @Override // com.daaw.AbstractC7762qs3
    public final /* bridge */ /* synthetic */ boolean c(AbstractC7762qs3 abstractC7762qs3) {
        String str;
        Pr3 pr3 = (Pr3) abstractC7762qs3;
        boolean z = this.I.o0;
        C2485Ut1 c2485Ut1 = this.E;
        int i = c2485Ut1.y;
        if (i == -1) {
            return false;
        }
        C2485Ut1 c2485Ut12 = pr3.E;
        if (i != c2485Ut12.y || (str = c2485Ut1.l) == null || !TextUtils.equals(str, c2485Ut12.l)) {
            return false;
        }
        boolean z2 = this.I.n0;
        int i2 = this.E.z;
        return i2 != -1 && i2 == pr3.E.z && this.V == pr3.V && this.W == pr3.W;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final int compareTo(Pr3 pr3) {
        DQ2 dq2A = (this.G && this.J) ? C8877us3.k : C8877us3.k.a();
        DP2 dp2C = DP2.i().d(this.J, pr3.J).c(Integer.valueOf(this.L), Integer.valueOf(pr3.L), DQ2.c().a()).b(this.K, pr3.K).b(this.M, pr3.M).d(this.Q, pr3.Q).d(true, true).c(Integer.valueOf(this.O), Integer.valueOf(pr3.O), DQ2.c().a()).b(this.P, pr3.P).d(this.G, pr3.G).c(Integer.valueOf(this.U), Integer.valueOf(pr3.U), DQ2.c().a());
        Integer numValueOf = Integer.valueOf(this.T);
        Integer numValueOf2 = Integer.valueOf(pr3.T);
        boolean z = this.I.x;
        DP2 dp2C2 = dp2C.c(numValueOf, numValueOf2, C8877us3.l).d(this.V, pr3.V).d(this.W, pr3.W).c(Integer.valueOf(this.R), Integer.valueOf(pr3.R), dq2A).c(Integer.valueOf(this.S), Integer.valueOf(pr3.S), dq2A);
        Integer numValueOf3 = Integer.valueOf(this.T);
        Integer numValueOf4 = Integer.valueOf(pr3.T);
        if (!AbstractC9004vJ2.e(this.H, pr3.H)) {
            dq2A = C8877us3.l;
        }
        return dp2C2.c(numValueOf3, numValueOf4, dq2A).a();
    }
}
