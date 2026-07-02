package com.daaw;

import com.google.android.gms.signin.internal.zak;

/* JADX INFO: renamed from: com.daaw.vl1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9126vl1 implements Runnable {
    public final /* synthetic */ zak B;
    public final /* synthetic */ BinderC9684xl1 C;

    public RunnableC9126vl1(BinderC9684xl1 binderC9684xl1, zak zakVar) {
        this.C = binderC9684xl1;
        this.B = zakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BinderC9684xl1.b3(this.C, this.B);
    }
}
