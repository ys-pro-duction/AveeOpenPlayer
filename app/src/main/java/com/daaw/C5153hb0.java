package com.daaw;

/* JADX INFO: renamed from: com.daaw.hb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5153hb0 extends AbstractC5831k0 {
    public final InterfaceC0881Fo0 b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5153hb0(LQ lq) {
        this(null, lq, 1, 0 == true ? 1 : 0);
        G10.g(lq, "getScope");
    }

    public static final InterfaceC4346ej0 k(LQ lq) {
        G10.g(lq, "$getScope");
        InterfaceC4346ej0 interfaceC4346ej0 = (InterfaceC4346ej0) lq.invoke();
        return interfaceC4346ej0 instanceof AbstractC5831k0 ? ((AbstractC5831k0) interfaceC4346ej0).h() : interfaceC4346ej0;
    }

    @Override // com.daaw.AbstractC5831k0
    public InterfaceC4346ej0 i() {
        return (InterfaceC4346ej0) this.b.invoke();
    }

    public /* synthetic */ C5153hb0(InterfaceC10174zX0 interfaceC10174zX0, LQ lq, int i, AbstractC2911Yw abstractC2911Yw) {
        this((i & 1) != 0 ? C9085vd0.e : interfaceC10174zX0, lq);
    }

    public C5153hb0(InterfaceC10174zX0 interfaceC10174zX0, LQ lq) {
        G10.g(interfaceC10174zX0, "storageManager");
        G10.g(lq, "getScope");
        this.b = interfaceC10174zX0.h(new C4874gb0(lq));
    }
}
