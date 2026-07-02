package com.daaw;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class IT1 {
    public final BT1 a;
    public final AtomicInteger b;

    public IT1() {
        BT1 bt1 = new BT1();
        this.a = bt1;
        this.b = new AtomicInteger(0);
        AbstractC7360pS2.r(bt1, new GT1(this), AbstractC9322wT1.f);
    }

    public final int a() {
        return this.b.get();
    }

    public final void c() {
        this.a.c(new Exception());
    }

    public final void d(Object obj) {
        this.a.b(obj);
    }

    public final void e(FT1 ft1, DT1 dt1) {
        AbstractC7360pS2.r(this.a, new HT1(this, ft1, dt1), AbstractC9322wT1.f);
    }
}
