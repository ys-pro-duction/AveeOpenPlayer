package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class NH2 implements InterfaceC6244lS2 {
    public final /* synthetic */ C10112zH2 a;
    public final /* synthetic */ PH2 b;

    public NH2(PH2 ph2, C10112zH2 c10112zH2) {
        this.b = ph2;
        this.a = c10112zH2;
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final void a(Object obj) {
        this.b.f.c.G(this.a);
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final void b(Throwable th) {
        this.b.f.c.V(this.a, th);
    }
}
