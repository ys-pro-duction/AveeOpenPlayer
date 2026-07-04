package com.daaw;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class PJ2 {
    public static final PJ2 c = new PJ2();
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();

    public static PJ2 a() {
        return c;
    }

    public final Collection b() {
        return DesugarCollections.unmodifiableCollection(this.b);
    }

    public final Collection c() {
        return DesugarCollections.unmodifiableCollection(this.a);
    }

    public final void d(CJ2 cj2) {
        this.a.add(cj2);
    }

    public final void e(CJ2 cj2) {
        ArrayList arrayList = this.a;
        boolean zG = g();
        arrayList.remove(cj2);
        this.b.remove(cj2);
        if (!zG || g()) {
            return;
        }
        C3125aK2.c().g();
    }

    public final void f(CJ2 cj2) {
        ArrayList arrayList = this.b;
        boolean zG = g();
        arrayList.add(cj2);
        if (zG) {
            return;
        }
        C3125aK2.c().f();
    }

    public final boolean g() {
        return this.b.size() > 0;
    }
}
