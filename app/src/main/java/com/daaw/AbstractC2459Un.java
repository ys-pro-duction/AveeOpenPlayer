package com.daaw;

import com.daaw.AbstractC4512fJ0;

/* JADX INFO: renamed from: com.daaw.Un, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2459Un {
    public static final Object a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
        if (!(obj instanceof C2041Qn)) {
            return AbstractC4512fJ0.a(obj);
        }
        AbstractC4512fJ0.a aVar = AbstractC4512fJ0.B;
        return AbstractC4512fJ0.a(AbstractC4801gJ0.a(((C2041Qn) obj).a));
    }

    public static final Object b(Object obj, InterfaceC3788cj interfaceC3788cj) {
        Throwable thB = AbstractC4512fJ0.b(obj);
        if (thB == null) {
            return obj;
        }
        return new C2041Qn(thB, false, 2, null);
    }

    public static final Object c(Object obj, NQ nq) {
        Throwable thB = AbstractC4512fJ0.b(obj);
        if (thB == null) {
            return nq != null ? new C2145Rn(obj, nq) : obj;
        }
        return new C2041Qn(thB, false, 2, null);
    }

    public static /* synthetic */ Object d(Object obj, NQ nq, int i, Object obj2) {
        if ((i & 1) != 0) {
            nq = null;
        }
        return c(obj, nq);
    }
}
