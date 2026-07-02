package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class NM implements InterfaceC7479ps {
    public final float b;

    public NM(float f) {
        this.b = f;
    }

    @Override // com.daaw.InterfaceC7479ps
    public long a(long j, long j2) {
        float f = this.b;
        return AbstractC6222lN0.a(f, f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NM) && G10.c(Float.valueOf(this.b), Float.valueOf(((NM) obj).b));
    }

    public int hashCode() {
        return Float.floatToIntBits(this.b);
    }

    public String toString() {
        return "FixedScale(value=" + this.b + ')';
    }
}
