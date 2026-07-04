package com.daaw;

/* JADX INFO: renamed from: com.daaw.oo1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7182oo1 {
    public static final C7182oo1 c = new C7182oo1(0, 0);
    public final long a;
    public final long b;

    public C7182oo1(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7182oo1.class == obj.getClass()) {
            C7182oo1 c7182oo1 = (C7182oo1) obj;
            if (this.a == c7182oo1.a && this.b == c7182oo1.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public final String toString() {
        return "[timeUs=" + this.a + ", position=" + this.b + "]";
    }
}
