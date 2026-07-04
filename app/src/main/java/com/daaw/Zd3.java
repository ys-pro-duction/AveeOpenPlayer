package com.daaw;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class Zd3 implements Runnable {
    public final long B;
    public final long C;
    public final /* synthetic */ C3767ce3 D;

    public Zd3(C3767ce3 c3767ce3, long j, long j2) {
        this.D = c3767ce3;
        this.B = j;
        this.C = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.D.b.a.x().z(new Runnable() { // from class: com.daaw.Xd3
            @Override // java.lang.Runnable
            public final void run() {
                Zd3 zd3 = this.B;
                C3767ce3 c3767ce3 = zd3.D;
                long j = zd3.B;
                long j2 = zd3.C;
                c3767ce3.b.d();
                c3767ce3.b.a.w().m().a("Application going to the background");
                c3767ce3.b.a.F().r.a(true);
                c3767ce3.b.o(true);
                if (!c3767ce3.b.a.z().D()) {
                    c3767ce3.b.f.b(j2);
                    c3767ce3.b.f.d(false, false, j2);
                }
                Zm3.b();
                if (c3767ce3.b.a.z().B(null, AbstractC1311Jr2.D0)) {
                    c3767ce3.b.a.w().r().b("Application backgrounded at: timestamp_millis", Long.valueOf(j));
                } else {
                    c3767ce3.b.a.I().s("auto", "_ab", j, new Bundle());
                }
            }
        });
    }
}
