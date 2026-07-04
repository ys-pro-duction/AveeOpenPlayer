package com.daaw;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class D41 {
    public static final b a = new b(null);

    public static final class a extends D41 {
        public final AbstractC8651u41 b;

        /* JADX INFO: renamed from: com.daaw.D41$a$a, reason: collision with other inner class name */
        public static final class C0055a extends SZ0 implements InterfaceC3429bR {
            public int F;
            public final /* synthetic */ C9595xS H;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0055a(C9595xS c9595xS, InterfaceC1416Ks interfaceC1416Ks) {
                super(2, interfaceC1416Ks);
                this.H = c9595xS;
            }

            @Override // com.daaw.AbstractC7409pe
            public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                return a.this.new C0055a(this.H, interfaceC1416Ks);
            }

            @Override // com.daaw.AbstractC7409pe
            public final Object q(Object obj) throws Throwable {
                Object objC = I10.c();
                int i = this.F;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC4801gJ0.b(obj);
                    return obj;
                }
                AbstractC4801gJ0.b(obj);
                AbstractC8651u41 abstractC8651u41 = a.this.b;
                C9595xS c9595xS = this.H;
                this.F = 1;
                Object objA = abstractC8651u41.a(c9595xS, this);
                return objA == objC ? objC : objA;
            }

            @Override // com.daaw.InterfaceC3429bR
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
                return ((C0055a) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
            }
        }

        public a(AbstractC8651u41 abstractC8651u41) {
            G10.g(abstractC8651u41, "mTopicsManager");
            this.b = abstractC8651u41;
        }

        @Override // com.daaw.D41
        public InterfaceFutureC8236sc0 b(C9595xS c9595xS) {
            G10.g(c9595xS, "request");
            return AbstractC4395et.c(AbstractC9104vh.b(AbstractC7763qt.a(C7850rC.c()), null, null, new C0055a(c9595xS, null), 3, null), null, 1, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final D41 a(Context context) {
            G10.g(context, "context");
            AbstractC8651u41 abstractC8651u41A = AbstractC8651u41.a.a(context);
            if (abstractC8651u41A != null) {
                return new a(abstractC8651u41A);
            }
            return null;
        }

        public b() {
        }
    }

    public static final D41 a(Context context) {
        return a.a(context);
    }

    public abstract InterfaceFutureC8236sc0 b(C9595xS c9595xS);
}
