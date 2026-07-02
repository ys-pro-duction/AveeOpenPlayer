package com.daaw;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;

/* JADX INFO: renamed from: com.daaw.te1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8526te1 {
    public final C8805ue1 a = new C8805ue1();

    public final void a(String str, AutoCloseable autoCloseable) {
        G10.g(str, SubscriberAttributeKt.JSON_NAME_KEY);
        G10.g(autoCloseable, "closeable");
        C8805ue1 c8805ue1 = this.a;
        if (c8805ue1 != null) {
            c8805ue1.d(str, autoCloseable);
        }
    }

    public final void b() {
        C8805ue1 c8805ue1 = this.a;
        if (c8805ue1 != null) {
            c8805ue1.e();
        }
        d();
    }

    public final AutoCloseable c(String str) {
        G10.g(str, SubscriberAttributeKt.JSON_NAME_KEY);
        C8805ue1 c8805ue1 = this.a;
        if (c8805ue1 != null) {
            return c8805ue1.g(str);
        }
        return null;
    }

    public void d() {
    }
}
