package com.daaw;

/* JADX INFO: renamed from: com.daaw.yK2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC9845yK2 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        if (EK2.k != null) {
            EK2.k.post(EK2.l);
            EK2.k.postDelayed(EK2.m, 200L);
        }
    }
}
