package com.daaw;

/* JADX INFO: renamed from: com.daaw.eR0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4265eR0 {
    public static final a d = new a(null);
    public static final C4265eR0 e = new C4265eR0(0, 0, 0.0f, 7, null);
    public final long a;
    public final long b;
    public final float c;

    /* JADX INFO: renamed from: com.daaw.eR0$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final C4265eR0 a() {
            return C4265eR0.e;
        }

        public a() {
        }
    }

    public /* synthetic */ C4265eR0(long j, long j2, float f, AbstractC2911Yw abstractC2911Yw) {
        this(j, j2, f);
    }

    public final float b() {
        return this.c;
    }

    public final long c() {
        return this.a;
    }

    public final long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4265eR0)) {
            return false;
        }
        C4265eR0 c4265eR0 = (C4265eR0) obj;
        return C2559Vm.o(this.a, c4265eR0.a) && C9982yp0.i(this.b, c4265eR0.b) && this.c == c4265eR0.c;
    }

    public int hashCode() {
        return (((C2559Vm.u(this.a) * 31) + C9982yp0.n(this.b)) * 31) + Float.floatToIntBits(this.c);
    }

    public String toString() {
        return "Shadow(color=" + ((Object) C2559Vm.v(this.a)) + ", offset=" + ((Object) C9982yp0.s(this.b)) + ", blurRadius=" + this.c + ')';
    }

    public C4265eR0(long j, long j2, float f) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public /* synthetic */ C4265eR0(long j, long j2, float f, int i, AbstractC2911Yw abstractC2911Yw) {
        this((i & 1) != 0 ? AbstractC3530bn.c(4278190080L) : j, (i & 2) != 0 ? C9982yp0.b.c() : j2, (i & 4) != 0 ? 0.0f : f, null);
    }
}
