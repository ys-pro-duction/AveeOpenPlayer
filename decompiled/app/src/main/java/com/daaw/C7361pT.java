package com.daaw;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.daaw.pT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7361pT {
    public static final C7361pT a = new C7361pT();
    public static final AtomicBoolean b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.daaw.pT$a */
    public static final class a extends SZ0 implements InterfaceC3429bR {
        public Object F;
        public Object G;
        public int H;
        public final /* synthetic */ InterfaceC3236ak I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC3236ak interfaceC3236ak, InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
            this.I = interfaceC3236ak;
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            return new a(this.I, interfaceC1416Ks);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0037 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0040 A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #1 {all -> 0x0017, blocks: (B:6:0x0013, B:17:0x0038, B:19:0x0040, B:14:0x002b, B:13:0x0026), top: B:29:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0035 -> B:17:0x0038). Please report as a decompilation issue!!! */
        @Override // com.daaw.AbstractC7409pe
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object q(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = com.daaw.I10.c()
                int r1 = r4.H
                r2 = 1
                if (r1 == 0) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r1 = r4.G
                com.daaw.jk r1 = (com.daaw.InterfaceC5756jk) r1
                java.lang.Object r3 = r4.F
                com.daaw.QE0 r3 = (com.daaw.QE0) r3
                com.daaw.AbstractC4801gJ0.b(r5)     // Catch: java.lang.Throwable -> L17
                goto L38
            L17:
                r5 = move-exception
                goto L53
            L19:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L21:
                com.daaw.AbstractC4801gJ0.b(r5)
                com.daaw.ak r3 = r4.I
                com.daaw.jk r5 = r3.iterator()     // Catch: java.lang.Throwable -> L17
                r1 = r5
            L2b:
                r4.F = r3     // Catch: java.lang.Throwable -> L17
                r4.G = r1     // Catch: java.lang.Throwable -> L17
                r4.H = r2     // Catch: java.lang.Throwable -> L17
                java.lang.Object r5 = r1.a(r4)     // Catch: java.lang.Throwable -> L17
                if (r5 != r0) goto L38
                return r0
            L38:
                java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L17
                boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L17
                if (r5 == 0) goto L4c
                java.lang.Object r5 = r1.next()     // Catch: java.lang.Throwable -> L17
                com.daaw.G91 r5 = (com.daaw.G91) r5     // Catch: java.lang.Throwable -> L17
                com.daaw.cU0$a r5 = com.daaw.AbstractC3720cU0.e     // Catch: java.lang.Throwable -> L17
                r5.g()     // Catch: java.lang.Throwable -> L17
                goto L2b
            L4c:
                r5 = 0
                com.daaw.AbstractC8275sk.a(r3, r5)
                com.daaw.G91 r5 = com.daaw.G91.a
                return r5
            L53:
                throw r5     // Catch: java.lang.Throwable -> L54
            L54:
                r0 = move-exception
                com.daaw.AbstractC8275sk.a(r3, r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.C7361pT.a.q(java.lang.Object):java.lang.Object");
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
            return ((a) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
        }
    }

    /* JADX INFO: renamed from: com.daaw.pT$b */
    public static final class b extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ InterfaceC3236ak B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC3236ak interfaceC3236ak) {
            super(1);
            this.B = interfaceC3236ak;
        }

        public final void a(Object obj) {
            G10.g(obj, "it");
            this.B.k(G91.a);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(obj);
            return G91.a;
        }
    }

    public final void a() {
        if (b.compareAndSet(false, true)) {
            InterfaceC3236ak interfaceC3236akB = AbstractC6035kk.b(-1, null, null, 6, null);
            AbstractC9104vh.d(AbstractC7763qt.a(C8659u6.N.b()), null, null, new a(interfaceC3236akB, null), 3, null);
            AbstractC3720cU0.e.f(new b(interfaceC3236akB));
        }
    }
}
