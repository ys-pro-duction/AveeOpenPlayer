package com.daaw;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ZT extends AbstractC4034dc1 {
    public float[] b;
    public final List c;
    public List d;
    public boolean e;
    public InterfaceC6090kt0 f;
    public C10002yt0 g;
    public LQ h;
    public String i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public boolean q;

    public ZT() {
        super(null);
        this.c = new ArrayList();
        this.d = AbstractC3203ad1.e();
        this.e = true;
        this.i = "";
        this.m = 1.0f;
        this.n = 1.0f;
        this.q = true;
    }

    @Override // com.daaw.AbstractC4034dc1
    public void a(OD od) {
        G10.g(od, "<this>");
        if (this.q) {
            u();
            this.q = false;
        }
        if (this.e) {
            t();
            this.e = false;
        }
        ID idR = od.R();
        long jA = idR.a();
        idR.d().i();
        RD rdB = idR.b();
        float[] fArr = this.b;
        if (fArr != null) {
            rdB.d(C9384wh0.a(fArr).n());
        }
        InterfaceC6090kt0 interfaceC6090kt0 = this.f;
        if (g() && interfaceC6090kt0 != null) {
            QD.a(rdB, interfaceC6090kt0, 0, 2, null);
        }
        List list = this.c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC4034dc1) list.get(i)).a(od);
        }
        idR.d().o();
        idR.c(jA);
    }

    @Override // com.daaw.AbstractC4034dc1
    public LQ b() {
        return this.h;
    }

    @Override // com.daaw.AbstractC4034dc1
    public void d(LQ lq) {
        this.h = lq;
        List list = this.c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC4034dc1) list.get(i)).d(lq);
        }
    }

    public final String e() {
        return this.i;
    }

    public final int f() {
        return this.c.size();
    }

    public final boolean g() {
        return !this.d.isEmpty();
    }

    public final void h(int i, AbstractC4034dc1 abstractC4034dc1) {
        G10.g(abstractC4034dc1, "instance");
        if (i < f()) {
            this.c.set(i, abstractC4034dc1);
        } else {
            this.c.add(abstractC4034dc1);
        }
        abstractC4034dc1.d(b());
        c();
    }

    public final void i(int i, int i2, int i3) {
        int i4 = 0;
        if (i > i2) {
            while (i4 < i3) {
                AbstractC4034dc1 abstractC4034dc1 = (AbstractC4034dc1) this.c.get(i);
                this.c.remove(i);
                this.c.add(i2, abstractC4034dc1);
                i2++;
                i4++;
            }
        } else {
            while (i4 < i3) {
                AbstractC4034dc1 abstractC4034dc12 = (AbstractC4034dc1) this.c.get(i);
                this.c.remove(i);
                this.c.add(i2 - 1, abstractC4034dc12);
                i4++;
            }
        }
        c();
    }

    public final void j(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (i < this.c.size()) {
                ((AbstractC4034dc1) this.c.get(i)).d(null);
                this.c.remove(i);
            }
        }
        c();
    }

    public final void k(List list) {
        G10.g(list, "value");
        this.d = list;
        this.e = true;
        c();
    }

    public final void l(String str) {
        G10.g(str, "value");
        this.i = str;
        c();
    }

    public final void m(float f) {
        this.k = f;
        this.q = true;
        c();
    }

    public final void n(float f) {
        this.l = f;
        this.q = true;
        c();
    }

    public final void o(float f) {
        this.j = f;
        this.q = true;
        c();
    }

    public final void p(float f) {
        this.m = f;
        this.q = true;
        c();
    }

    public final void q(float f) {
        this.n = f;
        this.q = true;
        c();
    }

    public final void r(float f) {
        this.o = f;
        this.q = true;
        c();
    }

    public final void s(float f) {
        this.p = f;
        this.q = true;
        c();
    }

    public final void t() {
        if (g()) {
            C10002yt0 c10002yt0 = this.g;
            if (c10002yt0 == null) {
                c10002yt0 = new C10002yt0();
                this.g = c10002yt0;
            } else {
                c10002yt0.e();
            }
            InterfaceC6090kt0 interfaceC6090kt0A = this.f;
            if (interfaceC6090kt0A == null) {
                interfaceC6090kt0A = AbstractC6428m6.a();
                this.f = interfaceC6090kt0A;
            } else {
                interfaceC6090kt0A.reset();
            }
            c10002yt0.b(this.d).D(interfaceC6090kt0A);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VGroup: ");
        sb.append(this.i);
        List list = this.c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AbstractC4034dc1 abstractC4034dc1 = (AbstractC4034dc1) list.get(i);
            sb.append("\t");
            sb.append(abstractC4034dc1.toString());
            sb.append("\n");
        }
        String string = sb.toString();
        G10.f(string, "sb.toString()");
        return string;
    }

    public final void u() {
        float[] fArrC = this.b;
        if (fArrC == null) {
            fArrC = C9384wh0.c(null, 1, null);
            this.b = fArrC;
        } else {
            C9384wh0.h(fArrC);
        }
        float[] fArr = fArrC;
        C9384wh0.m(fArr, this.k + this.o, this.l + this.p, 0.0f, 4, null);
        C9384wh0.i(fArr, this.j);
        C9384wh0.j(fArr, this.m, this.n, 1.0f);
        C9384wh0.m(fArr, -this.k, -this.l, 0.0f, 4, null);
    }
}
