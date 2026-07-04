package com.daaw;

import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class PE {
    public static final PE C = new PE("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
    public static final PE D = new PE("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
    public static final PE E = new PE("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
    public static final PE F = new PE("SECONDS", 3, TimeUnit.SECONDS);
    public static final PE G = new PE("MINUTES", 4, TimeUnit.MINUTES);
    public static final PE H = new PE("HOURS", 5, TimeUnit.HOURS);
    public static final PE I = new PE("DAYS", 6, TimeUnit.DAYS);
    public static final /* synthetic */ PE[] J;
    public static final /* synthetic */ YG K;
    public final TimeUnit B;

    static {
        PE[] peArrA = a();
        J = peArrA;
        K = AbstractC3110aH.a(peArrA);
    }

    public PE(String str, int i, TimeUnit timeUnit) {
        this.B = timeUnit;
    }

    public static final /* synthetic */ PE[] a() {
        return new PE[]{C, D, E, F, G, H, I};
    }

    public static PE valueOf(String str) {
        return (PE) Enum.valueOf(PE.class, str);
    }

    public static PE[] values() {
        return (PE[]) J.clone();
    }

    public final TimeUnit c() {
        return this.B;
    }
}
