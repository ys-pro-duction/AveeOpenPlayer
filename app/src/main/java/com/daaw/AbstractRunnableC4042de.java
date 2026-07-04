package com.daaw;

import android.os.Process;

/* JADX INFO: renamed from: com.daaw.de, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractRunnableC4042de implements Runnable {
    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        a();
    }
}
