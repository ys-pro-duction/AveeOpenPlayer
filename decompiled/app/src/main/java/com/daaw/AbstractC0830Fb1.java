package com.daaw;

import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.daaw.Fb1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0830Fb1 {
    public static final Logger a = Logger.getLogger(AbstractC0830Fb1.class.getName());

    public static C2756Xj0 a(List list) {
        return AbstractC6962o10.c(b(list));
    }

    public static byte[][] b(List list) {
        byte[][] bArr = new byte[list.size() * 2][];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            FU fu = (FU) it.next();
            int i2 = i + 1;
            bArr[i] = fu.a.x();
            i += 2;
            bArr[i2] = fu.b.x();
        }
        return K51.e(bArr);
    }

    public static C2756Xj0 c(List list) {
        return AbstractC6962o10.c(b(list));
    }
}
