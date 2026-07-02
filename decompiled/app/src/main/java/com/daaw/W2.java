package com.daaw;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class W2 {
    public final int a;
    public final int b;
    public final List c;
    public final List d;
    public final List e;

    public W2(int i, int i2, List list, List list2, List list3) {
        this.a = i;
        this.b = i2;
        this.c = DesugarCollections.unmodifiableList(list);
        this.d = list2 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(list2);
        this.e = list3 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(list3);
    }
}
