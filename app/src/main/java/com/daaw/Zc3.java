package com.daaw;

import android.content.ComponentName;

/* JADX INFO: loaded from: classes3.dex */
public final class Zc3 implements Runnable {
    public final /* synthetic */ ComponentName B;
    public final /* synthetic */ ServiceConnectionC6292ld3 C;

    public Zc3(ServiceConnectionC6292ld3 serviceConnectionC6292ld3, ComponentName componentName) {
        this.C = serviceConnectionC6292ld3;
        this.B = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7129od3.M(this.C.c, this.B);
    }
}
