package com.daaw;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class SS2 extends AbstractC5677jS2 implements ScheduledFuture, InterfaceFutureC8236sc0 {
    public final ScheduledFuture C;

    public SS2(InterfaceFutureC8236sc0 interfaceFutureC8236sc0, ScheduledFuture scheduledFuture) {
        super(interfaceFutureC8236sc0);
        this.C = scheduledFuture;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zCancel = h().cancel(z);
        if (zCancel) {
            this.C.cancel(z);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.C.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.C.getDelay(timeUnit);
    }
}
