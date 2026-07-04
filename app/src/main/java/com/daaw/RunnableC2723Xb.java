package com.daaw;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.daaw.C2619Wb;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.daaw.Xb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC2723Xb implements Runnable {
    public C2619Wb B;
    public volatile a C;
    public boolean E;
    public boolean F;
    public Object D = new Object();
    public AtomicInteger G = new AtomicInteger();

    /* JADX INFO: renamed from: com.daaw.Xb$a */
    public static class a extends Handler {
        public WeakReference a;

        public a(RunnableC2723Xb runnableC2723Xb) {
            this.a = new WeakReference(runnableC2723Xb);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            Object obj = message.obj;
            RunnableC2723Xb runnableC2723Xb = (RunnableC2723Xb) this.a.get();
            if (runnableC2723Xb == null) {
                return;
            }
            if (i == 1) {
                runnableC2723Xb.f();
                Looper.myLooper().quit();
            } else if (i == 2) {
                if (runnableC2723Xb.e((C2619Wb.a) obj, false)) {
                    return;
                }
                runnableC2723Xb.G.incrementAndGet();
            } else {
                throw new RuntimeException("Unhandled msg what=" + i);
            }
        }
    }

    public RunnableC2723Xb(C2619Wb c2619Wb) {
        this.B = c2619Wb;
        synchronized (this.D) {
            try {
                if (this.F) {
                    return;
                }
                this.F = true;
                new Thread(this, "AudioTextureMovieEncoder2B").start();
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

    public void d(C2619Wb.a aVar) {
        synchronized (this.D) {
            try {
                if (this.E) {
                    this.C.sendMessage(this.C.obtainMessage(2, aVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean e(C2619Wb.a aVar, boolean z) {
        int i = 0;
        while (i < 2) {
            try {
                boolean zB = this.B.b(aVar, z, i == 0);
                this.B.a(false, false);
                if (zB) {
                    return true;
                }
                AbstractC0441Bk1.c("############### [" + i + "] encode tried failed ");
                i++;
            } catch (Exception e) {
                AbstractC0441Bk1.b(e, "");
            }
        }
        AbstractC0441Bk1.c("encode failed, INFO_TRY_AGAIN_LATER?");
        AbstractC0441Bk1.c("encode failed, presentationTimeUs: " + aVar.c + " length: " + aVar.b);
        return false;
    }

    public final void f() {
        try {
            e(new C2619Wb.a(), true);
            this.B.d();
        } catch (IllegalStateException e) {
            AbstractC0441Bk1.b(e, "");
        }
    }

    public boolean g() {
        boolean z;
        synchronized (this.D) {
            z = this.F;
        }
        return z;
    }

    public void h(C7378pX0 c7378pX0) {
        int i = this.G.get();
        if (i > 0) {
            c7378pX0.c("audioEncodeFrameFailed (" + i + ")");
        }
    }

    public void i() {
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
