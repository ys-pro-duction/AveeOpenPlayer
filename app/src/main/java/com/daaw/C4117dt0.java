package com.daaw;

/* JADX INFO: renamed from: com.daaw.dt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4117dt0 implements InterfaceC8213sX {
    public static boolean v = true;
    public static C1665Nc1 w = new C1665Nc1(0.0f, 0.0f, 0.0f);
    public static C1665Nc1 x = new C1665Nc1(0.0f, 0.0f, 0.0f);
    public static C1665Nc1 y = new C1665Nc1(0.0f, 0.0f, 0.0f);
    public long a;
    public float b;
    public int c;
    public float d;
    public float e;
    public float f;
    public float g;
    public boolean h;
    public boolean i;
    public C1036Hb j;
    public float p;
    public boolean u;
    public C4396et0[] k = new C4396et0[0];
    public C1665Nc1 l = new C1665Nc1(0.0f, 0.0f, 0.0f);
    public C1665Nc1 m = new C1665Nc1(0.0f, 0.0f, 0.0f);
    public C1458Lc1 n = new C1458Lc1(0.0f, 0.0f);
    public C1665Nc1 o = new C1665Nc1(0.0f, 0.0f, 0.0f);
    public float q = 0.0f;
    public boolean r = false;
    public boolean s = false;
    public C4396et0 t = new C4396et0();

    public C4117dt0() {
        this.u = false;
        if (v) {
            this.u = true;
            v = false;
        }
    }

    @Override // com.daaw.InterfaceC8213sX
    public float[] a() {
        return this.t.b();
    }

    @Override // com.daaw.InterfaceC8213sX
    public float b() {
        return this.p;
    }

    @Override // com.daaw.InterfaceC8213sX
    public float c() {
        return this.t.c;
    }

    @Override // com.daaw.InterfaceC8213sX
    public boolean d(float f, float f2, C1458Lc1 c1458Lc1, C1458Lc1 c1458Lc12, float f3, float f4, C1458Lc1 c1458Lc13, float f5, float f6, C1458Lc1 c1458Lc14, C3755cc1 c3755cc1, float f7) {
        C4396et0[] c4396et0Arr;
        float fB;
        float f8;
        if (!this.r) {
            return false;
        }
        float f9 = this.e + f;
        this.e = f9;
        float f10 = f9 / this.g;
        this.f = f10;
        if (f10 > 1.0f || this.k == null) {
            this.r = false;
            return false;
        }
        float f11 = 0.0f;
        if (c1458Lc14 != null) {
            this.f = Math.max(this.f, 1.0f - (Math.max((-this.o.c) - f7, 0.0f) / (10.0f * f7)));
        }
        int i = 0;
        while (true) {
            c4396et0Arr = this.k;
            if (i >= c4396et0Arr.length || c4396et0Arr[i].a >= this.f) {
                break;
            }
            i++;
        }
        int length = i - 1;
        if (length < 0) {
            length = 0;
        }
        if (length >= c4396et0Arr.length - 1) {
            length = c4396et0Arr.length - 2;
        }
        int i2 = length + 1;
        int i3 = length >= 0 ? length : 0;
        float f12 = this.f;
        C4396et0 c4396et0 = c4396et0Arr[i3];
        float f13 = c4396et0.a;
        C4396et0 c4396et02 = c4396et0Arr[i2];
        float f14 = (f12 - f13) / (c4396et02.a - f13);
        C4396et0.a(this.t, c4396et0, c4396et02, f14 <= 1.0f ? f14 : 1.0f);
        C4396et0 c4396et03 = this.t;
        c4396et03.b *= f3;
        c4396et03.c *= f3;
        C1665Nc1 c1665Nc1 = this.l;
        float f15 = c1665Nc1.a;
        c1665Nc1.a = f15 + ((f15 - c1458Lc13.a) * f5);
        float f16 = c1665Nc1.b;
        c1665Nc1.b = f16 + ((f16 - c1458Lc13.b) * f5);
        c1665Nc1.c += 0.0f;
        float f17 = c4396et03.g;
        float fSin = (float) Math.sin(f17 + (this.e * f17));
        C4396et0 c4396et04 = this.t;
        float f18 = fSin * c4396et04.h;
        float f19 = c4396et04.g;
        float fCos = (float) Math.cos(f19 + (this.e * f19));
        C4396et0 c4396et05 = this.t;
        float f20 = fCos * c4396et05.h;
        C1665Nc1 c1665Nc12 = x;
        C1665Nc1 c1665Nc13 = this.l;
        c1665Nc12.a = -c1665Nc13.b;
        c1665Nc12.b = c1665Nc13.c;
        c1665Nc12.c = c1665Nc13.a;
        C1665Nc1 c1665Nc14 = y;
        float f21 = -c1665Nc13.c;
        c1665Nc14.a = f21;
        float f22 = c1665Nc13.a;
        c1665Nc14.b = f22;
        float f23 = c1665Nc13.b;
        c1665Nc14.c = f23;
        if (c1458Lc14 != null) {
            C1665Nc1 c1665Nc15 = this.m;
            c1665Nc15.a = (f21 * f18) + f22 + (c1665Nc12.a * f20);
            c1665Nc15.b = (f22 * f18) + f23 + (c1665Nc12.b * f20);
            c1665Nc15.c = c1665Nc13.c + (f23 * f18) + (c1665Nc12.c * f20);
        } else {
            C1665Nc1 c1665Nc16 = this.m;
            c1665Nc16.a = f22 + (f23 * f18);
            c1665Nc16.b = f23 + ((-c1665Nc13.a) * f18);
            c1665Nc16.c = c1665Nc13.c;
        }
        C1665Nc1 c1665Nc17 = this.o;
        float f24 = c1665Nc17.a;
        C1665Nc1 c1665Nc18 = this.m;
        c1665Nc17.a = f24 + (c1665Nc18.a * f * f4 * f2);
        c1665Nc17.b += c1665Nc18.b * f * f4 * f2;
        c1665Nc17.c += c1665Nc18.c * f * f4 * f2;
        float f25 = c1665Nc13.a;
        C1458Lc1 c1458Lc15 = this.n;
        c1665Nc13.a = f25 + (c1458Lc15.a * f * f2);
        c1665Nc13.b += c1458Lc15.b * f * f2;
        if (c4396et05.e) {
            if (c1458Lc14 != null) {
                float fAtan = (float) Math.atan(C1458Lc1.l(c1458Lc14.a - c1665Nc17.a, c1458Lc14.b - c1665Nc17.b) / this.o.c);
                float f26 = c1458Lc14.a;
                float f27 = this.o.a;
                C1665Nc1 c1665Nc19 = this.m;
                float fAtan2 = (float) Math.atan(C1458Lc1.l(f26 - (f27 - c1665Nc19.a), c1458Lc14.b - (r0.b - c1665Nc19.b)) / (this.o.c - this.m.c));
                C1665Nc1 c1665Nc110 = w;
                float f28 = c1458Lc14.a;
                C1665Nc1 c1665Nc111 = this.o;
                c1665Nc110.a = f28 - c1665Nc111.a;
                c1665Nc110.b = c1458Lc14.b - c1665Nc111.b;
                c1665Nc110.c = 0.0f;
                this.q = c1665Nc110.a();
                fB = Math.min(Math.abs(fAtan - fAtan2), 0.3f);
                f8 = 100.05f;
            } else {
                this.q = c1665Nc18.a();
                fB = this.m.b();
                f8 = 0.05f;
            }
            f11 = fB * f8;
        } else {
            this.q = c4396et05.d;
        }
        this.p = this.t.b + (f11 * f4 * f6);
        return true;
    }

    @Override // com.daaw.InterfaceC8213sX
    public boolean e() {
        return this.r;
    }

    @Override // com.daaw.InterfaceC8213sX
    public void f(float f) {
        C1036Hb c1036Hb = this.j;
        int i = c1036Hb != null ? c1036Hb.i() : 1;
        boolean z = this.h;
        if (!z) {
            this.c = (int) (i * this.f);
        }
        if (!this.i && this.c >= i) {
            this.c = i - 1;
        }
        this.c %= i;
        if (z) {
            return;
        }
        this.d = this.f * 1.0f;
    }

    @Override // com.daaw.InterfaceC8213sX
    public float g() {
        return this.q;
    }

    @Override // com.daaw.InterfaceC8213sX
    public C1665Nc1 getPosition() {
        return this.o;
    }

    public void h(int i) {
        if (this.k.length == i) {
            return;
        }
        this.k = new C4396et0[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.k[i2] = new C4396et0();
        }
    }

    public C4396et0 i(int i) {
        return this.k[i];
    }

    public void j(boolean z) {
        this.r = z;
    }

    @Override // com.daaw.InterfaceC8213sX
    public void setVisible(boolean z) {
        this.s = z;
    }
}
