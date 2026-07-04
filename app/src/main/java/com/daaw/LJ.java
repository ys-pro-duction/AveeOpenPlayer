package com.daaw;

import com.daaw.InterfaceC2971Zl;

/* JADX INFO: loaded from: classes3.dex */
public class LJ implements InterfaceC3525bm {
    public final C6262lX0 a;
    public final InterfaceC2971Zl.a b;

    public LJ(C6262lX0 c6262lX0, InterfaceC2971Zl.a aVar) {
        AbstractC7785qy0.e(!c6262lX0.o(), "error must not be OK");
        this.a = c6262lX0;
        this.b = aVar;
    }

    @Override // com.daaw.InterfaceC3525bm
    public InterfaceC2867Yl c(C6882nk0 c6882nk0, C2756Xj0 c2756Xj0, C1168Ii c1168Ii, AbstractC3246am[] abstractC3246amArr) {
        return new KJ(this.a, this.b, abstractC3246amArr);
    }

    @Override // com.daaw.InterfaceC8921v10
    public C6404m10 f() {
        throw new UnsupportedOperationException("Not a real transport");
    }
}
