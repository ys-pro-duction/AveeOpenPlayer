package com.daaw;

/* JADX INFO: renamed from: com.daaw.nx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6944nx0 {
    public final long a;

    public /* synthetic */ C6944nx0(long j) {
        this.a = j;
    }

    public static final /* synthetic */ C6944nx0 a(long j) {
        return new C6944nx0(j);
    }

    public static boolean c(long j, Object obj) {
        return (obj instanceof C6944nx0) && j == ((C6944nx0) obj).g();
    }

    public static final boolean d(long j, long j2) {
        return j == j2;
    }

    public static int e(long j) {
        return AbstractC2687Ws.a(j);
    }

    public static String f(long j) {
        return "PointerId(value=" + j + ')';
    }

    public boolean equals(Object obj) {
        return c(this.a, obj);
    }

    public final /* synthetic */ long g() {
        return this.a;
    }

    public int hashCode() {
        return e(this.a);
    }

    public String toString() {
        return f(this.a);
    }

    public static long b(long j) {
        return j;
    }
}
