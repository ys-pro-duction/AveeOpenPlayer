package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public final class LF0 extends AbstractC10102zF0 implements I20 {
    public final Class c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LF0(C2352Tm0 c2352Tm0, Class cls) {
        super(c2352Tm0, null);
        G10.g(cls, "klass");
        this.c = cls;
    }

    @Override // com.daaw.I20
    public InterfaceC10047z30 c() {
        return YF0.a.a(this.c);
    }
}
