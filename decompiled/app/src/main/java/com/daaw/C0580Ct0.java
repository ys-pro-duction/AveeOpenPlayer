package com.daaw;

import com.daaw.InterfaceC4684ft;
import com.daaw.InterfaceC5203hl0;

/* JADX INFO: renamed from: com.daaw.Ct0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0580Ct0 implements InterfaceC5203hl0 {
    public final InterfaceC5203hl0 B;
    public final C4760g90 C;

    /* JADX INFO: renamed from: com.daaw.Ct0$a */
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
            return C0580Ct0.this.p0(null, this);
        }
    }

    public C0580Ct0(InterfaceC5203hl0 interfaceC5203hl0) {
        G10.g(interfaceC5203hl0, "frameClock");
        this.B = interfaceC5203hl0;
        this.C = new C4760g90();
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

    public final void b() {
        this.C.d();
    }

    @Override // com.daaw.InterfaceC4684ft
    public Object c1(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return InterfaceC5203hl0.a.a(this, obj, interfaceC3429bR);
    }

    public final void e() {
        this.C.f();
    }

    @Override // com.daaw.InterfaceC4684ft.b
    public /* synthetic */ InterfaceC4684ft.c getKey() {
        return AbstractC4924gl0.a(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.daaw.InterfaceC5203hl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object p0(com.daaw.NQ r6, com.daaw.InterfaceC1416Ks r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.daaw.C0580Ct0.a
            if (r0 == 0) goto L13
            r0 = r7
            com.daaw.Ct0$a r0 = (com.daaw.C0580Ct0.a) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            com.daaw.Ct0$a r0 = new com.daaw.Ct0$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.G
            java.lang.Object r1 = com.daaw.I10.c()
            int r2 = r0.I
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            com.daaw.AbstractC4801gJ0.b(r7)
            return r7
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.F
            com.daaw.NQ r6 = (com.daaw.NQ) r6
            java.lang.Object r2 = r0.E
            com.daaw.Ct0 r2 = (com.daaw.C0580Ct0) r2
            com.daaw.AbstractC4801gJ0.b(r7)
            goto L53
        L40:
            com.daaw.AbstractC4801gJ0.b(r7)
            com.daaw.g90 r7 = r5.C
            r0.E = r5
            r0.F = r6
            r0.I = r4
            java.lang.Object r7 = r7.c(r0)
            if (r7 != r1) goto L52
            goto L62
        L52:
            r2 = r5
        L53:
            com.daaw.hl0 r7 = r2.B
            r2 = 0
            r0.E = r2
            r0.F = r2
            r0.I = r3
            java.lang.Object r6 = r7.p0(r6, r0)
            if (r6 != r1) goto L63
        L62:
            return r1
        L63:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C0580Ct0.p0(com.daaw.NQ, com.daaw.Ks):java.lang.Object");
    }
}
