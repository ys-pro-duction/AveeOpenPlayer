package com.daaw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class D10 {
    public static final AbstractC5708ja1 a(List list) {
        YS0 ys0V0;
        G10.g(list, "types");
        int size = list.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        }
        if (size == 1) {
            return (AbstractC5708ja1) AbstractC2455Um.C0(list);
        }
        List<AbstractC5708ja1> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list2, 10));
        boolean z = false;
        boolean z2 = false;
        for (AbstractC5708ja1 abstractC5708ja1 : list2) {
            z = z || N80.a(abstractC5708ja1);
            if (abstractC5708ja1 instanceof YS0) {
                ys0V0 = (YS0) abstractC5708ja1;
            } else {
                if (!(abstractC5708ja1 instanceof UM)) {
                    throw new C6902no0();
                }
                if (XE.a(abstractC5708ja1)) {
                    return abstractC5708ja1;
                }
                ys0V0 = ((UM) abstractC5708ja1).V0();
                z2 = true;
            }
            arrayList.add(ys0V0);
        }
        if (z) {
            return BH.d(AH.W0, list.toString());
        }
        if (!z2) {
            return U71.a.d(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1703Nm.v(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(ZM.d((AbstractC5708ja1) it.next()));
        }
        U71 u71 = U71.a;
        return M80.e(u71.d(arrayList), u71.d(arrayList2));
    }
}
