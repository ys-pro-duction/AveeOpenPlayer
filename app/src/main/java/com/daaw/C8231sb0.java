package com.daaw;

/* JADX INFO: renamed from: com.daaw.sb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C8231sb0 extends AbstractC4347ej1 {
    public final InterfaceC10174zX0 C;
    public final LQ D;
    public final InterfaceC0881Fo0 E;

    public C8231sb0(InterfaceC10174zX0 interfaceC10174zX0, LQ lq) {
        G10.g(interfaceC10174zX0, "storageManager");
        G10.g(lq, "computation");
        this.C = interfaceC10174zX0;
        this.D = lq;
        this.E = interfaceC10174zX0.h(lq);
    }

    public static final I80 V0(Q80 q80, C8231sb0 c8231sb0) {
        G10.g(q80, "$kotlinTypeRefiner");
        G10.g(c8231sb0, "this$0");
        return q80.a((O80) c8231sb0.D.invoke());
    }

    @Override // com.daaw.AbstractC4347ej1
    public I80 R0() {
        return (I80) this.E.invoke();
    }

    @Override // com.daaw.AbstractC4347ej1
    public boolean S0() {
        return this.E.y();
    }

    @Override // com.daaw.I80
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public C8231sb0 X0(Q80 q80) {
        G10.g(q80, "kotlinTypeRefiner");
        return new C8231sb0(this.C, new C7952rb0(q80, this));
    }
}
