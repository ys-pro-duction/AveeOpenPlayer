package com.daaw;

/* JADX INFO: renamed from: com.daaw.jm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5767jm0 {
    public Object a;
    public Object b;

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public void b(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0689Ds0)) {
            return false;
        }
        C0689Ds0 c0689Ds0 = (C0689Ds0) obj;
        return a(c0689Ds0.a, this.a) && a(c0689Ds0.b, this.b);
    }

    public int hashCode() {
        Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.a + " " + this.b + "}";
    }
}
