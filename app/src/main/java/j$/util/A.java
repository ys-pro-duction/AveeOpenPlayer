package j$.util;

/* JADX INFO: loaded from: classes2.dex */
public final class A {
    public static final A c = new A();
    public final boolean a;
    public final long b;

    public A() {
        this.a = false;
        this.b = 0L;
    }

    public A(long j) {
        this.a = true;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a = (A) obj;
        boolean z = this.a;
        return (z && a.a) ? this.b == a.b : z == a.a;
    }

    public final int hashCode() {
        if (!this.a) {
            return 0;
        }
        long j = this.b;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        if (this.a) {
            return "OptionalLong[" + this.b + "]";
        }
        return "OptionalLong.empty";
    }
}
