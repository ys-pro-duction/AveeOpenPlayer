package com.daaw;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.a20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3043a20 {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public AbstractC3043a20(int i, boolean z, int i2, int i3) {
        this(i, z, true, i2, i3);
    }

    public void a(Object obj, AbstractC7524q2 abstractC7524q2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add(obj);
        arrayList2.add(abstractC7524q2);
        b(arrayList, arrayList2);
    }

    public abstract void b(List list, List list2);

    public int c() {
        return this.a;
    }

    public int d() {
        return this.c;
    }

    public boolean e() {
        return true;
    }

    public boolean f() {
        return this.d;
    }

    public boolean g() {
        return this.e;
    }

    public boolean h() {
        return this.f;
    }

    public AbstractC3043a20(int i, boolean z, boolean z2, int i2, int i3) {
        this(i, z, z2, i2, i3, false);
    }

    public AbstractC3043a20(int i, boolean z, boolean z2, int i2, int i3, boolean z3) {
        this.d = z;
        this.e = z2;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.f = z3;
    }
}
