package com.daaw;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: renamed from: com.daaw.Rb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractServiceC2098Rb0 extends Service implements InterfaceC1764Ob0 {
    public final androidx.lifecycle.w B = new androidx.lifecycle.w(this);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        G10.g(intent, "intent");
        this.B.b();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.B.c();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.B.d();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i) {
        this.B.e();
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }

    @Override // com.daaw.InterfaceC1764Ob0
    public androidx.lifecycle.g w() {
        return this.B.a();
    }
}
