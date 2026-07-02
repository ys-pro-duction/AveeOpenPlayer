package com.daaw;

import com.daaw.C0525Cf1;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class SF0 extends OF0 implements BF0, UF0, InterfaceC3327b30 {
    @Override // com.daaw.UF0
    public int D() {
        return S().getModifiers();
    }

    @Override // com.daaw.InterfaceC3327b30
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public IF0 Q() {
        Class<?> declaringClass = S().getDeclaringClass();
        G10.f(declaringClass, "getDeclaringClass(...)");
        return new IF0(declaringClass);
    }

    public abstract Member S();

    public final List T(Type[] typeArr, Annotation[][] annotationArr, boolean z) throws IllegalAccessException, InvocationTargetException {
        String str;
        G10.g(typeArr, "parameterTypes");
        G10.g(annotationArr, "parameterAnnotations");
        ArrayList arrayList = new ArrayList(typeArr.length);
        List listB = C7246p20.a.b(S());
        int size = listB != null ? listB.size() - typeArr.length : 0;
        int length = typeArr.length;
        int i = 0;
        while (i < length) {
            YF0 yf0A = YF0.a.a(typeArr[i]);
            if (listB != null) {
                str = (String) AbstractC2455Um.h0(listB, i + size);
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i + '+' + size + " (name=" + getName() + " type=" + yf0A + ") in " + this).toString());
                }
            } else {
                str = null;
            }
            arrayList.add(new C3107aG0(yf0A, annotationArr[i], str, z && i == AbstractC5431ib.H(typeArr)));
            i++;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof SF0) && G10.c(S(), ((SF0) obj).S());
    }

    @Override // com.daaw.InterfaceC4162e30
    public boolean g() {
        return Modifier.isStatic(D());
    }

    @Override // com.daaw.InterfaceC9205w20
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // com.daaw.InterfaceC4730g30
    public C2352Tm0 getName() {
        C2352Tm0 c2352Tm0L;
        String name = S().getName();
        return (name == null || (c2352Tm0L = C2352Tm0.l(name)) == null) ? C7091oV0.b : c2352Tm0L;
    }

    @Override // com.daaw.InterfaceC4162e30
    public AbstractC0742Ef1 getVisibility() {
        int iD = D();
        return Modifier.isPublic(iD) ? C0525Cf1.h.c : Modifier.isPrivate(iD) ? C0525Cf1.e.c : Modifier.isProtected(iD) ? Modifier.isStatic(iD) ? R30.c : Q30.c : P30.c;
    }

    public int hashCode() {
        return S().hashCode();
    }

    @Override // com.daaw.InterfaceC9205w20
    public /* bridge */ /* synthetic */ InterfaceC7525q20 i(AP ap) {
        return i(ap);
    }

    @Override // com.daaw.InterfaceC4162e30
    public boolean isAbstract() {
        return Modifier.isAbstract(D());
    }

    @Override // com.daaw.InterfaceC4162e30
    public boolean isFinal() {
        return Modifier.isFinal(D());
    }

    @Override // com.daaw.InterfaceC9205w20
    public boolean n() {
        return false;
    }

    public String toString() {
        return getClass().getName() + ": " + S();
    }

    @Override // com.daaw.BF0
    public AnnotatedElement v() {
        Member memberS = S();
        G10.e(memberS, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        return (AnnotatedElement) memberS;
    }

    @Override // com.daaw.BF0, com.daaw.InterfaceC9205w20
    public List getAnnotations() {
        Annotation[] declaredAnnotations;
        List listB;
        AnnotatedElement annotatedElementV = v();
        return (annotatedElementV == null || (declaredAnnotations = annotatedElementV.getDeclaredAnnotations()) == null || (listB = CF0.b(declaredAnnotations)) == null) ? AbstractC1599Mm.k() : listB;
    }

    @Override // com.daaw.BF0, com.daaw.InterfaceC9205w20
    public C9823yF0 i(AP ap) {
        Annotation[] declaredAnnotations;
        G10.g(ap, "fqName");
        AnnotatedElement annotatedElementV = v();
        if (annotatedElementV == null || (declaredAnnotations = annotatedElementV.getDeclaredAnnotations()) == null) {
            return null;
        }
        return CF0.a(declaredAnnotations, ap);
    }
}
