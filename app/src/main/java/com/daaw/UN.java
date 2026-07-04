package com.daaw;

import com.daaw.HN;

/* JADX INFO: loaded from: classes.dex */
public abstract class UN {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC7560q90.values().length];
            iArr[EnumC7560q90.Ltr.ordinal()] = 1;
            iArr[EnumC7560q90.Rtl.ordinal()] = 2;
            a = iArr;
        }
    }

    public static final ZN a(SN sn, int i, EnumC7560q90 enumC7560q90) {
        ZN znK;
        ZN zn;
        ZN znE;
        G10.g(sn, "$this$customFocusSearch");
        G10.g(enumC7560q90, "layoutDirection");
        HN.a aVar = HN.b;
        if (HN.l(i, aVar.d())) {
            return sn.j().i();
        }
        if (HN.l(i, aVar.f())) {
            return sn.j().c();
        }
        if (HN.l(i, aVar.h())) {
            return sn.j().h();
        }
        if (HN.l(i, aVar.a())) {
            return sn.j().m();
        }
        if (HN.l(i, aVar.c())) {
            int i2 = a.a[enumC7560q90.ordinal()];
            if (i2 == 1) {
                znE = sn.j().e();
            } else {
                if (i2 != 2) {
                    throw new C6902no0();
                }
                znE = sn.j().k();
            }
            zn = G10.c(znE, ZN.b.a()) ? null : znE;
            return zn == null ? sn.j().a() : zn;
        }
        if (!HN.l(i, aVar.g())) {
            if (HN.l(i, aVar.b())) {
                return ZN.b.a();
            }
            if (HN.l(i, aVar.e())) {
                return ZN.b.a();
            }
            throw new IllegalStateException("invalid FocusDirection");
        }
        int i3 = a.a[enumC7560q90.ordinal()];
        if (i3 == 1) {
            znK = sn.j().k();
        } else {
            if (i3 != 2) {
                throw new C6902no0();
            }
            znK = sn.j().e();
        }
        zn = G10.c(znK, ZN.b.a()) ? null : znK;
        return zn == null ? sn.j().d() : zn;
    }
}
