package com.daaw;

import com.daaw.C9982yp0;

/* JADX INFO: renamed from: com.daaw.pd1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7406pd1 {
    public static final a e = new a(null);
    public static final C7406pd1 f;
    public final long a;
    public final float b;
    public final long c;
    public final long d;

    /* JADX INFO: renamed from: com.daaw.pd1$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final C7406pd1 a() {
            return C7406pd1.f;
        }

        public a() {
        }
    }

    static {
        C9982yp0.a aVar = C9982yp0.b;
        f = new C7406pd1(aVar.c(), 1.0f, 0L, aVar.c(), null);
    }

    public /* synthetic */ C7406pd1(long j, float f2, long j2, long j3, AbstractC2911Yw abstractC2911Yw) {
        this(j, f2, j2, j3);
    }

    public final long b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7406pd1)) {
            return false;
        }
        C7406pd1 c7406pd1 = (C7406pd1) obj;
        return C9982yp0.i(this.a, c7406pd1.a) && G10.c(Float.valueOf(this.b), Float.valueOf(c7406pd1.b)) && this.c == c7406pd1.c && C9982yp0.i(this.d, c7406pd1.d);
    }

    public int hashCode() {
        return (((((C9982yp0.n(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + AbstractC2687Ws.a(this.c)) * 31) + C9982yp0.n(this.d);
    }

    public String toString() {
        return "VelocityEstimate(pixelsPerSecond=" + ((Object) C9982yp0.s(this.a)) + ", confidence=" + this.b + ", durationMillis=" + this.c + ", offset=" + ((Object) C9982yp0.s(this.d)) + ')';
    }

    public C7406pd1(long j, float f2, long j2, long j3) {
        this.a = j;
        this.b = f2;
        this.c = j2;
        this.d = j3;
    }
}
