package com.daaw;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;

/* JADX INFO: renamed from: com.daaw.oP0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7067oP0 {

    /* JADX INFO: renamed from: com.daaw.oP0$a */
    public static final class a extends AbstractC4192e90 implements LQ {
        public static final a B = new a();

        public a() {
            super(0);
        }

        @Override // com.daaw.LQ
        public final Object invoke() {
            return null;
        }
    }

    public static final Object a(C6788nP0 c6788nP0, BP0 bp0) {
        G10.g(c6788nP0, "<this>");
        G10.g(bp0, SubscriberAttributeKt.JSON_NAME_KEY);
        return c6788nP0.y(bp0, a.B);
    }
}
