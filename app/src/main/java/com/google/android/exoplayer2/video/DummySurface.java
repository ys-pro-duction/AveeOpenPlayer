package com.google.android.exoplayer2.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import com.daaw.AbstractC6280lb1;
import com.daaw.AbstractC7115ob;
import com.daaw.RunnableC3102aF;

/* JADX INFO: loaded from: classes.dex */
public final class DummySurface extends Surface {
    public static int E;
    public static boolean F;
    public final boolean B;
    public final b C;
    public boolean D;

    public static class b extends HandlerThread implements Handler.Callback {
        public RunnableC3102aF B;
        public Handler C;
        public Error D;
        public RuntimeException E;
        public DummySurface F;

        public b() {
            super("dummySurface");
        }

        public DummySurface a(int i) {
            boolean z;
            start();
            this.C = new Handler(getLooper(), this);
            this.B = new RunnableC3102aF(this.C);
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
            if (error == null) {
                return (DummySurface) AbstractC7115ob.e(this.F);
            }
            throw error;
        }

        public final void b(int i) {
            AbstractC7115ob.e(this.B);
            this.B.g(i);
            this.F = new DummySurface(this, this.B.f(), i != 0);
        }

        public void c() {
            AbstractC7115ob.e(this.C);
            this.C.sendEmptyMessage(2);
        }

        public final void d() {
            AbstractC7115ob.e(this.B);
            this.B.h();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            try {
                if (i != 1) {
                    if (i != 2) {
                        return true;
                    }
                    try {
                        d();
                    } catch (Throwable unused) {
                    }
                    quit();
                    return true;
                }
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e) {
                    this.D = e;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e2) {
                    this.E = e2;
                    synchronized (this) {
                        notify();
                    }
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

    public static void a() {
        if (AbstractC6280lb1.a < 17) {
            throw new UnsupportedOperationException("Unsupported prior to API level 17");
        }
    }

    public static int b(Context context) {
        String strEglQueryString;
        int i = AbstractC6280lb1.a;
        if (i < 26 && ("samsung".equals(AbstractC6280lb1.c) || "XT1650".equals(AbstractC6280lb1.d))) {
            return 0;
        }
        if ((i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content")) {
            return strEglQueryString.contains("EGL_KHR_surfaceless_context") ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean c(Context context) {
        try {
            if (!F) {
                E = AbstractC6280lb1.a < 24 ? 0 : b(context);
                F = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return E != 0;
    }

    public static DummySurface d(Context context, boolean z) {
        a();
        AbstractC7115ob.f(!z || c(context));
        return new b().a(z ? E : 0);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.C) {
            try {
                if (!this.D) {
                    this.C.c();
                    this.D = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public DummySurface(b bVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.C = bVar;
        this.B = z;
    }
}
