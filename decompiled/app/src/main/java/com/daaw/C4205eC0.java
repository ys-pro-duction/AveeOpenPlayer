package com.daaw;

/* JADX INFO: renamed from: com.daaw.eC0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4205eC0 {
    public final Class a;
    public final Class b;

    /* JADX INFO: renamed from: com.daaw.eC0$a */
    public @interface a {
    }

    public C4205eC0(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public static C4205eC0 a(Class cls, Class cls2) {
        return new C4205eC0(cls, cls2);
    }

    public static C4205eC0 b(Class cls) {
        return new C4205eC0(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4205eC0.class != obj.getClass()) {
            return false;
        }
        C4205eC0 c4205eC0 = (C4205eC0) obj;
        if (this.b.equals(c4205eC0.b)) {
            return this.a.equals(c4205eC0.a);
        }
        return false;
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public String toString() {
        if (this.a == a.class) {
            return this.b.getName();
        }
        return "@" + this.a.getName() + " " + this.b.getName();
    }
}
