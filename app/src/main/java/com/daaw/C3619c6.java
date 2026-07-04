package com.daaw;

import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: renamed from: com.daaw.c6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3619c6 implements InterfaceC8595ts0 {
    public Paint a = AbstractC3898d6.i();
    public int b = C2323Tf.b.B();
    public Shader c;
    public C2871Ym d;

    @Override // com.daaw.InterfaceC8595ts0
    public long a() {
        return AbstractC3898d6.c(this.a);
    }

    @Override // com.daaw.InterfaceC8595ts0
    public int b() {
        return AbstractC3898d6.f(this.a);
    }

    @Override // com.daaw.InterfaceC8595ts0
    public void c(float f) {
        AbstractC3898d6.j(this.a, f);
    }

    @Override // com.daaw.InterfaceC8595ts0
    public void d(int i) {
        AbstractC3898d6.q(this.a, i);
    }

    @Override // com.daaw.InterfaceC8595ts0
    public void e(int i) {
        this.b = i;
        AbstractC3898d6.k(this.a, i);
    }

    @Override // com.daaw.InterfaceC8595ts0
    public float f() {
        return AbstractC3898d6.g(this.a);
    }

    @Override // com.daaw.InterfaceC8595ts0
    public C2871Ym g() {
        return this.d;
    }

    @Override // com.daaw.InterfaceC8595ts0
    public Paint h() {
        return this.a;
    }

    @Override // com.daaw.InterfaceC8595ts0
    public void i(Shader shader) {
        this.c = shader;
        AbstractC3898d6.p(this.a, shader);
    }

    @Override // com.daaw.InterfaceC8595ts0
    public Shader j() {
        return this.c;
    }

    @Override // com.daaw.InterfaceC8595ts0
    public void k(float f) {
        AbstractC3898d6.s(this.a, f);
    }

    @Override // com.daaw.InterfaceC8595ts0
    public void l(C2871Ym c2871Ym) {
        this.d = c2871Ym;
        AbstractC3898d6.m(this.a, c2871Ym);
    }

    @Override // com.daaw.InterfaceC8595ts0
    public void m(int i) {
        AbstractC3898d6.n(this.a, i);
    }

    @Override // com.daaw.InterfaceC8595ts0
    public void n(InterfaceC6927nt0 interfaceC6927nt0) {
        AbstractC3898d6.o(this.a, interfaceC6927nt0);
    }

    @Override // com.daaw.InterfaceC8595ts0
    public float o() {
        return AbstractC3898d6.b(this.a);
    }

    @Override // com.daaw.InterfaceC8595ts0
    public int p() {
        return AbstractC3898d6.d(this.a);
    }

    @Override // com.daaw.InterfaceC8595ts0
    public int q() {
        return AbstractC3898d6.e(this.a);
    }

    @Override // com.daaw.InterfaceC8595ts0
    public void r(int i) {
        AbstractC3898d6.r(this.a, i);
    }

    @Override // com.daaw.InterfaceC8595ts0
    public void s(int i) {
        AbstractC3898d6.u(this.a, i);
    }

    @Override // com.daaw.InterfaceC8595ts0
    public void t(long j) {
        AbstractC3898d6.l(this.a, j);
    }

    @Override // com.daaw.InterfaceC8595ts0
    public InterfaceC6927nt0 u() {
        return null;
    }

    @Override // com.daaw.InterfaceC8595ts0
    public void v(float f) {
        AbstractC3898d6.t(this.a, f);
    }

    @Override // com.daaw.InterfaceC8595ts0
    public float w() {
        return AbstractC3898d6.h(this.a);
    }

    @Override // com.daaw.InterfaceC8595ts0
    public int x() {
        return this.b;
    }
}
