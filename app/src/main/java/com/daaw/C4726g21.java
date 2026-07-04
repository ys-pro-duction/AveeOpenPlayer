package com.daaw;

/* JADX INFO: renamed from: com.daaw.g21, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4726g21 {
    public static final a c = new a(null);
    public static final C4726g21 d = new C4726g21(0, 0, 3, null);
    public final long a;
    public final long b;

    /* JADX INFO: renamed from: com.daaw.g21$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final C4726g21 a() {
            return C4726g21.d;
        }

        public a() {
        }
    }

    public /* synthetic */ C4726g21(long j, long j2, AbstractC2911Yw abstractC2911Yw) {
        this(j, j2);
    }

    public final long b() {
        return this.a;
    }

    public final long c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4726g21)) {
            return false;
        }
        C4726g21 c4726g21 = (C4726g21) obj;
        return S21.e(this.a, c4726g21.a) && S21.e(this.b, c4726g21.b);
    }

    public int hashCode() {
        return (S21.i(this.a) * 31) + S21.i(this.b);
    }

    public String toString() {
        return "TextIndent(firstLine=" + ((Object) S21.j(this.a)) + ", restLine=" + ((Object) S21.j(this.b)) + ')';
    }

    public C4726g21(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public /* synthetic */ C4726g21(long j, long j2, int i, AbstractC2911Yw abstractC2911Yw) {
        this((i & 1) != 0 ? T21.d(0) : j, (i & 2) != 0 ? T21.d(0) : j2, null);
    }
}
