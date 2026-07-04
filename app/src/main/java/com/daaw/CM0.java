package com.daaw;

import com.daaw.InterfaceC4684ft;

/* JADX INFO: loaded from: classes4.dex */
public abstract class CM0 {

    public static final class a extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ AM0 B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AM0 am0) {
            super(2);
            this.B = am0;
        }

        public final Integer a(int i, InterfaceC4684ft.b bVar) {
            InterfaceC4684ft.c key = bVar.getKey();
            InterfaceC4684ft.b bVarA = this.B.F.a(key);
            if (key != U30.k) {
                return Integer.valueOf(bVar != bVarA ? Integer.MIN_VALUE : i + 1);
            }
            U30 u30 = (U30) bVarA;
            G10.e(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
            U30 u30B = CM0.b((U30) bVar, u30);
            if (u30B == u30) {
                if (u30 != null) {
                    i++;
                }
                return Integer.valueOf(i);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + u30B + ", expected child of " + u30 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).intValue(), (InterfaceC4684ft.b) obj2);
        }
    }

    public static final void a(AM0 am0, InterfaceC4684ft interfaceC4684ft) {
        if (((Number) interfaceC4684ft.c1(0, new a(am0))).intValue() == am0.G) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + am0.F + ",\n\t\tbut emission happened in " + interfaceC4684ft + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    public static final U30 b(U30 u30, U30 u302) {
        while (u30 != null) {
            if (u30 == u302 || !(u30 instanceof ON0)) {
                return u30;
            }
            u30 = u30.getParent();
        }
        return null;
    }
}
