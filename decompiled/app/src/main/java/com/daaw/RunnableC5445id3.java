package com.daaw;

/* JADX INFO: renamed from: com.daaw.id3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC5445id3 implements Runnable {
    public final /* synthetic */ ServiceConnectionC6292ld3 B;

    public RunnableC5445id3(ServiceConnectionC6292ld3 serviceConnectionC6292ld3) {
        this.B = serviceConnectionC6292ld3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.B.c.d = null;
        this.B.c.D();
    }
}
