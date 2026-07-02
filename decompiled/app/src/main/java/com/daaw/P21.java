package com.daaw;

import com.daaw.T11;

/* JADX INFO: loaded from: classes.dex */
public abstract class P21 {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC7560q90.values().length];
            iArr[EnumC7560q90.Ltr.ordinal()] = 1;
            iArr[EnumC7560q90.Rtl.ordinal()] = 2;
            a = iArr;
        }
    }

    public static final AbstractC5529iv0 b(AbstractC4973gv0 abstractC4973gv0, AbstractC3848cv0 abstractC3848cv0) {
        return null;
    }

    public static final O21 c(O21 o21, EnumC7560q90 enumC7560q90) {
        G10.g(o21, "style");
        G10.g(enumC7560q90, "direction");
        return new O21(YU0.b(o21.u()), AbstractC1520Ls0.a(o21.r(), enumC7560q90), o21.s());
    }

    public static final int d(EnumC7560q90 enumC7560q90, T11 t11) {
        G10.g(enumC7560q90, "layoutDirection");
        T11.a aVar = T11.b;
        if (t11 == null ? false : T11.i(t11.l(), aVar.a())) {
            int i = a.a[enumC7560q90.ordinal()];
            if (i == 1) {
                return aVar.b();
            }
            if (i == 2) {
                return aVar.c();
            }
            throw new C6902no0();
        }
        if (t11 != null) {
            return t11.l();
        }
        int i2 = a.a[enumC7560q90.ordinal()];
        if (i2 == 1) {
            return aVar.d();
        }
        if (i2 == 2) {
            return aVar.e();
        }
        throw new C6902no0();
    }
}
