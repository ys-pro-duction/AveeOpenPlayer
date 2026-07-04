package com.daaw;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.Ae1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0313Ae1 {
    public final Map a = new LinkedHashMap();

    public final void a() {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC8526te1) it.next()).b();
        }
        this.a.clear();
    }

    public final AbstractC8526te1 b(String str) {
        G10.g(str, SubscriberAttributeKt.JSON_NAME_KEY);
        return (AbstractC8526te1) this.a.get(str);
    }

    public final Set c() {
        return new HashSet(this.a.keySet());
    }

    public final void d(String str, AbstractC8526te1 abstractC8526te1) {
        G10.g(str, SubscriberAttributeKt.JSON_NAME_KEY);
        G10.g(abstractC8526te1, "viewModel");
        AbstractC8526te1 abstractC8526te12 = (AbstractC8526te1) this.a.put(str, abstractC8526te1);
        if (abstractC8526te12 != null) {
            abstractC8526te12.b();
        }
    }
}
