package com.daaw;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class PH2 {
    public final Object a;
    public final String b;
    public final InterfaceFutureC8236sc0 c;
    public final List d;
    public final InterfaceFutureC8236sc0 e;
    public final /* synthetic */ QH2 f;

    public PH2(QH2 qh2, Object obj, String str, InterfaceFutureC8236sc0 interfaceFutureC8236sc0, List list, InterfaceFutureC8236sc0 interfaceFutureC8236sc02) {
        this.f = qh2;
        this.a = obj;
        this.b = str;
        this.c = interfaceFutureC8236sc0;
        this.d = list;
        this.e = interfaceFutureC8236sc02;
    }

    public final C10112zH2 a() {
        Object obj = this.a;
        String strF = this.b;
        if (strF == null) {
            strF = this.f.f(obj);
        }
        final C10112zH2 c10112zH2 = new C10112zH2(obj, strF, this.e);
        this.f.c.g0(c10112zH2);
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0 = this.c;
        Runnable runnable = new Runnable() { // from class: com.daaw.MH2
            @Override // java.lang.Runnable
            public final void run() {
                this.B.f.c.R(c10112zH2);
            }
        };
        PS2 ps2 = AbstractC9322wT1.f;
        interfaceFutureC8236sc0.g(runnable, ps2);
        AbstractC7360pS2.r(c10112zH2, new NH2(this, c10112zH2), ps2);
        return c10112zH2;
    }

    public final PH2 b(Object obj) {
        return this.f.b(obj, a());
    }

    public final PH2 c(Class cls, WR2 wr2) {
        return new PH2(this.f, this.a, this.b, this.c, this.d, AbstractC7360pS2.f(this.e, cls, wr2, this.f.a));
    }

    public final PH2 d(final InterfaceFutureC8236sc0 interfaceFutureC8236sc0) {
        return g(new WR2() { // from class: com.daaw.LH2
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                return interfaceFutureC8236sc0;
            }
        }, AbstractC9322wT1.f);
    }

    public final PH2 e(final InterfaceC9554xH2 interfaceC9554xH2) {
        return f(new WR2() { // from class: com.daaw.KH2
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                return AbstractC7360pS2.h(interfaceC9554xH2.zza(obj));
            }
        });
    }

    public final PH2 f(WR2 wr2) {
        return g(wr2, this.f.a);
    }

    public final PH2 g(WR2 wr2, Executor executor) {
        return new PH2(this.f, this.a, this.b, this.c, this.d, AbstractC7360pS2.n(this.e, wr2, executor));
    }

    public final PH2 h(String str) {
        return new PH2(this.f, this.a, str, this.c, this.d, this.e);
    }

    public final PH2 i(long j, TimeUnit timeUnit) {
        return new PH2(this.f, this.a, this.b, this.c, this.d, AbstractC7360pS2.o(this.e, j, timeUnit, this.f.b));
    }
}
