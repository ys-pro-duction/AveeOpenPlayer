package com.daaw;

/* JADX INFO: renamed from: com.daaw.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3032a0 implements InterfaceC2896Ys0 {
    public static final C6484mJ a = C6484mJ.b();

    public final InterfaceC1900Pj0 c(InterfaceC1900Pj0 interfaceC1900Pj0) throws P10 {
        if (interfaceC1900Pj0 == null || interfaceC1900Pj0.e()) {
            return interfaceC1900Pj0;
        }
        throw d(interfaceC1900Pj0).a().k(interfaceC1900Pj0);
    }

    public final D91 d(InterfaceC1900Pj0 interfaceC1900Pj0) {
        return interfaceC1900Pj0 instanceof Q ? ((Q) interfaceC1900Pj0).m() : new D91(interfaceC1900Pj0);
    }

    @Override // com.daaw.InterfaceC2896Ys0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public InterfaceC1900Pj0 a(AbstractC9408wm abstractC9408wm, C6484mJ c6484mJ) {
        return c((InterfaceC1900Pj0) b(abstractC9408wm, c6484mJ));
    }
}
