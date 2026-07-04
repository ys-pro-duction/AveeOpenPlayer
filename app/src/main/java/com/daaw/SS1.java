package com.daaw;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class SS1 implements ThreadFactory {
    public final AtomicInteger B = new AtomicInteger(1);
    public final /* synthetic */ String C;

    public SS1(String str) {
        this.C = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AdWorker(" + this.C + ") #" + this.B.getAndIncrement());
    }
}
