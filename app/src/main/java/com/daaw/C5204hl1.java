package com.daaw;

import com.google.android.gms.common.Feature;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;

/* JADX INFO: renamed from: com.daaw.hl1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5204hl1 {
    public final H8 a;
    public final Feature b;

    public /* synthetic */ C5204hl1(H8 h8, Feature feature, AbstractC4925gl1 abstractC4925gl1) {
        this.a = h8;
        this.b = feature;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C5204hl1)) {
            C5204hl1 c5204hl1 = (C5204hl1) obj;
            if (AbstractC8022rp0.a(this.a, c5204hl1.a) && AbstractC8022rp0.a(this.b, c5204hl1.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC8022rp0.b(this.a, this.b);
    }

    public final String toString() {
        return AbstractC8022rp0.c(this).a(SubscriberAttributeKt.JSON_NAME_KEY, this.a).a("feature", this.b).toString();
    }
}
