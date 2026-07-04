package com.daaw;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public class VI0 {
    public boolean a;
    public final Handler b = new Handler(Looper.getMainLooper(), new b());

    public static class b implements Handler.Callback {
        public b() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((KI0) message.obj).c();
            return true;
        }
    }

    public void a(KI0 ki0) {
        AbstractC6559mb1.b();
        if (this.a) {
            this.b.obtainMessage(1, ki0).sendToTarget();
            return;
        }
        this.a = true;
        ki0.c();
        this.a = false;
    }
}
