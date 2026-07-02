package com.daaw;

import j$.util.DesugarCollections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Kt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1421Kt0 {
    public final String a;
    public final long b;
    public final List c;
    public final List d;

    public C1421Kt0(String str, long j, List list, List list2) {
        this.a = str;
        this.b = j;
        this.c = DesugarCollections.unmodifiableList(list);
        this.d = DesugarCollections.unmodifiableList(list2);
    }

    public int a(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((W2) this.c.get(i2)).b == i) {
                return i2;
            }
        }
        return -1;
    }
}
