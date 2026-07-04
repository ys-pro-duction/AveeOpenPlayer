package com.daaw;

import com.daaw.C7739qo0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class DP0 {
    public static final E90 a(E90 e90, NQ nq) {
        G10.g(e90, "<this>");
        G10.g(nq, "predicate");
        if (((Boolean) nq.invoke(e90)).booleanValue()) {
            return e90;
        }
        List listP = e90.P();
        int size = listP.size();
        for (int i = 0; i < size; i++) {
            E90 e90A = a((E90) listP.get(i), nq);
            if (e90A != null) {
                return e90A;
            }
        }
        return null;
    }

    public static final List b(E90 e90, List list) {
        G10.g(e90, "<this>");
        G10.g(list, "list");
        if (e90.C0()) {
            ArrayList arrayList = new ArrayList();
            List listP = e90.P();
            int size = listP.size();
            for (int i = 0; i < size; i++) {
                E90 e902 = (E90) listP.get(i);
                if (e902.C0()) {
                    arrayList.add(new C7739qo0(e90, e902));
                }
            }
            List listD = d(arrayList);
            ArrayList arrayList2 = new ArrayList(listD.size());
            int size2 = listD.size();
            for (int i2 = 0; i2 < size2; i2++) {
                arrayList2.add(((C7739qo0) listD.get(i2)).g());
            }
            int size3 = arrayList2.size();
            for (int i3 = 0; i3 < size3; i3++) {
                E90 e903 = (E90) arrayList2.get(i3);
                C7346pP0 c7346pP0J = AbstractC8740uP0.j(e903);
                if (c7346pP0J != null) {
                    list.add(c7346pP0J);
                } else {
                    b(e903, list);
                }
            }
        }
        return list;
    }

    public static /* synthetic */ List c(E90 e90, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        return b(e90, list);
    }

    public static final List d(List list) {
        try {
            C7739qo0.F.a(C7739qo0.b.Stripe);
            List listO0 = AbstractC2455Um.O0(list);
            AbstractC2037Qm.y(listO0);
            return listO0;
        } catch (IllegalArgumentException unused) {
            C7739qo0.F.a(C7739qo0.b.Location);
            List listO02 = AbstractC2455Um.O0(list);
            AbstractC2037Qm.y(listO02);
            return listO02;
        }
    }

    public static final K90 e(E90 e90) {
        K90 k90B;
        G10.g(e90, "<this>");
        C7346pP0 c7346pP0I = AbstractC8740uP0.i(e90);
        if (c7346pP0I == null) {
            c7346pP0I = AbstractC8740uP0.j(e90);
        }
        return (c7346pP0I == null || (k90B = c7346pP0I.b()) == null) ? e90.V() : k90B;
    }
}
