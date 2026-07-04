package com.daaw;

import com.daaw.C4745g60;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: com.daaw.i60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5303i60 {
    public static final Collection a(J50 j50) {
        G10.g(j50, "<this>");
        Collection collectionJ = ((C4745g60.a) ((C4745g60) j50).X().getValue()).J();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionJ) {
            H50 h50 = (H50) obj;
            if (c(h50) && (h50 instanceof InterfaceC3347b70)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final boolean b(H50 h50) {
        return h50.X().i0() != null;
    }

    public static final boolean c(H50 h50) {
        return !b(h50);
    }
}
