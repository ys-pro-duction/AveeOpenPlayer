package com.daaw;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.aK2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3125aK2 implements QJ2 {
    public static C3125aK2 f;
    public float a = 0.0f;
    public final MJ2 b;
    public final KJ2 c;
    public LJ2 d;
    public PJ2 e;

    public C3125aK2(MJ2 mj2, KJ2 kj2) {
        this.b = mj2;
        this.c = kj2;
    }

    public static C3125aK2 c() {
        if (f == null) {
            f = new C3125aK2(new MJ2(), new KJ2());
        }
        return f;
    }

    public final float a() {
        return this.a;
    }

    @Override // com.daaw.QJ2
    public final void b(boolean z) {
        if (z) {
            EK2.d().i();
        } else {
            EK2.d().h();
        }
    }

    public final void d(Context context) {
        this.d = new LJ2(new Handler(), context, new JJ2(), this);
    }

    public final void e(float f2) {
        this.a = f2;
        if (this.e == null) {
            this.e = PJ2.a();
        }
        Iterator it = this.e.b().iterator();
        while (it.hasNext()) {
            ((CJ2) it.next()).g().i(f2);
        }
    }

    public final void f() {
        OJ2.i().e(this);
        OJ2.i().f();
        EK2.d().i();
        this.d.a();
    }

    public final void g() {
        EK2.d().j();
        OJ2.i().g();
        this.d.b();
    }
}
