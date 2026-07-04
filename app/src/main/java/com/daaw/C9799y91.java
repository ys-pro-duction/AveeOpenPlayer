package com.daaw;

/* JADX INFO: renamed from: com.daaw.y91, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9799y91 implements InterfaceC7337pN {
    public final InterfaceC4684ft B;
    public final Object C;
    public final InterfaceC3429bR D;

    /* JADX INFO: renamed from: com.daaw.y91$a */
    public static final class a extends SZ0 implements InterfaceC3429bR {
        public int F;
        public /* synthetic */ Object G;
        public final /* synthetic */ InterfaceC7337pN H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC7337pN interfaceC7337pN, InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
            this.H = interfaceC7337pN;
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            a aVar = new a(this.H, interfaceC1416Ks);
            aVar.G = obj;
            return aVar;
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) throws Throwable {
            Object objC = I10.c();
            int i = this.F;
            if (i == 0) {
                AbstractC4801gJ0.b(obj);
                Object obj2 = this.G;
                InterfaceC7337pN interfaceC7337pN = this.H;
                this.F = 1;
                if (interfaceC7337pN.c(obj2, this) == objC) {
                    return objC;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4801gJ0.b(obj);
            }
            return G91.a;
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            return ((a) a(obj, interfaceC1416Ks)).q(G91.a);
        }
    }

    public C9799y91(InterfaceC7337pN interfaceC7337pN, InterfaceC4684ft interfaceC4684ft) {
        this.B = interfaceC4684ft;
        this.C = AbstractC5010h31.b(interfaceC4684ft);
        this.D = new a(interfaceC7337pN, null);
    }

    @Override // com.daaw.InterfaceC7337pN
    public Object c(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
        Object objB = AbstractC4639fk.b(this.B, obj, this.C, this.D, interfaceC1416Ks);
        return objB == I10.c() ? objB : G91.a;
    }
}
