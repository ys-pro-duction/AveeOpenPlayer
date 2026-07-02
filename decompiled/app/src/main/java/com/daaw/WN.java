package com.daaw;

import com.daaw.ZN;

/* JADX INFO: loaded from: classes.dex */
public final class WN implements VN {
    public boolean a = true;
    public ZN b;
    public ZN c;
    public ZN d;
    public ZN e;
    public ZN f;
    public ZN g;
    public ZN h;
    public ZN i;

    public WN() {
        ZN.a aVar = ZN.b;
        this.b = aVar.a();
        this.c = aVar.a();
        this.d = aVar.a();
        this.e = aVar.a();
        this.f = aVar.a();
        this.g = aVar.a();
        this.h = aVar.a();
        this.i = aVar.a();
    }

    @Override // com.daaw.VN
    public ZN a() {
        return this.f;
    }

    @Override // com.daaw.VN
    public boolean b() {
        return this.a;
    }

    @Override // com.daaw.VN
    public ZN c() {
        return this.c;
    }

    @Override // com.daaw.VN
    public ZN d() {
        return this.g;
    }

    @Override // com.daaw.VN
    public ZN e() {
        return this.h;
    }

    @Override // com.daaw.VN
    public void f(ZN zn) {
        G10.g(zn, "<set-?>");
        this.i = zn;
    }

    @Override // com.daaw.VN
    public void g(ZN zn) {
        G10.g(zn, "<set-?>");
        this.g = zn;
    }

    @Override // com.daaw.VN
    public ZN h() {
        return this.d;
    }

    @Override // com.daaw.VN
    public ZN i() {
        return this.b;
    }

    @Override // com.daaw.VN
    public void j(ZN zn) {
        G10.g(zn, "<set-?>");
        this.c = zn;
    }

    @Override // com.daaw.VN
    public ZN k() {
        return this.i;
    }

    @Override // com.daaw.VN
    public void l(ZN zn) {
        G10.g(zn, "<set-?>");
        this.d = zn;
    }

    @Override // com.daaw.VN
    public ZN m() {
        return this.e;
    }

    @Override // com.daaw.VN
    public void n(ZN zn) {
        G10.g(zn, "<set-?>");
        this.b = zn;
    }

    @Override // com.daaw.VN
    public void o(boolean z) {
        this.a = z;
    }

    @Override // com.daaw.VN
    public void p(ZN zn) {
        G10.g(zn, "<set-?>");
        this.f = zn;
    }

    @Override // com.daaw.VN
    public void q(ZN zn) {
        G10.g(zn, "<set-?>");
        this.h = zn;
    }

    @Override // com.daaw.VN
    public void r(ZN zn) {
        G10.g(zn, "<set-?>");
        this.e = zn;
    }
}
