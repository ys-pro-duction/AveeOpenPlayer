package com.daaw;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.Uy1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2505Uy1 {
    public static int a(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }
}
