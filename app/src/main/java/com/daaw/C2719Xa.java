package com.daaw;

import com.daaw.C4311ec0;
import com.daaw.IU0;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.Xa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2719Xa implements C4311ec0.a {
    public a e;
    public IU0 a = null;
    public float b = 0.0f;
    public boolean c = false;
    public ArrayList d = new ArrayList();
    public boolean f = false;

    /* JADX INFO: renamed from: com.daaw.Xa$a */
    public interface a {
        float a(IU0 iu0, boolean z);

        int b();

        void c(IU0 iu0, float f, boolean z);

        void clear();

        IU0 d(int i);

        float e(IU0 iu0);

        void f();

        float g(int i);

        void h(IU0 iu0, float f);

        boolean i(IU0 iu0);

        void j(float f);

        float k(C2719Xa c2719Xa, boolean z);
    }

    public C2719Xa() {
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String A() {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C2719Xa.A():java.lang.String");
    }

    public void B(C4311ec0 c4311ec0, IU0 iu0, boolean z) {
        if (iu0.g) {
            this.b += iu0.f * this.e.e(iu0);
            this.e.a(iu0, z);
            if (z) {
                iu0.c(this);
            }
        }
    }

    public void C(C2719Xa c2719Xa, boolean z) {
        this.b += c2719Xa.b * this.e.k(c2719Xa, z);
        if (z) {
            c2719Xa.a.c(this);
        }
    }

    public void D(C4311ec0 c4311ec0) {
        if (c4311ec0.f.length == 0) {
            return;
        }
        boolean z = false;
        while (!z) {
            int iB = this.e.b();
            for (int i = 0; i < iB; i++) {
                IU0 iu0D = this.e.d(i);
                if (iu0D.d != -1 || iu0D.g) {
                    this.d.add(iu0D);
                }
            }
            if (this.d.size() > 0) {
                for (IU0 iu0 : this.d) {
                    if (iu0.g) {
                        B(c4311ec0, iu0, true);
                    } else {
                        C(c4311ec0.f[iu0.d], true);
                    }
                }
                this.d.clear();
            } else {
                z = true;
            }
        }
    }

    @Override // com.daaw.C4311ec0.a
    public void a(IU0 iu0) {
        int i = iu0.e;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.e.h(iu0, f);
    }

    @Override // com.daaw.C4311ec0.a
    public void b(C4311ec0.a aVar) {
        if (aVar instanceof C2719Xa) {
            C2719Xa c2719Xa = (C2719Xa) aVar;
            this.a = null;
            this.e.clear();
            for (int i = 0; i < c2719Xa.e.b(); i++) {
                this.e.c(c2719Xa.e.d(i), c2719Xa.e.g(i), true);
            }
        }
    }

    @Override // com.daaw.C4311ec0.a
    public IU0 c(C4311ec0 c4311ec0, boolean[] zArr) {
        return x(zArr, null);
    }

    @Override // com.daaw.C4311ec0.a
    public void clear() {
        this.e.clear();
        this.a = null;
        this.b = 0.0f;
    }

    public C2719Xa d(C4311ec0 c4311ec0, int i) {
        this.e.h(c4311ec0.o(i, "ep"), 1.0f);
        this.e.h(c4311ec0.o(i, "em"), -1.0f);
        return this;
    }

    public C2719Xa e(IU0 iu0, int i) {
        this.e.h(iu0, i);
        return this;
    }

    public boolean f(C4311ec0 c4311ec0) {
        boolean z;
        IU0 iu0G = g(c4311ec0);
        if (iu0G == null) {
            z = true;
        } else {
            y(iu0G);
            z = false;
        }
        if (this.e.b() == 0) {
            this.f = true;
        }
        return z;
    }

    public IU0 g(C4311ec0 c4311ec0) {
        int iB = this.e.b();
        IU0 iu0 = null;
        IU0 iu02 = null;
        boolean z = false;
        boolean z2 = false;
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i = 0; i < iB; i++) {
            float fG = this.e.g(i);
            IU0 iu0D = this.e.d(i);
            if (iu0D.j == IU0.a.UNRESTRICTED) {
                if (iu0 == null || f > fG) {
                    boolean zV = v(iu0D, c4311ec0);
                    z = zV;
                    f = fG;
                    iu0 = iu0D;
                } else if (!z && v(iu0D, c4311ec0)) {
                    f = fG;
                    iu0 = iu0D;
                    z = true;
                }
            } else if (iu0 == null && fG < 0.0f) {
                if (iu02 == null || f2 > fG) {
                    boolean zV2 = v(iu0D, c4311ec0);
                    z2 = zV2;
                    f2 = fG;
                    iu02 = iu0D;
                } else if (!z2 && v(iu0D, c4311ec0)) {
                    f2 = fG;
                    iu02 = iu0D;
                    z2 = true;
                }
            }
        }
        return iu0 != null ? iu0 : iu02;
    }

    @Override // com.daaw.C4311ec0.a
    public IU0 getKey() {
        return this.a;
    }

    public C2719Xa h(IU0 iu0, IU0 iu02, int i, float f, IU0 iu03, IU0 iu04, int i2) {
        if (iu02 == iu03) {
            this.e.h(iu0, 1.0f);
            this.e.h(iu04, 1.0f);
            this.e.h(iu02, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.e.h(iu0, 1.0f);
            this.e.h(iu02, -1.0f);
            this.e.h(iu03, -1.0f);
            this.e.h(iu04, 1.0f);
            if (i > 0 || i2 > 0) {
                this.b = (-i) + i2;
                return this;
            }
        } else {
            if (f <= 0.0f) {
                this.e.h(iu0, -1.0f);
                this.e.h(iu02, 1.0f);
                this.b = i;
                return this;
            }
            if (f >= 1.0f) {
                this.e.h(iu04, -1.0f);
                this.e.h(iu03, 1.0f);
                this.b = -i2;
                return this;
            }
            float f2 = 1.0f - f;
            this.e.h(iu0, f2 * 1.0f);
            this.e.h(iu02, f2 * (-1.0f));
            this.e.h(iu03, (-1.0f) * f);
            this.e.h(iu04, 1.0f * f);
            if (i > 0 || i2 > 0) {
                this.b = ((-i) * f2) + (i2 * f);
                return this;
            }
        }
        return this;
    }

    public C2719Xa i(IU0 iu0, int i) {
        this.a = iu0;
        float f = i;
        iu0.f = f;
        this.b = f;
        this.f = true;
        return this;
    }

    public C2719Xa j(IU0 iu0, IU0 iu02, float f) {
        this.e.h(iu0, -1.0f);
        this.e.h(iu02, f);
        return this;
    }

    public C2719Xa k(IU0 iu0, IU0 iu02, IU0 iu03, IU0 iu04, float f) {
        this.e.h(iu0, -1.0f);
        this.e.h(iu02, 1.0f);
        this.e.h(iu03, f);
        this.e.h(iu04, -f);
        return this;
    }

    public C2719Xa l(float f, float f2, float f3, IU0 iu0, IU0 iu02, IU0 iu03, IU0 iu04) {
        this.b = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.e.h(iu0, 1.0f);
            this.e.h(iu02, -1.0f);
            this.e.h(iu04, 1.0f);
            this.e.h(iu03, -1.0f);
            return this;
        }
        if (f == 0.0f) {
            this.e.h(iu0, 1.0f);
            this.e.h(iu02, -1.0f);
            return this;
        }
        if (f3 == 0.0f) {
            this.e.h(iu03, 1.0f);
            this.e.h(iu04, -1.0f);
            return this;
        }
        float f4 = (f / f2) / (f3 / f2);
        this.e.h(iu0, 1.0f);
        this.e.h(iu02, -1.0f);
        this.e.h(iu04, f4);
        this.e.h(iu03, -f4);
        return this;
    }

    public C2719Xa m(IU0 iu0, int i) {
        if (i < 0) {
            this.b = i * (-1);
            this.e.h(iu0, 1.0f);
            return this;
        }
        this.b = i;
        this.e.h(iu0, -1.0f);
        return this;
    }

    public C2719Xa n(IU0 iu0, IU0 iu02, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (z) {
            this.e.h(iu0, 1.0f);
            this.e.h(iu02, -1.0f);
            return this;
        }
        this.e.h(iu0, -1.0f);
        this.e.h(iu02, 1.0f);
        return this;
    }

    public C2719Xa o(IU0 iu0, IU0 iu02, IU0 iu03, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (z) {
            this.e.h(iu0, 1.0f);
            this.e.h(iu02, -1.0f);
            this.e.h(iu03, -1.0f);
            return this;
        }
        this.e.h(iu0, -1.0f);
        this.e.h(iu02, 1.0f);
        this.e.h(iu03, 1.0f);
        return this;
    }

    public C2719Xa p(IU0 iu0, IU0 iu02, IU0 iu03, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (z) {
            this.e.h(iu0, 1.0f);
            this.e.h(iu02, -1.0f);
            this.e.h(iu03, 1.0f);
            return this;
        }
        this.e.h(iu0, -1.0f);
        this.e.h(iu02, 1.0f);
        this.e.h(iu03, -1.0f);
        return this;
    }

    public C2719Xa q(IU0 iu0, IU0 iu02, IU0 iu03, IU0 iu04, float f) {
        this.e.h(iu03, 0.5f);
        this.e.h(iu04, 0.5f);
        this.e.h(iu0, -0.5f);
        this.e.h(iu02, -0.5f);
        this.b = -f;
        return this;
    }

    public void r() {
        float f = this.b;
        if (f < 0.0f) {
            this.b = f * (-1.0f);
            this.e.f();
        }
    }

    public boolean s() {
        IU0 iu0 = this.a;
        if (iu0 != null) {
            return iu0.j == IU0.a.UNRESTRICTED || this.b >= 0.0f;
        }
        return false;
    }

    public boolean t(IU0 iu0) {
        return this.e.i(iu0);
    }

    public String toString() {
        return A();
    }

    public boolean u() {
        return this.a == null && this.b == 0.0f && this.e.b() == 0;
    }

    public final boolean v(IU0 iu0, C4311ec0 c4311ec0) {
        return iu0.m <= 1;
    }

    public IU0 w(IU0 iu0) {
        return x(null, iu0);
    }

    public final IU0 x(boolean[] zArr, IU0 iu0) {
        IU0.a aVar;
        int iB = this.e.b();
        IU0 iu02 = null;
        float f = 0.0f;
        for (int i = 0; i < iB; i++) {
            float fG = this.e.g(i);
            if (fG < 0.0f) {
                IU0 iu0D = this.e.d(i);
                if ((zArr == null || !zArr[iu0D.c]) && iu0D != iu0 && (((aVar = iu0D.j) == IU0.a.SLACK || aVar == IU0.a.ERROR) && fG < f)) {
                    f = fG;
                    iu02 = iu0D;
                }
            }
        }
        return iu02;
    }

    public void y(IU0 iu0) {
        IU0 iu02 = this.a;
        if (iu02 != null) {
            this.e.h(iu02, -1.0f);
            this.a = null;
        }
        float fA = this.e.a(iu0, true) * (-1.0f);
        this.a = iu0;
        if (fA == 1.0f) {
            return;
        }
        this.b /= fA;
        this.e.j(fA);
    }

    public void z() {
        this.a = null;
        this.e.clear();
        this.b = 0.0f;
        this.f = false;
    }

    public C2719Xa(C6871ni c6871ni) {
        this.e = new C2197Sa(this, c6871ni);
    }
}
