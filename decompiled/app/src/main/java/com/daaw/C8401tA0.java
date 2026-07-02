package com.daaw;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.tA0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C8401tA0 implements InterfaceC4077dl {
    public final InterfaceC2664Wm0 a;
    public final AbstractC1156If b;
    public final NQ c;
    public final Map d;

    public C8401tA0(GA0 ga0, InterfaceC2664Wm0 interfaceC2664Wm0, AbstractC1156If abstractC1156If, NQ nq) {
        G10.g(ga0, "proto");
        G10.g(interfaceC2664Wm0, "nameResolver");
        G10.g(abstractC1156If, "metadataVersion");
        G10.g(nq, "classSource");
        this.a = interfaceC2664Wm0;
        this.b = abstractC1156If;
        this.c = nq;
        List listM = ga0.M();
        G10.f(listM, "getClass_List(...)");
        List list = listM;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC8417tE0.d(AbstractC1369Kg0.d(AbstractC1703Nm.v(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(AbstractC3252an0.a(this.a, ((C9245wA0) obj).I0()), obj);
        }
        this.d = linkedHashMap;
    }

    @Override // com.daaw.InterfaceC4077dl
    public C3798cl a(C6607ml c6607ml) {
        G10.g(c6607ml, "classId");
        C9245wA0 c9245wA0 = (C9245wA0) this.d.get(c6607ml);
        if (c9245wA0 == null) {
            return null;
        }
        return new C3798cl(this.a, c9245wA0, this.b, (RU0) this.c.invoke(c6607ml));
    }

    public final Collection b() {
        return this.d.keySet();
    }
}
