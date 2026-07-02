package com.daaw;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;

/* JADX INFO: renamed from: com.daaw.Gy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1024Gy extends AbstractC8392t81 {
    public final AbstractC8392t81 c;

    public AbstractC1024Gy(AbstractC8392t81 abstractC8392t81) {
        G10.g(abstractC8392t81, "substitution");
        this.c = abstractC8392t81;
    }

    @Override // com.daaw.AbstractC8392t81
    public boolean a() {
        return this.c.a();
    }

    @Override // com.daaw.AbstractC8392t81
    public InterfaceC3072a8 d(InterfaceC3072a8 interfaceC3072a8) {
        G10.g(interfaceC3072a8, "annotations");
        return this.c.d(interfaceC3072a8);
    }

    @Override // com.daaw.AbstractC8392t81
    public InterfaceC6440m81 e(I80 i80) {
        G10.g(i80, SubscriberAttributeKt.JSON_NAME_KEY);
        return this.c.e(i80);
    }

    @Override // com.daaw.AbstractC8392t81
    public boolean f() {
        return this.c.f();
    }

    @Override // com.daaw.AbstractC8392t81
    public I80 g(I80 i80, EnumC1042Hc1 enumC1042Hc1) {
        G10.g(i80, "topLevelType");
        G10.g(enumC1042Hc1, "position");
        return this.c.g(i80, enumC1042Hc1);
    }
}
