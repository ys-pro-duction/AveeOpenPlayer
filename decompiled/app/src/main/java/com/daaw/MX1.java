package com.daaw;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class MX1 implements InterfaceC4758g83 {
    public final CX1 a;

    public MX1(CX1 cx1) {
        this.a = cx1;
    }

    public final WeakReference a() {
        WeakReference weakReferenceF = this.a.f();
        AbstractC7000o83.b(weakReferenceF);
        return weakReferenceF;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* synthetic */ Object zzb() {
        WeakReference weakReferenceF = this.a.f();
        AbstractC7000o83.b(weakReferenceF);
        return weakReferenceF;
    }
}
