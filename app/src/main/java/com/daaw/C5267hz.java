package com.daaw;

/* JADX INFO: renamed from: com.daaw.hz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5267hz implements InterfaceC4988gz {
    public final float B;
    public final float C;

    public C5267hz(float f, float f2) {
        this.B = f;
        this.C = f2;
    }

    @Override // com.daaw.InterfaceC4988gz
    public /* synthetic */ float H(int i) {
        return AbstractC4709fz.b(this, i);
    }

    @Override // com.daaw.InterfaceC4988gz
    public float J() {
        return this.C;
    }

    @Override // com.daaw.InterfaceC4988gz
    public /* synthetic */ float O(float f) {
        return AbstractC4709fz.d(this, f);
    }

    @Override // com.daaw.InterfaceC4988gz
    public /* synthetic */ int V(float f) {
        return AbstractC4709fz.a(this, f);
    }

    @Override // com.daaw.InterfaceC4988gz
    public /* synthetic */ long d0(long j) {
        return AbstractC4709fz.e(this, j);
    }

    @Override // com.daaw.InterfaceC4988gz
    public /* synthetic */ float e0(long j) {
        return AbstractC4709fz.c(this, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5267hz)) {
            return false;
        }
        C5267hz c5267hz = (C5267hz) obj;
        return G10.c(Float.valueOf(getDensity()), Float.valueOf(c5267hz.getDensity())) && G10.c(Float.valueOf(J()), Float.valueOf(c5267hz.J()));
    }

    @Override // com.daaw.InterfaceC4988gz
    public float getDensity() {
        return this.B;
    }

    public int hashCode() {
        return (Float.floatToIntBits(getDensity()) * 31) + Float.floatToIntBits(J());
    }

    public String toString() {
        return "DensityImpl(density=" + getDensity() + ", fontScale=" + J() + ')';
    }
}
