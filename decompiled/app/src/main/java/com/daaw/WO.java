package com.daaw;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class WO {

    public static final class a extends AbstractC4233eJ0 implements InterfaceC3429bR {
        public int D;
        public /* synthetic */ Object E;

        public a(InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            a aVar = new a(interfaceC1416Ks);
            aVar.E = obj;
            return aVar;
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) throws Throwable {
            Object objC = I10.c();
            int i = this.D;
            if (i == 0) {
                AbstractC4801gJ0.b(obj);
                InterfaceC2211Sd interfaceC2211Sd = (InterfaceC2211Sd) this.E;
                this.D = 1;
                if (WO.b(interfaceC2211Sd, this) == objC) {
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
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2211Sd interfaceC2211Sd, InterfaceC1416Ks interfaceC1416Ks) {
            return ((a) a(interfaceC2211Sd, interfaceC1416Ks)).q(G91.a);
        }
    }

    public static final class b extends AbstractC1623Ms {
        public Object E;
        public /* synthetic */ Object F;
        public int G;

        public b(InterfaceC1416Ks interfaceC1416Ks) {
            super(interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) {
            this.F = obj;
            this.G |= Integer.MIN_VALUE;
            return WO.b(null, this);
        }
    }

    public static final class c extends AbstractC1623Ms {
        public Object E;
        public Object F;
        public Object G;
        public /* synthetic */ Object H;
        public int I;

        public c(InterfaceC1416Ks interfaceC1416Ks) {
            super(interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) {
            this.H = obj;
            this.I |= Integer.MIN_VALUE;
            return WO.d(null, null, this);
        }
    }

    public static final boolean a(InterfaceC2211Sd interfaceC2211Sd) {
        G10.g(interfaceC2211Sd, "<this>");
        List listC = interfaceC2211Sd.v().c();
        int size = listC.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (((C7223ox0) listC.get(i)).g()) {
                z = true;
                break;
            }
            i++;
        }
        return !z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (a(r6) == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0048 -> B:19:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.daaw.InterfaceC2211Sd r6, com.daaw.InterfaceC1416Ks r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof com.daaw.WO.b
            if (r0 == 0) goto L13
            r0 = r7
            com.daaw.WO$b r0 = (com.daaw.WO.b) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            com.daaw.WO$b r0 = new com.daaw.WO$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.F
            java.lang.Object r1 = com.daaw.I10.c()
            int r2 = r0.G
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.E
            com.daaw.Sd r6 = (com.daaw.InterfaceC2211Sd) r6
            com.daaw.AbstractC4801gJ0.b(r7)
            goto L4b
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            com.daaw.AbstractC4801gJ0.b(r7)
            boolean r7 = a(r6)
            if (r7 != 0) goto L68
        L3e:
            com.daaw.fx0 r7 = com.daaw.EnumC4702fx0.Final
            r0.E = r6
            r0.G = r3
            java.lang.Object r7 = r6.c0(r7, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            com.daaw.dx0 r7 = (com.daaw.C4134dx0) r7
            java.util.List r7 = r7.c()
            int r2 = r7.size()
            r4 = 0
        L56:
            if (r4 >= r2) goto L68
            java.lang.Object r5 = r7.get(r4)
            com.daaw.ox0 r5 = (com.daaw.C7223ox0) r5
            boolean r5 = r5.g()
            if (r5 == 0) goto L65
            goto L3e
        L65:
            int r4 = r4 + 1
            goto L56
        L68:
            com.daaw.G91 r6 = com.daaw.G91.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.WO.b(com.daaw.Sd, com.daaw.Ks):java.lang.Object");
    }

    public static final Object c(InterfaceC9740xx0 interfaceC9740xx0, InterfaceC1416Ks interfaceC1416Ks) {
        Object objQ = interfaceC9740xx0.Q(new a(null), interfaceC1416Ks);
        return objQ == I10.c() ? objQ : G91.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0091, code lost:
    
        if (r10 != r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ab, code lost:
    
        if (r10 == r1) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v6, types: [com.daaw.ft, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.daaw.xx0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.daaw.xx0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.daaw.xx0] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.daaw.ft, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.daaw.bR] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [com.daaw.bR, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0091 -> B:18:0x0052). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00ab -> B:18:0x0052). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(com.daaw.InterfaceC9740xx0 r8, com.daaw.InterfaceC3429bR r9, com.daaw.InterfaceC1416Ks r10) {
        /*
            boolean r0 = r10 instanceof com.daaw.WO.c
            if (r0 == 0) goto L13
            r0 = r10
            com.daaw.WO$c r0 = (com.daaw.WO.c) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            com.daaw.WO$c r0 = new com.daaw.WO$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.H
            java.lang.Object r1 = com.daaw.I10.c()
            int r2 = r0.I
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L67
            if (r2 == r5) goto L57
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r8 = r0.G
            com.daaw.ft r8 = (com.daaw.InterfaceC4684ft) r8
            java.lang.Object r9 = r0.F
            com.daaw.bR r9 = (com.daaw.InterfaceC3429bR) r9
            java.lang.Object r2 = r0.E
            com.daaw.xx0 r2 = (com.daaw.InterfaceC9740xx0) r2
            com.daaw.AbstractC4801gJ0.b(r10)
            goto L52
        L3b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L43:
            java.lang.Object r8 = r0.G
            com.daaw.ft r8 = (com.daaw.InterfaceC4684ft) r8
            java.lang.Object r9 = r0.F
            com.daaw.bR r9 = (com.daaw.InterfaceC3429bR) r9
            java.lang.Object r2 = r0.E
            com.daaw.xx0 r2 = (com.daaw.InterfaceC9740xx0) r2
            com.daaw.AbstractC4801gJ0.b(r10)     // Catch: java.util.concurrent.CancellationException -> L55
        L52:
            r10 = r8
            r8 = r2
            goto L6e
        L55:
            r10 = move-exception
            goto L99
        L57:
            java.lang.Object r8 = r0.G
            com.daaw.ft r8 = (com.daaw.InterfaceC4684ft) r8
            java.lang.Object r9 = r0.F
            com.daaw.bR r9 = (com.daaw.InterfaceC3429bR) r9
            java.lang.Object r2 = r0.E
            com.daaw.xx0 r2 = (com.daaw.InterfaceC9740xx0) r2
            com.daaw.AbstractC4801gJ0.b(r10)     // Catch: java.util.concurrent.CancellationException -> L55
            goto L85
        L67:
            com.daaw.AbstractC4801gJ0.b(r10)
            com.daaw.ft r10 = r0.getContext()
        L6e:
            boolean r2 = com.daaw.AbstractC3053a40.l(r10)
            if (r2 == 0) goto Laf
            r0.E = r8     // Catch: java.util.concurrent.CancellationException -> L94
            r0.F = r9     // Catch: java.util.concurrent.CancellationException -> L94
            r0.G = r10     // Catch: java.util.concurrent.CancellationException -> L94
            r0.I = r5     // Catch: java.util.concurrent.CancellationException -> L94
            java.lang.Object r2 = r9.invoke(r8, r0)     // Catch: java.util.concurrent.CancellationException -> L94
            if (r2 != r1) goto L83
            goto Lad
        L83:
            r2 = r8
            r8 = r10
        L85:
            r0.E = r2     // Catch: java.util.concurrent.CancellationException -> L55
            r0.F = r9     // Catch: java.util.concurrent.CancellationException -> L55
            r0.G = r8     // Catch: java.util.concurrent.CancellationException -> L55
            r0.I = r4     // Catch: java.util.concurrent.CancellationException -> L55
            java.lang.Object r10 = c(r2, r0)     // Catch: java.util.concurrent.CancellationException -> L55
            if (r10 != r1) goto L52
            goto Lad
        L94:
            r2 = move-exception
            r7 = r2
            r2 = r8
            r8 = r10
            r10 = r7
        L99:
            boolean r6 = com.daaw.AbstractC3053a40.l(r8)
            if (r6 == 0) goto Lae
            r0.E = r2
            r0.F = r9
            r0.G = r8
            r0.I = r3
            java.lang.Object r10 = c(r2, r0)
            if (r10 != r1) goto L52
        Lad:
            return r1
        Lae:
            throw r10
        Laf:
            com.daaw.G91 r8 = com.daaw.G91.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.WO.d(com.daaw.xx0, com.daaw.bR, com.daaw.Ks):java.lang.Object");
    }
}
