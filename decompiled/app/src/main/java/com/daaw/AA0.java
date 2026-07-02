package com.daaw;

import com.daaw.AbstractC4629fi;
import com.daaw.AbstractC5674jS;
import com.daaw.S;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class AA0 extends AbstractC5674jS.d implements InterfaceC2130Rj0 {
    public static final AA0 I;
    public static InterfaceC2792Xs0 J = new a();
    public final AbstractC4629fi D;
    public int E;
    public int F;
    public byte G;
    public int H;

    public static class a extends Z {
        @Override // com.daaw.InterfaceC2792Xs0
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public AA0 c(C9687xm c9687xm, C6763nJ c6763nJ) {
            return new AA0(c9687xm, c6763nJ);
        }
    }

    static {
        AA0 aa0 = new AA0(true);
        I = aa0;
        aa0.K();
    }

    public static AA0 G() {
        return I;
    }

    private void K() {
        this.F = 0;
    }

    public static b L() {
        return b.u();
    }

    public static b M(AA0 aa0) {
        return L().j(aa0);
    }

    @Override // com.daaw.InterfaceC2130Rj0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public AA0 b() {
        return I;
    }

    public int I() {
        return this.F;
    }

    public boolean J() {
        return (this.E & 1) == 1;
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
        int i = this.H;
        if (i != -1) {
            return i;
        }
        int iO = ((this.E & 1) == 1 ? C0343Am.o(1, this.F) : 0) + w() + this.D.size();
        this.H = iO;
        return iO;
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
        if (u()) {
            this.G = (byte) 1;
            return true;
        }
        this.G = (byte) 0;
        return false;
    }

    @Override // com.daaw.InterfaceC2026Qj0
    public void g(C0343Am c0343Am) throws IOException {
        c();
        AbstractC5674jS.d.a aVarB = B();
        if ((this.E & 1) == 1) {
            c0343Am.Z(1, this.F);
        }
        aVarB.a(RCHTTPStatusCodes.SUCCESS, c0343Am);
        c0343Am.h0(this.D);
    }

    public AA0(AbstractC5674jS.c cVar) {
        super(cVar);
        this.G = (byte) -1;
        this.H = -1;
        this.D = cVar.i();
    }

    public AA0(boolean z) {
        this.G = (byte) -1;
        this.H = -1;
        this.D = AbstractC4629fi.B;
    }

    public AA0(C9687xm c9687xm, C6763nJ c6763nJ) {
        this.G = (byte) -1;
        this.H = -1;
        K();
        AbstractC4629fi.b bVarG = AbstractC4629fi.G();
        C0343Am c0343AmI = C0343Am.I(bVarG, 1);
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iJ = c9687xm.J();
                    if (iJ != 0) {
                        if (iJ != 8) {
                            if (!r(c9687xm, c0343AmI, c6763nJ, iJ)) {
                            }
                        } else {
                            this.E |= 1;
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
                try {
                    c0343AmI.H();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.D = bVarG.l();
                    throw th2;
                }
                this.D = bVarG.l();
                n();
                throw th;
            }
        }
        try {
            c0343AmI.H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.D = bVarG.l();
            throw th3;
        }
        this.D = bVarG.l();
        n();
    }

    public static final class b extends AbstractC5674jS.c implements InterfaceC2130Rj0 {
        public int E;
        public int F;

        public b() {
            v();
        }

        public static b u() {
            return new b();
        }

        @Override // com.daaw.InterfaceC2026Qj0.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public AA0 a() {
            AA0 aa0R = r();
            if (aa0R.e()) {
                return aa0R;
            }
            throw S.a.h(aa0R);
        }

        public AA0 r() {
            AA0 aa0 = new AA0(this);
            int i = (this.E & 1) != 1 ? 0 : 1;
            aa0.F = this.F;
            aa0.E = i;
            return aa0;
        }

        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return u().j(r());
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // com.daaw.InterfaceC2026Qj0.a
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.daaw.AA0.b N(com.daaw.C9687xm r3, com.daaw.C6763nJ r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.daaw.Xs0 r1 = com.daaw.AA0.J     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                com.daaw.AA0 r3 = (com.daaw.AA0) r3     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
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
                com.daaw.AA0 r4 = (com.daaw.AA0) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.AA0.b.N(com.daaw.xm, com.daaw.nJ):com.daaw.AA0$b");
        }

        @Override // com.daaw.AbstractC5674jS.b
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public b j(AA0 aa0) {
            if (aa0 == AA0.G()) {
                return this;
            }
            if (aa0.J()) {
                y(aa0.I());
            }
            o(aa0);
            k(i().m(aa0.D));
            return this;
        }

        public b y(int i) {
            this.E |= 1;
            this.F = i;
            return this;
        }

        private void v() {
        }
    }
}
