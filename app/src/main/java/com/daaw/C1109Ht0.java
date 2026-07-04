package com.daaw;

/* JADX INFO: renamed from: com.daaw.Ht0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1109Ht0 implements InterfaceC3281at {
    public final float a;

    public C1109Ht0(float f) {
        this.a = f;
        if (f < 0.0f || f > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    @Override // com.daaw.InterfaceC3281at
    public float a(long j, InterfaceC4988gz interfaceC4988gz) {
        G10.g(interfaceC4988gz, "density");
        return C9879yT0.h(j) * (this.a / 100.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1109Ht0) && G10.c(Float.valueOf(this.a), Float.valueOf(((C1109Ht0) obj).a));
    }

    public int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public String toString() {
        return "CornerSize(size = " + this.a + "%)";
    }
}
