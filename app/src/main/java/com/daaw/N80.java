package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public abstract class N80 {
    public static final boolean a(I80 i80) {
        G10.g(i80, "<this>");
        AbstractC5708ja1 abstractC5708ja1Q0 = i80.Q0();
        if (abstractC5708ja1Q0 instanceof C9830yH) {
            return true;
        }
        return (abstractC5708ja1Q0 instanceof UM) && (((UM) abstractC5708ja1Q0).U0() instanceof C9830yH);
    }

    public static final boolean b(I80 i80) {
        G10.g(i80, "<this>");
        return D81.l(i80);
    }
}
