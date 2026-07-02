package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public abstract class RN {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC4252eO.values().length];
            iArr[EnumC4252eO.Active.ordinal()] = 1;
            iArr[EnumC4252eO.Captured.ordinal()] = 2;
            iArr[EnumC4252eO.ActiveParent.ordinal()] = 3;
            iArr[EnumC4252eO.DeactivatedParent.ordinal()] = 4;
            iArr[EnumC4252eO.Deactivated.ordinal()] = 5;
            iArr[EnumC4252eO.Inactive.ordinal()] = 6;
            a = iArr;
        }
    }

    public static final SN c(SN sn) {
        SN snC;
        switch (a.a[sn.l().ordinal()]) {
            case 1:
            case 2:
                return sn;
            case 3:
            case 4:
                SN snM = sn.m();
                if (snM == null || (snC = c(snM)) == null) {
                    throw new IllegalStateException("no child");
                }
                return snC;
            case 5:
            case 6:
                return null;
            default:
                throw new C6902no0();
        }
    }

    public static final void d(SN sn) {
        XN.d(sn);
        C8565tm0 c8565tm0H = sn.h();
        int iR = c8565tm0H.r();
        if (iR > 0) {
            Object[] objArrQ = c8565tm0H.q();
            int i = 0;
            do {
                d((SN) objArrQ[i]);
                i++;
            } while (i < iR);
        }
    }
}
