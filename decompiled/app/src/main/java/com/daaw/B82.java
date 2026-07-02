package com.daaw;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class B82 {
    public static final B82 e = new B82(null, new CS1[0], 0, -9223372036854775807L, 0);
    public static final CS1 f = new CS1(0).b(0);
    public static final String g = Integer.toString(1, 36);
    public static final String h = Integer.toString(2, 36);
    public static final String i = Integer.toString(3, 36);
    public static final String j = Integer.toString(4, 36);
    public static final InterfaceC9666xh3 k = new InterfaceC9666xh3() { // from class: com.daaw.mm1
    };
    public final CS1[] d;
    public final long b = 0;
    public final int a = 0;
    public final int c = 0;

    public B82(Object obj, CS1[] cs1Arr, long j2, long j3, int i2) {
        this.d = cs1Arr;
    }

    public final CS1 a(int i2) {
        return i2 < 0 ? f : this.d[i2];
    }

    public final boolean b(int i2) {
        a(-1);
        String str = CS1.h;
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && B82.class == obj.getClass()) {
            B82 b82 = (B82) obj;
            if (AbstractC9004vJ2.e(null, null) && Arrays.equals(this.d, b82.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) (-9223372036854775807L)) * 961) + Arrays.hashCode(this.d);
    }

    public final String toString() {
        return "AdPlaybackState(adsId=" + ((Object) null) + ", adResumePositionUs=0, adGroups=[])";
    }
}
