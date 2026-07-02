package com.daaw;

/* JADX INFO: renamed from: com.daaw.eD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C4208eD {
    public final a a;
    public final LC b;

    /* JADX INFO: renamed from: com.daaw.eD$a */
    public enum a {
        REMOVED,
        ADDED,
        MODIFIED,
        METADATA
    }

    public C4208eD(a aVar, LC lc) {
        this.a = aVar;
        this.b = lc;
    }

    public static C4208eD a(a aVar, LC lc) {
        return new C4208eD(aVar, lc);
    }

    public LC b() {
        return this.b;
    }

    public a c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4208eD)) {
            return false;
        }
        C4208eD c4208eD = (C4208eD) obj;
        return this.a.equals(c4208eD.a) && this.b.equals(c4208eD.b);
    }

    public int hashCode() {
        return ((((1891 + this.a.hashCode()) * 31) + this.b.getKey().hashCode()) * 31) + this.b.h().hashCode();
    }

    public String toString() {
        return "DocumentViewChange(" + this.b + "," + this.a + ")";
    }
}
