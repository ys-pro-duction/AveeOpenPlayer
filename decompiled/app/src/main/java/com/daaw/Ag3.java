package com.daaw;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class Ag3 {
    public static final int a(int i, Object obj, Object obj2) {
        C9940yg3 c9940yg3 = (C9940yg3) obj;
        AbstractC6314li0.a(obj2);
        if (c9940yg3.isEmpty()) {
            return 0;
        }
        Iterator it = c9940yg3.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static final Object b(Object obj, Object obj2) {
        C9940yg3 c9940yg3C = (C9940yg3) obj;
        C9940yg3 c9940yg3 = (C9940yg3) obj2;
        if (!c9940yg3.isEmpty()) {
            if (!c9940yg3C.f()) {
                c9940yg3C = c9940yg3C.c();
            }
            c9940yg3C.e(c9940yg3);
        }
        return c9940yg3C;
    }
}
