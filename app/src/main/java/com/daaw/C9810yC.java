package com.daaw;

import com.daaw.RM0;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.yC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9810yC implements RM0 {
    public final LQ a;
    public final /* synthetic */ RM0 b;

    public C9810yC(RM0 rm0, LQ lq) {
        G10.g(rm0, "saveableStateRegistry");
        G10.g(lq, "onDispose");
        this.a = lq;
        this.b = rm0;
    }

    @Override // com.daaw.RM0
    public boolean a(Object obj) {
        G10.g(obj, "value");
        return this.b.a(obj);
    }

    @Override // com.daaw.RM0
    public Map b() {
        return this.b.b();
    }

    @Override // com.daaw.RM0
    public Object c(String str) {
        G10.g(str, SubscriberAttributeKt.JSON_NAME_KEY);
        return this.b.c(str);
    }

    @Override // com.daaw.RM0
    public RM0.a d(String str, LQ lq) {
        G10.g(str, SubscriberAttributeKt.JSON_NAME_KEY);
        G10.g(lq, "valueProvider");
        return this.b.d(str, lq);
    }

    public final void e() {
        this.a.invoke();
    }
}
