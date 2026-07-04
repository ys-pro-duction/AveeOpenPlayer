package com.daaw;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: renamed from: com.daaw.Id1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1150Id1 {
    public final WindowManager a;
    public final b b;
    public final a c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public boolean i;
    public long j;
    public long k;
    public long l;

    /* JADX INFO: renamed from: com.daaw.Id1$b */
    public static final class b implements Choreographer.FrameCallback, Handler.Callback {
        public static final b G = new b();
        public volatile long B = -9223372036854775807L;
        public final Handler C;
        public final HandlerThread D;
        public Choreographer E;
        public int F;

        public b() {
            HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
            this.D = handlerThread;
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper(), this);
            this.C = handler;
            handler.sendEmptyMessage(0);
        }

        public static b d() {
            return G;
        }

        public void a() {
            this.C.sendEmptyMessage(1);
        }

        public final void b() {
            int i = this.F + 1;
            this.F = i;
            if (i == 1) {
                this.E.postFrameCallback(this);
            }
        }

        public final void c() {
            this.E = Choreographer.getInstance();
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            this.B = j;
            this.E.postFrameCallbackDelayed(this, 500L);
        }

        public void e() {
            this.C.sendEmptyMessage(2);
        }

        public final void f() {
            int i = this.F - 1;
            this.F = i;
            if (i == 0) {
                this.E.removeFrameCallback(this);
                this.B = -9223372036854775807L;
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                c();
                return true;
            }
            if (i == 1) {
                b();
                return true;
            }
            if (i != 2) {
                return false;
            }
            f();
            return true;
        }
    }

    public C1150Id1(Context context) {
        if (context != null) {
            context = context.getApplicationContext();
            this.a = (WindowManager) context.getSystemService("window");
        } else {
            this.a = null;
        }
        if (this.a != null) {
            this.c = AbstractC6280lb1.a >= 17 ? g(context) : null;
            this.b = b.d();
        } else {
            this.c = null;
            this.b = null;
        }
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
    }

    public static long c(long j, long j2, long j3) {
        long j4;
        long j5 = j2 + (((j - j2) / j3) * j3);
        if (j <= j5) {
            j4 = j5 - j3;
        } else {
            long j6 = j3 + j5;
            j4 = j5;
            j5 = j6;
        }
        return j5 - j < j - j4 ? j5 : j4;
    }

    public long b(long j, long j2) {
        long j3;
        long j4;
        long j5 = 1000 * j;
        if (this.i) {
            if (j != this.f) {
                this.l++;
                this.g = this.h;
            }
            long j6 = this.l;
            if (j6 >= 6) {
                j4 = this.g + ((j5 - this.k) / j6);
                if (f(j4, j2)) {
                    this.i = false;
                } else {
                    j3 = (this.j + j4) - this.k;
                }
            } else if (f(j5, j2)) {
                this.i = false;
            }
            j3 = j2;
            j4 = j5;
        } else {
            j3 = j2;
            j4 = j5;
        }
        if (!this.i) {
            this.k = j5;
            this.j = j2;
            this.l = 0L;
            this.i = true;
        }
        this.f = j;
        this.h = j4;
        b bVar = this.b;
        if (bVar != null && this.d != -9223372036854775807L) {
            long j7 = bVar.B;
            if (j7 != -9223372036854775807L) {
                return c(j3, j7, this.d) - this.e;
            }
        }
        return j3;
    }

    public void d() {
        if (this.a != null) {
            a aVar = this.c;
            if (aVar != null) {
                aVar.b();
            }
            this.b.e();
        }
    }

    public void e() {
        this.i = false;
        if (this.a != null) {
            this.b.a();
            a aVar = this.c;
            if (aVar != null) {
                aVar.a();
            }
            h();
        }
    }

    public final boolean f(long j, long j2) {
        return Math.abs((j2 - this.j) - (j - this.k)) > 20000000;
    }

    public final a g(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager == null) {
            return null;
        }
        return new a(displayManager);
    }

    public final void h() {
        Display defaultDisplay = this.a.getDefaultDisplay();
        if (defaultDisplay != null) {
            long refreshRate = (long) (1.0E9d / ((double) defaultDisplay.getRefreshRate()));
            this.d = refreshRate;
            this.e = (refreshRate * 80) / 100;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Id1$a */
    public final class a implements DisplayManager.DisplayListener {
        public final DisplayManager a;

        public a(DisplayManager displayManager) {
            this.a = displayManager;
        }

        public void a() {
            this.a.registerDisplayListener(this, null);
        }

        public void b() {
            this.a.unregisterDisplayListener(this);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            if (i == 0) {
                C1150Id1.this.h();
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
        }
    }
}
