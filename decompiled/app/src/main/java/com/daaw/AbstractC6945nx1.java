package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: com.daaw.nx1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6945nx1 implements InterfaceC6666mx1 {
    public static volatile C2813Xx1 V;
    public MotionEvent B;
    public double K;
    public double L;
    public double M;
    public float N;
    public float O;
    public float P;
    public float Q;
    public DisplayMetrics T;
    public C1957Px1 U;
    public final LinkedList C = new LinkedList();
    public long D = 0;
    public long E = 0;
    public long F = 0;
    public long G = 0;
    public long H = 0;
    public long I = 0;
    public long J = 0;
    public boolean R = false;
    public boolean S = false;

    public AbstractC6945nx1(Context context) {
        try {
            AbstractC10295zw1.d();
            this.T = context.getResources().getDisplayMetrics();
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.w2)).booleanValue()) {
                this.U = new C1957Px1();
            }
        } catch (Throwable unused) {
        }
    }

    public abstract long a(StackTraceElement[] stackTraceElementArr);

    public abstract C9733xv1 b(Context context, View view, Activity activity);

    public abstract C9733xv1 c(Context context, C7774qv1 c7774qv1);

    public abstract C9733xv1 d(Context context, View view, Activity activity);

    public abstract C3021Zx1 e(MotionEvent motionEvent);

    public final void f() {
        this.H = 0L;
        this.D = 0L;
        this.E = 0L;
        this.F = 0L;
        this.G = 0L;
        this.I = 0L;
        this.J = 0L;
        if (this.C.isEmpty()) {
            MotionEvent motionEvent = this.B;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        } else {
            Iterator it = this.C.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.C.clear();
        }
        this.B = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String g(android.content.Context r19, java.lang.String r20, int r21, android.view.View r22, android.app.Activity r23, byte[] r24) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC6945nx1.g(android.content.Context, java.lang.String, int, android.view.View, android.app.Activity, byte[]):java.lang.String");
    }

    @Override // com.daaw.InterfaceC6666mx1
    public final String zze(Context context, String str, View view) {
        return g(context, str, 3, view, null, null);
    }

    @Override // com.daaw.InterfaceC6666mx1
    public final String zzf(Context context, String str, View view, Activity activity) {
        return g(context, str, 3, view, activity, null);
    }

    @Override // com.daaw.InterfaceC6666mx1
    public final String zzg(Context context) {
        if (AbstractC3304ay1.c()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return g(context, null, 1, null, null, null);
    }

    @Override // com.daaw.InterfaceC6666mx1
    public final String zzh(Context context, View view, Activity activity) {
        return g(context, null, 2, view, activity, null);
    }

    @Override // com.daaw.InterfaceC6666mx1
    public final synchronized void zzk(MotionEvent motionEvent) {
        Long l;
        try {
            if (this.R) {
                f();
                this.R = false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.K = 0.0d;
                this.L = motionEvent.getRawX();
                this.M = motionEvent.getRawY();
            } else if (action == 1 || action == 2) {
                double rawX = motionEvent.getRawX();
                double rawY = motionEvent.getRawY();
                double d = rawX - this.L;
                double d2 = rawY - this.M;
                this.K += Math.sqrt((d * d) + (d2 * d2));
                this.L = rawX;
                this.M = rawY;
            }
            int action2 = motionEvent.getAction();
            if (action2 != 0) {
                try {
                    if (action2 == 1) {
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        this.B = motionEventObtain;
                        this.C.add(motionEventObtain);
                        if (this.C.size() > 6) {
                            ((MotionEvent) this.C.remove()).recycle();
                        }
                        this.F++;
                        this.H = a(new Throwable().getStackTrace());
                    } else if (action2 == 2) {
                        this.E += (long) (motionEvent.getHistorySize() + 1);
                        C3021Zx1 c3021Zx1E = e(motionEvent);
                        Long l2 = c3021Zx1E.d;
                        if (l2 != null && c3021Zx1E.g != null) {
                            this.I += l2.longValue() + c3021Zx1E.g.longValue();
                        }
                        if (this.T != null && (l = c3021Zx1E.e) != null && c3021Zx1E.h != null) {
                            this.J += l.longValue() + c3021Zx1E.h.longValue();
                        }
                    } else if (action2 == 3) {
                        this.G++;
                    }
                } catch (C1749Nx1 unused) {
                }
            } else {
                this.N = motionEvent.getX();
                this.O = motionEvent.getY();
                this.P = motionEvent.getRawX();
                this.Q = motionEvent.getRawY();
                this.D++;
            }
            this.S = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.daaw.InterfaceC6666mx1
    public final synchronized void zzl(int i, int i2, int i3) {
        try {
            if (this.B != null) {
                if (((Boolean) zzba.zzc().b(AbstractC9820yE1.m2)).booleanValue()) {
                    f();
                } else {
                    this.B.recycle();
                }
            }
            DisplayMetrics displayMetrics = this.T;
            if (displayMetrics != null) {
                float f = displayMetrics.density;
                this.B = MotionEvent.obtain(0L, i3, 1, i * f, i2 * f, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            } else {
                this.B = null;
            }
            this.S = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.daaw.InterfaceC6666mx1
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        C1957Px1 c1957Px1;
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.w2)).booleanValue() || (c1957Px1 = this.U) == null) {
            return;
        }
        c1957Px1.b(Arrays.asList(stackTraceElementArr));
    }
}
