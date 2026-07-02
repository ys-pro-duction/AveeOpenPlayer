package com.daaw;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
public class HT0 {
    public static C0425Bg1 f = new C0425Bg1();
    public static C9938yg1 g = new C9938yg1();
    public static final Object h = new Object();
    public static HT0 i = null;
    public boolean a = false;
    public int b = 0;
    public Date c = new Date();
    public boolean d = false;
    public Timer e = null;

    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            HT0.this.d();
        }
    }

    public HT0() {
        f.a(Boolean.valueOf(this.a), Integer.valueOf(this.b), Boolean.valueOf(this.d));
    }

    public static HT0 c() {
        HT0 ht0;
        HT0 ht02 = i;
        if (ht02 != null) {
            return ht02;
        }
        synchronized (h) {
            try {
                if (i == null) {
                    i = new HT0();
                }
                ht0 = i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ht0;
    }

    public void b(boolean z, int i2, Date date, boolean z2) {
        if (i2 < 0) {
            z = false;
        }
        this.a = z;
        this.b = i2;
        this.c = date;
        this.d = z2;
        if (z) {
            Timer timer = this.e;
            if (timer != null) {
                timer.cancel();
            }
            Timer timer2 = new Timer();
            this.e = timer2;
            timer2.schedule(new a(), date);
        } else {
            Timer timer3 = this.e;
            if (timer3 != null) {
                timer3.cancel();
            }
            this.e = null;
        }
        f.a(Boolean.valueOf(z), Integer.valueOf(i2), Boolean.valueOf(z2));
    }

    public final void d() {
        b(false, this.b, this.c, this.d);
        g.a();
    }

    public IT0 e() {
        IT0 it0 = new IT0();
        it0.a = this.a;
        it0.b = this.b;
        it0.c = this.d;
        return it0;
    }

    public int f() {
        return ((int) (this.c.getTime() - new Date().getTime())) / 1000;
    }

    public Date g() {
        return this.c;
    }
}
