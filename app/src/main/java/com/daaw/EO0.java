package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class EO0 {
    public static final EO0 c = new EO0(0, 0);
    public final long a;
    public final long b;

    public EO0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && EO0.class == obj.getClass()) {
            EO0 eo0 = (EO0) obj;
            if (this.a == eo0.a && this.b == eo0.b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public String toString() {
        return "[timeUs=" + this.a + ", position=" + this.b + "]";
    }
}
