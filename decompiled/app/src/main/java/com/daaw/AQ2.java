package com.daaw;

import java.lang.Thread;

/* JADX INFO: loaded from: classes3.dex */
public final class AQ2 implements Thread.UncaughtExceptionHandler {
    public final String a;
    public final /* synthetic */ KS2 b;

    public AQ2(KS2 ks2, String str) {
        this.b = ks2;
        AbstractC7506py0.l(str);
        this.a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.b.a.w().n().b(this.a, th);
    }
}
