package com.daaw;

import java.util.HashMap;

/* JADX INFO: renamed from: com.daaw.Sx1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2293Sx1 extends AbstractC7220ow1 {
    public Long a;
    public Long b;

    public C2293Sx1(String str) {
        HashMap mapA = AbstractC7220ow1.a(str);
        if (mapA != null) {
            this.a = (Long) mapA.get(0);
            this.b = (Long) mapA.get(1);
        }
    }

    @Override // com.daaw.AbstractC7220ow1
    public final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.a);
        map.put(1, this.b);
        return map;
    }
}
