package com.daaw;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.daaw.oe3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7134oe3 extends AD2 {
    public Handler c;
    public boolean d;
    public final C6297le3 e;
    public final C5450ie3 f;
    public final C3767ce3 g;

    public C7134oe3(C9327wU2 c9327wU2) {
        super(c9327wU2);
        this.d = true;
        this.e = new C6297le3(this);
        this.f = new C5450ie3(this);
        this.g = new C3767ce3(this);
    }

    public static /* bridge */ /* synthetic */ void m(C7134oe3 c7134oe3, long j) {
        c7134oe3.d();
        c7134oe3.r();
        c7134oe3.a.w().s().b("Activity paused, time", Long.valueOf(j));
        c7134oe3.g.a(j);
        if (c7134oe3.a.z().D()) {
            c7134oe3.f.b(j);
        }
    }

    public static /* bridge */ /* synthetic */ void n(C7134oe3 c7134oe3, long j) {
        c7134oe3.d();
        c7134oe3.r();
        c7134oe3.a.w().s().b("Activity resumed, time", Long.valueOf(j));
        if (c7134oe3.a.z().B(null, AbstractC1311Jr2.I0)) {
            if (c7134oe3.a.z().D() || c7134oe3.d) {
                c7134oe3.f.c(j);
            }
        } else if (c7134oe3.a.z().D() || c7134oe3.a.F().r.b()) {
            c7134oe3.f.c(j);
        }
        c7134oe3.g.b();
        C6297le3 c6297le3 = c7134oe3.e;
        c6297le3.a.d();
        if (c6297le3.a.a.k()) {
            c6297le3.b(c6297le3.a.a.p().a(), false);
        }
    }

    @Override // com.daaw.AD2
    public final boolean j() {
        return false;
    }

    public final void o(boolean z) {
        d();
        this.d = z;
    }

    public final boolean q() {
        d();
        return this.d;
    }

    public final void r() {
        d();
        if (this.c == null) {
            this.c = new HandlerC5113hR1(Looper.getMainLooper());
        }
    }
}
