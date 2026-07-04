package com.daaw;

/* JADX INFO: renamed from: com.daaw.w91, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9241w91 extends AbstractC5801jt {
    public static final C9241w91 D = new C9241w91();

    @Override // com.daaw.AbstractC5801jt
    public void g1(InterfaceC4684ft interfaceC4684ft, Runnable runnable) {
        C0862Fj1 c0862Fj1 = (C0862Fj1) interfaceC4684ft.a(C0862Fj1.D);
        if (c0862Fj1 == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        c0862Fj1.C = true;
    }

    @Override // com.daaw.AbstractC5801jt
    public boolean i1(InterfaceC4684ft interfaceC4684ft) {
        return false;
    }

    @Override // com.daaw.AbstractC5801jt
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
