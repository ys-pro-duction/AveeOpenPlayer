package com.daaw;

import com.daaw.AbstractC7261p50;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.j50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5575j50 {
    public static final List a(List list) {
        G10.g(list, "<this>");
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC7261p50.e.c cVar = (AbstractC7261p50.e.c) it.next();
            int I = cVar.I();
            for (int i = 0; i < I; i++) {
                arrayList.add(cVar);
            }
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
