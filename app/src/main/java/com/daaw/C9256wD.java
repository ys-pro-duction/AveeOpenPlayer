package com.daaw;

/* JADX INFO: renamed from: com.daaw.wD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9256wD {
    public final InterfaceC3986dR a;
    public final InterfaceC3986dR b;
    public final InterfaceC8007rm0 c;
    public final InterfaceC4650fm0 d;

    /* JADX INFO: renamed from: com.daaw.wD$a */
    public static final class a extends AbstractC1623Ms {
        public Object E;
        public Object F;
        public /* synthetic */ Object G;
        public int I;

        public a(InterfaceC1416Ks interfaceC1416Ks) {
            super(interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) {
            this.G = obj;
            this.I |= Integer.MIN_VALUE;
            return C9256wD.this.a(null, this);
        }
    }

    /* JADX INFO: renamed from: com.daaw.wD$b */
    public static final class b extends AbstractC1623Ms {
        public Object E;
        public Object F;
        public Object G;
        public Object H;
        public /* synthetic */ Object I;
        public int K;

        public b(InterfaceC1416Ks interfaceC1416Ks) {
            super(interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) {
            this.I = obj;
            this.K |= Integer.MIN_VALUE;
            return C9256wD.this.b(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.daaw.wD$c */
    public static final class c extends AbstractC1623Ms {
        public Object E;
        public Object F;
        public Object G;
        public /* synthetic */ Object H;
        public int J;

        public c(InterfaceC1416Ks interfaceC1416Ks) {
            super(interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) {
            this.H = obj;
            this.J |= Integer.MIN_VALUE;
            return C9256wD.this.c(null, null, this);
        }
    }

    public C9256wD(InterfaceC3986dR interfaceC3986dR, InterfaceC3986dR interfaceC3986dR2, InterfaceC8007rm0 interfaceC8007rm0, InterfaceC4650fm0 interfaceC4650fm0) {
        G10.g(interfaceC3986dR, "onDragStarted");
        G10.g(interfaceC3986dR2, "onDragStopped");
        G10.g(interfaceC8007rm0, "dragStartInteraction");
        this.a = interfaceC3986dR;
        this.b = interfaceC3986dR2;
        this.c = interfaceC8007rm0;
        this.d = interfaceC4650fm0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        if (r2.a(r6, r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007d, code lost:
    
        if (r9.invoke(r8, r2, r0) != r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007f, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.daaw.InterfaceC7484pt r8, com.daaw.InterfaceC1416Ks r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.daaw.C9256wD.a
            if (r0 == 0) goto L13
            r0 = r9
            com.daaw.wD$a r0 = (com.daaw.C9256wD.a) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            com.daaw.wD$a r0 = new com.daaw.wD$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.G
            java.lang.Object r1 = com.daaw.I10.c()
            int r2 = r0.I
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            com.daaw.AbstractC4801gJ0.b(r9)
            goto L80
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            java.lang.Object r8 = r0.F
            com.daaw.pt r8 = (com.daaw.InterfaceC7484pt) r8
            java.lang.Object r2 = r0.E
            com.daaw.wD r2 = (com.daaw.C9256wD) r2
            com.daaw.AbstractC4801gJ0.b(r9)
            goto L65
        L41:
            com.daaw.AbstractC4801gJ0.b(r9)
            com.daaw.rm0 r9 = r7.c
            java.lang.Object r9 = r9.getValue()
            com.daaw.uD r9 = (com.daaw.C8691uD) r9
            if (r9 == 0) goto L6b
            com.daaw.fm0 r2 = r7.d
            if (r2 == 0) goto L64
            com.daaw.tD r6 = new com.daaw.tD
            r6.<init>(r9)
            r0.E = r7
            r0.F = r8
            r0.I = r4
            java.lang.Object r9 = r2.a(r6, r0)
            if (r9 != r1) goto L64
            goto L7f
        L64:
            r2 = r7
        L65:
            com.daaw.rm0 r9 = r2.c
            r9.setValue(r5)
            goto L6c
        L6b:
            r2 = r7
        L6c:
            com.daaw.dR r9 = r2.b
            r2 = 0
            java.lang.Float r2 = com.daaw.AbstractC0527Cg.b(r2)
            r0.E = r5
            r0.F = r5
            r0.I = r3
            java.lang.Object r8 = r9.invoke(r8, r2, r0)
            if (r8 != r1) goto L80
        L7f:
            return r1
        L80:
            com.daaw.G91 r8 = com.daaw.G91.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C9256wD.a(com.daaw.pt, com.daaw.Ks):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
    
        if (r2.a(r6, r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c1, code lost:
    
        if (r10.invoke(r8, r9, r0) == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(com.daaw.InterfaceC7484pt r8, com.daaw.AbstractC7854rD.c r9, com.daaw.InterfaceC1416Ks r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.daaw.C9256wD.b
            if (r0 == 0) goto L13
            r0 = r10
            com.daaw.wD$b r0 = (com.daaw.C9256wD.b) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            com.daaw.wD$b r0 = new com.daaw.wD$b
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.I
            java.lang.Object r1 = com.daaw.I10.c()
            int r2 = r0.K
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L5d
            if (r2 == r5) goto L4c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            com.daaw.AbstractC4801gJ0.b(r10)
            goto Lc4
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            java.lang.Object r8 = r0.H
            com.daaw.uD r8 = (com.daaw.C8691uD) r8
            java.lang.Object r9 = r0.G
            com.daaw.rD$c r9 = (com.daaw.AbstractC7854rD.c) r9
            java.lang.Object r2 = r0.F
            com.daaw.pt r2 = (com.daaw.InterfaceC7484pt) r2
            java.lang.Object r4 = r0.E
            com.daaw.wD r4 = (com.daaw.C9256wD) r4
            com.daaw.AbstractC4801gJ0.b(r10)
            goto La0
        L4c:
            java.lang.Object r8 = r0.G
            r9 = r8
            com.daaw.rD$c r9 = (com.daaw.AbstractC7854rD.c) r9
            java.lang.Object r8 = r0.F
            com.daaw.pt r8 = (com.daaw.InterfaceC7484pt) r8
            java.lang.Object r2 = r0.E
            com.daaw.wD r2 = (com.daaw.C9256wD) r2
            com.daaw.AbstractC4801gJ0.b(r10)
            goto L83
        L5d:
            com.daaw.AbstractC4801gJ0.b(r10)
            com.daaw.rm0 r10 = r7.c
            java.lang.Object r10 = r10.getValue()
            com.daaw.uD r10 = (com.daaw.C8691uD) r10
            if (r10 == 0) goto L82
            com.daaw.fm0 r2 = r7.d
            if (r2 == 0) goto L82
            com.daaw.tD r6 = new com.daaw.tD
            r6.<init>(r10)
            r0.E = r7
            r0.F = r8
            r0.G = r9
            r0.K = r5
            java.lang.Object r10 = r2.a(r6, r0)
            if (r10 != r1) goto L82
            goto Lc3
        L82:
            r2 = r7
        L83:
            com.daaw.uD r10 = new com.daaw.uD
            r10.<init>()
            com.daaw.fm0 r5 = r2.d
            if (r5 == 0) goto La3
            r0.E = r2
            r0.F = r8
            r0.G = r9
            r0.H = r10
            r0.K = r4
            java.lang.Object r4 = r5.a(r10, r0)
            if (r4 != r1) goto L9d
            goto Lc3
        L9d:
            r4 = r2
            r2 = r8
            r8 = r10
        La0:
            r10 = r8
            r8 = r2
            r2 = r4
        La3:
            com.daaw.rm0 r4 = r2.c
            r4.setValue(r10)
            com.daaw.dR r10 = r2.a
            long r4 = r9.a()
            com.daaw.yp0 r9 = com.daaw.C9982yp0.d(r4)
            r2 = 0
            r0.E = r2
            r0.F = r2
            r0.G = r2
            r0.H = r2
            r0.K = r3
            java.lang.Object r8 = r10.invoke(r8, r9, r0)
            if (r8 != r1) goto Lc4
        Lc3:
            return r1
        Lc4:
            com.daaw.G91 r8 = com.daaw.G91.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C9256wD.b(com.daaw.pt, com.daaw.rD$c, com.daaw.Ks):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
    
        if (r2.a(r6, r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0089, code lost:
    
        if (r10.invoke(r8, r9, r0) != r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008b, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(com.daaw.InterfaceC7484pt r8, com.daaw.AbstractC7854rD.d r9, com.daaw.InterfaceC1416Ks r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.daaw.C9256wD.c
            if (r0 == 0) goto L13
            r0 = r10
            com.daaw.wD$c r0 = (com.daaw.C9256wD.c) r0
            int r1 = r0.J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.J = r1
            goto L18
        L13:
            com.daaw.wD$c r0 = new com.daaw.wD$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.H
            java.lang.Object r1 = com.daaw.I10.c()
            int r2 = r0.J
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L46
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            com.daaw.AbstractC4801gJ0.b(r10)
            goto L8c
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            java.lang.Object r8 = r0.G
            r9 = r8
            com.daaw.rD$d r9 = (com.daaw.AbstractC7854rD.d) r9
            java.lang.Object r8 = r0.F
            com.daaw.pt r8 = (com.daaw.InterfaceC7484pt) r8
            java.lang.Object r2 = r0.E
            com.daaw.wD r2 = (com.daaw.C9256wD) r2
            com.daaw.AbstractC4801gJ0.b(r10)
            goto L6c
        L46:
            com.daaw.AbstractC4801gJ0.b(r10)
            com.daaw.rm0 r10 = r7.c
            java.lang.Object r10 = r10.getValue()
            com.daaw.uD r10 = (com.daaw.C8691uD) r10
            if (r10 == 0) goto L72
            com.daaw.fm0 r2 = r7.d
            if (r2 == 0) goto L6b
            com.daaw.vD r6 = new com.daaw.vD
            r6.<init>(r10)
            r0.E = r7
            r0.F = r8
            r0.G = r9
            r0.J = r4
            java.lang.Object r10 = r2.a(r6, r0)
            if (r10 != r1) goto L6b
            goto L8b
        L6b:
            r2 = r7
        L6c:
            com.daaw.rm0 r10 = r2.c
            r10.setValue(r5)
            goto L73
        L72:
            r2 = r7
        L73:
            com.daaw.dR r10 = r2.b
            float r9 = r9.a()
            java.lang.Float r9 = com.daaw.AbstractC0527Cg.b(r9)
            r0.E = r5
            r0.F = r5
            r0.G = r5
            r0.J = r3
            java.lang.Object r8 = r10.invoke(r8, r9, r0)
            if (r8 != r1) goto L8c
        L8b:
            return r1
        L8c:
            com.daaw.G91 r8 = com.daaw.G91.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C9256wD.c(com.daaw.pt, com.daaw.rD$d, com.daaw.Ks):java.lang.Object");
    }
}
