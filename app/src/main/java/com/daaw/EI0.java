package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public final class EI0 {
    public final AbstractC2316Td0 a;
    public final NN0 b;
    public final J50 c;
    public final InterfaceC4484fC0 d;
    public final C1936Ps0 e;
    public final String f;

    public EI0(AbstractC2316Td0 abstractC2316Td0, NN0 nn0, J50 j50, InterfaceC4484fC0 interfaceC4484fC0, C1936Ps0 c1936Ps0) {
        G10.g(abstractC2316Td0, "logger");
        G10.g(nn0, "scope");
        G10.g(j50, "clazz");
        this.a = abstractC2316Td0;
        this.b = nn0;
        this.c = j50;
        this.d = interfaceC4484fC0;
        this.e = c1936Ps0;
        this.f = "t:'" + K50.a(j50) + "' - q:'" + interfaceC4484fC0 + '\'';
    }

    public final J50 a() {
        return this.c;
    }

    public final String b() {
        return this.f;
    }

    public final AbstractC2316Td0 c() {
        return this.a;
    }

    public final C1936Ps0 d() {
        return this.e;
    }

    public final InterfaceC4484fC0 e() {
        return this.d;
    }

    public final NN0 f() {
        return this.b;
    }

    public /* synthetic */ EI0(AbstractC2316Td0 abstractC2316Td0, NN0 nn0, J50 j50, InterfaceC4484fC0 interfaceC4484fC0, C1936Ps0 c1936Ps0, int i, AbstractC2911Yw abstractC2911Yw) {
        this(abstractC2316Td0, nn0, j50, (i & 8) != 0 ? null : interfaceC4484fC0, (i & 16) != 0 ? null : c1936Ps0);
    }
}
