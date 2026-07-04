package com.daaw;

import com.daaw.YF0;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class MF0 extends YF0 implements L20 {
    public final Type b;
    public final K20 c;

    public MF0(Type type) {
        K20 if0;
        G10.g(type, "reflectType");
        this.b = type;
        Type typeR = R();
        if (typeR instanceof Class) {
            if0 = new IF0((Class) typeR);
        } else if (typeR instanceof TypeVariable) {
            if0 = new ZF0((TypeVariable) typeR);
        } else {
            if (!(typeR instanceof ParameterizedType)) {
                throw new IllegalStateException("Not a classifier type (" + typeR.getClass() + "): " + typeR);
            }
            Type rawType = ((ParameterizedType) typeR).getRawType();
            G10.e(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            if0 = new IF0((Class) rawType);
        }
        this.c = if0;
    }

    @Override // com.daaw.L20
    public List F() {
        List listH = AbstractC9544xF0.h(R());
        YF0.a aVar = YF0.a;
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(listH, 10));
        Iterator it = listH.iterator();
        while (it.hasNext()) {
            arrayList.add(aVar.a((Type) it.next()));
        }
        return arrayList;
    }

    @Override // com.daaw.YF0
    public Type R() {
        return this.b;
    }

    @Override // com.daaw.InterfaceC9205w20
    public Collection getAnnotations() {
        return AbstractC1599Mm.k();
    }

    @Override // com.daaw.YF0, com.daaw.InterfaceC9205w20
    public InterfaceC7525q20 i(AP ap) {
        G10.g(ap, "fqName");
        return null;
    }

    @Override // com.daaw.L20
    public K20 j() {
        return this.c;
    }

    @Override // com.daaw.InterfaceC9205w20
    public boolean n() {
        return false;
    }

    @Override // com.daaw.L20
    public String p() {
        return R().toString();
    }

    @Override // com.daaw.L20
    public boolean w() {
        Type typeR = R();
        if (typeR instanceof Class) {
            TypeVariable[] typeParameters = ((Class) typeR).getTypeParameters();
            G10.f(typeParameters, "getTypeParameters(...)");
            if (!(typeParameters.length == 0)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.L20
    public String x() {
        throw new UnsupportedOperationException("Type not found: " + R());
    }
}
