package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class DO0 {
    public static final DO0 c;
    public static final DO0 d;
    public static final DO0 e;
    public static final DO0 f;
    public static final DO0 g;
    public final long a;
    public final long b;

    static {
        DO0 do0 = new DO0(0L, 0L);
        c = do0;
        d = new DO0(Long.MAX_VALUE, Long.MAX_VALUE);
        e = new DO0(Long.MAX_VALUE, 0L);
        f = new DO0(0L, Long.MAX_VALUE);
        g = do0;
    }

    public DO0(long j, long j2) {
        AbstractC7115ob.a(j >= 0);
        AbstractC7115ob.a(j2 >= 0);
        this.a = j;
        this.b = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DO0.class == obj.getClass()) {
            DO0 do0 = (DO0) obj;
            if (this.a == do0.a && this.b == do0.b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
