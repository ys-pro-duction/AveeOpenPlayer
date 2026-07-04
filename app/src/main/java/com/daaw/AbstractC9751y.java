package com.daaw;

import com.daaw.InterfaceC4684ft;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;

/* JADX INFO: renamed from: com.daaw.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9751y implements InterfaceC4684ft.b {
    public final InterfaceC4684ft.c B;

    public AbstractC9751y(InterfaceC4684ft.c cVar) {
        G10.g(cVar, SubscriberAttributeKt.JSON_NAME_KEY);
        this.B = cVar;
    }

    @Override // com.daaw.InterfaceC4684ft
    public InterfaceC4684ft Q0(InterfaceC4684ft.c cVar) {
        return InterfaceC4684ft.b.a.c(this, cVar);
    }

    @Override // com.daaw.InterfaceC4684ft
    public InterfaceC4684ft U(InterfaceC4684ft interfaceC4684ft) {
        return InterfaceC4684ft.b.a.d(this, interfaceC4684ft);
    }

    @Override // com.daaw.InterfaceC4684ft.b, com.daaw.InterfaceC4684ft
    public InterfaceC4684ft.b a(InterfaceC4684ft.c cVar) {
        return InterfaceC4684ft.b.a.b(this, cVar);
    }

    @Override // com.daaw.InterfaceC4684ft
    public Object c1(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return InterfaceC4684ft.b.a.a(this, obj, interfaceC3429bR);
    }

    @Override // com.daaw.InterfaceC4684ft.b
    public InterfaceC4684ft.c getKey() {
        return this.B;
    }
}
