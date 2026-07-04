package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class VE extends AbstractC6453mB0 {
    public final InterfaceC7645qU0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VE(InterfaceC7645qU0 interfaceC7645qU0, LQ lq) {
        super(lq);
        G10.g(interfaceC7645qU0, "policy");
        G10.g(lq, "defaultFactory");
        this.b = interfaceC7645qU0;
    }

    @Override // com.daaw.AbstractC2049Qp
    public InterfaceC6258lW0 b(Object obj, InterfaceC5781jp interfaceC5781jp, int i) {
        interfaceC5781jp.e(-84026900);
        interfaceC5781jp.e(-492369756);
        Object objF = interfaceC5781jp.f();
        if (objF == InterfaceC5781jp.a.a()) {
            objF = AbstractC7923rU0.d(obj, this.b);
            interfaceC5781jp.H(objF);
        }
        interfaceC5781jp.L();
        InterfaceC8007rm0 interfaceC8007rm0 = (InterfaceC8007rm0) objF;
        interfaceC8007rm0.setValue(obj);
        interfaceC5781jp.L();
        return interfaceC8007rm0;
    }
}
