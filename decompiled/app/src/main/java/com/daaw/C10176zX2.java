package com.daaw;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.daaw.zX2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10176zX2 {
    public static final C10176zX2 b = (C10176zX2) C6268lY2.a(new InterfaceC5980kY2() { // from class: com.daaw.xX2
        @Override // com.daaw.InterfaceC5980kY2
        public final Object zza() {
            C10176zX2 c10176zX2 = new C10176zX2();
            c10176zX2.e(new C4291eX2(C6264lX2.class, XX2.class, new InterfaceC4580fX2() { // from class: com.daaw.yX2
            }));
            return c10176zX2;
        }
    });
    public final AtomicReference a = new AtomicReference(new C5701jY2(new C4017dY2(), null));

    public static C10176zX2 b() {
        return b;
    }

    public final AbstractC8758uT2 a(XX2 xx2, C3444bU2 c3444bU2) {
        return !((C5701jY2) this.a.get()).g(xx2) ? new C6264lX2(xx2, c3444bU2) : ((C5701jY2) this.a.get()).a(xx2, c3444bU2);
    }

    public final InterfaceC3738cY2 c(MT2 mt2, Class cls) {
        return ((C5701jY2) this.a.get()).b(mt2, cls);
    }

    public final synchronized void d(AbstractC4013dX2 abstractC4013dX2) {
        C4017dY2 c4017dY2 = new C4017dY2((C5701jY2) this.a.get());
        c4017dY2.a(abstractC4013dX2);
        this.a.set(new C5701jY2(c4017dY2, null));
    }

    public final synchronized void e(AbstractC5138hX2 abstractC5138hX2) {
        C4017dY2 c4017dY2 = new C4017dY2((C5701jY2) this.a.get());
        c4017dY2.b(abstractC5138hX2);
        this.a.set(new C5701jY2(c4017dY2, null));
    }

    public final synchronized void f(DX2 dx2) {
        C4017dY2 c4017dY2 = new C4017dY2((C5701jY2) this.a.get());
        c4017dY2.c(dx2);
        this.a.set(new C5701jY2(c4017dY2, null));
    }

    public final synchronized void g(HX2 hx2) {
        C4017dY2 c4017dY2 = new C4017dY2((C5701jY2) this.a.get());
        c4017dY2.d(hx2);
        this.a.set(new C5701jY2(c4017dY2, null));
    }
}
