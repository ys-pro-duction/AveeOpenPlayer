package com.daaw;

/* JADX INFO: renamed from: com.daaw.oL0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7051oL0 implements GJ {
    public final InterfaceC7290pB0 a;
    public final InterfaceC7290pB0 b;
    public final InterfaceC7290pB0 c;
    public final InterfaceC7290pB0 d;
    public final InterfaceC7290pB0 e;

    public C7051oL0(InterfaceC7290pB0 interfaceC7290pB0, InterfaceC7290pB0 interfaceC7290pB02, InterfaceC7290pB0 interfaceC7290pB03, InterfaceC7290pB0 interfaceC7290pB04, InterfaceC7290pB0 interfaceC7290pB05) {
        this.a = interfaceC7290pB0;
        this.b = interfaceC7290pB02;
        this.c = interfaceC7290pB03;
        this.d = interfaceC7290pB04;
        this.e = interfaceC7290pB05;
    }

    public static C7051oL0 a(InterfaceC7290pB0 interfaceC7290pB0, InterfaceC7290pB0 interfaceC7290pB02, InterfaceC7290pB0 interfaceC7290pB03, InterfaceC7290pB0 interfaceC7290pB04, InterfaceC7290pB0 interfaceC7290pB05) {
        return new C7051oL0(interfaceC7290pB0, interfaceC7290pB02, interfaceC7290pB03, interfaceC7290pB04, interfaceC7290pB05);
    }

    public static C6772nL0 c(InterfaceC6333lm interfaceC6333lm, InterfaceC6333lm interfaceC6333lm2, Object obj, Object obj2, InterfaceC7290pB0 interfaceC7290pB0) {
        return new C6772nL0(interfaceC6333lm, interfaceC6333lm2, (YH) obj, (KN0) obj2, interfaceC7290pB0);
    }

    @Override // com.daaw.InterfaceC7290pB0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6772nL0 get() {
        return c((InterfaceC6333lm) this.a.get(), (InterfaceC6333lm) this.b.get(), this.c.get(), this.d.get(), this.e);
    }
}
