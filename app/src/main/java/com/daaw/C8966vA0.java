package com.daaw;

import com.daaw.AbstractC3595c10;
import com.daaw.AbstractC4629fi;
import com.daaw.AbstractC5674jS;
import com.daaw.S;
import com.google.android.gms.ads.AdRequest;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: com.daaw.vA0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C8966vA0 extends AbstractC5674jS implements InterfaceC2130Rj0 {
    public static final C8966vA0 I;
    public static InterfaceC2792Xs0 J = new a();
    public final AbstractC4629fi C;
    public int D;
    public int E;
    public List F;
    public byte G;
    public int H;

    /* JADX INFO: renamed from: com.daaw.vA0$a */
    public static class a extends Z {
        @Override // com.daaw.InterfaceC2792Xs0
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public C8966vA0 c(C9687xm c9687xm, C6763nJ c6763nJ) {
            return new C8966vA0(c9687xm, c6763nJ);
        }
    }

    /* JADX INFO: renamed from: com.daaw.vA0$b */
    public static final class b extends AbstractC5674jS implements InterfaceC2130Rj0 {
        public static final b I;
        public static InterfaceC2792Xs0 J = new a();
        public final AbstractC4629fi C;
        public int D;
        public int E;
        public c F;
        public byte G;
        public int H;

        /* JADX INFO: renamed from: com.daaw.vA0$b$a */
        public static class a extends Z {
            @Override // com.daaw.InterfaceC2792Xs0
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public b c(C9687xm c9687xm, C6763nJ c6763nJ) {
                return new b(c9687xm, c6763nJ);
            }
        }

        static {
            b bVar = new b(true);
            I = bVar;
            bVar.D();
        }

        private void D() {
            this.E = 0;
            this.F = c.P();
        }

        public static C0242b E() {
            return C0242b.p();
        }

        public static C0242b F(b bVar) {
            return E().j(bVar);
        }

        public static b y() {
            return I;
        }

        public c A() {
            return this.F;
        }

        public boolean B() {
            return (this.D & 1) == 1;
        }

        public boolean C() {
            return (this.D & 2) == 2;
        }

        @Override // com.daaw.InterfaceC2026Qj0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public C0242b d() {
            return E();
        }

        @Override // com.daaw.InterfaceC2026Qj0
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public C0242b f() {
            return F(this);
        }

        @Override // com.daaw.InterfaceC2026Qj0
        public int c() {
            int i = this.H;
            if (i != -1) {
                return i;
            }
            int iO = (this.D & 1) == 1 ? C0343Am.o(1, this.E) : 0;
            if ((this.D & 2) == 2) {
                iO += C0343Am.r(2, this.F);
            }
            int size = iO + this.C.size();
            this.H = size;
            return size;
        }

        @Override // com.daaw.InterfaceC2130Rj0
        public final boolean e() {
            byte b = this.G;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!B()) {
                this.G = (byte) 0;
                return false;
            }
            if (!C()) {
                this.G = (byte) 0;
                return false;
            }
            if (A().e()) {
                this.G = (byte) 1;
                return true;
            }
            this.G = (byte) 0;
            return false;
        }

        @Override // com.daaw.InterfaceC2026Qj0
        public void g(C0343Am c0343Am) throws IOException {
            c();
            if ((this.D & 1) == 1) {
                c0343Am.Z(1, this.E);
            }
            if ((this.D & 2) == 2) {
                c0343Am.c0(2, this.F);
            }
            c0343Am.h0(this.C);
        }

        public int z() {
            return this.E;
        }

        /* JADX INFO: renamed from: com.daaw.vA0$b$c */
        public static final class c extends AbstractC5674jS implements InterfaceC2130Rj0 {
            public static final c R;
            public static InterfaceC2792Xs0 S = new a();
            public final AbstractC4629fi C;
            public int D;
            public EnumC0244c E;
            public long F;
            public float G;
            public double H;
            public int I;
            public int J;
            public int K;
            public C8966vA0 L;
            public List M;
            public int N;
            public int O;
            public byte P;
            public int Q;

            /* JADX INFO: renamed from: com.daaw.vA0$b$c$a */
            public static class a extends Z {
                @Override // com.daaw.InterfaceC2792Xs0
                /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
                public c c(C9687xm c9687xm, C6763nJ c6763nJ) {
                    return new c(c9687xm, c6763nJ);
                }
            }

            /* JADX INFO: renamed from: com.daaw.vA0$b$c$c, reason: collision with other inner class name */
            public enum EnumC0244c implements AbstractC3595c10.a {
                BYTE(0, 0),
                CHAR(1, 1),
                SHORT(2, 2),
                INT(3, 3),
                LONG(4, 4),
                FLOAT(5, 5),
                DOUBLE(6, 6),
                BOOLEAN(7, 7),
                STRING(8, 8),
                CLASS(9, 9),
                ENUM(10, 10),
                ANNOTATION(11, 11),
                ARRAY(12, 12);

                public static AbstractC3595c10.b P = new a();
                public final int B;

                /* JADX INFO: renamed from: com.daaw.vA0$b$c$c$a */
                public static class a implements AbstractC3595c10.b {
                    @Override // com.daaw.AbstractC3595c10.b
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public EnumC0244c a(int i) {
                        return EnumC0244c.a(i);
                    }
                }

                EnumC0244c(int i, int i2) {
                    this.B = i2;
                }

                public static EnumC0244c a(int i) {
                    switch (i) {
                        case 0:
                            return BYTE;
                        case 1:
                            return CHAR;
                        case 2:
                            return SHORT;
                        case 3:
                            return INT;
                        case 4:
                            return LONG;
                        case 5:
                            return FLOAT;
                        case 6:
                            return DOUBLE;
                        case 7:
                            return BOOLEAN;
                        case 8:
                            return STRING;
                        case 9:
                            return CLASS;
                        case 10:
                            return ENUM;
                        case 11:
                            return ANNOTATION;
                        case 12:
                            return ARRAY;
                        default:
                            return null;
                    }
                }

                @Override // com.daaw.AbstractC3595c10.a
                public final int b() {
                    return this.B;
                }
            }

            static {
                c cVar = new c(true);
                R = cVar;
                cVar.h0();
            }

            public static c P() {
                return R;
            }

            public static C0243b i0() {
                return C0243b.p();
            }

            public static C0243b j0(c cVar) {
                return i0().j(cVar);
            }

            public C8966vA0 I() {
                return this.L;
            }

            public int J() {
                return this.N;
            }

            public c K(int i) {
                return (c) this.M.get(i);
            }

            public int L() {
                return this.M.size();
            }

            public List M() {
                return this.M;
            }

            public int O() {
                return this.J;
            }

            public double Q() {
                return this.H;
            }

            public int R() {
                return this.K;
            }

            public int S() {
                return this.O;
            }

            public float T() {
                return this.G;
            }

            public long U() {
                return this.F;
            }

            public int V() {
                return this.I;
            }

            public EnumC0244c W() {
                return this.E;
            }

            public boolean X() {
                return (this.D & 128) == 128;
            }

            public boolean Y() {
                return (this.D & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256;
            }

            public boolean Z() {
                return (this.D & 32) == 32;
            }

            public boolean a0() {
                return (this.D & 8) == 8;
            }

            public boolean b0() {
                return (this.D & 64) == 64;
            }

            @Override // com.daaw.InterfaceC2026Qj0
            public int c() {
                int i = this.Q;
                if (i != -1) {
                    return i;
                }
                int iH = (this.D & 1) == 1 ? C0343Am.h(1, this.E.b()) : 0;
                if ((this.D & 2) == 2) {
                    iH += C0343Am.z(2, this.F);
                }
                if ((this.D & 4) == 4) {
                    iH += C0343Am.l(3, this.G);
                }
                if ((this.D & 8) == 8) {
                    iH += C0343Am.f(4, this.H);
                }
                if ((this.D & 16) == 16) {
                    iH += C0343Am.o(5, this.I);
                }
                if ((this.D & 32) == 32) {
                    iH += C0343Am.o(6, this.J);
                }
                if ((this.D & 64) == 64) {
                    iH += C0343Am.o(7, this.K);
                }
                if ((this.D & 128) == 128) {
                    iH += C0343Am.r(8, this.L);
                }
                for (int i2 = 0; i2 < this.M.size(); i2++) {
                    iH += C0343Am.r(9, (InterfaceC2026Qj0) this.M.get(i2));
                }
                if ((this.D & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                    iH += C0343Am.o(10, this.O);
                }
                if ((this.D & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                    iH += C0343Am.o(11, this.N);
                }
                int size = iH + this.C.size();
                this.Q = size;
                return size;
            }

            public boolean c0() {
                return (this.D & AdRequest.MAX_CONTENT_URL_LENGTH) == 512;
            }

            public boolean d0() {
                return (this.D & 4) == 4;
            }

            @Override // com.daaw.InterfaceC2130Rj0
            public final boolean e() {
                byte b = this.P;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                if (X() && !I().e()) {
                    this.P = (byte) 0;
                    return false;
                }
                for (int i = 0; i < L(); i++) {
                    if (!K(i).e()) {
                        this.P = (byte) 0;
                        return false;
                    }
                }
                this.P = (byte) 1;
                return true;
            }

            public boolean e0() {
                return (this.D & 2) == 2;
            }

            public boolean f0() {
                return (this.D & 16) == 16;
            }

            @Override // com.daaw.InterfaceC2026Qj0
            public void g(C0343Am c0343Am) throws IOException {
                c();
                if ((this.D & 1) == 1) {
                    c0343Am.R(1, this.E.b());
                }
                if ((this.D & 2) == 2) {
                    c0343Am.s0(2, this.F);
                }
                if ((this.D & 4) == 4) {
                    c0343Am.V(3, this.G);
                }
                if ((this.D & 8) == 8) {
                    c0343Am.P(4, this.H);
                }
                if ((this.D & 16) == 16) {
                    c0343Am.Z(5, this.I);
                }
                if ((this.D & 32) == 32) {
                    c0343Am.Z(6, this.J);
                }
                if ((this.D & 64) == 64) {
                    c0343Am.Z(7, this.K);
                }
                if ((this.D & 128) == 128) {
                    c0343Am.c0(8, this.L);
                }
                for (int i = 0; i < this.M.size(); i++) {
                    c0343Am.c0(9, (InterfaceC2026Qj0) this.M.get(i));
                }
                if ((this.D & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                    c0343Am.Z(10, this.O);
                }
                if ((this.D & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                    c0343Am.Z(11, this.N);
                }
                c0343Am.h0(this.C);
            }

            public boolean g0() {
                return (this.D & 1) == 1;
            }

            public final void h0() {
                this.E = EnumC0244c.BYTE;
                this.F = 0L;
                this.G = 0.0f;
                this.H = 0.0d;
                this.I = 0;
                this.J = 0;
                this.K = 0;
                this.L = C8966vA0.C();
                this.M = Collections.EMPTY_LIST;
                this.N = 0;
                this.O = 0;
            }

            @Override // com.daaw.InterfaceC2026Qj0
            /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
            public C0243b d() {
                return i0();
            }

            @Override // com.daaw.InterfaceC2026Qj0
            /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
            public C0243b f() {
                return j0(this);
            }

            public c(AbstractC5674jS.b bVar) {
                super(bVar);
                this.P = (byte) -1;
                this.Q = -1;
                this.C = bVar.i();
            }

            public c(boolean z) {
                this.P = (byte) -1;
                this.Q = -1;
                this.C = AbstractC4629fi.B;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v0 */
            /* JADX WARN: Type inference failed for: r5v1 */
            /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
            public c(C9687xm c9687xm, C6763nJ c6763nJ) {
                this.P = (byte) -1;
                this.Q = -1;
                h0();
                AbstractC4629fi.b bVarG = AbstractC4629fi.G();
                C0343Am c0343AmI = C0343Am.I(bVarG, 1);
                boolean z = false;
                char c = 0;
                while (true) {
                    ?? R2 = 256;
                    if (!z) {
                        try {
                            try {
                                int iJ = c9687xm.J();
                                switch (iJ) {
                                    case 0:
                                        z = true;
                                        break;
                                    case 8:
                                        int iM = c9687xm.m();
                                        EnumC0244c enumC0244cA = EnumC0244c.a(iM);
                                        if (enumC0244cA == null) {
                                            c0343AmI.n0(iJ);
                                            c0343AmI.n0(iM);
                                        } else {
                                            this.D |= 1;
                                            this.E = enumC0244cA;
                                        }
                                        break;
                                    case 16:
                                        this.D |= 2;
                                        this.F = c9687xm.G();
                                        break;
                                    case 29:
                                        this.D |= 4;
                                        this.G = c9687xm.p();
                                        break;
                                    case 33:
                                        this.D |= 8;
                                        this.H = c9687xm.l();
                                        break;
                                    case 40:
                                        this.D |= 16;
                                        this.I = c9687xm.r();
                                        break;
                                    case 48:
                                        this.D |= 32;
                                        this.J = c9687xm.r();
                                        break;
                                    case 56:
                                        this.D |= 64;
                                        this.K = c9687xm.r();
                                        break;
                                    case 66:
                                        c cVarF = (this.D & 128) == 128 ? this.L.f() : null;
                                        C8966vA0 c8966vA0 = (C8966vA0) c9687xm.t(C8966vA0.J, c6763nJ);
                                        this.L = c8966vA0;
                                        if (cVarF != null) {
                                            cVarF.j(c8966vA0);
                                            this.L = cVarF.n();
                                        }
                                        this.D |= 128;
                                        break;
                                    case 74:
                                        if ((c & 256) != 256) {
                                            this.M = new ArrayList();
                                            c = 256;
                                        }
                                        this.M.add(c9687xm.t(S, c6763nJ));
                                        break;
                                    case 80:
                                        this.D |= AdRequest.MAX_CONTENT_URL_LENGTH;
                                        this.O = c9687xm.r();
                                        break;
                                    case 88:
                                        this.D |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                        this.N = c9687xm.r();
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
                            if ((c & 256) == R2) {
                                this.M = DesugarCollections.unmodifiableList(this.M);
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
                    } else {
                        if ((c & 256) == 256) {
                            this.M = DesugarCollections.unmodifiableList(this.M);
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
                        return;
                    }
                }
            }

            /* JADX INFO: renamed from: com.daaw.vA0$b$c$b, reason: collision with other inner class name */
            public static final class C0243b extends AbstractC5674jS.b implements InterfaceC2130Rj0 {
                public int C;
                public long E;
                public float F;
                public double G;
                public int H;
                public int I;
                public int J;
                public int M;
                public int N;
                public EnumC0244c D = EnumC0244c.BYTE;
                public C8966vA0 K = C8966vA0.C();
                public List L = Collections.EMPTY_LIST;

                public C0243b() {
                    r();
                }

                public static C0243b p() {
                    return new C0243b();
                }

                public C0243b A(int i) {
                    this.C |= 1024;
                    this.N = i;
                    return this;
                }

                public C0243b B(float f) {
                    this.C |= 4;
                    this.F = f;
                    return this;
                }

                public C0243b C(long j) {
                    this.C |= 2;
                    this.E = j;
                    return this;
                }

                public C0243b D(int i) {
                    this.C |= 16;
                    this.H = i;
                    return this;
                }

                public C0243b E(EnumC0244c enumC0244c) {
                    enumC0244c.getClass();
                    this.C |= 1;
                    this.D = enumC0244c;
                    return this;
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
                    if ((i & 8) == 8) {
                        i2 |= 8;
                    }
                    cVar.H = this.G;
                    if ((i & 16) == 16) {
                        i2 |= 16;
                    }
                    cVar.I = this.H;
                    if ((i & 32) == 32) {
                        i2 |= 32;
                    }
                    cVar.J = this.I;
                    if ((i & 64) == 64) {
                        i2 |= 64;
                    }
                    cVar.K = this.J;
                    if ((i & 128) == 128) {
                        i2 |= 128;
                    }
                    cVar.L = this.K;
                    if ((this.C & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                        this.L = DesugarCollections.unmodifiableList(this.L);
                        this.C &= -257;
                    }
                    cVar.M = this.L;
                    if ((i & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                        i2 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    }
                    cVar.N = this.M;
                    if ((i & 1024) == 1024) {
                        i2 |= AdRequest.MAX_CONTENT_URL_LENGTH;
                    }
                    cVar.O = this.N;
                    cVar.D = i2;
                    return cVar;
                }

                /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
                public C0243b clone() {
                    return p().j(n());
                }

                public final void q() {
                    if ((this.C & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256) {
                        this.L = new ArrayList(this.L);
                        this.C |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    }
                }

                public C0243b t(C8966vA0 c8966vA0) {
                    if ((this.C & 128) != 128 || this.K == C8966vA0.C()) {
                        this.K = c8966vA0;
                    } else {
                        this.K = C8966vA0.H(this.K).j(c8966vA0).n();
                    }
                    this.C |= 128;
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
                @Override // com.daaw.InterfaceC2026Qj0.a
                /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public com.daaw.C8966vA0.b.c.C0243b N(com.daaw.C9687xm r3, com.daaw.C6763nJ r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.daaw.Xs0 r1 = com.daaw.C8966vA0.b.c.S     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                        java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                        com.daaw.vA0$b$c r3 = (com.daaw.C8966vA0.b.c) r3     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
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
                        com.daaw.vA0$b$c r4 = (com.daaw.C8966vA0.b.c) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: com.daaw.C8966vA0.b.c.C0243b.N(com.daaw.xm, com.daaw.nJ):com.daaw.vA0$b$c$b");
                }

                @Override // com.daaw.AbstractC5674jS.b
                /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
                public C0243b j(c cVar) {
                    if (cVar == c.P()) {
                        return this;
                    }
                    if (cVar.g0()) {
                        E(cVar.W());
                    }
                    if (cVar.e0()) {
                        C(cVar.U());
                    }
                    if (cVar.d0()) {
                        B(cVar.T());
                    }
                    if (cVar.a0()) {
                        y(cVar.Q());
                    }
                    if (cVar.f0()) {
                        D(cVar.V());
                    }
                    if (cVar.Z()) {
                        x(cVar.O());
                    }
                    if (cVar.b0()) {
                        z(cVar.R());
                    }
                    if (cVar.X()) {
                        t(cVar.I());
                    }
                    if (!cVar.M.isEmpty()) {
                        if (this.L.isEmpty()) {
                            this.L = cVar.M;
                            this.C &= -257;
                        } else {
                            q();
                            this.L.addAll(cVar.M);
                        }
                    }
                    if (cVar.Y()) {
                        w(cVar.J());
                    }
                    if (cVar.c0()) {
                        A(cVar.S());
                    }
                    k(i().m(cVar.C));
                    return this;
                }

                public C0243b w(int i) {
                    this.C |= AdRequest.MAX_CONTENT_URL_LENGTH;
                    this.M = i;
                    return this;
                }

                public C0243b x(int i) {
                    this.C |= 32;
                    this.I = i;
                    return this;
                }

                public C0243b y(double d) {
                    this.C |= 8;
                    this.G = d;
                    return this;
                }

                public C0243b z(int i) {
                    this.C |= 64;
                    this.J = i;
                    return this;
                }

                private void r() {
                }
            }
        }

        public b(AbstractC5674jS.b bVar) {
            super(bVar);
            this.G = (byte) -1;
            this.H = -1;
            this.C = bVar.i();
        }

        public b(boolean z) {
            this.G = (byte) -1;
            this.H = -1;
            this.C = AbstractC4629fi.B;
        }

        public b(C9687xm c9687xm, C6763nJ c6763nJ) {
            this.G = (byte) -1;
            this.H = -1;
            D();
            AbstractC4629fi.b bVarG = AbstractC4629fi.G();
            C0343Am c0343AmI = C0343Am.I(bVarG, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iJ = c9687xm.J();
                        if (iJ != 0) {
                            if (iJ == 8) {
                                this.D |= 1;
                                this.E = c9687xm.r();
                            } else if (iJ != 18) {
                                if (!r(c9687xm, c0343AmI, c6763nJ, iJ)) {
                                }
                            } else {
                                c.C0243b c0243bF = (this.D & 2) == 2 ? this.F.f() : null;
                                c cVar = (c) c9687xm.t(c.S, c6763nJ);
                                this.F = cVar;
                                if (c0243bF != null) {
                                    c0243bF.j(cVar);
                                    this.F = c0243bF.n();
                                }
                                this.D |= 2;
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

        /* JADX INFO: renamed from: com.daaw.vA0$b$b, reason: collision with other inner class name */
        public static final class C0242b extends AbstractC5674jS.b implements InterfaceC2130Rj0 {
            public int C;
            public int D;
            public c E = c.P();

            public C0242b() {
                q();
            }

            public static C0242b p() {
                return new C0242b();
            }

            @Override // com.daaw.InterfaceC2026Qj0.a
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public b a() {
                b bVarN = n();
                if (bVarN.e()) {
                    return bVarN;
                }
                throw S.a.h(bVarN);
            }

            public b n() {
                b bVar = new b(this);
                int i = this.C;
                int i2 = (i & 1) != 1 ? 0 : 1;
                bVar.E = this.D;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                bVar.F = this.E;
                bVar.D = i2;
                return bVar;
            }

            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public C0242b clone() {
                return p().j(n());
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // com.daaw.InterfaceC2026Qj0.a
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public com.daaw.C8966vA0.b.C0242b N(com.daaw.C9687xm r3, com.daaw.C6763nJ r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.daaw.Xs0 r1 = com.daaw.C8966vA0.b.J     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                    com.daaw.vA0$b r3 = (com.daaw.C8966vA0.b) r3     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
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
                    com.daaw.vA0$b r4 = (com.daaw.C8966vA0.b) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.daaw.C8966vA0.b.C0242b.N(com.daaw.xm, com.daaw.nJ):com.daaw.vA0$b$b");
            }

            @Override // com.daaw.AbstractC5674jS.b
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public C0242b j(b bVar) {
                if (bVar == b.y()) {
                    return this;
                }
                if (bVar.B()) {
                    v(bVar.z());
                }
                if (bVar.C()) {
                    u(bVar.A());
                }
                k(i().m(bVar.C));
                return this;
            }

            public C0242b u(c cVar) {
                if ((this.C & 2) != 2 || this.E == c.P()) {
                    this.E = cVar;
                } else {
                    this.E = c.j0(this.E).j(cVar).n();
                }
                this.C |= 2;
                return this;
            }

            public C0242b v(int i) {
                this.C |= 1;
                this.D = i;
                return this;
            }

            public final void q() {
            }
        }
    }

    static {
        C8966vA0 c8966vA0 = new C8966vA0(true);
        I = c8966vA0;
        c8966vA0.F();
    }

    public static C8966vA0 C() {
        return I;
    }

    private void F() {
        this.E = 0;
        this.F = Collections.EMPTY_LIST;
    }

    public static c G() {
        return c.p();
    }

    public static c H(C8966vA0 c8966vA0) {
        return G().j(c8966vA0);
    }

    public int A() {
        return this.F.size();
    }

    public List B() {
        return this.F;
    }

    public int D() {
        return this.E;
    }

    public boolean E() {
        return (this.D & 1) == 1;
    }

    @Override // com.daaw.InterfaceC2026Qj0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public c d() {
        return G();
    }

    @Override // com.daaw.InterfaceC2026Qj0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public c f() {
        return H(this);
    }

    @Override // com.daaw.InterfaceC2026Qj0
    public int c() {
        int i = this.H;
        if (i != -1) {
            return i;
        }
        int iO = (this.D & 1) == 1 ? C0343Am.o(1, this.E) : 0;
        for (int i2 = 0; i2 < this.F.size(); i2++) {
            iO += C0343Am.r(2, (InterfaceC2026Qj0) this.F.get(i2));
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
        if (!E()) {
            this.G = (byte) 0;
            return false;
        }
        for (int i = 0; i < A(); i++) {
            if (!z(i).e()) {
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
        if ((this.D & 1) == 1) {
            c0343Am.Z(1, this.E);
        }
        for (int i = 0; i < this.F.size(); i++) {
            c0343Am.c0(2, (InterfaceC2026Qj0) this.F.get(i));
        }
        c0343Am.h0(this.C);
    }

    public b z(int i) {
        return (b) this.F.get(i);
    }

    public C8966vA0(AbstractC5674jS.b bVar) {
        super(bVar);
        this.G = (byte) -1;
        this.H = -1;
        this.C = bVar.i();
    }

    public C8966vA0(boolean z) {
        this.G = (byte) -1;
        this.H = -1;
        this.C = AbstractC4629fi.B;
    }

    public C8966vA0(C9687xm c9687xm, C6763nJ c6763nJ) {
        this.G = (byte) -1;
        this.H = -1;
        F();
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
                            this.D |= 1;
                            this.E = c9687xm.r();
                        } else if (iJ != 18) {
                            if (!r(c9687xm, c0343AmI, c6763nJ, iJ)) {
                            }
                        } else {
                            if ((c2 & 2) != 2) {
                                this.F = new ArrayList();
                                c2 = 2;
                            }
                            this.F.add(c9687xm.t(b.J, c6763nJ));
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

    /* JADX INFO: renamed from: com.daaw.vA0$c */
    public static final class c extends AbstractC5674jS.b implements InterfaceC2130Rj0 {
        public int C;
        public int D;
        public List E = Collections.EMPTY_LIST;

        public c() {
            r();
        }

        public static c p() {
            return new c();
        }

        @Override // com.daaw.InterfaceC2026Qj0.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public C8966vA0 a() {
            C8966vA0 c8966vA0N = n();
            if (c8966vA0N.e()) {
                return c8966vA0N;
            }
            throw S.a.h(c8966vA0N);
        }

        public C8966vA0 n() {
            C8966vA0 c8966vA0 = new C8966vA0(this);
            int i = (this.C & 1) != 1 ? 0 : 1;
            c8966vA0.E = this.D;
            if ((this.C & 2) == 2) {
                this.E = DesugarCollections.unmodifiableList(this.E);
                this.C &= -3;
            }
            c8966vA0.F = this.E;
            c8966vA0.D = i;
            return c8966vA0;
        }

        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public c clone() {
            return p().j(n());
        }

        public final void q() {
            if ((this.C & 2) != 2) {
                this.E = new ArrayList(this.E);
                this.C |= 2;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // com.daaw.InterfaceC2026Qj0.a
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.daaw.C8966vA0.c N(com.daaw.C9687xm r3, com.daaw.C6763nJ r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.daaw.Xs0 r1 = com.daaw.C8966vA0.J     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                com.daaw.vA0 r3 = (com.daaw.C8966vA0) r3     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
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
                com.daaw.vA0 r4 = (com.daaw.C8966vA0) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.C8966vA0.c.N(com.daaw.xm, com.daaw.nJ):com.daaw.vA0$c");
        }

        @Override // com.daaw.AbstractC5674jS.b
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public c j(C8966vA0 c8966vA0) {
            if (c8966vA0 == C8966vA0.C()) {
                return this;
            }
            if (c8966vA0.E()) {
                v(c8966vA0.D());
            }
            if (!c8966vA0.F.isEmpty()) {
                if (this.E.isEmpty()) {
                    this.E = c8966vA0.F;
                    this.C &= -3;
                } else {
                    q();
                    this.E.addAll(c8966vA0.F);
                }
            }
            k(i().m(c8966vA0.C));
            return this;
        }

        public c v(int i) {
            this.C |= 1;
            this.D = i;
            return this;
        }

        private void r() {
        }
    }
}
