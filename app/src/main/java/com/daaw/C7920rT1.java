package com.daaw;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: com.daaw.rT1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7920rT1 extends ScheduledThreadPoolExecutor implements AutoCloseable {
    public C7920rT1(int i, ThreadFactory threadFactory) {
        super(3, threadFactory);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        JO.a(this);
    }
}
