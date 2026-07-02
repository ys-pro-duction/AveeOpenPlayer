package com.daaw;

import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: renamed from: com.daaw.xz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9748xz0 {
    public static SparseArray a = new SparseArray();
    public static HashMap b;

    static {
        HashMap map = new HashMap();
        b = map;
        map.put(EnumC8911uz0.DEFAULT, 0);
        b.put(EnumC8911uz0.VERY_LOW, 1);
        b.put(EnumC8911uz0.HIGHEST, 2);
        for (EnumC8911uz0 enumC8911uz0 : b.keySet()) {
            a.append(((Integer) b.get(enumC8911uz0)).intValue(), enumC8911uz0);
        }
    }

    public static int a(EnumC8911uz0 enumC8911uz0) {
        Integer num = (Integer) b.get(enumC8911uz0);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + enumC8911uz0);
    }

    public static EnumC8911uz0 b(int i) {
        EnumC8911uz0 enumC8911uz0 = (EnumC8911uz0) a.get(i);
        if (enumC8911uz0 != null) {
            return enumC8911uz0;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i);
    }
}
