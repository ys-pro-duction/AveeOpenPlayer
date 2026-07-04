package com.daaw;

import android.graphics.Bitmap;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: com.daaw.ru0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8047ru0 extends US0 {
    public final C2584Vs0 o;
    public final a p;
    public Inflater q;
    public byte[] r;
    public int s;

    /* JADX INFO: renamed from: com.daaw.ru0$a */
    public static final class a {
        public final C2584Vs0 a = new C2584Vs0();
        public final int[] b = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        public boolean c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;

        public C1631Mu d() {
            int iX;
            if (this.d == 0 || this.e == 0 || this.h == 0 || this.i == 0 || this.a.d() == 0 || this.a.c() != this.a.d() || !this.c) {
                return null;
            }
            this.a.J(0);
            int i = this.h * this.i;
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int iX2 = this.a.x();
                if (iX2 != 0) {
                    iX = i2 + 1;
                    iArr[i2] = this.b[iX2];
                } else {
                    int iX3 = this.a.x();
                    if (iX3 != 0) {
                        iX = ((iX3 & 64) == 0 ? iX3 & 63 : ((iX3 & 63) << 8) | this.a.x()) + i2;
                        Arrays.fill(iArr, i2, iX, (iX3 & 128) == 0 ? 0 : this.b[this.a.x()]);
                    }
                }
                i2 = iX;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, this.h, this.i, Bitmap.Config.ARGB_8888);
            float f = this.f;
            int i3 = this.d;
            float f2 = f / i3;
            float f3 = this.g;
            int i4 = this.e;
            return new C1631Mu(bitmapCreateBitmap, f2, 0, f3 / i4, 0, this.h / i3, this.i / i4);
        }

        public final void e(C2584Vs0 c2584Vs0, int i) {
            int iA;
            if (i < 4) {
                return;
            }
            c2584Vs0.K(3);
            int i2 = i - 4;
            if ((c2584Vs0.x() & 128) != 0) {
                if (i2 < 7 || (iA = c2584Vs0.A()) < 4) {
                    return;
                }
                this.h = c2584Vs0.D();
                this.i = c2584Vs0.D();
                this.a.G(iA - 4);
                i2 = i - 11;
            }
            int iC = this.a.c();
            int iD = this.a.d();
            if (iC >= iD || i2 <= 0) {
                return;
            }
            int iMin = Math.min(i2, iD - iC);
            c2584Vs0.g(this.a.a, iC, iMin);
            this.a.J(iC + iMin);
        }

        public final void f(C2584Vs0 c2584Vs0, int i) {
            if (i < 19) {
                return;
            }
            this.d = c2584Vs0.D();
            this.e = c2584Vs0.D();
            c2584Vs0.K(11);
            this.f = c2584Vs0.D();
            this.g = c2584Vs0.D();
        }

        public final void g(C2584Vs0 c2584Vs0, int i) {
            if (i % 5 != 2) {
                return;
            }
            c2584Vs0.K(2);
            Arrays.fill(this.b, 0);
            int i2 = i / 5;
            for (int i3 = 0; i3 < i2; i3++) {
                int iX = c2584Vs0.x();
                int iX2 = c2584Vs0.x();
                int iX3 = c2584Vs0.x();
                int iX4 = c2584Vs0.x();
                double d = iX2;
                double d2 = iX3 - 128;
                double d3 = iX4 - 128;
                this.b[iX] = (AbstractC6280lb1.l((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255) << 8) | (c2584Vs0.x() << 24) | (AbstractC6280lb1.l((int) ((1.402d * d2) + d), 0, 255) << 16) | AbstractC6280lb1.l((int) (d + (d3 * 1.772d)), 0, 255);
            }
            this.c = true;
        }

        public void h() {
            this.d = 0;
            this.e = 0;
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.a.G(0);
            this.c = false;
        }
    }

    public C8047ru0() {
        super("PgsDecoder");
        this.o = new C2584Vs0();
        this.p = new a();
    }

    public static C1631Mu D(C2584Vs0 c2584Vs0, a aVar) {
        int iD = c2584Vs0.d();
        int iX = c2584Vs0.x();
        int iD2 = c2584Vs0.D();
        int iC = c2584Vs0.c() + iD2;
        C1631Mu c1631MuD = null;
        if (iC > iD) {
            c2584Vs0.J(iD);
            return null;
        }
        if (iX != 128) {
            switch (iX) {
                case 20:
                    aVar.g(c2584Vs0, iD2);
                    break;
                case 21:
                    aVar.e(c2584Vs0, iD2);
                    break;
                case 22:
                    aVar.f(c2584Vs0, iD2);
                    break;
            }
        } else {
            c1631MuD = aVar.d();
            aVar.h();
        }
        c2584Vs0.J(iC);
        return c1631MuD;
    }

    public final boolean C(byte[] bArr, int i) {
        if (i != 0 && bArr[0] == 120) {
            if (this.q == null) {
                this.q = new Inflater();
                this.r = new byte[i];
            }
            this.s = 0;
            this.q.setInput(bArr, 0, i);
            while (!this.q.finished() && !this.q.needsDictionary() && !this.q.needsInput()) {
                try {
                    int i2 = this.s;
                    byte[] bArr2 = this.r;
                    if (i2 == bArr2.length) {
                        this.r = Arrays.copyOf(bArr2, bArr2.length * 2);
                    }
                    int i3 = this.s;
                    Inflater inflater = this.q;
                    byte[] bArr3 = this.r;
                    this.s = i3 + inflater.inflate(bArr3, i3, bArr3.length - i3);
                } catch (DataFormatException unused) {
                    this.q.reset();
                } catch (Throwable th) {
                    this.q.reset();
                    throw th;
                }
            }
            boolean zFinished = this.q.finished();
            this.q.reset();
            return zFinished;
        }
        return false;
    }

    @Override // com.daaw.US0
    public InterfaceC6549mZ0 z(byte[] bArr, int i, boolean z) {
        if (C(bArr, i)) {
            this.o.H(this.r, this.s);
        } else {
            this.o.H(bArr, i);
        }
        this.p.h();
        ArrayList arrayList = new ArrayList();
        while (this.o.a() >= 3) {
            C1631Mu c1631MuD = D(this.o, this.p);
            if (c1631MuD != null) {
                arrayList.add(c1631MuD);
            }
        }
        return new C8326su0(DesugarCollections.unmodifiableList(arrayList));
    }
}
