package com.daaw;

import com.daaw.AbstractC5247hu;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;

/* JADX INFO: renamed from: com.daaw.cm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3804cm0 extends AbstractC5247hu {
    public C3804cm0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.daaw.AbstractC5247hu
    public Object a(AbstractC5247hu.b bVar) {
        G10.g(bVar, SubscriberAttributeKt.JSON_NAME_KEY);
        return b().get(bVar);
    }

    public final void c(AbstractC5247hu.b bVar, Object obj) {
        G10.g(bVar, SubscriberAttributeKt.JSON_NAME_KEY);
        b().put(bVar, obj);
    }

    public C3804cm0(AbstractC5247hu abstractC5247hu) {
        G10.g(abstractC5247hu, "initialExtras");
        b().putAll(abstractC5247hu.b());
    }

    public /* synthetic */ C3804cm0(AbstractC5247hu abstractC5247hu, int i, AbstractC2911Yw abstractC2911Yw) {
        this((i & 1) != 0 ? AbstractC5247hu.a.b : abstractC5247hu);
    }
}
