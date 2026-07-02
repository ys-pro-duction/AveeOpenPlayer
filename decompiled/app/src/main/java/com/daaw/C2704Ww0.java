package com.daaw;

/* JADX INFO: renamed from: com.daaw.Ww0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2704Ww0 {
    public final long a;
    public final long b;

    public /* synthetic */ C2704Ww0(long j, long j2, AbstractC2911Yw abstractC2911Yw) {
        this(j, j2);
    }

    public final long a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2704Ww0)) {
            return false;
        }
        C2704Ww0 c2704Ww0 = (C2704Ww0) obj;
        return C9982yp0.i(this.a, c2704Ww0.a) && this.b == c2704Ww0.b;
    }

    public int hashCode() {
        return (C9982yp0.n(this.a) * 31) + AbstractC2687Ws.a(this.b);
    }

    public String toString() {
        return "PointAtTime(point=" + ((Object) C9982yp0.s(this.a)) + ", time=" + this.b + ')';
    }

    public C2704Ww0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
