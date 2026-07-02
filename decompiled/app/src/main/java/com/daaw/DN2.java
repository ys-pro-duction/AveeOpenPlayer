package com.daaw;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes3.dex */
public final class DN2 implements ServiceConnection {
    public final /* synthetic */ EN2 a;

    public /* synthetic */ DN2(EN2 en2, CN2 cn2) {
        this.a = en2;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.b.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.a.c().post(new AN2(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.b.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.a.c().post(new BN2(this));
    }
}
