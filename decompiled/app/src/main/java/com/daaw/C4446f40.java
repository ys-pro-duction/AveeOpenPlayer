package com.daaw;

/* JADX INFO: renamed from: com.daaw.f40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4446f40 {
    public final Object a;
    public final Object b;

    public C4446f40(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final int a(Object obj) {
        if (obj instanceof Enum) {
            return ((Enum) obj).ordinal();
        }
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4446f40)) {
            return false;
        }
        C4446f40 c4446f40 = (C4446f40) obj;
        return G10.c(this.a, c4446f40.a) && G10.c(this.b, c4446f40.b);
    }

    public int hashCode() {
        return (a(this.a) * 31) + a(this.b);
    }

    public String toString() {
        return "JoinedKey(left=" + this.a + ", right=" + this.b + ')';
    }
}
