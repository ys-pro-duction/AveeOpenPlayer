package com.daaw;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class OV0 {
    public static ArrayList a(ArrayList arrayList) {
        G10.g(arrayList, "backing");
        return arrayList;
    }

    public static /* synthetic */ ArrayList b(ArrayList arrayList, int i, AbstractC2911Yw abstractC2911Yw) {
        if ((i & 1) != 0) {
            arrayList = new ArrayList();
        }
        return a(arrayList);
    }

    public static final int c(ArrayList arrayList) {
        return arrayList.size();
    }

    public static final Object d(ArrayList arrayList) {
        return arrayList.get(c(arrayList) - 1);
    }

    public static final Object e(ArrayList arrayList) {
        return arrayList.remove(c(arrayList) - 1);
    }

    public static final boolean f(ArrayList arrayList, Object obj) {
        return arrayList.add(obj);
    }
}
