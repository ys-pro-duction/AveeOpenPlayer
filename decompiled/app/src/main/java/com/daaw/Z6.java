package com.daaw;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class Z6 {

    public static final class a extends SZ0 implements InterfaceC3429bR {
        public int F;
        public final /* synthetic */ boolean G;
        public final /* synthetic */ boolean H;
        public final /* synthetic */ InterfaceC8525te0 I;
        public final /* synthetic */ C0737Ee0 J;
        public final /* synthetic */ int K;
        public final /* synthetic */ float L;
        public final /* synthetic */ EnumC0520Ce0 M;
        public final /* synthetic */ InterfaceC8007rm0 N;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, boolean z2, InterfaceC8525te0 interfaceC8525te0, C0737Ee0 c0737Ee0, int i, float f, AbstractC0633De0 abstractC0633De0, EnumC0520Ce0 enumC0520Ce0, InterfaceC8007rm0 interfaceC8007rm0, InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
            this.G = z;
            this.H = z2;
            this.I = interfaceC8525te0;
            this.J = c0737Ee0;
            this.K = i;
            this.L = f;
            this.M = enumC0520Ce0;
            this.N = interfaceC8007rm0;
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            return new a(this.G, this.H, this.I, this.J, this.K, this.L, null, this.M, this.N, interfaceC1416Ks);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
        
            if (com.daaw.InterfaceC8525te0.a.a(r1, r2, 0, r4, r5, null, r7, false, r9, false, r14, 258, null) == r0) goto L25;
         */
        @Override // com.daaw.AbstractC7409pe
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object q(java.lang.Object r15) throws java.lang.Throwable {
            /*
                r14 = this;
                java.lang.Object r0 = com.daaw.I10.c()
                int r1 = r14.F
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                com.daaw.AbstractC4801gJ0.b(r15)
                goto L6a
            L12:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L1a:
                com.daaw.AbstractC4801gJ0.b(r15)
                goto L3c
            L1e:
                com.daaw.AbstractC4801gJ0.b(r15)
                boolean r15 = r14.G
                if (r15 == 0) goto L3c
                com.daaw.rm0 r15 = r14.N
                boolean r15 = com.daaw.Z6.a(r15)
                if (r15 != 0) goto L3c
                boolean r15 = r14.H
                if (r15 == 0) goto L3c
                com.daaw.te0 r15 = r14.I
                r14.F = r3
                java.lang.Object r15 = com.daaw.AbstractC9090ve0.e(r15, r14)
                if (r15 != r0) goto L3c
                goto L69
            L3c:
                com.daaw.rm0 r15 = r14.N
                boolean r1 = r14.G
                com.daaw.Z6.b(r15, r1)
                boolean r15 = r14.G
                if (r15 != 0) goto L4a
                com.daaw.G91 r15 = com.daaw.G91.a
                return r15
            L4a:
                com.daaw.te0 r1 = r14.I
                r15 = 2
                com.daaw.Ee0 r2 = r14.J
                int r4 = r14.K
                float r5 = r14.L
                float r7 = r1.g()
                com.daaw.Ce0 r9 = r14.M
                r14.F = r15
                r3 = 0
                r6 = 0
                r8 = 0
                r10 = 0
                r12 = 258(0x102, float:3.62E-43)
                r13 = 0
                r11 = r14
                java.lang.Object r15 = com.daaw.InterfaceC8525te0.a.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                if (r15 != r0) goto L6a
            L69:
                return r0
            L6a:
                com.daaw.G91 r15 = com.daaw.G91.a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.Z6.a.q(java.lang.Object):java.lang.Object");
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
            return ((a) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
        }
    }

    public static final InterfaceC9648xe0 c(C0737Ee0 c0737Ee0, boolean z, boolean z2, AbstractC0633De0 abstractC0633De0, float f, int i, EnumC0520Ce0 enumC0520Ce0, boolean z3, InterfaceC5781jp interfaceC5781jp, int i2, int i3) {
        interfaceC5781jp.e(-180607952);
        boolean z4 = (i3 & 2) != 0 ? true : z;
        boolean z5 = (i3 & 4) != 0 ? true : z2;
        AbstractC0633De0 abstractC0633De02 = (i3 & 8) != 0 ? null : abstractC0633De0;
        float f2 = (i3 & 16) != 0 ? 1.0f : f;
        int i4 = (i3 & 32) != 0 ? 1 : i;
        EnumC0520Ce0 enumC0520Ce02 = (i3 & 64) != 0 ? EnumC0520Ce0.Immediately : enumC0520Ce0;
        boolean z6 = (i3 & 128) != 0 ? false : z3;
        if (i4 <= 0) {
            throw new IllegalArgumentException(("Iterations must be a positive number (" + i4 + ").").toString());
        }
        if (Float.isInfinite(f2) || Float.isNaN(f2)) {
            throw new IllegalArgumentException(("Speed must be a finite number. It is " + f2 + '.').toString());
        }
        InterfaceC8525te0 interfaceC8525te0D = AbstractC9090ve0.d(interfaceC5781jp, 0);
        interfaceC5781jp.e(-3687241);
        Object objF = interfaceC5781jp.f();
        if (objF == InterfaceC5781jp.a.a()) {
            objF = AbstractC9046vU0.d(Boolean.valueOf(z4), null, 2, null);
            interfaceC5781jp.H(objF);
        }
        interfaceC5781jp.L();
        InterfaceC8007rm0 interfaceC8007rm0 = (InterfaceC8007rm0) objF;
        interfaceC5781jp.e(-180607189);
        if (!z6) {
            f2 /= AbstractC0301Ab1.f((Context) interfaceC5781jp.O(B5.g()));
        }
        float f3 = f2;
        interfaceC5781jp.L();
        AbstractC8420tF.f(new Object[]{c0737Ee0, Boolean.valueOf(z4), abstractC0633De02, Float.valueOf(f3), Integer.valueOf(i4)}, new a(z4, z5, interfaceC8525te0D, c0737Ee0, i4, f3, abstractC0633De02, enumC0520Ce02, interfaceC8007rm0, null), interfaceC5781jp, 8);
        interfaceC5781jp.L();
        return interfaceC8525te0D;
    }

    public static final boolean d(InterfaceC8007rm0 interfaceC8007rm0) {
        return ((Boolean) interfaceC8007rm0.getValue()).booleanValue();
    }

    public static final void e(InterfaceC8007rm0 interfaceC8007rm0, boolean z) {
        interfaceC8007rm0.setValue(Boolean.valueOf(z));
    }
}
