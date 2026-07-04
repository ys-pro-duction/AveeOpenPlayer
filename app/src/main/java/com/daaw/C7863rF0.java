package com.daaw;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.rF0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7863rF0 {
    public UY a;
    public UY b;

    public C7863rF0() {
        List list = Collections.EMPTY_LIST;
        this.a = new UY(list, YC.c);
        this.b = new UY(list, YC.d);
    }

    public void a(TC tc, int i) {
        YC yc = new YC(tc, i);
        this.a = this.a.p(yc);
        this.b = this.b.p(yc);
    }

    public void b(UY uy, int i) {
        Iterator it = uy.iterator();
        while (it.hasNext()) {
            a((TC) it.next(), i);
        }
    }

    public boolean c(TC tc) {
        Iterator itQ = this.a.q(new YC(tc, 0));
        if (itQ.hasNext()) {
            return ((YC) itQ.next()).d().equals(tc);
        }
        return false;
    }

    public UY d(int i) {
        Iterator itQ = this.b.q(new YC(TC.g(), i));
        UY uyH = TC.h();
        while (itQ.hasNext()) {
            YC yc = (YC) itQ.next();
            if (yc.c() != i) {
                break;
            }
            uyH = uyH.p(yc.d());
        }
        return uyH;
    }

    public void e(TC tc, int i) {
        f(new YC(tc, i));
    }

    public final void f(YC yc) {
        this.a = this.a.s(yc);
        this.b = this.b.s(yc);
    }

    public void g(UY uy, int i) {
        Iterator it = uy.iterator();
        while (it.hasNext()) {
            e((TC) it.next(), i);
        }
    }

    public UY h(int i) {
        Iterator itQ = this.b.q(new YC(TC.g(), i));
        UY uyH = TC.h();
        while (itQ.hasNext()) {
            YC yc = (YC) itQ.next();
            if (yc.c() != i) {
                break;
            }
            uyH = uyH.p(yc.d());
            f(yc);
        }
        return uyH;
    }
}
