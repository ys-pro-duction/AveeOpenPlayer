package com.daaw;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.tU0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC8481tU0 {

    /* JADX INFO: renamed from: com.daaw.tU0$a */
    public static final class a extends SZ0 implements InterfaceC3429bR {
        public Object F;
        public Object G;
        public Object H;
        public Object I;
        public Object J;
        public int K;
        public int L;
        public /* synthetic */ Object M;
        public final /* synthetic */ LQ N;

        /* JADX INFO: renamed from: com.daaw.tU0$a$a, reason: collision with other inner class name */
        public static final class C0236a extends AbstractC4192e90 implements NQ {
            public final /* synthetic */ Set B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0236a(Set set) {
                super(1);
                this.B = set;
            }

            public final void a(Object obj) {
                G10.g(obj, "it");
                this.B.add(obj);
            }

            @Override // com.daaw.NQ
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(obj);
                return G91.a;
            }
        }

        /* JADX INFO: renamed from: com.daaw.tU0$a$b */
        public static final class b extends AbstractC4192e90 implements InterfaceC3429bR {
            public final /* synthetic */ InterfaceC3236ak B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InterfaceC3236ak interfaceC3236ak) {
                super(2);
                this.B = interfaceC3236ak;
            }

            public final void a(Set set, AbstractC3720cU0 abstractC3720cU0) {
                G10.g(set, "changed");
                G10.g(abstractC3720cU0, "<anonymous parameter 1>");
                this.B.k(set);
            }

            @Override // com.daaw.InterfaceC3429bR
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((Set) obj, (AbstractC3720cU0) obj2);
                return G91.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LQ lq, InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
            this.N = lq;
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            a aVar = new a(this.N, interfaceC1416Ks);
            aVar.M = obj;
            return aVar;
        }

        /* JADX WARN: Path cross not found for [B:34:0x00e2, B:38:0x00eb], limit reached: 75 */
        /* JADX WARN: Path cross not found for [B:42:0x00fa, B:58:0x0139], limit reached: 75 */
        /* JADX WARN: Path cross not found for [B:58:0x0139, B:42:0x00fa], limit reached: 75 */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00fa A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #3 {all -> 0x0055, blocks: (B:32:0x00de, B:34:0x00e2, B:39:0x00ec, B:42:0x00fa, B:46:0x0110, B:48:0x0119, B:56:0x0135, B:57:0x0138, B:15:0x0050, B:43:0x0105, B:45:0x010d, B:54:0x0131, B:55:0x0134), top: B:74:0x0050, inners: #5 }] */
        @Override // com.daaw.AbstractC7409pe
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object q(java.lang.Object r14) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 335
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC8481tU0.a.q(java.lang.Object):java.lang.Object");
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC7337pN interfaceC7337pN, InterfaceC1416Ks interfaceC1416Ks) {
            return ((a) a(interfaceC7337pN, interfaceC1416Ks)).q(G91.a);
        }
    }

    public static final boolean b(Set set, Set set2) {
        if (set.size() < set2.size()) {
            Set set3 = set;
            if ((set3 instanceof Collection) && set3.isEmpty()) {
                return false;
            }
            Iterator it = set3.iterator();
            while (it.hasNext()) {
                if (set2.contains(it.next())) {
                    return true;
                }
            }
            return false;
        }
        Set set4 = set2;
        if ((set4 instanceof Collection) && set4.isEmpty()) {
            return false;
        }
        Iterator it2 = set4.iterator();
        while (it2.hasNext()) {
            if (set.contains(it2.next())) {
                return true;
            }
        }
        return false;
    }

    public static final InterfaceC7058oN c(LQ lq) {
        G10.g(lq, "block");
        return AbstractC7894rN.j(new a(lq, null));
    }
}
