package com.daaw;

import com.daaw.NR0;

/* JADX INFO: loaded from: classes3.dex */
public final class OR0 implements InterfaceC6907np0 {
    public final NR0.d a;

    public OR0(NR0.d dVar) {
        this.a = dVar;
    }

    public static OR0 c(NR0.d dVar) {
        return new OR0(dVar);
    }

    @Override // com.daaw.InterfaceC6907np0
    public Object a() {
        return NR0.d(this.a);
    }

    @Override // com.daaw.InterfaceC6907np0
    public Object b(Object obj) {
        NR0.f(this.a, obj);
        return null;
    }
}
