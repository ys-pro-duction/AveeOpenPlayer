package com.daaw;

import com.daaw.InterfaceC2971Zl;

/* JADX INFO: loaded from: classes3.dex */
public final class KJ extends C9698xo0 {
    public boolean b;
    public final C6262lX0 c;
    public final InterfaceC2971Zl.a d;
    public final AbstractC3246am[] e;

    public KJ(C6262lX0 c6262lX0, AbstractC3246am[] abstractC3246amArr) {
        this(c6262lX0, InterfaceC2971Zl.a.PROCESSED, abstractC3246amArr);
    }

    @Override // com.daaw.C9698xo0, com.daaw.InterfaceC2867Yl
    public void l(InterfaceC2971Zl interfaceC2971Zl) {
        AbstractC7785qy0.u(!this.b, "already started");
        this.b = true;
        for (AbstractC3246am abstractC3246am : this.e) {
            abstractC3246am.i(this.c);
        }
        interfaceC2971Zl.c(this.c, this.d, new C2756Xj0());
    }

    @Override // com.daaw.C9698xo0, com.daaw.InterfaceC2867Yl
    public void m(C4994h00 c4994h00) {
        c4994h00.b("error", this.c).b("progress", this.d);
    }

    public KJ(C6262lX0 c6262lX0, InterfaceC2971Zl.a aVar, AbstractC3246am[] abstractC3246amArr) {
        AbstractC7785qy0.e(!c6262lX0.o(), "error must not be OK");
        this.c = c6262lX0;
        this.d = aVar;
        this.e = abstractC3246amArr;
    }
}
