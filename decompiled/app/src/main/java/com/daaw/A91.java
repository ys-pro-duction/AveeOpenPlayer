package com.daaw;

import com.daaw.AbstractC4512fJ0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class A91 {
    public static final void a(InterfaceC3429bR interfaceC3429bR, Object obj, InterfaceC1416Ks interfaceC1416Ks) {
        InterfaceC1416Ks interfaceC1416KsA = AbstractC7497pw.a(interfaceC1416Ks);
        try {
            InterfaceC4684ft context = interfaceC1416Ks.getContext();
            Object objC = AbstractC5010h31.c(context, null);
            try {
                Object objInvoke = ((InterfaceC3429bR) V71.e(interfaceC3429bR, 2)).invoke(obj, interfaceC1416KsA);
                if (objInvoke != I10.c()) {
                    interfaceC1416KsA.x(AbstractC4512fJ0.a(objInvoke));
                }
            } finally {
                AbstractC5010h31.a(context, objC);
            }
        } catch (Throwable th) {
            AbstractC4512fJ0.a aVar = AbstractC4512fJ0.B;
            interfaceC1416KsA.x(AbstractC4512fJ0.a(AbstractC4801gJ0.a(th)));
        }
    }

    public static final Object b(ON0 on0, Object obj, InterfaceC3429bR interfaceC3429bR) {
        Object c2041Qn;
        try {
            c2041Qn = ((InterfaceC3429bR) V71.e(interfaceC3429bR, 2)).invoke(obj, on0);
        } catch (Throwable th) {
            c2041Qn = new C2041Qn(th, false, 2, null);
        }
        if (c2041Qn == I10.c()) {
            return I10.c();
        }
        Object objK0 = on0.k0(c2041Qn);
        if (objK0 == AbstractC4167e40.b) {
            return I10.c();
        }
        if (objK0 instanceof C2041Qn) {
            throw ((C2041Qn) objK0).a;
        }
        return AbstractC4167e40.h(objK0);
    }

    public static final Object c(ON0 on0, Object obj, InterfaceC3429bR interfaceC3429bR) throws Throwable {
        Object c2041Qn;
        try {
            c2041Qn = ((InterfaceC3429bR) V71.e(interfaceC3429bR, 2)).invoke(obj, on0);
        } catch (Throwable th) {
            c2041Qn = new C2041Qn(th, false, 2, null);
        }
        if (c2041Qn == I10.c()) {
            return I10.c();
        }
        Object objK0 = on0.k0(c2041Qn);
        if (objK0 == AbstractC4167e40.b) {
            return I10.c();
        }
        if (objK0 instanceof C2041Qn) {
            Throwable th2 = ((C2041Qn) objK0).a;
            if (!(th2 instanceof N31) || ((N31) th2).B != on0) {
                throw th2;
            }
            if (c2041Qn instanceof C2041Qn) {
                throw ((C2041Qn) c2041Qn).a;
            }
        } else {
            c2041Qn = AbstractC4167e40.h(objK0);
        }
        return c2041Qn;
    }
}
