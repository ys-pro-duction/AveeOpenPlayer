package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class Br3 {
    public final long a;
    public final long b;

    public Br3(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Br3)) {
            return false;
        }
        Br3 br3 = (Br3) obj;
        return this.a == br3.a && this.b == br3.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
