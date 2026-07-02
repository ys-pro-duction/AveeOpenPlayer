package com.daaw;

/* JADX INFO: renamed from: com.daaw.cz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3864cz0 {
    public String a;
    public Long b;

    public C3864cz0(String str, boolean z) {
        this(str, z ? 1L : 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3864cz0)) {
            return false;
        }
        C3864cz0 c3864cz0 = (C3864cz0) obj;
        if (!this.a.equals(c3864cz0.a)) {
            return false;
        }
        Long l = this.b;
        Long l2 = c3864cz0.b;
        return l != null ? l.equals(l2) : l2 == null;
    }

    public int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public C3864cz0(String str, long j) {
        this.a = str;
        this.b = Long.valueOf(j);
    }
}
