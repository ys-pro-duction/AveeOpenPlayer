package com.daaw;

import com.daaw.H20;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class JF0 implements H20 {
    public final ClassLoader a;

    public JF0(ClassLoader classLoader) {
        G10.g(classLoader, "classLoader");
        this.a = classLoader;
    }

    @Override // com.daaw.H20
    public Set a(AP ap) {
        G10.g(ap, "packageFqName");
        return null;
    }

    @Override // com.daaw.H20
    public InterfaceC5565j30 b(AP ap, boolean z) {
        G10.g(ap, "fqName");
        return new VF0(ap);
    }

    @Override // com.daaw.H20
    public C20 c(H20.a aVar) {
        G10.g(aVar, "request");
        C6607ml c6607mlA = aVar.a();
        AP apF = c6607mlA.f();
        String strB = c6607mlA.g().b();
        G10.f(strB, "asString(...)");
        String strR = AY0.r(strB, '.', '$', false, 4, null);
        if (!apF.d()) {
            strR = apF.b() + '.' + strR;
        }
        Class clsA = KF0.a(this.a, strR);
        if (clsA != null) {
            return new IF0(clsA);
        }
        return null;
    }
}
