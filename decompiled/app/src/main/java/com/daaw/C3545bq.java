package com.daaw;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.daaw.bq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3545bq extends AbstractC7150oi {
    public final NQ a;
    public final ConcurrentHashMap b;

    public C3545bq(NQ nq) {
        G10.g(nq, "compute");
        this.a = nq;
        this.b = new ConcurrentHashMap();
    }

    @Override // com.daaw.AbstractC7150oi
    public Object a(Class cls) {
        G10.g(cls, SubscriberAttributeKt.JSON_NAME_KEY);
        ConcurrentHashMap concurrentHashMap = this.b;
        V v = concurrentHashMap.get(cls);
        if (v != 0) {
            return v;
        }
        Object objInvoke = this.a.invoke(cls);
        V vPutIfAbsent = concurrentHashMap.putIfAbsent(cls, objInvoke);
        return vPutIfAbsent == 0 ? objInvoke : vPutIfAbsent;
    }
}
