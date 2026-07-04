package com.daaw;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

/* JADX INFO: renamed from: com.daaw.bg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3496bg0 {
    public static final C3496bg0 a;
    public static final AbstractC2948Zf0 b;

    static {
        C3496bg0 c3496bg0 = new C3496bg0();
        a = c3496bg0;
        I01.f("kotlinx.coroutines.fast.service.loader", true);
        b = c3496bg0.a();
    }

    public final AbstractC2948Zf0 a() {
        Object next;
        AbstractC2948Zf0 abstractC2948Zf0E;
        try {
            List listA = UP0.A(SP0.c(ServiceLoader.load(InterfaceC3217ag0.class, InterfaceC3217ag0.class.getClassLoader()).iterator()));
            Iterator it = listA.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iC = ((InterfaceC3217ag0) next).c();
                    do {
                        Object next2 = it.next();
                        int iC2 = ((InterfaceC3217ag0) next2).c();
                        if (iC < iC2) {
                            next = next2;
                            iC = iC2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            InterfaceC3217ag0 interfaceC3217ag0 = (InterfaceC3217ag0) next;
            if (interfaceC3217ag0 != null && (abstractC2948Zf0E = AbstractC3774cg0.e(interfaceC3217ag0, listA)) != null) {
                return abstractC2948Zf0E;
            }
            return AbstractC3774cg0.b(null, null, 3, null);
        } catch (Throwable th) {
            return AbstractC3774cg0.b(th, null, 2, null);
        }
    }
}
