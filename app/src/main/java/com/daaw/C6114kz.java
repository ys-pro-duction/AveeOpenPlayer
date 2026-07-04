package com.daaw;

/* JADX INFO: renamed from: com.daaw.kz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6114kz {
    public final C4205eC0 a;
    public final int b;
    public final int c;

    public C6114kz(Class cls, int i, int i2) {
        this(C4205eC0.b(cls), i, i2);
    }

    public static C6114kz a(Class cls) {
        return new C6114kz(cls, 0, 2);
    }

    public static String b(int i) {
        if (i == 0) {
            return "direct";
        }
        if (i == 1) {
            return "provider";
        }
        if (i == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i);
    }

    public static C6114kz h(Class cls) {
        return new C6114kz(cls, 0, 0);
    }

    public static C6114kz i(Class cls) {
        return new C6114kz(cls, 0, 1);
    }

    public static C6114kz j(C4205eC0 c4205eC0) {
        return new C6114kz(c4205eC0, 1, 0);
    }

    public static C6114kz k(Class cls) {
        return new C6114kz(cls, 1, 0);
    }

    public static C6114kz l(Class cls) {
        return new C6114kz(cls, 1, 1);
    }

    public static C6114kz m(Class cls) {
        return new C6114kz(cls, 2, 0);
    }

    public C4205eC0 c() {
        return this.a;
    }

    public boolean d() {
        return this.c == 2;
    }

    public boolean e() {
        return this.c == 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6114kz) {
            C6114kz c6114kz = (C6114kz) obj;
            if (this.a.equals(c6114kz.a) && this.b == c6114kz.b && this.c == c6114kz.c) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        return this.b == 1;
    }

    public boolean g() {
        return this.b == 2;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(b(this.c));
        sb.append("}");
        return sb.toString();
    }

    public C6114kz(C4205eC0 c4205eC0, int i, int i2) {
        this.a = (C4205eC0) AbstractC8063ry0.c(c4205eC0, "Null dependency anInterface.");
        this.b = i;
        this.c = i2;
    }
}
