package com.daaw;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.daaw.bT2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3440bT2 extends AbstractC4560fS2 {
    public InterfaceFutureC8236sc0 I;
    public ScheduledFuture J;

    public C3440bT2(InterfaceFutureC8236sc0 interfaceFutureC8236sc0) {
        interfaceFutureC8236sc0.getClass();
        this.I = interfaceFutureC8236sc0;
    }

    public static InterfaceFutureC8236sc0 E(InterfaceFutureC8236sc0 interfaceFutureC8236sc0, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        C3440bT2 c3440bT2 = new C3440bT2(interfaceFutureC8236sc0);
        YS2 ys2 = new YS2(c3440bT2);
        c3440bT2.J = scheduledExecutorService.schedule(ys2, j, timeUnit);
        interfaceFutureC8236sc0.g(ys2, EnumC3993dS2.INSTANCE);
        return c3440bT2;
    }

    @Override // com.daaw.AbstractC9873yR2
    public final String c() {
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0 = this.I;
        ScheduledFuture scheduledFuture = this.J;
        if (interfaceFutureC8236sc0 == null) {
            return null;
        }
        String str = "inputFuture=[" + interfaceFutureC8236sc0.toString() + "]";
        if (scheduledFuture == null) {
            return str;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return str;
        }
        return str + ", remaining delay=[" + delay + " ms]";
    }

    @Override // com.daaw.AbstractC9873yR2
    public final void d() {
        t(this.I);
        ScheduledFuture scheduledFuture = this.J;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.I = null;
        this.J = null;
    }
}
