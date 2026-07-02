package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class DP implements InterfaceC8367t31 {
    public final float a;

    public DP(float f) {
        this.a = f;
    }

    @Override // com.daaw.InterfaceC8367t31
    public float a(InterfaceC4988gz interfaceC4988gz, float f, float f2) {
        G10.g(interfaceC4988gz, "<this>");
        return AbstractC7425ph0.a(f, f2, this.a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DP) && G10.c(Float.valueOf(this.a), Float.valueOf(((DP) obj).a));
    }

    public int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public String toString() {
        return "FractionalThreshold(fraction=" + this.a + ')';
    }
}
