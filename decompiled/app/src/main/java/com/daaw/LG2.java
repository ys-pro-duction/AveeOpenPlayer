package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class LG2 implements JG2 {
    public final String a;

    public LG2(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LG2) {
            return this.a.equals(((LG2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
