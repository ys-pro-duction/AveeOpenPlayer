package com.daaw;

/* JADX INFO: renamed from: com.daaw.mI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6481mI0 implements Comparable {
    public final int B;
    public final int C;
    public final int D;

    public C6481mI0(int i, int i2, int i3) {
        this.B = i;
        this.C = i2;
        this.D = i3;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C6481mI0 c6481mI0) {
        int i = this.B - c6481mI0.B;
        if (i != 0) {
            return i;
        }
        int i2 = this.C - c6481mI0.C;
        return i2 == 0 ? this.D - c6481mI0.D : i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C6481mI0.class == obj.getClass()) {
            C6481mI0 c6481mI0 = (C6481mI0) obj;
            if (this.B == c6481mI0.B && this.C == c6481mI0.C && this.D == c6481mI0.D) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.B * 31) + this.C) * 31) + this.D;
    }

    public String toString() {
        return this.B + "." + this.C + "." + this.D;
    }
}
