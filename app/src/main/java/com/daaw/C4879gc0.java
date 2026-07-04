package com.daaw;

/* JADX INFO: renamed from: com.daaw.gc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4879gc0 {
    public final Object a;
    public final Object b;

    public C4879gc0(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean a() {
        return this.b != JG.a;
    }

    public final boolean b() {
        return this.a != JG.a;
    }

    public final Object c() {
        return this.b;
    }

    public final Object d() {
        return this.a;
    }

    public final C4879gc0 e(Object obj) {
        return new C4879gc0(this.a, obj);
    }

    public final C4879gc0 f(Object obj) {
        return new C4879gc0(obj, this.b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C4879gc0() {
        JG jg = JG.a;
        this(jg, jg);
    }

    public C4879gc0(Object obj) {
        this(obj, JG.a);
    }
}
