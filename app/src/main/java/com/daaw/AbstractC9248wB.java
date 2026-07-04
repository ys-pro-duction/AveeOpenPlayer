package com.daaw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.wB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9248wB extends AbstractC8404tB {
    public final AbstractC1156If I;
    public final WA J;
    public final C2768Xm0 K;
    public final C8401tA0 L;
    public GA0 M;
    public InterfaceC4346ej0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC9248wB(AP ap, InterfaceC10174zX0 interfaceC10174zX0, InterfaceC2968Zk0 interfaceC2968Zk0, GA0 ga0, AbstractC1156If abstractC1156If, WA wa) {
        super(ap, interfaceC10174zX0, interfaceC2968Zk0);
        G10.g(ap, "fqName");
        G10.g(interfaceC10174zX0, "storageManager");
        G10.g(interfaceC2968Zk0, "module");
        G10.g(ga0, "proto");
        G10.g(abstractC1156If, "metadataVersion");
        this.I = abstractC1156If;
        this.J = wa;
        JA0 ja0S = ga0.S();
        G10.f(ja0S, "getStrings(...)");
        IA0 ia0R = ga0.R();
        G10.f(ia0R, "getQualifiedNames(...)");
        C2768Xm0 c2768Xm0 = new C2768Xm0(ja0S, ia0R);
        this.K = c2768Xm0;
        this.L = new C8401tA0(ga0, c2768Xm0, abstractC1156If, new C8683uB(this));
        this.M = ga0;
    }

    public static final RU0 O0(AbstractC9248wB abstractC9248wB, C6607ml c6607ml) {
        G10.g(abstractC9248wB, "this$0");
        G10.g(c6607ml, "it");
        WA wa = abstractC9248wB.J;
        if (wa != null) {
            return wa;
        }
        RU0 ru0 = RU0.a;
        G10.f(ru0, "NO_SOURCE");
        return ru0;
    }

    public static final Collection Q0(AbstractC9248wB abstractC9248wB) {
        G10.g(abstractC9248wB, "this$0");
        Collection collectionB = abstractC9248wB.F0().b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionB) {
            C6607ml c6607ml = (C6607ml) obj;
            if (!c6607ml.j() && !C6328ll.c.a().contains(c6607ml)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1703Nm.v(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C6607ml) it.next()).h());
        }
        return arrayList2;
    }

    @Override // com.daaw.AbstractC8404tB
    public void L0(C9523xA c9523xA) {
        G10.g(c9523xA, "components");
        GA0 ga0 = this.M;
        if (ga0 == null) {
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize");
        }
        this.M = null;
        FA0 fa0Q = ga0.Q();
        G10.f(fa0Q, "getPackage(...)");
        this.N = new C9527xB(this, fa0Q, this.K, this.I, this.J, c9523xA, "scope of " + this, new C8969vB(this));
    }

    @Override // com.daaw.AbstractC8404tB
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public C8401tA0 F0() {
        return this.L;
    }

    @Override // com.daaw.InterfaceC2372Tr0
    public InterfaceC4346ej0 q() {
        InterfaceC4346ej0 interfaceC4346ej0 = this.N;
        if (interfaceC4346ej0 != null) {
            return interfaceC4346ej0;
        }
        G10.u("_memberScope");
        return null;
    }
}
