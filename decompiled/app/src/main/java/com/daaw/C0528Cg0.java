package com.daaw;

import com.daaw.C10216zg0;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Cg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0528Cg0 implements InterfaceC0424Bg0 {
    public static int i(int i, Object obj, Object obj2) {
        C0320Ag0 c0320Ag0 = (C0320Ag0) obj;
        C10216zg0 c10216zg0 = (C10216zg0) obj2;
        int iA = 0;
        if (c0320Ag0.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : c0320Ag0.entrySet()) {
            iA += c10216zg0.a(i, entry.getKey(), entry.getValue());
        }
        return iA;
    }

    public static C0320Ag0 j(Object obj, Object obj2) {
        C0320Ag0 c0320Ag0L = (C0320Ag0) obj;
        C0320Ag0 c0320Ag0 = (C0320Ag0) obj2;
        if (!c0320Ag0.isEmpty()) {
            if (!c0320Ag0L.i()) {
                c0320Ag0L = c0320Ag0L.l();
            }
            c0320Ag0L.k(c0320Ag0);
        }
        return c0320Ag0L;
    }

    @Override // com.daaw.InterfaceC0424Bg0
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // com.daaw.InterfaceC0424Bg0
    public Object b(Object obj) {
        ((C0320Ag0) obj).j();
        return obj;
    }

    @Override // com.daaw.InterfaceC0424Bg0
    public C10216zg0.a c(Object obj) {
        return ((C10216zg0) obj).c();
    }

    @Override // com.daaw.InterfaceC0424Bg0
    public Map d(Object obj) {
        return (C0320Ag0) obj;
    }

    @Override // com.daaw.InterfaceC0424Bg0
    public Object e(Object obj) {
        return C0320Ag0.e().l();
    }

    @Override // com.daaw.InterfaceC0424Bg0
    public int f(int i, Object obj, Object obj2) {
        return i(i, obj, obj2);
    }

    @Override // com.daaw.InterfaceC0424Bg0
    public boolean g(Object obj) {
        return !((C0320Ag0) obj).i();
    }

    @Override // com.daaw.InterfaceC0424Bg0
    public Map h(Object obj) {
        return (C0320Ag0) obj;
    }
}
