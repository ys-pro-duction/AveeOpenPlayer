package com.daaw;

import com.daaw.YF0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class TF0 extends SF0 implements InterfaceC3605c30 {
    public final Method a;

    public TF0(Method method) {
        G10.g(method, "member");
        this.a = method;
    }

    @Override // com.daaw.InterfaceC3605c30
    public boolean M() {
        return r() != null;
    }

    @Override // com.daaw.SF0
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public Method S() {
        return this.a;
    }

    @Override // com.daaw.InterfaceC3605c30
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public YF0 getReturnType() {
        YF0.a aVar = YF0.a;
        Type genericReturnType = S().getGenericReturnType();
        G10.f(genericReturnType, "getGenericReturnType(...)");
        return aVar.a(genericReturnType);
    }

    @Override // com.daaw.H30
    public List getTypeParameters() {
        TypeVariable<Method>[] typeParameters = S().getTypeParameters();
        G10.f(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new ZF0(typeVariable));
        }
        return arrayList;
    }

    @Override // com.daaw.InterfaceC3605c30
    public List h() {
        Type[] genericParameterTypes = S().getGenericParameterTypes();
        G10.f(genericParameterTypes, "getGenericParameterTypes(...)");
        Annotation[][] parameterAnnotations = S().getParameterAnnotations();
        G10.f(parameterAnnotations, "getParameterAnnotations(...)");
        return T(genericParameterTypes, parameterAnnotations, S().isVarArgs());
    }

    @Override // com.daaw.InterfaceC3605c30
    public InterfaceC7803r20 r() {
        Object defaultValue = S().getDefaultValue();
        if (defaultValue != null) {
            return AbstractC10102zF0.b.a(defaultValue, null);
        }
        return null;
    }
}
