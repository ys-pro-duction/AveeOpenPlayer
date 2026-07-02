package com.daaw;

import android.util.SparseArray;

/* JADX INFO: renamed from: com.daaw.dC0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC3927dC0 {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);

    public static final SparseArray I;
    public final int B;

    static {
        EnumC3927dC0 enumC3927dC0 = DEFAULT;
        EnumC3927dC0 enumC3927dC02 = UNMETERED_ONLY;
        EnumC3927dC0 enumC3927dC03 = UNMETERED_OR_DAILY;
        EnumC3927dC0 enumC3927dC04 = FAST_IF_RADIO_AWAKE;
        EnumC3927dC0 enumC3927dC05 = NEVER;
        EnumC3927dC0 enumC3927dC06 = UNRECOGNIZED;
        SparseArray sparseArray = new SparseArray();
        I = sparseArray;
        sparseArray.put(0, enumC3927dC0);
        sparseArray.put(1, enumC3927dC02);
        sparseArray.put(2, enumC3927dC03);
        sparseArray.put(3, enumC3927dC04);
        sparseArray.put(4, enumC3927dC05);
        sparseArray.put(-1, enumC3927dC06);
    }

    EnumC3927dC0(int i) {
        this.B = i;
    }
}
