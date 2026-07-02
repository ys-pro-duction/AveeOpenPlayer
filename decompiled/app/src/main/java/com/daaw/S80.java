package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class S80 implements Comparable {
    public static final a F = new a(null);
    public static final S80 G = T80.a();
    public final int B;
    public final int C;
    public final int D;
    public final int E;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    public S80(int i, int i2, int i3) {
        this.B = i;
        this.C = i2;
        this.D = i3;
        this.E = c(i, i2, i3);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(S80 s80) {
        G10.g(s80, "other");
        return this.E - s80.E;
    }

    public final int c(int i, int i2, int i3) {
        if (i >= 0 && i < 256 && i2 >= 0 && i2 < 256 && i3 >= 0 && i3 < 256) {
            return (i << 16) + (i2 << 8) + i3;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        S80 s80 = obj instanceof S80 ? (S80) obj : null;
        return s80 != null && this.E == s80.E;
    }

    public int hashCode() {
        return this.E;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.B);
        sb.append('.');
        sb.append(this.C);
        sb.append('.');
        sb.append(this.D);
        return sb.toString();
    }

    public S80(int i, int i2) {
        this(i, i2, 0);
    }
}
