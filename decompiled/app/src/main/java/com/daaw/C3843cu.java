package com.daaw;

/* JADX INFO: renamed from: com.daaw.cu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3843cu extends AbstractC10014yw {
    public final AbstractC7823r60 a;

    public C3843cu(AbstractC7823r60 abstractC7823r60) {
        G10.g(abstractC7823r60, "container");
        this.a = abstractC7823r60;
    }

    @Override // com.daaw.AbstractC10014yw, com.daaw.InterfaceC9735xw
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public H50 f(InterfaceC8468tR interfaceC8468tR, G91 g91) {
        G10.g(interfaceC8468tR, "descriptor");
        G10.g(g91, "data");
        return new C9504x60(this.a, interfaceC8468tR);
    }

    @Override // com.daaw.InterfaceC9735xw
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public H50 d(InterfaceC4476fA0 interfaceC4476fA0, G91 g91) {
        G10.g(interfaceC4476fA0, "descriptor");
        G10.g(g91, "data");
        int i = (interfaceC4476fA0.c0() != null ? 1 : 0) + (interfaceC4476fA0.i0() != null ? 1 : 0);
        if (interfaceC4476fA0.f0()) {
            if (i == 0) {
                return new E60(this.a, interfaceC4476fA0);
            }
            if (i == 1) {
                return new H60(this.a, interfaceC4476fA0);
            }
            if (i == 2) {
                return new J60(this.a, interfaceC4476fA0);
            }
        } else {
            if (i == 0) {
                return new C3068a70(this.a, interfaceC4476fA0);
            }
            if (i == 1) {
                return new C4182e70(this.a, interfaceC4476fA0);
            }
            if (i == 2) {
                return new C5029h70(this.a, interfaceC4476fA0);
            }
        }
        throw new E80("Unsupported property: " + interfaceC4476fA0);
    }
}
