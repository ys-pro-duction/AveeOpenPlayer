package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public class A31 implements InterfaceC7318pI0, InterfaceC7039oI0 {
    public InterfaceC7039oI0 a;
    public InterfaceC7039oI0 b;
    public InterfaceC7318pI0 c;

    public A31(InterfaceC7318pI0 interfaceC7318pI0) {
        this.c = interfaceC7318pI0;
    }

    @Override // com.daaw.InterfaceC7318pI0
    public boolean a() {
        return l() || e();
    }

    @Override // com.daaw.InterfaceC7039oI0
    public void b() {
        this.a.b();
        this.b.b();
    }

    @Override // com.daaw.InterfaceC7039oI0
    public void c() {
        this.a.c();
        this.b.c();
    }

    @Override // com.daaw.InterfaceC7039oI0
    public void clear() {
        this.b.clear();
        this.a.clear();
    }

    @Override // com.daaw.InterfaceC7318pI0
    public boolean d(InterfaceC7039oI0 interfaceC7039oI0) {
        return j() && interfaceC7039oI0.equals(this.a) && !a();
    }

    @Override // com.daaw.InterfaceC7039oI0
    public boolean e() {
        return this.a.e() || this.b.e();
    }

    @Override // com.daaw.InterfaceC7318pI0
    public void f(InterfaceC7039oI0 interfaceC7039oI0) {
        if (interfaceC7039oI0.equals(this.b)) {
            return;
        }
        InterfaceC7318pI0 interfaceC7318pI0 = this.c;
        if (interfaceC7318pI0 != null) {
            interfaceC7318pI0.f(this);
        }
        if (this.b.i()) {
            return;
        }
        this.b.clear();
    }

    @Override // com.daaw.InterfaceC7039oI0
    public void g() {
        if (!this.b.isRunning()) {
            this.b.g();
        }
        if (this.a.isRunning()) {
            return;
        }
        this.a.g();
    }

    @Override // com.daaw.InterfaceC7318pI0
    public boolean h(InterfaceC7039oI0 interfaceC7039oI0) {
        if (k()) {
            return interfaceC7039oI0.equals(this.a) || !this.a.e();
        }
        return false;
    }

    @Override // com.daaw.InterfaceC7039oI0
    public boolean i() {
        return this.a.i() || this.b.i();
    }

    @Override // com.daaw.InterfaceC7039oI0
    public boolean isCancelled() {
        return this.a.isCancelled();
    }

    @Override // com.daaw.InterfaceC7039oI0
    public boolean isRunning() {
        return this.a.isRunning();
    }

    public final boolean j() {
        InterfaceC7318pI0 interfaceC7318pI0 = this.c;
        return interfaceC7318pI0 == null || interfaceC7318pI0.d(this);
    }

    public final boolean k() {
        InterfaceC7318pI0 interfaceC7318pI0 = this.c;
        return interfaceC7318pI0 == null || interfaceC7318pI0.h(this);
    }

    public final boolean l() {
        InterfaceC7318pI0 interfaceC7318pI0 = this.c;
        return interfaceC7318pI0 != null && interfaceC7318pI0.a();
    }

    public void m(InterfaceC7039oI0 interfaceC7039oI0, InterfaceC7039oI0 interfaceC7039oI02) {
        this.a = interfaceC7039oI0;
        this.b = interfaceC7039oI02;
    }
}
