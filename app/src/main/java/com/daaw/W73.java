package com.daaw;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class W73 {
    public final LinkedHashMap a;

    public W73(int i) {
        this.a = Y73.b(i);
    }

    public final W73 a(Object obj, InterfaceC8394t83 interfaceC8394t83) {
        AbstractC7000o83.a(obj, SubscriberAttributeKt.JSON_NAME_KEY);
        AbstractC7000o83.a(interfaceC8394t83, "provider");
        this.a.put(obj, interfaceC8394t83);
        return this;
    }
}
