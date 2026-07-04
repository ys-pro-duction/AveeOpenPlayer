package com.daaw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class R80 {
    public static final C2448Uk0 a = new C2448Uk0("KotlinTypeRefiner");

    public static final C2448Uk0 a() {
        return a;
    }

    public static final List b(Q80 q80, Iterable iterable) {
        G10.g(q80, "<this>");
        G10.g(iterable, "types");
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(q80.a((I80) it.next()));
        }
        return arrayList;
    }
}
