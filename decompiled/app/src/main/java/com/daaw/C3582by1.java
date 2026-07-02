package com.daaw;

import java.util.HashMap;

/* JADX INFO: renamed from: com.daaw.by1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3582by1 extends AbstractC7220ow1 {
    public Long a;
    public Long b;
    public Long c;
    public Long d;
    public Long e;

    public C3582by1(String str) {
        HashMap mapA = AbstractC7220ow1.a(str);
        if (mapA != null) {
            this.a = (Long) mapA.get(0);
            this.b = (Long) mapA.get(1);
            this.c = (Long) mapA.get(2);
            this.d = (Long) mapA.get(3);
            this.e = (Long) mapA.get(4);
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
        return map;
    }
}
