package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class FJ {
    public static final a b = new a(null);
    public static final int c = c(0);
    public static final int d = c(1);
    public final int a;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final int a() {
            return FJ.d;
        }

        public a() {
        }
    }

    public /* synthetic */ FJ(int i) {
        this.a = i;
    }

    public static final /* synthetic */ FJ b(int i) {
        return new FJ(i);
    }

    public static boolean d(int i, Object obj) {
        return (obj instanceof FJ) && i == ((FJ) obj).h();
    }

    public static final boolean e(int i, int i2) {
        return i == i2;
    }

    public static String g(int i) {
        return e(i, c) ? "FabPosition.Center" : "FabPosition.End";
    }

    public boolean equals(Object obj) {
        return d(this.a, obj);
    }

    public final /* synthetic */ int h() {
        return this.a;
    }

    public int hashCode() {
        return f(this.a);
    }

    public String toString() {
        return g(this.a);
    }

    public static int c(int i) {
        return i;
    }

    public static int f(int i) {
        return i;
    }
}
