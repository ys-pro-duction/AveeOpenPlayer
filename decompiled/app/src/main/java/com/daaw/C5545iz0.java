package com.daaw;

import com.daaw.InterfaceC0873Fm0;

/* JADX INFO: renamed from: com.daaw.iz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5545iz0 implements InterfaceC5268hz0, InterfaceC4988gz {
    public final /* synthetic */ InterfaceC4988gz B;
    public boolean C;
    public boolean D;
    public final InterfaceC0873Fm0 E;

    /* JADX INFO: renamed from: com.daaw.iz0$a */
    public static final class a extends AbstractC1623Ms {
        public Object E;
        public /* synthetic */ Object F;
        public int H;

        public a(InterfaceC1416Ks interfaceC1416Ks) {
            super(interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) {
            this.F = obj;
            this.H |= Integer.MIN_VALUE;
            return C5545iz0.this.Z(this);
        }
    }

    public C5545iz0(InterfaceC4988gz interfaceC4988gz) {
        G10.g(interfaceC4988gz, "density");
        this.B = interfaceC4988gz;
        this.E = AbstractC1081Hm0.a(false);
    }

    @Override // com.daaw.InterfaceC4988gz
    public float H(int i) {
        return this.B.H(i);
    }

    @Override // com.daaw.InterfaceC4988gz
    public float J() {
        return this.B.J();
    }

    @Override // com.daaw.InterfaceC4988gz
    public float O(float f) {
        return this.B.O(f);
    }

    @Override // com.daaw.InterfaceC4988gz
    public int V(float f) {
        return this.B.V(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.daaw.InterfaceC5268hz0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object Z(com.daaw.InterfaceC1416Ks r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.daaw.C5545iz0.a
            if (r0 == 0) goto L13
            r0 = r5
            com.daaw.iz0$a r0 = (com.daaw.C5545iz0.a) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            com.daaw.iz0$a r0 = new com.daaw.iz0$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.F
            java.lang.Object r1 = com.daaw.I10.c()
            int r2 = r0.H
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.E
            com.daaw.iz0 r0 = (com.daaw.C5545iz0) r0
            com.daaw.AbstractC4801gJ0.b(r5)
            goto L4f
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            com.daaw.AbstractC4801gJ0.b(r5)
            boolean r5 = r4.C
            if (r5 != 0) goto L4e
            boolean r5 = r4.D
            if (r5 != 0) goto L4e
            com.daaw.Fm0 r5 = r4.E
            r0.E = r4
            r0.H = r3
            r2 = 0
            java.lang.Object r5 = com.daaw.InterfaceC0873Fm0.a.a(r5, r2, r0, r3, r2)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            r0 = r4
        L4f:
            boolean r5 = r0.C
            java.lang.Boolean r5 = com.daaw.AbstractC0527Cg.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C5545iz0.Z(com.daaw.Ks):java.lang.Object");
    }

    public final void b() {
        this.D = true;
        InterfaceC0873Fm0.a.c(this.E, null, 1, null);
    }

    @Override // com.daaw.InterfaceC4988gz
    public long d0(long j) {
        return this.B.d0(j);
    }

    public final void e() {
        this.C = true;
        InterfaceC0873Fm0.a.c(this.E, null, 1, null);
    }

    @Override // com.daaw.InterfaceC4988gz
    public float e0(long j) {
        return this.B.e0(j);
    }

    public final void f() {
        InterfaceC0873Fm0.a.b(this.E, null, 1, null);
        this.C = false;
        this.D = false;
    }

    @Override // com.daaw.InterfaceC4988gz
    public float getDensity() {
        return this.B.getDensity();
    }
}
