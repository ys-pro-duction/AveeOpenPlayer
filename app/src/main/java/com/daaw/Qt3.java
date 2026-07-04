package com.daaw;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.google.android.gms.internal.ads.zzzi;

/* JADX INFO: loaded from: classes3.dex */
public final class Qt3 extends HandlerThread implements Handler.Callback {
    public RunnableC2574Vp2 B;
    public Handler C;
    public Error D;
    public RuntimeException E;
    public zzzi F;

    public Qt3() {
        super("ExoPlayer:PlaceholderSurface");
    }

    public final zzzi a(int i) {
        boolean z;
        start();
        this.C = new Handler(getLooper(), this);
        this.B = new RunnableC2574Vp2(this.C, null);
        synchronized (this) {
            z = false;
            this.C.obtainMessage(1, i, 0).sendToTarget();
            while (this.F == null && this.E == null && this.D == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.E;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.D;
        if (error != null) {
            throw error;
        }
        zzzi zzziVar = this.F;
        zzziVar.getClass();
        return zzziVar;
    }

    public final void b() {
        Handler handler = this.C;
        handler.getClass();
        handler.sendEmptyMessage(2);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i;
        RunnableC2574Vp2 runnableC2574Vp2;
        RunnableC2574Vp2 runnableC2574Vp22;
        int i2 = message.what;
        try {
            if (i2 != 1) {
                if (i2 != 2) {
                    return true;
                }
                try {
                    runnableC2574Vp22 = this.B;
                } finally {
                    try {
                    } finally {
                    }
                }
                if (runnableC2574Vp22 == null) {
                    throw null;
                }
                runnableC2574Vp22.c();
                return true;
            }
            try {
                try {
                    i = message.arg1;
                    runnableC2574Vp2 = this.B;
                } catch (Error e) {
                    AbstractC3305ay2.d("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                    this.D = e;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e2) {
                    AbstractC3305ay2.d("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                    this.E = e2;
                    synchronized (this) {
                        notify();
                    }
                }
            } catch (C4677fr2 e3) {
                AbstractC3305ay2.d("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                this.E = new IllegalStateException(e3);
                synchronized (this) {
                    notify();
                }
            }
            if (runnableC2574Vp2 == null) {
                throw null;
            }
            runnableC2574Vp2.b(i);
            this.F = new zzzi(this, this.B.a(), i != 0, null);
            synchronized (this) {
                notify();
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }
}
