package com.daaw;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: com.daaw.Im0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractServiceC1185Im0 extends Service {
    public volatile Looper B;
    public volatile a C;
    public String D;
    public boolean E;

    /* JADX INFO: renamed from: com.daaw.Im0$a */
    public final class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AbstractServiceC1185Im0.this.a((Intent) message.obj);
        }
    }

    public AbstractServiceC1185Im0(String str) {
        this.D = str;
    }

    public abstract void a(Intent intent);

    public void b(boolean z) {
        this.E = z;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        HandlerThread handlerThread = new HandlerThread("IntentService[" + this.D + "]");
        handlerThread.start();
        this.B = handlerThread.getLooper();
        this.C = new a(this.B);
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.B.quit();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i) {
        Message messageObtainMessage = this.C.obtainMessage();
        messageObtainMessage.arg1 = i;
        messageObtainMessage.obj = intent;
        this.C.sendMessage(messageObtainMessage);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        onStart(intent, i2);
        return this.E ? 3 : 2;
    }
}
