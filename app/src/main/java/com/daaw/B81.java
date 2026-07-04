package com.daaw;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class B81 {
    public final List a;

    public B81(NA0 na0) {
        G10.g(na0, "typeTable");
        List listD = na0.D();
        if (na0.E()) {
            int iA = na0.A();
            List listD2 = na0.D();
            G10.f(listD2, "getTypeList(...)");
            List list = listD2;
            ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list, 10));
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC1599Mm.u();
                }
                KA0 ka0Q = (KA0) obj;
                if (i >= iA) {
                    ka0Q = ka0Q.f().J(true).a();
                }
                arrayList.add(ka0Q);
                i = i2;
            }
            listD = arrayList;
        }
        G10.f(listD, "run(...)");
        this.a = listD;
    }

    public final KA0 a(int i) {
        return (KA0) this.a.get(i);
    }
}
