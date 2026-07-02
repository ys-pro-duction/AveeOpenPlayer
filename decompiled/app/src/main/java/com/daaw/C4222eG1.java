package com.daaw;

/* JADX INFO: renamed from: com.daaw.eG1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4222eG1 {
    public static final C4222eG1 f = new C4222eG1(new UE1());
    public static final String g = Integer.toString(0, 36);
    public static final String h = Integer.toString(1, 36);
    public static final String i = Integer.toString(2, 36);
    public static final String j = Integer.toString(3, 36);
    public static final String k = Integer.toString(4, 36);
    public static final InterfaceC9666xh3 l = new InterfaceC9666xh3() { // from class: com.daaw.pE1
    };
    public final long a;
    public final long b;
    public final long c;
    public final float d;
    public final float e;

    public C4222eG1(UE1 ue1) {
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
        this.c = -9223372036854775807L;
        this.d = -3.4028235E38f;
        this.e = -3.4028235E38f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4222eG1)) {
            return false;
        }
        long j2 = ((C4222eG1) obj).a;
        return true;
    }

    public final int hashCode() {
        int i2 = (int) (-9223372034707292159L);
        return (((((((i2 * 31) + i2) * 31) + i2) * 31) + Float.floatToIntBits(-3.4028235E38f)) * 31) + Float.floatToIntBits(-3.4028235E38f);
    }
}
