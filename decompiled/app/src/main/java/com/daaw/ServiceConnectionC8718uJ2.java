package com.daaw;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: renamed from: com.daaw.uJ2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ServiceConnectionC8718uJ2 implements ServiceConnection {
    public final String a;
    public final /* synthetic */ XJ2 b;

    public ServiceConnectionC8718uJ2(XJ2 xj2, String str) {
        this.b = xj2;
        this.a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.b.a.w().t().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            InterfaceC4818gN1 interfaceC4818gN1G = AM1.G(iBinder);
            if (interfaceC4818gN1G == null) {
                this.b.a.w().t().a("Install Referrer Service implementation was not found");
            } else {
                this.b.a.w().s().a("Install Referrer Service connected");
                this.b.a.x().z(new NI2(this, interfaceC4818gN1G, this));
            }
        } catch (RuntimeException e) {
            this.b.a.w().t().b("Exception occurred while calling Install Referrer API", e);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.b.a.w().s().a("Install Referrer Service disconnected");
    }
}
