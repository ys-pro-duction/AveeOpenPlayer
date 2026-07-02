package com.daaw;

import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Nc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1664Nc0 {
    public final int a;
    public final SY b;

    public C1664Nc0(int i, SY sy) {
        this.a = i;
        this.b = sy;
    }

    public static C1664Nc0 a(int i, Map map) {
        SY syA = NC.a();
        for (Map.Entry entry : map.entrySet()) {
            syA = syA.v((TC) entry.getKey(), ((C0468Br0) entry.getValue()).a());
        }
        return new C1664Nc0(i, syA);
    }

    public int b() {
        return this.a;
    }

    public SY c() {
        return this.b;
    }
}
