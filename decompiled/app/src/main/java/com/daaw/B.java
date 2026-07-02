package com.daaw;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class B implements InterfaceC3277as0 {
    public final InterfaceC10174zX0 a;
    public final C80 b;
    public final InterfaceC2968Zk0 c;
    public C9523xA d;
    public final InterfaceC5752jj0 e;

    public B(InterfaceC10174zX0 interfaceC10174zX0, C80 c80, InterfaceC2968Zk0 interfaceC2968Zk0) {
        G10.g(interfaceC10174zX0, "storageManager");
        G10.g(c80, "finder");
        G10.g(interfaceC2968Zk0, "moduleDescriptor");
        this.a = interfaceC10174zX0;
        this.b = c80;
        this.c = interfaceC2968Zk0;
        this.e = interfaceC10174zX0.b(new A(this));
    }

    public static final InterfaceC2372Tr0 f(B b, AP ap) {
        G10.g(b, "this$0");
        G10.g(ap, "fqName");
        AbstractC8404tB abstractC8404tBE = b.e(ap);
        if (abstractC8404tBE == null) {
            return null;
        }
        abstractC8404tBE.L0(b.g());
        return abstractC8404tBE;
    }

    @Override // com.daaw.InterfaceC3277as0
    public boolean a(AP ap) {
        G10.g(ap, "fqName");
        return (this.e.I(ap) ? (InterfaceC2372Tr0) this.e.invoke(ap) : e(ap)) == null;
    }

    @Override // com.daaw.InterfaceC3277as0
    public void b(AP ap, Collection collection) {
        G10.g(ap, "fqName");
        G10.g(collection, "packageFragments");
        AbstractC1392Km.a(collection, this.e.invoke(ap));
    }

    @Override // com.daaw.InterfaceC2580Vr0
    public List c(AP ap) {
        G10.g(ap, "fqName");
        return AbstractC1599Mm.o(this.e.invoke(ap));
    }

    public abstract AbstractC8404tB e(AP ap);

    public final C9523xA g() {
        C9523xA c9523xA = this.d;
        if (c9523xA != null) {
            return c9523xA;
        }
        G10.u("components");
        return null;
    }

    public final C80 h() {
        return this.b;
    }

    public final InterfaceC2968Zk0 i() {
        return this.c;
    }

    public final InterfaceC10174zX0 j() {
        return this.a;
    }

    public final void k(C9523xA c9523xA) {
        G10.g(c9523xA, "<set-?>");
        this.d = c9523xA;
    }

    @Override // com.daaw.InterfaceC2580Vr0
    public Collection u(AP ap, NQ nq) {
        G10.g(ap, "fqName");
        G10.g(nq, "nameFilter");
        return AbstractC9867yQ0.d();
    }
}
