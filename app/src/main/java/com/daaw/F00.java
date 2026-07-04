package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public class F00 implements Iterable, InterfaceC9783y60 {
    public static final a E = new a(null);
    public final int B;
    public final int C;
    public final int D;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final F00 a(int i, int i2, int i3) {
            return new F00(i, i2, i3);
        }

        public a() {
        }
    }

    public F00(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.B = i;
        this.C = AbstractC2612Vz0.c(i, i2, i3);
        this.D = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof F00)) {
            return false;
        }
        if (isEmpty() && ((F00) obj).isEmpty()) {
            return true;
        }
        F00 f00 = (F00) obj;
        return this.B == f00.B && this.C == f00.C && this.D == f00.D;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.B * 31) + this.C) * 31) + this.D;
    }

    public boolean isEmpty() {
        return this.D > 0 ? this.B > this.C : this.B < this.C;
    }

    public final int p() {
        return this.B;
    }

    public final int s() {
        return this.C;
    }

    public String toString() {
        StringBuilder sb;
        int i;
        if (this.D > 0) {
            sb = new StringBuilder();
            sb.append(this.B);
            sb.append("..");
            sb.append(this.C);
            sb.append(" step ");
            i = this.D;
        } else {
            sb = new StringBuilder();
            sb.append(this.B);
            sb.append(" downTo ");
            sb.append(this.C);
            sb.append(" step ");
            i = -this.D;
        }
        sb.append(i);
        return sb.toString();
    }

    public final int v() {
        return this.D;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public A00 iterator() {
        return new G00(this.B, this.C, this.D);
    }
}
