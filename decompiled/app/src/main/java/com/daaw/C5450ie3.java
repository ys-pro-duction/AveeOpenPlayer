package com.daaw;

import android.os.Bundle;

/* JADX INFO: renamed from: com.daaw.ie3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5450ie3 {
    public long a;
    public long b;
    public final AbstractC0585Cu1 c;
    public final /* synthetic */ C7134oe3 d;

    public C5450ie3(C7134oe3 c7134oe3) {
        this.d = c7134oe3;
        this.c = new C4613fe3(this, c7134oe3.a);
        long jB = c7134oe3.a.p().b();
        this.a = jB;
        this.b = jB;
    }

    public final void a() {
        this.c.b();
        this.a = 0L;
        this.b = 0L;
    }

    public final void b(long j) {
        this.c.b();
    }

    public final void c(long j) {
        this.d.d();
        this.c.b();
        this.a = j;
        this.b = j;
    }

    public final boolean d(boolean z, boolean z2, long j) {
        this.d.d();
        this.d.e();
        C5484il3.b();
        if (!this.d.a.z().B(null, AbstractC1311Jr2.h0) || this.d.a.k()) {
            this.d.a.F().o.b(this.d.a.p().a());
        }
        long j2 = j - this.a;
        if (!z && j2 < 1000) {
            this.d.a.w().s().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
            return false;
        }
        if (!z2) {
            j2 = j - this.b;
            this.b = j;
        }
        this.d.a.w().s().b("Recording user engagement, ms", Long.valueOf(j2));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        Pf3.y(this.d.a.K().o(!this.d.a.z().D()), bundle, true);
        if (!z2) {
            this.d.a.I().r("auto", "_e", bundle);
        }
        this.a = j;
        this.c.b();
        this.c.d(3600000L);
        return true;
    }
}
