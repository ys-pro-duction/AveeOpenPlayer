package com.daaw;

/* JADX INFO: renamed from: com.daaw.e8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4186e8 extends AbstractC7551q71 {
    public final InterfaceC3072a8 a;

    public C4186e8(InterfaceC3072a8 interfaceC3072a8) {
        G10.g(interfaceC3072a8, "annotations");
        this.a = interfaceC3072a8;
    }

    @Override // com.daaw.AbstractC7551q71
    public J50 b() {
        return AbstractC5624jG0.b(C4186e8.class);
    }

    @Override // com.daaw.AbstractC7551q71
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public C4186e8 a(C4186e8 c4186e8) {
        return c4186e8 == null ? this : new C4186e8(AbstractC3908d8.a(this.a, c4186e8.a));
    }

    public final InterfaceC3072a8 e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4186e8) {
            return G10.c(((C4186e8) obj).a, this.a);
        }
        return false;
    }

    @Override // com.daaw.AbstractC7551q71
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C4186e8 c(C4186e8 c4186e8) {
        if (G10.c(c4186e8, this)) {
            return this;
        }
        return null;
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
