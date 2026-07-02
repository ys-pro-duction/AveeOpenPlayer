package com.daaw;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Ql0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2034Ql0 extends AbstractC7958rc1 {
    public final List a;
    public final Map b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2034Ql0(List list) {
        super(null);
        G10.g(list, "underlyingPropertyNamesToTypes");
        this.a = list;
        Map mapT = AbstractC1473Lg0.t(c());
        if (mapT.size() != c().size()) {
            throw new IllegalArgumentException("Some properties have the same names");
        }
        this.b = mapT;
    }

    @Override // com.daaw.AbstractC7958rc1
    public boolean a(C2352Tm0 c2352Tm0) {
        G10.g(c2352Tm0, "name");
        return this.b.containsKey(c2352Tm0);
    }

    public List c() {
        return this.a;
    }

    public String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + c() + ')';
    }
}
