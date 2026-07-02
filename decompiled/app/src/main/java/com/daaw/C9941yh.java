package com.daaw;

import com.daaw.C10149zR;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.yh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9941yh implements InterfaceC5480il {
    public final InterfaceC10174zX0 a;
    public final InterfaceC2968Zk0 b;

    public C9941yh(InterfaceC10174zX0 interfaceC10174zX0, InterfaceC2968Zk0 interfaceC2968Zk0) {
        G10.g(interfaceC10174zX0, "storageManager");
        G10.g(interfaceC2968Zk0, "module");
        this.a = interfaceC10174zX0;
        this.b = interfaceC2968Zk0;
    }

    @Override // com.daaw.InterfaceC5480il
    public InterfaceC4923gl a(C6607ml c6607ml) {
        AP apF;
        C10149zR.b bVarC;
        G10.g(c6607ml, "classId");
        if (c6607ml.i() || c6607ml.j()) {
            return null;
        }
        String strB = c6607ml.g().b();
        G10.f(strB, "asString(...)");
        if (!BY0.z(strB, "Function", false, 2, null) || (bVarC = C10149zR.c.a().c((apF = c6607ml.f()), strB)) == null) {
            return null;
        }
        AbstractC9870yR abstractC9870yRA = bVarC.a();
        int iB = bVarC.b();
        List listG = this.b.r0(apF).G();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listG) {
            if (obj instanceof InterfaceC0748Eh) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        AbstractC6314li0.a(AbstractC2455Um.g0(arrayList2));
        return new C7632qR(this.a, (InterfaceC0748Eh) AbstractC2455Um.e0(arrayList), abstractC9870yRA, iB);
    }

    @Override // com.daaw.InterfaceC5480il
    public boolean b(AP ap, C2352Tm0 c2352Tm0) {
        G10.g(ap, "packageFqName");
        G10.g(c2352Tm0, "name");
        String strC = c2352Tm0.c();
        G10.f(strC, "asString(...)");
        return (AY0.u(strC, "Function", false, 2, null) || AY0.u(strC, "KFunction", false, 2, null) || AY0.u(strC, "SuspendFunction", false, 2, null) || AY0.u(strC, "KSuspendFunction", false, 2, null)) && C10149zR.c.a().c(ap, strC) != null;
    }

    @Override // com.daaw.InterfaceC5480il
    public Collection c(AP ap) {
        G10.g(ap, "packageFqName");
        return AbstractC9867yQ0.d();
    }
}
