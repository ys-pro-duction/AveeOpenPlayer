package com.daaw;

import java.util.HashMap;

/* JADX INFO: renamed from: com.daaw.sx1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8339sx1 extends AbstractC7220ow1 {
    public Long a;
    public Long b;
    public Long c;

    public C8339sx1(String str) {
        HashMap mapA = AbstractC7220ow1.a(str);
        if (mapA != null) {
            this.a = (Long) mapA.get(0);
            this.b = (Long) mapA.get(1);
            this.c = (Long) mapA.get(2);
        }
    }

    @Override // com.daaw.AbstractC7220ow1
    public final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.a);
        map.put(1, this.b);
        map.put(2, this.c);
        return map;
    }
}
