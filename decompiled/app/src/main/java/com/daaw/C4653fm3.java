package com.daaw;

/* JADX INFO: renamed from: com.daaw.fm3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4653fm3 {
    public final InterfaceC6028ki2[] a;
    public final C4369en3 b;
    public final C2654Wj2 c;

    public C4653fm3(InterfaceC6028ki2... interfaceC6028ki2Arr) {
        C4369en3 c4369en3 = new C4369en3();
        C2654Wj2 c2654Wj2 = new C2654Wj2();
        InterfaceC6028ki2[] interfaceC6028ki2Arr2 = {c4369en3, c2654Wj2};
        this.a = interfaceC6028ki2Arr2;
        System.arraycopy(interfaceC6028ki2Arr, 0, interfaceC6028ki2Arr2, 0, 0);
        this.b = c4369en3;
        this.c = c2654Wj2;
    }

    public final long a(long j) {
        return this.c.c(j);
    }

    public final long b() {
        return this.b.i();
    }

    public final C7375pW1 c(C7375pW1 c7375pW1) {
        this.c.e(c7375pW1.a);
        this.c.d(c7375pW1.b);
        return c7375pW1;
    }

    public final boolean d(boolean z) {
        this.b.j(z);
        return z;
    }

    public final InterfaceC6028ki2[] e() {
        return this.a;
    }
}
