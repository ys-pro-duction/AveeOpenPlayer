package com.daaw;

import java.util.HashMap;

/* JADX INFO: renamed from: com.daaw.Ox1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1853Ox1 extends AbstractC7220ow1 {
    public Long a;
    public Boolean b;
    public Boolean c;

    public C1853Ox1(String str) {
        HashMap mapA = AbstractC7220ow1.a(str);
        if (mapA != null) {
            this.a = (Long) mapA.get(0);
            this.b = (Boolean) mapA.get(1);
            this.c = (Boolean) mapA.get(2);
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
