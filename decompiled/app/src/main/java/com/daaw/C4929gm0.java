package com.daaw;

/* JADX INFO: renamed from: com.daaw.gm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4929gm0 implements InterfaceC4650fm0 {
    public final InterfaceC7450pm0 a = JR0.b(0, 16, EnumC5182hh.DROP_OLDEST, 1, null);

    @Override // com.daaw.InterfaceC4650fm0
    public Object a(Y00 y00, InterfaceC1416Ks interfaceC1416Ks) {
        Object objC = b().c(y00, interfaceC1416Ks);
        return objC == I10.c() ? objC : G91.a;
    }

    @Override // com.daaw.InterfaceC4650fm0
    public boolean c(Y00 y00) {
        G10.g(y00, "interaction");
        return b().j(y00);
    }

    @Override // com.daaw.Z00
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceC7450pm0 b() {
        return this.a;
    }
}
