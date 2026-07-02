package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public final class RF0 extends AbstractC10102zF0 implements Z20 {
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RF0(C2352Tm0 c2352Tm0, Object obj) {
        super(c2352Tm0, null);
        G10.g(obj, "value");
        this.c = obj;
    }

    @Override // com.daaw.Z20
    public Object getValue() {
        return this.c;
    }
}
