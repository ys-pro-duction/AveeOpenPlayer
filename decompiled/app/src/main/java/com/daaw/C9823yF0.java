package com.daaw;

import com.daaw.AbstractC10102zF0;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: com.daaw.yF0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9823yF0 extends OF0 implements InterfaceC7525q20 {
    public final Annotation a;

    public C9823yF0(Annotation annotation) {
        G10.g(annotation, "annotation");
        this.a = annotation;
    }

    public final Annotation R() {
        return this.a;
    }

    @Override // com.daaw.InterfaceC7525q20
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public IF0 y() {
        return new IF0(X40.b(X40.a(this.a)));
    }

    @Override // com.daaw.InterfaceC7525q20
    public Collection c() throws IllegalAccessException, InvocationTargetException {
        Method[] declaredMethods = X40.b(X40.a(this.a)).getDeclaredMethods();
        G10.f(declaredMethods, "getDeclaredMethods(...)");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            AbstractC10102zF0.a aVar = AbstractC10102zF0.b;
            Object objInvoke = method.invoke(this.a, null);
            G10.f(objInvoke, "invoke(...)");
            arrayList.add(aVar.a(objInvoke, C2352Tm0.l(method.getName())));
        }
        return arrayList;
    }

    @Override // com.daaw.InterfaceC7525q20
    public C6607ml e() {
        return AbstractC9544xF0.e(X40.b(X40.a(this.a)));
    }

    public boolean equals(Object obj) {
        return (obj instanceof C9823yF0) && this.a == ((C9823yF0) obj).a;
    }

    @Override // com.daaw.InterfaceC7525q20
    public boolean f() {
        return false;
    }

    public int hashCode() {
        return System.identityHashCode(this.a);
    }

    public String toString() {
        return C9823yF0.class.getName() + ": " + this.a;
    }

    @Override // com.daaw.InterfaceC7525q20
    public boolean u() {
        return false;
    }
}
