package com.daaw;

import java.io.InputStream;

/* JADX INFO: renamed from: com.daaw.lP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6229lP implements InterfaceC2867Yl {
    @Override // com.daaw.LX0
    public boolean a() {
        return o().a();
    }

    @Override // com.daaw.LX0
    public void b(InterfaceC2675Wp interfaceC2675Wp) {
        o().b(interfaceC2675Wp);
    }

    @Override // com.daaw.LX0
    public void c(int i) {
        o().c(i);
    }

    @Override // com.daaw.InterfaceC2867Yl
    public void d(int i) {
        o().d(i);
    }

    @Override // com.daaw.InterfaceC2867Yl
    public void e(int i) {
        o().e(i);
    }

    @Override // com.daaw.InterfaceC2867Yl
    public void f(C6262lX0 c6262lX0) {
        o().f(c6262lX0);
    }

    @Override // com.daaw.LX0
    public void flush() {
        o().flush();
    }

    @Override // com.daaw.InterfaceC2867Yl
    public void g(C1224Iw c1224Iw) {
        o().g(c1224Iw);
    }

    @Override // com.daaw.InterfaceC2867Yl
    public void h(String str) {
        o().h(str);
    }

    @Override // com.daaw.InterfaceC2867Yl
    public void i(C6381lw c6381lw) {
        o().i(c6381lw);
    }

    @Override // com.daaw.InterfaceC2867Yl
    public void j() {
        o().j();
    }

    @Override // com.daaw.InterfaceC2867Yl
    public void l(InterfaceC2971Zl interfaceC2971Zl) {
        o().l(interfaceC2971Zl);
    }

    @Override // com.daaw.InterfaceC2867Yl
    public void m(C4994h00 c4994h00) {
        o().m(c4994h00);
    }

    @Override // com.daaw.LX0
    public void n(InputStream inputStream) {
        o().n(inputStream);
    }

    public abstract InterfaceC2867Yl o();

    @Override // com.daaw.LX0
    public void p() {
        o().p();
    }

    @Override // com.daaw.InterfaceC2867Yl
    public void q(boolean z) {
        o().q(z);
    }

    public String toString() {
        return AbstractC6329ll0.b(this).d("delegate", o()).toString();
    }
}
