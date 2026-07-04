package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public final class PF0 extends AbstractC10102zF0 implements U20 {
    public final Enum c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PF0(C2352Tm0 c2352Tm0, Enum r3) {
        super(c2352Tm0, null);
        G10.g(r3, "value");
        this.c = r3;
    }

    @Override // com.daaw.U20
    public C6607ml b() {
        Class<?> enclosingClass = this.c.getClass();
        if (!enclosingClass.isEnum()) {
            enclosingClass = enclosingClass.getEnclosingClass();
        }
        G10.d(enclosingClass);
        return AbstractC9544xF0.e(enclosingClass);
    }

    @Override // com.daaw.U20
    public C2352Tm0 d() {
        return C2352Tm0.l(this.c.name());
    }
}
