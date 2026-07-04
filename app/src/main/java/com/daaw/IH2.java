package com.daaw;

import java.util.Collections;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class IH2 {
    public static final PH2 a(Callable callable, Object obj, QH2 qh2) {
        return b(callable, qh2.a, obj, qh2);
    }

    public static final PH2 b(Callable callable, PS2 ps2, Object obj, QH2 qh2) {
        return new PH2(qh2, obj, QH2.d, Collections.EMPTY_LIST, ps2.S0(callable));
    }

    public static final PH2 c(InterfaceFutureC8236sc0 interfaceFutureC8236sc0, Object obj, QH2 qh2) {
        return new PH2(qh2, obj, QH2.d, Collections.EMPTY_LIST, interfaceFutureC8236sc0);
    }

    public static final PH2 d(final InterfaceC9833yH2 interfaceC9833yH2, PS2 ps2, Object obj, QH2 qh2) {
        return b(new Callable() { // from class: com.daaw.HH2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                interfaceC9833yH2.zza();
                return null;
            }
        }, ps2, obj, qh2);
    }
}
