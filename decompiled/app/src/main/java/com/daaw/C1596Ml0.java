package com.daaw;

/* JADX INFO: renamed from: com.daaw.Ml0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1596Ml0 {
    public Class a;
    public Class b;

    public C1596Ml0() {
    }

    public void a(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1596Ml0 c1596Ml0 = (C1596Ml0) obj;
        return this.a.equals(c1596Ml0.a) && this.b.equals(c1596Ml0.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "MultiClassKey{first=" + this.a + ", second=" + this.b + '}';
    }

    public C1596Ml0(Class cls, Class cls2) {
        a(cls, cls2);
    }
}
