package com.daaw;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class E71 extends AbstractC8392t81 {
    public static final a c = new a(null);

    public static final class a {

        /* JADX INFO: renamed from: com.daaw.E71$a$a, reason: collision with other inner class name */
        public static final class C0059a extends E71 {
            public final /* synthetic */ Map d;
            public final /* synthetic */ boolean e;

            public C0059a(Map map, boolean z) {
                this.d = map;
                this.e = z;
            }

            @Override // com.daaw.AbstractC8392t81
            public boolean a() {
                return this.e;
            }

            @Override // com.daaw.AbstractC8392t81
            public boolean f() {
                return this.d.isEmpty();
            }

            @Override // com.daaw.E71
            public InterfaceC6440m81 k(C71 c71) {
                G10.g(c71, SubscriberAttributeKt.JSON_NAME_KEY);
                return (InterfaceC6440m81) this.d.get(c71);
            }
        }

        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public static /* synthetic */ E71 e(a aVar, Map map, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return aVar.d(map, z);
        }

        public final AbstractC8392t81 a(I80 i80) {
            G10.g(i80, "kotlinType");
            return b(i80.N0(), i80.L0());
        }

        public final AbstractC8392t81 b(C71 c71, List list) {
            G10.g(c71, "typeConstructor");
            G10.g(list, "arguments");
            List parameters = c71.getParameters();
            G10.f(parameters, "getParameters(...)");
            Z71 z71 = (Z71) AbstractC2455Um.r0(parameters);
            if (z71 == null || !z71.l0()) {
                return new C8221sZ(parameters, list);
            }
            List parameters2 = c71.getParameters();
            G10.f(parameters2, "getParameters(...)");
            List list2 = parameters2;
            ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((Z71) it.next()).k());
            }
            return e(this, AbstractC1473Lg0.t(AbstractC2455Um.T0(arrayList, list)), false, 2, null);
        }

        public final E71 c(Map map) {
            G10.g(map, "map");
            return e(this, map, false, 2, null);
        }

        public final E71 d(Map map, boolean z) {
            G10.g(map, "map");
            return new C0059a(map, z);
        }

        public a() {
        }
    }

    public static final AbstractC8392t81 i(C71 c71, List list) {
        return c.b(c71, list);
    }

    public static final E71 j(Map map) {
        return c.c(map);
    }

    @Override // com.daaw.AbstractC8392t81
    public InterfaceC6440m81 e(I80 i80) {
        G10.g(i80, SubscriberAttributeKt.JSON_NAME_KEY);
        return k(i80.N0());
    }

    public abstract InterfaceC6440m81 k(C71 c71);
}
