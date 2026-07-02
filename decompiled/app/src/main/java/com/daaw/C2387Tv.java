package com.daaw;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Tv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2387Tv {
    public static final C1596Ml0 b = new C1596Ml0();
    public final Map a = new HashMap();

    public InterfaceC2283Sv a(Class cls, Class cls2) {
        InterfaceC2283Sv interfaceC2283Sv;
        C1596Ml0 c1596Ml0 = b;
        synchronized (c1596Ml0) {
            c1596Ml0.a(cls, cls2);
            interfaceC2283Sv = (InterfaceC2283Sv) this.a.get(c1596Ml0);
        }
        return interfaceC2283Sv == null ? C6193lG.a() : interfaceC2283Sv;
    }

    public void b(Class cls, Class cls2, InterfaceC2283Sv interfaceC2283Sv) {
        this.a.put(new C1596Ml0(cls, cls2), interfaceC2283Sv);
    }
}
