package com.daaw;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class VZ0 {
    public static final VZ0 a = new VZ0();
    public static final BV0 b = new BV0(0.0f, 0.0f, null, 7, null);
    public static final float c = C6460mD.l(125);

    public static /* synthetic */ BI0 c(VZ0 vz0, Set set, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 10.0f;
        }
        if ((i & 4) != 0) {
            f2 = 10.0f;
        }
        return vz0.b(set, f, f2);
    }

    public final float a() {
        return c;
    }

    public final BI0 b(Set set, float f, float f2) {
        G10.g(set, "anchors");
        if (set.size() <= 1) {
            return null;
        }
        Set set2 = set;
        Float fT0 = AbstractC2455Um.t0(set2);
        G10.d(fT0);
        float fFloatValue = fT0.floatValue();
        Float fV0 = AbstractC2455Um.v0(set2);
        G10.d(fV0);
        return new BI0(fFloatValue - fV0.floatValue(), f, f2);
    }
}
