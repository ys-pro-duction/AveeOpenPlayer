package com.daaw;

import com.daaw.AbstractC6027ki1;
import com.daaw.P10;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.ym, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9966ym implements KE0 {
    public final AbstractC9408wm a;
    public int b;
    public int c;
    public int d = 0;

    /* JADX INFO: renamed from: com.daaw.ym$a */
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
                a[AbstractC6027ki1.b.O.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[AbstractC6027ki1.b.D.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[AbstractC6027ki1.b.Q.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[AbstractC6027ki1.b.J.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[AbstractC6027ki1.b.I.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[AbstractC6027ki1.b.E.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[AbstractC6027ki1.b.H.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[AbstractC6027ki1.b.F.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[AbstractC6027ki1.b.N.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[AbstractC6027ki1.b.R.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[AbstractC6027ki1.b.S.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[AbstractC6027ki1.b.T.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[AbstractC6027ki1.b.U.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[AbstractC6027ki1.b.L.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[AbstractC6027ki1.b.P.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[AbstractC6027ki1.b.G.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public C9966ym(AbstractC9408wm abstractC9408wm) {
        AbstractC9408wm abstractC9408wm2 = (AbstractC9408wm) AbstractC3317b10.b(abstractC9408wm, "input");
        this.a = abstractC9408wm2;
        abstractC9408wm2.d = this;
    }

    public static C9966ym Q(AbstractC9408wm abstractC9408wm) {
        C9966ym c9966ym = abstractC9408wm.d;
        return c9966ym != null ? c9966ym : new C9966ym(abstractC9408wm);
    }

    @Override // com.daaw.KE0
    public void A(List list) throws P10.a {
        X(list, false);
    }

    @Override // com.daaw.KE0
    public void B(List list) throws P10.a {
        X(list, true);
    }

    @Override // com.daaw.KE0
    public AbstractC4340ei C() throws P10.a {
        Z(2);
        return this.a.p();
    }

    @Override // com.daaw.KE0
    public void D(List list) throws P10 {
        int iD;
        int iD2;
        if (!(list instanceof AbstractC3691cN)) {
            int iB = AbstractC6027ki1.b(this.b);
            if (iB == 2) {
                int iE = this.a.E();
                a0(iE);
                int iD3 = this.a.d() + iE;
                do {
                    list.add(Float.valueOf(this.a.u()));
                } while (this.a.d() < iD3);
                return;
            }
            if (iB != 5) {
                throw P10.e();
            }
            do {
                list.add(Float.valueOf(this.a.u()));
                if (this.a.e()) {
                    return;
                } else {
                    iD = this.a.D();
                }
            } while (iD == this.b);
            this.d = iD;
            return;
        }
        AbstractC3691cN abstractC3691cN = (AbstractC3691cN) list;
        int iB2 = AbstractC6027ki1.b(this.b);
        if (iB2 == 2) {
            int iE2 = this.a.E();
            a0(iE2);
            int iD4 = this.a.d() + iE2;
            do {
                abstractC3691cN.m(this.a.u());
            } while (this.a.d() < iD4);
            return;
        }
        if (iB2 != 5) {
            throw P10.e();
        }
        do {
            abstractC3691cN.m(this.a.u());
            if (this.a.e()) {
                return;
            } else {
                iD2 = this.a.D();
            }
        } while (iD2 == this.b);
        this.d = iD2;
    }

    @Override // com.daaw.KE0
    public int E() throws P10.a {
        Z(0);
        return this.a.v();
    }

    @Override // com.daaw.KE0
    public void F(List list, DN0 dn0, C6484mJ c6484mJ) throws P10.a {
        int iD;
        if (AbstractC6027ki1.b(this.b) != 2) {
            throw P10.e();
        }
        int i = this.b;
        do {
            list.add(V(dn0, c6484mJ));
            if (this.a.e() || this.d != 0) {
                return;
            } else {
                iD = this.a.D();
            }
        } while (iD == i);
        this.d = iD;
    }

    @Override // com.daaw.KE0
    public boolean G() {
        int i;
        if (this.a.e() || (i = this.b) == this.c) {
            return false;
        }
        return this.a.H(i);
    }

    @Override // com.daaw.KE0
    public float H() throws P10.a {
        Z(5);
        return this.a.u();
    }

    @Override // com.daaw.KE0
    public int I() throws P10.a {
        Z(5);
        return this.a.x();
    }

    @Override // com.daaw.KE0
    public void J(List list) throws P10.a {
        int iD;
        if (AbstractC6027ki1.b(this.b) != 2) {
            throw P10.e();
        }
        do {
            list.add(C());
            if (this.a.e()) {
                return;
            } else {
                iD = this.a.D();
            }
        } while (iD == this.b);
        this.d = iD;
    }

    @Override // com.daaw.KE0
    public void K(List list) throws P10 {
        int iD;
        int iD2;
        if (!(list instanceof AbstractC5055hD)) {
            int iB = AbstractC6027ki1.b(this.b);
            if (iB == 1) {
                do {
                    list.add(Double.valueOf(this.a.q()));
                    if (this.a.e()) {
                        return;
                    } else {
                        iD = this.a.D();
                    }
                } while (iD == this.b);
                this.d = iD;
                return;
            }
            if (iB != 2) {
                throw P10.e();
            }
            int iE = this.a.E();
            b0(iE);
            int iD3 = this.a.d() + iE;
            do {
                list.add(Double.valueOf(this.a.q()));
            } while (this.a.d() < iD3);
            return;
        }
        AbstractC5055hD abstractC5055hD = (AbstractC5055hD) list;
        int iB2 = AbstractC6027ki1.b(this.b);
        if (iB2 == 1) {
            do {
                abstractC5055hD.m(this.a.q());
                if (this.a.e()) {
                    return;
                } else {
                    iD2 = this.a.D();
                }
            } while (iD2 == this.b);
            this.d = iD2;
            return;
        }
        if (iB2 != 2) {
            throw P10.e();
        }
        int iE2 = this.a.E();
        b0(iE2);
        int iD4 = this.a.d() + iE2;
        do {
            abstractC5055hD.m(this.a.q());
        } while (this.a.d() < iD4);
    }

    @Override // com.daaw.KE0
    public void L(List list, DN0 dn0, C6484mJ c6484mJ) throws P10.a {
        int iD;
        if (AbstractC6027ki1.b(this.b) != 3) {
            throw P10.e();
        }
        int i = this.b;
        do {
            list.add(U(dn0, c6484mJ));
            if (this.a.e() || this.d != 0) {
                return;
            } else {
                iD = this.a.D();
            }
        } while (iD == i);
        this.d = iD;
    }

    @Override // com.daaw.KE0
    public long M() throws P10.a {
        Z(0);
        return this.a.w();
    }

    @Override // com.daaw.KE0
    public String N() throws P10.a {
        Z(2);
        return this.a.C();
    }

    @Override // com.daaw.KE0
    public void O(List list) throws P10 {
        int iD;
        int iD2;
        if (!(list instanceof AbstractC4321ee0)) {
            int iB = AbstractC6027ki1.b(this.b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.a.t()));
                    if (this.a.e()) {
                        return;
                    } else {
                        iD = this.a.D();
                    }
                } while (iD == this.b);
                this.d = iD;
                return;
            }
            if (iB != 2) {
                throw P10.e();
            }
            int iE = this.a.E();
            b0(iE);
            int iD3 = this.a.d() + iE;
            do {
                list.add(Long.valueOf(this.a.t()));
            } while (this.a.d() < iD3);
            return;
        }
        AbstractC4321ee0 abstractC4321ee0 = (AbstractC4321ee0) list;
        int iB2 = AbstractC6027ki1.b(this.b);
        if (iB2 == 1) {
            do {
                abstractC4321ee0.m(this.a.t());
                if (this.a.e()) {
                    return;
                } else {
                    iD2 = this.a.D();
                }
            } while (iD2 == this.b);
            this.d = iD2;
            return;
        }
        if (iB2 != 2) {
            throw P10.e();
        }
        int iE2 = this.a.E();
        b0(iE2);
        int iD4 = this.a.d() + iE2;
        do {
            abstractC4321ee0.m(this.a.t());
        } while (this.a.d() < iD4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        r7.a.m(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        return;
     */
    @Override // com.daaw.KE0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void P(java.util.Map r8, com.daaw.C10216zg0.a r9, com.daaw.C6484mJ r10) throws com.daaw.P10.a {
        /*
            r7 = this;
            r0 = 2
            r7.Z(r0)
            com.daaw.wm r1 = r7.a
            int r1 = r1.E()
            com.daaw.wm r2 = r7.a
            int r1 = r2.n(r1)
            java.lang.Object r2 = r9.b
            java.lang.Object r3 = r9.d
        L14:
            int r4 = r7.z()     // Catch: java.lang.Throwable -> L3a
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5e
            com.daaw.wm r5 = r7.a     // Catch: java.lang.Throwable -> L3a
            boolean r5 = r5.e()     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L26
            goto L5e
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L49
            if (r4 == r0) goto L3c
            boolean r4 = r7.G()     // Catch: java.lang.Throwable -> L3a com.daaw.P10.a -> L51
            if (r4 == 0) goto L34
            goto L14
        L34:
            com.daaw.P10 r4 = new com.daaw.P10     // Catch: java.lang.Throwable -> L3a com.daaw.P10.a -> L51
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L3a com.daaw.P10.a -> L51
            throw r4     // Catch: java.lang.Throwable -> L3a com.daaw.P10.a -> L51
        L3a:
            r8 = move-exception
            goto L67
        L3c:
            com.daaw.ki1$b r4 = r9.c     // Catch: java.lang.Throwable -> L3a com.daaw.P10.a -> L51
            java.lang.Object r5 = r9.d     // Catch: java.lang.Throwable -> L3a com.daaw.P10.a -> L51
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L3a com.daaw.P10.a -> L51
            java.lang.Object r3 = r7.T(r4, r5, r10)     // Catch: java.lang.Throwable -> L3a com.daaw.P10.a -> L51
            goto L14
        L49:
            com.daaw.ki1$b r4 = r9.a     // Catch: java.lang.Throwable -> L3a com.daaw.P10.a -> L51
            r5 = 0
            java.lang.Object r2 = r7.T(r4, r5, r5)     // Catch: java.lang.Throwable -> L3a com.daaw.P10.a -> L51
            goto L14
        L51:
            boolean r4 = r7.G()     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L58
            goto L14
        L58:
            com.daaw.P10 r8 = new com.daaw.P10     // Catch: java.lang.Throwable -> L3a
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            throw r8     // Catch: java.lang.Throwable -> L3a
        L5e:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L3a
            com.daaw.wm r8 = r7.a
            r8.m(r1)
            return
        L67:
            com.daaw.wm r9 = r7.a
            r9.m(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C9966ym.P(java.util.Map, com.daaw.zg0$a, com.daaw.mJ):void");
    }

    public final void R(Object obj, DN0 dn0, C6484mJ c6484mJ) {
        int i = this.c;
        this.c = AbstractC6027ki1.c(AbstractC6027ki1.a(this.b), 4);
        try {
            dn0.e(obj, this, c6484mJ);
            if (this.b == this.c) {
            } else {
                throw P10.h();
            }
        } finally {
            this.c = i;
        }
    }

    public final void S(Object obj, DN0 dn0, C6484mJ c6484mJ) throws P10 {
        int iE = this.a.E();
        AbstractC9408wm abstractC9408wm = this.a;
        if (abstractC9408wm.a >= abstractC9408wm.b) {
            throw P10.i();
        }
        int iN = abstractC9408wm.n(iE);
        this.a.a++;
        dn0.e(obj, this, c6484mJ);
        this.a.a(0);
        r5.a--;
        this.a.m(iN);
    }

    public final Object T(AbstractC6027ki1.b bVar, Class cls, C6484mJ c6484mJ) {
        switch (a.a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(j());
            case 2:
                return C();
            case 3:
                return Double.valueOf(n());
            case 4:
                return Integer.valueOf(s());
            case 5:
                return Integer.valueOf(i());
            case 6:
                return Long.valueOf(d());
            case 7:
                return Float.valueOf(H());
            case 8:
                return Integer.valueOf(E());
            case 9:
                return Long.valueOf(M());
            case 10:
                return W(cls, c6484mJ);
            case 11:
                return Integer.valueOf(I());
            case 12:
                return Long.valueOf(k());
            case 13:
                return Integer.valueOf(v());
            case 14:
                return Long.valueOf(w());
            case 15:
                return N();
            case 16:
                return Integer.valueOf(m());
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return Long.valueOf(c());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    public final Object U(DN0 dn0, C6484mJ c6484mJ) {
        Object objH = dn0.h();
        R(objH, dn0, c6484mJ);
        dn0.c(objH);
        return objH;
    }

    public final Object V(DN0 dn0, C6484mJ c6484mJ) throws P10 {
        Object objH = dn0.h();
        S(objH, dn0, c6484mJ);
        dn0.c(objH);
        return objH;
    }

    public Object W(Class cls, C6484mJ c6484mJ) throws P10.a {
        Z(2);
        return V(C3923dB0.a().c(cls), c6484mJ);
    }

    public void X(List list, boolean z) throws P10.a {
        int iD;
        int iD2;
        if (AbstractC6027ki1.b(this.b) != 2) {
            throw P10.e();
        }
        if (!(list instanceof InterfaceC6837nb0) || z) {
            do {
                list.add(z ? N() : y());
                if (this.a.e()) {
                    return;
                } else {
                    iD = this.a.D();
                }
            } while (iD == this.b);
            this.d = iD;
            return;
        }
        InterfaceC6837nb0 interfaceC6837nb0 = (InterfaceC6837nb0) list;
        do {
            interfaceC6837nb0.o(C());
            if (this.a.e()) {
                return;
            } else {
                iD2 = this.a.D();
            }
        } while (iD2 == this.b);
        this.d = iD2;
    }

    public final void Y(int i) throws P10 {
        if (this.a.d() != i) {
            throw P10.n();
        }
    }

    public final void Z(int i) throws P10.a {
        if (AbstractC6027ki1.b(this.b) != i) {
            throw P10.e();
        }
    }

    @Override // com.daaw.KE0
    public void a(Object obj, DN0 dn0, C6484mJ c6484mJ) throws P10 {
        Z(2);
        S(obj, dn0, c6484mJ);
    }

    public final void a0(int i) throws P10 {
        if ((i & 3) != 0) {
            throw P10.h();
        }
    }

    @Override // com.daaw.KE0
    public void b(List list) throws P10 {
        int iD;
        int iD2;
        if (!(list instanceof C9753y00)) {
            int iB = AbstractC6027ki1.b(this.b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.a.z()));
                    if (this.a.e()) {
                        return;
                    } else {
                        iD = this.a.D();
                    }
                } while (iD == this.b);
                this.d = iD;
                return;
            }
            if (iB != 2) {
                throw P10.e();
            }
            int iD3 = this.a.d() + this.a.E();
            do {
                list.add(Integer.valueOf(this.a.z()));
            } while (this.a.d() < iD3);
            Y(iD3);
            return;
        }
        C9753y00 c9753y00 = (C9753y00) list;
        int iB2 = AbstractC6027ki1.b(this.b);
        if (iB2 == 0) {
            do {
                c9753y00.q(this.a.z());
                if (this.a.e()) {
                    return;
                } else {
                    iD2 = this.a.D();
                }
            } while (iD2 == this.b);
            this.d = iD2;
            return;
        }
        if (iB2 != 2) {
            throw P10.e();
        }
        int iD4 = this.a.d() + this.a.E();
        do {
            c9753y00.q(this.a.z());
        } while (this.a.d() < iD4);
        Y(iD4);
    }

    public final void b0(int i) throws P10 {
        if ((i & 7) != 0) {
            throw P10.h();
        }
    }

    @Override // com.daaw.KE0
    public long c() throws P10.a {
        Z(0);
        return this.a.F();
    }

    @Override // com.daaw.KE0
    public long d() throws P10.a {
        Z(1);
        return this.a.t();
    }

    @Override // com.daaw.KE0
    public void e(List list) throws P10 {
        int iD;
        int iD2;
        if (!(list instanceof C9753y00)) {
            int iB = AbstractC6027ki1.b(this.b);
            if (iB == 2) {
                int iE = this.a.E();
                a0(iE);
                int iD3 = this.a.d() + iE;
                do {
                    list.add(Integer.valueOf(this.a.x()));
                } while (this.a.d() < iD3);
                return;
            }
            if (iB != 5) {
                throw P10.e();
            }
            do {
                list.add(Integer.valueOf(this.a.x()));
                if (this.a.e()) {
                    return;
                } else {
                    iD = this.a.D();
                }
            } while (iD == this.b);
            this.d = iD;
            return;
        }
        C9753y00 c9753y00 = (C9753y00) list;
        int iB2 = AbstractC6027ki1.b(this.b);
        if (iB2 == 2) {
            int iE2 = this.a.E();
            a0(iE2);
            int iD4 = this.a.d() + iE2;
            do {
                c9753y00.q(this.a.x());
            } while (this.a.d() < iD4);
            return;
        }
        if (iB2 != 5) {
            throw P10.e();
        }
        do {
            c9753y00.q(this.a.x());
            if (this.a.e()) {
                return;
            } else {
                iD2 = this.a.D();
            }
        } while (iD2 == this.b);
        this.d = iD2;
    }

    @Override // com.daaw.KE0
    public void f(List list) throws P10 {
        int iD;
        int iD2;
        if (!(list instanceof AbstractC4321ee0)) {
            int iB = AbstractC6027ki1.b(this.b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.a.A()));
                    if (this.a.e()) {
                        return;
                    } else {
                        iD = this.a.D();
                    }
                } while (iD == this.b);
                this.d = iD;
                return;
            }
            if (iB != 2) {
                throw P10.e();
            }
            int iD3 = this.a.d() + this.a.E();
            do {
                list.add(Long.valueOf(this.a.A()));
            } while (this.a.d() < iD3);
            Y(iD3);
            return;
        }
        AbstractC4321ee0 abstractC4321ee0 = (AbstractC4321ee0) list;
        int iB2 = AbstractC6027ki1.b(this.b);
        if (iB2 == 0) {
            do {
                abstractC4321ee0.m(this.a.A());
                if (this.a.e()) {
                    return;
                } else {
                    iD2 = this.a.D();
                }
            } while (iD2 == this.b);
            this.d = iD2;
            return;
        }
        if (iB2 != 2) {
            throw P10.e();
        }
        int iD4 = this.a.d() + this.a.E();
        do {
            abstractC4321ee0.m(this.a.A());
        } while (this.a.d() < iD4);
        Y(iD4);
    }

    @Override // com.daaw.KE0
    public void g(List list) throws P10 {
        int iD;
        int iD2;
        if (!(list instanceof C9753y00)) {
            int iB = AbstractC6027ki1.b(this.b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.a.E()));
                    if (this.a.e()) {
                        return;
                    } else {
                        iD = this.a.D();
                    }
                } while (iD == this.b);
                this.d = iD;
                return;
            }
            if (iB != 2) {
                throw P10.e();
            }
            int iD3 = this.a.d() + this.a.E();
            do {
                list.add(Integer.valueOf(this.a.E()));
            } while (this.a.d() < iD3);
            Y(iD3);
            return;
        }
        C9753y00 c9753y00 = (C9753y00) list;
        int iB2 = AbstractC6027ki1.b(this.b);
        if (iB2 == 0) {
            do {
                c9753y00.q(this.a.E());
                if (this.a.e()) {
                    return;
                } else {
                    iD2 = this.a.D();
                }
            } while (iD2 == this.b);
            this.d = iD2;
            return;
        }
        if (iB2 != 2) {
            throw P10.e();
        }
        int iD4 = this.a.d() + this.a.E();
        do {
            c9753y00.q(this.a.E());
        } while (this.a.d() < iD4);
        Y(iD4);
    }

    @Override // com.daaw.KE0
    public void h(Object obj, DN0 dn0, C6484mJ c6484mJ) throws P10.a {
        Z(3);
        R(obj, dn0, c6484mJ);
    }

    @Override // com.daaw.KE0
    public int i() throws P10.a {
        Z(5);
        return this.a.s();
    }

    @Override // com.daaw.KE0
    public boolean j() throws P10.a {
        Z(0);
        return this.a.o();
    }

    @Override // com.daaw.KE0
    public long k() throws P10.a {
        Z(1);
        return this.a.y();
    }

    @Override // com.daaw.KE0
    public void l(List list) throws P10 {
        int iD;
        int iD2;
        if (!(list instanceof AbstractC4321ee0)) {
            int iB = AbstractC6027ki1.b(this.b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.a.F()));
                    if (this.a.e()) {
                        return;
                    } else {
                        iD = this.a.D();
                    }
                } while (iD == this.b);
                this.d = iD;
                return;
            }
            if (iB != 2) {
                throw P10.e();
            }
            int iD3 = this.a.d() + this.a.E();
            do {
                list.add(Long.valueOf(this.a.F()));
            } while (this.a.d() < iD3);
            Y(iD3);
            return;
        }
        AbstractC4321ee0 abstractC4321ee0 = (AbstractC4321ee0) list;
        int iB2 = AbstractC6027ki1.b(this.b);
        if (iB2 == 0) {
            do {
                abstractC4321ee0.m(this.a.F());
                if (this.a.e()) {
                    return;
                } else {
                    iD2 = this.a.D();
                }
            } while (iD2 == this.b);
            this.d = iD2;
            return;
        }
        if (iB2 != 2) {
            throw P10.e();
        }
        int iD4 = this.a.d() + this.a.E();
        do {
            abstractC4321ee0.m(this.a.F());
        } while (this.a.d() < iD4);
        Y(iD4);
    }

    @Override // com.daaw.KE0
    public int m() throws P10.a {
        Z(0);
        return this.a.E();
    }

    @Override // com.daaw.KE0
    public double n() throws P10.a {
        Z(1);
        return this.a.q();
    }

    @Override // com.daaw.KE0
    public void o(List list) throws P10 {
        int iD;
        int iD2;
        if (!(list instanceof AbstractC4321ee0)) {
            int iB = AbstractC6027ki1.b(this.b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.a.w()));
                    if (this.a.e()) {
                        return;
                    } else {
                        iD = this.a.D();
                    }
                } while (iD == this.b);
                this.d = iD;
                return;
            }
            if (iB != 2) {
                throw P10.e();
            }
            int iD3 = this.a.d() + this.a.E();
            do {
                list.add(Long.valueOf(this.a.w()));
            } while (this.a.d() < iD3);
            Y(iD3);
            return;
        }
        AbstractC4321ee0 abstractC4321ee0 = (AbstractC4321ee0) list;
        int iB2 = AbstractC6027ki1.b(this.b);
        if (iB2 == 0) {
            do {
                abstractC4321ee0.m(this.a.w());
                if (this.a.e()) {
                    return;
                } else {
                    iD2 = this.a.D();
                }
            } while (iD2 == this.b);
            this.d = iD2;
            return;
        }
        if (iB2 != 2) {
            throw P10.e();
        }
        int iD4 = this.a.d() + this.a.E();
        do {
            abstractC4321ee0.m(this.a.w());
        } while (this.a.d() < iD4);
        Y(iD4);
    }

    @Override // com.daaw.KE0
    public void p(List list) throws P10 {
        int iD;
        int iD2;
        if (!(list instanceof AbstractC4321ee0)) {
            int iB = AbstractC6027ki1.b(this.b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.a.y()));
                    if (this.a.e()) {
                        return;
                    } else {
                        iD = this.a.D();
                    }
                } while (iD == this.b);
                this.d = iD;
                return;
            }
            if (iB != 2) {
                throw P10.e();
            }
            int iE = this.a.E();
            b0(iE);
            int iD3 = this.a.d() + iE;
            do {
                list.add(Long.valueOf(this.a.y()));
            } while (this.a.d() < iD3);
            return;
        }
        AbstractC4321ee0 abstractC4321ee0 = (AbstractC4321ee0) list;
        int iB2 = AbstractC6027ki1.b(this.b);
        if (iB2 == 1) {
            do {
                abstractC4321ee0.m(this.a.y());
                if (this.a.e()) {
                    return;
                } else {
                    iD2 = this.a.D();
                }
            } while (iD2 == this.b);
            this.d = iD2;
            return;
        }
        if (iB2 != 2) {
            throw P10.e();
        }
        int iE2 = this.a.E();
        b0(iE2);
        int iD4 = this.a.d() + iE2;
        do {
            abstractC4321ee0.m(this.a.y());
        } while (this.a.d() < iD4);
    }

    @Override // com.daaw.KE0
    public void q(List list) throws P10 {
        int iD;
        int iD2;
        if (!(list instanceof C9753y00)) {
            int iB = AbstractC6027ki1.b(this.b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.a.v()));
                    if (this.a.e()) {
                        return;
                    } else {
                        iD = this.a.D();
                    }
                } while (iD == this.b);
                this.d = iD;
                return;
            }
            if (iB != 2) {
                throw P10.e();
            }
            int iD3 = this.a.d() + this.a.E();
            do {
                list.add(Integer.valueOf(this.a.v()));
            } while (this.a.d() < iD3);
            Y(iD3);
            return;
        }
        C9753y00 c9753y00 = (C9753y00) list;
        int iB2 = AbstractC6027ki1.b(this.b);
        if (iB2 == 0) {
            do {
                c9753y00.q(this.a.v());
                if (this.a.e()) {
                    return;
                } else {
                    iD2 = this.a.D();
                }
            } while (iD2 == this.b);
            this.d = iD2;
            return;
        }
        if (iB2 != 2) {
            throw P10.e();
        }
        int iD4 = this.a.d() + this.a.E();
        do {
            c9753y00.q(this.a.v());
        } while (this.a.d() < iD4);
        Y(iD4);
    }

    @Override // com.daaw.KE0
    public void r(List list) throws P10 {
        int iD;
        int iD2;
        if (!(list instanceof C9753y00)) {
            int iB = AbstractC6027ki1.b(this.b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.a.r()));
                    if (this.a.e()) {
                        return;
                    } else {
                        iD = this.a.D();
                    }
                } while (iD == this.b);
                this.d = iD;
                return;
            }
            if (iB != 2) {
                throw P10.e();
            }
            int iD3 = this.a.d() + this.a.E();
            do {
                list.add(Integer.valueOf(this.a.r()));
            } while (this.a.d() < iD3);
            Y(iD3);
            return;
        }
        C9753y00 c9753y00 = (C9753y00) list;
        int iB2 = AbstractC6027ki1.b(this.b);
        if (iB2 == 0) {
            do {
                c9753y00.q(this.a.r());
                if (this.a.e()) {
                    return;
                } else {
                    iD2 = this.a.D();
                }
            } while (iD2 == this.b);
            this.d = iD2;
            return;
        }
        if (iB2 != 2) {
            throw P10.e();
        }
        int iD4 = this.a.d() + this.a.E();
        do {
            c9753y00.q(this.a.r());
        } while (this.a.d() < iD4);
        Y(iD4);
    }

    @Override // com.daaw.KE0
    public int s() throws P10.a {
        Z(0);
        return this.a.r();
    }

    @Override // com.daaw.KE0
    public int t() {
        return this.b;
    }

    @Override // com.daaw.KE0
    public void u(List list) throws P10 {
        int iD;
        int iD2;
        if (!(list instanceof C9753y00)) {
            int iB = AbstractC6027ki1.b(this.b);
            if (iB == 2) {
                int iE = this.a.E();
                a0(iE);
                int iD3 = this.a.d() + iE;
                do {
                    list.add(Integer.valueOf(this.a.s()));
                } while (this.a.d() < iD3);
                return;
            }
            if (iB != 5) {
                throw P10.e();
            }
            do {
                list.add(Integer.valueOf(this.a.s()));
                if (this.a.e()) {
                    return;
                } else {
                    iD = this.a.D();
                }
            } while (iD == this.b);
            this.d = iD;
            return;
        }
        C9753y00 c9753y00 = (C9753y00) list;
        int iB2 = AbstractC6027ki1.b(this.b);
        if (iB2 == 2) {
            int iE2 = this.a.E();
            a0(iE2);
            int iD4 = this.a.d() + iE2;
            do {
                c9753y00.q(this.a.s());
            } while (this.a.d() < iD4);
            return;
        }
        if (iB2 != 5) {
            throw P10.e();
        }
        do {
            c9753y00.q(this.a.s());
            if (this.a.e()) {
                return;
            } else {
                iD2 = this.a.D();
            }
        } while (iD2 == this.b);
        this.d = iD2;
    }

    @Override // com.daaw.KE0
    public int v() throws P10.a {
        Z(0);
        return this.a.z();
    }

    @Override // com.daaw.KE0
    public long w() throws P10.a {
        Z(0);
        return this.a.A();
    }

    @Override // com.daaw.KE0
    public void x(List list) throws P10 {
        int iD;
        int iD2;
        if (!(list instanceof AbstractC6303lg)) {
            int iB = AbstractC6027ki1.b(this.b);
            if (iB == 0) {
                do {
                    list.add(Boolean.valueOf(this.a.o()));
                    if (this.a.e()) {
                        return;
                    } else {
                        iD = this.a.D();
                    }
                } while (iD == this.b);
                this.d = iD;
                return;
            }
            if (iB != 2) {
                throw P10.e();
            }
            int iD3 = this.a.d() + this.a.E();
            do {
                list.add(Boolean.valueOf(this.a.o()));
            } while (this.a.d() < iD3);
            Y(iD3);
            return;
        }
        AbstractC6303lg abstractC6303lg = (AbstractC6303lg) list;
        int iB2 = AbstractC6027ki1.b(this.b);
        if (iB2 == 0) {
            do {
                abstractC6303lg.m(this.a.o());
                if (this.a.e()) {
                    return;
                } else {
                    iD2 = this.a.D();
                }
            } while (iD2 == this.b);
            this.d = iD2;
            return;
        }
        if (iB2 != 2) {
            throw P10.e();
        }
        int iD4 = this.a.d() + this.a.E();
        do {
            abstractC6303lg.m(this.a.o());
        } while (this.a.d() < iD4);
        Y(iD4);
    }

    @Override // com.daaw.KE0
    public String y() throws P10.a {
        Z(2);
        return this.a.B();
    }

    @Override // com.daaw.KE0
    public int z() {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            this.b = this.a.D();
        }
        int i2 = this.b;
        if (i2 == 0 || i2 == this.c) {
            return Integer.MAX_VALUE;
        }
        return AbstractC6027ki1.a(i2);
    }
}
