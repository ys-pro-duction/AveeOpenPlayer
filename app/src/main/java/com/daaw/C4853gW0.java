package com.daaw;

/* JADX INFO: renamed from: com.daaw.gW0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4853gW0 implements SR0 {

    /* JADX INFO: renamed from: com.daaw.gW0$a */
    public static final class a extends SZ0 implements InterfaceC3429bR {
        public int F;
        public /* synthetic */ Object G;
        public final /* synthetic */ InterfaceC6537mW0 H;

        /* JADX INFO: renamed from: com.daaw.gW0$a$a, reason: collision with other inner class name */
        public static final class C0177a implements InterfaceC7337pN {
            public final /* synthetic */ C5620jF0 B;
            public final /* synthetic */ InterfaceC7337pN C;

            /* JADX INFO: renamed from: com.daaw.gW0$a$a$a, reason: collision with other inner class name */
            public static final class C0178a extends AbstractC1623Ms {
                public /* synthetic */ Object E;
                public int G;

                public C0178a(InterfaceC1416Ks interfaceC1416Ks) {
                    super(interfaceC1416Ks);
                }

                @Override // com.daaw.AbstractC7409pe
                public final Object q(Object obj) {
                    this.E = obj;
                    this.G |= Integer.MIN_VALUE;
                    return C0177a.this.a(0, this);
                }
            }

            public C0177a(C5620jF0 c5620jF0, InterfaceC7337pN interfaceC7337pN) {
                this.B = c5620jF0;
                this.C = interfaceC7337pN;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(int r5, com.daaw.InterfaceC1416Ks r6) throws java.lang.Throwable {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.daaw.C4853gW0.a.C0177a.C0178a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.daaw.gW0$a$a$a r0 = (com.daaw.C4853gW0.a.C0177a.C0178a) r0
                    int r1 = r0.G
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.G = r1
                    goto L18
                L13:
                    com.daaw.gW0$a$a$a r0 = new com.daaw.gW0$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.E
                    java.lang.Object r1 = com.daaw.I10.c()
                    int r2 = r0.G
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    com.daaw.AbstractC4801gJ0.b(r6)
                    goto L4b
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    com.daaw.AbstractC4801gJ0.b(r6)
                    if (r5 <= 0) goto L4e
                    com.daaw.jF0 r5 = r4.B
                    boolean r6 = r5.B
                    if (r6 != 0) goto L4e
                    r5.B = r3
                    com.daaw.pN r5 = r4.C
                    com.daaw.QR0 r6 = com.daaw.QR0.START
                    r0.G = r3
                    java.lang.Object r5 = r5.c(r6, r0)
                    if (r5 != r1) goto L4b
                    return r1
                L4b:
                    com.daaw.G91 r5 = com.daaw.G91.a
                    return r5
                L4e:
                    com.daaw.G91 r5 = com.daaw.G91.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.daaw.C4853gW0.a.C0177a.a(int, com.daaw.Ks):java.lang.Object");
            }

            @Override // com.daaw.InterfaceC7337pN
            public /* bridge */ /* synthetic */ Object c(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                return a(((Number) obj).intValue(), interfaceC1416Ks);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC6537mW0 interfaceC6537mW0, InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
            this.H = interfaceC6537mW0;
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
                InterfaceC7337pN interfaceC7337pN = (InterfaceC7337pN) this.G;
                C5620jF0 c5620jF0 = new C5620jF0();
                InterfaceC6537mW0 interfaceC6537mW0 = this.H;
                C0177a c0177a = new C0177a(c5620jF0, interfaceC7337pN);
                this.F = 1;
                if (interfaceC6537mW0.a(c0177a, this) == objC) {
                    return objC;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4801gJ0.b(obj);
            }
            throw new D80();
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC7337pN interfaceC7337pN, InterfaceC1416Ks interfaceC1416Ks) {
            return ((a) a(interfaceC7337pN, interfaceC1416Ks)).q(G91.a);
        }
    }

    @Override // com.daaw.SR0
    public InterfaceC7058oN a(InterfaceC6537mW0 interfaceC6537mW0) {
        return AbstractC7894rN.j(new a(interfaceC6537mW0, null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }
}
