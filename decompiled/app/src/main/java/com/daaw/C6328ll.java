package com.daaw;

import com.daaw.C10202zd1;
import com.daaw.C6607ml;
import com.daaw.YV0;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.ll, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C6328ll {
    public static final b c = new b(null);
    public static final Set d;
    public final C9523xA a;
    public final NQ b;

    /* JADX INFO: renamed from: com.daaw.ll$a */
    public static final class a {
        public final C6607ml a;
        public final C3798cl b;

        public a(C6607ml c6607ml, C3798cl c3798cl) {
            G10.g(c6607ml, "classId");
            this.a = c6607ml;
            this.b = c3798cl;
        }

        public final C3798cl a() {
            return this.b;
        }

        public final C6607ml b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && G10.c(this.a, ((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    /* JADX INFO: renamed from: com.daaw.ll$b */
    public static final class b {
        public /* synthetic */ b(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final Set a() {
            return C6328ll.d;
        }

        public b() {
        }
    }

    static {
        C6607ml.a aVar = C6607ml.d;
        AP apL = YV0.a.d.l();
        G10.f(apL, "toSafe(...)");
        d = AbstractC9588xQ0.c(aVar.c(apL));
    }

    public C6328ll(C9523xA c9523xA) {
        G10.g(c9523xA, "components");
        this.a = c9523xA;
        this.b = c9523xA.u().b(new C6040kl(this));
    }

    public static final InterfaceC4923gl c(C6328ll c6328ll, a aVar) {
        G10.g(c6328ll, "this$0");
        G10.g(aVar, SubscriberAttributeKt.JSON_NAME_KEY);
        return c6328ll.d(aVar);
    }

    public static /* synthetic */ InterfaceC4923gl f(C6328ll c6328ll, C6607ml c6607ml, C3798cl c3798cl, int i, Object obj) {
        if ((i & 2) != 0) {
            c3798cl = null;
        }
        return c6328ll.e(c6607ml, c3798cl);
    }

    public final InterfaceC4923gl d(a aVar) {
        Object next;
        BA baA;
        C6607ml c6607mlB = aVar.b();
        Iterator it = this.a.l().iterator();
        while (it.hasNext()) {
            InterfaceC4923gl interfaceC4923glA = ((InterfaceC5480il) it.next()).a(c6607mlB);
            if (interfaceC4923glA != null) {
                return interfaceC4923glA;
            }
        }
        if (d.contains(c6607mlB)) {
            return null;
        }
        C3798cl c3798clA = aVar.a();
        if (c3798clA == null && (c3798clA = this.a.e().a(c6607mlB)) == null) {
            return null;
        }
        InterfaceC2664Wm0 interfaceC2664Wm0A = c3798clA.a();
        C9245wA0 c9245wA0B = c3798clA.b();
        AbstractC1156If abstractC1156IfC = c3798clA.c();
        RU0 ru0D = c3798clA.d();
        C6607ml c6607mlE = c6607mlB.e();
        if (c6607mlE != null) {
            InterfaceC4923gl interfaceC4923glF = f(this, c6607mlE, null, 2, null);
            QA qa = interfaceC4923glF instanceof QA ? (QA) interfaceC4923glF : null;
            if (qa == null || !qa.k1(c6607mlB.h())) {
                return null;
            }
            baA = qa.d1();
        } else {
            Iterator it2 = AbstractC2996Zr0.c(this.a.s(), c6607mlB.f()).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                InterfaceC2372Tr0 interfaceC2372Tr0 = (InterfaceC2372Tr0) next;
                if (!(interfaceC2372Tr0 instanceof AbstractC8404tB) || ((AbstractC8404tB) interfaceC2372Tr0).K0(c6607mlB.h())) {
                    break;
                }
            }
            InterfaceC2372Tr0 interfaceC2372Tr02 = (InterfaceC2372Tr0) next;
            if (interfaceC2372Tr02 == null) {
                return null;
            }
            C9523xA c9523xA = this.a;
            NA0 na0L1 = c9245wA0B.l1();
            G10.f(na0L1, "getTypeTable(...)");
            B81 b81 = new B81(na0L1);
            C10202zd1.a aVar2 = C10202zd1.b;
            QA0 qa0N1 = c9245wA0B.n1();
            G10.f(qa0N1, "getVersionRequirementTable(...)");
            baA = c9523xA.a(interfaceC2372Tr02, interfaceC2664Wm0A, b81, aVar2.a(qa0N1), abstractC1156IfC, null);
            abstractC1156IfC = abstractC1156IfC;
        }
        return new QA(baA, c9245wA0B, interfaceC2664Wm0A, abstractC1156IfC, ru0D);
    }

    public final InterfaceC4923gl e(C6607ml c6607ml, C3798cl c3798cl) {
        G10.g(c6607ml, "classId");
        return (InterfaceC4923gl) this.b.invoke(new a(c6607ml, c3798cl));
    }
}
