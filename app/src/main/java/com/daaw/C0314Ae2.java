package com.daaw;

/* JADX INFO: renamed from: com.daaw.Ae2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0314Ae2 {
    public XG1 a;
    public UG1 b;
    public InterfaceC7036oH1 c;
    public InterfaceC5073hH1 d;
    public InterfaceC6769nK1 e;
    public final BS0 f = new BS0();
    public final BS0 g = new BS0();

    public final C0314Ae2 a(UG1 ug1) {
        this.b = ug1;
        return this;
    }

    public final C0314Ae2 b(XG1 xg1) {
        this.a = xg1;
        return this;
    }

    public final C0314Ae2 c(String str, InterfaceC3948dH1 interfaceC3948dH1, InterfaceC3112aH1 interfaceC3112aH1) {
        this.f.put(str, interfaceC3948dH1);
        if (interfaceC3112aH1 != null) {
            this.g.put(str, interfaceC3112aH1);
        }
        return this;
    }

    public final C0314Ae2 d(InterfaceC6769nK1 interfaceC6769nK1) {
        this.e = interfaceC6769nK1;
        return this;
    }

    public final C0314Ae2 e(InterfaceC5073hH1 interfaceC5073hH1) {
        this.d = interfaceC5073hH1;
        return this;
    }

    public final C0314Ae2 f(InterfaceC7036oH1 interfaceC7036oH1) {
        this.c = interfaceC7036oH1;
        return this;
    }

    public final C0522Ce2 g() {
        return new C0522Ce2(this);
    }
}
