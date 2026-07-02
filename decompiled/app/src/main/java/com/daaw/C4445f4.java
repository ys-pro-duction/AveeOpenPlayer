package com.daaw;

/* JADX INFO: renamed from: com.daaw.f4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4445f4 {
    public int a;

    public C4445f4(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public final boolean b() {
        return this.a != Integer.MIN_VALUE;
    }

    public final void c(int i) {
        this.a = i;
    }

    public final int d(OT0 ot0) {
        G10.g(ot0, "slots");
        return ot0.e(this);
    }

    public final int e(QT0 qt0) {
        G10.g(qt0, "writer");
        return qt0.B(this);
    }
}
