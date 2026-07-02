package com.daaw;

import com.daaw.YF0;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public final class EF0 extends YF0 implements A20 {
    public final Type b;
    public final YF0 c;
    public final Collection d;
    public final boolean e;

    public EF0(Type type) {
        YF0 yf0A;
        G10.g(type, "reflectType");
        this.b = type;
        Type typeR = R();
        if (!(typeR instanceof GenericArrayType)) {
            if (typeR instanceof Class) {
                Class cls = (Class) typeR;
                if (cls.isArray()) {
                    YF0.a aVar = YF0.a;
                    Class<?> componentType = cls.getComponentType();
                    G10.f(componentType, "getComponentType(...)");
                    yf0A = aVar.a(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + R().getClass() + "): " + R());
        }
        YF0.a aVar2 = YF0.a;
        Type genericComponentType = ((GenericArrayType) typeR).getGenericComponentType();
        G10.f(genericComponentType, "getGenericComponentType(...)");
        yf0A = aVar2.a(genericComponentType);
        this.c = yf0A;
        this.d = AbstractC1599Mm.k();
    }

    @Override // com.daaw.YF0
    public Type R() {
        return this.b;
    }

    @Override // com.daaw.A20
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public YF0 o() {
        return this.c;
    }

    @Override // com.daaw.InterfaceC9205w20
    public Collection getAnnotations() {
        return this.d;
    }

    @Override // com.daaw.InterfaceC9205w20
    public boolean n() {
        return this.e;
    }
}
