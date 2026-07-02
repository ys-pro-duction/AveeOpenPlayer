package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import com.daaw.C0321Ag1;
import com.daaw.C0425Bg1;
import com.daaw.C0529Cg1;
import com.daaw.C0642Dg1;
import com.daaw.C0746Eg1;
import com.daaw.C10217zg1;
import com.daaw.C2078Qw0;
import com.daaw.C9938yg1;
import com.daaw.TI;
import com.daaw.avee.MainActivity;
import com.daaw.avee.comp.playback.MediaPlaybackService;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.uw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C8899uw0 {
    public static volatile boolean d;
    public static volatile boolean e;
    public static volatile C2078Qw0 f = C2078Qw0.k;
    public static volatile C2078Qw0.b g = C2078Qw0.h;
    public static volatile C0705Dw0 h = C0705Dw0.c;
    public static volatile long i = 0;
    public static volatile int j = 0;
    public static volatile int k = 10;
    public static volatile boolean l = false;
    public static volatile boolean m = true;
    public C5415iX0 a;
    public final List b;
    public final Handler c;

    /* JADX INFO: renamed from: com.daaw.uw0$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C7151oi0 c7151oi0Q = C7151oi0.q();
            if (c7151oi0Q != null) {
                c7151oi0Q.F(false, false);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.uw0$b */
    public class b implements Runnable {
        public final /* synthetic */ boolean B;
        public final /* synthetic */ C2078Qw0 C;
        public final /* synthetic */ Long D;
        public final /* synthetic */ Integer E;

        public b(boolean z, C2078Qw0 c2078Qw0, Long l, Integer num) {
            this.B = z;
            this.C = c2078Qw0;
            this.D = l;
            this.E = num;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.B && C8899uw0.this.a.a(this.C)) {
                C8974vC0 c8974vC0C = C8974vC0.c();
                if (c8974vC0C != null) {
                    c8974vC0C.F(this.D);
                    return;
                }
                return;
            }
            if (this.E.intValue() == 1) {
                C8974vC0 c8974vC0C2 = C8974vC0.c();
                if (c8974vC0C2 != null) {
                    c8974vC0C2.F(this.D);
                    return;
                }
                return;
            }
            if (this.E.intValue() != 2) {
                C8974vC0 c8974vC0C3 = C8974vC0.c();
                if (c8974vC0C3 != null) {
                    c8974vC0C3.s(this.D);
                    return;
                }
                return;
            }
            C8974vC0 c8974vC0C4 = C8974vC0.c();
            if (c8974vC0C4 != null) {
                if (c8974vC0C4.q()) {
                    c8974vC0C4.G(this.D);
                } else {
                    c8974vC0C4.s(this.D);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.uw0$c */
    public class c implements Runnable {
        public final /* synthetic */ String B;
        public final /* synthetic */ Boolean C;
        public final /* synthetic */ Boolean D;
        public final /* synthetic */ boolean E;

        public c(String str, Boolean bool, Boolean bool2, boolean z) {
            this.B = str;
            this.C = bool;
            this.D = bool2;
            this.E = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = this.B;
            if (str != null && str.length() > 0) {
                AbstractC5075hI.a.a(this.B);
            }
            C7151oi0 c7151oi0Q = C7151oi0.q();
            if (c7151oi0Q != null) {
                c7151oi0Q.F(this.C.booleanValue(), this.D.booleanValue());
            }
            MainActivity mainActivityE1 = MainActivity.e1();
            if (mainActivityE1 != null) {
                mainActivityE1.w1(this.E || (mainActivityE1.currentFragmentPage == 2 && this.C.booleanValue()), this.E);
            }
        }
    }

    public C8899uw0(C5415iX0 c5415iX0) {
        LinkedList linkedList = new LinkedList();
        this.b = linkedList;
        this.c = new Handler();
        this.a = c5415iX0;
        MainActivity.N0.b(new C10217zg1.a() { // from class: com.daaw.yv0
            @Override // com.daaw.C10217zg1.a
            public final void invoke(Object obj) {
                C8899uw0.U((Activity) obj);
            }
        }, linkedList);
        MediaPlaybackService.o0.b(new C10217zg1.a() { // from class: com.daaw.Av0
            @Override // com.daaw.C10217zg1.a
            public final void invoke(Object obj) {
                C8899uw0.y((Context) obj);
            }
        }, linkedList);
        MediaPlaybackService.r0.b(new C0746Eg1.a() { // from class: com.daaw.Mv0
            @Override // com.daaw.C0746Eg1.a
            public final Object invoke() {
                return Boolean.valueOf(C8899uw0.m);
            }
        }, linkedList);
        MediaPlaybackService.q0.b(new C0746Eg1.a() { // from class: com.daaw.Yv0
            @Override // com.daaw.C0746Eg1.a
            public final Object invoke() {
                return this.a.d0();
            }
        }, linkedList);
        MediaPlaybackService.t0.b(new C0529Cg1.a() { // from class: com.daaw.aw0
            @Override // com.daaw.C0529Cg1.a
            public final void b(Object obj, Object obj2, Object obj3, Object obj4) {
                this.a.g0((C2078Qw0) obj, (InterfaceC6540mX) obj2, (C2078Qw0.b) obj3, (C0705Dw0) obj4);
            }
        }, linkedList);
        MediaPlaybackService.E0.b(new C10217zg1.a() { // from class: com.daaw.bw0
            @Override // com.daaw.C10217zg1.a
            public final void invoke(Object obj) {
                C8899uw0.i = ((Long) obj).longValue();
            }
        }, linkedList);
        MediaPlaybackService.u0.b(new C10217zg1.a() { // from class: com.daaw.cw0
            @Override // com.daaw.C10217zg1.a
            public final void invoke(Object obj) {
                this.a.h0((Integer) obj);
            }
        }, linkedList);
        MediaPlaybackService.p0.b(new C10217zg1.a() { // from class: com.daaw.dw0
            @Override // com.daaw.C10217zg1.a
            public final void invoke(Object obj) {
                this.a.i0((Context) obj);
            }
        }, linkedList);
        MediaPlaybackService.v0.b(new C10217zg1.a() { // from class: com.daaw.ew0
            @Override // com.daaw.C10217zg1.a
            public final void invoke(Object obj) {
                C8899uw0.k = ((Integer) obj).intValue();
            }
        }, linkedList);
        MediaPlaybackService.w0.b(new C10217zg1.a() { // from class: com.daaw.gw0
            @Override // com.daaw.C10217zg1.a
            public final void invoke(Object obj) {
                C8899uw0.l = ((Boolean) obj).booleanValue();
            }
        }, linkedList);
        MediaPlaybackService.x0.b(new C0746Eg1.a() { // from class: com.daaw.Jv0
            @Override // com.daaw.C0746Eg1.a
            public final Object invoke() {
                return Boolean.valueOf(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().h(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.r));
            }
        }, linkedList);
        MediaPlaybackService.y0.b(new C0746Eg1.a() { // from class: com.daaw.Uv0
            @Override // com.daaw.C0746Eg1.a
            public final Object invoke() {
                return Float.valueOf(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().k(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.O) * 0.01f);
            }
        }, linkedList);
        MediaPlaybackService.z0.b(new C0746Eg1.a() { // from class: com.daaw.fw0
            @Override // com.daaw.C0746Eg1.a
            public final Object invoke() {
                return this.a.X();
            }
        }, linkedList);
        MediaPlaybackService.A0.b(new C9938yg1.a() { // from class: com.daaw.ow0
            @Override // com.daaw.C9938yg1.a
            public final void invoke() {
                this.a.Y();
            }
        }, linkedList);
        MediaPlaybackService.D0.b(new C9938yg1.a() { // from class: com.daaw.pw0
            @Override // com.daaw.C9938yg1.a
            public final void invoke() {
                this.a.Z();
            }
        }, linkedList);
        MediaPlaybackService.C0.b(new C9938yg1.a() { // from class: com.daaw.qw0
            @Override // com.daaw.C9938yg1.a
            public final void invoke() {
                this.a.a0();
            }
        }, linkedList);
        MediaPlaybackService.L0.b(new C0642Dg1.a() { // from class: com.daaw.rw0
            @Override // com.daaw.C0642Dg1.a
            public final void e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                this.a.b0((Context) obj, (G3) obj2, (InterfaceC7381pY) obj3, (Integer) obj4, (Integer) obj5);
            }
        }, linkedList);
        C7151oi0.g0.b(new C10217zg1.a() { // from class: com.daaw.sw0
            @Override // com.daaw.C10217zg1.a
            public final void invoke(Object obj) {
                C8899uw0.d((Integer) obj);
            }
        }, linkedList);
        C7151oi0.h0.b(new C9938yg1.a() { // from class: com.daaw.tw0
            @Override // com.daaw.C9938yg1.a
            public final void invoke() {
                TI.e.b.a("Select track");
            }
        }, linkedList);
        C7151oi0.Y.b(new C9938yg1.a() { // from class: com.daaw.zv0
            @Override // com.daaw.C9938yg1.a
            public final void invoke() {
                SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().k0(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.r);
            }
        }, linkedList);
        C7151oi0.f0.b(new C0746Eg1.a() { // from class: com.daaw.Bv0
            @Override // com.daaw.C0746Eg1.a
            public final Object invoke() {
                return Integer.valueOf(this.a.l0());
            }
        }, linkedList);
        C7151oi0.F.b(new C0746Eg1.a() { // from class: com.daaw.Cv0
            @Override // com.daaw.C0746Eg1.a
            public final Object invoke() {
                return Boolean.valueOf(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().h(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.r));
            }
        }, linkedList);
        C7151oi0.G.b(new C0746Eg1.a() { // from class: com.daaw.Dv0
            @Override // com.daaw.C0746Eg1.a
            public final Object invoke() {
                return this.a.c0();
            }
        }, linkedList);
        C7151oi0.P.b(new C0746Eg1.a() { // from class: com.daaw.Ev0
            @Override // com.daaw.C0746Eg1.a
            public final Object invoke() {
                return C8899uw0.F();
            }
        }, linkedList);
        C7151oi0.Q.b(new C0746Eg1.a() { // from class: com.daaw.Fv0
            @Override // com.daaw.C0746Eg1.a
            public final Object invoke() {
                return C8899uw0.v();
            }
        }, linkedList);
        C7151oi0.R.b(new C0746Eg1.a() { // from class: com.daaw.Gv0
            @Override // com.daaw.C0746Eg1.a
            public final Object invoke() {
                return C8899uw0.L();
            }
        }, linkedList);
        C7151oi0.S.b(new C0746Eg1.a() { // from class: com.daaw.Hv0
            @Override // com.daaw.C0746Eg1.a
            public final Object invoke() {
                return this.a.e0();
            }
        }, linkedList);
        C7151oi0.T.b(new C0321Ag1.a() { // from class: com.daaw.Iv0
            @Override // com.daaw.C0321Ag1.a
            public final void invoke(Object obj, Object obj2) {
                com.daaw.avee.comp.playback.c.n.a((Integer) obj);
            }
        }, linkedList);
        C7151oi0.U.b(new C0321Ag1.a() { // from class: com.daaw.Kv0
            @Override // com.daaw.C0321Ag1.a
            public final void invoke(Object obj, Object obj2) {
                Integer num = (Integer) obj;
                SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().c0(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.O, (num.intValue() - 5) * 20);
            }
        }, linkedList);
        C7151oi0.V.b(new C0321Ag1.a() { // from class: com.daaw.Lv0
            @Override // com.daaw.C0321Ag1.a
            public final void invoke(Object obj, Object obj2) {
                Integer num = (Integer) obj;
                SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().c0(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.P, (num.intValue() - 1) * 1000);
            }
        }, linkedList);
        C7151oi0.W.b(new C0746Eg1.a() { // from class: com.daaw.Nv0
            @Override // com.daaw.C0746Eg1.a
            public final Object invoke() {
                return Boolean.valueOf(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().h(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.z));
            }
        }, linkedList);
        C7151oi0.X.b(new C10217zg1.a() { // from class: com.daaw.Ov0
            @Override // com.daaw.C10217zg1.a
            public final void invoke(Object obj) {
                SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().a0(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.z, ((Boolean) obj).booleanValue());
            }
        }, linkedList);
        C7151oi0.d0.b(new C0746Eg1.a() { // from class: com.daaw.Pv0
            @Override // com.daaw.C0746Eg1.a
            public final Object invoke() {
                return Integer.valueOf(C8899uw0.j);
            }
        }, linkedList);
        C7151oi0.e0.b(new C10217zg1.a() { // from class: com.daaw.Qv0
            @Override // com.daaw.C10217zg1.a
            public final void invoke(Object obj) {
                com.daaw.avee.comp.playback.c.j.a((Integer) obj);
            }
        }, linkedList);
        C7151oi0.M.b(new C0746Eg1.a() { // from class: com.daaw.Rv0
            @Override // com.daaw.C0746Eg1.a
            public final Object invoke() {
                return C8899uw0.g();
            }
        }, linkedList);
        C7151oi0.N.b(new C0746Eg1.a() { // from class: com.daaw.Sv0
            @Override // com.daaw.C0746Eg1.a
            public final Object invoke() {
                return C8899uw0.i();
            }
        }, linkedList);
        MainActivity.Q0.b(new C9938yg1.a() { // from class: com.daaw.Tv0
            @Override // com.daaw.C9938yg1.a
            public final void invoke() {
                com.daaw.avee.comp.playback.c.c.a();
            }
        }, linkedList);
        MainActivity.K0.b(new C10217zg1.a() { // from class: com.daaw.Vv0
            @Override // com.daaw.C10217zg1.a
            public final void invoke(Object obj) {
                C8899uw0.q((Activity) obj);
            }
        }, linkedList);
        MainActivity.N0.b(new C10217zg1.a() { // from class: com.daaw.Wv0
            @Override // com.daaw.C10217zg1.a
            public final void invoke(Object obj) {
                C8899uw0.s((Activity) obj);
            }
        }, linkedList);
        SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.g.b(new C0425Bg1.a() { // from class: com.daaw.Xv0
            @Override // com.daaw.C0425Bg1.a
            public final void invoke(Object obj, Object obj2, Object obj3) {
                this.a.f0((Integer) obj, (Integer) obj2, (Boolean) obj3);
            }
        }, linkedList);
        SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.h.b(new C0321Ag1.a() { // from class: com.daaw.Zv0
            @Override // com.daaw.C0321Ag1.a
            public final void invoke(Object obj, Object obj2) {
                C8899uw0.e((Integer) obj, (Boolean) obj2);
            }
        }, linkedList);
    }

    public static /* synthetic */ B61 F() {
        Integer num = (Integer) com.daaw.avee.comp.playback.c.p.a(0);
        num.intValue();
        return new B61(num, Integer.valueOf(k));
    }

    public static /* synthetic */ B61 L() {
        return null;
    }

    public static /* synthetic */ void M(C2078Qw0.b bVar) {
        MainActivity mainActivityE1 = MainActivity.e1();
        if (mainActivityE1 != null) {
            mainActivityE1.H1(bVar);
        }
        C7151oi0 c7151oi0Q = C7151oi0.q();
        if (c7151oi0Q != null) {
            c7151oi0Q.G(g, h);
        }
    }

    public static /* synthetic */ void U(Activity activity) {
        C8974vC0 c8974vC0C = C8974vC0.c();
        if (c8974vC0C != null) {
            c8974vC0C.x(activity);
        }
        com.daaw.avee.comp.playback.c.b.a();
    }

    public static /* synthetic */ void d(Integer num) {
        if (num.intValue() == 0) {
            SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().c0(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.K, 0);
        } else if (num.intValue() == 1) {
            SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().c0(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.K, 1);
        }
    }

    public static /* synthetic */ void e(Integer num, Boolean bool) {
        if (num.intValue() == SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.r) {
            C7151oi0 c7151oi0Q = C7151oi0.q();
            if (c7151oi0Q != null) {
                c7151oi0Q.y(bool.booleanValue());
            }
            com.daaw.avee.comp.playback.c.q.a(bool);
        }
    }

    public static /* synthetic */ B61 g() {
        return new B61(g, h);
    }

    public static /* synthetic */ B61 i() {
        return new B61(Boolean.valueOf(d), Boolean.valueOf(e));
    }

    public static /* synthetic */ void n() {
        C7151oi0 c7151oi0Q = C7151oi0.q();
        if (c7151oi0Q != null) {
            c7151oi0Q.w(j);
        }
    }

    public static /* synthetic */ void q(Activity activity) {
        m = false;
        com.daaw.avee.comp.playback.c.g.a();
        com.daaw.avee.comp.playback.c.h.a(Boolean.FALSE);
    }

    public static /* synthetic */ void r(boolean z) {
        MainActivity mainActivityE1 = MainActivity.e1();
        if (mainActivityE1 != null) {
            mainActivityE1.w1(z || (mainActivityE1.currentFragmentPage == 2 && d), z);
        }
    }

    public static /* synthetic */ void s(Activity activity) {
        m = true;
        com.daaw.avee.comp.playback.c.h.a(Boolean.TRUE);
    }

    public static /* synthetic */ void u() {
        C8974vC0 c8974vC0C = C8974vC0.c();
        if (c8974vC0C != null) {
            if (c8974vC0C.o() == 0) {
                c8974vC0C.T(1, true);
            } else {
                c8974vC0C.T(0, true);
            }
        }
    }

    public static /* synthetic */ B61 v() {
        return new B61(Integer.valueOf((SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().k(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.O) / 20) + 5), 10);
    }

    public static /* synthetic */ void y(Context context) {
        AbstractC1765Ob1.c();
        C8974vC0 c8974vC0C = C8974vC0.c();
        if (c8974vC0C != null) {
            c8974vC0C.x(context);
        }
    }

    public final float W() {
        return 1.0f;
    }

    public final /* synthetic */ Float X() {
        return Float.valueOf(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().k(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.P) * 0.001f * W());
    }

    public final /* synthetic */ void Y() {
        this.c.post(new Runnable() { // from class: com.daaw.jw0
            @Override // java.lang.Runnable
            public final void run() {
                C8899uw0.u();
            }
        });
    }

    public final /* synthetic */ void Z() {
        this.c.post(new Runnable() { // from class: com.daaw.iw0
            @Override // java.lang.Runnable
            public final void run() {
                C8974vC0.c().H();
            }
        });
    }

    public final /* synthetic */ void a0() {
        this.c.post(new Runnable() { // from class: com.daaw.hw0
            @Override // java.lang.Runnable
            public final void run() {
                C8974vC0.c().t();
            }
        });
    }

    public final /* synthetic */ void b0(Context context, final G3 g3, final InterfaceC7381pY interfaceC7381pY, final Integer num, final Integer num2) {
        this.c.post(new Runnable() { // from class: com.daaw.lw0
            @Override // java.lang.Runnable
            public final void run() {
                G3 g32 = g3;
                new E3().q(false, g32.a, g32.b, g32.c, interfaceC7381pY, num.intValue(), num2.intValue(), 0, -1, false, null, null);
            }
        });
    }

    public final /* synthetic */ Boolean c0() {
        return Boolean.valueOf(n0());
    }

    public final /* synthetic */ Integer d0() {
        return Integer.valueOf(l0());
    }

    public final /* synthetic */ C61 e0() {
        return new C61(Integer.valueOf((SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().k(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.P) / 1000) + 1), 10, Float.valueOf(W()));
    }

    public final /* synthetic */ void f0(Integer num, Integer num2, Boolean bool) {
        if (num.intValue() == SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.K) {
            o0(num2);
            return;
        }
        if (num.intValue() != SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.O) {
            if (num.intValue() == SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.P) {
                com.daaw.avee.comp.playback.c.t.a(Float.valueOf(num2.intValue() * 0.001f * W()));
            }
        } else {
            C7151oi0 c7151oi0Q = C7151oi0.q();
            if (c7151oi0Q != null) {
                c7151oi0Q.s(n0());
            }
            com.daaw.avee.comp.playback.c.s.a(Float.valueOf(num2.intValue() * 0.01f));
        }
    }

    public final /* synthetic */ void g0(C2078Qw0 c2078Qw0, InterfaceC6540mX interfaceC6540mX, final C2078Qw0.b bVar, C0705Dw0 c0705Dw0) {
        f = c2078Qw0;
        h = c0705Dw0;
        g = bVar;
        this.c.post(new Runnable() { // from class: com.daaw.kw0
            @Override // java.lang.Runnable
            public final void run() {
                C8899uw0.M(bVar);
            }
        });
    }

    public final /* synthetic */ void h0(Integer num) {
        j = num.intValue();
        this.c.post(new Runnable() { // from class: com.daaw.mw0
            @Override // java.lang.Runnable
            public final void run() {
                C8899uw0.n();
            }
        });
    }

    public final /* synthetic */ void i0(Context context) {
        this.c.post(new a());
    }

    public void j0(Boolean bool, Boolean bool2, Integer num, String str, C2078Qw0 c2078Qw0, boolean z) {
        d = bool.booleanValue();
        e = bool2.booleanValue();
        this.c.post(new c(str, bool, bool2, z));
    }

    public void k0(Integer num, Boolean bool, Long l2, boolean z, C2078Qw0 c2078Qw0) {
        if (bool.booleanValue()) {
            this.c.post(new b(z, c2078Qw0, l2, num));
        }
    }

    public final int l0() {
        return SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().k(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.K);
    }

    public void m0(Integer num, Activity activity, boolean z) {
        MainActivity mainActivityE1 = MainActivity.e1();
        if (mainActivityE1 != null) {
            mainActivityE1.w1(z || (num.intValue() == 2 && d), z);
        }
    }

    public final boolean n0() {
        return SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().k(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.O) != 0;
    }

    public void o0(Integer num) {
        com.daaw.avee.comp.playback.c.v.a(num);
        C7151oi0 c7151oi0Q = C7151oi0.q();
        if (c7151oi0Q != null) {
            c7151oi0Q.v(num.intValue());
        }
    }

    public void p0(final boolean z) {
        this.c.post(new Runnable() { // from class: com.daaw.nw0
            @Override // java.lang.Runnable
            public final void run() {
                C8899uw0.r(z);
            }
        });
    }
}
