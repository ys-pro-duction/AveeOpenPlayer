package com.daaw;

import java.util.LinkedHashSet;
import java.util.Locale;

/* JADX INFO: renamed from: com.daaw.td0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8520td0 {
    public static C5163hd0 a(C5163hd0 c5163hd0, C5163hd0 c5163hd02) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        while (i < c5163hd0.g() + c5163hd02.g()) {
            Locale localeD = i < c5163hd0.g() ? c5163hd0.d(i) : c5163hd02.d(i - c5163hd0.g());
            if (localeD != null) {
                linkedHashSet.add(localeD);
            }
            i++;
        }
        return C5163hd0.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    public static C5163hd0 b(C5163hd0 c5163hd0, C5163hd0 c5163hd02) {
        return (c5163hd0 == null || c5163hd0.f()) ? C5163hd0.e() : a(c5163hd0, c5163hd02);
    }
}
