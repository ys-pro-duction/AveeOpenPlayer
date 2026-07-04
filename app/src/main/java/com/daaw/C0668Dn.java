package com.daaw;

import com.daaw.C6607ml;
import com.daaw.YV0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.Dn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0668Dn {
    public static final C0668Dn a = new C0668Dn();
    public static final Set b;

    static {
        Set set = EnumC8067rz0.G;
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(YV0.c((EnumC8067rz0) it.next()));
        }
        List listA0 = AbstractC2455Um.A0(AbstractC2455Um.A0(AbstractC2455Um.A0(arrayList, YV0.a.h.l()), YV0.a.j.l()), YV0.a.s.l());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C6607ml.a aVar = C6607ml.d;
        Iterator it2 = listA0.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(aVar.c((AP) it2.next()));
        }
        b = linkedHashSet;
    }

    public final Set a() {
        return b;
    }

    public final Set b() {
        return b;
    }
}
