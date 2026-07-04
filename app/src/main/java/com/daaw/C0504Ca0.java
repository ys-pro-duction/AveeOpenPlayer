package com.daaw;

/* JADX INFO: renamed from: com.daaw.Ca0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0504Ca0 {
    public final C7251p30 a;
    public final InterfaceC4188e81 b;
    public final O90 c;
    public final O90 d;
    public final L30 e;

    public C0504Ca0(C7251p30 c7251p30, InterfaceC4188e81 interfaceC4188e81, O90 o90) {
        G10.g(c7251p30, "components");
        G10.g(interfaceC4188e81, "typeParameterResolver");
        G10.g(o90, "delegateForDefaultTypeQualifiers");
        this.a = c7251p30;
        this.b = interfaceC4188e81;
        this.c = o90;
        this.d = o90;
        this.e = new L30(this, interfaceC4188e81);
    }

    public final C7251p30 a() {
        return this.a;
    }

    public final J30 b() {
        return (J30) this.d.getValue();
    }

    public final O90 c() {
        return this.c;
    }

    public final InterfaceC2968Zk0 d() {
        return this.a.m();
    }

    public final InterfaceC10174zX0 e() {
        return this.a.u();
    }

    public final InterfaceC4188e81 f() {
        return this.b;
    }

    public final L30 g() {
        return this.e;
    }
}
