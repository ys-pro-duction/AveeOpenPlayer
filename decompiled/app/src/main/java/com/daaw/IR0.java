package com.daaw;

import com.daaw.AbstractC4512fJ0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class IR0 extends AbstractC6398m0 implements InterfaceC7450pm0, InterfaceC7058oN, IR {
    public final int F;
    public final int G;
    public final EnumC5182hh H;
    public Object[] I;
    public long J;
    public long K;
    public int L;
    public int M;

    public static final class a implements InterfaceC9531xC {
        public final IR0 B;
        public long C;
        public final Object D;
        public final InterfaceC1416Ks E;

        public a(IR0 ir0, long j, Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            this.B = ir0;
            this.C = j;
            this.D = obj;
            this.E = interfaceC1416Ks;
        }

        @Override // com.daaw.InterfaceC9531xC
        public void a() {
            this.B.A(this);
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC5182hh.values().length];
            try {
                iArr[EnumC5182hh.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5182hh.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC5182hh.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final class c extends AbstractC1623Ms {
        public Object E;
        public Object F;
        public Object G;
        public Object H;
        public /* synthetic */ Object I;
        public int K;

        public c(InterfaceC1416Ks interfaceC1416Ks) {
            super(interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) {
            this.I = obj;
            this.K |= Integer.MIN_VALUE;
            return IR0.C(IR0.this, null, this);
        }
    }

    public IR0(int i, int i2, EnumC5182hh enumC5182hh) {
        this.F = i;
        this.G = i2;
        this.H = enumC5182hh;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ab, code lost:
    
        if (r8 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ad, code lost:
    
        com.daaw.AbstractC3053a40.j(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b0, code lost:
    
        r0.E = r5;
        r0.F = r2;
        r0.G = r9;
        r0.H = r8;
        r0.K = 3;
        r10 = r2.c(r10, r0);
        r2 = r2;
        r5 = r5;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00be, code lost:
    
        if (r10 != r1) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:15:0x003b, B:32:0x0092, B:34:0x009a, B:38:0x00ad, B:39:0x00b0, B:22:0x005d), top: B:48:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ab A[EDGE_INSN: B:52:0x00ab->B:37:0x00ab BREAK  A[LOOP:0: B:32:0x0092->B:55:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.daaw.pN, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.daaw.m0] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [com.daaw.IR0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.daaw.pN] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2, types: [com.daaw.o0] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [com.daaw.KR0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9, types: [com.daaw.KR0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00be -> B:16:0x003e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object C(com.daaw.IR0 r8, com.daaw.InterfaceC7337pN r9, com.daaw.InterfaceC1416Ks r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof com.daaw.IR0.c
            if (r0 == 0) goto L13
            r0 = r10
            com.daaw.IR0$c r0 = (com.daaw.IR0.c) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            com.daaw.IR0$c r0 = new com.daaw.IR0$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.I
            java.lang.Object r1 = com.daaw.I10.c()
            int r2 = r0.K
            r3 = 3
            r4 = 2
            if (r2 == 0) goto L77
            r8 = 1
            if (r2 == r8) goto L61
            if (r2 == r4) goto L4d
            if (r2 != r3) goto L45
            java.lang.Object r8 = r0.H
            com.daaw.U30 r8 = (com.daaw.U30) r8
            java.lang.Object r9 = r0.G
            com.daaw.KR0 r9 = (com.daaw.KR0) r9
            java.lang.Object r2 = r0.F
            com.daaw.pN r2 = (com.daaw.InterfaceC7337pN) r2
            java.lang.Object r5 = r0.E
            com.daaw.IR0 r5 = (com.daaw.IR0) r5
            com.daaw.AbstractC4801gJ0.b(r10)     // Catch: java.lang.Throwable -> L42
        L3e:
            r10 = r2
            r2 = r8
            r8 = r5
            goto L8f
        L42:
            r8 = move-exception
            goto Lc4
        L45:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L4d:
            java.lang.Object r8 = r0.H
            com.daaw.U30 r8 = (com.daaw.U30) r8
            java.lang.Object r9 = r0.G
            com.daaw.KR0 r9 = (com.daaw.KR0) r9
            java.lang.Object r2 = r0.F
            com.daaw.pN r2 = (com.daaw.InterfaceC7337pN) r2
            java.lang.Object r5 = r0.E
            com.daaw.IR0 r5 = (com.daaw.IR0) r5
            com.daaw.AbstractC4801gJ0.b(r10)     // Catch: java.lang.Throwable -> L42
            goto L92
        L61:
            java.lang.Object r8 = r0.G
            r9 = r8
            com.daaw.KR0 r9 = (com.daaw.KR0) r9
            java.lang.Object r8 = r0.F
            com.daaw.pN r8 = (com.daaw.InterfaceC7337pN) r8
            java.lang.Object r2 = r0.E
            com.daaw.IR0 r2 = (com.daaw.IR0) r2
            com.daaw.AbstractC4801gJ0.b(r10)     // Catch: java.lang.Throwable -> L74
            r10 = r8
            r8 = r2
            goto L83
        L74:
            r8 = move-exception
            r5 = r2
            goto Lc4
        L77:
            com.daaw.AbstractC4801gJ0.b(r10)
            com.daaw.o0 r10 = r8.g()
            com.daaw.KR0 r10 = (com.daaw.KR0) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L83:
            com.daaw.ft r2 = r0.getContext()     // Catch: java.lang.Throwable -> Lc1
            com.daaw.U30$b r5 = com.daaw.U30.k     // Catch: java.lang.Throwable -> Lc1
            com.daaw.ft$b r2 = r2.a(r5)     // Catch: java.lang.Throwable -> Lc1
            com.daaw.U30 r2 = (com.daaw.U30) r2     // Catch: java.lang.Throwable -> Lc1
        L8f:
            r5 = r8
            r8 = r2
            r2 = r10
        L92:
            java.lang.Object r10 = r5.W(r9)     // Catch: java.lang.Throwable -> L42
            com.daaw.YZ0 r6 = com.daaw.JR0.a     // Catch: java.lang.Throwable -> L42
            if (r10 != r6) goto Lab
            r0.E = r5     // Catch: java.lang.Throwable -> L42
            r0.F = r2     // Catch: java.lang.Throwable -> L42
            r0.G = r9     // Catch: java.lang.Throwable -> L42
            r0.H = r8     // Catch: java.lang.Throwable -> L42
            r0.K = r4     // Catch: java.lang.Throwable -> L42
            java.lang.Object r10 = r5.z(r9, r0)     // Catch: java.lang.Throwable -> L42
            if (r10 != r1) goto L92
            goto Lc0
        Lab:
            if (r8 == 0) goto Lb0
            com.daaw.AbstractC3053a40.j(r8)     // Catch: java.lang.Throwable -> L42
        Lb0:
            r0.E = r5     // Catch: java.lang.Throwable -> L42
            r0.F = r2     // Catch: java.lang.Throwable -> L42
            r0.G = r9     // Catch: java.lang.Throwable -> L42
            r0.H = r8     // Catch: java.lang.Throwable -> L42
            r0.K = r3     // Catch: java.lang.Throwable -> L42
            java.lang.Object r10 = r2.c(r10, r0)     // Catch: java.lang.Throwable -> L42
            if (r10 != r1) goto L3e
        Lc0:
            return r1
        Lc1:
            r10 = move-exception
            r5 = r8
            r8 = r10
        Lc4:
            r5.m(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.IR0.C(com.daaw.IR0, com.daaw.pN, com.daaw.Ks):java.lang.Object");
    }

    public static /* synthetic */ Object H(IR0 ir0, Object obj, InterfaceC1416Ks interfaceC1416Ks) throws Throwable {
        if (ir0.j(obj)) {
            return G91.a;
        }
        Object objI = ir0.I(obj, interfaceC1416Ks);
        return objI == I10.c() ? objI : G91.a;
    }

    public final void A(a aVar) {
        synchronized (this) {
            if (aVar.C < M()) {
                return;
            }
            Object[] objArr = this.I;
            G10.d(objArr);
            if (JR0.f(objArr, aVar.C) != aVar) {
                return;
            }
            JR0.g(objArr, aVar.C, JR0.a);
            B();
            G91 g91 = G91.a;
        }
    }

    public final void B() {
        if (this.G != 0 || this.M > 1) {
            Object[] objArr = this.I;
            G10.d(objArr);
            while (this.M > 0 && JR0.f(objArr, (M() + ((long) R())) - 1) == JR0.a) {
                this.M--;
                JR0.g(objArr, M() + ((long) R()), null);
            }
        }
    }

    public final void D(long j) {
        AbstractC6956o0[] abstractC6956o0Arr;
        if (this.C != 0 && (abstractC6956o0Arr = this.B) != null) {
            for (AbstractC6956o0 abstractC6956o0 : abstractC6956o0Arr) {
                if (abstractC6956o0 != null) {
                    KR0 kr0 = (KR0) abstractC6956o0;
                    long j2 = kr0.a;
                    if (j2 >= 0 && j2 < j) {
                        kr0.a = j;
                    }
                }
            }
        }
        this.K = j;
    }

    @Override // com.daaw.AbstractC6398m0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public KR0 h() {
        return new KR0();
    }

    @Override // com.daaw.AbstractC6398m0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public KR0[] l(int i) {
        return new KR0[i];
    }

    public final void G() {
        Object[] objArr = this.I;
        G10.d(objArr);
        JR0.g(objArr, M(), null);
        this.L--;
        long jM = M() + 1;
        if (this.J < jM) {
            this.J = jM;
        }
        if (this.K < jM) {
            D(jM);
        }
    }

    public final Object I(Object obj, InterfaceC1416Ks interfaceC1416Ks) throws Throwable {
        Throwable th;
        InterfaceC1416Ks[] interfaceC1416KsArrK;
        a aVar;
        C4067dj c4067dj = new C4067dj(H10.b(interfaceC1416Ks), 1);
        c4067dj.y();
        InterfaceC1416Ks[] interfaceC1416KsArrK2 = AbstractC6677n0.a;
        synchronized (this) {
            try {
                if (T(obj)) {
                    try {
                        AbstractC4512fJ0.a aVar2 = AbstractC4512fJ0.B;
                        c4067dj.x(AbstractC4512fJ0.a(G91.a));
                        interfaceC1416KsArrK = K(interfaceC1416KsArrK2);
                        aVar = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        aVar = new a(this, M() + ((long) R()), obj, c4067dj);
                        J(aVar);
                        this.M++;
                        if (this.G == 0) {
                            interfaceC1416KsArrK2 = K(interfaceC1416KsArrK2);
                        }
                        interfaceC1416KsArrK = interfaceC1416KsArrK2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (aVar != null) {
                    AbstractC4634fj.a(c4067dj, aVar);
                }
                for (InterfaceC1416Ks interfaceC1416Ks2 : interfaceC1416KsArrK) {
                    if (interfaceC1416Ks2 != null) {
                        AbstractC4512fJ0.a aVar3 = AbstractC4512fJ0.B;
                        interfaceC1416Ks2.x(AbstractC4512fJ0.a(G91.a));
                    }
                }
                Object objU = c4067dj.u();
                if (objU == I10.c()) {
                    AbstractC7497pw.c(interfaceC1416Ks);
                }
                return objU == I10.c() ? objU : G91.a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public final void J(Object obj) {
        int iR = R();
        Object[] objArrS = this.I;
        if (objArrS == null) {
            objArrS = S(null, 0, 2);
        } else if (iR >= objArrS.length) {
            objArrS = S(objArrS, iR, objArrS.length * 2);
        }
        JR0.g(objArrS, M() + ((long) iR), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.daaw.Ks[]] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r6v2 */
    public final InterfaceC1416Ks[] K(InterfaceC1416Ks[] interfaceC1416KsArr) {
        AbstractC6956o0[] abstractC6956o0Arr;
        KR0 kr0;
        InterfaceC1416Ks interfaceC1416Ks;
        int length = interfaceC1416KsArr.length;
        if (this.C != 0 && (abstractC6956o0Arr = this.B) != null) {
            int length2 = abstractC6956o0Arr.length;
            int i = 0;
            interfaceC1416KsArr = interfaceC1416KsArr;
            while (i < length2) {
                AbstractC6956o0 abstractC6956o0 = abstractC6956o0Arr[i];
                if (abstractC6956o0 != null && (interfaceC1416Ks = (kr0 = (KR0) abstractC6956o0).b) != null && V(kr0) >= 0) {
                    int length3 = interfaceC1416KsArr.length;
                    interfaceC1416KsArr = interfaceC1416KsArr;
                    if (length >= length3) {
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) interfaceC1416KsArr, Math.max(2, interfaceC1416KsArr.length * 2));
                        G10.f(objArrCopyOf, "copyOf(this, newSize)");
                        interfaceC1416KsArr = objArrCopyOf;
                    }
                    ((InterfaceC1416Ks[]) interfaceC1416KsArr)[length] = interfaceC1416Ks;
                    kr0.b = null;
                    length++;
                }
                i++;
                interfaceC1416KsArr = interfaceC1416KsArr;
            }
        }
        return (InterfaceC1416Ks[]) interfaceC1416KsArr;
    }

    public final long L() {
        return M() + ((long) this.L);
    }

    public final long M() {
        return Math.min(this.K, this.J);
    }

    public final Object N() {
        Object[] objArr = this.I;
        G10.d(objArr);
        return JR0.f(objArr, (this.J + ((long) Q())) - 1);
    }

    public final Object O(long j) {
        Object[] objArr = this.I;
        G10.d(objArr);
        Object objF = JR0.f(objArr, j);
        return objF instanceof a ? ((a) objF).D : objF;
    }

    public final long P() {
        return M() + ((long) this.L) + ((long) this.M);
    }

    public final int Q() {
        return (int) ((M() + ((long) this.L)) - this.J);
    }

    public final int R() {
        return this.L + this.M;
    }

    public final Object[] S(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i2];
        this.I = objArr2;
        if (objArr != null) {
            long jM = M();
            for (int i3 = 0; i3 < i; i3++) {
                long j = ((long) i3) + jM;
                JR0.g(objArr2, j, JR0.f(objArr, j));
            }
        }
        return objArr2;
    }

    public final boolean T(Object obj) {
        if (n() == 0) {
            return U(obj);
        }
        if (this.L >= this.G && this.K <= this.J) {
            int i = b.a[this.H.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                return true;
            }
        }
        J(obj);
        int i2 = this.L + 1;
        this.L = i2;
        if (i2 > this.G) {
            G();
        }
        if (Q() > this.F) {
            X(this.J + 1, this.K, L(), P());
        }
        return true;
    }

    public final boolean U(Object obj) {
        if (this.F == 0) {
            return true;
        }
        J(obj);
        int i = this.L + 1;
        this.L = i;
        if (i > this.F) {
            G();
        }
        this.K = M() + ((long) this.L);
        return true;
    }

    public final long V(KR0 kr0) {
        long j = kr0.a;
        if (j >= L() && (this.G > 0 || j > M() || this.M == 0)) {
            return -1L;
        }
        return j;
    }

    public final Object W(KR0 kr0) {
        Object obj;
        InterfaceC1416Ks[] interfaceC1416KsArrY = AbstractC6677n0.a;
        synchronized (this) {
            try {
                long jV = V(kr0);
                if (jV < 0) {
                    obj = JR0.a;
                } else {
                    long j = kr0.a;
                    Object objO = O(jV);
                    kr0.a = jV + 1;
                    interfaceC1416KsArrY = Y(j);
                    obj = objO;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC1416Ks interfaceC1416Ks : interfaceC1416KsArrY) {
            if (interfaceC1416Ks != null) {
                AbstractC4512fJ0.a aVar = AbstractC4512fJ0.B;
                interfaceC1416Ks.x(AbstractC4512fJ0.a(G91.a));
            }
        }
        return obj;
    }

    public final void X(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        for (long jM = M(); jM < jMin; jM++) {
            Object[] objArr = this.I;
            G10.d(objArr);
            JR0.g(objArr, jM, null);
        }
        this.J = j;
        this.K = j2;
        this.L = (int) (j3 - jMin);
        this.M = (int) (j4 - j3);
    }

    public final InterfaceC1416Ks[] Y(long j) {
        long j2;
        long j3;
        long j4;
        AbstractC6956o0[] abstractC6956o0Arr;
        if (j > this.K) {
            return AbstractC6677n0.a;
        }
        long jM = M();
        long j5 = ((long) this.L) + jM;
        if (this.G == 0 && this.M > 0) {
            j5++;
        }
        if (this.C != 0 && (abstractC6956o0Arr = this.B) != null) {
            for (AbstractC6956o0 abstractC6956o0 : abstractC6956o0Arr) {
                if (abstractC6956o0 != null) {
                    long j6 = ((KR0) abstractC6956o0).a;
                    if (j6 >= 0 && j6 < j5) {
                        j5 = j6;
                    }
                }
            }
        }
        if (j5 <= this.K) {
            return AbstractC6677n0.a;
        }
        long jL = L();
        int iMin = n() > 0 ? Math.min(this.M, this.G - ((int) (jL - j5))) : this.M;
        InterfaceC1416Ks[] interfaceC1416KsArr = AbstractC6677n0.a;
        long j7 = ((long) this.M) + jL;
        if (iMin > 0) {
            interfaceC1416KsArr = new InterfaceC1416Ks[iMin];
            Object[] objArr = this.I;
            G10.d(objArr);
            j4 = 1;
            long j8 = jL;
            int i = 0;
            while (true) {
                if (jL >= j7) {
                    j2 = jM;
                    j3 = j5;
                    jL = j8;
                    break;
                }
                Object objF = JR0.f(objArr, jL);
                j2 = jM;
                YZ0 yz0 = JR0.a;
                if (objF != yz0) {
                    G10.e(objF, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    a aVar = (a) objF;
                    int i2 = i + 1;
                    j3 = j5;
                    interfaceC1416KsArr[i] = aVar.E;
                    JR0.g(objArr, jL, yz0);
                    JR0.g(objArr, j8, aVar.D);
                    long j9 = j8 + 1;
                    if (i2 >= iMin) {
                        jL = j9;
                        break;
                    }
                    i = i2;
                    j8 = j9;
                } else {
                    j3 = j5;
                }
                jL++;
                jM = j2;
                j5 = j3;
            }
        } else {
            j2 = jM;
            j3 = j5;
            j4 = 1;
        }
        InterfaceC1416Ks[] interfaceC1416KsArr2 = interfaceC1416KsArr;
        int i3 = (int) (jL - j2);
        long j10 = n() == 0 ? jL : j3;
        long jMax = Math.max(this.J, jL - ((long) Math.min(this.F, i3)));
        if (this.G == 0 && jMax < j7) {
            Object[] objArr2 = this.I;
            G10.d(objArr2);
            if (G10.c(JR0.f(objArr2, jMax), JR0.a)) {
                jL += j4;
                jMax += j4;
            }
        }
        X(jMax, j10, jL, j7);
        B();
        return !(interfaceC1416KsArr2.length == 0) ? K(interfaceC1416KsArr2) : interfaceC1416KsArr2;
    }

    public final long Z() {
        long j = this.J;
        if (j < this.K) {
            this.K = j;
        }
        return j;
    }

    @Override // com.daaw.HR0, com.daaw.InterfaceC7058oN
    public Object a(InterfaceC7337pN interfaceC7337pN, InterfaceC1416Ks interfaceC1416Ks) {
        return C(this, interfaceC7337pN, interfaceC1416Ks);
    }

    @Override // com.daaw.IR
    public InterfaceC7058oN b(InterfaceC4684ft interfaceC4684ft, int i, EnumC5182hh enumC5182hh) {
        return JR0.e(this, interfaceC4684ft, i, enumC5182hh);
    }

    @Override // com.daaw.InterfaceC7450pm0, com.daaw.InterfaceC7337pN
    public Object c(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
        return H(this, obj, interfaceC1416Ks);
    }

    @Override // com.daaw.InterfaceC7450pm0
    public void i() throws Throwable {
        synchronized (this) {
            try {
            } catch (Throwable th) {
                th = th;
            }
            try {
                X(L(), this.K, L(), P());
                G91 g91 = G91.a;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    @Override // com.daaw.InterfaceC7450pm0
    public boolean j(Object obj) {
        int i;
        boolean z;
        InterfaceC1416Ks[] interfaceC1416KsArrK = AbstractC6677n0.a;
        synchronized (this) {
            if (T(obj)) {
                interfaceC1416KsArrK = K(interfaceC1416KsArrK);
                z = true;
            } else {
                z = false;
            }
        }
        for (InterfaceC1416Ks interfaceC1416Ks : interfaceC1416KsArrK) {
            if (interfaceC1416Ks != null) {
                AbstractC4512fJ0.a aVar = AbstractC4512fJ0.B;
                interfaceC1416Ks.x(AbstractC4512fJ0.a(G91.a));
            }
        }
        return z;
    }

    public final Object z(KR0 kr0, InterfaceC1416Ks interfaceC1416Ks) {
        C4067dj c4067dj = new C4067dj(H10.b(interfaceC1416Ks), 1);
        c4067dj.y();
        synchronized (this) {
            try {
                if (V(kr0) < 0) {
                    kr0.b = c4067dj;
                } else {
                    AbstractC4512fJ0.a aVar = AbstractC4512fJ0.B;
                    c4067dj.x(AbstractC4512fJ0.a(G91.a));
                }
                G91 g91 = G91.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        Object objU = c4067dj.u();
        if (objU == I10.c()) {
            AbstractC7497pw.c(interfaceC1416Ks);
        }
        return objU == I10.c() ? objU : G91.a;
    }
}
