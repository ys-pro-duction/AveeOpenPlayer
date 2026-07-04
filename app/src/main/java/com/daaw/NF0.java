package com.daaw;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class NF0 extends SF0 implements M20 {
    public final Constructor a;

    public NF0(Constructor constructor) {
        G10.g(constructor, "member");
        this.a = constructor;
    }

    @Override // com.daaw.SF0
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public Constructor S() {
        return this.a;
    }

    @Override // com.daaw.H30
    public List getTypeParameters() {
        TypeVariable[] typeParameters = S().getTypeParameters();
        G10.f(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new ZF0(typeVariable));
        }
        return arrayList;
    }

    @Override // com.daaw.M20
    public List h() {
        Type[] genericParameterTypes = S().getGenericParameterTypes();
        G10.d(genericParameterTypes);
        if (genericParameterTypes.length == 0) {
            return AbstractC1599Mm.k();
        }
        Class declaringClass = S().getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            genericParameterTypes = (Type[]) AbstractC5152hb.n(genericParameterTypes, 1, genericParameterTypes.length);
        }
        Annotation[][] parameterAnnotations = S().getParameterAnnotations();
        if (parameterAnnotations.length < genericParameterTypes.length) {
            throw new IllegalStateException("Illegal generic signature: " + S());
        }
        if (parameterAnnotations.length > genericParameterTypes.length) {
            G10.d(parameterAnnotations);
            parameterAnnotations = (Annotation[][]) AbstractC5152hb.n(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
        }
        G10.d(genericParameterTypes);
        G10.d(parameterAnnotations);
        return T(genericParameterTypes, parameterAnnotations, S().isVarArgs());
    }
}
