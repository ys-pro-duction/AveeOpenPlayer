package com.daaw;

/* JADX INFO: renamed from: com.daaw.Wb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2620Wb0 {
    public final a a;
    public final TC b;

    /* JADX INFO: renamed from: com.daaw.Wb0$a */
    public enum a {
        ADDED,
        REMOVED
    }

    public C2620Wb0(a aVar, TC tc) {
        this.a = aVar;
        this.b = tc;
    }

    public TC a() {
        return this.b;
    }

    public a b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2620Wb0)) {
            return false;
        }
        C2620Wb0 c2620Wb0 = (C2620Wb0) obj;
        return this.a.equals(c2620Wb0.b()) && this.b.equals(c2620Wb0.a());
    }

    public int hashCode() {
        return ((2077 + this.a.hashCode()) * 31) + this.b.hashCode();
    }
}
