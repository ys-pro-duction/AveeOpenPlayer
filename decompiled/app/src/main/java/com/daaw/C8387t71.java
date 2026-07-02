package com.daaw;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.t71, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C8387t71 extends AbstractC1867Pb implements Iterable, InterfaceC9783y60 {
    public static final a C = new a(null);
    public static final C8387t71 D = new C8387t71(AbstractC1599Mm.k());

    /* JADX INFO: renamed from: com.daaw.t71$a */
    public static final class a extends AbstractC7834r81 {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        @Override // com.daaw.AbstractC7834r81
        public int b(ConcurrentHashMap concurrentHashMap, String str, NQ nq) {
            int iIntValue;
            G10.g(concurrentHashMap, "<this>");
            G10.g(str, SubscriberAttributeKt.JSON_NAME_KEY);
            G10.g(nq, "compute");
            Integer num = (Integer) concurrentHashMap.get(str);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                try {
                    Integer num2 = (Integer) concurrentHashMap.get(str);
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        Object objInvoke = nq.invoke(str);
                        concurrentHashMap.putIfAbsent(str, Integer.valueOf(((Number) objInvoke).intValue()));
                        iIntValue = ((Number) objInvoke).intValue();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return iIntValue;
        }

        public final C8387t71 i(List list) {
            G10.g(list, "attributes");
            return list.isEmpty() ? j() : new C8387t71(list, null);
        }

        public final C8387t71 j() {
            return C8387t71.D;
        }

        public a() {
        }
    }

    public /* synthetic */ C8387t71(List list, AbstractC2911Yw abstractC2911Yw) {
        this(list);
    }

    public final C8387t71 D(C8387t71 c8387t71) {
        G10.g(c8387t71, "other");
        if (isEmpty() && c8387t71.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = C.g().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            AbstractC7551q71 abstractC7551q71 = (AbstractC7551q71) e().get(iIntValue);
            AbstractC7551q71 abstractC7551q712 = (AbstractC7551q71) c8387t71.e().get(iIntValue);
            AbstractC1392Km.a(arrayList, abstractC7551q71 == null ? abstractC7551q712 != null ? abstractC7551q712.c(abstractC7551q71) : null : abstractC7551q71.c(abstractC7551q712));
        }
        return C.i(arrayList);
    }

    public final C8387t71 E(AbstractC7551q71 abstractC7551q71) {
        G10.g(abstractC7551q71, "attribute");
        if (y(abstractC7551q71)) {
            return this;
        }
        if (isEmpty()) {
            return new C8387t71(abstractC7551q71);
        }
        return C.i(AbstractC2455Um.A0(AbstractC2455Um.M0(this), abstractC7551q71));
    }

    public final C8387t71 F(AbstractC7551q71 abstractC7551q71) {
        G10.g(abstractC7551q71, "attribute");
        if (!isEmpty()) {
            AbstractC2511Va abstractC2511VaE = e();
            ArrayList arrayList = new ArrayList();
            for (Object obj : abstractC2511VaE) {
                if (!G10.c((AbstractC7551q71) obj, abstractC7551q71)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.size() != e().e()) {
                return C.i(arrayList);
            }
        }
        return this;
    }

    @Override // com.daaw.AbstractC6118l
    public AbstractC7834r81 m() {
        return C;
    }

    public final C8387t71 w(C8387t71 c8387t71) {
        G10.g(c8387t71, "other");
        if (isEmpty() && c8387t71.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = C.g().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            AbstractC7551q71 abstractC7551q71 = (AbstractC7551q71) e().get(iIntValue);
            AbstractC7551q71 abstractC7551q712 = (AbstractC7551q71) c8387t71.e().get(iIntValue);
            AbstractC1392Km.a(arrayList, abstractC7551q71 == null ? abstractC7551q712 != null ? abstractC7551q712.a(abstractC7551q71) : null : abstractC7551q71.a(abstractC7551q712));
        }
        return C.i(arrayList);
    }

    public final boolean y(AbstractC7551q71 abstractC7551q71) {
        G10.g(abstractC7551q71, "attribute");
        return e().get(C.d(abstractC7551q71.b())) != null;
    }

    public C8387t71(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC7551q71 abstractC7551q71 = (AbstractC7551q71) it.next();
            p(abstractC7551q71.b(), abstractC7551q71);
        }
    }

    public C8387t71(AbstractC7551q71 abstractC7551q71) {
        this(AbstractC1496Lm.e(abstractC7551q71));
    }
}
