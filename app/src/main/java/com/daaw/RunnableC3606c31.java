package com.daaw;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.daaw.c31, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC3606c31 implements Runnable {
    public C1046Hd1 B;
    public volatile a C;
    public Object D;
    public boolean E;
    public boolean F;

    /* JADX INFO: renamed from: com.daaw.c31$a */
    public static class a extends Handler {
        public WeakReference a;

        public a(RunnableC3606c31 runnableC3606c31) {
            this.a = new WeakReference(runnableC3606c31);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            RunnableC3606c31 runnableC3606c31 = (RunnableC3606c31) this.a.get();
            if (runnableC3606c31 == null) {
                return;
            }
            if (i == 1) {
                runnableC3606c31.e();
                Looper.myLooper().quit();
            } else {
                if (i == 2) {
                    runnableC3606c31.d();
                    return;
                }
                throw new RuntimeException("Unhandled msg what=" + i);
            }
        }
    }

    public RunnableC3606c31(C1046Hd1 c1046Hd1) {
        Object obj = new Object();
        this.D = obj;
        this.B = c1046Hd1;
        synchronized (obj) {
            try {
                if (this.F) {
                    return;
                }
                this.F = true;
                new Thread(this, "TextureMovieEncoder").start();
                while (!this.E) {
                    try {
                        this.D.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c() {
        synchronized (this.D) {
            try {
                if (this.E) {
                    this.C.sendMessage(this.C.obtainMessage(2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        try {
            this.B.a(false);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public final void e() {
        try {
            this.B.a(true);
            this.B.d();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public boolean f() {
        boolean z;
        synchronized (this.D) {
            z = this.F;
        }
        return z;
    }

    public void g() {
        this.C.sendMessage(this.C.obtainMessage(1));
    }

    @Override // java.lang.Runnable
    public void run() {
        Looper.prepare();
        synchronized (this.D) {
            this.C = new a(this);
            this.E = true;
            this.D.notify();
        }
        Looper.loop();
        synchronized (this.D) {
            this.F = false;
            this.E = false;
            this.C = null;
        }
    }
}
