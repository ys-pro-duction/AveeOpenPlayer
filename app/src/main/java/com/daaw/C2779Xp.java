package com.daaw;

import com.daaw.InterfaceC8843um;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: com.daaw.Xp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2779Xp {
    public static final C2779Xp b = new C2779Xp(new InterfaceC8843um.a(), InterfaceC8843um.b.a);
    public final ConcurrentMap a = new ConcurrentHashMap();

    public C2779Xp(InterfaceC2675Wp... interfaceC2675WpArr) {
        for (InterfaceC2675Wp interfaceC2675Wp : interfaceC2675WpArr) {
            this.a.put(interfaceC2675Wp.a(), interfaceC2675Wp);
        }
    }

    public static C2779Xp a() {
        return b;
    }

    public InterfaceC2675Wp b(String str) {
        return (InterfaceC2675Wp) this.a.get(str);
    }
}
