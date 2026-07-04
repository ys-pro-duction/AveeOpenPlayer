package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public abstract class WS2 {
    public static void a(Throwable th) {
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }
}
