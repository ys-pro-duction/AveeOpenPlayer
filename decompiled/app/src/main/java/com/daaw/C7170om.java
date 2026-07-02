package com.daaw;

/* JADX INFO: renamed from: com.daaw.om, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7170om implements InterfaceC7449pm {
    public final float B;
    public final float C;

    public C7170om(float f, float f2) {
        this.B = f;
        this.C = f2;
    }

    @Override // com.daaw.InterfaceC7728qm
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float m() {
        return Float.valueOf(this.C);
    }

    @Override // com.daaw.InterfaceC7728qm
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Float e() {
        return Float.valueOf(this.B);
    }

    public boolean c() {
        return this.B > this.C;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7170om)) {
            return false;
        }
        if (c() && ((C7170om) obj).c()) {
            return true;
        }
        C7170om c7170om = (C7170om) obj;
        return this.B == c7170om.B && this.C == c7170om.C;
    }

    public int hashCode() {
        if (c()) {
            return -1;
        }
        return (Float.floatToIntBits(this.B) * 31) + Float.floatToIntBits(this.C);
    }

    public String toString() {
        return this.B + ".." + this.C;
    }
}
