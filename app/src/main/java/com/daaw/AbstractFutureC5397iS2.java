package com.daaw;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.daaw.iS2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractFutureC5397iS2 extends FP2 implements Future {
    @Override // java.util.concurrent.Future
    public final Object get() {
        return h().get();
    }

    public abstract Future h();

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return h().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return h().isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return h().get(j, timeUnit);
    }
}
