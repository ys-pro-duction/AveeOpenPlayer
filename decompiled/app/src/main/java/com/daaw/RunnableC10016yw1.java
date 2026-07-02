package com.daaw;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: com.daaw.yw1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC10016yw1 implements Runnable {
    public /* synthetic */ RunnableC10016yw1(AbstractC9737xw1 abstractC9737xw1) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            AbstractC10295zw1.b = MessageDigest.getInstance("MD5");
            countDownLatch = AbstractC10295zw1.e;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = AbstractC10295zw1.e;
        } catch (Throwable th) {
            AbstractC10295zw1.e.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
