package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public abstract class FP0 {
    public static final int a = K01.e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);
    public static final YZ0 b = new YZ0("PERMIT");
    public static final YZ0 c = new YZ0("TAKEN");
    public static final YZ0 d = new YZ0("BROKEN");
    public static final YZ0 e = new YZ0("CANCELLED");
    public static final int f = K01.e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);

    public static final GP0 h(long j, GP0 gp0) {
        return new GP0(j, gp0, 0);
    }
}
