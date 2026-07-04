package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ZM {
    public static final UM a(I80 i80) {
        G10.g(i80, "<this>");
        AbstractC5708ja1 abstractC5708ja1Q0 = i80.Q0();
        G10.e(abstractC5708ja1Q0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return (UM) abstractC5708ja1Q0;
    }

    public static final boolean b(I80 i80) {
        G10.g(i80, "<this>");
        return i80.Q0() instanceof UM;
    }

    public static final YS0 c(I80 i80) {
        G10.g(i80, "<this>");
        AbstractC5708ja1 abstractC5708ja1Q0 = i80.Q0();
        if (abstractC5708ja1Q0 instanceof UM) {
            return ((UM) abstractC5708ja1Q0).V0();
        }
        if (abstractC5708ja1Q0 instanceof YS0) {
            return (YS0) abstractC5708ja1Q0;
        }
        throw new C6902no0();
    }

    public static final YS0 d(I80 i80) {
        G10.g(i80, "<this>");
        AbstractC5708ja1 abstractC5708ja1Q0 = i80.Q0();
        if (abstractC5708ja1Q0 instanceof UM) {
            return ((UM) abstractC5708ja1Q0).W0();
        }
        if (abstractC5708ja1Q0 instanceof YS0) {
            return (YS0) abstractC5708ja1Q0;
        }
        throw new C6902no0();
    }
}
