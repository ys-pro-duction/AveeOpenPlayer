package com.daaw;

import com.daaw.InterfaceC4684ft;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.io.Serializable;

/* JADX INFO: renamed from: com.daaw.kG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5905kG implements InterfaceC4684ft, Serializable {
    public static final C5905kG B = new C5905kG();

    @Override // com.daaw.InterfaceC4684ft
    public InterfaceC4684ft Q0(InterfaceC4684ft.c cVar) {
        G10.g(cVar, SubscriberAttributeKt.JSON_NAME_KEY);
        return this;
    }

    @Override // com.daaw.InterfaceC4684ft
    public InterfaceC4684ft U(InterfaceC4684ft interfaceC4684ft) {
        G10.g(interfaceC4684ft, "context");
        return interfaceC4684ft;
    }

    @Override // com.daaw.InterfaceC4684ft
    public InterfaceC4684ft.b a(InterfaceC4684ft.c cVar) {
        G10.g(cVar, SubscriberAttributeKt.JSON_NAME_KEY);
        return null;
    }

    @Override // com.daaw.InterfaceC4684ft
    public Object c1(Object obj, InterfaceC3429bR interfaceC3429bR) {
        G10.g(interfaceC3429bR, "operation");
        return obj;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
