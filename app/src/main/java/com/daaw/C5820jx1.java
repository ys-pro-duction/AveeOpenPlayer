package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.daaw.jx1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5820jx1 implements InterfaceC6666mx1 {
    public static C5820jx1 S;
    public final Context B;
    public final LL2 C;
    public final QL2 D;
    public final SL2 E;
    public final C2187Rx1 F;
    public final SK2 G;
    public final Executor H;
    public final PL2 I;
    public final C5265hy1 K;
    public final C2917Yx1 L;
    public final C1957Px1 M;
    public volatile boolean P;
    public volatile boolean Q;
    public final int R;
    public volatile long N = 0;
    public final Object O = new Object();
    public final CountDownLatch J = new CountDownLatch(1);

    public C5820jx1(Context context, SK2 sk2, LL2 ll2, QL2 ql2, SL2 sl2, C2187Rx1 c2187Rx1, Executor executor, NK2 nk2, int i, C5265hy1 c5265hy1, C2917Yx1 c2917Yx1, C1957Px1 c1957Px1) {
        this.Q = false;
        this.B = context;
        this.G = sk2;
        this.C = ll2;
        this.D = ql2;
        this.E = sl2;
        this.F = c2187Rx1;
        this.H = executor;
        this.R = i;
        this.K = c5265hy1;
        this.L = c2917Yx1;
        this.M = c1957Px1;
        this.Q = false;
        this.I = new C5261hx1(this, nk2);
    }

    public static synchronized C5820jx1 a(String str, Context context, boolean z, boolean z2) {
        return b(str, context, Executors.newCachedThreadPool(), z, z2);
    }

    public static synchronized C5820jx1 b(String str, Context context, Executor executor, boolean z, boolean z2) {
        try {
            if (S == null) {
                TK2 tk2A = UK2.a();
                tk2A.a(str);
                tk2A.c(z);
                UK2 uk2D = tk2A.d();
                SK2 sk2A = SK2.a(context, executor, z2);
                C8904ux1 c8904ux1C = ((Boolean) zzba.zzc().b(AbstractC9820yE1.f3)).booleanValue() ? C8904ux1.c(context) : null;
                C5265hy1 c5265hy1D = ((Boolean) zzba.zzc().b(AbstractC9820yE1.g3)).booleanValue() ? C5265hy1.d(context, executor) : null;
                C2917Yx1 c2917Yx1 = ((Boolean) zzba.zzc().b(AbstractC9820yE1.u2)).booleanValue() ? new C2917Yx1() : null;
                C1957Px1 c1957Px1 = ((Boolean) zzba.zzc().b(AbstractC9820yE1.w2)).booleanValue() ? new C1957Px1() : null;
                C7332pL2 c7332pL2E = C7332pL2.e(context, executor, sk2A, uk2D);
                C2083Qx1 c2083Qx1 = new C2083Qx1(context);
                C2917Yx1 c2917Yx12 = c2917Yx1;
                C2187Rx1 c2187Rx1 = new C2187Rx1(uk2D, c7332pL2E, new ViewOnAttachStateChangeListenerC4418ey1(context, c2083Qx1), c2083Qx1, c8904ux1C, c5265hy1D, c2917Yx12, c1957Px1);
                int iB = AbstractC9849yL2.b(context, sk2A);
                NK2 nk2 = new NK2();
                C5820jx1 c5820jx1 = new C5820jx1(context, sk2A, new LL2(context, iB), new QL2(context, iB, new C4982gx1(sk2A), ((Boolean) zzba.zzc().b(AbstractC9820yE1.d2)).booleanValue()), new SL2(context, c2187Rx1, sk2A, nk2), c2187Rx1, executor, nk2, iB, c5265hy1D, c2917Yx12, c1957Px1);
                S = c5820jx1;
                c5820jx1.g();
                S.h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return S;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0103 A[Catch: all -> 0x009d, v43 -> 0x00a0, TRY_ENTER, TRY_LEAVE, TryCatch #1 {v43 -> 0x00a0, blocks: (B:6:0x0021, B:8:0x0032, B:12:0x0038, B:13:0x0044, B:15:0x0052, B:17:0x0060, B:20:0x006d, B:32:0x00a3, B:36:0x00bc, B:42:0x00d5, B:46:0x00e7, B:48:0x00ed, B:50:0x00f5, B:51:0x00f7, B:39:0x00c6, B:40:0x00cd, B:23:0x0074, B:25:0x008a, B:53:0x0103, B:55:0x0112, B:57:0x0121), top: B:65:0x0021, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* bridge */ /* synthetic */ void f(com.daaw.C5820jx1 r12) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C5820jx1.f(com.daaw.jx1):void");
    }

    public final synchronized void g() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        KL2 kl2L = l(1);
        if (kl2L == null) {
            this.G.d(4013, System.currentTimeMillis() - jCurrentTimeMillis);
        } else if (this.E.c(kl2L)) {
            this.Q = true;
            this.J.countDown();
        }
    }

    public final void h() {
        if (this.P) {
            return;
        }
        synchronized (this.O) {
            try {
                if (!this.P) {
                    if ((System.currentTimeMillis() / 1000) - this.N < 3600) {
                        return;
                    }
                    KL2 kl2B = this.E.b();
                    if ((kl2B == null || kl2B.d(3600L)) && AbstractC9849yL2.a(this.R)) {
                        this.H.execute(new RunnableC5538ix1(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized boolean j() {
        return this.Q;
    }

    public final void k() {
        C5265hy1 c5265hy1 = this.K;
        if (c5265hy1 != null) {
            c5265hy1.h();
        }
    }

    public final KL2 l(int i) {
        if (AbstractC9849yL2.a(this.R)) {
            return ((Boolean) zzba.zzc().b(AbstractC9820yE1.b2)).booleanValue() ? this.D.c(1) : this.C.c(1);
        }
        return null;
    }

    @Override // com.daaw.InterfaceC6666mx1
    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.daaw.InterfaceC6666mx1
    public final String zzf(Context context, String str, View view, Activity activity) {
        k();
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.u2)).booleanValue()) {
            this.L.i();
        }
        h();
        VK2 vk2A = this.E.a();
        if (vk2A == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strC = vk2A.c(context, null, str, view, activity);
        this.G.f(5000, System.currentTimeMillis() - jCurrentTimeMillis, strC, null);
        return strC;
    }

    @Override // com.daaw.InterfaceC6666mx1
    public final String zzg(Context context) {
        k();
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.u2)).booleanValue()) {
            this.L.j();
        }
        h();
        VK2 vk2A = this.E.a();
        if (vk2A == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strA = vk2A.a(context, null);
        this.G.f(5001, System.currentTimeMillis() - jCurrentTimeMillis, strA, null);
        return strA;
    }

    @Override // com.daaw.InterfaceC6666mx1
    public final String zzh(Context context, View view, Activity activity) {
        k();
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.u2)).booleanValue()) {
            this.L.k(context, view);
        }
        h();
        VK2 vk2A = this.E.a();
        if (vk2A == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strD = vk2A.d(context, null, view, activity);
        this.G.f(5002, System.currentTimeMillis() - jCurrentTimeMillis, strD, null);
        return strD;
    }

    @Override // com.daaw.InterfaceC6666mx1
    public final void zzk(MotionEvent motionEvent) {
        VK2 vk2A = this.E.a();
        if (vk2A != null) {
            try {
                vk2A.b(null, motionEvent);
            } catch (RL2 e) {
                this.G.c(e.a(), -1L, e);
            }
        }
    }

    @Override // com.daaw.InterfaceC6666mx1
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        C1957Px1 c1957Px1 = this.M;
        if (c1957Px1 != null) {
            c1957Px1.b(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.daaw.InterfaceC6666mx1
    public final void zzo(View view) {
        this.F.a(view);
    }

    @Override // com.daaw.InterfaceC6666mx1
    public final void zzl(int i, int i2, int i3) {
    }
}
