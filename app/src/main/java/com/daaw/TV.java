package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class TV {
    public final long a;
    public final long b;

    public /* synthetic */ TV(long j, long j2, AbstractC2911Yw abstractC2911Yw) {
        this(j, j2);
    }

    public final long a() {
        return this.b;
    }

    public final long b() {
        return this.a;
    }

    public String toString() {
        return "HistoricalChange(uptimeMillis=" + this.a + ", position=" + ((Object) C9982yp0.s(this.b)) + ')';
    }

    public TV(long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
