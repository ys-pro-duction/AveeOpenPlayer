package com.daaw;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: com.daaw.yy1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class CallableC10024yy1 implements Callable {
    public final C2813Xx1 a;
    public final C9733xv1 b;

    public CallableC10024yy1(C2813Xx1 c2813Xx1, C9733xv1 c9733xv1) {
        this.a = c2813Xx1;
        this.b = c9733xv1;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws ExecutionException, InterruptedException {
        if (this.a.l() != null) {
            this.a.l().get();
        }
        C3013Zv1 c3013Zv1C = this.a.c();
        if (c3013Zv1C == null) {
            return null;
        }
        try {
            synchronized (this.b) {
                C9733xv1 c9733xv1 = this.b;
                byte[] bArrH = c3013Zv1C.h();
                c9733xv1.i(bArrH, 0, bArrH.length, U33.a());
            }
            return null;
        } catch (C8939v43 | NullPointerException unused) {
            return null;
        }
    }
}
