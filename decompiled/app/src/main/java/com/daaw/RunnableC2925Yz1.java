package com.daaw;

import android.view.View;

/* JADX INFO: renamed from: com.daaw.Yz1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2925Yz1 implements Runnable {
    public final /* synthetic */ View B;
    public final /* synthetic */ C3641cA1 C;

    public RunnableC2925Yz1(C3641cA1 c3641cA1, View view) {
        this.C = c3641cA1;
        this.B = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.C.c(this.B);
    }
}
