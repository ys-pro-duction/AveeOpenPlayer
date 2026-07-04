package com.daaw;

import com.daaw.AbstractC4629fi;
import com.daaw.AbstractC5674jS;
import com.daaw.KA0;
import com.daaw.S;
import com.google.ads.AdSize;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes4.dex */
public final class LA0 extends AbstractC5674jS.d implements InterfaceC2130Rj0 {
    public static final LA0 Q;
    public static InterfaceC2792Xs0 R = new a();
    public final AbstractC4629fi D;
    public int E;
    public int F;
    public int G;
    public List H;
    public KA0 I;
    public int J;
    public KA0 K;
    public int L;
    public List M;
    public List N;
    public byte O;
    public int P;

    public static class a extends Z {
        @Override // com.daaw.InterfaceC2792Xs0
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public LA0 c(C9687xm c9687xm, C6763nJ c6763nJ) {
            return new LA0(c9687xm, c6763nJ);
        }
    }

    static {
        LA0 la0 = new LA0(true);
        Q = la0;
        la0.n0();
    }

    public static LA0 V() {
        return Q;
    }

    private void n0() {
        this.F = 6;
        this.G = 0;
        List list = Collections.EMPTY_LIST;
        this.H = list;
        this.I = KA0.b0();
        this.J = 0;
        this.K = KA0.b0();
        this.L = 0;
        this.M = list;
        this.N = list;
    }

    public static b o0() {
        return b.u();
    }

    public static b p0(LA0 la0) {
        return o0().j(la0);
    }

    public static LA0 r0(InputStream inputStream, C6763nJ c6763nJ) {
        return (LA0) R.a(inputStream, c6763nJ);
    }

    public C8966vA0 S(int i) {
        return (C8966vA0) this.M.get(i);
    }

    public int T() {
        return this.M.size();
    }

    public List U() {
        return this.M;
    }

    @Override // com.daaw.InterfaceC2130Rj0
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public LA0 b() {
        return Q;
    }

    public KA0 X() {
        return this.K;
    }

    public int Y() {
        return this.L;
    }

    public int Z() {
        return this.F;
    }

    public int a0() {
        return this.G;
    }

    public MA0 b0(int i) {
        return (MA0) this.H.get(i);
    }

    @Override // com.daaw.InterfaceC2026Qj0
    public int c() {
        int i = this.P;
        if (i != -1) {
            return i;
        }
        int iO = (this.E & 1) == 1 ? C0343Am.o(1, this.F) : 0;
        if ((this.E & 2) == 2) {
            iO += C0343Am.o(2, this.G);
        }
        for (int i2 = 0; i2 < this.H.size(); i2++) {
            iO += C0343Am.r(3, (InterfaceC2026Qj0) this.H.get(i2));
        }
        if ((this.E & 4) == 4) {
            iO += C0343Am.r(4, this.I);
        }
        if ((this.E & 8) == 8) {
            iO += C0343Am.o(5, this.J);
        }
        if ((this.E & 16) == 16) {
            iO += C0343Am.r(6, this.K);
        }
        if ((this.E & 32) == 32) {
            iO += C0343Am.o(7, this.L);
        }
        for (int i3 = 0; i3 < this.M.size(); i3++) {
            iO += C0343Am.r(8, (InterfaceC2026Qj0) this.M.get(i3));
        }
        int iP = 0;
        for (int i4 = 0; i4 < this.N.size(); i4++) {
            iP += C0343Am.p(((Integer) this.N.get(i4)).intValue());
        }
        int size = iO + iP + (g0().size() * 2) + w() + this.D.size();
        this.P = size;
        return size;
    }

    public int c0() {
        return this.H.size();
    }

    public List d0() {
        return this.H;
    }

    @Override // com.daaw.InterfaceC2130Rj0
    public final boolean e() {
        byte b2 = this.O;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (!k0()) {
            this.O = (byte) 0;
            return false;
        }
        for (int i = 0; i < c0(); i++) {
            if (!b0(i).e()) {
                this.O = (byte) 0;
                return false;
            }
        }
        if (l0() && !e0().e()) {
            this.O = (byte) 0;
            return false;
        }
        if (h0() && !X().e()) {
            this.O = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < T(); i2++) {
            if (!S(i2).e()) {
                this.O = (byte) 0;
                return false;
            }
        }
        if (u()) {
            this.O = (byte) 1;
            return true;
        }
        this.O = (byte) 0;
        return false;
    }

    public KA0 e0() {
        return this.I;
    }

    public int f0() {
        return this.J;
    }

    @Override // com.daaw.InterfaceC2026Qj0
    public void g(C0343Am c0343Am) throws IOException {
        c();
        AbstractC5674jS.d.a aVarB = B();
        if ((this.E & 1) == 1) {
            c0343Am.Z(1, this.F);
        }
        if ((this.E & 2) == 2) {
            c0343Am.Z(2, this.G);
        }
        for (int i = 0; i < this.H.size(); i++) {
            c0343Am.c0(3, (InterfaceC2026Qj0) this.H.get(i));
        }
        if ((this.E & 4) == 4) {
            c0343Am.c0(4, this.I);
        }
        if ((this.E & 8) == 8) {
            c0343Am.Z(5, this.J);
        }
        if ((this.E & 16) == 16) {
            c0343Am.c0(6, this.K);
        }
        if ((this.E & 32) == 32) {
            c0343Am.Z(7, this.L);
        }
        for (int i2 = 0; i2 < this.M.size(); i2++) {
            c0343Am.c0(8, (InterfaceC2026Qj0) this.M.get(i2));
        }
        for (int i3 = 0; i3 < this.N.size(); i3++) {
            c0343Am.Z(31, ((Integer) this.N.get(i3)).intValue());
        }
        aVarB.a(RCHTTPStatusCodes.SUCCESS, c0343Am);
        c0343Am.h0(this.D);
    }

    public List g0() {
        return this.N;
    }

    public boolean h0() {
        return (this.E & 16) == 16;
    }

    public boolean i0() {
        return (this.E & 32) == 32;
    }

    public boolean j0() {
        return (this.E & 1) == 1;
    }

    public boolean k0() {
        return (this.E & 2) == 2;
    }

    public boolean l0() {
        return (this.E & 4) == 4;
    }

    public boolean m0() {
        return (this.E & 8) == 8;
    }

    @Override // com.daaw.InterfaceC2026Qj0
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public b d() {
        return o0();
    }

    @Override // com.daaw.InterfaceC2026Qj0
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public b f() {
        return p0(this);
    }

    public LA0(AbstractC5674jS.c cVar) {
        super(cVar);
        this.O = (byte) -1;
        this.P = -1;
        this.D = cVar.i();
    }

    public LA0(boolean z) {
        this.O = (byte) -1;
        this.P = -1;
        this.D = AbstractC4629fi.B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public LA0(C9687xm c9687xm, C6763nJ c6763nJ) {
        KA0.c cVarF;
        this.O = (byte) -1;
        this.P = -1;
        n0();
        AbstractC4629fi.b bVarG = AbstractC4629fi.G();
        C0343Am c0343AmI = C0343Am.I(bVarG, 1);
        boolean z = false;
        int i = 0;
        while (true) {
            ?? R2 = 128;
            if (!z) {
                try {
                    try {
                        int iJ = c9687xm.J();
                        switch (iJ) {
                            case 0:
                                z = true;
                                break;
                            case 8:
                                this.E |= 1;
                                this.F = c9687xm.r();
                                break;
                            case 16:
                                this.E |= 2;
                                this.G = c9687xm.r();
                                break;
                            case 26:
                                if ((i & 4) != 4) {
                                    this.H = new ArrayList();
                                    i |= 4;
                                }
                                this.H.add(c9687xm.t(MA0.P, c6763nJ));
                                break;
                            case 34:
                                cVarF = (this.E & 4) == 4 ? this.I.f() : null;
                                KA0 ka0 = (KA0) c9687xm.t(KA0.W, c6763nJ);
                                this.I = ka0;
                                if (cVarF != null) {
                                    cVarF.j(ka0);
                                    this.I = cVarF.r();
                                }
                                this.E |= 4;
                                break;
                            case 40:
                                this.E |= 8;
                                this.J = c9687xm.r();
                                break;
                            case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                                cVarF = (this.E & 16) == 16 ? this.K.f() : null;
                                KA0 ka02 = (KA0) c9687xm.t(KA0.W, c6763nJ);
                                this.K = ka02;
                                if (cVarF != null) {
                                    cVarF.j(ka02);
                                    this.K = cVarF.r();
                                }
                                this.E |= 16;
                                break;
                            case 56:
                                this.E |= 32;
                                this.L = c9687xm.r();
                                break;
                            case 66:
                                if ((i & 128) != 128) {
                                    this.M = new ArrayList();
                                    i |= 128;
                                }
                                this.M.add(c9687xm.t(C8966vA0.J, c6763nJ));
                                break;
                            case 248:
                                if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256) {
                                    this.N = new ArrayList();
                                    i |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                }
                                this.N.add(Integer.valueOf(c9687xm.r()));
                                break;
                            case 250:
                                int i2 = c9687xm.i(c9687xm.z());
                                if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256 && c9687xm.e() > 0) {
                                    this.N = new ArrayList();
                                    i |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                }
                                while (c9687xm.e() > 0) {
                                    this.N.add(Integer.valueOf(c9687xm.r()));
                                }
                                c9687xm.h(i2);
                                break;
                            default:
                                R2 = r(c9687xm, c0343AmI, c6763nJ, iJ);
                                if (R2 == 0) {
                                    z = true;
                                }
                                break;
                        }
                    } catch (Q10 e) {
                        throw e.i(this);
                    } catch (IOException e2) {
                        throw new Q10(e2.getMessage()).i(this);
                    }
                } catch (Throwable th) {
                    if ((i & 4) == 4) {
                        this.H = DesugarCollections.unmodifiableList(this.H);
                    }
                    if ((i & 128) == R2) {
                        this.M = DesugarCollections.unmodifiableList(this.M);
                    }
                    if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                        this.N = DesugarCollections.unmodifiableList(this.N);
                    }
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
            } else {
                if ((i & 4) == 4) {
                    this.H = DesugarCollections.unmodifiableList(this.H);
                }
                if ((i & 128) == 128) {
                    this.M = DesugarCollections.unmodifiableList(this.M);
                }
                if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                    this.N = DesugarCollections.unmodifiableList(this.N);
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
                return;
            }
        }
    }

    public static final class b extends AbstractC5674jS.c implements InterfaceC2130Rj0 {
        public int E;
        public int F = 6;
        public int G;
        public List H;
        public KA0 I;
        public int J;
        public KA0 K;
        public int L;
        public List M;
        public List N;

        public b() {
            List list = Collections.EMPTY_LIST;
            this.H = list;
            this.I = KA0.b0();
            this.K = KA0.b0();
            this.M = list;
            this.N = list;
            y();
        }

        public static b u() {
            return new b();
        }

        private void w() {
            if ((this.E & 4) != 4) {
                this.H = new ArrayList(this.H);
                this.E |= 4;
            }
        }

        private void x() {
            if ((this.E & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256) {
                this.N = new ArrayList(this.N);
                this.E |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // com.daaw.InterfaceC2026Qj0.a
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.daaw.LA0.b N(com.daaw.C9687xm r3, com.daaw.C6763nJ r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.daaw.Xs0 r1 = com.daaw.LA0.R     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                com.daaw.LA0 r3 = (com.daaw.LA0) r3     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
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
                com.daaw.LA0 r4 = (com.daaw.LA0) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.LA0.b.N(com.daaw.xm, com.daaw.nJ):com.daaw.LA0$b");
        }

        @Override // com.daaw.AbstractC5674jS.b
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public b j(LA0 la0) {
            if (la0 == LA0.V()) {
                return this;
            }
            if (la0.j0()) {
                E(la0.Z());
            }
            if (la0.k0()) {
                G(la0.a0());
            }
            if (!la0.H.isEmpty()) {
                if (this.H.isEmpty()) {
                    this.H = la0.H;
                    this.E &= -5;
                } else {
                    w();
                    this.H.addAll(la0.H);
                }
            }
            if (la0.l0()) {
                C(la0.e0());
            }
            if (la0.m0()) {
                H(la0.f0());
            }
            if (la0.h0()) {
                z(la0.X());
            }
            if (la0.i0()) {
                D(la0.Y());
            }
            if (!la0.M.isEmpty()) {
                if (this.M.isEmpty()) {
                    this.M = la0.M;
                    this.E &= -129;
                } else {
                    v();
                    this.M.addAll(la0.M);
                }
            }
            if (!la0.N.isEmpty()) {
                if (this.N.isEmpty()) {
                    this.N = la0.N;
                    this.E &= -257;
                } else {
                    x();
                    this.N.addAll(la0.N);
                }
            }
            o(la0);
            k(i().m(la0.D));
            return this;
        }

        public b C(KA0 ka0) {
            if ((this.E & 8) != 8 || this.I == KA0.b0()) {
                this.I = ka0;
            } else {
                this.I = KA0.C0(this.I).j(ka0).r();
            }
            this.E |= 8;
            return this;
        }

        public b D(int i) {
            this.E |= 64;
            this.L = i;
            return this;
        }

        public b E(int i) {
            this.E |= 1;
            this.F = i;
            return this;
        }

        public b G(int i) {
            this.E |= 2;
            this.G = i;
            return this;
        }

        public b H(int i) {
            this.E |= 16;
            this.J = i;
            return this;
        }

        @Override // com.daaw.InterfaceC2026Qj0.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public LA0 a() {
            LA0 la0R = r();
            if (la0R.e()) {
                return la0R;
            }
            throw S.a.h(la0R);
        }

        public LA0 r() {
            LA0 la0 = new LA0(this);
            int i = this.E;
            int i2 = (i & 1) != 1 ? 0 : 1;
            la0.F = this.F;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            la0.G = this.G;
            if ((this.E & 4) == 4) {
                this.H = DesugarCollections.unmodifiableList(this.H);
                this.E &= -5;
            }
            la0.H = this.H;
            if ((i & 8) == 8) {
                i2 |= 4;
            }
            la0.I = this.I;
            if ((i & 16) == 16) {
                i2 |= 8;
            }
            la0.J = this.J;
            if ((i & 32) == 32) {
                i2 |= 16;
            }
            la0.K = this.K;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            la0.L = this.L;
            if ((this.E & 128) == 128) {
                this.M = DesugarCollections.unmodifiableList(this.M);
                this.E &= -129;
            }
            la0.M = this.M;
            if ((this.E & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                this.N = DesugarCollections.unmodifiableList(this.N);
                this.E &= -257;
            }
            la0.N = this.N;
            la0.E = i2;
            return la0;
        }

        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return u().j(r());
        }

        public final void v() {
            if ((this.E & 128) != 128) {
                this.M = new ArrayList(this.M);
                this.E |= 128;
            }
        }

        public b z(KA0 ka0) {
            if ((this.E & 32) != 32 || this.K == KA0.b0()) {
                this.K = ka0;
            } else {
                this.K = KA0.C0(this.K).j(ka0).r();
            }
            this.E |= 32;
            return this;
        }

        private void y() {
        }
    }
}
