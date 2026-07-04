package com.daaw;

import android.os.Process;

/* JADX INFO: renamed from: com.daaw.Gm1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0978Gm1 extends Thread {
    public C0978Gm1(ThreadGroup threadGroup, String str) {
        super(threadGroup, "GmsDynamite");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(19);
        synchronized (this) {
            while (true) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }
}
