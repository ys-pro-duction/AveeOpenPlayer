package com.daaw;

import com.daaw.InterfaceC4684ft;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;

/* JADX INFO: renamed from: com.daaw.Ns, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC1727Ns extends InterfaceC4684ft.b {
    public static final b e = b.B;

    /* JADX INFO: renamed from: com.daaw.Ns$a */
    public static final class a {
        public static InterfaceC4684ft.b a(InterfaceC1727Ns interfaceC1727Ns, InterfaceC4684ft.c cVar) {
            G10.g(cVar, SubscriberAttributeKt.JSON_NAME_KEY);
            if (!(cVar instanceof AbstractC10030z)) {
                if (InterfaceC1727Ns.e != cVar) {
                    return null;
                }
                G10.e(interfaceC1727Ns, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return interfaceC1727Ns;
            }
            AbstractC10030z abstractC10030z = (AbstractC10030z) cVar;
            if (abstractC10030z.a(interfaceC1727Ns.getKey())) {
                InterfaceC4684ft.b bVarB = abstractC10030z.b(interfaceC1727Ns);
                if (AbstractC2988Zp0.a(bVarB)) {
                    return bVarB;
                }
            }
            return null;
        }

        public static InterfaceC4684ft b(InterfaceC1727Ns interfaceC1727Ns, InterfaceC4684ft.c cVar) {
            G10.g(cVar, SubscriberAttributeKt.JSON_NAME_KEY);
            if (!(cVar instanceof AbstractC10030z)) {
                return InterfaceC1727Ns.e == cVar ? C5905kG.B : interfaceC1727Ns;
            }
            AbstractC10030z abstractC10030z = (AbstractC10030z) cVar;
            return (!abstractC10030z.a(interfaceC1727Ns.getKey()) || abstractC10030z.b(interfaceC1727Ns) == null) ? interfaceC1727Ns : C5905kG.B;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ns$b */
    public static final class b implements InterfaceC4684ft.c {
        public static final /* synthetic */ b B = new b();
    }

    InterfaceC1416Ks q0(InterfaceC1416Ks interfaceC1416Ks);

    void x0(InterfaceC1416Ks interfaceC1416Ks);
}
