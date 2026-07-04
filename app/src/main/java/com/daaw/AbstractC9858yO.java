package com.daaw;

/* JADX INFO: renamed from: com.daaw.yO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9858yO {
    public static final /* synthetic */ InterfaceC6225lO a(int i, SO so, int i2) {
        G10.g(so, "weight");
        return new PI0(i, so, i2, CO.a.b(), null);
    }

    public static /* synthetic */ InterfaceC6225lO b(int i, SO so, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            so = SO.C.d();
        }
        if ((i3 & 4) != 0) {
            i2 = PO.b.b();
        }
        return a(i, so, i2);
    }
}
