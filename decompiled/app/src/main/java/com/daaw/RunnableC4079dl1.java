package com.daaw;

/* JADX INFO: renamed from: com.daaw.dl1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4079dl1 implements Runnable {
    public final /* synthetic */ C4357el1 B;

    public RunnableC4079dl1(C4357el1 c4357el1) {
        this.B = c4357el1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4646fl1 c4646fl1 = this.B.a;
        c4646fl1.C.disconnect(c4646fl1.C.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
