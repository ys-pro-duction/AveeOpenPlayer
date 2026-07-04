package com.daaw;

import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.Bu1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0481Bu1 {
    public static Object a(Iterable iterable, Object obj) {
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }
}
