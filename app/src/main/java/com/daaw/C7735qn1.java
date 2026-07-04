package com.daaw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.qn1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7735qn1 {
    public C1498Lm1 a;
    public C1498Lm1 b;
    public final List c;

    public C7735qn1() {
        this.a = new C1498Lm1("", 0L, null);
        this.b = new C1498Lm1("", 0L, null);
        this.c = new ArrayList();
    }

    public final C1498Lm1 a() {
        return this.a;
    }

    public final C1498Lm1 b() {
        return this.b;
    }

    public final List c() {
        return this.c;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        C7735qn1 c7735qn1 = new C7735qn1(this.a.clone());
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            c7735qn1.c.add(((C1498Lm1) it.next()).clone());
        }
        return c7735qn1;
    }

    public final void d(C1498Lm1 c1498Lm1) {
        this.a = c1498Lm1;
        this.b = c1498Lm1.clone();
        this.c.clear();
    }

    public final void e(String str, long j, Map map) {
        this.c.add(new C1498Lm1(str, j, map));
    }

    public final void f(C1498Lm1 c1498Lm1) {
        this.b = c1498Lm1;
    }

    public C7735qn1(C1498Lm1 c1498Lm1) {
        this.a = c1498Lm1;
        this.b = c1498Lm1.clone();
        this.c = new ArrayList();
    }
}
