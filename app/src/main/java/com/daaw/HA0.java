package com.daaw;

import com.daaw.AbstractC4629fi;
import com.daaw.AbstractC5674jS;
import com.daaw.KA0;
import com.daaw.OA0;
import com.daaw.S;
import com.google.ads.AdSize;
import com.google.android.gms.ads.AdRequest;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes4.dex */
public final class HA0 extends AbstractC5674jS.d implements InterfaceC2130Rj0 {
    public static final HA0 W;
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
    public OA0 Q;
    public int R;
    public int S;
    public List T;
    public byte U;
    public int V;

    public static class a extends Z {
        @Override // com.daaw.InterfaceC2792Xs0
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public HA0 c(C9687xm c9687xm, C6763nJ c6763nJ) {
            return new HA0(c9687xm, c6763nJ);
        }
    }

    static {
        HA0 ha0 = new HA0(true);
        W = ha0;
        ha0.C0();
    }

    private void C0() {
        this.F = 518;
        this.G = 2054;
        this.H = 0;
        this.I = KA0.b0();
        this.J = 0;
        List list = Collections.EMPTY_LIST;
        this.K = list;
        this.L = KA0.b0();
        this.M = 0;
        this.N = list;
        this.O = list;
        this.Q = OA0.L();
        this.R = 0;
        this.S = 0;
        this.T = list;
    }

    public static b D0() {
        return b.u();
    }

    public static b E0(HA0 ha0) {
        return D0().j(ha0);
    }

    public static HA0 c0() {
        return W;
    }

    public boolean A0() {
        return (this.E & AdRequest.MAX_CONTENT_URL_LENGTH) == 512;
    }

    public boolean B0() {
        return (this.E & 128) == 128;
    }

    @Override // com.daaw.InterfaceC2026Qj0
    /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
    public b d() {
        return D0();
    }

    @Override // com.daaw.InterfaceC2026Qj0
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public b f() {
        return E0(this);
    }

    public KA0 Y(int i) {
        return (KA0) this.N.get(i);
    }

    public int Z() {
        return this.N.size();
    }

    public List a0() {
        return this.O;
    }

    public List b0() {
        return this.N;
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
        if ((this.E & 128) == 128) {
            iO += C0343Am.r(6, this.Q);
        }
        if ((this.E & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            iO += C0343Am.o(7, this.R);
        }
        if ((this.E & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
            iO += C0343Am.o(8, this.S);
        }
        if ((this.E & 16) == 16) {
            iO += C0343Am.o(9, this.J);
        }
        if ((this.E & 64) == 64) {
            iO += C0343Am.o(10, this.M);
        }
        if ((this.E & 1) == 1) {
            iO += C0343Am.o(11, this.F);
        }
        for (int i3 = 0; i3 < this.N.size(); i3++) {
            iO += C0343Am.r(12, (InterfaceC2026Qj0) this.N.get(i3));
        }
        int iP = 0;
        for (int i4 = 0; i4 < this.O.size(); i4++) {
            iP += C0343Am.p(((Integer) this.O.get(i4)).intValue());
        }
        int iP2 = iO + iP;
        if (!a0().isEmpty()) {
            iP2 = iP2 + 1 + C0343Am.p(iP);
        }
        this.P = iP;
        int iP3 = 0;
        for (int i5 = 0; i5 < this.T.size(); i5++) {
            iP3 += C0343Am.p(((Integer) this.T.get(i5)).intValue());
        }
        int size = iP2 + iP3 + (r0().size() * 2) + w() + this.D.size();
        this.V = size;
        return size;
    }

    @Override // com.daaw.InterfaceC2130Rj0
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public HA0 b() {
        return W;
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
        if (!u0()) {
            this.U = (byte) 0;
            return false;
        }
        if (y0() && !k0().e()) {
            this.U = (byte) 0;
            return false;
        }
        for (int i = 0; i < p0(); i++) {
            if (!o0(i).e()) {
                this.U = (byte) 0;
                return false;
            }
        }
        if (w0() && !i0().e()) {
            this.U = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < Z(); i2++) {
            if (!Y(i2).e()) {
                this.U = (byte) 0;
                return false;
            }
        }
        if (B0() && !n0().e()) {
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

    public int e0() {
        return this.F;
    }

    public int f0() {
        return this.R;
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
        if ((this.E & 128) == 128) {
            c0343Am.c0(6, this.Q);
        }
        if ((this.E & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            c0343Am.Z(7, this.R);
        }
        if ((this.E & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
            c0343Am.Z(8, this.S);
        }
        if ((this.E & 16) == 16) {
            c0343Am.Z(9, this.J);
        }
        if ((this.E & 64) == 64) {
            c0343Am.Z(10, this.M);
        }
        if ((this.E & 1) == 1) {
            c0343Am.Z(11, this.F);
        }
        for (int i2 = 0; i2 < this.N.size(); i2++) {
            c0343Am.c0(12, (InterfaceC2026Qj0) this.N.get(i2));
        }
        if (a0().size() > 0) {
            c0343Am.n0(106);
            c0343Am.n0(this.P);
        }
        for (int i3 = 0; i3 < this.O.size(); i3++) {
            c0343Am.a0(((Integer) this.O.get(i3)).intValue());
        }
        for (int i4 = 0; i4 < this.T.size(); i4++) {
            c0343Am.Z(31, ((Integer) this.T.get(i4)).intValue());
        }
        aVarB.a(19000, c0343Am);
        c0343Am.h0(this.D);
    }

    public int g0() {
        return this.H;
    }

    public int h0() {
        return this.G;
    }

    public KA0 i0() {
        return this.L;
    }

    public int j0() {
        return this.M;
    }

    public KA0 k0() {
        return this.I;
    }

    public int l0() {
        return this.J;
    }

    public int m0() {
        return this.S;
    }

    public OA0 n0() {
        return this.Q;
    }

    public MA0 o0(int i) {
        return (MA0) this.K.get(i);
    }

    public int p0() {
        return this.K.size();
    }

    public List q0() {
        return this.K;
    }

    public List r0() {
        return this.T;
    }

    public boolean s0() {
        return (this.E & 1) == 1;
    }

    public boolean t0() {
        return (this.E & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256;
    }

    public boolean u0() {
        return (this.E & 4) == 4;
    }

    public boolean v0() {
        return (this.E & 2) == 2;
    }

    public boolean w0() {
        return (this.E & 32) == 32;
    }

    public boolean x0() {
        return (this.E & 64) == 64;
    }

    public boolean y0() {
        return (this.E & 8) == 8;
    }

    public boolean z0() {
        return (this.E & 16) == 16;
    }

    public HA0(AbstractC5674jS.c cVar) {
        super(cVar);
        this.P = -1;
        this.U = (byte) -1;
        this.V = -1;
        this.D = cVar.i();
    }

    public HA0(boolean z) {
        this.P = -1;
        this.U = (byte) -1;
        this.V = -1;
        this.D = AbstractC4629fi.B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public HA0(C9687xm c9687xm, C6763nJ c6763nJ) {
        this.P = -1;
        this.U = (byte) -1;
        this.V = -1;
        C0();
        AbstractC4629fi.b bVarG = AbstractC4629fi.G();
        C0343Am c0343AmI = C0343Am.I(bVarG, 1);
        boolean z = false;
        int i = 0;
        while (true) {
            ?? R = 256;
            if (!z) {
                try {
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
                                    OA0.b bVarE0 = (this.E & 128) == 128 ? this.Q.f() : null;
                                    OA0 oa0 = (OA0) c9687xm.t(OA0.O, c6763nJ);
                                    this.Q = oa0;
                                    if (bVarE0 != null) {
                                        bVarE0.j(oa0);
                                        this.Q = bVarE0.r();
                                    }
                                    this.E |= 128;
                                    break;
                                case 56:
                                    this.E |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                    this.R = c9687xm.r();
                                    break;
                                case 64:
                                    this.E |= AdRequest.MAX_CONTENT_URL_LENGTH;
                                    this.S = c9687xm.r();
                                    break;
                                case 72:
                                    this.E |= 16;
                                    this.J = c9687xm.r();
                                    break;
                                case 80:
                                    this.E |= 64;
                                    this.M = c9687xm.r();
                                    break;
                                case 88:
                                    this.E |= 1;
                                    this.F = c9687xm.r();
                                    break;
                                case 98:
                                    if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256) {
                                        this.N = new ArrayList();
                                        i |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                    }
                                    this.N.add(c9687xm.t(KA0.W, c6763nJ));
                                    break;
                                case 104:
                                    if ((i & AdRequest.MAX_CONTENT_URL_LENGTH) != 512) {
                                        this.O = new ArrayList();
                                        i |= AdRequest.MAX_CONTENT_URL_LENGTH;
                                    }
                                    this.O.add(Integer.valueOf(c9687xm.r()));
                                    break;
                                case 106:
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
                                case 248:
                                    if ((i & 8192) != 8192) {
                                        this.T = new ArrayList();
                                        i |= 8192;
                                    }
                                    this.T.add(Integer.valueOf(c9687xm.r()));
                                    break;
                                case 250:
                                    int i3 = c9687xm.i(c9687xm.z());
                                    if ((i & 8192) != 8192 && c9687xm.e() > 0) {
                                        this.T = new ArrayList();
                                        i |= 8192;
                                    }
                                    while (c9687xm.e() > 0) {
                                        this.T.add(Integer.valueOf(c9687xm.r()));
                                    }
                                    c9687xm.h(i3);
                                    break;
                                default:
                                    R = r(c9687xm, c0343AmI, c6763nJ, iJ);
                                    if (R == 0) {
                                        z = true;
                                    }
                                    break;
                            }
                        } catch (IOException e) {
                            throw new Q10(e.getMessage()).i(this);
                        }
                    } catch (Q10 e2) {
                        throw e2.i(this);
                    }
                } catch (Throwable th) {
                    if ((i & 32) == 32) {
                        this.K = DesugarCollections.unmodifiableList(this.K);
                    }
                    if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == R) {
                        this.N = DesugarCollections.unmodifiableList(this.N);
                    }
                    if ((i & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                        this.O = DesugarCollections.unmodifiableList(this.O);
                    }
                    if ((i & 8192) == 8192) {
                        this.T = DesugarCollections.unmodifiableList(this.T);
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
                if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                    this.N = DesugarCollections.unmodifiableList(this.N);
                }
                if ((i & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                    this.O = DesugarCollections.unmodifiableList(this.O);
                }
                if ((i & 8192) == 8192) {
                    this.T = DesugarCollections.unmodifiableList(this.T);
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
        public OA0 P;
        public int Q;
        public int R;
        public List S;
        public int F = 518;
        public int G = 2054;
        public KA0 I = KA0.b0();

        public b() {
            List list = Collections.EMPTY_LIST;
            this.K = list;
            this.L = KA0.b0();
            this.N = list;
            this.O = list;
            this.P = OA0.L();
            this.S = list;
            z();
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
            if ((this.E & 8192) != 8192) {
                this.S = new ArrayList(this.S);
                this.E |= 8192;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // com.daaw.InterfaceC2026Qj0.a
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.daaw.HA0.b N(com.daaw.C9687xm r3, com.daaw.C6763nJ r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.daaw.Xs0 r1 = com.daaw.HA0.X     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                com.daaw.HA0 r3 = (com.daaw.HA0) r3     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
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
                com.daaw.HA0 r4 = (com.daaw.HA0) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.HA0.b.N(com.daaw.xm, com.daaw.nJ):com.daaw.HA0$b");
        }

        @Override // com.daaw.AbstractC5674jS.b
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public b j(HA0 ha0) {
            if (ha0 == HA0.c0()) {
                return this;
            }
            if (ha0.s0()) {
                G(ha0.e0());
            }
            if (ha0.v0()) {
                K(ha0.h0());
            }
            if (ha0.u0()) {
                J(ha0.g0());
            }
            if (ha0.y0()) {
                D(ha0.k0());
            }
            if (ha0.z0()) {
                M(ha0.l0());
            }
            if (!ha0.K.isEmpty()) {
                if (this.K.isEmpty()) {
                    this.K = ha0.K;
                    this.E &= -33;
                } else {
                    x();
                    this.K.addAll(ha0.K);
                }
            }
            if (ha0.w0()) {
                C(ha0.i0());
            }
            if (ha0.x0()) {
                L(ha0.j0());
            }
            if (!ha0.N.isEmpty()) {
                if (this.N.isEmpty()) {
                    this.N = ha0.N;
                    this.E &= -257;
                } else {
                    w();
                    this.N.addAll(ha0.N);
                }
            }
            if (!ha0.O.isEmpty()) {
                if (this.O.isEmpty()) {
                    this.O = ha0.O;
                    this.E &= -513;
                } else {
                    v();
                    this.O.addAll(ha0.O);
                }
            }
            if (ha0.B0()) {
                E(ha0.n0());
            }
            if (ha0.t0()) {
                H(ha0.f0());
            }
            if (ha0.A0()) {
                O(ha0.m0());
            }
            if (!ha0.T.isEmpty()) {
                if (this.S.isEmpty()) {
                    this.S = ha0.T;
                    this.E &= -8193;
                } else {
                    y();
                    this.S.addAll(ha0.T);
                }
            }
            o(ha0);
            k(i().m(ha0.D));
            return this;
        }

        public b C(KA0 ka0) {
            if ((this.E & 64) != 64 || this.L == KA0.b0()) {
                this.L = ka0;
            } else {
                this.L = KA0.C0(this.L).j(ka0).r();
            }
            this.E |= 64;
            return this;
        }

        public b D(KA0 ka0) {
            if ((this.E & 8) != 8 || this.I == KA0.b0()) {
                this.I = ka0;
            } else {
                this.I = KA0.C0(this.I).j(ka0).r();
            }
            this.E |= 8;
            return this;
        }

        public b E(OA0 oa0) {
            if ((this.E & 1024) != 1024 || this.P == OA0.L()) {
                this.P = oa0;
            } else {
                this.P = OA0.c0(this.P).j(oa0).r();
            }
            this.E |= 1024;
            return this;
        }

        public b G(int i) {
            this.E |= 1;
            this.F = i;
            return this;
        }

        public b H(int i) {
            this.E |= 2048;
            this.Q = i;
            return this;
        }

        public b J(int i) {
            this.E |= 4;
            this.H = i;
            return this;
        }

        public b K(int i) {
            this.E |= 2;
            this.G = i;
            return this;
        }

        public b L(int i) {
            this.E |= 128;
            this.M = i;
            return this;
        }

        public b M(int i) {
            this.E |= 16;
            this.J = i;
            return this;
        }

        public b O(int i) {
            this.E |= 4096;
            this.R = i;
            return this;
        }

        @Override // com.daaw.InterfaceC2026Qj0.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public HA0 a() {
            HA0 ha0R = r();
            if (ha0R.e()) {
                return ha0R;
            }
            throw S.a.h(ha0R);
        }

        public HA0 r() {
            HA0 ha0 = new HA0(this);
            int i = this.E;
            int i2 = (i & 1) != 1 ? 0 : 1;
            ha0.F = this.F;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            ha0.G = this.G;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            ha0.H = this.H;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            ha0.I = this.I;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            ha0.J = this.J;
            if ((this.E & 32) == 32) {
                this.K = DesugarCollections.unmodifiableList(this.K);
                this.E &= -33;
            }
            ha0.K = this.K;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            ha0.L = this.L;
            if ((i & 128) == 128) {
                i2 |= 64;
            }
            ha0.M = this.M;
            if ((this.E & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                this.N = DesugarCollections.unmodifiableList(this.N);
                this.E &= -257;
            }
            ha0.N = this.N;
            if ((this.E & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                this.O = DesugarCollections.unmodifiableList(this.O);
                this.E &= -513;
            }
            ha0.O = this.O;
            if ((i & 1024) == 1024) {
                i2 |= 128;
            }
            ha0.Q = this.P;
            if ((i & 2048) == 2048) {
                i2 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
            ha0.R = this.Q;
            if ((i & 4096) == 4096) {
                i2 |= AdRequest.MAX_CONTENT_URL_LENGTH;
            }
            ha0.S = this.R;
            if ((this.E & 8192) == 8192) {
                this.S = DesugarCollections.unmodifiableList(this.S);
                this.E &= -8193;
            }
            ha0.T = this.S;
            ha0.E = i2;
            return ha0;
        }

        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return u().j(r());
        }

        private void z() {
        }
    }
}
