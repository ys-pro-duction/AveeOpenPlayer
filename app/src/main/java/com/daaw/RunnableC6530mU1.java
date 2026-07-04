package com.daaw;

/* JADX INFO: renamed from: com.daaw.mU1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC6530mU1 implements Runnable {
    public final /* synthetic */ boolean B;
    public final /* synthetic */ C6809nU1 C;

    public RunnableC6530mU1(C6809nU1 c6809nU1, boolean z) {
        this.C = c6809nU1;
        this.B = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.C.m("windowVisibilityChanged", "isVisible", String.valueOf(this.B));
    }
}
