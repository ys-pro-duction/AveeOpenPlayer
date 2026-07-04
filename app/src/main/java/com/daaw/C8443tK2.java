package com.daaw;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.tK2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8443tK2 {
    public final SJ2 a;
    public final ArrayList b;

    public C8443tK2(SJ2 sj2, String str) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.a = sj2;
        arrayList.add(str);
    }

    public final SJ2 a() {
        return this.a;
    }

    public final ArrayList b() {
        return this.b;
    }

    public final void c(String str) {
        this.b.add(str);
    }
}
