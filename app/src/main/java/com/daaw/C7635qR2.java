package com.daaw;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.qR2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7635qR2 {
    public static final C7635qR2 d = new C7635qR2();
    public final Runnable a;
    public final Executor b;
    public C7635qR2 c;

    public C7635qR2() {
        this.a = null;
        this.b = null;
    }

    public C7635qR2(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
