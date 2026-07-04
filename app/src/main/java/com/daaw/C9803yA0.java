package com.daaw;

import com.daaw.AbstractC4629fi;
import com.daaw.AbstractC5674jS;
import com.daaw.S;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.yA0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9803yA0 extends AbstractC5674jS implements InterfaceC2130Rj0 {
    public static final C9803yA0 G;
    public static InterfaceC2792Xs0 H = new a();
    public final AbstractC4629fi C;
    public List D;
    public byte E;
    public int F;

    /* JADX INFO: renamed from: com.daaw.yA0$a */
    public static class a extends Z {
        @Override // com.daaw.InterfaceC2792Xs0
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public C9803yA0 c(C9687xm c9687xm, C6763nJ c6763nJ) {
            return new C9803yA0(c9687xm, c6763nJ);
        }
    }

    static {
        C9803yA0 c9803yA0 = new C9803yA0(true);
        G = c9803yA0;
        c9803yA0.A();
    }

    private void A() {
        this.D = Collections.EMPTY_LIST;
    }

    public static b B() {
        return b.p();
    }

    public static b C(C9803yA0 c9803yA0) {
        return B().j(c9803yA0);
    }

    public static C9803yA0 x() {
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

    public C10082zA0 y(int i) {
        return (C10082zA0) this.D.get(i);
    }

    public int z() {
        return this.D.size();
    }

    public C9803yA0(AbstractC5674jS.b bVar) {
        super(bVar);
        this.E = (byte) -1;
        this.F = -1;
        this.C = bVar.i();
    }

    public C9803yA0(boolean z) {
        this.E = (byte) -1;
        this.F = -1;
        this.C = AbstractC4629fi.B;
    }

    public C9803yA0(C9687xm c9687xm, C6763nJ c6763nJ) {
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
                            this.D.add(c9687xm.t(C10082zA0.L, c6763nJ));
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

    /* JADX INFO: renamed from: com.daaw.yA0$b */
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
        public C9803yA0 a() {
            C9803yA0 c9803yA0N = n();
            if (c9803yA0N.e()) {
                return c9803yA0N;
            }
            throw S.a.h(c9803yA0N);
        }

        public C9803yA0 n() {
            C9803yA0 c9803yA0 = new C9803yA0(this);
            if ((this.C & 1) == 1) {
                this.D = DesugarCollections.unmodifiableList(this.D);
                this.C &= -2;
            }
            c9803yA0.D = this.D;
            return c9803yA0;
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
        public com.daaw.C9803yA0.b N(com.daaw.C9687xm r3, com.daaw.C6763nJ r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.daaw.Xs0 r1 = com.daaw.C9803yA0.H     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                com.daaw.yA0 r3 = (com.daaw.C9803yA0) r3     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
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
                com.daaw.yA0 r4 = (com.daaw.C9803yA0) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.C9803yA0.b.N(com.daaw.xm, com.daaw.nJ):com.daaw.yA0$b");
        }

        @Override // com.daaw.AbstractC5674jS.b
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public b j(C9803yA0 c9803yA0) {
            if (c9803yA0 == C9803yA0.x()) {
                return this;
            }
            if (!c9803yA0.D.isEmpty()) {
                if (this.D.isEmpty()) {
                    this.D = c9803yA0.D;
                    this.C &= -2;
                } else {
                    q();
                    this.D.addAll(c9803yA0.D);
                }
            }
            k(i().m(c9803yA0.C));
            return this;
        }

        private void r() {
        }
    }
}
