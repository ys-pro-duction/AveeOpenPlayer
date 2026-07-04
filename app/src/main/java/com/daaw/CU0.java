package com.daaw;

import com.google.firebase.Timestamp;

/* JADX INFO: loaded from: classes3.dex */
public final class CU0 implements Comparable {
    public static final CU0 C = new CU0(new Timestamp(0, 0));
    public final Timestamp B;

    public CU0(Timestamp timestamp) {
        this.B = timestamp;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(CU0 cu0) {
        return this.B.compareTo(cu0.B);
    }

    public Timestamp c() {
        return this.B;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof CU0) && compareTo((CU0) obj) == 0;
    }

    public int hashCode() {
        return c().hashCode();
    }

    public String toString() {
        return "SnapshotVersion(seconds=" + this.B.g() + ", nanos=" + this.B.c() + ")";
    }
}
