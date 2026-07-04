package com.daaw;

import com.daaw.InterfaceC3525bm;
import com.daaw.InterfaceC7420pg0;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.nP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6787nP implements InterfaceC0463Bq {
    public abstract InterfaceC0463Bq a();

    @Override // com.daaw.InterfaceC7420pg0
    public Runnable b(InterfaceC7420pg0.a aVar) {
        return a().b(aVar);
    }

    @Override // com.daaw.InterfaceC3525bm
    public InterfaceC2867Yl c(C6882nk0 c6882nk0, C2756Xj0 c2756Xj0, C1168Ii c1168Ii, AbstractC3246am[] abstractC3246amArr) {
        return a().c(c6882nk0, c2756Xj0, c1168Ii, abstractC3246amArr);
    }

    @Override // com.daaw.InterfaceC7420pg0
    public void d(C6262lX0 c6262lX0) {
        a().d(c6262lX0);
    }

    @Override // com.daaw.InterfaceC8921v10
    public C6404m10 f() {
        return a().f();
    }

    @Override // com.daaw.InterfaceC7420pg0
    public void g(C6262lX0 c6262lX0) {
        a().g(c6262lX0);
    }

    @Override // com.daaw.InterfaceC3525bm
    public void h(InterfaceC3525bm.a aVar, Executor executor) {
        a().h(aVar, executor);
    }

    public String toString() {
        return AbstractC6329ll0.b(this).d("delegate", a()).toString();
    }
}
