package com.daaw;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.h51, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5020h51 {
    public static final C1596Ml0 b = new C1596Ml0();
    public final Map a = new HashMap();

    public WI0 a(Class cls, Class cls2) {
        WI0 wi0;
        if (cls.equals(cls2)) {
            return H91.b();
        }
        C1596Ml0 c1596Ml0 = b;
        synchronized (c1596Ml0) {
            c1596Ml0.a(cls, cls2);
            wi0 = (WI0) this.a.get(c1596Ml0);
        }
        if (wi0 != null) {
            return wi0;
        }
        throw new IllegalArgumentException("No transcoder registered for " + cls + " and " + cls2);
    }

    public void b(Class cls, Class cls2, WI0 wi0) {
        this.a.put(new C1596Ml0(cls, cls2), wi0);
    }
}
