package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public abstract class RH {
    public static final YZ0 a = new YZ0("REMOVED_TASK");
    public static final YZ0 b = new YZ0("CLOSED_EMPTY");

    public static final long c(long j) {
        if (j <= 0) {
            return 0L;
        }
        if (j >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return j * 1000000;
    }
}
