package com.daaw;

/* JADX INFO: renamed from: com.daaw.ku1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6096ku1 {
    public final Object a;
    public final C1214It1 b;
    public final C6933nu1 c;
    public boolean d;

    public C6096ku1(C6933nu1 c6933nu1) {
        this.d = false;
        this.a = null;
        this.b = null;
        this.c = c6933nu1;
    }

    public static C6096ku1 a(C6933nu1 c6933nu1) {
        return new C6096ku1(c6933nu1);
    }

    public static C6096ku1 b(Object obj, C1214It1 c1214It1) {
        return new C6096ku1(obj, c1214It1);
    }

    public final boolean c() {
        return this.c == null;
    }

    public C6096ku1(Object obj, C1214It1 c1214It1) {
        this.d = false;
        this.a = obj;
        this.b = c1214It1;
        this.c = null;
    }
}
