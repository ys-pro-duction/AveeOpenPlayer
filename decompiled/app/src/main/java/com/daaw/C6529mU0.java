package com.daaw;

/* JADX INFO: renamed from: com.daaw.mU0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C6529mU0 {
    public final boolean a;
    public final boolean b;

    public C6529mU0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public boolean a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6529mU0)) {
            return false;
        }
        C6529mU0 c6529mU0 = (C6529mU0) obj;
        return this.a == c6529mU0.a && this.b == c6529mU0.b;
    }

    public int hashCode() {
        return ((this.a ? 1 : 0) * 31) + (this.b ? 1 : 0);
    }

    public String toString() {
        return "SnapshotMetadata{hasPendingWrites=" + this.a + ", isFromCache=" + this.b + '}';
    }
}
