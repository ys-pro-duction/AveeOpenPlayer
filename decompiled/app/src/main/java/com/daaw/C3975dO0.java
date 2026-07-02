package com.daaw;

import com.daaw.InterfaceC4684ft;
import com.daaw.InterfaceC5203hl0;

/* JADX INFO: renamed from: com.daaw.dO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3975dO0 implements InterfaceC5203hl0 {
    public static final C3975dO0 B = new C3975dO0();

    /* JADX INFO: renamed from: com.daaw.dO0$a */
    public static final class a extends SZ0 implements InterfaceC3429bR {
        public int F;
        public final /* synthetic */ NQ G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(NQ nq, InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
            this.G = nq;
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            return new a(this.G, interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) throws Throwable {
            Object objC = I10.c();
            int i = this.F;
            if (i == 0) {
                AbstractC4801gJ0.b(obj);
                this.F = 1;
                if (AbstractC0391Ay.a(16L, this) == objC) {
                    return objC;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4801gJ0.b(obj);
            }
            return this.G.invoke(AbstractC0527Cg.d(System.nanoTime()));
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
            return ((a) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
        }
    }

    @Override // com.daaw.InterfaceC4684ft
    public InterfaceC4684ft Q0(InterfaceC4684ft.c cVar) {
        return InterfaceC5203hl0.a.c(this, cVar);
    }

    @Override // com.daaw.InterfaceC4684ft
    public InterfaceC4684ft U(InterfaceC4684ft interfaceC4684ft) {
        return InterfaceC5203hl0.a.d(this, interfaceC4684ft);
    }

    @Override // com.daaw.InterfaceC4684ft.b, com.daaw.InterfaceC4684ft
    public InterfaceC4684ft.b a(InterfaceC4684ft.c cVar) {
        return InterfaceC5203hl0.a.b(this, cVar);
    }

    @Override // com.daaw.InterfaceC4684ft
    public Object c1(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return InterfaceC5203hl0.a.a(this, obj, interfaceC3429bR);
    }

    @Override // com.daaw.InterfaceC4684ft.b
    public /* synthetic */ InterfaceC4684ft.c getKey() {
        return AbstractC4924gl0.a(this);
    }

    @Override // com.daaw.InterfaceC5203hl0
    public Object p0(NQ nq, InterfaceC1416Ks interfaceC1416Ks) {
        return AbstractC8539th.f(C7850rC.c(), new a(nq, null), interfaceC1416Ks);
    }
}
