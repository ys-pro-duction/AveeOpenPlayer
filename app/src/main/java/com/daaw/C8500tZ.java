package com.daaw;

/* JADX INFO: renamed from: com.daaw.tZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8500tZ {
    public final int a;
    public final Object b;

    public C8500tZ(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final int a() {
        return this.a;
    }

    public final Object b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    public final Object d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8500tZ)) {
            return false;
        }
        C8500tZ c8500tZ = (C8500tZ) obj;
        return this.a == c8500tZ.a && G10.c(this.b, c8500tZ.b);
    }

    public int hashCode() {
        int i = this.a * 31;
        Object obj = this.b;
        return i + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "IndexedValue(index=" + this.a + ", value=" + this.b + ')';
    }
}
