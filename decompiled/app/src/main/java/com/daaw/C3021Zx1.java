package com.daaw;

import java.util.HashMap;

/* JADX INFO: renamed from: com.daaw.Zx1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3021Zx1 extends AbstractC7220ow1 {
    public Long a;
    public Long b;
    public Long c;
    public Long d;
    public Long e;
    public Long f;
    public Long g;
    public Long h;
    public Long i;
    public Long j;
    public Long k;

    public C3021Zx1(String str) {
        HashMap mapA = AbstractC7220ow1.a(str);
        if (mapA != null) {
            this.a = (Long) mapA.get(0);
            this.b = (Long) mapA.get(1);
            this.c = (Long) mapA.get(2);
            this.d = (Long) mapA.get(3);
            this.e = (Long) mapA.get(4);
            this.f = (Long) mapA.get(5);
            this.g = (Long) mapA.get(6);
            this.h = (Long) mapA.get(7);
            this.i = (Long) mapA.get(8);
            this.j = (Long) mapA.get(9);
            this.k = (Long) mapA.get(10);
        }
    }

    @Override // com.daaw.AbstractC7220ow1
    public final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.a);
        map.put(1, this.b);
        map.put(2, this.c);
        map.put(3, this.d);
        map.put(4, this.e);
        map.put(5, this.f);
        map.put(6, this.g);
        map.put(7, this.h);
        map.put(8, this.i);
        map.put(9, this.j);
        map.put(10, this.k);
        return map;
    }
}
