package com.daaw;

import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public final class WF0 extends YF0 implements InterfaceC5847k30 {
    public final Class b;
    public final Collection c;
    public final boolean d;

    public WF0(Class cls) {
        G10.g(cls, "reflectType");
        this.b = cls;
        this.c = AbstractC1599Mm.k();
    }

    @Override // com.daaw.YF0
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public Class R() {
        return this.b;
    }

    @Override // com.daaw.InterfaceC9205w20
    public Collection getAnnotations() {
        return this.c;
    }

    @Override // com.daaw.InterfaceC5847k30
    public EnumC8067rz0 getType() {
        if (G10.c(R(), Void.TYPE)) {
            return null;
        }
        return EnumC6703n50.g(R().getName()).l();
    }

    @Override // com.daaw.InterfaceC9205w20
    public boolean n() {
        return this.d;
    }
}
