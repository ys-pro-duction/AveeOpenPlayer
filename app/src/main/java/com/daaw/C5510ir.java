package com.daaw;

import com.daaw.C4106dr;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.ir, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5510ir {
    public static float v0 = 0.5f;
    public C4106dr I;
    public C4106dr[] J;
    public ArrayList K;
    public boolean[] L;
    public b[] M;
    public C5510ir N;
    public int O;
    public int P;
    public float Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public int a0;
    public float b0;
    public C2755Xj c;
    public float c0;
    public C2755Xj d;
    public Object d0;
    public int e0;
    public int f0;
    public String g0;
    public String h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public int m0;
    public int n0;
    public boolean o0;
    public boolean p0;
    public float[] q0;
    public C5510ir[] r0;
    public C5510ir[] s0;
    public C5510ir t0;
    public C5510ir u0;
    public boolean z;
    public boolean a = false;
    public AbstractC2745Xg1[] b = new AbstractC2745Xg1[2];
    public C6815nW e = new C6815nW(this);
    public C0838Fd1 f = new C0838Fd1(this);
    public boolean[] g = {true, true};
    public int[] h = {0, 0, 0, 0};
    public boolean i = false;
    public int j = -1;
    public int k = -1;
    public int l = 0;
    public int m = 0;
    public int[] n = new int[2];
    public int o = 0;
    public int p = 0;
    public float q = 1.0f;
    public int r = 0;
    public int s = 0;
    public float t = 1.0f;
    public int u = -1;
    public float v = 1.0f;
    public int[] w = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    public float x = 0.0f;
    public boolean y = false;
    public boolean A = false;
    public C4106dr B = new C4106dr(this, C4106dr.b.LEFT);
    public C4106dr C = new C4106dr(this, C4106dr.b.TOP);
    public C4106dr D = new C4106dr(this, C4106dr.b.RIGHT);
    public C4106dr E = new C4106dr(this, C4106dr.b.BOTTOM);
    public C4106dr F = new C4106dr(this, C4106dr.b.BASELINE);
    public C4106dr G = new C4106dr(this, C4106dr.b.CENTER_X);
    public C4106dr H = new C4106dr(this, C4106dr.b.CENTER_Y);

    /* JADX INFO: renamed from: com.daaw.ir$a */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[b.values().length];
            b = iArr;
            try {
                iArr[b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[C4106dr.b.values().length];
            a = iArr2;
            try {
                iArr2[C4106dr.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[C4106dr.b.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[C4106dr.b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[C4106dr.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[C4106dr.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[C4106dr.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[C4106dr.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[C4106dr.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[C4106dr.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.ir$b */
    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public C5510ir() {
        C4106dr c4106dr = new C4106dr(this, C4106dr.b.CENTER);
        this.I = c4106dr;
        this.J = new C4106dr[]{this.B, this.D, this.C, this.E, this.F, c4106dr};
        this.K = new ArrayList();
        this.L = new boolean[2];
        b bVar = b.FIXED;
        this.M = new b[]{bVar, bVar};
        this.N = null;
        this.O = 0;
        this.P = 0;
        this.Q = 0.0f;
        this.R = -1;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        float f = v0;
        this.b0 = f;
        this.c0 = f;
        this.e0 = 0;
        this.f0 = 0;
        this.g0 = null;
        this.h0 = null;
        this.k0 = false;
        this.l0 = false;
        this.m0 = 0;
        this.n0 = 0;
        this.q0 = new float[]{-1.0f, -1.0f};
        this.r0 = new C5510ir[]{null, null};
        this.s0 = new C5510ir[]{null, null};
        this.t0 = null;
        this.u0 = null;
        d();
    }

    public int A(int i) {
        if (i == 0) {
            return P();
        }
        if (i == 1) {
            return v();
        }
        return 0;
    }

    public void A0(b bVar) {
        this.M[1] = bVar;
    }

    public int B() {
        return this.w[1];
    }

    public void B0(int i, int i2, int i3, float f) {
        this.m = i;
        this.r = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.s = i3;
        this.t = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.m = 2;
    }

    public int C() {
        return this.w[0];
    }

    public void C0(float f) {
        this.q0[1] = f;
    }

    public int D() {
        return this.a0;
    }

    public void D0(int i) {
        this.f0 = i;
    }

    public int E() {
        return this.Z;
    }

    public void E0(int i) {
        this.O = i;
        int i2 = this.Z;
        if (i < i2) {
            this.O = i2;
        }
    }

    public C5510ir F(int i) {
        C4106dr c4106dr;
        C4106dr c4106dr2;
        if (i != 0) {
            if (i == 1 && (c4106dr2 = (c4106dr = this.E).d) != null && c4106dr2.d == c4106dr) {
                return c4106dr2.b;
            }
            return null;
        }
        C4106dr c4106dr3 = this.D;
        C4106dr c4106dr4 = c4106dr3.d;
        if (c4106dr4 == null || c4106dr4.d != c4106dr3) {
            return null;
        }
        return c4106dr4.b;
    }

    public void F0(int i) {
        this.S = i;
    }

    public C5510ir G() {
        return this.N;
    }

    public void G0(int i) {
        this.T = i;
    }

    public C5510ir H(int i) {
        C4106dr c4106dr;
        C4106dr c4106dr2;
        if (i != 0) {
            if (i == 1 && (c4106dr2 = (c4106dr = this.C).d) != null && c4106dr2.d == c4106dr) {
                return c4106dr2.b;
            }
            return null;
        }
        C4106dr c4106dr3 = this.B;
        C4106dr c4106dr4 = c4106dr3.d;
        if (c4106dr4 == null || c4106dr4.d != c4106dr3) {
            return null;
        }
        return c4106dr4.b;
    }

    public void H0(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.u == -1) {
            if (z3 && !z4) {
                this.u = 0;
            } else if (!z3 && z4) {
                this.u = 1;
                if (this.R == -1) {
                    this.v = 1.0f / this.v;
                }
            }
        }
        if (this.u == 0 && (!this.C.j() || !this.E.j())) {
            this.u = 1;
        } else if (this.u == 1 && (!this.B.j() || !this.D.j())) {
            this.u = 0;
        }
        if (this.u == -1 && (!this.C.j() || !this.E.j() || !this.B.j() || !this.D.j())) {
            if (this.C.j() && this.E.j()) {
                this.u = 0;
            } else if (this.B.j() && this.D.j()) {
                this.v = 1.0f / this.v;
                this.u = 1;
            }
        }
        if (this.u == -1) {
            int i = this.o;
            if (i > 0 && this.r == 0) {
                this.u = 0;
            } else {
                if (i != 0 || this.r <= 0) {
                    return;
                }
                this.v = 1.0f / this.v;
                this.u = 1;
            }
        }
    }

    public int I() {
        return Q() + this.O;
    }

    public void I0(boolean z, boolean z2) {
        int i;
        int i2;
        boolean zK = z & this.e.k();
        boolean zK2 = z2 & this.f.k();
        C6815nW c6815nW = this.e;
        int i3 = c6815nW.h.g;
        C0838Fd1 c0838Fd1 = this.f;
        int i4 = c0838Fd1.h.g;
        int i5 = c6815nW.i.g;
        int i6 = c0838Fd1.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i3 = 0;
            i6 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (zK) {
            this.S = i3;
        }
        if (zK2) {
            this.T = i4;
        }
        if (this.f0 == 8) {
            this.O = 0;
            this.P = 0;
            return;
        }
        if (zK) {
            if (this.M[0] == b.FIXED && i8 < (i2 = this.O)) {
                i8 = i2;
            }
            this.O = i8;
            int i10 = this.Z;
            if (i8 < i10) {
                this.O = i10;
            }
        }
        if (zK2) {
            if (this.M[1] == b.FIXED && i9 < (i = this.P)) {
                i9 = i;
            }
            this.P = i9;
            int i11 = this.a0;
            if (i9 < i11) {
                this.P = i11;
            }
        }
    }

    public AbstractC2745Xg1 J(int i) {
        if (i == 0) {
            return this.e;
        }
        if (i == 1) {
            return this.f;
        }
        return null;
    }

    public void J0(C4311ec0 c4311ec0) {
        int iX = c4311ec0.x(this.B);
        int iX2 = c4311ec0.x(this.C);
        int iX3 = c4311ec0.x(this.D);
        int iX4 = c4311ec0.x(this.E);
        C6815nW c6815nW = this.e;
        C8066rz c8066rz = c6815nW.h;
        if (c8066rz.j) {
            C8066rz c8066rz2 = c6815nW.i;
            if (c8066rz2.j) {
                iX = c8066rz.g;
                iX3 = c8066rz2.g;
            }
        }
        C0838Fd1 c0838Fd1 = this.f;
        C8066rz c8066rz3 = c0838Fd1.h;
        if (c8066rz3.j) {
            C8066rz c8066rz4 = c0838Fd1.i;
            if (c8066rz4.j) {
                iX2 = c8066rz3.g;
                iX4 = c8066rz4.g;
            }
        }
        int i = iX4 - iX2;
        if (iX3 - iX < 0 || i < 0 || iX == Integer.MIN_VALUE || iX == Integer.MAX_VALUE || iX2 == Integer.MIN_VALUE || iX2 == Integer.MAX_VALUE || iX3 == Integer.MIN_VALUE || iX3 == Integer.MAX_VALUE || iX4 == Integer.MIN_VALUE || iX4 == Integer.MAX_VALUE) {
            iX = 0;
            iX4 = 0;
            iX2 = 0;
            iX3 = 0;
        }
        f0(iX, iX2, iX3, iX4);
    }

    public float K() {
        return this.c0;
    }

    public int L() {
        return this.n0;
    }

    public b M() {
        return this.M[1];
    }

    public int N() {
        int i = this.B != null ? this.C.e : 0;
        return this.D != null ? i + this.E.e : i;
    }

    public int O() {
        return this.f0;
    }

    public int P() {
        if (this.f0 == 8) {
            return 0;
        }
        return this.O;
    }

    public int Q() {
        C5510ir c5510ir = this.N;
        return (c5510ir == null || !(c5510ir instanceof C5791jr)) ? this.S : ((C5791jr) c5510ir).C0 + this.S;
    }

    public int R() {
        C5510ir c5510ir = this.N;
        return (c5510ir == null || !(c5510ir instanceof C5791jr)) ? this.T : ((C5791jr) c5510ir).D0 + this.T;
    }

    public boolean S() {
        return this.y;
    }

    public void T(C4106dr.b bVar, C5510ir c5510ir, C4106dr.b bVar2, int i, int i2) {
        m(bVar).b(c5510ir.m(bVar2), i, i2, true);
    }

    public final boolean U(int i) {
        C4106dr c4106dr;
        C4106dr c4106dr2;
        int i2 = i * 2;
        C4106dr[] c4106drArr = this.J;
        C4106dr c4106dr3 = c4106drArr[i2];
        C4106dr c4106dr4 = c4106dr3.d;
        return (c4106dr4 == null || c4106dr4.d == c4106dr3 || (c4106dr2 = (c4106dr = c4106drArr[i2 + 1]).d) == null || c4106dr2.d != c4106dr) ? false : true;
    }

    public boolean V() {
        C4106dr c4106dr = this.B;
        C4106dr c4106dr2 = c4106dr.d;
        if (c4106dr2 != null && c4106dr2.d == c4106dr) {
            return true;
        }
        C4106dr c4106dr3 = this.D;
        C4106dr c4106dr4 = c4106dr3.d;
        return c4106dr4 != null && c4106dr4.d == c4106dr3;
    }

    public boolean W() {
        return this.z;
    }

    public boolean X() {
        C4106dr c4106dr = this.C;
        C4106dr c4106dr2 = c4106dr.d;
        if (c4106dr2 != null && c4106dr2.d == c4106dr) {
            return true;
        }
        C4106dr c4106dr3 = this.E;
        C4106dr c4106dr4 = c4106dr3.d;
        return c4106dr4 != null && c4106dr4.d == c4106dr3;
    }

    public void Y() {
        this.B.l();
        this.C.l();
        this.D.l();
        this.E.l();
        this.F.l();
        this.G.l();
        this.H.l();
        this.I.l();
        this.N = null;
        this.x = 0.0f;
        this.O = 0;
        this.P = 0;
        this.Q = 0.0f;
        this.R = -1;
        this.S = 0;
        this.T = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        float f = v0;
        this.b0 = f;
        this.c0 = f;
        b[] bVarArr = this.M;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.d0 = null;
        this.e0 = 0;
        this.f0 = 0;
        this.h0 = null;
        this.i0 = false;
        this.j0 = false;
        this.m0 = 0;
        this.n0 = 0;
        this.o0 = false;
        this.p0 = false;
        float[] fArr = this.q0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.j = -1;
        this.k = -1;
        int[] iArr = this.w;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.l = 0;
        this.m = 0;
        this.q = 1.0f;
        this.t = 1.0f;
        this.p = Integer.MAX_VALUE;
        this.s = Integer.MAX_VALUE;
        this.o = 0;
        this.r = 0;
        this.i = false;
        this.u = -1;
        this.v = 1.0f;
        this.k0 = false;
        this.l0 = false;
        boolean[] zArr = this.g;
        zArr[0] = true;
        zArr[1] = true;
        this.A = false;
        boolean[] zArr2 = this.L;
        zArr2[0] = false;
        zArr2[1] = false;
    }

    public void Z() {
        C5510ir c5510irG = G();
        if (c5510irG != null && (c5510irG instanceof C5791jr) && ((C5791jr) G()).W0()) {
            return;
        }
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            ((C4106dr) this.K.get(i)).l();
        }
    }

    public void a0(C6871ni c6871ni) {
        this.B.m(c6871ni);
        this.C.m(c6871ni);
        this.D.m(c6871ni);
        this.E.m(c6871ni);
        this.F.m(c6871ni);
        this.I.m(c6871ni);
        this.G.m(c6871ni);
        this.H.m(c6871ni);
    }

    public void b0(int i) {
        this.Y = i;
        this.y = i > 0;
    }

    public void c0(Object obj) {
        this.d0 = obj;
    }

    public final void d() {
        this.K.add(this.B);
        this.K.add(this.C);
        this.K.add(this.D);
        this.K.add(this.E);
        this.K.add(this.G);
        this.K.add(this.H);
        this.K.add(this.I);
        this.K.add(this.F);
    }

    public void d0(String str) {
        this.g0 = str;
    }

    public boolean e() {
        return (this instanceof AbstractC6858nf1) || (this instanceof C7644qU);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0087 A[PHI: r0
  0x0087: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:39:0x0086, B:36:0x007f, B:24:0x0051, B:26:0x0057, B:28:0x0063, B:30:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0087 -> B:41:0x0088). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e0(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L91
            int r1 = r9.length()
            if (r1 != 0) goto Lb
            goto L91
        Lb:
            int r1 = r9.length()
            r2 = 44
            int r2 = r9.indexOf(r2)
            r3 = 0
            r4 = 1
            r5 = -1
            if (r2 <= 0) goto L39
            int r6 = r1 + (-1)
            if (r2 >= r6) goto L39
            java.lang.String r6 = r9.substring(r3, r2)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L2b
            goto L36
        L2b:
            java.lang.String r3 = "H"
            boolean r3 = r6.equalsIgnoreCase(r3)
            if (r3 == 0) goto L35
            r3 = 1
            goto L36
        L35:
            r3 = -1
        L36:
            int r2 = r2 + r4
            r5 = r3
            r3 = r2
        L39:
            r2 = 58
            int r2 = r9.indexOf(r2)
            if (r2 < 0) goto L77
            int r1 = r1 - r4
            if (r2 >= r1) goto L77
            java.lang.String r1 = r9.substring(r3, r2)
            int r2 = r2 + r4
            java.lang.String r9 = r9.substring(r2)
            int r2 = r1.length()
            if (r2 <= 0) goto L87
            int r2 = r9.length()
            if (r2 <= 0) goto L87
            float r1 = java.lang.Float.parseFloat(r1)     // Catch: java.lang.NumberFormatException -> L86
            float r9 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.NumberFormatException -> L86
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r2 <= 0) goto L87
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 <= 0) goto L87
            if (r5 != r4) goto L71
            float r9 = r9 / r1
            float r9 = java.lang.Math.abs(r9)     // Catch: java.lang.NumberFormatException -> L86
            goto L88
        L71:
            float r1 = r1 / r9
            float r9 = java.lang.Math.abs(r1)     // Catch: java.lang.NumberFormatException -> L86
            goto L88
        L77:
            java.lang.String r9 = r9.substring(r3)
            int r1 = r9.length()
            if (r1 <= 0) goto L87
            float r9 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.NumberFormatException -> L86
            goto L88
        L86:
        L87:
            r9 = 0
        L88:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L90
            r8.Q = r9
            r8.R = r5
        L90:
            return
        L91:
            r8.Q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C5510ir.e0(java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x022b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:249:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f(com.daaw.C4311ec0 r46) {
        /*
            Method dump skipped, instruction units count: 1183
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C5510ir.f(com.daaw.ec0):void");
    }

    public void f0(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        this.S = i;
        this.T = i2;
        if (this.f0 == 8) {
            this.O = 0;
            this.P = 0;
            return;
        }
        b[] bVarArr = this.M;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i7 < (i6 = this.O)) {
            i7 = i6;
        }
        if (bVarArr[1] == bVar2 && i8 < (i5 = this.P)) {
            i8 = i5;
        }
        this.O = i7;
        this.P = i8;
        int i9 = this.a0;
        if (i8 < i9) {
            this.P = i9;
        }
        int i10 = this.Z;
        if (i7 < i10) {
            this.O = i10;
        }
    }

    public boolean g() {
        return this.f0 != 8;
    }

    public void g0(boolean z) {
        this.y = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x029f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:300:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(com.daaw.C4311ec0 r28, boolean r29, boolean r30, boolean r31, boolean r32, com.daaw.IU0 r33, com.daaw.IU0 r34, com.daaw.C5510ir.b r35, boolean r36, com.daaw.C4106dr r37, com.daaw.C4106dr r38, int r39, int r40, int r41, int r42, float r43, boolean r44, boolean r45, boolean r46, boolean r47, int r48, int r49, int r50, int r51, float r52, boolean r53) {
        /*
            Method dump skipped, instruction units count: 1033
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C5510ir.h(com.daaw.ec0, boolean, boolean, boolean, boolean, com.daaw.IU0, com.daaw.IU0, com.daaw.ir$b, boolean, com.daaw.dr, com.daaw.dr, int, int, int, int, float, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public void h0(int i) {
        this.P = i;
        int i2 = this.a0;
        if (i < i2) {
            this.P = i2;
        }
    }

    public void i(C4106dr.b bVar, C5510ir c5510ir, C4106dr.b bVar2, int i) {
        C4106dr.b bVar3;
        C4106dr.b bVar4;
        boolean z;
        C4106dr.b bVar5 = C4106dr.b.CENTER;
        if (bVar == bVar5) {
            if (bVar2 != bVar5) {
                C4106dr.b bVar6 = C4106dr.b.LEFT;
                if (bVar2 == bVar6 || bVar2 == C4106dr.b.RIGHT) {
                    i(bVar6, c5510ir, bVar2, 0);
                    i(C4106dr.b.RIGHT, c5510ir, bVar2, 0);
                    m(bVar5).a(c5510ir.m(bVar2), 0);
                    return;
                }
                C4106dr.b bVar7 = C4106dr.b.TOP;
                if (bVar2 == bVar7 || bVar2 == C4106dr.b.BOTTOM) {
                    i(bVar7, c5510ir, bVar2, 0);
                    i(C4106dr.b.BOTTOM, c5510ir, bVar2, 0);
                    m(bVar5).a(c5510ir.m(bVar2), 0);
                    return;
                }
                return;
            }
            C4106dr.b bVar8 = C4106dr.b.LEFT;
            C4106dr c4106drM = m(bVar8);
            C4106dr.b bVar9 = C4106dr.b.RIGHT;
            C4106dr c4106drM2 = m(bVar9);
            C4106dr.b bVar10 = C4106dr.b.TOP;
            C4106dr c4106drM3 = m(bVar10);
            C4106dr.b bVar11 = C4106dr.b.BOTTOM;
            C4106dr c4106drM4 = m(bVar11);
            boolean z2 = true;
            if ((c4106drM == null || !c4106drM.j()) && (c4106drM2 == null || !c4106drM2.j())) {
                i(bVar8, c5510ir, bVar8, 0);
                i(bVar9, c5510ir, bVar9, 0);
                z = true;
            } else {
                z = false;
            }
            if ((c4106drM3 == null || !c4106drM3.j()) && (c4106drM4 == null || !c4106drM4.j())) {
                i(bVar10, c5510ir, bVar10, 0);
                i(bVar11, c5510ir, bVar11, 0);
            } else {
                z2 = false;
            }
            if (z && z2) {
                m(bVar5).a(c5510ir.m(bVar5), 0);
                return;
            }
            if (z) {
                C4106dr.b bVar12 = C4106dr.b.CENTER_X;
                m(bVar12).a(c5510ir.m(bVar12), 0);
                return;
            } else {
                if (z2) {
                    C4106dr.b bVar13 = C4106dr.b.CENTER_Y;
                    m(bVar13).a(c5510ir.m(bVar13), 0);
                    return;
                }
                return;
            }
        }
        C4106dr.b bVar14 = C4106dr.b.CENTER_X;
        if (bVar == bVar14 && (bVar2 == (bVar4 = C4106dr.b.LEFT) || bVar2 == C4106dr.b.RIGHT)) {
            C4106dr c4106drM5 = m(bVar4);
            C4106dr c4106drM6 = c5510ir.m(bVar2);
            C4106dr c4106drM7 = m(C4106dr.b.RIGHT);
            c4106drM5.a(c4106drM6, 0);
            c4106drM7.a(c4106drM6, 0);
            m(bVar14).a(c4106drM6, 0);
            return;
        }
        C4106dr.b bVar15 = C4106dr.b.CENTER_Y;
        if (bVar == bVar15 && (bVar2 == (bVar3 = C4106dr.b.TOP) || bVar2 == C4106dr.b.BOTTOM)) {
            C4106dr c4106drM8 = c5510ir.m(bVar2);
            m(bVar3).a(c4106drM8, 0);
            m(C4106dr.b.BOTTOM).a(c4106drM8, 0);
            m(bVar15).a(c4106drM8, 0);
            return;
        }
        if (bVar == bVar14 && bVar2 == bVar14) {
            C4106dr.b bVar16 = C4106dr.b.LEFT;
            m(bVar16).a(c5510ir.m(bVar16), 0);
            C4106dr.b bVar17 = C4106dr.b.RIGHT;
            m(bVar17).a(c5510ir.m(bVar17), 0);
            m(bVar14).a(c5510ir.m(bVar2), 0);
            return;
        }
        if (bVar == bVar15 && bVar2 == bVar15) {
            C4106dr.b bVar18 = C4106dr.b.TOP;
            m(bVar18).a(c5510ir.m(bVar18), 0);
            C4106dr.b bVar19 = C4106dr.b.BOTTOM;
            m(bVar19).a(c5510ir.m(bVar19), 0);
            m(bVar15).a(c5510ir.m(bVar2), 0);
            return;
        }
        C4106dr c4106drM9 = m(bVar);
        C4106dr c4106drM10 = c5510ir.m(bVar2);
        if (c4106drM9.k(c4106drM10)) {
            C4106dr.b bVar20 = C4106dr.b.BASELINE;
            if (bVar == bVar20) {
                C4106dr c4106drM11 = m(C4106dr.b.TOP);
                C4106dr c4106drM12 = m(C4106dr.b.BOTTOM);
                if (c4106drM11 != null) {
                    c4106drM11.l();
                }
                if (c4106drM12 != null) {
                    c4106drM12.l();
                }
                i = 0;
            } else if (bVar == C4106dr.b.TOP || bVar == C4106dr.b.BOTTOM) {
                C4106dr c4106drM13 = m(bVar20);
                if (c4106drM13 != null) {
                    c4106drM13.l();
                }
                C4106dr c4106drM14 = m(bVar5);
                if (c4106drM14.g() != c4106drM10) {
                    c4106drM14.l();
                }
                C4106dr c4106drD = m(bVar).d();
                C4106dr c4106drM15 = m(bVar15);
                if (c4106drM15.j()) {
                    c4106drD.l();
                    c4106drM15.l();
                }
            } else if (bVar == C4106dr.b.LEFT || bVar == C4106dr.b.RIGHT) {
                C4106dr c4106drM16 = m(bVar5);
                if (c4106drM16.g() != c4106drM10) {
                    c4106drM16.l();
                }
                C4106dr c4106drD2 = m(bVar).d();
                C4106dr c4106drM17 = m(bVar14);
                if (c4106drM17.j()) {
                    c4106drD2.l();
                    c4106drM17.l();
                }
            }
            c4106drM9.a(c4106drM10, i);
        }
    }

    public void i0(float f) {
        this.b0 = f;
    }

    public void j(C4106dr c4106dr, C4106dr c4106dr2, int i) {
        if (c4106dr.e() == this) {
            i(c4106dr.h(), c4106dr2.e(), c4106dr2.h(), i);
        }
    }

    public void j0(int i) {
        this.m0 = i;
    }

    public void k(C5510ir c5510ir, float f, int i) {
        C4106dr.b bVar = C4106dr.b.CENTER;
        T(bVar, c5510ir, bVar, i, 0);
        this.x = f;
    }

    public void k0(int i, int i2) {
        this.S = i;
        int i3 = i2 - i;
        this.O = i3;
        int i4 = this.Z;
        if (i3 < i4) {
            this.O = i4;
        }
    }

    public void l(C4311ec0 c4311ec0) {
        c4311ec0.q(this.B);
        c4311ec0.q(this.C);
        c4311ec0.q(this.D);
        c4311ec0.q(this.E);
        if (this.Y > 0) {
            c4311ec0.q(this.F);
        }
    }

    public void l0(b bVar) {
        this.M[0] = bVar;
    }

    public C4106dr m(C4106dr.b bVar) {
        switch (a.a[bVar.ordinal()]) {
            case 1:
                return this.B;
            case 2:
                return this.C;
            case 3:
                return this.D;
            case 4:
                return this.E;
            case 5:
                return this.F;
            case 6:
                return this.I;
            case 7:
                return this.G;
            case 8:
                return this.H;
            case 9:
                return null;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    public void m0(int i, int i2, int i3, float f) {
        this.l = i;
        this.o = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.p = i3;
        this.q = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.l = 2;
    }

    public int n() {
        return this.Y;
    }

    public void n0(float f) {
        this.q0[0] = f;
    }

    public float o(int i) {
        if (i == 0) {
            return this.b0;
        }
        if (i == 1) {
            return this.c0;
        }
        return -1.0f;
    }

    public void o0(int i, boolean z) {
        this.L[i] = z;
    }

    public int p() {
        return R() + this.P;
    }

    public void p0(boolean z) {
        this.z = z;
    }

    public Object q() {
        return this.d0;
    }

    public void q0(boolean z) {
        this.A = z;
    }

    public String r() {
        return this.g0;
    }

    public void r0(int i) {
        this.w[1] = i;
    }

    public b s(int i) {
        if (i == 0) {
            return y();
        }
        if (i == 1) {
            return M();
        }
        return null;
    }

    public void s0(int i) {
        this.w[0] = i;
    }

    public float t() {
        return this.Q;
    }

    public void t0(int i) {
        if (i < 0) {
            this.a0 = 0;
        } else {
            this.a0 = i;
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.h0 != null) {
            str = "type: " + this.h0 + " ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.g0 != null) {
            str2 = "id: " + this.g0 + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.S);
        sb.append(", ");
        sb.append(this.T);
        sb.append(") - (");
        sb.append(this.O);
        sb.append(" x ");
        sb.append(this.P);
        sb.append(")");
        return sb.toString();
    }

    public int u() {
        return this.R;
    }

    public void u0(int i) {
        if (i < 0) {
            this.Z = 0;
        } else {
            this.Z = i;
        }
    }

    public int v() {
        if (this.f0 == 8) {
            return 0;
        }
        return this.P;
    }

    public void v0(int i, int i2) {
        this.S = i;
        this.T = i2;
    }

    public float w() {
        return this.b0;
    }

    public void w0(C5510ir c5510ir) {
        this.N = c5510ir;
    }

    public int x() {
        return this.m0;
    }

    public void x0(float f) {
        this.c0 = f;
    }

    public b y() {
        return this.M[0];
    }

    public void y0(int i) {
        this.n0 = i;
    }

    public int z() {
        C4106dr c4106dr = this.B;
        int i = c4106dr != null ? c4106dr.e : 0;
        C4106dr c4106dr2 = this.D;
        return c4106dr2 != null ? i + c4106dr2.e : i;
    }

    public void z0(int i, int i2) {
        this.T = i;
        int i3 = i2 - i;
        this.P = i3;
        int i4 = this.a0;
        if (i3 < i4) {
            this.P = i4;
        }
    }
}
