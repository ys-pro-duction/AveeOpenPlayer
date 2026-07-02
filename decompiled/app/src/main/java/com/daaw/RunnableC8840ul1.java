package com.daaw;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: renamed from: com.daaw.ul1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC8840ul1 implements Runnable {
    public final /* synthetic */ BinderC9684xl1 B;

    public RunnableC8840ul1(BinderC9684xl1 binderC9684xl1) {
        this.B = binderC9684xl1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.B.H.b(new ConnectionResult(4));
    }
}
