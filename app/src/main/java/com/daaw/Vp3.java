package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class Vp3 {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public Vp3(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }

    public final Vp3 a(Object obj) {
        return this.a.equals(obj) ? this : new Vp3(obj, this.b, this.c, this.d, this.e);
    }

    public final boolean b() {
        return this.b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Vp3)) {
            return false;
        }
        Vp3 vp3 = (Vp3) obj;
        return this.a.equals(vp3.a) && this.b == vp3.b && this.c == vp3.c && this.d == vp3.d && this.e == vp3.e;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public Vp3(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    public Vp3(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public Vp3(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }
}
