package com.daaw;

import com.daaw.AbstractC4629fi;
import com.daaw.AbstractC5674jS;
import com.daaw.C9803yA0;
import com.daaw.KA0;
import com.daaw.NA0;
import com.daaw.S;
import com.google.ads.AdSize;
import com.google.android.gms.ads.AdRequest;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes4.dex */
public final class CA0 extends AbstractC5674jS.d implements InterfaceC2130Rj0 {
    public static final CA0 W;
    public static InterfaceC2792Xs0 X = new a();
    public final AbstractC4629fi D;
    public int E;
    public int F;
    public int G;
    public int H;
    public KA0 I;
    public int J;
    public List K;
    public KA0 L;
    public int M;
    public List N;
    public List O;
    public int P;
    public List Q;
    public NA0 R;
    public List S;
    public C9803yA0 T;
    public byte U;
    public int V;

    public static class a extends Z {
        @Override // com.daaw.InterfaceC2792Xs0
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public CA0 c(C9687xm c9687xm, C6763nJ c6763nJ) {
            return new CA0(c9687xm, c6763nJ);
        }
    }

    static {
        CA0 ca0 = new CA0(true);
        W = ca0;
        ca0.E0();
    }

    private void E0() {
        this.F = 6;
        this.G = 6;
        this.H = 0;
        this.I = KA0.b0();
        this.J = 0;
        List list = Collections.EMPTY_LIST;
        this.K = list;
        this.L = KA0.b0();
        this.M = 0;
        this.N = list;
        this.O = list;
        this.Q = list;
        this.R = NA0.z();
        this.S = list;
        this.T = C9803yA0.x();
    }

    public static b F0() {
        return b.u();
    }

    public static b G0(CA0 ca0) {
        return F0().j(ca0);
    }

    public static CA0 I0(InputStream inputStream, C6763nJ c6763nJ) {
        return (CA0) X.b(inputStream, c6763nJ);
    }

    public static CA0 e0() {
        return W;
    }

    public boolean A0() {
        return (this.E & 64) == 64;
    }

    public boolean B0() {
        return (this.E & 8) == 8;
    }

    public boolean C0() {
        return (this.E & 16) == 16;
    }

    public boolean D0() {
        return (this.E & 128) == 128;
    }

    @Override // com.daaw.InterfaceC2026Qj0
    /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] */
    public b d() {
        return F0();
    }

    @Override // com.daaw.InterfaceC2026Qj0
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public b f() {
        return G0(this);
    }

    public KA0 Z(int i) {
        return (KA0) this.N.get(i);
    }

    public int a0() {
        return this.N.size();
    }

    public List b0() {
        return this.O;
    }

    @Override // com.daaw.InterfaceC2026Qj0
    public int c() {
        int i = this.V;
        if (i != -1) {
            return i;
        }
        int iO = (this.E & 2) == 2 ? C0343Am.o(1, this.G) : 0;
        if ((this.E & 4) == 4) {
            iO += C0343Am.o(2, this.H);
        }
        if ((this.E & 8) == 8) {
            iO += C0343Am.r(3, this.I);
        }
        for (int i2 = 0; i2 < this.K.size(); i2++) {
            iO += C0343Am.r(4, (InterfaceC2026Qj0) this.K.get(i2));
        }
        if ((this.E & 32) == 32) {
            iO += C0343Am.r(5, this.L);
        }
        for (int i3 = 0; i3 < this.Q.size(); i3++) {
            iO += C0343Am.r(6, (InterfaceC2026Qj0) this.Q.get(i3));
        }
        if ((this.E & 16) == 16) {
            iO += C0343Am.o(7, this.J);
        }
        if ((this.E & 64) == 64) {
            iO += C0343Am.o(8, this.M);
        }
        if ((this.E & 1) == 1) {
            iO += C0343Am.o(9, this.F);
        }
        for (int i4 = 0; i4 < this.N.size(); i4++) {
            iO += C0343Am.r(10, (InterfaceC2026Qj0) this.N.get(i4));
        }
        int iP = 0;
        for (int i5 = 0; i5 < this.O.size(); i5++) {
            iP += C0343Am.p(((Integer) this.O.get(i5)).intValue());
        }
        int iR = iO + iP;
        if (!b0().isEmpty()) {
            iR = iR + 1 + C0343Am.p(iP);
        }
        this.P = iP;
        if ((this.E & 128) == 128) {
            iR += C0343Am.r(30, this.R);
        }
        int iP2 = 0;
        for (int i6 = 0; i6 < this.S.size(); i6++) {
            iP2 += C0343Am.p(((Integer) this.S.get(i6)).intValue());
        }
        int size = iR + iP2 + (u0().size() * 2);
        if ((this.E & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            size += C0343Am.r(32, this.T);
        }
        int iW = size + w() + this.D.size();
        this.V = iW;
        return iW;
    }

    public List c0() {
        return this.N;
    }

    public C9803yA0 d0() {
        return this.T;
    }

    @Override // com.daaw.InterfaceC2130Rj0
    public final boolean e() {
        byte b2 = this.U;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (!x0()) {
            this.U = (byte) 0;
            return false;
        }
        if (B0() && !l0().e()) {
            this.U = (byte) 0;
            return false;
        }
        for (int i = 0; i < o0(); i++) {
            if (!n0(i).e()) {
                this.U = (byte) 0;
                return false;
            }
        }
        if (z0() && !j0().e()) {
            this.U = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < a0(); i2++) {
            if (!Z(i2).e()) {
                this.U = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < s0(); i3++) {
            if (!r0(i3).e()) {
                this.U = (byte) 0;
                return false;
            }
        }
        if (D0() && !q0().e()) {
            this.U = (byte) 0;
            return false;
        }
        if (v0() && !d0().e()) {
            this.U = (byte) 0;
            return false;
        }
        if (u()) {
            this.U = (byte) 1;
            return true;
        }
        this.U = (byte) 0;
        return false;
    }

    @Override // com.daaw.InterfaceC2130Rj0
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public CA0 b() {
        return W;
    }

    @Override // com.daaw.InterfaceC2026Qj0
    public void g(C0343Am c0343Am) throws IOException {
        c();
        AbstractC5674jS.d.a aVarB = B();
        if ((this.E & 2) == 2) {
            c0343Am.Z(1, this.G);
        }
        if ((this.E & 4) == 4) {
            c0343Am.Z(2, this.H);
        }
        if ((this.E & 8) == 8) {
            c0343Am.c0(3, this.I);
        }
        for (int i = 0; i < this.K.size(); i++) {
            c0343Am.c0(4, (InterfaceC2026Qj0) this.K.get(i));
        }
        if ((this.E & 32) == 32) {
            c0343Am.c0(5, this.L);
        }
        for (int i2 = 0; i2 < this.Q.size(); i2++) {
            c0343Am.c0(6, (InterfaceC2026Qj0) this.Q.get(i2));
        }
        if ((this.E & 16) == 16) {
            c0343Am.Z(7, this.J);
        }
        if ((this.E & 64) == 64) {
            c0343Am.Z(8, this.M);
        }
        if ((this.E & 1) == 1) {
            c0343Am.Z(9, this.F);
        }
        for (int i3 = 0; i3 < this.N.size(); i3++) {
            c0343Am.c0(10, (InterfaceC2026Qj0) this.N.get(i3));
        }
        if (b0().size() > 0) {
            c0343Am.n0(90);
            c0343Am.n0(this.P);
        }
        for (int i4 = 0; i4 < this.O.size(); i4++) {
            c0343Am.a0(((Integer) this.O.get(i4)).intValue());
        }
        if ((this.E & 128) == 128) {
            c0343Am.c0(30, this.R);
        }
        for (int i5 = 0; i5 < this.S.size(); i5++) {
            c0343Am.Z(31, ((Integer) this.S.get(i5)).intValue());
        }
        if ((this.E & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            c0343Am.c0(32, this.T);
        }
        aVarB.a(19000, c0343Am);
        c0343Am.h0(this.D);
    }

    public int g0() {
        return this.F;
    }

    public int h0() {
        return this.H;
    }

    public int i0() {
        return this.G;
    }

    public KA0 j0() {
        return this.L;
    }

    public int k0() {
        return this.M;
    }

    public KA0 l0() {
        return this.I;
    }

    public int m0() {
        return this.J;
    }

    public MA0 n0(int i) {
        return (MA0) this.K.get(i);
    }

    public int o0() {
        return this.K.size();
    }

    public List p0() {
        return this.K;
    }

    public NA0 q0() {
        return this.R;
    }

    public OA0 r0(int i) {
        return (OA0) this.Q.get(i);
    }

    public int s0() {
        return this.Q.size();
    }

    public List t0() {
        return this.Q;
    }

    public List u0() {
        return this.S;
    }

    public boolean v0() {
        return (this.E & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256;
    }

    public boolean w0() {
        return (this.E & 1) == 1;
    }

    public boolean x0() {
        return (this.E & 4) == 4;
    }

    public boolean y0() {
        return (this.E & 2) == 2;
    }

    public boolean z0() {
        return (this.E & 32) == 32;
    }

    public CA0(AbstractC5674jS.c cVar) {
        super(cVar);
        this.P = -1;
        this.U = (byte) -1;
        this.V = -1;
        this.D = cVar.i();
    }

    public CA0(boolean z) {
        this.P = -1;
        this.U = (byte) -1;
        this.V = -1;
        this.D = AbstractC4629fi.B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public CA0(C9687xm c9687xm, C6763nJ c6763nJ) {
        this.P = -1;
        this.U = (byte) -1;
        this.V = -1;
        E0();
        AbstractC4629fi.b bVarG = AbstractC4629fi.G();
        C0343Am c0343AmI = C0343Am.I(bVarG, 1);
        boolean z = false;
        int i = 0;
        while (true) {
            ?? R = 1024;
            if (!z) {
                try {
                    try {
                        int iJ = c9687xm.J();
                        switch (iJ) {
                            case 0:
                                z = true;
                                break;
                            case 8:
                                this.E |= 2;
                                this.G = c9687xm.r();
                                break;
                            case 16:
                                this.E |= 4;
                                this.H = c9687xm.r();
                                break;
                            case 26:
                                KA0.c cVarE0 = (this.E & 8) == 8 ? this.I.f() : null;
                                KA0 ka0 = (KA0) c9687xm.t(KA0.W, c6763nJ);
                                this.I = ka0;
                                if (cVarE0 != null) {
                                    cVarE0.j(ka0);
                                    this.I = cVarE0.r();
                                }
                                this.E |= 8;
                                break;
                            case 34:
                                if ((i & 32) != 32) {
                                    this.K = new ArrayList();
                                    i |= 32;
                                }
                                this.K.add(c9687xm.t(MA0.P, c6763nJ));
                                break;
                            case 42:
                                KA0.c cVarE02 = (this.E & 32) == 32 ? this.L.f() : null;
                                KA0 ka02 = (KA0) c9687xm.t(KA0.W, c6763nJ);
                                this.L = ka02;
                                if (cVarE02 != null) {
                                    cVarE02.j(ka02);
                                    this.L = cVarE02.r();
                                }
                                this.E |= 32;
                                break;
                            case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                                if ((i & 1024) != 1024) {
                                    this.Q = new ArrayList();
                                    i |= 1024;
                                }
                                this.Q.add(c9687xm.t(OA0.O, c6763nJ));
                                break;
                            case 56:
                                this.E |= 16;
                                this.J = c9687xm.r();
                                break;
                            case 64:
                                this.E |= 64;
                                this.M = c9687xm.r();
                                break;
                            case 72:
                                this.E |= 1;
                                this.F = c9687xm.r();
                                break;
                            case 82:
                                if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256) {
                                    this.N = new ArrayList();
                                    i |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                }
                                this.N.add(c9687xm.t(KA0.W, c6763nJ));
                                break;
                            case 88:
                                if ((i & AdRequest.MAX_CONTENT_URL_LENGTH) != 512) {
                                    this.O = new ArrayList();
                                    i |= AdRequest.MAX_CONTENT_URL_LENGTH;
                                }
                                this.O.add(Integer.valueOf(c9687xm.r()));
                                break;
                            case AdSize.LARGE_AD_HEIGHT /* 90 */:
                                int i2 = c9687xm.i(c9687xm.z());
                                if ((i & AdRequest.MAX_CONTENT_URL_LENGTH) != 512 && c9687xm.e() > 0) {
                                    this.O = new ArrayList();
                                    i |= AdRequest.MAX_CONTENT_URL_LENGTH;
                                }
                                while (c9687xm.e() > 0) {
                                    this.O.add(Integer.valueOf(c9687xm.r()));
                                }
                                c9687xm.h(i2);
                                break;
                            case 242:
                                NA0.b bVarJ = (this.E & 128) == 128 ? this.R.f() : null;
                                NA0 na0 = (NA0) c9687xm.t(NA0.J, c6763nJ);
                                this.R = na0;
                                if (bVarJ != null) {
                                    bVarJ.j(na0);
                                    this.R = bVarJ.n();
                                }
                                this.E |= 128;
                                break;
                            case 248:
                                if ((i & 4096) != 4096) {
                                    this.S = new ArrayList();
                                    i |= 4096;
                                }
                                this.S.add(Integer.valueOf(c9687xm.r()));
                                break;
                            case 250:
                                int i3 = c9687xm.i(c9687xm.z());
                                if ((i & 4096) != 4096 && c9687xm.e() > 0) {
                                    this.S = new ArrayList();
                                    i |= 4096;
                                }
                                while (c9687xm.e() > 0) {
                                    this.S.add(Integer.valueOf(c9687xm.r()));
                                }
                                c9687xm.h(i3);
                                break;
                            case 258:
                                C9803yA0.b bVarE = (this.E & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256 ? this.T.f() : null;
                                C9803yA0 c9803yA0 = (C9803yA0) c9687xm.t(C9803yA0.H, c6763nJ);
                                this.T = c9803yA0;
                                if (bVarE != null) {
                                    bVarE.j(c9803yA0);
                                    this.T = bVarE.n();
                                }
                                this.E |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                break;
                            default:
                                R = r(c9687xm, c0343AmI, c6763nJ, iJ);
                                if (R == 0) {
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
                    if ((i & 32) == 32) {
                        this.K = DesugarCollections.unmodifiableList(this.K);
                    }
                    if ((i & 1024) == R) {
                        this.Q = DesugarCollections.unmodifiableList(this.Q);
                    }
                    if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                        this.N = DesugarCollections.unmodifiableList(this.N);
                    }
                    if ((i & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                        this.O = DesugarCollections.unmodifiableList(this.O);
                    }
                    if ((i & 4096) == 4096) {
                        this.S = DesugarCollections.unmodifiableList(this.S);
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
                if ((i & 32) == 32) {
                    this.K = DesugarCollections.unmodifiableList(this.K);
                }
                if ((i & 1024) == 1024) {
                    this.Q = DesugarCollections.unmodifiableList(this.Q);
                }
                if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                    this.N = DesugarCollections.unmodifiableList(this.N);
                }
                if ((i & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                    this.O = DesugarCollections.unmodifiableList(this.O);
                }
                if ((i & 4096) == 4096) {
                    this.S = DesugarCollections.unmodifiableList(this.S);
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
        public int H;
        public int J;
        public List K;
        public KA0 L;
        public int M;
        public List N;
        public List O;
        public List P;
        public NA0 Q;
        public List R;
        public C9803yA0 S;
        public int F = 6;
        public int G = 6;
        public KA0 I = KA0.b0();

        public b() {
            List list = Collections.EMPTY_LIST;
            this.K = list;
            this.L = KA0.b0();
            this.N = list;
            this.O = list;
            this.P = list;
            this.Q = NA0.z();
            this.R = list;
            this.S = C9803yA0.x();
            A();
        }

        public static b u() {
            return new b();
        }

        private void v() {
            if ((this.E & AdRequest.MAX_CONTENT_URL_LENGTH) != 512) {
                this.O = new ArrayList(this.O);
                this.E |= AdRequest.MAX_CONTENT_URL_LENGTH;
            }
        }

        private void w() {
            if ((this.E & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256) {
                this.N = new ArrayList(this.N);
                this.E |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
        }

        private void x() {
            if ((this.E & 32) != 32) {
                this.K = new ArrayList(this.K);
                this.E |= 32;
            }
        }

        private void y() {
            if ((this.E & 1024) != 1024) {
                this.P = new ArrayList(this.P);
                this.E |= 1024;
            }
        }

        private void z() {
            if ((this.E & 4096) != 4096) {
                this.R = new ArrayList(this.R);
                this.E |= 4096;
            }
        }

        public b B(C9803yA0 c9803yA0) {
            if ((this.E & 8192) != 8192 || this.S == C9803yA0.x()) {
                this.S = c9803yA0;
            } else {
                this.S = C9803yA0.C(this.S).j(c9803yA0).n();
            }
            this.E |= 8192;
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // com.daaw.InterfaceC2026Qj0.a
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.daaw.CA0.b N(com.daaw.C9687xm r3, com.daaw.C6763nJ r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.daaw.Xs0 r1 = com.daaw.CA0.X     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                com.daaw.CA0 r3 = (com.daaw.CA0) r3     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
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
                com.daaw.CA0 r4 = (com.daaw.CA0) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.CA0.b.N(com.daaw.xm, com.daaw.nJ):com.daaw.CA0$b");
        }

        @Override // com.daaw.AbstractC5674jS.b
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public b j(CA0 ca0) {
            if (ca0 == CA0.e0()) {
                return this;
            }
            if (ca0.w0()) {
                J(ca0.g0());
            }
            if (ca0.y0()) {
                L(ca0.i0());
            }
            if (ca0.x0()) {
                K(ca0.h0());
            }
            if (ca0.B0()) {
                G(ca0.l0());
            }
            if (ca0.C0()) {
                O(ca0.m0());
            }
            if (!ca0.K.isEmpty()) {
                if (this.K.isEmpty()) {
                    this.K = ca0.K;
                    this.E &= -33;
                } else {
                    x();
                    this.K.addAll(ca0.K);
                }
            }
            if (ca0.z0()) {
                E(ca0.j0());
            }
            if (ca0.A0()) {
                M(ca0.k0());
            }
            if (!ca0.N.isEmpty()) {
                if (this.N.isEmpty()) {
                    this.N = ca0.N;
                    this.E &= -257;
                } else {
                    w();
                    this.N.addAll(ca0.N);
                }
            }
            if (!ca0.O.isEmpty()) {
                if (this.O.isEmpty()) {
                    this.O = ca0.O;
                    this.E &= -513;
                } else {
                    v();
                    this.O.addAll(ca0.O);
                }
            }
            if (!ca0.Q.isEmpty()) {
                if (this.P.isEmpty()) {
                    this.P = ca0.Q;
                    this.E &= -1025;
                } else {
                    y();
                    this.P.addAll(ca0.Q);
                }
            }
            if (ca0.D0()) {
                H(ca0.q0());
            }
            if (!ca0.S.isEmpty()) {
                if (this.R.isEmpty()) {
                    this.R = ca0.S;
                    this.E &= -4097;
                } else {
                    z();
                    this.R.addAll(ca0.S);
                }
            }
            if (ca0.v0()) {
                B(ca0.d0());
            }
            o(ca0);
            k(i().m(ca0.D));
            return this;
        }

        public b E(KA0 ka0) {
            if ((this.E & 64) != 64 || this.L == KA0.b0()) {
                this.L = ka0;
            } else {
                this.L = KA0.C0(this.L).j(ka0).r();
            }
            this.E |= 64;
            return this;
        }

        public b G(KA0 ka0) {
            if ((this.E & 8) != 8 || this.I == KA0.b0()) {
                this.I = ka0;
            } else {
                this.I = KA0.C0(this.I).j(ka0).r();
            }
            this.E |= 8;
            return this;
        }

        public b H(NA0 na0) {
            if ((this.E & 2048) != 2048 || this.Q == NA0.z()) {
                this.Q = na0;
            } else {
                this.Q = NA0.H(this.Q).j(na0).n();
            }
            this.E |= 2048;
            return this;
        }

        public b J(int i) {
            this.E |= 1;
            this.F = i;
            return this;
        }

        public b K(int i) {
            this.E |= 4;
            this.H = i;
            return this;
        }

        public b L(int i) {
            this.E |= 2;
            this.G = i;
            return this;
        }

        public b M(int i) {
            this.E |= 128;
            this.M = i;
            return this;
        }

        public b O(int i) {
            this.E |= 16;
            this.J = i;
            return this;
        }

        @Override // com.daaw.InterfaceC2026Qj0.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public CA0 a() {
            CA0 ca0R = r();
            if (ca0R.e()) {
                return ca0R;
            }
            throw S.a.h(ca0R);
        }

        public CA0 r() {
            CA0 ca0 = new CA0(this);
            int i = this.E;
            int i2 = (i & 1) != 1 ? 0 : 1;
            ca0.F = this.F;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            ca0.G = this.G;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            ca0.H = this.H;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            ca0.I = this.I;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            ca0.J = this.J;
            if ((this.E & 32) == 32) {
                this.K = DesugarCollections.unmodifiableList(this.K);
                this.E &= -33;
            }
            ca0.K = this.K;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            ca0.L = this.L;
            if ((i & 128) == 128) {
                i2 |= 64;
            }
            ca0.M = this.M;
            if ((this.E & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                this.N = DesugarCollections.unmodifiableList(this.N);
                this.E &= -257;
            }
            ca0.N = this.N;
            if ((this.E & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                this.O = DesugarCollections.unmodifiableList(this.O);
                this.E &= -513;
            }
            ca0.O = this.O;
            if ((this.E & 1024) == 1024) {
                this.P = DesugarCollections.unmodifiableList(this.P);
                this.E &= -1025;
            }
            ca0.Q = this.P;
            if ((i & 2048) == 2048) {
                i2 |= 128;
            }
            ca0.R = this.Q;
            if ((this.E & 4096) == 4096) {
                this.R = DesugarCollections.unmodifiableList(this.R);
                this.E &= -4097;
            }
            ca0.S = this.R;
            if ((i & 8192) == 8192) {
                i2 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
            ca0.T = this.S;
            ca0.E = i2;
            return ca0;
        }

        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return u().j(r());
        }

        private void A() {
        }
    }
}
