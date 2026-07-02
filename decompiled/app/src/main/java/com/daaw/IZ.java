package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public final class IZ extends AbstractC7958rc1 {
    public final C2352Tm0 a;
    public final InterfaceC3159aT0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IZ(C2352Tm0 c2352Tm0, InterfaceC3159aT0 interfaceC3159aT0) {
        super(null);
        G10.g(c2352Tm0, "underlyingPropertyName");
        G10.g(interfaceC3159aT0, "underlyingType");
        this.a = c2352Tm0;
        this.b = interfaceC3159aT0;
    }

    @Override // com.daaw.AbstractC7958rc1
    public boolean a(C2352Tm0 c2352Tm0) {
        G10.g(c2352Tm0, "name");
        return G10.c(this.a, c2352Tm0);
    }

    public final C2352Tm0 c() {
        return this.a;
    }

    public final InterfaceC3159aT0 d() {
        return this.b;
    }

    public String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.a + ", underlyingType=" + this.b + ')';
    }
}
