package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BM0 {
    public static final InterfaceC3986dR a;

    public /* synthetic */ class a extends AbstractC9591xR implements InterfaceC3986dR {
        public static final a B = new a();

        public a() {
            super(3, InterfaceC7337pN.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // com.daaw.InterfaceC3986dR
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC7337pN interfaceC7337pN, Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            return interfaceC7337pN.c(obj, interfaceC1416Ks);
        }
    }

    static {
        a aVar = a.B;
        G10.e(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        a = (InterfaceC3986dR) V71.e(aVar, 3);
    }
}
