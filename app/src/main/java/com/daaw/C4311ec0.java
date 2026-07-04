package com.daaw;

import com.daaw.C4106dr;
import com.daaw.IU0;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: com.daaw.ec0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4311ec0 {
    public static int q = 1000;
    public static boolean r = true;
    public static long s;
    public static long t;
    public a c;
    public C2719Xa[] f;
    public final C6871ni m;
    public a p;
    public int a = 0;
    public HashMap b = null;
    public int d = 32;
    public int e = 32;
    public boolean g = false;
    public boolean h = false;
    public boolean[] i = new boolean[32];
    public int j = 1;
    public int k = 0;
    public int l = 32;
    public IU0[] n = new IU0[q];
    public int o = 0;

    /* JADX INFO: renamed from: com.daaw.ec0$a */
    public interface a {
        void a(IU0 iu0);

        void b(a aVar);

        IU0 c(C4311ec0 c4311ec0, boolean[] zArr);

        void clear();

        IU0 getKey();
    }

    /* JADX INFO: renamed from: com.daaw.ec0$b */
    public class b extends C2719Xa {
        public b(C6871ni c6871ni) {
            this.e = new JU0(this, c6871ni);
        }
    }

    public C4311ec0() {
        this.f = null;
        this.f = new C2719Xa[32];
        C();
        C6871ni c6871ni = new C6871ni();
        this.m = c6871ni;
        this.c = new C9469wz0(c6871ni);
        if (r) {
            this.p = new b(c6871ni);
        } else {
            this.p = new C2719Xa(c6871ni);
        }
    }

    public static C2719Xa s(C4311ec0 c4311ec0, IU0 iu0, IU0 iu02, float f) {
        return c4311ec0.r().j(iu0, iu02, f);
    }

    public static AbstractC7719qk0 w() {
        return null;
    }

    public void A(a aVar) {
        u(aVar);
        B(aVar, false);
        n();
    }

    public final int B(a aVar, boolean z) {
        for (int i = 0; i < this.j; i++) {
            this.i[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            i2++;
            if (i2 < this.j * 2) {
                if (aVar.getKey() != null) {
                    this.i[aVar.getKey().c] = true;
                }
                IU0 iu0C = aVar.c(this, this.i);
                if (iu0C != null) {
                    boolean[] zArr = this.i;
                    int i3 = iu0C.c;
                    if (!zArr[i3]) {
                        zArr[i3] = true;
                    }
                }
                if (iu0C != null) {
                    float f = Float.MAX_VALUE;
                    int i4 = -1;
                    for (int i5 = 0; i5 < this.k; i5++) {
                        C2719Xa c2719Xa = this.f[i5];
                        if (c2719Xa.a.j != IU0.a.UNRESTRICTED && !c2719Xa.f && c2719Xa.t(iu0C)) {
                            float fE = c2719Xa.e.e(iu0C);
                            if (fE < 0.0f) {
                                float f2 = (-c2719Xa.b) / fE;
                                if (f2 < f) {
                                    i4 = i5;
                                    f = f2;
                                }
                            }
                        }
                    }
                    if (i4 > -1) {
                        C2719Xa c2719Xa2 = this.f[i4];
                        c2719Xa2.a.d = -1;
                        c2719Xa2.y(iu0C);
                        IU0 iu0 = c2719Xa2.a;
                        iu0.d = i4;
                        iu0.g(c2719Xa2);
                    }
                } else {
                    z2 = true;
                }
            }
            return i2;
        }
        return i2;
    }

    public final void C() {
        int i = 0;
        if (r) {
            while (true) {
                C2719Xa[] c2719XaArr = this.f;
                if (i >= c2719XaArr.length) {
                    return;
                }
                C2719Xa c2719Xa = c2719XaArr[i];
                if (c2719Xa != null) {
                    this.m.a.a(c2719Xa);
                }
                this.f[i] = null;
                i++;
            }
        } else {
            while (true) {
                C2719Xa[] c2719XaArr2 = this.f;
                if (i >= c2719XaArr2.length) {
                    return;
                }
                C2719Xa c2719Xa2 = c2719XaArr2[i];
                if (c2719Xa2 != null) {
                    this.m.b.a(c2719Xa2);
                }
                this.f[i] = null;
                i++;
            }
        }
    }

    public void D() {
        C6871ni c6871ni;
        int i = 0;
        while (true) {
            c6871ni = this.m;
            IU0[] iu0Arr = c6871ni.d;
            if (i >= iu0Arr.length) {
                break;
            }
            IU0 iu0 = iu0Arr[i];
            if (iu0 != null) {
                iu0.d();
            }
            i++;
        }
        c6871ni.c.c(this.n, this.o);
        this.o = 0;
        Arrays.fill(this.m.d, (Object) null);
        HashMap map = this.b;
        if (map != null) {
            map.clear();
        }
        this.a = 0;
        this.c.clear();
        this.j = 1;
        for (int i2 = 0; i2 < this.k; i2++) {
            this.f[i2].c = false;
        }
        C();
        this.k = 0;
        if (r) {
            this.p = new b(this.m);
        } else {
            this.p = new C2719Xa(this.m);
        }
    }

    public final IU0 a(IU0.a aVar, String str) {
        IU0 iu0 = (IU0) this.m.c.b();
        if (iu0 == null) {
            iu0 = new IU0(aVar, str);
            iu0.f(aVar, str);
        } else {
            iu0.d();
            iu0.f(aVar, str);
        }
        int i = this.o;
        int i2 = q;
        if (i >= i2) {
            int i3 = i2 * 2;
            q = i3;
            this.n = (IU0[]) Arrays.copyOf(this.n, i3);
        }
        IU0[] iu0Arr = this.n;
        int i4 = this.o;
        this.o = i4 + 1;
        iu0Arr[i4] = iu0;
        return iu0;
    }

    public void b(C5510ir c5510ir, C5510ir c5510ir2, float f, int i) {
        C4106dr.b bVar = C4106dr.b.LEFT;
        IU0 iu0Q = q(c5510ir.m(bVar));
        C4106dr.b bVar2 = C4106dr.b.TOP;
        IU0 iu0Q2 = q(c5510ir.m(bVar2));
        C4106dr.b bVar3 = C4106dr.b.RIGHT;
        IU0 iu0Q3 = q(c5510ir.m(bVar3));
        C4106dr.b bVar4 = C4106dr.b.BOTTOM;
        IU0 iu0Q4 = q(c5510ir.m(bVar4));
        IU0 iu0Q5 = q(c5510ir2.m(bVar));
        IU0 iu0Q6 = q(c5510ir2.m(bVar2));
        IU0 iu0Q7 = q(c5510ir2.m(bVar3));
        IU0 iu0Q8 = q(c5510ir2.m(bVar4));
        C2719Xa c2719XaR = r();
        double d = f;
        double d2 = i;
        c2719XaR.q(iu0Q2, iu0Q4, iu0Q6, iu0Q8, (float) (Math.sin(d) * d2));
        d(c2719XaR);
        C2719Xa c2719XaR2 = r();
        c2719XaR2.q(iu0Q, iu0Q3, iu0Q5, iu0Q7, (float) (Math.cos(d) * d2));
        d(c2719XaR2);
    }

    public void c(IU0 iu0, IU0 iu02, int i, float f, IU0 iu03, IU0 iu04, int i2, int i3) {
        C2719Xa c2719XaR = r();
        c2719XaR.h(iu0, iu02, i, f, iu03, iu04, i2);
        if (i3 != 8) {
            c2719XaR.d(this, i3);
        }
        d(c2719XaR);
    }

    public void d(C2719Xa c2719Xa) {
        IU0 iu0W;
        if (c2719Xa == null) {
            return;
        }
        boolean z = true;
        if (this.k + 1 >= this.l || this.j + 1 >= this.e) {
            y();
        }
        boolean z2 = false;
        if (!c2719Xa.f) {
            c2719Xa.D(this);
            if (c2719Xa.u()) {
                return;
            }
            c2719Xa.r();
            if (c2719Xa.f(this)) {
                IU0 iu0P = p();
                c2719Xa.a = iu0P;
                l(c2719Xa);
                this.p.b(c2719Xa);
                B(this.p, true);
                if (iu0P.d == -1) {
                    if (c2719Xa.a == iu0P && (iu0W = c2719Xa.w(iu0P)) != null) {
                        c2719Xa.y(iu0W);
                    }
                    if (!c2719Xa.f) {
                        c2719Xa.a.g(c2719Xa);
                    }
                    this.k--;
                }
            } else {
                z = false;
            }
            if (!c2719Xa.s()) {
                return;
            } else {
                z2 = z;
            }
        }
        if (z2) {
            return;
        }
        l(c2719Xa);
    }

    public C2719Xa e(IU0 iu0, IU0 iu02, int i, int i2) {
        if (i2 == 8 && iu02.g && iu0.d == -1) {
            iu0.e(this, iu02.f + i);
            return null;
        }
        C2719Xa c2719XaR = r();
        c2719XaR.n(iu0, iu02, i);
        if (i2 != 8) {
            c2719XaR.d(this, i2);
        }
        d(c2719XaR);
        return c2719XaR;
    }

    public void f(IU0 iu0, int i) {
        int i2 = iu0.d;
        if (i2 == -1) {
            iu0.e(this, i);
            return;
        }
        if (i2 == -1) {
            C2719Xa c2719XaR = r();
            c2719XaR.i(iu0, i);
            d(c2719XaR);
            return;
        }
        C2719Xa c2719Xa = this.f[i2];
        if (c2719Xa.f) {
            c2719Xa.b = i;
            return;
        }
        if (c2719Xa.e.b() == 0) {
            c2719Xa.f = true;
            c2719Xa.b = i;
        } else {
            C2719Xa c2719XaR2 = r();
            c2719XaR2.m(iu0, i);
            d(c2719XaR2);
        }
    }

    public void g(IU0 iu0, IU0 iu02, int i, boolean z) {
        C2719Xa c2719XaR = r();
        IU0 iu0T = t();
        iu0T.e = 0;
        c2719XaR.o(iu0, iu02, iu0T, i);
        d(c2719XaR);
    }

    public void h(IU0 iu0, IU0 iu02, int i, int i2) {
        C2719Xa c2719XaR = r();
        IU0 iu0T = t();
        iu0T.e = 0;
        c2719XaR.o(iu0, iu02, iu0T, i);
        if (i2 != 8) {
            m(c2719XaR, (int) (c2719XaR.e.e(iu0T) * (-1.0f)), i2);
        }
        d(c2719XaR);
    }

    public void i(IU0 iu0, IU0 iu02, int i, boolean z) {
        C2719Xa c2719XaR = r();
        IU0 iu0T = t();
        iu0T.e = 0;
        c2719XaR.p(iu0, iu02, iu0T, i);
        d(c2719XaR);
    }

    public void j(IU0 iu0, IU0 iu02, int i, int i2) {
        C2719Xa c2719XaR = r();
        IU0 iu0T = t();
        iu0T.e = 0;
        c2719XaR.p(iu0, iu02, iu0T, i);
        if (i2 != 8) {
            m(c2719XaR, (int) (c2719XaR.e.e(iu0T) * (-1.0f)), i2);
        }
        d(c2719XaR);
    }

    public void k(IU0 iu0, IU0 iu02, IU0 iu03, IU0 iu04, float f, int i) {
        C2719Xa c2719XaR = r();
        c2719XaR.k(iu0, iu02, iu03, iu04, f);
        if (i != 8) {
            c2719XaR.d(this, i);
        }
        d(c2719XaR);
    }

    public final void l(C2719Xa c2719Xa) {
        if (r) {
            C2719Xa c2719Xa2 = this.f[this.k];
            if (c2719Xa2 != null) {
                this.m.a.a(c2719Xa2);
            }
        } else {
            C2719Xa c2719Xa3 = this.f[this.k];
            if (c2719Xa3 != null) {
                this.m.b.a(c2719Xa3);
            }
        }
        C2719Xa[] c2719XaArr = this.f;
        int i = this.k;
        c2719XaArr[i] = c2719Xa;
        IU0 iu0 = c2719Xa.a;
        iu0.d = i;
        this.k = i + 1;
        iu0.g(c2719Xa);
    }

    public void m(C2719Xa c2719Xa, int i, int i2) {
        c2719Xa.e(o(i2, null), i);
    }

    public final void n() {
        for (int i = 0; i < this.k; i++) {
            C2719Xa c2719Xa = this.f[i];
            c2719Xa.a.f = c2719Xa.b;
        }
    }

    public IU0 o(int i, String str) {
        if (this.j + 1 >= this.e) {
            y();
        }
        IU0 iu0A = a(IU0.a.ERROR, str);
        int i2 = this.a + 1;
        this.a = i2;
        this.j++;
        iu0A.c = i2;
        iu0A.e = i;
        this.m.d[i2] = iu0A;
        this.c.a(iu0A);
        return iu0A;
    }

    public IU0 p() {
        if (this.j + 1 >= this.e) {
            y();
        }
        IU0 iu0A = a(IU0.a.SLACK, null);
        int i = this.a + 1;
        this.a = i;
        this.j++;
        iu0A.c = i;
        this.m.d[i] = iu0A;
        return iu0A;
    }

    public IU0 q(Object obj) {
        IU0 iu0F = null;
        if (obj == null) {
            return null;
        }
        if (this.j + 1 >= this.e) {
            y();
        }
        if (obj instanceof C4106dr) {
            C4106dr c4106dr = (C4106dr) obj;
            iu0F = c4106dr.f();
            if (iu0F == null) {
                c4106dr.m(this.m);
                iu0F = c4106dr.f();
            }
            int i = iu0F.c;
            if (i != -1 && i <= this.a && this.m.d[i] != null) {
                return iu0F;
            }
            if (i != -1) {
                iu0F.d();
            }
            int i2 = this.a + 1;
            this.a = i2;
            this.j++;
            iu0F.c = i2;
            iu0F.j = IU0.a.UNRESTRICTED;
            this.m.d[i2] = iu0F;
        }
        return iu0F;
    }

    public C2719Xa r() {
        C2719Xa c2719Xa;
        if (r) {
            c2719Xa = (C2719Xa) this.m.a.b();
            if (c2719Xa == null) {
                c2719Xa = new b(this.m);
                t++;
            } else {
                c2719Xa.z();
            }
        } else {
            c2719Xa = (C2719Xa) this.m.b.b();
            if (c2719Xa == null) {
                c2719Xa = new C2719Xa(this.m);
                s++;
            } else {
                c2719Xa.z();
            }
        }
        IU0.b();
        return c2719Xa;
    }

    public IU0 t() {
        if (this.j + 1 >= this.e) {
            y();
        }
        IU0 iu0A = a(IU0.a.SLACK, null);
        int i = this.a + 1;
        this.a = i;
        this.j++;
        iu0A.c = i;
        this.m.d[i] = iu0A;
        return iu0A;
    }

    public final int u(a aVar) {
        for (int i = 0; i < this.k; i++) {
            C2719Xa c2719Xa = this.f[i];
            if (c2719Xa.a.j != IU0.a.UNRESTRICTED && c2719Xa.b < 0.0f) {
                boolean z = false;
                int i2 = 0;
                while (!z) {
                    i2++;
                    float f = Float.MAX_VALUE;
                    int i3 = 0;
                    int i4 = -1;
                    int i5 = -1;
                    int i6 = 0;
                    while (true) {
                        if (i3 >= this.k) {
                            break;
                        }
                        C2719Xa c2719Xa2 = this.f[i3];
                        if (c2719Xa2.a.j != IU0.a.UNRESTRICTED && !c2719Xa2.f && c2719Xa2.b < 0.0f) {
                            for (int i7 = 1; i7 < this.j; i7++) {
                                IU0 iu0 = this.m.d[i7];
                                float fE = c2719Xa2.e.e(iu0);
                                if (fE > 0.0f) {
                                    for (int i8 = 0; i8 < 9; i8++) {
                                        float f2 = iu0.h[i8] / fE;
                                        if ((f2 < f && i8 == i6) || i8 > i6) {
                                            f = f2;
                                            i4 = i3;
                                            i5 = i7;
                                            i6 = i8;
                                        }
                                    }
                                }
                            }
                        }
                        i3++;
                    }
                    if (i4 != -1) {
                        C2719Xa c2719Xa3 = this.f[i4];
                        c2719Xa3.a.d = -1;
                        c2719Xa3.y(this.m.d[i5]);
                        IU0 iu02 = c2719Xa3.a;
                        iu02.d = i4;
                        iu02.g(c2719Xa3);
                    } else {
                        z = true;
                    }
                    if (i2 > this.j / 2) {
                        z = true;
                    }
                }
                return i2;
            }
        }
        return 0;
    }

    public C6871ni v() {
        return this.m;
    }

    public int x(Object obj) {
        IU0 iu0F = ((C4106dr) obj).f();
        if (iu0F != null) {
            return (int) (iu0F.f + 0.5f);
        }
        return 0;
    }

    public final void y() {
        int i = this.d * 2;
        this.d = i;
        this.f = (C2719Xa[]) Arrays.copyOf(this.f, i);
        C6871ni c6871ni = this.m;
        c6871ni.d = (IU0[]) Arrays.copyOf(c6871ni.d, this.d);
        int i2 = this.d;
        this.i = new boolean[i2];
        this.e = i2;
        this.l = i2;
    }

    public void z() {
        if (!this.g && !this.h) {
            A(this.c);
            return;
        }
        for (int i = 0; i < this.k; i++) {
            if (!this.f[i].f) {
                A(this.c);
                return;
            }
        }
        n();
    }
}
