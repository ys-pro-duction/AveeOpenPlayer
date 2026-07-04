package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class R51 implements GJ {
    public final InterfaceC7290pB0 a;
    public final InterfaceC7290pB0 b;
    public final InterfaceC7290pB0 c;
    public final InterfaceC7290pB0 d;
    public final InterfaceC7290pB0 e;

    public R51(InterfaceC7290pB0 interfaceC7290pB0, InterfaceC7290pB0 interfaceC7290pB02, InterfaceC7290pB0 interfaceC7290pB03, InterfaceC7290pB0 interfaceC7290pB04, InterfaceC7290pB0 interfaceC7290pB05) {
        this.a = interfaceC7290pB0;
        this.b = interfaceC7290pB02;
        this.c = interfaceC7290pB03;
        this.d = interfaceC7290pB04;
        this.e = interfaceC7290pB05;
    }

    public static R51 a(InterfaceC7290pB0 interfaceC7290pB0, InterfaceC7290pB0 interfaceC7290pB02, InterfaceC7290pB0 interfaceC7290pB03, InterfaceC7290pB0 interfaceC7290pB04, InterfaceC7290pB0 interfaceC7290pB05) {
        return new R51(interfaceC7290pB0, interfaceC7290pB02, interfaceC7290pB03, interfaceC7290pB04, interfaceC7290pB05);
    }

    public static P51 c(InterfaceC6333lm interfaceC6333lm, InterfaceC6333lm interfaceC6333lm2, InterfaceC8174sN0 interfaceC8174sN0, C9350wa1 c9350wa1, C9948yi1 c9948yi1) {
        return new P51(interfaceC6333lm, interfaceC6333lm2, interfaceC8174sN0, c9350wa1, c9948yi1);
    }

    @Override // com.daaw.InterfaceC7290pB0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public P51 get() {
        return c((InterfaceC6333lm) this.a.get(), (InterfaceC6333lm) this.b.get(), (InterfaceC8174sN0) this.c.get(), (C9350wa1) this.d.get(), (C9948yi1) this.e.get());
    }
}
