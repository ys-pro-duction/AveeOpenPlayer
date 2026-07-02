package com.daaw;

/* JADX INFO: renamed from: com.daaw.Op, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1819Op {
    public static final Object a = new Object();

    public static final InterfaceC1196Ip a(InterfaceC8783ua interfaceC8783ua, AbstractC1300Jp abstractC1300Jp) {
        G10.g(interfaceC8783ua, "applier");
        G10.g(abstractC1300Jp, "parent");
        return new C1715Np(abstractC1300Jp, interfaceC8783ua, null, 4, null);
    }

    public static final void d(VX vx, Object obj, Object obj2) {
        if (vx.a(obj)) {
            WX wx = (WX) vx.d(obj);
            if (wx != null) {
                wx.add(obj2);
                return;
            }
            return;
        }
        WX wx2 = new WX();
        wx2.add(obj2);
        G91 g91 = G91.a;
        vx.j(obj, wx2);
    }
}
