package com.daaw;

/* JADX INFO: renamed from: com.daaw.j11, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C5556j11 {
    public int a;
    public int b;

    public C5556j11(int i, int i2) {
        AbstractC6557mb.d((i & 1) == i, "Generator ID %d contains more than %d reserved bits", Integer.valueOf(i), 1);
        this.b = i;
        d(i2);
    }

    public static C5556j11 a() {
        return new C5556j11(1, 1);
    }

    public static C5556j11 b(int i) {
        C5556j11 c5556j11 = new C5556j11(0, i);
        c5556j11.c();
        return c5556j11;
    }

    public int c() {
        int i = this.a;
        this.a = i + 2;
        return i;
    }

    public final void d(int i) {
        AbstractC6557mb.d((i & 1) == this.b, "Cannot supply target ID from different generator ID", new Object[0]);
        this.a = i;
    }
}
