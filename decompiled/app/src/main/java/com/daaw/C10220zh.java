package com.daaw;

import com.daaw.AbstractC5674jS;

/* JADX INFO: renamed from: com.daaw.zh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C10220zh extends YP0 {
    public static final C10220zh r = new C10220zh();

    /* JADX WARN: Illegal instructions before constructor call */
    public C10220zh() {
        C6763nJ c6763nJD = C6763nJ.d();
        AbstractC0956Gh.a(c6763nJD);
        G10.f(c6763nJD, "apply(...)");
        AbstractC5674jS.f fVar = AbstractC0956Gh.a;
        G10.f(fVar, "packageFqName");
        AbstractC5674jS.f fVar2 = AbstractC0956Gh.c;
        G10.f(fVar2, "constructorAnnotation");
        AbstractC5674jS.f fVar3 = AbstractC0956Gh.b;
        G10.f(fVar3, "classAnnotation");
        AbstractC5674jS.f fVar4 = AbstractC0956Gh.d;
        G10.f(fVar4, "functionAnnotation");
        AbstractC5674jS.f fVar5 = AbstractC0956Gh.e;
        G10.f(fVar5, "propertyAnnotation");
        AbstractC5674jS.f fVar6 = AbstractC0956Gh.f;
        G10.f(fVar6, "propertyGetterAnnotation");
        AbstractC5674jS.f fVar7 = AbstractC0956Gh.g;
        G10.f(fVar7, "propertySetterAnnotation");
        AbstractC5674jS.f fVar8 = AbstractC0956Gh.i;
        G10.f(fVar8, "enumEntryAnnotation");
        AbstractC5674jS.f fVar9 = AbstractC0956Gh.h;
        G10.f(fVar9, "compileTimeValue");
        AbstractC5674jS.f fVar10 = AbstractC0956Gh.j;
        G10.f(fVar10, "parameterAnnotation");
        AbstractC5674jS.f fVar11 = AbstractC0956Gh.k;
        G10.f(fVar11, "typeAnnotation");
        AbstractC5674jS.f fVar12 = AbstractC0956Gh.l;
        G10.f(fVar12, "typeParameterAnnotation");
        super(c6763nJD, fVar, fVar2, fVar3, fVar4, null, fVar5, fVar6, fVar7, null, null, null, fVar8, fVar9, fVar10, fVar11, fVar12);
    }

    public final String q(AP ap) {
        G10.g(ap, "fqName");
        return s(ap) + ".kotlin_builtins";
    }

    public final String r(AP ap) {
        G10.g(ap, "fqName");
        StringBuilder sb = new StringBuilder();
        String strB = ap.b();
        G10.f(strB, "asString(...)");
        sb.append(AY0.r(strB, '.', '/', false, 4, null));
        sb.append('/');
        sb.append(q(ap));
        return sb.toString();
    }

    public final String s(AP ap) {
        if (ap.d()) {
            return "default-package";
        }
        String strC = ap.g().c();
        G10.f(strC, "asString(...)");
        return strC;
    }
}
