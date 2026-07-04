package com.daaw;

import com.daaw.YF0;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* JADX INFO: renamed from: com.daaw.bG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3386bG0 extends YF0 implements S30 {
    public final WildcardType b;
    public final Collection c;
    public final boolean d;

    public C3386bG0(WildcardType wildcardType) {
        G10.g(wildcardType, "reflectType");
        this.b = wildcardType;
        this.c = AbstractC1599Mm.k();
    }

    @Override // com.daaw.S30
    public boolean J() {
        G10.f(R().getUpperBounds(), "getUpperBounds(...)");
        return !G10.c(AbstractC5431ib.G(r0), Object.class);
    }

    @Override // com.daaw.S30
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public YF0 B() {
        Type[] upperBounds = R().getUpperBounds();
        Type[] lowerBounds = R().getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + R());
        }
        if (lowerBounds.length == 1) {
            YF0.a aVar = YF0.a;
            G10.d(lowerBounds);
            Object objV = AbstractC5431ib.V(lowerBounds);
            G10.f(objV, "single(...)");
            return aVar.a((Type) objV);
        }
        if (upperBounds.length == 1) {
            G10.d(upperBounds);
            Type type = (Type) AbstractC5431ib.V(upperBounds);
            if (!G10.c(type, Object.class)) {
                YF0.a aVar2 = YF0.a;
                G10.d(type);
                return aVar2.a(type);
            }
        }
        return null;
    }

    @Override // com.daaw.YF0
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public WildcardType R() {
        return this.b;
    }

    @Override // com.daaw.InterfaceC9205w20
    public Collection getAnnotations() {
        return this.c;
    }

    @Override // com.daaw.InterfaceC9205w20
    public boolean n() {
        return this.d;
    }
}
