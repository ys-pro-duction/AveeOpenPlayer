package com.daaw;

/* JADX INFO: renamed from: com.daaw.ee3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4324ee3 {
    public final Object a;
    public final int b;

    public C4324ee3(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4324ee3)) {
            return false;
        }
        C4324ee3 c4324ee3 = (C4324ee3) obj;
        return this.a == c4324ee3.a && this.b == c4324ee3.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
