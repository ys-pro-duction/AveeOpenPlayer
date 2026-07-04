package com.daaw;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.daaw.Fo1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0882Fo1 implements InterfaceC7187op1 {
    public final CountDownLatch a = new CountDownLatch(1);

    public /* synthetic */ C0882Fo1(AbstractC2981Zn1 abstractC2981Zn1) {
    }

    public final void a() throws InterruptedException {
        this.a.await();
    }

    @Override // com.daaw.InterfaceC4381eq0
    public final void b() {
        this.a.countDown();
    }

    @Override // com.daaw.InterfaceC7470pq0
    public final void c(Exception exc) {
        this.a.countDown();
    }

    public final boolean d(long j, TimeUnit timeUnit) {
        return this.a.await(j, timeUnit);
    }

    @Override // com.daaw.InterfaceC0464Bq0
    public final void onSuccess(Object obj) {
        this.a.countDown();
    }
}
