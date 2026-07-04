package com.daaw;

/* JADX INFO: renamed from: com.daaw.Ng, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1679Ng extends AbstractC0952Gg {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1679Ng(InterfaceC1160Ig interfaceC1160Ig) {
        super(interfaceC1160Ig);
        G10.g(interfaceC1160Ig, "defaultParent");
    }

    public final Object d(C3103aF0 c3103aF0, InterfaceC1416Ks interfaceC1416Ks) {
        InterfaceC7002o90 interfaceC7002o90A = a();
        if (interfaceC7002o90A == null) {
            return G91.a;
        }
        if (c3103aF0 == null) {
            c3103aF0 = BT0.c(J00.b(interfaceC7002o90A.d()));
        }
        Object objA = c().a(c3103aF0, interfaceC7002o90A, interfaceC1416Ks);
        return objA == I10.c() ? objA : G91.a;
    }
}
