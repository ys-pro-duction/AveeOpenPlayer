package com.daaw;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class CH2 {
    public final Object a;
    public final List b;
    public final /* synthetic */ QH2 c;

    public /* synthetic */ CH2(QH2 qh2, Object obj, List list, BH2 bh2) {
        this.c = qh2;
        this.a = obj;
        this.b = list;
    }

    public final PH2 a(Callable callable) {
        C7081oS2 c7081oS2B = AbstractC7360pS2.b(this.b);
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0A = c7081oS2B.a(new Callable() { // from class: com.daaw.AH2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, AbstractC9322wT1.f);
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0A2 = c7081oS2B.a(callable, this.c.a);
        return new PH2(this.c, this.a, interfaceFutureC8236sc0A, this.b, interfaceFutureC8236sc0A2);
    }
}
