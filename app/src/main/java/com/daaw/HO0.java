package com.daaw;

import com.google.android.gms.ads.AdRequest;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class HO0 implements InterfaceC10173zX, InterfaceC5414iX {
    public C8185sQ a = new C8185sQ();
    public final b b = new b();
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
                    cVar = (c) HO0.this.c.poll(10000L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException unused) {
                }
                if (cVar == null) {
                    return;
                }
                HO0.this.d.add(HO0.this.b.v(cVar.a, cVar.b));
            }
        }
    }

    public static class b implements QW {
        public float g;
        public float h;
        public int a = 10;
        public int b = 1024;
        public double[] c = new double[1];
        public float[] d = new float[1];
        public float[] e = new float[1];
        public float[] f = new float[2];
        public int i = 0;
        public int j = 0;
        public float k = 0.0f;
        public int l = 64;
        public float[] m = new float[1];
        public float[] n = new float[1];
        public float[] o = new float[1];
        public float[] p = new float[1];
        public float[] q = new float[1];
        public float r = 0.0f;
        public boolean s = false;
        public int t = 1;
        public float u = 0.8f;
        public float v = 1.0f;
        public final float w = 300.0f;
        public final float x = 0.9f;
        public final float y = 0.01f;
        public float z = 0.4f;
        public int A = 4;
        public float B = 0.0f;
        public float C = 1000.0f;
        public float D = 0.0f;
        public float E = 1.0f;
        public float F = 0.0f;
        public int[] G = new int[0];
        public float[] H = new float[0];
        public float I = 1.0f;
        public int J = 2;
        public float K = 0.0f;
        public float L = 0.2f;
        public float M = 1.0f;
        public boolean N = true;
        public float[] O = new float[0];
        public float P = 0.5f;
        public float Q = 0.0f;
        public float R = 0.0f;
        public C7581qE0 S = new C7581qE0(0.5f);
        public C6242lS0 T = new C6242lS0().a(1, 1.0f);
        public double[] U = new double[0];
        public int V = 0;
        public AJ W = new C3764ce0();
        public DX X = new a();

        public class a implements DX {
            public a() {
            }

            @Override // com.daaw.DX
            public double get(int i) {
                double[] dArr = b.this.U;
                int i2 = i * 2;
                double d = dArr[i2];
                double d2 = dArr[i2 + 1];
                return Math.sqrt((d * d) + (d2 * d2));
            }

            @Override // com.daaw.DX
            public int size() {
                return b.this.U.length / 2;
            }
        }

        public b() {
            F(64, 0.06f, 0);
            B(1);
            D(11);
            y(0.0f, 0.2f, 0.7f, 35.0f);
            A(1, 1.0f);
        }

        private synchronized void A(int i, float f) {
            this.T.a(i, f);
        }

        private synchronized void C(float f) {
            this.M = f;
        }

        private void D(int i) {
            this.a = i;
            this.b = Math.min(Math.max(1 << i, 32), 8192);
        }

        private synchronized void E(int i, float f, float f2, boolean z, int i2, float f3, int i3, int i4, float f4) {
            this.g = Math.max(f, 0.1f);
            this.h = f2;
            this.l = Math.max(1, Math.min(i, 10000));
            this.s = z;
            this.t = Math.max(i2, 1);
            this.K = f3;
            int i5 = this.l;
            this.o = new float[i5];
            this.p = new float[i5];
            this.i = i3;
            this.j = i4;
            this.k = f4;
            I(i5, this.g, f2, z, f3, i3, i4, f4);
            x(6);
        }

        private void F(int i, float f, int i2) {
            E(i, 20.0f, 18000.0f, false, 1, f, i2, i2, 0.0f);
        }

        private synchronized void G(float f) {
            this.u = f;
        }

        private void J(float[] fArr) {
            float f = (this.D * 0.100000024f) + (fArr[0] * 0.9f);
            this.D = f;
            float f2 = fArr[1];
            float f3 = this.C;
            if (f2 > f3) {
                this.C = (f3 * 0.100000024f) + (f2 * 0.9f);
            } else {
                this.C = (f3 * 0.99f) + (f2 * 0.01f);
            }
            float f4 = this.C - f;
            this.E = f4;
            if (f4 < 1.0f) {
                this.E = 1.0f;
            }
            this.E = 300.0f / this.E;
        }

        public static double u(double d, double d2, int i, int i2) {
            return d * Math.pow(d2 / d, ((double) i) / ((double) (i2 - 1)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized float[] v(float f, InterfaceC8635u10 interfaceC8635u10) {
            FX ls0;
            int size;
            int i;
            boolean z;
            int i2;
            try {
                int iB = interfaceC8635u10.b();
                if (iB <= 0) {
                    iB = this.b;
                }
                com.daaw.avee.comp.playback.a aVarJ = interfaceC8635u10.j(iB);
                int i3 = 4;
                if (aVarJ != null) {
                    ls0 = aVarJ.l();
                    size = ls0.size();
                    boolean zA = aVarJ.a();
                    i = aVarJ.f;
                    float[] fArr = this.f;
                    fArr[0] = 0.0f;
                    fArr[1] = aVarJ.e;
                    z = zA;
                } else {
                    ls0 = new LS0((short) 0, 4);
                    float[] fArr2 = this.f;
                    fArr2[0] = 0.0f;
                    fArr2[1] = 1000.0f;
                    size = 4;
                    i = 44100;
                    z = false;
                }
                if (size < 4) {
                    ls0 = new LS0((short) 0, 4);
                    i2 = 44100;
                } else {
                    i3 = size;
                    i2 = i;
                }
                int length = this.n.length;
                int i4 = this.l;
                if (length != i4) {
                    this.n = new float[i4];
                }
                int length2 = this.m.length;
                float[] fArr3 = this.n;
                if (length2 != fArr3.length) {
                    this.m = new float[fArr3.length];
                    int i5 = 0;
                    while (true) {
                        float[] fArr4 = this.m;
                        if (i5 >= fArr4.length) {
                            break;
                        }
                        fArr4[i5] = 0.0f;
                        i5++;
                    }
                }
                if (i3 != this.O.length) {
                    this.O = new float[i3];
                    for (int i6 = 0; i6 < i3; i6++) {
                        this.O[i6] = GE.c(i6, i3) * 0.00390625f;
                    }
                }
                J(this.f);
                if (this.U.length != i3) {
                    this.U = new double[i3];
                }
                float fSqrt = 0.0f;
                for (int i7 = 0; i7 < this.U.length; i7++) {
                    float f2 = ls0.get(i7) * this.O[i7] * this.E;
                    fSqrt += f2 * f2;
                    this.U[i7] = f2;
                }
                if (this.V != i3) {
                    this.V = i3;
                    this.W.a(i3);
                }
                this.W.b(this.U, true);
                if (i3 > 0) {
                    fSqrt = (float) Math.sqrt(fSqrt / i3);
                }
                this.B = fSqrt;
                j(this.n, this.M, this.s, this.X, i2, new float[2], this.q, z);
                this.S.g(this.m.length);
                AbstractC6278lb.a(this.n.length, this.m.length);
                this.Q = 0.0f;
                float f3 = -10000.0f;
                int i8 = 0;
                while (true) {
                    float[] fArr5 = this.n;
                    if (i8 < fArr5.length) {
                        float f4 = fArr5[i8];
                        if (f4 > f3) {
                            this.Q = i8;
                            f3 = f4;
                        }
                        float[] fArr6 = this.m;
                        float f5 = fArr6[i8];
                        float f6 = f5 + ((f4 - f5) * 20.0f * f * this.u);
                        fArr6[i8] = f6;
                        fArr6[i8] = Math.max(f6, 0.0f);
                        this.S.a(i8, this.m[i8]);
                        i8++;
                    } else {
                        this.q[0] = this.S.b();
                        float f7 = this.r;
                        float f8 = this.z;
                        this.r = (f7 * (1.0f - f8)) + (this.q[0] * f8);
                        float length3 = this.Q / this.n.length;
                        this.Q = length3;
                        float f9 = this.R;
                        float f10 = this.P;
                        this.R = (f9 * (1.0f - f10)) + (length3 * f10);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.m;
        }

        private synchronized void w(float f) {
            this.L = f;
        }

        private synchronized void y(float f, float f2, float f3, float f4) {
            this.S.h(f, f2, f3, f4);
        }

        private synchronized void z(float f) {
            this.z = f;
        }

        public synchronized void B(int i) {
            if (i < 1) {
                i = 1;
            }
            int[] iArr = new int[i + 1 + i];
            this.G = iArr;
            this.H = new float[iArr.length];
            this.I = iArr.length;
            int i2 = 0;
            while (true) {
                int[] iArr2 = this.G;
                if (i2 < iArr2.length) {
                    int i3 = i2 - i;
                    iArr2[i2] = i3;
                    this.H[i2] = GE.b(((iArr2.length + 2) / 2) + i3, iArr2.length + 2);
                    i2++;
                }
            }
        }

        public final synchronized void H(float f) {
            this.v = f;
        }

        public final void I(int i, float f, float f2, boolean z, float f3, int i2, int i3, float f4) {
            int iMax = Math.max(0, i2);
            int iMax2 = Math.max(0, i3);
            boolean z2 = z && i > 1;
            int i4 = z2 ? i / 2 : i;
            int i5 = ((z2 ? i / 2 : i) - iMax) - iMax2;
            int iMax3 = Math.max(i5 / this.t, 1);
            for (int i6 = 0; i6 < i; i6++) {
                this.o[i6] = 0.0f;
            }
            float f5 = Float.MAX_VALUE;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            float f6 = 0.0f;
            while (i7 < i5) {
                int i10 = ((i7 - ((int) (i5 * f4))) + i5) % iMax3;
                int i11 = i7 + iMax;
                int i12 = i7;
                int i13 = i8;
                int i14 = i9;
                int i15 = iMax3;
                this.o[i11] = (float) u(f, f2, i10, iMax3);
                float[] fArr = this.o;
                float f7 = (fArr[i11] * (1.0f - f3)) + ((f + ((f2 - f) * i10 * (1.0f / i15))) * f3);
                fArr[i11] = f7;
                if (f5 > f7) {
                    f5 = f7;
                    i8 = i11;
                } else {
                    i8 = i13;
                }
                if (f6 < f7) {
                    f6 = f7;
                    i14 = i11;
                }
                i7 = i12 + 1;
                iMax3 = i15;
                i9 = i14;
            }
            int i16 = i8;
            int i17 = i9;
            int i18 = 0;
            while (i18 < i) {
                float f8 = (i18 <= iMax || i18 == i16) ? this.o[i18] : this.o[((i18 - 1) + i) % i];
                float f9 = (i18 >= (i5 - iMax2) + (-1) || i18 == i17) ? this.o[i18] : this.o[(i18 + 1) % i];
                this.p[i18] = Math.min(f8, f9);
                if (f8 < 0.0f) {
                    if (f9 < 0.0f) {
                        this.p[i18] = 0.0f;
                    } else {
                        this.p[i18] = f9;
                    }
                } else if (f8 < 0.0f) {
                    this.p[i18] = 0.0f;
                } else {
                    this.p[i18] = f8;
                }
                i18++;
            }
            for (int i19 = 0; i19 < i; i19++) {
                float[] fArr2 = this.o;
                if (fArr2[i19] < 0.0f) {
                    fArr2[i19] = 0.0f;
                }
                float[] fArr3 = this.p;
                if (fArr3[i19] < 0.0f) {
                    fArr3[i19] = 0.0f;
                }
            }
            int i20 = i - 1;
            int iMin = 1;
            for (int i21 = i20; i21 >= i4; i21--) {
                float[] fArr4 = this.o;
                fArr4[i21] = fArr4[iMin];
                float[] fArr5 = this.p;
                fArr5[i21] = fArr5[iMin];
                iMin = Math.min(iMin + 1, i20);
            }
        }

        @Override // com.daaw.QW
        public synchronized void a(C2591Vu c2591Vu) throws Throwable {
            try {
                try {
                    D(c2591Vu.s("fftSize", 11));
                    E(c2591Vu.s("sampleOutCount", 128), c2591Vu.p("lowerHz", 20.0f), c2591Vu.p("higherHz", 18000.0f), c2591Vu.o("mirrorSamples", false), c2591Vu.s("repeatSamples", 1), c2591Vu.p("hzLinearFactor", 0.06f), c2591Vu.s("starAndEndGap", 0), c2591Vu.s("starAndEndGap", 0), c2591Vu.p("freqShift", 0.0f));
                    G(c2591Vu.p("smooth", 0.8f));
                    H(c2591Vu.p("preSmooth", 1.0f));
                    A(c2591Vu.s("filterRadius", 1), c2591Vu.p("filterStrength", 1.0f));
                    z(c2591Vu.p("beatSmooth", 0.4f));
                    y(c2591Vu.p("beatRangeBarFirst", 0.0f), c2591Vu.p("beatRangeBarLast", 0.2f), c2591Vu.p("beatRangeValueLower", 0.7f), c2591Vu.p("beatRangeValueHigher", 35.0f));
                    w(c2591Vu.p("aWeight", 0.2f));
                    C(c2591Vu.p("outputMultiplier", 1.0f));
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }

        public final void j(float[] fArr, float f, boolean z, DX dx, int i, float[] fArr2, float[] fArr3, boolean z2) {
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
                this.d = new float[dx.size()];
                int i3 = 0;
                while (true) {
                    float[] fArr4 = this.d;
                    if (i3 >= fArr4.length) {
                        break;
                    }
                    fArr4[i3] = 0.0f;
                    i3++;
                }
            }
            for (int i4 = 0; i4 < this.c.length; i4++) {
                float fMax = Math.max((float) this.T.c(i4, dx), 0.0f);
                if (this.L > 0.0f) {
                    float fC = (float) FE.c(FE.b(i4, this.c.length, i));
                    float f2 = this.L;
                    fMax *= (1.0f - f2) + (f2 * fC * fC * fC);
                }
                double[] dArr = this.c;
                double d = dArr[i4];
                float f3 = this.v;
                dArr[i4] = (d * ((double) (1.0f - f3))) + ((double) (fMax * f3));
            }
            float size = i / (z2 ? dx.size() * 2 : dx.size());
            fArr[0] = 0.0f;
            while (i2 < fArr.length) {
                float fAbs = ((Math.abs(this.o[i2] - this.p[i2]) / 50.0f) * 0.3f) + 0.7f;
                int i5 = (int) (this.o[i2] / size);
                int i6 = (int) (this.p[i2] / size);
                fArr[i2] = 0.0f;
                int iMin = Math.min(i5, this.c.length);
                for (int i7 = i6; i7 < iMin; i7++) {
                    fArr[i2] = fArr[i2] + (((float) this.c[i7]) / (iMin - i6));
                }
                fArr[i2] = fArr[i2] * fAbs * f;
                i2++;
            }
        }

        @Override // com.daaw.QW
        public synchronized void q(C2591Vu c2591Vu) {
            c2591Vu.Y("fftSize", this.a, "Performance", 7, 13);
            c2591Vu.Y("sampleOutCount", this.l, "1_spectrum", 0, AdRequest.MAX_CONTENT_URL_LENGTH);
            c2591Vu.Q("lowerHz", this.g, "1_spectrumHz", 0.0f, 300.0f);
            c2591Vu.Q("higherHz", this.h, "1_spectrumHz", 300.0f, 18000.0f);
            c2591Vu.Q("hzLinearFactor", this.K, "1_spectrumHz", 0.0f, 1.0f);
            c2591Vu.Q("freqShift", this.k, "1_spectrumHz", 0.0f, 1.0f);
            c2591Vu.N("mirrorSamples", this.s, "1_spectrum");
            c2591Vu.Y("repeatSamples", this.t, "1_spectrum", 1, 6);
            c2591Vu.Y("starAndEndGap", this.i, "1_spectrum", 0, 30);
            c2591Vu.Q("smooth", this.u, "1_spectrum", 0.1f, 1.0f);
            c2591Vu.Q("preSmooth", this.v, "1_spectrum", 0.1f, 1.0f);
            c2591Vu.Y("filterRadius", this.T.b(), "1_spectrum", 0, 20);
            c2591Vu.Q("filterStrength", this.T.d(), "1_spectrum", 0.1f, 2.0f);
            c2591Vu.Q("beatSmooth", this.z, "beat", 0.1f, 1.0f);
            c2591Vu.Q("beatRangeBarFirst", this.S.c(), "beat", 0.0f, 1.0f);
            c2591Vu.Q("beatRangeBarLast", this.S.d(), "beat", 0.0f, 1.0f);
            c2591Vu.Q("beatRangeValueLower", this.S.e(), "beat", 0.0f, 50.0f);
            c2591Vu.Q("beatRangeValueHigher", this.S.f(), "beat", 0.0f, 100.0f);
            c2591Vu.Q("aWeight", this.L, "1_spectrum", 0.0f, 1.0f);
            c2591Vu.Q("outputMultiplier", this.M, "1_spectrum", 0.1f, 3.0f);
        }

        public synchronized float s() {
            return this.r;
        }

        public synchronized float t() {
            return this.R;
        }

        public synchronized void x(int i) {
            this.A = i;
        }
    }

    public static class c {
        public float a;
        public InterfaceC8635u10 b;

        public c(float f, InterfaceC8635u10 interfaceC8635u10) {
            this.a = f;
            this.b = interfaceC8635u10;
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
            this.a.b(this.b.v(interfaceC9336wX.d(), interfaceC8635u10));
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

    public final void s() {
        Thread thread = this.e;
        if (thread == null || !thread.isAlive()) {
            AbstractC0441Bk1.a("Starting audioProcessTh");
            Thread thread2 = new Thread(new a());
            this.e = thread2;
            thread2.start();
        }
    }
}
