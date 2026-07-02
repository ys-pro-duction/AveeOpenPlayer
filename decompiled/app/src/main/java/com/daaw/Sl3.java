package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class Sl3 {
    public boolean b;
    public C4653fm3 d;
    public Dl3 e;
    public C4922gk3 a = C4922gk3.c;
    public final Ql3 c = Ql3.a;

    public final Sl3 c(C4922gk3 c4922gk3) {
        this.a = c4922gk3;
        return this;
    }

    public final Sl3 d(InterfaceC6028ki2[] interfaceC6028ki2Arr) {
        this.d = new C4653fm3(interfaceC6028ki2Arr);
        return this;
    }

    public final Nm3 e() {
        AbstractC6048km2.f(!this.b);
        this.b = true;
        if (this.d == null) {
            this.d = new C4653fm3(new InterfaceC6028ki2[0]);
        }
        Km3 km3 = null;
        if (this.e == null) {
            this.e = new Dl3(null);
        }
        return new Nm3(this, km3);
    }
}
