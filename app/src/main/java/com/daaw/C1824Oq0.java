package com.daaw;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;

/* JADX INFO: renamed from: com.daaw.Oq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1824Oq0 {
    public final String a;

    public C1824Oq0(String str) {
        G10.g(str, SubscriberAttributeKt.JSON_NAME_KEY);
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1824Oq0) && G10.c(this.a, ((C1824Oq0) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "OpaqueKey(key=" + this.a + ')';
    }
}
