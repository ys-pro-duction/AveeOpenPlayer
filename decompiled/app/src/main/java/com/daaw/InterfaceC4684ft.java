package com.daaw;

import com.daaw.InterfaceC1727Ns;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;

/* JADX INFO: renamed from: com.daaw.ft, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC4684ft {

    /* JADX INFO: renamed from: com.daaw.ft$a */
    public static final class a {

        /* JADX INFO: renamed from: com.daaw.ft$a$a, reason: collision with other inner class name */
        public static final class C0173a extends AbstractC4192e90 implements InterfaceC3429bR {
            public static final C0173a B = new C0173a();

            public C0173a() {
                super(2);
            }

            @Override // com.daaw.InterfaceC3429bR
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC4684ft invoke(InterfaceC4684ft interfaceC4684ft, b bVar) {
                G10.g(interfaceC4684ft, "acc");
                G10.g(bVar, "element");
                InterfaceC4684ft interfaceC4684ftQ0 = interfaceC4684ft.Q0(bVar.getKey());
                C5905kG c5905kG = C5905kG.B;
                if (interfaceC4684ftQ0 == c5905kG) {
                    return bVar;
                }
                InterfaceC1727Ns.b bVar2 = InterfaceC1727Ns.e;
                InterfaceC1727Ns interfaceC1727Ns = (InterfaceC1727Ns) interfaceC4684ftQ0.a(bVar2);
                if (interfaceC1727Ns == null) {
                    return new C9134vn(interfaceC4684ftQ0, bVar);
                }
                InterfaceC4684ft interfaceC4684ftQ02 = interfaceC4684ftQ0.Q0(bVar2);
                return interfaceC4684ftQ02 == c5905kG ? new C9134vn(bVar, interfaceC1727Ns) : new C9134vn(new C9134vn(interfaceC4684ftQ02, bVar), interfaceC1727Ns);
            }
        }

        public static InterfaceC4684ft a(InterfaceC4684ft interfaceC4684ft, InterfaceC4684ft interfaceC4684ft2) {
            G10.g(interfaceC4684ft2, "context");
            return interfaceC4684ft2 == C5905kG.B ? interfaceC4684ft : (InterfaceC4684ft) interfaceC4684ft2.c1(interfaceC4684ft, C0173a.B);
        }
    }

    /* JADX INFO: renamed from: com.daaw.ft$b */
    public interface b extends InterfaceC4684ft {

        /* JADX INFO: renamed from: com.daaw.ft$b$a */
        public static final class a {
            public static Object a(b bVar, Object obj, InterfaceC3429bR interfaceC3429bR) {
                G10.g(interfaceC3429bR, "operation");
                return interfaceC3429bR.invoke(obj, bVar);
            }

            public static b b(b bVar, c cVar) {
                G10.g(cVar, SubscriberAttributeKt.JSON_NAME_KEY);
                if (!G10.c(bVar.getKey(), cVar)) {
                    return null;
                }
                G10.e(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            public static InterfaceC4684ft c(b bVar, c cVar) {
                G10.g(cVar, SubscriberAttributeKt.JSON_NAME_KEY);
                return G10.c(bVar.getKey(), cVar) ? C5905kG.B : bVar;
            }

            public static InterfaceC4684ft d(b bVar, InterfaceC4684ft interfaceC4684ft) {
                G10.g(interfaceC4684ft, "context");
                return a.a(bVar, interfaceC4684ft);
            }
        }

        @Override // com.daaw.InterfaceC4684ft
        b a(c cVar);

        c getKey();
    }

    /* JADX INFO: renamed from: com.daaw.ft$c */
    public interface c {
    }

    InterfaceC4684ft Q0(c cVar);

    InterfaceC4684ft U(InterfaceC4684ft interfaceC4684ft);

    b a(c cVar);

    Object c1(Object obj, InterfaceC3429bR interfaceC3429bR);
}
