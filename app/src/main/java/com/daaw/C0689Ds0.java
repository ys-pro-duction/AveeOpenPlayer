package com.daaw;

/* JADX INFO: renamed from: com.daaw.Ds0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0689Ds0 {
    public final Object a;
    public final Object b;

    public C0689Ds0(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public static C0689Ds0 a(Object obj, Object obj2) {
        return new C0689Ds0(obj, obj2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0689Ds0)) {
            return false;
        }
        C0689Ds0 c0689Ds0 = (C0689Ds0) obj;
        return AbstractC8580tp0.a(c0689Ds0.a, this.a) && AbstractC8580tp0.a(c0689Ds0.b, this.b);
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
