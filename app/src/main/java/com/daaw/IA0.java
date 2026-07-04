package com.daaw;

import com.daaw.AbstractC3595c10;
import com.daaw.AbstractC4629fi;
import com.daaw.AbstractC5674jS;
import com.daaw.S;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class IA0 extends AbstractC5674jS implements InterfaceC2130Rj0 {
    public static final IA0 G;
    public static InterfaceC2792Xs0 H = new a();
    public final AbstractC4629fi C;
    public List D;
    public byte E;
    public int F;

    public static class a extends Z {
        @Override // com.daaw.InterfaceC2792Xs0
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public IA0 c(C9687xm c9687xm, C6763nJ c6763nJ) {
            return new IA0(c9687xm, c6763nJ);
        }
    }

    static {
        IA0 ia0 = new IA0(true);
        G = ia0;
        ia0.A();
    }

    private void A() {
        this.D = Collections.EMPTY_LIST;
    }

    public static b B() {
        return b.p();
    }

    public static b C(IA0 ia0) {
        return B().j(ia0);
    }

    public static IA0 x() {
        return G;
    }

    @Override // com.daaw.InterfaceC2026Qj0
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public b d() {
        return B();
    }

    @Override // com.daaw.InterfaceC2026Qj0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public b f() {
        return C(this);
    }

    @Override // com.daaw.InterfaceC2026Qj0
    public int c() {
        int i = this.F;
        if (i != -1) {
            return i;
        }
        int iR = 0;
        for (int i2 = 0; i2 < this.D.size(); i2++) {
            iR += C0343Am.r(1, (InterfaceC2026Qj0) this.D.get(i2));
        }
        int size = iR + this.C.size();
        this.F = size;
        return size;
    }

    @Override // com.daaw.InterfaceC2130Rj0
    public final boolean e() {
        byte b2 = this.E;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i = 0; i < z(); i++) {
            if (!y(i).e()) {
                this.E = (byte) 0;
                return false;
            }
        }
        this.E = (byte) 1;
        return true;
    }

    @Override // com.daaw.InterfaceC2026Qj0
    public void g(C0343Am c0343Am) throws IOException {
        c();
        for (int i = 0; i < this.D.size(); i++) {
            c0343Am.c0(1, (InterfaceC2026Qj0) this.D.get(i));
        }
        c0343Am.h0(this.C);
    }

    public c y(int i) {
        return (c) this.D.get(i);
    }

    public int z() {
        return this.D.size();
    }

    public static final class c extends AbstractC5674jS implements InterfaceC2130Rj0 {
        public static final c J;
        public static InterfaceC2792Xs0 K = new a();
        public final AbstractC4629fi C;
        public int D;
        public int E;
        public int F;
        public EnumC0068c G;
        public byte H;
        public int I;

        public static class a extends Z {
            @Override // com.daaw.InterfaceC2792Xs0
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public c c(C9687xm c9687xm, C6763nJ c6763nJ) {
                return new c(c9687xm, c6763nJ);
            }
        }

        /* JADX INFO: renamed from: com.daaw.IA0$c$c, reason: collision with other inner class name */
        public enum EnumC0068c implements AbstractC3595c10.a {
            CLASS(0, 0),
            PACKAGE(1, 1),
            LOCAL(2, 2);

            public static AbstractC3595c10.b F = new a();
            public final int B;

            /* JADX INFO: renamed from: com.daaw.IA0$c$c$a */
            public static class a implements AbstractC3595c10.b {
                @Override // com.daaw.AbstractC3595c10.b
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public EnumC0068c a(int i) {
                    return EnumC0068c.a(i);
                }
            }

            EnumC0068c(int i, int i2) {
                this.B = i2;
            }

            public static EnumC0068c a(int i) {
                if (i == 0) {
                    return CLASS;
                }
                if (i == 1) {
                    return PACKAGE;
                }
                if (i != 2) {
                    return null;
                }
                return LOCAL;
            }

            @Override // com.daaw.AbstractC3595c10.a
            public final int b() {
                return this.B;
            }
        }

        static {
            c cVar = new c(true);
            J = cVar;
            cVar.G();
        }

        private void G() {
            this.E = -1;
            this.F = 0;
            this.G = EnumC0068c.PACKAGE;
        }

        public static b H() {
            return b.p();
        }

        public static b I(c cVar) {
            return H().j(cVar);
        }

        public static c z() {
            return J;
        }

        public EnumC0068c A() {
            return this.G;
        }

        public int B() {
            return this.E;
        }

        public int C() {
            return this.F;
        }

        public boolean D() {
            return (this.D & 4) == 4;
        }

        public boolean E() {
            return (this.D & 1) == 1;
        }

        public boolean F() {
            return (this.D & 2) == 2;
        }

        @Override // com.daaw.InterfaceC2026Qj0
        /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
        public b d() {
            return H();
        }

        @Override // com.daaw.InterfaceC2026Qj0
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public b f() {
            return I(this);
        }

        @Override // com.daaw.InterfaceC2026Qj0
        public int c() {
            int i = this.I;
            if (i != -1) {
                return i;
            }
            int iO = (this.D & 1) == 1 ? C0343Am.o(1, this.E) : 0;
            if ((this.D & 2) == 2) {
                iO += C0343Am.o(2, this.F);
            }
            if ((this.D & 4) == 4) {
                iO += C0343Am.h(3, this.G.b());
            }
            int size = iO + this.C.size();
            this.I = size;
            return size;
        }

        @Override // com.daaw.InterfaceC2130Rj0
        public final boolean e() {
            byte b2 = this.H;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            if (F()) {
                this.H = (byte) 1;
                return true;
            }
            this.H = (byte) 0;
            return false;
        }

        @Override // com.daaw.InterfaceC2026Qj0
        public void g(C0343Am c0343Am) throws IOException {
            c();
            if ((this.D & 1) == 1) {
                c0343Am.Z(1, this.E);
            }
            if ((this.D & 2) == 2) {
                c0343Am.Z(2, this.F);
            }
            if ((this.D & 4) == 4) {
                c0343Am.R(3, this.G.b());
            }
            c0343Am.h0(this.C);
        }

        public c(AbstractC5674jS.b bVar) {
            super(bVar);
            this.H = (byte) -1;
            this.I = -1;
            this.C = bVar.i();
        }

        public c(boolean z) {
            this.H = (byte) -1;
            this.I = -1;
            this.C = AbstractC4629fi.B;
        }

        public c(C9687xm c9687xm, C6763nJ c6763nJ) {
            this.H = (byte) -1;
            this.I = -1;
            G();
            AbstractC4629fi.b bVarG = AbstractC4629fi.G();
            C0343Am c0343AmI = C0343Am.I(bVarG, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        try {
                            int iJ = c9687xm.J();
                            if (iJ != 0) {
                                if (iJ == 8) {
                                    this.D |= 1;
                                    this.E = c9687xm.r();
                                } else if (iJ == 16) {
                                    this.D |= 2;
                                    this.F = c9687xm.r();
                                } else if (iJ != 24) {
                                    if (!r(c9687xm, c0343AmI, c6763nJ, iJ)) {
                                    }
                                } else {
                                    int iM = c9687xm.m();
                                    EnumC0068c enumC0068cA = EnumC0068c.a(iM);
                                    if (enumC0068cA == null) {
                                        c0343AmI.n0(iJ);
                                        c0343AmI.n0(iM);
                                    } else {
                                        this.D |= 4;
                                        this.G = enumC0068cA;
                                    }
                                }
                            }
                            z = true;
                        } catch (Q10 e) {
                            throw e.i(this);
                        }
                    } catch (IOException e2) {
                        throw new Q10(e2.getMessage()).i(this);
                    }
                } catch (Throwable th) {
                    try {
                        c0343AmI.H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.C = bVarG.l();
                        throw th2;
                    }
                    this.C = bVarG.l();
                    n();
                    throw th;
                }
            }
            try {
                c0343AmI.H();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.C = bVarG.l();
                throw th3;
            }
            this.C = bVarG.l();
            n();
        }

        public static final class b extends AbstractC5674jS.b implements InterfaceC2130Rj0 {
            public int C;
            public int E;
            public int D = -1;
            public EnumC0068c F = EnumC0068c.PACKAGE;

            public b() {
                q();
            }

            public static b p() {
                return new b();
            }

            @Override // com.daaw.InterfaceC2026Qj0.a
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public c a() {
                c cVarN = n();
                if (cVarN.e()) {
                    return cVarN;
                }
                throw S.a.h(cVarN);
            }

            public c n() {
                c cVar = new c(this);
                int i = this.C;
                int i2 = (i & 1) != 1 ? 0 : 1;
                cVar.E = this.D;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                cVar.F = this.E;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                cVar.G = this.F;
                cVar.D = i2;
                return cVar;
            }

            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public b clone() {
                return p().j(n());
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // com.daaw.InterfaceC2026Qj0.a
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public com.daaw.IA0.c.b N(com.daaw.C9687xm r3, com.daaw.C6763nJ r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.daaw.Xs0 r1 = com.daaw.IA0.c.K     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                    com.daaw.IA0$c r3 = (com.daaw.IA0.c) r3     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                    if (r3 == 0) goto Le
                    r2.j(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    com.daaw.Qj0 r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    com.daaw.IA0$c r4 = (com.daaw.IA0.c) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.j(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.daaw.IA0.c.b.N(com.daaw.xm, com.daaw.nJ):com.daaw.IA0$c$b");
            }

            @Override // com.daaw.AbstractC5674jS.b
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public b j(c cVar) {
                if (cVar == c.z()) {
                    return this;
                }
                if (cVar.E()) {
                    v(cVar.B());
                }
                if (cVar.F()) {
                    w(cVar.C());
                }
                if (cVar.D()) {
                    u(cVar.A());
                }
                k(i().m(cVar.C));
                return this;
            }

            public b u(EnumC0068c enumC0068c) {
                enumC0068c.getClass();
                this.C |= 4;
                this.F = enumC0068c;
                return this;
            }

            public b v(int i) {
                this.C |= 1;
                this.D = i;
                return this;
            }

            public b w(int i) {
                this.C |= 2;
                this.E = i;
                return this;
            }

            private void q() {
            }
        }
    }

    public IA0(AbstractC5674jS.b bVar) {
        super(bVar);
        this.E = (byte) -1;
        this.F = -1;
        this.C = bVar.i();
    }

    public IA0(boolean z) {
        this.E = (byte) -1;
        this.F = -1;
        this.C = AbstractC4629fi.B;
    }

    public IA0(C9687xm c9687xm, C6763nJ c6763nJ) {
        this.E = (byte) -1;
        this.F = -1;
        A();
        AbstractC4629fi.b bVarG = AbstractC4629fi.G();
        C0343Am c0343AmI = C0343Am.I(bVarG, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int iJ = c9687xm.J();
                    if (iJ != 0) {
                        if (iJ != 10) {
                            if (!r(c9687xm, c0343AmI, c6763nJ, iJ)) {
                            }
                        } else {
                            if (!z2) {
                                this.D = new ArrayList();
                                z2 = true;
                            }
                            this.D.add(c9687xm.t(c.K, c6763nJ));
                        }
                    }
                    z = true;
                } catch (Q10 e) {
                    throw e.i(this);
                } catch (IOException e2) {
                    throw new Q10(e2.getMessage()).i(this);
                }
            } catch (Throwable th) {
                if (z2) {
                    this.D = DesugarCollections.unmodifiableList(this.D);
                }
                try {
                    c0343AmI.H();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.C = bVarG.l();
                    throw th2;
                }
                this.C = bVarG.l();
                n();
                throw th;
            }
        }
        if (z2) {
            this.D = DesugarCollections.unmodifiableList(this.D);
        }
        try {
            c0343AmI.H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.C = bVarG.l();
            throw th3;
        }
        this.C = bVarG.l();
        n();
    }

    public static final class b extends AbstractC5674jS.b implements InterfaceC2130Rj0 {
        public int C;
        public List D = Collections.EMPTY_LIST;

        public b() {
            r();
        }

        public static b p() {
            return new b();
        }

        @Override // com.daaw.InterfaceC2026Qj0.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public IA0 a() {
            IA0 ia0N = n();
            if (ia0N.e()) {
                return ia0N;
            }
            throw S.a.h(ia0N);
        }

        public IA0 n() {
            IA0 ia0 = new IA0(this);
            if ((this.C & 1) == 1) {
                this.D = DesugarCollections.unmodifiableList(this.D);
                this.C &= -2;
            }
            ia0.D = this.D;
            return ia0;
        }

        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return p().j(n());
        }

        public final void q() {
            if ((this.C & 1) != 1) {
                this.D = new ArrayList(this.D);
                this.C |= 1;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // com.daaw.InterfaceC2026Qj0.a
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.daaw.IA0.b N(com.daaw.C9687xm r3, com.daaw.C6763nJ r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.daaw.Xs0 r1 = com.daaw.IA0.H     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                com.daaw.IA0 r3 = (com.daaw.IA0) r3     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                if (r3 == 0) goto Le
                r2.j(r3)
            Le:
                return r2
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                com.daaw.Qj0 r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                com.daaw.IA0 r4 = (com.daaw.IA0) r4     // Catch: java.lang.Throwable -> Lf
                throw r3     // Catch: java.lang.Throwable -> L19
            L19:
                r3 = move-exception
                r0 = r4
            L1b:
                if (r0 == 0) goto L20
                r2.j(r0)
            L20:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.IA0.b.N(com.daaw.xm, com.daaw.nJ):com.daaw.IA0$b");
        }

        @Override // com.daaw.AbstractC5674jS.b
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public b j(IA0 ia0) {
            if (ia0 == IA0.x()) {
                return this;
            }
            if (!ia0.D.isEmpty()) {
                if (this.D.isEmpty()) {
                    this.D = ia0.D;
                    this.C &= -2;
                } else {
                    q();
                    this.D.addAll(ia0.D);
                }
            }
            k(i().m(ia0.C));
            return this;
        }

        private void r() {
        }
    }
}
