package com.daaw;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;

/* JADX INFO: renamed from: com.daaw.dC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3926dC extends AbstractC8392t81 {
    public static final a e = new a(null);
    public final AbstractC8392t81 c;
    public final AbstractC8392t81 d;

    /* JADX INFO: renamed from: com.daaw.dC$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final AbstractC8392t81 a(AbstractC8392t81 abstractC8392t81, AbstractC8392t81 abstractC8392t812) {
            G10.g(abstractC8392t81, "first");
            G10.g(abstractC8392t812, "second");
            return abstractC8392t81.f() ? abstractC8392t812 : abstractC8392t812.f() ? abstractC8392t81 : new C3926dC(abstractC8392t81, abstractC8392t812, null);
        }

        public a() {
        }
    }

    public /* synthetic */ C3926dC(AbstractC8392t81 abstractC8392t81, AbstractC8392t81 abstractC8392t812, AbstractC2911Yw abstractC2911Yw) {
        this(abstractC8392t81, abstractC8392t812);
    }

    public static final AbstractC8392t81 i(AbstractC8392t81 abstractC8392t81, AbstractC8392t81 abstractC8392t812) {
        return e.a(abstractC8392t81, abstractC8392t812);
    }

    @Override // com.daaw.AbstractC8392t81
    public boolean a() {
        return this.c.a() || this.d.a();
    }

    @Override // com.daaw.AbstractC8392t81
    public boolean b() {
        return this.c.b() || this.d.b();
    }

    @Override // com.daaw.AbstractC8392t81
    public InterfaceC3072a8 d(InterfaceC3072a8 interfaceC3072a8) {
        G10.g(interfaceC3072a8, "annotations");
        return this.d.d(this.c.d(interfaceC3072a8));
    }

    @Override // com.daaw.AbstractC8392t81
    public InterfaceC6440m81 e(I80 i80) {
        G10.g(i80, SubscriberAttributeKt.JSON_NAME_KEY);
        InterfaceC6440m81 interfaceC6440m81E = this.c.e(i80);
        return interfaceC6440m81E == null ? this.d.e(i80) : interfaceC6440m81E;
    }

    @Override // com.daaw.AbstractC8392t81
    public boolean f() {
        return false;
    }

    @Override // com.daaw.AbstractC8392t81
    public I80 g(I80 i80, EnumC1042Hc1 enumC1042Hc1) {
        G10.g(i80, "topLevelType");
        G10.g(enumC1042Hc1, "position");
        return this.d.g(this.c.g(i80, enumC1042Hc1), enumC1042Hc1);
    }

    public C3926dC(AbstractC8392t81 abstractC8392t81, AbstractC8392t81 abstractC8392t812) {
        this.c = abstractC8392t81;
        this.d = abstractC8392t812;
    }
}
