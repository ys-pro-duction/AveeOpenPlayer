package com.daaw;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.daaw.zD2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10096zD2 {
    public final PA1 a;
    public final ES2 b;
    public final ES2 c;
    public final Nb3 d;

    public C10096zD2() {
        PA1 pa1 = new PA1();
        this.a = pa1;
        ES2 es2 = new ES2(null, pa1);
        this.c = es2;
        this.b = es2.a();
        Nb3 nb3 = new Nb3();
        this.d = nb3;
        es2.g("require", new C9158vr3(nb3));
        nb3.a("internal.platform", new Callable() { // from class: com.daaw.do2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new Vs3();
            }
        });
        es2.g("runtime.counter", new C1825Oq1(Double.valueOf(0.0d)));
    }

    public final InterfaceC1637Mv1 a(ES2 es2, C4459f63... c4459f63Arr) {
        InterfaceC1637Mv1 interfaceC1637Mv1A = InterfaceC1637Mv1.t;
        for (C4459f63 c4459f63 : c4459f63Arr) {
            interfaceC1637Mv1A = AbstractC4593fa3.a(c4459f63);
            AbstractC7831r73.c(this.c);
            if ((interfaceC1637Mv1A instanceof C8335sw1) || (interfaceC1637Mv1A instanceof C5253hv1)) {
                interfaceC1637Mv1A = this.a.a(es2, interfaceC1637Mv1A);
            }
        }
        return interfaceC1637Mv1A;
    }
}
