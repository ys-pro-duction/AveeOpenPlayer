package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public abstract class H10 {

    public static final class a extends AbstractC3955dJ0 {
        public int C;
        public final /* synthetic */ InterfaceC3429bR D;
        public final /* synthetic */ Object E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC1416Ks interfaceC1416Ks, InterfaceC3429bR interfaceC3429bR, Object obj) {
            super(interfaceC1416Ks);
            this.D = interfaceC3429bR;
            this.E = obj;
            G10.e(interfaceC1416Ks, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // com.daaw.AbstractC7409pe
        public Object q(Object obj) throws Throwable {
            int i = this.C;
            if (i == 0) {
                this.C = 1;
                AbstractC4801gJ0.b(obj);
                G10.e(this.D, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((InterfaceC3429bR) V71.e(this.D, 2)).invoke(this.E, this);
            }
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.C = 2;
            AbstractC4801gJ0.b(obj);
            return obj;
        }
    }

    public static final class b extends AbstractC1623Ms {
        public int E;
        public final /* synthetic */ InterfaceC3429bR F;
        public final /* synthetic */ Object G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC1416Ks interfaceC1416Ks, InterfaceC4684ft interfaceC4684ft, InterfaceC3429bR interfaceC3429bR, Object obj) {
            super(interfaceC1416Ks, interfaceC4684ft);
            this.F = interfaceC3429bR;
            this.G = obj;
            G10.e(interfaceC1416Ks, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // com.daaw.AbstractC7409pe
        public Object q(Object obj) throws Throwable {
            int i = this.E;
            if (i == 0) {
                this.E = 1;
                AbstractC4801gJ0.b(obj);
                G10.e(this.F, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((InterfaceC3429bR) V71.e(this.F, 2)).invoke(this.G, this);
            }
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.E = 2;
            AbstractC4801gJ0.b(obj);
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC1416Ks a(InterfaceC3429bR interfaceC3429bR, Object obj, InterfaceC1416Ks interfaceC1416Ks) {
        G10.g(interfaceC3429bR, "<this>");
        G10.g(interfaceC1416Ks, "completion");
        InterfaceC1416Ks interfaceC1416KsA = AbstractC7497pw.a(interfaceC1416Ks);
        if (interfaceC3429bR instanceof AbstractC7409pe) {
            return ((AbstractC7409pe) interfaceC3429bR).a(obj, interfaceC1416KsA);
        }
        InterfaceC4684ft context = interfaceC1416KsA.getContext();
        return context == C5905kG.B ? new a(interfaceC1416KsA, interfaceC3429bR, obj) : new b(interfaceC1416KsA, context, interfaceC3429bR, obj);
    }

    public static InterfaceC1416Ks b(InterfaceC1416Ks interfaceC1416Ks) {
        InterfaceC1416Ks interfaceC1416KsT;
        G10.g(interfaceC1416Ks, "<this>");
        AbstractC1623Ms abstractC1623Ms = interfaceC1416Ks instanceof AbstractC1623Ms ? (AbstractC1623Ms) interfaceC1416Ks : null;
        return (abstractC1623Ms == null || (interfaceC1416KsT = abstractC1623Ms.t()) == null) ? interfaceC1416Ks : interfaceC1416KsT;
    }
}
