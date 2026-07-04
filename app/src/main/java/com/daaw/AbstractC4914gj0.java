package com.daaw;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.gj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4914gj0 {
    public static final Set a(Iterable iterable) {
        G10.g(iterable, "<this>");
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Set setE = ((InterfaceC4346ej0) it.next()).e();
            if (setE == null) {
                return null;
            }
            AbstractC2141Rm.A(hashSet, setE);
        }
        return hashSet;
    }
}
