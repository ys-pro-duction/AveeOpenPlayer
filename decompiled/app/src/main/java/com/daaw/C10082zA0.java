package com.daaw;

import com.daaw.AbstractC3595c10;
import com.daaw.AbstractC4629fi;
import com.daaw.AbstractC5674jS;
import com.daaw.BA0;
import com.daaw.S;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.zA0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C10082zA0 extends AbstractC5674jS implements InterfaceC2130Rj0 {
    public static final C10082zA0 K;
    public static InterfaceC2792Xs0 L = new a();
    public final AbstractC4629fi C;
    public int D;
    public c E;
    public List F;
    public BA0 G;
    public d H;
    public byte I;
    public int J;

    /* JADX INFO: renamed from: com.daaw.zA0$a */
    public static class a extends Z {
        @Override // com.daaw.InterfaceC2792Xs0
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public C10082zA0 c(C9687xm c9687xm, C6763nJ c6763nJ) {
            return new C10082zA0(c9687xm, c6763nJ);
        }
    }

    /* JADX INFO: renamed from: com.daaw.zA0$c */
    public enum c implements AbstractC3595c10.a {
        RETURNS_CONSTANT(0, 0),
        CALLS(1, 1),
        RETURNS_NOT_NULL(2, 2);

        public static AbstractC3595c10.b F = new a();
        public final int B;

        /* JADX INFO: renamed from: com.daaw.zA0$c$a */
        public static class a implements AbstractC3595c10.b {
            @Override // com.daaw.AbstractC3595c10.b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public c a(int i) {
                return c.a(i);
            }
        }

        c(int i, int i2) {
            this.B = i2;
        }

        public static c a(int i) {
            if (i == 0) {
                return RETURNS_CONSTANT;
            }
            if (i == 1) {
                return CALLS;
            }
            if (i != 2) {
                return null;
            }
            return RETURNS_NOT_NULL;
        }

        @Override // com.daaw.AbstractC3595c10.a
        public final int b() {
            return this.B;
        }
    }

    /* JADX INFO: renamed from: com.daaw.zA0$d */
    public enum d implements AbstractC3595c10.a {
        AT_MOST_ONCE(0, 0),
        EXACTLY_ONCE(1, 1),
        AT_LEAST_ONCE(2, 2);

        public static AbstractC3595c10.b F = new a();
        public final int B;

        /* JADX INFO: renamed from: com.daaw.zA0$d$a */
        public static class a implements AbstractC3595c10.b {
            @Override // com.daaw.AbstractC3595c10.b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d a(int i) {
                return d.a(i);
            }
        }

        d(int i, int i2) {
            this.B = i2;
        }

        public static d a(int i) {
            if (i == 0) {
                return AT_MOST_ONCE;
            }
            if (i == 1) {
                return EXACTLY_ONCE;
            }
            if (i != 2) {
                return null;
            }
            return AT_LEAST_ONCE;
        }

        @Override // com.daaw.AbstractC3595c10.a
        public final int b() {
            return this.B;
        }
    }

    static {
        C10082zA0 c10082zA0 = new C10082zA0(true);
        K = c10082zA0;
        c10082zA0.K();
    }

    public static C10082zA0 C() {
        return K;
    }

    private void K() {
        this.E = c.RETURNS_CONSTANT;
        this.F = Collections.EMPTY_LIST;
        this.G = BA0.I();
        this.H = d.AT_MOST_ONCE;
    }

    public static b L() {
        return b.p();
    }

    public static b M(C10082zA0 c10082zA0) {
        return L().j(c10082zA0);
    }

    public BA0 B() {
        return this.G;
    }

    public BA0 D(int i) {
        return (BA0) this.F.get(i);
    }

    public int E() {
        return this.F.size();
    }

    public c F() {
        return this.E;
    }

    public d G() {
        return this.H;
    }

    public boolean H() {
        return (this.D & 2) == 2;
    }

    public boolean I() {
        return (this.D & 1) == 1;
    }

    public boolean J() {
        return (this.D & 4) == 4;
    }

    @Override // com.daaw.InterfaceC2026Qj0
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public b d() {
        return L();
    }

    @Override // com.daaw.InterfaceC2026Qj0
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public b f() {
        return M(this);
    }

    @Override // com.daaw.InterfaceC2026Qj0
    public int c() {
        int i = this.J;
        if (i != -1) {
            return i;
        }
        int iH = (this.D & 1) == 1 ? C0343Am.h(1, this.E.b()) : 0;
        for (int i2 = 0; i2 < this.F.size(); i2++) {
            iH += C0343Am.r(2, (InterfaceC2026Qj0) this.F.get(i2));
        }
        if ((this.D & 2) == 2) {
            iH += C0343Am.r(3, this.G);
        }
        if ((this.D & 4) == 4) {
            iH += C0343Am.h(4, this.H.b());
        }
        int size = iH + this.C.size();
        this.J = size;
        return size;
    }

    @Override // com.daaw.InterfaceC2130Rj0
    public final boolean e() {
        byte b2 = this.I;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i = 0; i < E(); i++) {
            if (!D(i).e()) {
                this.I = (byte) 0;
                return false;
            }
        }
        if (!H() || B().e()) {
            this.I = (byte) 1;
            return true;
        }
        this.I = (byte) 0;
        return false;
    }

    @Override // com.daaw.InterfaceC2026Qj0
    public void g(C0343Am c0343Am) throws IOException {
        c();
        if ((this.D & 1) == 1) {
            c0343Am.R(1, this.E.b());
        }
        for (int i = 0; i < this.F.size(); i++) {
            c0343Am.c0(2, (InterfaceC2026Qj0) this.F.get(i));
        }
        if ((this.D & 2) == 2) {
            c0343Am.c0(3, this.G);
        }
        if ((this.D & 4) == 4) {
            c0343Am.R(4, this.H.b());
        }
        c0343Am.h0(this.C);
    }

    public C10082zA0(AbstractC5674jS.b bVar) {
        super(bVar);
        this.I = (byte) -1;
        this.J = -1;
        this.C = bVar.i();
    }

    public C10082zA0(boolean z) {
        this.I = (byte) -1;
        this.J = -1;
        this.C = AbstractC4629fi.B;
    }

    public C10082zA0(C9687xm c9687xm, C6763nJ c6763nJ) {
        this.I = (byte) -1;
        this.J = -1;
        K();
        AbstractC4629fi.b bVarG = AbstractC4629fi.G();
        C0343Am c0343AmI = C0343Am.I(bVarG, 1);
        boolean z = false;
        char c2 = 0;
        while (!z) {
            try {
                try {
                    int iJ = c9687xm.J();
                    if (iJ != 0) {
                        if (iJ == 8) {
                            int iM = c9687xm.m();
                            c cVarA = c.a(iM);
                            if (cVarA == null) {
                                c0343AmI.n0(iJ);
                                c0343AmI.n0(iM);
                            } else {
                                this.D |= 1;
                                this.E = cVarA;
                            }
                        } else if (iJ == 18) {
                            if ((c2 & 2) != 2) {
                                this.F = new ArrayList();
                                c2 = 2;
                            }
                            this.F.add(c9687xm.t(BA0.O, c6763nJ));
                        } else if (iJ == 26) {
                            BA0.b bVarF = (this.D & 2) == 2 ? this.G.f() : null;
                            BA0 ba0 = (BA0) c9687xm.t(BA0.O, c6763nJ);
                            this.G = ba0;
                            if (bVarF != null) {
                                bVarF.j(ba0);
                                this.G = bVarF.n();
                            }
                            this.D |= 2;
                        } else if (iJ != 32) {
                            if (!r(c9687xm, c0343AmI, c6763nJ, iJ)) {
                            }
                        } else {
                            int iM2 = c9687xm.m();
                            d dVarA = d.a(iM2);
                            if (dVarA == null) {
                                c0343AmI.n0(iJ);
                                c0343AmI.n0(iM2);
                            } else {
                                this.D |= 4;
                                this.H = dVarA;
                            }
                        }
                    }
                    z = true;
                } catch (Q10 e) {
                    throw e.i(this);
                } catch (IOException e2) {
                    throw new Q10(e2.getMessage()).i(this);
                }
            } catch (Throwable th) {
                if ((c2 & 2) == 2) {
                    this.F = DesugarCollections.unmodifiableList(this.F);
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
        if ((c2 & 2) == 2) {
            this.F = DesugarCollections.unmodifiableList(this.F);
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

    /* JADX INFO: renamed from: com.daaw.zA0$b */
    public static final class b extends AbstractC5674jS.b implements InterfaceC2130Rj0 {
        public int C;
        public c D = c.RETURNS_CONSTANT;
        public List E = Collections.EMPTY_LIST;
        public BA0 F = BA0.I();
        public d G = d.AT_MOST_ONCE;

        public b() {
            r();
        }

        public static b p() {
            return new b();
        }

        @Override // com.daaw.InterfaceC2026Qj0.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public C10082zA0 a() {
            C10082zA0 c10082zA0N = n();
            if (c10082zA0N.e()) {
                return c10082zA0N;
            }
            throw S.a.h(c10082zA0N);
        }

        public C10082zA0 n() {
            C10082zA0 c10082zA0 = new C10082zA0(this);
            int i = this.C;
            int i2 = (i & 1) != 1 ? 0 : 1;
            c10082zA0.E = this.D;
            if ((this.C & 2) == 2) {
                this.E = DesugarCollections.unmodifiableList(this.E);
                this.C &= -3;
            }
            c10082zA0.F = this.E;
            if ((i & 4) == 4) {
                i2 |= 2;
            }
            c10082zA0.G = this.F;
            if ((i & 8) == 8) {
                i2 |= 4;
            }
            c10082zA0.H = this.G;
            c10082zA0.D = i2;
            return c10082zA0;
        }

        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return p().j(n());
        }

        public final void q() {
            if ((this.C & 2) != 2) {
                this.E = new ArrayList(this.E);
                this.C |= 2;
            }
        }

        public b t(BA0 ba0) {
            if ((this.C & 4) != 4 || this.F == BA0.I()) {
                this.F = ba0;
            } else {
                this.F = BA0.X(this.F).j(ba0).n();
            }
            this.C |= 4;
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // com.daaw.InterfaceC2026Qj0.a
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.daaw.C10082zA0.b N(com.daaw.C9687xm r3, com.daaw.C6763nJ r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.daaw.Xs0 r1 = com.daaw.C10082zA0.L     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                com.daaw.zA0 r3 = (com.daaw.C10082zA0) r3     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
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
                com.daaw.zA0 r4 = (com.daaw.C10082zA0) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.C10082zA0.b.N(com.daaw.xm, com.daaw.nJ):com.daaw.zA0$b");
        }

        @Override // com.daaw.AbstractC5674jS.b
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public b j(C10082zA0 c10082zA0) {
            if (c10082zA0 == C10082zA0.C()) {
                return this;
            }
            if (c10082zA0.I()) {
                w(c10082zA0.F());
            }
            if (!c10082zA0.F.isEmpty()) {
                if (this.E.isEmpty()) {
                    this.E = c10082zA0.F;
                    this.C &= -3;
                } else {
                    q();
                    this.E.addAll(c10082zA0.F);
                }
            }
            if (c10082zA0.H()) {
                t(c10082zA0.B());
            }
            if (c10082zA0.J()) {
                x(c10082zA0.G());
            }
            k(i().m(c10082zA0.C));
            return this;
        }

        public b w(c cVar) {
            cVar.getClass();
            this.C |= 1;
            this.D = cVar;
            return this;
        }

        public b x(d dVar) {
            dVar.getClass();
            this.C |= 8;
            this.G = dVar;
            return this;
        }

        private void r() {
        }
    }
}
