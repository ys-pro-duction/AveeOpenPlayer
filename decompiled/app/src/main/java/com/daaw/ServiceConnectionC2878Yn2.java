package com.daaw;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: com.daaw.Yn2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC2878Yn2 implements ServiceConnection {
    public final int a;
    public final /* synthetic */ AbstractC8245se b;

    public ServiceConnectionC2878Yn2(AbstractC8245se abstractC8245se, int i) {
        this.b = abstractC8245se;
        this.a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC8245se abstractC8245se = this.b;
        if (iBinder == null) {
            AbstractC8245se.D(abstractC8245se, 16);
            return;
        }
        synchronized (abstractC8245se.n) {
            try {
                AbstractC8245se abstractC8245se2 = this.b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC8245se2.o = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC6261lX)) ? new C0986Go1(iBinder) : (InterfaceC6261lX) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.b.E(0, null, this.a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.b.n) {
            this.b.o = null;
        }
        AbstractC8245se abstractC8245se = this.b;
        int i = this.a;
        Handler handler = abstractC8245se.l;
        handler.sendMessage(handler.obtainMessage(6, i, 1));
    }
}
