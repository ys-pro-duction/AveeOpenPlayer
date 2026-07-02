package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.Sm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2247Sm extends AbstractC2141Rm {
    public static List P(List list) {
        G10.g(list, "<this>");
        return new C8716uJ0(list);
    }

    public static List Q(List list) {
        G10.g(list, "<this>");
        return new C8437tJ0(list);
    }

    public static final int R(List list, int i) {
        if (i >= 0 && i <= AbstractC1599Mm.m(list)) {
            return AbstractC1599Mm.m(list) - i;
        }
        throw new IndexOutOfBoundsException("Element index " + i + " must be in range [" + new H00(0, AbstractC1599Mm.m(list)) + "].");
    }

    public static final int S(List list, int i) {
        return AbstractC1599Mm.m(list) - i;
    }

    public static final int T(List list, int i) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        throw new IndexOutOfBoundsException("Position index " + i + " must be in range [" + new H00(0, list.size()) + "].");
    }
}
