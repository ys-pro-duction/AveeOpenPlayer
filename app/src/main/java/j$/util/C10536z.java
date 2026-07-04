package j$.util;

/* JADX INFO: renamed from: j$.util.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10536z {
    public static final C10536z c = new C10536z();
    public final boolean a;
    public final double b;

    public C10536z() {
        this.a = false;
        this.b = Double.NaN;
    }

    public C10536z(double d) {
        this.a = true;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10536z)) {
            return false;
        }
        C10536z c10536z = (C10536z) obj;
        boolean z = this.a;
        return (z && c10536z.a) ? Double.compare(this.b, c10536z.b) == 0 : z == c10536z.a;
    }

    public final int hashCode() {
        if (!this.a) {
            return 0;
        }
        long jDoubleToLongBits = Double.doubleToLongBits(this.b);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public final String toString() {
        if (this.a) {
            return "OptionalDouble[" + this.b + "]";
        }
        return "OptionalDouble.empty";
    }
}
