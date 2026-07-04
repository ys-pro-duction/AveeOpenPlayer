package com.daaw;

import com.daaw.AbstractC2335Ti;
import com.daaw.AbstractC5867k70;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/* JADX INFO: renamed from: com.daaw.p70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7271p70 {
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.daaw.InterfaceC2231Si b(com.daaw.AbstractC5867k70.a r6, boolean r7) {
        /*
            Method dump skipped, instruction units count: 587
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC7271p70.b(com.daaw.k70$a, boolean):com.daaw.Si");
    }

    public static final AbstractC2335Ti c(AbstractC5867k70.a aVar, boolean z, Field field) {
        return (g(aVar.m().X()) || !Modifier.isStatic(field.getModifiers())) ? z ? aVar.V() ? new AbstractC2335Ti.f.a(field, f(aVar)) : new AbstractC2335Ti.f.c(field) : aVar.V() ? new AbstractC2335Ti.g.a(field, e(aVar), f(aVar)) : new AbstractC2335Ti.g.c(field, e(aVar)) : d(aVar) ? z ? aVar.V() ? new AbstractC2335Ti.f.b(field) : new AbstractC2335Ti.f.d(field) : aVar.V() ? new AbstractC2335Ti.g.b(field, e(aVar)) : new AbstractC2335Ti.g.d(field, e(aVar)) : z ? new AbstractC2335Ti.f.e(field) : new AbstractC2335Ti.g.e(field, e(aVar));
    }

    public static final boolean d(AbstractC5867k70.a aVar) {
        return aVar.m().X().getAnnotations().z(AbstractC8511tb1.j());
    }

    public static final boolean e(AbstractC5867k70.a aVar) {
        return !D81.l(aVar.m().X().getType());
    }

    public static final Object f(AbstractC5867k70.a aVar) {
        G10.g(aVar, "<this>");
        return aVar.m().c0();
    }

    public static final boolean g(InterfaceC4476fA0 interfaceC4476fA0) {
        InterfaceC8612tw interfaceC8612twB = interfaceC4476fA0.b();
        G10.f(interfaceC8612twB, "getContainingDeclaration(...)");
        if (!AbstractC7006oA.x(interfaceC8612twB)) {
            return false;
        }
        InterfaceC8612tw interfaceC8612twB2 = interfaceC8612twB.b();
        if (AbstractC7006oA.C(interfaceC8612twB2) || AbstractC7006oA.t(interfaceC8612twB2)) {
            return (interfaceC4476fA0 instanceof C9806yB) && C7540q50.f(((C9806yB) interfaceC4476fA0).C());
        }
        return true;
    }
}
