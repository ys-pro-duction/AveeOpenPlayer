package com.daaw;

/* JADX INFO: renamed from: com.daaw.fk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4639fk {
    public static final Object b(InterfaceC4684ft interfaceC4684ft, Object obj, Object obj2, InterfaceC3429bR interfaceC3429bR, InterfaceC1416Ks interfaceC1416Ks) {
        Object objC = AbstractC5010h31.c(interfaceC4684ft, obj2);
        try {
            Object objInvoke = ((InterfaceC3429bR) V71.e(interfaceC3429bR, 2)).invoke(obj, new QV0(interfaceC1416Ks, interfaceC4684ft));
            AbstractC5010h31.a(interfaceC4684ft, objC);
            if (objInvoke == I10.c()) {
                AbstractC7497pw.c(interfaceC1416Ks);
            }
            return objInvoke;
        } catch (Throwable th) {
            AbstractC5010h31.a(interfaceC4684ft, objC);
            throw th;
        }
    }

    public static /* synthetic */ Object c(InterfaceC4684ft interfaceC4684ft, Object obj, Object obj2, InterfaceC3429bR interfaceC3429bR, InterfaceC1416Ks interfaceC1416Ks, int i, Object obj3) {
        if ((i & 4) != 0) {
            obj2 = AbstractC5010h31.b(interfaceC4684ft);
        }
        return b(interfaceC4684ft, obj, obj2, interfaceC3429bR, interfaceC1416Ks);
    }

    public static final InterfaceC7337pN d(InterfaceC7337pN interfaceC7337pN, InterfaceC4684ft interfaceC4684ft) {
        return interfaceC7337pN instanceof JP0 ? true : interfaceC7337pN instanceof C9977yo0 ? interfaceC7337pN : new C9799y91(interfaceC7337pN, interfaceC4684ft);
    }
}
