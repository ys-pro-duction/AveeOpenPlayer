package com.daaw;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ZF0 extends OF0 implements BF0, G30 {
    public final TypeVariable a;

    public ZF0(TypeVariable typeVariable) {
        G10.g(typeVariable, "typeVariable");
        this.a = typeVariable;
    }

    @Override // com.daaw.G30
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public List getUpperBounds() {
        Type[] bounds = this.a.getBounds();
        G10.f(bounds, "getBounds(...)");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new MF0(type));
        }
        MF0 mf0 = (MF0) AbstractC2455Um.E0(arrayList);
        return G10.c(mf0 != null ? mf0.R() : null, Object.class) ? AbstractC1599Mm.k() : arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ZF0) && G10.c(this.a, ((ZF0) obj).a);
    }

    @Override // com.daaw.InterfaceC9205w20
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // com.daaw.InterfaceC4730g30
    public C2352Tm0 getName() {
        C2352Tm0 c2352Tm0L = C2352Tm0.l(this.a.getName());
        G10.f(c2352Tm0L, "identifier(...)");
        return c2352Tm0L;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.daaw.InterfaceC9205w20
    public /* bridge */ /* synthetic */ InterfaceC7525q20 i(AP ap) {
        return i(ap);
    }

    @Override // com.daaw.InterfaceC9205w20
    public boolean n() {
        return false;
    }

    public String toString() {
        return ZF0.class.getName() + ": " + this.a;
    }

    @Override // com.daaw.BF0
    public AnnotatedElement v() {
        TypeVariable typeVariable = this.a;
        if (typeVariable instanceof AnnotatedElement) {
            return (AnnotatedElement) typeVariable;
        }
        return null;
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
