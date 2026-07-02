package com.daaw;

import androidx.work.WorkerParameters;

/* JADX INFO: renamed from: com.daaw.eW0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC4285eW0 implements Runnable {
    public C0537Ci1 B;
    public String C;
    public WorkerParameters.a D;

    public RunnableC4285eW0(C0537Ci1 c0537Ci1, String str, WorkerParameters.a aVar) {
        this.B = c0537Ci1;
        this.C = str;
        this.D = aVar;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        this.B.m().k(this.C, this.D);
    }
}
