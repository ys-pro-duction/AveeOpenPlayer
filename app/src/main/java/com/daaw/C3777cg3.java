package com.daaw;

/* JADX INFO: renamed from: com.daaw.cg3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3777cg3 {
    public static final C3777cg3 c;
    public static final C3777cg3 d;
    public static final C3777cg3 e;
    public static final C3777cg3 f;
    public static final C3777cg3 g;
    public final long a;
    public final long b;

    static {
        C3777cg3 c3777cg3 = new C3777cg3(0L, 0L);
        c = c3777cg3;
        d = new C3777cg3(Long.MAX_VALUE, Long.MAX_VALUE);
        e = new C3777cg3(Long.MAX_VALUE, 0L);
        f = new C3777cg3(0L, Long.MAX_VALUE);
        g = c3777cg3;
    }

    public C3777cg3(long j, long j2) {
        AbstractC6048km2.d(j >= 0);
        AbstractC6048km2.d(j2 >= 0);
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3777cg3.class == obj.getClass()) {
            C3777cg3 c3777cg3 = (C3777cg3) obj;
            if (this.a == c3777cg3.a && this.b == c3777cg3.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
