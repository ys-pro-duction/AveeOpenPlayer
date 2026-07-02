package com.daaw;

import java.util.Map;

/* JADX INFO: renamed from: com.daaw.uA2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8682uA2 implements Map.Entry, Comparable {
    public final Comparable B;
    public Object C;
    public final /* synthetic */ AbstractC5341iE2 D;

    public C8682uA2(AbstractC5341iE2 abstractC5341iE2, Comparable comparable, Object obj) {
        this.D = abstractC5341iE2;
        this.B = comparable;
        this.C = obj;
    }

    public static final boolean c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final Comparable a() {
        return this.B;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.B.compareTo(((C8682uA2) obj).B);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return c(this.B, entry.getKey()) && c(this.C, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.B;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.C;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.B;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.C;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.D.o();
        Object obj2 = this.C;
        this.C = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.B) + "=" + String.valueOf(this.C);
    }
}
