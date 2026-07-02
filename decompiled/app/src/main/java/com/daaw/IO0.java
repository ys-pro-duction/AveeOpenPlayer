package com.daaw;

import com.google.android.gms.ads.AdRequest;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class IO0 implements InterfaceC10173zX, InterfaceC5414iX {
    public C8185sQ a = new C8185sQ();
    public b b = new b();
    public final BlockingQueue c = new ArrayBlockingQueue(1);
    public final BlockingQueue d = new ArrayBlockingQueue(2);
    public Thread e = null;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar;
            while (true) {
                try {
                    cVar = (c) IO0.this.c.poll(10000L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException unused) {
                }
                if (cVar == null) {
                    return;
                }
                IO0.this.d.add(IO0.this.b.w(cVar.a, cVar.b));
            }
        }
    }

    public class b implements QW {
        public C8605tu0[] T;
        public DX V;
        public ThreadPoolExecutor a0;
        public float f;
        public float g;
        public int a = 90;
        public boolean b = false;
        public double[] c = new double[1];
        public float[] d = new float[1];
        public float[] e = new float[2];
        public int h = 0;
        public int i = 0;
        public float j = 0.0f;
        public int k = 64;
        public float[] l = new float[1];
        public float[] m = new float[1];
        public float[] n = new float[1];
        public float[] o = new float[1];
        public float[] p = new float[1];
        public float q = 0.0f;
        public boolean r = false;
        public int s = 1;
        public float t = 1.0f;
        public final float u = 300.0f;
        public final float v = 0.9f;
        public final float w = 0.01f;
        public float x = 0.4f;
        public int y = 4;
        public float z = 0.0f;
        public float A = 1000.0f;
        public float B = 0.0f;
        public float C = 1.0f;
        public int[] D = new int[0];
        public float[] E = new float[0];
        public float F = 1.0f;
        public int G = 2;
        public float H = 0.0f;
        public float I = 0.2f;
        public float J = 1.0f;
        public boolean K = true;
        public float[] L = new float[0];
        public float M = 0.5f;
        public float N = 0.0f;
        public float O = 0.0f;
        public C7581qE0 P = new C7581qE0(0.5f);
        public C6521mS0 Q = C6521mS0.e(1, 1.0f);
        public double[] R = new double[0];
        public int S = 0;
        public double[] U = new double[0];
        public final Object W = new Object();
        public int X = Runtime.getRuntime().availableProcessors();
        public final BlockingQueue Y = new LinkedBlockingQueue();
        public final TimeUnit Z = TimeUnit.SECONDS;
        public int b0 = 44100;

        public class a implements DX {
            public b a;

            public a(b bVar) {
                this.a = bVar;
            }

            @Override // com.daaw.DX
            public double get(int i) {
                return this.a.U[i];
            }

            @Override // com.daaw.DX
            public int size() {
                return this.a.U.length;
            }
        }

        public b() {
            int iMax = Math.max(1, this.X - 3);
            this.T = new C8605tu0[iMax];
            int i = 0;
            while (true) {
                C8605tu0[] c8605tu0Arr = this.T;
                if (i >= c8605tu0Arr.length) {
                    this.V = new a(this);
                    H(64, 0.06f, 0);
                    C(1);
                    z(0.0f, 0.2f, 0.7f, 35.0f);
                    B(3, 1.0f);
                    this.a0 = new ThreadPoolExecutor(iMax, iMax, 1L, this.Z, this.Y);
                    return;
                }
                c8605tu0Arr[i] = new C8605tu0();
                i++;
            }
        }

        private void J(int i, float f, float f2, boolean z, float f3, int i2, int i3, float f4) {
            int iMax = Math.max(0, i2);
            int iMax2 = Math.max(0, i3);
            boolean z2 = z && i > 1;
            int i4 = z2 ? i / 2 : i;
            int i5 = ((z2 ? i / 2 : i) - iMax) - iMax2;
            int iMax3 = Math.max(i5 / this.s, 1);
            for (int i6 = 0; i6 < i; i6++) {
                this.n[i6] = 0.0f;
            }
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            float f5 = Float.MAX_VALUE;
            float f6 = 0.0f;
            while (i7 < i5) {
                int i10 = ((i7 - ((int) (i5 * f4))) + i5) % iMax3;
                int i11 = i7 + iMax;
                int i12 = i7;
                int i13 = i8;
                int i14 = i9;
                this.n[i11] = (float) v(f, f2, i10, iMax3);
                float[] fArr = this.n;
                float f7 = (fArr[i11] * (1.0f - f3)) + ((f + ((f2 - f) * i10 * (1.0f / iMax3))) * f3);
                fArr[i11] = f7;
                if (f5 > f7) {
                    f5 = f7;
                    i8 = i11;
                } else {
                    i8 = i13;
                }
                if (f6 < f7) {
                    f6 = f7;
                    i9 = i11;
                } else {
                    i9 = i14;
                }
                i7 = i12 + 1;
            }
            int i15 = i8;
            int i16 = i9;
            int i17 = 0;
            while (i17 < i) {
                float f8 = (i17 <= iMax || i17 == i15) ? this.n[i17] : this.n[((i17 - 1) + i) % i];
                float f9 = (i17 >= (i5 - iMax2) + (-1) || i17 == i16) ? this.n[i17] : this.n[(i17 + 1) % i];
                this.o[i17] = Math.min(f8, f9);
                if (f8 < 0.0f) {
                    if (f9 < 0.0f) {
                        this.o[i17] = 0.0f;
                    } else {
                        this.o[i17] = f9;
                    }
                } else if (f8 < 0.0f) {
                    this.o[i17] = 0.0f;
                } else {
                    this.o[i17] = f8;
                }
                i17++;
            }
            for (int i18 = 0; i18 < i; i18++) {
                float[] fArr2 = this.n;
                if (fArr2[i18] < 0.0f) {
                    fArr2[i18] = 0.0f;
                }
                float[] fArr3 = this.o;
                if (fArr3[i18] < 0.0f) {
                    fArr3[i18] = 0.0f;
                }
            }
            int i19 = i - 1;
            int iMin = 1;
            for (int i20 = i19; i20 >= i4; i20--) {
                float[] fArr4 = this.n;
                fArr4[i20] = fArr4[iMin];
                float[] fArr5 = this.o;
                fArr5[i20] = fArr5[iMin];
                iMin = Math.min(iMin + 1, i19);
            }
        }

        private void K(float[] fArr) {
            float f = (this.B * 0.100000024f) + (fArr[0] * 0.9f);
            this.B = f;
            float f2 = fArr[1];
            float f3 = this.A;
            if (f2 > f3) {
                this.A = (f3 * 0.100000024f) + (f2 * 0.9f);
            } else {
                this.A = (f3 * 0.99f) + (f2 * 0.01f);
            }
            float f4 = this.A - f;
            this.C = f4;
            if (f4 < 1.0f) {
                this.C = 1.0f;
            }
            this.C = 300.0f / this.C;
        }

        private void j(float[] fArr, float f, boolean z, DX dx, int i, float[] fArr2, float[] fArr3, boolean z2) {
            int i2 = 0;
            if (fArr.length < 4) {
                while (i2 < fArr.length) {
                    fArr[i2] = 0.0f;
                    i2++;
                }
                return;
            }
            fArr2[0] = 9999990.0f;
            fArr2[1] = -9999990.0f;
            if (this.c.length != dx.size()) {
                this.c = new double[dx.size()];
            }
            AbstractC6278lb.i(fArr.length == this.c.length);
            float f2 = this.I;
            float f3 = 1.0f - f2;
            while (i2 < this.c.length) {
                fArr[i2] = Math.max((float) this.Q.g(i2, dx), 0.0f) * ((((float) FE.a(Math.min(2600.0d, this.n[i2]))) * 0.1f * f2) + f3) * f;
                i2++;
            }
        }

        public void A(float f) {
            synchronized (this.W) {
                this.x = f;
            }
        }

        public void B(int i, float f) {
            synchronized (this.W) {
                this.Q = C6521mS0.e(i, f);
            }
        }

        public void C(int i) {
            synchronized (this.W) {
                if (i < 1) {
                    i = 1;
                }
                try {
                    int[] iArr = new int[i + 1 + i];
                    this.D = iArr;
                    this.E = new float[iArr.length];
                    this.F = iArr.length;
                    int i2 = 0;
                    while (true) {
                        int[] iArr2 = this.D;
                        if (i2 < iArr2.length) {
                            int i3 = i2 - i;
                            iArr2[i2] = i3;
                            this.E[i2] = GE.b(((iArr2.length + 2) / 2) + i3, iArr2.length + 2);
                            i2++;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void D(boolean z) {
            this.b = z;
        }

        public void E(float f) {
            synchronized (this.W) {
                this.J = f;
            }
        }

        public final void F(int i) {
            this.a = i;
        }

        public void G(int i, float f, float f2, boolean z, int i2, float f3, int i3, int i4, float f4) {
            synchronized (this.W) {
                try {
                    this.f = Math.max(f, 0.1f);
                    this.g = Math.max(f2, 0.1f);
                    this.k = Math.max(1, i);
                    this.r = z;
                    this.s = Math.max(i2, 1);
                    this.H = f3;
                    int i5 = this.k;
                    this.n = new float[i5];
                    this.o = new float[i5];
                    this.h = i3;
                    this.i = i4;
                    this.j = f4;
                    this.U = new double[i5];
                    J(i5, this.f, f2, z, f3, i3, i4, f4);
                    y(6);
                    int i6 = 0;
                    while (true) {
                        C8605tu0[] c8605tu0Arr = this.T;
                        if (i6 < c8605tu0Arr.length) {
                            c8605tu0Arr[i6].a(this.n, 44100);
                            i6++;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void H(int i, float f, int i2) {
            G(i, 20.0f, 18000.0f, false, 1, f, i2, i2, 0.0f);
        }

        public void I(float f) {
            synchronized (this.W) {
                this.t = f;
            }
        }

        @Override // com.daaw.QW
        public void a(C2591Vu c2591Vu) throws Throwable {
            synchronized (this.W) {
                try {
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    F(c2591Vu.s("audioDurationMs", 60));
                    D(c2591Vu.o("highQualityAudioCapture", false));
                    G(c2591Vu.s("sampleOutCount", 128), c2591Vu.p("lowerHz", 0.1f), c2591Vu.p("higherHz", 18000.0f), c2591Vu.o("mirrorSamples", false), c2591Vu.s("repeatSamples", 1), c2591Vu.p("hzLinearFactor", 0.06f), c2591Vu.s("starAndEndGap", 0), c2591Vu.s("starAndEndGap", 0), c2591Vu.p("freqShift", 0.0f));
                    I(c2591Vu.p("smooth", 1.0f));
                    B(c2591Vu.s("filterRadius", 4), c2591Vu.p("filterStrength", 1.0f));
                    A(c2591Vu.p("beatSmooth", 0.4f));
                    z(c2591Vu.p("beatRangeBarFirst", 0.0f), c2591Vu.p("beatRangeBarLast", 0.2f), c2591Vu.p("beatRangeValueLower", 0.7f), c2591Vu.p("beatRangeValueHigher", 35.0f));
                    x(c2591Vu.p("lowerFreqMagnitude", 0.25f));
                    E(c2591Vu.p("outputMultiplier", 1.0f));
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        }

        @Override // com.daaw.QW
        public void q(C2591Vu c2591Vu) {
            synchronized (this.W) {
                c2591Vu.Y("audioDurationMs", this.a, "1_AudioCapture", 20, RCHTTPStatusCodes.UNSUCCESSFUL);
                c2591Vu.N("highQualityAudioCapture", this.b, "1_AudioCapture");
                c2591Vu.Y("sampleOutCount", this.k, "2_spectrum", 0, AdRequest.MAX_CONTENT_URL_LENGTH);
                c2591Vu.Q("lowerHz", this.f, "2_spectrumHz", 0.0f, 300.0f);
                c2591Vu.Q("higherHz", this.g, "2_spectrumHz", 300.0f, 18000.0f);
                c2591Vu.Q("hzLinearFactor", this.H, "2_spectrumHz", 0.0f, 1.0f);
                c2591Vu.Q("freqShift", this.j, "2_spectrumHz", 0.0f, 1.0f);
                c2591Vu.N("mirrorSamples", this.r, "2_spectrum");
                c2591Vu.Y("repeatSamples", this.s, "2_spectrum", 1, 6);
                c2591Vu.Y("starAndEndGap", this.h, "2_spectrum", 0, 30);
                c2591Vu.Q("smooth", this.t, "2_spectrum", 0.1f, 1.0f);
                c2591Vu.Y("filterRadius", this.Q.f(), "2_spectrum", 0, 20);
                c2591Vu.Q("filterStrength", this.Q.h(), "2_spectrum", 0.1f, 2.0f);
                c2591Vu.Q("beatSmooth", this.x, "beat", 0.1f, 1.0f);
                c2591Vu.Q("beatRangeBarFirst", this.P.c(), "beat", 0.0f, 1.0f);
                c2591Vu.Q("beatRangeBarLast", this.P.d(), "beat", 0.0f, 1.0f);
                c2591Vu.Q("beatRangeValueLower", this.P.e(), "beat", 0.0f, 50.0f);
                c2591Vu.Q("beatRangeValueHigher", this.P.f(), "beat", 0.0f, 100.0f);
                c2591Vu.Q("lowerFreqMagnitude", this.I, "2_spectrum", 0.0f, 1.0f);
                c2591Vu.Q("outputMultiplier", this.J, "2_spectrum", 0.1f, 3.0f);
            }
        }

        public float s() {
            float f;
            synchronized (this.W) {
                f = this.q;
            }
            return f;
        }

        public float t() {
            float f;
            synchronized (this.W) {
                f = this.O;
            }
            return f;
        }

        public final /* synthetic */ void u(int i, int i2, int i3, float f, C5954kS0[] c5954kS0Arr) {
            int i4 = i * i2;
            C8605tu0[] c8605tu0Arr = this.T;
            if (i2 != c8605tu0Arr.length - 1) {
                i3 = (i2 + 1) * i;
            }
            c8605tu0Arr[i2].b(this.R, i4, i3, this.U, f, this.e[1]);
            c5954kS0Arr[i2].a();
        }

        public double v(double d, double d2, int i, int i2) {
            return d * Math.pow(d2 / d, ((double) i) / ((double) (i2 - 1)));
        }

        public float[] w(float f, InterfaceC8635u10 interfaceC8635u10) {
            FX ls0;
            float f2;
            int i;
            int size;
            boolean z;
            int i2;
            int i3;
            int i4;
            char c;
            C8605tu0[] c8605tu0Arr;
            float[] fArr;
            synchronized (this.W) {
                try {
                    int i5 = (int) (this.b0 * 0.001f * this.a);
                    int iB = interfaceC8635u10.b();
                    if (iB > 0) {
                        i5 = iB;
                    }
                    com.daaw.avee.comp.playback.a aVarJ = interfaceC8635u10.j(i5);
                    char c2 = 0;
                    if (aVarJ != null) {
                        ls0 = this.b ? aVarJ.k() : aVarJ.l();
                        size = ls0.size();
                        boolean zA = aVarJ.a();
                        int i6 = aVarJ.f;
                        f2 = aVarJ.d;
                        float[] fArr2 = this.e;
                        fArr2[0] = 0.0f;
                        fArr2[1] = aVarJ.e;
                        i = i6;
                        z = zA;
                    } else {
                        ls0 = new LS0((short) 0, 4);
                        float[] fArr3 = this.e;
                        fArr3[0] = 0.0f;
                        fArr3[1] = 1000.0f;
                        f2 = -1000.0f;
                        i = 44100;
                        size = 4;
                        z = false;
                    }
                    if (size < 4) {
                        ls0 = new LS0((short) 0, 4);
                        i3 = 44100;
                        i2 = 4;
                    } else {
                        i2 = size;
                        i3 = i;
                    }
                    this.b0 = i3;
                    int length = this.m.length;
                    int i7 = this.k;
                    if (length != i7) {
                        this.m = new float[i7];
                    }
                    int length2 = this.l.length;
                    float[] fArr4 = this.m;
                    if (length2 != fArr4.length) {
                        this.l = new float[fArr4.length];
                        int i8 = 0;
                        while (true) {
                            float[] fArr5 = this.l;
                            if (i8 >= fArr5.length) {
                                break;
                            }
                            fArr5[i8] = 0.0f;
                            i8++;
                        }
                    }
                    if (i2 != this.L.length) {
                        this.L = new float[i2];
                        for (int i9 = 0; i9 < i2; i9++) {
                            this.L[i9] = GE.c(i9, i2) * 0.00390625f;
                        }
                    }
                    K(this.e);
                    if (this.R.length != i2) {
                        this.R = new double[i2];
                    }
                    int i10 = 0;
                    float fSqrt = 0.0f;
                    while (i10 < this.R.length) {
                        float f3 = ls0.get(i10) * this.L[i10] * this.C;
                        fSqrt += f3 * f3;
                        this.R[i10] = f3;
                        i10++;
                        ls0 = ls0;
                    }
                    if ((interfaceC8635u10.g() & 2) != 0) {
                        int length3 = this.T.length;
                        final C5954kS0[] c5954kS0Arr = new C5954kS0[length3];
                        final int i11 = 0;
                        while (i11 < this.T.length) {
                            c5954kS0Arr[i11] = new C5954kS0();
                            C8605tu0 c8605tu0 = this.T[i11];
                            if (c8605tu0.a != i3) {
                                c8605tu0.a(this.n, i3);
                            }
                            C8605tu0[] c8605tu0Arr2 = this.T;
                            final int i12 = c8605tu0Arr2[c2].c;
                            final int length4 = i12 / c8605tu0Arr2.length;
                            final float f4 = f2;
                            this.a0.execute(new Runnable() { // from class: com.daaw.JO0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.B.u(length4, i11, i12, f4, c5954kS0Arr);
                                }
                            });
                            i11++;
                            f2 = f4;
                            c2 = 0;
                        }
                        i4 = 2;
                        c = 0;
                        for (int i13 = 0; i13 < length3; i13++) {
                            try {
                                c5954kS0Arr[i13].b();
                            } catch (InterruptedException unused) {
                            }
                        }
                    } else {
                        float f5 = f2;
                        i4 = 2;
                        c = 0;
                        int i14 = 0;
                        while (true) {
                            c8605tu0Arr = this.T;
                            if (i14 >= c8605tu0Arr.length) {
                                break;
                            }
                            C8605tu0 c8605tu02 = c8605tu0Arr[i14];
                            if (c8605tu02.a != i3) {
                                c8605tu02.a(this.n, i3);
                            }
                            i14++;
                        }
                        C8605tu0 c8605tu03 = c8605tu0Arr[0];
                        c8605tu03.b(this.R, 0, c8605tu03.c, this.U, f5, this.e[1]);
                    }
                    if (i2 > 0) {
                        fSqrt = (float) Math.sqrt(fSqrt / i2);
                    }
                    this.z = fSqrt;
                    j(this.m, this.J, this.r, this.V, i3, new float[i4], this.p, z);
                    this.P.g(this.l.length);
                    AbstractC6278lb.b("barValues == barSmoothValues", this.m.length, this.l.length);
                    this.N = 0.0f;
                    float f6 = -10000.0f;
                    int i15 = 0;
                    while (true) {
                        float[] fArr6 = this.m;
                        if (i15 < fArr6.length) {
                            float f7 = fArr6[i15];
                            if (f7 > f6) {
                                this.N = i15;
                                f6 = f7;
                            }
                            float[] fArr7 = this.l;
                            float f8 = fArr7[i15];
                            float f9 = f8 + ((f7 - f8) * 20.0f * f * this.t);
                            fArr7[i15] = f9;
                            fArr7[i15] = Math.max(f9, 0.0f);
                            this.P.a(i15, this.l[i15]);
                            i15++;
                        } else {
                            this.p[c] = this.P.b();
                            float f10 = this.q;
                            float f11 = this.x;
                            this.q = (f10 * (1.0f - f11)) + (this.p[c] * f11);
                            float length5 = this.N / this.m.length;
                            this.N = length5;
                            float f12 = this.O;
                            float f13 = this.M;
                            this.O = (f12 * (1.0f - f13)) + (length5 * f13);
                            fArr = this.l;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return fArr;
        }

        public void x(float f) {
            synchronized (this.W) {
                this.I = f;
            }
        }

        public void y(int i) {
            synchronized (this.W) {
                this.y = i;
            }
        }

        public void z(float f, float f2, float f3, float f4) {
            synchronized (this.W) {
                this.P.h(f, f2, f3, f4);
            }
        }
    }

    public class c {
        public float a;
        public InterfaceC8635u10 b;

        public c(float f, InterfaceC8635u10 interfaceC8635u10) {
            this.a = f;
            this.b = interfaceC8635u10;
        }
    }

    private void s() {
        Thread thread = this.e;
        if (thread == null || !thread.isAlive()) {
            AbstractC0441Bk1.a("Starting audioProcessTh");
            Thread thread2 = new Thread(new a());
            this.e = thread2;
            thread2.start();
        }
    }

    @Override // com.daaw.QW
    public void a(C2591Vu c2591Vu) throws Throwable {
        this.b.a(c2591Vu);
    }

    @Override // com.daaw.InterfaceC5414iX
    public float c() {
        return this.b.s();
    }

    @Override // com.daaw.InterfaceC10173zX
    public EX f(int i, int i2, int i3, EX ex) {
        return this.a.c(i, i2, i3, ex);
    }

    @Override // com.daaw.InterfaceC5414iX
    public float j() {
        return this.b.t();
    }

    @Override // com.daaw.InterfaceC10173zX
    public void p(InterfaceC9336wX interfaceC9336wX, InterfaceC8635u10 interfaceC8635u10) {
        if (!interfaceC9336wX.c()) {
            this.a.b(this.b.w(interfaceC9336wX.d(), interfaceC8635u10));
            return;
        }
        s();
        try {
            float[] fArr = (float[]) this.d.poll(100L, TimeUnit.MILLISECONDS);
            if (fArr != null) {
                this.a.b(fArr);
            }
        } catch (InterruptedException unused) {
        }
        this.c.offer(new c(interfaceC9336wX.d(), interfaceC8635u10));
    }

    @Override // com.daaw.QW
    public void q(C2591Vu c2591Vu) {
        this.b.q(c2591Vu);
    }
}
