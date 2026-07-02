package com.daaw;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Ee0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0737Ee0 {
    public Map c;
    public Map d;
    public Map e;
    public List f;
    public C3724cV0 g;
    public C7131oe0 h;
    public List i;
    public Rect j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public final C1317Jt0 a = new C1317Jt0();
    public final HashSet b = new HashSet();
    public int o = 0;

    public void a(String str) {
        AbstractC1876Pd0.c(str);
        this.b.add(str);
    }

    public Rect b() {
        return this.j;
    }

    public C3724cV0 c() {
        return this.g;
    }

    public float d() {
        return (long) ((e() / this.m) * 1000.0f);
    }

    public float e() {
        return this.l - this.k;
    }

    public float f() {
        return this.l;
    }

    public Map g() {
        return this.e;
    }

    public float h(float f) {
        return AbstractC9678xk0.i(this.k, this.l, f);
    }

    public float i() {
        return this.m;
    }

    public Map j() {
        return this.d;
    }

    public List k() {
        return this.i;
    }

    public C1888Pg0 l(String str) {
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            C1888Pg0 c1888Pg0 = (C1888Pg0) this.f.get(i);
            if (c1888Pg0.a(str)) {
                return c1888Pg0;
            }
        }
        return null;
    }

    public int m() {
        return this.o;
    }

    public C1317Jt0 n() {
        return this.a;
    }

    public List o(String str) {
        return (List) this.c.get(str);
    }

    public float p() {
        return this.k;
    }

    public boolean q() {
        return this.n;
    }

    public boolean r() {
        return !this.d.isEmpty();
    }

    public void s(int i) {
        this.o += i;
    }

    public void t(Rect rect, float f, float f2, float f3, List list, C7131oe0 c7131oe0, Map map, Map map2, C3724cV0 c3724cV0, Map map3, List list2) {
        this.j = rect;
        this.k = f;
        this.l = f2;
        this.m = f3;
        this.i = list;
        this.h = c7131oe0;
        this.c = map;
        this.d = map2;
        this.g = c3724cV0;
        this.e = map3;
        this.f = list2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            sb.append(((C5595j90) it.next()).y("\t"));
        }
        return sb.toString();
    }

    public C5595j90 u(long j) {
        return (C5595j90) this.h.g(j);
    }

    public void v(boolean z) {
        this.n = z;
    }

    public void w(boolean z) {
        this.a.b(z);
    }
}
