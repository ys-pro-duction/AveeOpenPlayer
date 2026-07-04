package com.daaw;

/* JADX INFO: renamed from: com.daaw.zN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC10133zN {
    public static final int a = I01.b("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, Integer.MAX_VALUE);

    /* JADX INFO: renamed from: com.daaw.zN$a */
    public static final class a extends SZ0 implements InterfaceC3986dR {
        public int F;
        public /* synthetic */ Object G;
        public /* synthetic */ Object H;
        public final /* synthetic */ InterfaceC3429bR I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC3429bR interfaceC3429bR, InterfaceC1416Ks interfaceC1416Ks) {
            super(3, interfaceC1416Ks);
            this.I = interfaceC3429bR;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        
            if (r1.c(r6, r5) == r0) goto L15;
         */
        @Override // com.daaw.AbstractC7409pe
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object q(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = com.daaw.I10.c()
                int r1 = r5.F
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                com.daaw.AbstractC4801gJ0.b(r6)
                goto L45
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.G
                com.daaw.pN r1 = (com.daaw.InterfaceC7337pN) r1
                com.daaw.AbstractC4801gJ0.b(r6)
                goto L39
            L22:
                com.daaw.AbstractC4801gJ0.b(r6)
                java.lang.Object r6 = r5.G
                r1 = r6
                com.daaw.pN r1 = (com.daaw.InterfaceC7337pN) r1
                java.lang.Object r6 = r5.H
                com.daaw.bR r4 = r5.I
                r5.G = r1
                r5.F = r3
                java.lang.Object r6 = r4.invoke(r6, r5)
                if (r6 != r0) goto L39
                goto L44
            L39:
                r3 = 0
                r5.G = r3
                r5.F = r2
                java.lang.Object r6 = r1.c(r6, r5)
                if (r6 != r0) goto L45
            L44:
                return r0
            L45:
                com.daaw.G91 r6 = com.daaw.G91.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC10133zN.a.q(java.lang.Object):java.lang.Object");
        }

        @Override // com.daaw.InterfaceC3986dR
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC7337pN interfaceC7337pN, Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            a aVar = new a(this.I, interfaceC1416Ks);
            aVar.G = interfaceC7337pN;
            aVar.H = obj;
            return aVar.q(G91.a);
        }
    }

    public static final InterfaceC7058oN a(InterfaceC7058oN interfaceC7058oN, InterfaceC3429bR interfaceC3429bR) {
        return AbstractC7894rN.o(interfaceC7058oN, new a(interfaceC3429bR, null));
    }

    public static final InterfaceC7058oN b(InterfaceC7058oN interfaceC7058oN, InterfaceC3986dR interfaceC3986dR) {
        return new C5475ik(interfaceC3986dR, interfaceC7058oN, null, 0, null, 28, null);
    }
}
