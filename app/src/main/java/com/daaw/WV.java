package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public abstract class WV {
    public static final long a(float f, boolean z) {
        return CC.b(((z ? 1L : 0L) & 4294967295L) | (((long) Float.floatToIntBits(f)) << 32));
    }
}
