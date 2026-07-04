package com.daaw;

/* JADX INFO: renamed from: com.daaw.kY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5977kY {
    public static final InterfaceC5418iY a(int i, int i2, int i3, boolean z, AbstractC4933gn abstractC4933gn) {
        G10.g(abstractC4933gn, "colorSpace");
        return S5.a(i, i2, i3, z, abstractC4933gn);
    }

    public static /* synthetic */ InterfaceC5418iY b(int i, int i2, int i3, boolean z, AbstractC4933gn abstractC4933gn, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i3 = AbstractC5698jY.a.b();
        }
        if ((i4 & 8) != 0) {
            z = true;
        }
        if ((i4 & 16) != 0) {
            abstractC4933gn = C5490in.a.r();
        }
        return a(i, i2, i3, z, abstractC4933gn);
    }
}
