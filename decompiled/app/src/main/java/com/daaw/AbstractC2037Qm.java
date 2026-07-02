package com.daaw;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Qm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2037Qm extends AbstractC1911Pm {
    public static void y(List list) {
        G10.g(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static void z(List list, Comparator comparator) {
        G10.g(list, "<this>");
        G10.g(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
