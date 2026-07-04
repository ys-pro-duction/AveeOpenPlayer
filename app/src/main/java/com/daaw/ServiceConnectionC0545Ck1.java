package com.daaw;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: renamed from: com.daaw.Ck1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ServiceConnectionC0545Ck1 implements ServiceConnection {
    public final /* synthetic */ C0762Ek1 a;

    public /* synthetic */ ServiceConnectionC0545Ck1(C0762Ek1 c0762Ek1, AbstractC10237zk1 abstractC10237zk1) {
        this.a = c0762Ek1;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.b.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.a.c().post(new C9121vk1(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.b.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.a.c().post(new C9679xk1(this));
    }
}
