package com.daaw;

import java.util.HashMap;

/* JADX INFO: renamed from: com.daaw.xx1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9741xx1 extends AbstractC7220ow1 {
    public long a;
    public long b;

    public C9741xx1(String str) {
        this.a = -1L;
        this.b = -1L;
        HashMap mapA = AbstractC7220ow1.a(str);
        if (mapA != null) {
            this.a = ((Long) mapA.get(0)).longValue();
            this.b = ((Long) mapA.get(1)).longValue();
        }
    }

    @Override // com.daaw.AbstractC7220ow1
    public final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, Long.valueOf(this.a));
        map.put(1, Long.valueOf(this.b));
        return map;
    }
}
