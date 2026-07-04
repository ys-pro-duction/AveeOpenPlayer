package com.daaw;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class B11 {
    public static final String a = I01.e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");
    public static final long b = K01.f("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, null);
    public static final int c = K01.e("kotlinx.coroutines.scheduler.core.pool.size", AbstractC8417tE0.d(I01.a(), 2), 1, 0, 8, null);
    public static final int d = K01.e("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);
    public static final long e = TimeUnit.SECONDS.toNanos(K01.f("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, null));
    public static AbstractC9576xN0 f = C4366en0.a;
    public static final InterfaceC7799r11 g = new C8078s11(0);
    public static final InterfaceC7799r11 h = new C8078s11(1);
}
