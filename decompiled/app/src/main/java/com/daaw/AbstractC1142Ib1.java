package com.daaw;

import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.Ib1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1142Ib1 {
    public static final O7 a(C0504Ca0 c0504Ca0, S30 s30) {
        Object next;
        G10.g(c0504Ca0, "c");
        G10.g(s30, "wildcardType");
        if (s30.B() == null) {
            throw new IllegalArgumentException("Nullability annotations on unbounded wildcards aren't supported");
        }
        Iterator it = new C3466ba0(c0504Ca0, s30, false, 4, null).iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            O7 o7 = (O7) next;
            for (AP ap : AbstractC5009h30.f()) {
                if (G10.c(o7.d(), ap)) {
                    break loop0;
                }
            }
        }
        return (O7) next;
    }

    public static final boolean b(InterfaceC1583Mi interfaceC1583Mi) {
        G10.g(interfaceC1583Mi, "memberDescriptor");
        return (interfaceC1583Mi instanceof InterfaceC8468tR) && G10.c(interfaceC1583Mi.X(C3884d30.i0), Boolean.TRUE);
    }

    public static final boolean c(E30 e30) {
        G10.g(e30, "javaTypeEnhancementState");
        return e30.c().invoke(AbstractC5009h30.e()) == EnumC5076hI0.F;
    }

    public static final AbstractC8965vA d(AbstractC0742Ef1 abstractC0742Ef1) {
        G10.g(abstractC0742Ef1, "<this>");
        AbstractC8965vA abstractC8965vAG = S20.g(abstractC0742Ef1);
        G10.f(abstractC8965vAG, "toDescriptorVisibility(...)");
        return abstractC8965vAG;
    }
}
