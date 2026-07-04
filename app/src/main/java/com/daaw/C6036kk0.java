package com.daaw;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.kk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6036kk0 {
    public InterfaceC9336wX a;
    public C6324lk0 b = new C6324lk0();
    public List c = new ArrayList();

    public C6036kk0(InterfaceC9336wX interfaceC9336wX) {
        this.a = interfaceC9336wX;
    }

    public void a(InterfaceC10173zX interfaceC10173zX) {
        this.c.add(new WeakReference(interfaceC10173zX));
    }

    public InterfaceC10173zX b(int i) {
        if (i < 0 || i >= this.c.size()) {
            return null;
        }
        return (InterfaceC10173zX) ((WeakReference) this.c.get(i)).get();
    }

    public float c(float f, boolean z, float f2, float f3) {
        return (!z || f3 >= f2) ? f * f2 : f * f3;
    }

    public float d(float f, boolean z, float f2, float f3) {
        return (!z || f2 >= f3) ? f * f3 : f * f2;
    }

    public float e(float f) {
        return f(f, true);
    }

    public float f(float f, boolean z) {
        return f * ((!z || this.a.a() >= this.a.f()) ? this.a.f() : this.a.a());
    }

    public float g(float f, boolean z) {
        return f * ((!z || this.a.f() >= this.a.a()) ? this.a.a() : this.a.f());
    }

    public float h(float f) {
        return f * (this.a.a() < this.a.f() ? this.a.a() : this.a.f());
    }

    public float i(int i) {
        if (i == 1) {
            return this.a.f() * 0.0f;
        }
        if (i == 2) {
            return this.a.f() * 0.5f;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.a.f() * 1.0f;
    }

    public float j(int i) {
        if (i == 1) {
            return this.a.a() * 0.0f;
        }
        if (i == 2) {
            return this.a.a() * 0.5f;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.a.a() * 1.0f;
    }

    public float k(float f, boolean z) {
        return f * ((!z || this.a.a() >= this.a.f()) ? this.a.f() : this.a.a());
    }

    public float l(float f, boolean z) {
        return f * ((!z || this.a.f() >= this.a.a()) ? this.a.a() : this.a.f());
    }

    public String m(String str) {
        String strD = this.a.b().b().d(str);
        if (strD != null) {
            return strD;
        }
        AbstractC0441Bk1.c("result null, " + str);
        return str;
    }

    public C1458Lc1 n(String str, C1458Lc1 c1458Lc1, C1458Lc1 c1458Lc12) {
        C1458Lc1 c1458Lc1A = this.a.b().b().a(str, c1458Lc1, c1458Lc12, this.b, this.a);
        if (c1458Lc1A != null) {
            return c1458Lc1A;
        }
        AbstractC0441Bk1.c("result null, " + str);
        return new C1458Lc1(0.0f, 0.0f);
    }

    public void o() {
        this.c.clear();
    }

    public void p(float f) {
        this.b.a = f;
    }

    public void q(float f) {
        this.b.b = f;
    }
}
