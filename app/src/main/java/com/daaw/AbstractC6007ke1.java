package com.daaw;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: com.daaw.ke1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6007ke1 {

    /* JADX INFO: renamed from: com.daaw.ke1$a */
    public static final class a extends AbstractC4233eJ0 implements InterfaceC3429bR {
        public int D;
        public /* synthetic */ Object E;
        public final /* synthetic */ View F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
            this.F = view;
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            a aVar = new a(this.F, interfaceC1416Ks);
            aVar.E = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
        
            if (r1.d(r5, r4) == r0) goto L17;
         */
        @Override // com.daaw.AbstractC7409pe
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object q(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = com.daaw.I10.c()
                int r1 = r4.D
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                com.daaw.AbstractC4801gJ0.b(r5)
                goto L4f
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                java.lang.Object r1 = r4.E
                com.daaw.NP0 r1 = (com.daaw.NP0) r1
                com.daaw.AbstractC4801gJ0.b(r5)
                goto L37
            L22:
                com.daaw.AbstractC4801gJ0.b(r5)
                java.lang.Object r5 = r4.E
                r1 = r5
                com.daaw.NP0 r1 = (com.daaw.NP0) r1
                android.view.View r5 = r4.F
                r4.E = r1
                r4.D = r3
                java.lang.Object r5 = r1.b(r5, r4)
                if (r5 != r0) goto L37
                goto L4e
            L37:
                android.view.View r5 = r4.F
                boolean r3 = r5 instanceof android.view.ViewGroup
                if (r3 == 0) goto L4f
                android.view.ViewGroup r5 = (android.view.ViewGroup) r5
                com.daaw.KP0 r5 = com.daaw.AbstractC4044de1.b(r5)
                r3 = 0
                r4.E = r3
                r4.D = r2
                java.lang.Object r5 = r1.d(r5, r4)
                if (r5 != r0) goto L4f
            L4e:
                return r0
            L4f:
                com.daaw.G91 r5 = com.daaw.G91.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC6007ke1.a.q(java.lang.Object):java.lang.Object");
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public final Object invoke(NP0 np0, InterfaceC1416Ks interfaceC1416Ks) {
            return ((a) a(np0, interfaceC1416Ks)).q(G91.a);
        }
    }

    /* JADX INFO: renamed from: com.daaw.ke1$b */
    public /* synthetic */ class b extends AbstractC9591xR implements NQ {
        public static final b B = new b();

        public b() {
            super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public final ViewParent invoke(ViewParent viewParent) {
            return viewParent.getParent();
        }
    }

    public static final KP0 a(View view) {
        return QP0.b(new a(view, null));
    }

    public static final KP0 b(View view) {
        return SP0.i(view.getParent(), b.B);
    }
}
