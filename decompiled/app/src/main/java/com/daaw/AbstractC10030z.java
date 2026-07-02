package com.daaw;

import com.daaw.InterfaceC4684ft;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;

/* JADX INFO: renamed from: com.daaw.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10030z implements InterfaceC4684ft.c {
    public final NQ B;
    public final InterfaceC4684ft.c C;

    public AbstractC10030z(InterfaceC4684ft.c cVar, NQ nq) {
        G10.g(cVar, "baseKey");
        G10.g(nq, "safeCast");
        this.B = nq;
        this.C = cVar instanceof AbstractC10030z ? ((AbstractC10030z) cVar).C : cVar;
    }

    public final boolean a(InterfaceC4684ft.c cVar) {
        G10.g(cVar, SubscriberAttributeKt.JSON_NAME_KEY);
        return cVar == this || this.C == cVar;
    }

    public final InterfaceC4684ft.b b(InterfaceC4684ft.b bVar) {
        G10.g(bVar, "element");
        return (InterfaceC4684ft.b) this.B.invoke(bVar);
    }
}
