package com.daaw;

import com.daaw.AbstractC4629fi;
import com.daaw.AbstractC5674jS;
import com.daaw.S;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class NA0 extends AbstractC5674jS implements InterfaceC2130Rj0 {
    public static final NA0 I;
    public static InterfaceC2792Xs0 J = new a();
    public final AbstractC4629fi C;
    public int D;
    public List E;
    public int F;
    public byte G;
    public int H;

    public static class a extends Z {
        @Override // com.daaw.InterfaceC2792Xs0
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public NA0 c(C9687xm c9687xm, C6763nJ c6763nJ) {
            return new NA0(c9687xm, c6763nJ);
        }
    }

    static {
        NA0 na0 = new NA0(true);
        I = na0;
        na0.F();
    }

    private void F() {
        this.E = Collections.EMPTY_LIST;
        this.F = -1;
    }

    public static b G() {
        return b.p();
    }

    public static b H(NA0 na0) {
        return G().j(na0);
    }

    public static NA0 z() {
        return I;
    }

    public int A() {
        return this.F;
    }

    public KA0 B(int i) {
        return (KA0) this.E.get(i);
    }

    public int C() {
        return this.E.size();
    }

    public List D() {
        return this.E;
    }

    public boolean E() {
        return (this.D & 1) == 1;
    }

    @Override // com.daaw.InterfaceC2026Qj0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public b d() {
        return G();
    }

    @Override // com.daaw.InterfaceC2026Qj0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public b f() {
        return H(this);
    }

    @Override // com.daaw.InterfaceC2026Qj0
    public int c() {
        int i = this.H;
        if (i != -1) {
            return i;
        }
        int iO = 0;
        for (int i2 = 0; i2 < this.E.size(); i2++) {
            iO += C0343Am.r(1, (InterfaceC2026Qj0) this.E.get(i2));
        }
        if ((this.D & 1) == 1) {
            iO += C0343Am.o(2, this.F);
        }
        int size = iO + this.C.size();
        this.H = size;
        return size;
    }

    @Override // com.daaw.InterfaceC2130Rj0
    public final boolean e() {
        byte b2 = this.G;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i = 0; i < C(); i++) {
            if (!B(i).e()) {
                this.G = (byte) 0;
                return false;
            }
        }
        this.G = (byte) 1;
        return true;
    }

    @Override // com.daaw.InterfaceC2026Qj0
    public void g(C0343Am c0343Am) throws IOException {
        c();
        for (int i = 0; i < this.E.size(); i++) {
            c0343Am.c0(1, (InterfaceC2026Qj0) this.E.get(i));
        }
        if ((this.D & 1) == 1) {
            c0343Am.Z(2, this.F);
        }
        c0343Am.h0(this.C);
    }

    public NA0(AbstractC5674jS.b bVar) {
        super(bVar);
        this.G = (byte) -1;
        this.H = -1;
        this.C = bVar.i();
    }

    public NA0(boolean z) {
        this.G = (byte) -1;
        this.H = -1;
        this.C = AbstractC4629fi.B;
    }

    public NA0(C9687xm c9687xm, C6763nJ c6763nJ) {
        this.G = (byte) -1;
        this.H = -1;
        F();
        AbstractC4629fi.b bVarG = AbstractC4629fi.G();
        C0343Am c0343AmI = C0343Am.I(bVarG, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int iJ = c9687xm.J();
                    if (iJ != 0) {
                        if (iJ == 10) {
                            if (!z2) {
                                this.E = new ArrayList();
                                z2 = true;
                            }
                            this.E.add(c9687xm.t(KA0.W, c6763nJ));
                        } else if (iJ != 16) {
                            if (!r(c9687xm, c0343AmI, c6763nJ, iJ)) {
                            }
                        } else {
                            this.D |= 1;
                            this.F = c9687xm.r();
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
                    this.E = DesugarCollections.unmodifiableList(this.E);
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
            this.E = DesugarCollections.unmodifiableList(this.E);
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
        public int E = -1;

        public b() {
            r();
        }

        public static b p() {
            return new b();
        }

        @Override // com.daaw.InterfaceC2026Qj0.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public NA0 a() {
            NA0 na0N = n();
            if (na0N.e()) {
                return na0N;
            }
            throw S.a.h(na0N);
        }

        public NA0 n() {
            NA0 na0 = new NA0(this);
            int i = this.C;
            if ((i & 1) == 1) {
                this.D = DesugarCollections.unmodifiableList(this.D);
                this.C &= -2;
            }
            na0.E = this.D;
            int i2 = (i & 2) != 2 ? 0 : 1;
            na0.F = this.E;
            na0.D = i2;
            return na0;
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
        public com.daaw.NA0.b N(com.daaw.C9687xm r3, com.daaw.C6763nJ r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.daaw.Xs0 r1 = com.daaw.NA0.J     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                com.daaw.NA0 r3 = (com.daaw.NA0) r3     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
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
                com.daaw.NA0 r4 = (com.daaw.NA0) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.NA0.b.N(com.daaw.xm, com.daaw.nJ):com.daaw.NA0$b");
        }

        @Override // com.daaw.AbstractC5674jS.b
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public b j(NA0 na0) {
            if (na0 == NA0.z()) {
                return this;
            }
            if (!na0.E.isEmpty()) {
                if (this.D.isEmpty()) {
                    this.D = na0.E;
                    this.C &= -2;
                } else {
                    q();
                    this.D.addAll(na0.E);
                }
            }
            if (na0.E()) {
                v(na0.A());
            }
            k(i().m(na0.C));
            return this;
        }

        public b v(int i) {
            this.C |= 2;
            this.E = i;
            return this;
        }

        private void r() {
        }
    }
}
