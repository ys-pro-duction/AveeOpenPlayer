package com.daaw;

/* JADX INFO: renamed from: com.daaw.zp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C10261zp0 implements InterfaceC8783ua {
    public final InterfaceC8783ua a;
    public final int b;
    public int c;

    public C10261zp0(InterfaceC8783ua interfaceC8783ua, int i) {
        G10.g(interfaceC8783ua, "applier");
        this.a = interfaceC8783ua;
        this.b = i;
    }

    @Override // com.daaw.InterfaceC8783ua
    public Object a() {
        return this.a.a();
    }

    @Override // com.daaw.InterfaceC8783ua
    public void b(int i, Object obj) {
        this.a.b(i + (this.c == 0 ? this.b : 0), obj);
    }

    @Override // com.daaw.InterfaceC8783ua
    public void c(Object obj) {
        this.c++;
        this.a.c(obj);
    }

    @Override // com.daaw.InterfaceC8783ua
    public void clear() {
        AbstractC6348lp.x("Clear is not valid on OffsetApplier");
        throw new D80();
    }

    @Override // com.daaw.InterfaceC8783ua
    public /* synthetic */ void d() {
        AbstractC8504ta.a(this);
    }

    @Override // com.daaw.InterfaceC8783ua
    public void e(int i, int i2, int i3) {
        int i4 = this.c == 0 ? this.b : 0;
        this.a.e(i + i4, i2 + i4, i3);
    }

    @Override // com.daaw.InterfaceC8783ua
    public void f(int i, int i2) {
        this.a.f(i + (this.c == 0 ? this.b : 0), i2);
    }

    @Override // com.daaw.InterfaceC8783ua
    public void g() {
        int i = this.c;
        if (!(i > 0)) {
            AbstractC6348lp.x("OffsetApplier up called with no corresponding down");
            throw new D80();
        }
        this.c = i - 1;
        this.a.g();
    }

    @Override // com.daaw.InterfaceC8783ua
    public void h(int i, Object obj) {
        this.a.h(i + (this.c == 0 ? this.b : 0), obj);
    }

    @Override // com.daaw.InterfaceC8783ua
    public /* synthetic */ void i() {
        AbstractC8504ta.b(this);
    }
}
