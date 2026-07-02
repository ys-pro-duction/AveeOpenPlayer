package com.daaw;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.ads.internal.zzb;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.Yh2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2854Yh2 {
    public final P62 a;
    public final C1766Ob2 b;
    public final C72 c;
    public final U72 d;
    public final C4757g82 e;
    public final C3746ca2 f;
    public final Executor g;
    public final C0831Fb2 h;
    public final C6690n22 i;
    public final zzb j;
    public final InterfaceC3152aR1 k;
    public final C7782qx1 l;
    public final N92 m;
    public final C6077kq2 n;
    public final C6487mJ2 o;
    public final C1071Hj2 p;
    public final InterfaceC6483mI2 q;
    public final L12 r;
    public final C4343ei2 s;

    public C2854Yh2(P62 p62, C72 c72, U72 u72, C4757g82 c4757g82, C3746ca2 c3746ca2, Executor executor, C0831Fb2 c0831Fb2, C6690n22 c6690n22, zzb zzbVar, InterfaceC3152aR1 interfaceC3152aR1, C7782qx1 c7782qx1, N92 n92, C6077kq2 c6077kq2, C6487mJ2 c6487mJ2, C1071Hj2 c1071Hj2, InterfaceC6483mI2 interfaceC6483mI2, C1766Ob2 c1766Ob2, L12 l12, C4343ei2 c4343ei2) {
        this.a = p62;
        this.c = c72;
        this.d = u72;
        this.e = c4757g82;
        this.f = c3746ca2;
        this.g = executor;
        this.h = c0831Fb2;
        this.i = c6690n22;
        this.j = zzbVar;
        this.k = interfaceC3152aR1;
        this.l = c7782qx1;
        this.m = n92;
        this.n = c6077kq2;
        this.o = c6487mJ2;
        this.p = c1071Hj2;
        this.q = interfaceC6483mI2;
        this.b = c1766Ob2;
        this.r = l12;
        this.s = c4343ei2;
    }

    public static final InterfaceFutureC8236sc0 j(InterfaceC9334wW1 interfaceC9334wW1, String str, String str2) {
        final BT1 bt1 = new BT1();
        interfaceC9334wW1.zzN().I(new InterfaceC7379pX1() { // from class: com.daaw.Ph2
            @Override // com.daaw.InterfaceC7379pX1
            public final void zza(boolean z, int i, String str3, String str4) {
                BT1 bt12 = bt1;
                if (z) {
                    bt12.b(null);
                    return;
                }
                bt12.c(new Exception("Ad Web View failed to load. Error code: " + i + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        interfaceC9334wW1.n0(str, str2, null);
        return bt1;
    }

    public final /* synthetic */ void c() {
        this.a.onAdClicked();
    }

    public final /* synthetic */ void d(String str, String str2) {
        this.f.a(str, str2);
    }

    public final /* synthetic */ void e() {
        this.c.zzb();
    }

    public final /* synthetic */ void f(View view) {
        this.j.zza();
    }

    public final /* synthetic */ void g(InterfaceC9334wW1 interfaceC9334wW1, InterfaceC9334wW1 interfaceC9334wW12, Map map) {
        this.i.l(interfaceC9334wW1);
    }

    public final /* synthetic */ boolean h(View view, MotionEvent motionEvent) {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.u9)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
            this.s.b(motionEvent);
        }
        this.j.zza();
        if (view == null) {
            return false;
        }
        view.performClick();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(final InterfaceC9334wW1 interfaceC9334wW1, boolean z, JI1 ji1) {
        InterfaceC7936rX1 interfaceC7936rX1ZzN = interfaceC9334wW1.zzN();
        zza zzaVar = new zza() { // from class: com.daaw.Qh2
            @Override // com.google.android.gms.ads.internal.client.zza
            public final void onAdClicked() {
                this.B.c();
            }
        };
        TH1 th1 = new TH1() { // from class: com.daaw.Rh2
            @Override // com.daaw.TH1
            public final void a(String str, String str2) {
                this.B.d(str, str2);
            }
        };
        zzz zzzVar = new zzz() { // from class: com.daaw.Sh2
            @Override // com.google.android.gms.ads.internal.overlay.zzz
            public final void zzg() {
                this.B.e();
            }
        };
        C2750Xh2 c2750Xh2 = new C2750Xh2(this);
        InterfaceC3152aR1 interfaceC3152aR1 = this.k;
        C6077kq2 c6077kq2 = this.n;
        C6487mJ2 c6487mJ2 = this.o;
        C1071Hj2 c1071Hj2 = this.p;
        interfaceC7936rX1ZzN.O(zzaVar, this.d, this.e, th1, zzzVar, z, ji1, this.j, c2750Xh2, interfaceC3152aR1, c6077kq2, c6487mJ2, c1071Hj2, this.q, null, this.b, null, null, this.r);
        interfaceC9334wW1.setOnTouchListener(new View.OnTouchListener() { // from class: com.daaw.Th2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                this.B.h(view, motionEvent);
                return false;
            }
        });
        interfaceC9334wW1.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.Uh2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.B.f(view);
            }
        });
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.s2)).booleanValue()) {
            this.l.c().zzo((View) interfaceC9334wW1);
        }
        this.h.x0(interfaceC9334wW1, this.g);
        this.h.x0(new InterfaceC9191vz1() { // from class: com.daaw.Vh2
            @Override // com.daaw.InterfaceC9191vz1
            public final void b0(C8912uz1 c8912uz1) {
                InterfaceC7936rX1 interfaceC7936rX1ZzN2 = interfaceC9334wW1.zzN();
                Rect rect = c8912uz1.d;
                interfaceC7936rX1ZzN2.s0(rect.left, rect.top, false);
            }
        }, this.g);
        this.h.B0((View) interfaceC9334wW1);
        interfaceC9334wW1.C("/trackActiveViewUnit", new HI1() { // from class: com.daaw.Wh2
            @Override // com.daaw.HI1
            public final void a(Object obj, Map map) {
                this.a.g(interfaceC9334wW1, (InterfaceC9334wW1) obj, map);
            }
        });
        this.i.m(interfaceC9334wW1);
    }
}
