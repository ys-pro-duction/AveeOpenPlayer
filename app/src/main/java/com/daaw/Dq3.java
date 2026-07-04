package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class Dq3 {
    public final int a;
    public final boolean b;

    public Dq3(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Dq3.class == obj.getClass()) {
            Dq3 dq3 = (Dq3) obj;
            if (this.a == dq3.a && this.b == dq3.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1 : 0);
    }
}
