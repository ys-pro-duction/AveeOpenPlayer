package com.daaw;

import com.daaw.RM0;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class SM0 implements RM0 {
    public final NQ a;
    public final Map b;
    public final Map c;

    public static final class a implements RM0.a {
        public final /* synthetic */ String b;
        public final /* synthetic */ LQ c;

        public a(String str, LQ lq) {
            this.b = str;
            this.c = lq;
        }

        @Override // com.daaw.RM0.a
        public void a() {
            List list = (List) SM0.this.c.remove(this.b);
            if (list != null) {
                list.remove(this.c);
            }
            if (list == null || list.isEmpty()) {
                return;
            }
            SM0.this.c.put(this.b, list);
        }
    }

    public SM0(Map map, NQ nq) {
        Map mapX;
        G10.g(nq, "canBeSaved");
        this.a = nq;
        this.b = (map == null || (mapX = AbstractC1473Lg0.x(map)) == null) ? new LinkedHashMap() : mapX;
        this.c = new LinkedHashMap();
    }

    @Override // com.daaw.RM0
    public boolean a(Object obj) {
        G10.g(obj, "value");
        return ((Boolean) this.a.invoke(obj)).booleanValue();
    }

    @Override // com.daaw.RM0
    public Map b() {
        Map mapX = AbstractC1473Lg0.x(this.b);
        for (Map.Entry entry : this.c.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() == 1) {
                Object objInvoke = ((LQ) list.get(0)).invoke();
                if (objInvoke == null) {
                    continue;
                } else {
                    if (!a(objInvoke)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    mapX.put(str, AbstractC1599Mm.g(objInvoke));
                }
            } else {
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    Object objInvoke2 = ((LQ) list.get(i)).invoke();
                    if (objInvoke2 != null && !a(objInvoke2)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    arrayList.add(objInvoke2);
                }
                mapX.put(str, arrayList);
            }
        }
        return mapX;
    }

    @Override // com.daaw.RM0
    public Object c(String str) {
        G10.g(str, SubscriberAttributeKt.JSON_NAME_KEY);
        List list = (List) this.b.remove(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1) {
            this.b.put(str, list.subList(1, list.size()));
        }
        return list.get(0);
    }

    @Override // com.daaw.RM0
    public RM0.a d(String str, LQ lq) {
        G10.g(str, SubscriberAttributeKt.JSON_NAME_KEY);
        G10.g(lq, "valueProvider");
        if (BY0.O(str)) {
            throw new IllegalArgumentException("Registered key is empty or blank");
        }
        Map map = this.c;
        Object arrayList = map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(str, arrayList);
        }
        ((List) arrayList).add(lq);
        return new a(str, lq);
    }
}
