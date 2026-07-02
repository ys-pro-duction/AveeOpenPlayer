package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.cg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3774cg0 {
    public static final AbstractC10236zk0 a(Throwable th, String str) throws Throwable {
        if (th != null) {
            throw th;
        }
        d();
        throw new D80();
    }

    public static /* synthetic */ AbstractC10236zk0 b(Throwable th, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return a(th, str);
    }

    public static final boolean c(AbstractC2948Zf0 abstractC2948Zf0) {
        return abstractC2948Zf0.k1() instanceof AbstractC10236zk0;
    }

    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final AbstractC2948Zf0 e(InterfaceC3217ag0 interfaceC3217ag0, List list) {
        try {
            return interfaceC3217ag0.b(list);
        } catch (Throwable th) {
            return a(th, interfaceC3217ag0.a());
        }
    }
}
