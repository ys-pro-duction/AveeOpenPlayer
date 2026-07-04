package com.daaw;

/* JADX INFO: renamed from: com.daaw.ik, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5475ik extends AbstractC4918gk {
    public final InterfaceC3986dR F;

    /* JADX INFO: renamed from: com.daaw.ik$a */
    public static final class a extends SZ0 implements InterfaceC3429bR {
        public int F;
        public /* synthetic */ Object G;
        public final /* synthetic */ InterfaceC7337pN I;

        /* JADX INFO: renamed from: com.daaw.ik$a$a, reason: collision with other inner class name */
        public static final class C0192a implements InterfaceC7337pN {
            public final /* synthetic */ C6748nF0 B;
            public final /* synthetic */ InterfaceC7484pt C;
            public final /* synthetic */ C5475ik D;
            public final /* synthetic */ InterfaceC7337pN E;

            /* JADX INFO: renamed from: com.daaw.ik$a$a$a, reason: collision with other inner class name */
            public static final class C0193a extends SZ0 implements InterfaceC3429bR {
                public int F;
                public final /* synthetic */ C5475ik G;
                public final /* synthetic */ InterfaceC7337pN H;
                public final /* synthetic */ Object I;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0193a(C5475ik c5475ik, InterfaceC7337pN interfaceC7337pN, Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                    super(2, interfaceC1416Ks);
                    this.G = c5475ik;
                    this.H = interfaceC7337pN;
                    this.I = obj;
                }

                @Override // com.daaw.AbstractC7409pe
                public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                    return new C0193a(this.G, this.H, this.I, interfaceC1416Ks);
                }

                @Override // com.daaw.AbstractC7409pe
                public final Object q(Object obj) throws Throwable {
                    Object objC = I10.c();
                    int i = this.F;
                    if (i == 0) {
                        AbstractC4801gJ0.b(obj);
                        InterfaceC3986dR interfaceC3986dR = this.G.F;
                        InterfaceC7337pN interfaceC7337pN = this.H;
                        Object obj2 = this.I;
                        this.F = 1;
                        if (interfaceC3986dR.invoke(interfaceC7337pN, obj2, this) == objC) {
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
                public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
                    return ((C0193a) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
                }
            }

            /* JADX INFO: renamed from: com.daaw.ik$a$a$b */
            public static final class b extends AbstractC1623Ms {
                public Object E;
                public Object F;
                public Object G;
                public /* synthetic */ Object H;
                public int J;

                public b(InterfaceC1416Ks interfaceC1416Ks) {
                    super(interfaceC1416Ks);
                }

                @Override // com.daaw.AbstractC7409pe
                public final Object q(Object obj) {
                    this.H = obj;
                    this.J |= Integer.MIN_VALUE;
                    return C0192a.this.c(null, this);
                }
            }

            public C0192a(C6748nF0 c6748nF0, InterfaceC7484pt interfaceC7484pt, C5475ik c5475ik, InterfaceC7337pN interfaceC7337pN) {
                this.B = c6748nF0;
                this.C = interfaceC7484pt;
                this.D = c5475ik;
                this.E = interfaceC7337pN;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // com.daaw.InterfaceC7337pN
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object c(java.lang.Object r8, com.daaw.InterfaceC1416Ks r9) throws java.lang.Throwable {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof com.daaw.C5475ik.a.C0192a.b
                    if (r0 == 0) goto L13
                    r0 = r9
                    com.daaw.ik$a$a$b r0 = (com.daaw.C5475ik.a.C0192a.b) r0
                    int r1 = r0.J
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.J = r1
                    goto L18
                L13:
                    com.daaw.ik$a$a$b r0 = new com.daaw.ik$a$a$b
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.H
                    java.lang.Object r1 = com.daaw.I10.c()
                    int r2 = r0.J
                    r3 = 1
                    if (r2 == 0) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r8 = r0.G
                    com.daaw.U30 r8 = (com.daaw.U30) r8
                    java.lang.Object r8 = r0.F
                    java.lang.Object r0 = r0.E
                    com.daaw.ik$a$a r0 = (com.daaw.C5475ik.a.C0192a) r0
                    com.daaw.AbstractC4801gJ0.b(r9)
                    goto L5e
                L33:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3b:
                    com.daaw.AbstractC4801gJ0.b(r9)
                    com.daaw.nF0 r9 = r7.B
                    java.lang.Object r9 = r9.B
                    com.daaw.U30 r9 = (com.daaw.U30) r9
                    if (r9 == 0) goto L5d
                    com.daaw.Gk r2 = new com.daaw.Gk
                    r2.<init>()
                    r9.j(r2)
                    r0.E = r7
                    r0.F = r8
                    r0.G = r9
                    r0.J = r3
                    java.lang.Object r9 = r9.o0(r0)
                    if (r9 != r1) goto L5d
                    return r1
                L5d:
                    r0 = r7
                L5e:
                    com.daaw.nF0 r9 = r0.B
                    com.daaw.pt r1 = r0.C
                    com.daaw.tt r3 = com.daaw.EnumC8599tt.UNDISPATCHED
                    com.daaw.ik$a$a$a r4 = new com.daaw.ik$a$a$a
                    com.daaw.ik r2 = r0.D
                    com.daaw.pN r0 = r0.E
                    r5 = 0
                    r4.<init>(r2, r0, r8, r5)
                    r5 = 1
                    r6 = 0
                    r2 = 0
                    com.daaw.U30 r8 = com.daaw.AbstractC8539th.d(r1, r2, r3, r4, r5, r6)
                    r9.B = r8
                    com.daaw.G91 r8 = com.daaw.G91.a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: com.daaw.C5475ik.a.C0192a.c(java.lang.Object, com.daaw.Ks):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC7337pN interfaceC7337pN, InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
            this.I = interfaceC7337pN;
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            a aVar = C5475ik.this.new a(this.I, interfaceC1416Ks);
            aVar.G = obj;
            return aVar;
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) throws Throwable {
            Object objC = I10.c();
            int i = this.F;
            if (i == 0) {
                AbstractC4801gJ0.b(obj);
                InterfaceC7484pt interfaceC7484pt = (InterfaceC7484pt) this.G;
                C6748nF0 c6748nF0 = new C6748nF0();
                C5475ik c5475ik = C5475ik.this;
                InterfaceC7058oN interfaceC7058oN = c5475ik.E;
                C0192a c0192a = new C0192a(c6748nF0, interfaceC7484pt, c5475ik, this.I);
                this.F = 1;
                if (interfaceC7058oN.a(c0192a, this) == objC) {
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
        public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
            return ((a) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
        }
    }

    public /* synthetic */ C5475ik(InterfaceC3986dR interfaceC3986dR, InterfaceC7058oN interfaceC7058oN, InterfaceC4684ft interfaceC4684ft, int i, EnumC5182hh enumC5182hh, int i2, AbstractC2911Yw abstractC2911Yw) {
        this(interfaceC3986dR, interfaceC7058oN, (i2 & 4) != 0 ? C5905kG.B : interfaceC4684ft, (i2 & 8) != 0 ? -2 : i, (i2 & 16) != 0 ? EnumC5182hh.SUSPEND : enumC5182hh);
    }

    @Override // com.daaw.AbstractC4350ek
    public AbstractC4350ek h(InterfaceC4684ft interfaceC4684ft, int i, EnumC5182hh enumC5182hh) {
        return new C5475ik(this.F, this.E, interfaceC4684ft, i, enumC5182hh);
    }

    @Override // com.daaw.AbstractC4918gk
    public Object s(InterfaceC7337pN interfaceC7337pN, InterfaceC1416Ks interfaceC1416Ks) {
        Object objE = AbstractC7763qt.e(new a(interfaceC7337pN, null), interfaceC1416Ks);
        return objE == I10.c() ? objE : G91.a;
    }

    public C5475ik(InterfaceC3986dR interfaceC3986dR, InterfaceC7058oN interfaceC7058oN, InterfaceC4684ft interfaceC4684ft, int i, EnumC5182hh enumC5182hh) {
        super(interfaceC7058oN, interfaceC4684ft, i, enumC5182hh);
        this.F = interfaceC3986dR;
    }
}
