package com.daaw;

import com.daaw.AbstractC6027ki1;
import com.daaw.C10216zg0;
import com.daaw.InterfaceC9674xj1;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Bm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0447Bm implements InterfaceC9674xj1 {
    public final AbstractC10245zm a;

    /* JADX INFO: renamed from: com.daaw.Bm$a */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AbstractC6027ki1.b.values().length];
            a = iArr;
            try {
                iArr[AbstractC6027ki1.b.K.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[AbstractC6027ki1.b.J.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[AbstractC6027ki1.b.H.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[AbstractC6027ki1.b.R.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[AbstractC6027ki1.b.T.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[AbstractC6027ki1.b.P.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[AbstractC6027ki1.b.I.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[AbstractC6027ki1.b.F.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[AbstractC6027ki1.b.S.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[AbstractC6027ki1.b.U.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[AbstractC6027ki1.b.G.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[AbstractC6027ki1.b.L.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public C0447Bm(AbstractC10245zm abstractC10245zm) {
        AbstractC10245zm abstractC10245zm2 = (AbstractC10245zm) AbstractC3317b10.b(abstractC10245zm, "output");
        this.a = abstractC10245zm2;
        abstractC10245zm2.a = this;
    }

    public static C0447Bm P(AbstractC10245zm abstractC10245zm) {
        C0447Bm c0447Bm = abstractC10245zm.a;
        return c0447Bm != null ? c0447Bm : new C0447Bm(abstractC10245zm);
    }

    @Override // com.daaw.InterfaceC9674xj1
    public void A(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.p0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.R0(i, 2);
        int iO = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iO += AbstractC10245zm.o(((Integer) list.get(i3)).intValue());
        }
        this.a.T0(iO);
        while (i2 < list.size()) {
            this.a.q0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.daaw.InterfaceC9674xj1
    public void B(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.f0(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        this.a.R0(i, 2);
        int iF = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iF += AbstractC10245zm.f(((Boolean) list.get(i3)).booleanValue());
        }
        this.a.T0(iF);
        while (i2 < list.size()) {
            this.a.g0(((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    @Override // com.daaw.InterfaceC9674xj1
    public void C(int i, List list, DN0 dn0) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            j(i, list.get(i2), dn0);
        }
    }

    @Override // com.daaw.InterfaceC9674xj1
    public void D(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.S0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.R0(i, 2);
        int iS = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iS += AbstractC10245zm.S(((Integer) list.get(i3)).intValue());
        }
        this.a.T0(iS);
        while (i2 < list.size()) {
            this.a.T0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.daaw.InterfaceC9674xj1
    public void E(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.N0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.R0(i, 2);
        int iN = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iN += AbstractC10245zm.N(((Long) list.get(i3)).longValue());
        }
        this.a.T0(iN);
        while (i2 < list.size()) {
            this.a.O0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.daaw.InterfaceC9674xj1
    public void F(int i, long j) {
        this.a.N0(i, j);
    }

    @Override // com.daaw.InterfaceC9674xj1
    public void G(int i, float f) {
        this.a.t0(i, f);
    }

    @Override // com.daaw.InterfaceC9674xj1
    public void H(int i) {
        this.a.R0(i, 4);
    }

    @Override // com.daaw.InterfaceC9674xj1
    public void I(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.L0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.R0(i, 2);
        int iL = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iL += AbstractC10245zm.L(((Integer) list.get(i3)).intValue());
        }
        this.a.T0(iL);
        while (i2 < list.size()) {
            this.a.M0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.daaw.InterfaceC9674xj1
    public void J(int i, int i2) {
        this.a.n0(i, i2);
    }

    @Override // com.daaw.InterfaceC9674xj1
    public void K(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.B0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.R0(i, 2);
        int iZ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZ += AbstractC10245zm.z(((Long) list.get(i3)).longValue());
        }
        this.a.T0(iZ);
        while (i2 < list.size()) {
            this.a.C0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.daaw.InterfaceC9674xj1
    public void L(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.n0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.R0(i, 2);
        int iM = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM += AbstractC10245zm.m(((Integer) list.get(i3)).intValue());
        }
        this.a.T0(iM);
        while (i2 < list.size()) {
            this.a.o0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.daaw.InterfaceC9674xj1
    public void M(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.l0(i, ((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        this.a.R0(i, 2);
        int iK = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iK += AbstractC10245zm.k(((Double) list.get(i3)).doubleValue());
        }
        this.a.T0(iK);
        while (i2 < list.size()) {
            this.a.m0(((Double) list.get(i2)).doubleValue());
            i2++;
        }
    }

    @Override // com.daaw.InterfaceC9674xj1
    public void N(int i, int i2) {
        this.a.L0(i, i2);
    }

    @Override // com.daaw.InterfaceC9674xj1
    public void O(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.a.j0(i, (AbstractC4340ei) list.get(i2));
        }
    }

    public final void Q(int i, boolean z, Object obj, C10216zg0.a aVar) {
        this.a.R0(i, 2);
        this.a.T0(C10216zg0.b(aVar, Boolean.valueOf(z), obj));
        C10216zg0.e(this.a, aVar, Boolean.valueOf(z), obj);
    }

    public final void R(int i, C10216zg0.a aVar, Map map) {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr[i2] = ((Integer) it.next()).intValue();
            i2++;
        }
        Arrays.sort(iArr);
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = iArr[i3];
            Object obj = map.get(Integer.valueOf(i4));
            this.a.R0(i, 2);
            this.a.T0(C10216zg0.b(aVar, Integer.valueOf(i4), obj));
            C10216zg0.e(this.a, aVar, Integer.valueOf(i4), obj);
        }
    }

    public final void S(int i, C10216zg0.a aVar, Map map) {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            jArr[i2] = ((Long) it.next()).longValue();
            i2++;
        }
        Arrays.sort(jArr);
        for (int i3 = 0; i3 < size; i3++) {
            long j = jArr[i3];
            Object obj = map.get(Long.valueOf(j));
            this.a.R0(i, 2);
            this.a.T0(C10216zg0.b(aVar, Long.valueOf(j), obj));
            C10216zg0.e(this.a, aVar, Long.valueOf(j), obj);
        }
    }

    public final void T(int i, C10216zg0.a aVar, Map map) {
        switch (a.a[aVar.a.ordinal()]) {
            case 1:
                Object obj = map.get(Boolean.FALSE);
                if (obj != null) {
                    Q(i, false, obj, aVar);
                }
                Object obj2 = map.get(Boolean.TRUE);
                if (obj2 != null) {
                    Q(i, true, obj2, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                R(i, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                S(i, aVar, map);
                return;
            case 12:
                U(i, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.a);
        }
    }

    public final void U(int i, C10216zg0.a aVar, Map map) {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            strArr[i2] = (String) it.next();
            i2++;
        }
        Arrays.sort(strArr);
        for (int i3 = 0; i3 < size; i3++) {
            String str = strArr[i3];
            Object obj = map.get(str);
            this.a.R0(i, 2);
            this.a.T0(C10216zg0.b(aVar, str, obj));
            C10216zg0.e(this.a, aVar, str, obj);
        }
    }

    public final void V(int i, Object obj) {
        if (obj instanceof String) {
            this.a.P0(i, (String) obj);
        } else {
            this.a.j0(i, (AbstractC4340ei) obj);
        }
    }

    @Override // com.daaw.InterfaceC9674xj1
    public void a(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.t0(i, ((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        this.a.R0(i, 2);
        int iS = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iS += AbstractC10245zm.s(((Float) list.get(i3)).floatValue());
        }
        this.a.T0(iS);
        while (i2 < list.size()) {
            this.a.u0(((Float) list.get(i2)).floatValue());
            i2++;
        }
    }

    @Override // com.daaw.InterfaceC9674xj1
    public void b(int i, Object obj, DN0 dn0) {
        this.a.D0(i, (InterfaceC1900Pj0) obj, dn0);
    }

    @Override // com.daaw.InterfaceC9674xj1
    public void c(int i, int i2) {
        this.a.S0(i, i2);
    }

    @Override // com.daaw.InterfaceC9674xj1
    public final void d(int i, Object obj) {
        if (obj instanceof AbstractC4340ei) {
            this.a.G0(i, (AbstractC4340ei) obj);
        } else {
            this.a.F0(i, (InterfaceC1900Pj0) obj);
        }
    }

    @Override // com.daaw.InterfaceC9674xj1
    public void e(int i, int i2) {
        this.a.p0(i, i2);
    }

    @Override // com.daaw.InterfaceC9674xj1
    public void f(int i, AbstractC4340ei abstractC4340ei) {
        this.a.j0(i, abstractC4340ei);
    }

    @Override // com.daaw.InterfaceC9674xj1
    public void g(int i, double d) {
        this.a.l0(i, d);
    }

    @Override // com.daaw.InterfaceC9674xj1
    public void h(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.J0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.R0(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += AbstractC10245zm.J(((Long) list.get(i3)).longValue());
        }
        this.a.T0(iJ);
        while (i2 < list.size()) {
            this.a.K0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.daaw.InterfaceC9674xj1
    public void i(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.U0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.R0(i, 2);
        int iU = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iU += AbstractC10245zm.U(((Long) list.get(i3)).longValue());
        }
        this.a.T0(iU);
        while (i2 < list.size()) {
            this.a.V0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.daaw.InterfaceC9674xj1
    public void j(int i, Object obj, DN0 dn0) {
        this.a.w0(i, (InterfaceC1900Pj0) obj, dn0);
    }

    @Override // com.daaw.InterfaceC9674xj1
    public void k(int i, long j) {
        this.a.r0(i, j);
    }

    @Override // com.daaw.InterfaceC9674xj1
    public InterfaceC9674xj1.a l() {
        return InterfaceC9674xj1.a.ASCENDING;
    }

    @Override // com.daaw.InterfaceC9674xj1
    public void m(int i, List list) {
        int i2 = 0;
        if (!(list instanceof InterfaceC6837nb0)) {
            while (i2 < list.size()) {
                this.a.P0(i, (String) list.get(i2));
                i2++;
            }
        } else {
            InterfaceC6837nb0 interfaceC6837nb0 = (InterfaceC6837nb0) list;
            while (i2 < list.size()) {
                V(i, interfaceC6837nb0.A(i2));
                i2++;
            }
        }
    }

    @Override // com.daaw.InterfaceC9674xj1
    public void n(int i, List list, DN0 dn0) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            b(i, list.get(i2), dn0);
        }
    }

    @Override // com.daaw.InterfaceC9674xj1
    public void o(int i, String str) {
        this.a.P0(i, str);
    }

    @Override // com.daaw.InterfaceC9674xj1
    public void p(int i, long j) {
        this.a.U0(i, j);
    }

    @Override // com.daaw.InterfaceC9674xj1
    public void q(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.z0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.R0(i, 2);
        int iX = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iX += AbstractC10245zm.x(((Integer) list.get(i3)).intValue());
        }
        this.a.T0(iX);
        while (i2 < list.size()) {
            this.a.A0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.daaw.InterfaceC9674xj1
    public void r(int i, long j) {
        this.a.B0(i, j);
    }

    @Override // com.daaw.InterfaceC9674xj1
    public void s(int i, boolean z) {
        this.a.f0(i, z);
    }

    @Override // com.daaw.InterfaceC9674xj1
    public void t(int i, int i2) {
        this.a.H0(i, i2);
    }

    @Override // com.daaw.InterfaceC9674xj1
    public void u(int i) {
        this.a.R0(i, 3);
    }

    @Override // com.daaw.InterfaceC9674xj1
    public void v(int i, int i2) {
        this.a.z0(i, i2);
    }

    @Override // com.daaw.InterfaceC9674xj1
    public void w(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.r0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.R0(i, 2);
        int iQ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iQ += AbstractC10245zm.q(((Long) list.get(i3)).longValue());
        }
        this.a.T0(iQ);
        while (i2 < list.size()) {
            this.a.s0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.daaw.InterfaceC9674xj1
    public void x(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.H0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.R0(i, 2);
        int iH = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iH += AbstractC10245zm.H(((Integer) list.get(i3)).intValue());
        }
        this.a.T0(iH);
        while (i2 < list.size()) {
            this.a.I0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.daaw.InterfaceC9674xj1
    public void y(int i, C10216zg0.a aVar, Map map) {
        if (this.a.Z()) {
            T(i, aVar, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.a.R0(i, 2);
            this.a.T0(C10216zg0.b(aVar, entry.getKey(), entry.getValue()));
            C10216zg0.e(this.a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.daaw.InterfaceC9674xj1
    public void z(int i, long j) {
        this.a.J0(i, j);
    }
}
