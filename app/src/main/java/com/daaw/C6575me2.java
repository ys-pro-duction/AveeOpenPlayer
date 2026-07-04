package com.daaw;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcaz;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.me2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6575me2 extends AbstractC4448f42 {
    public static final OP2 G = OP2.O("3010", "3008", "1005", "1009", "2011", "2007");
    public final Context A;
    public final C7133oe2 B;
    public final C9455wv2 C;
    public final Map D;
    public final List E;
    public final C9749xz1 F;
    public final Executor i;
    public final C7969re2 j;
    public final InterfaceC10208ze2 k;
    public final C2530Ve2 l;
    public final C9371we2 m;
    public final C0522Ce2 n;
    public final V73 o;
    public final V73 p;
    public final V73 q;
    public final V73 r;
    public final V73 s;
    public InterfaceViewOnClickListenerC9097vf2 t;
    public boolean u;
    public boolean v;
    public boolean w;
    public final C7912rR1 x;
    public final C7782qx1 y;
    public final zzcaz z;

    public C6575me2(C4169e42 c4169e42, Executor executor, C7969re2 c7969re2, InterfaceC10208ze2 interfaceC10208ze2, C2530Ve2 c2530Ve2, C9371we2 c9371we2, C0522Ce2 c0522Ce2, V73 v73, V73 v732, V73 v733, V73 v734, V73 v735, C7912rR1 c7912rR1, C7782qx1 c7782qx1, zzcaz zzcazVar, Context context, C7133oe2 c7133oe2, C9455wv2 c9455wv2, C9749xz1 c9749xz1) {
        super(c4169e42);
        this.i = executor;
        this.j = c7969re2;
        this.k = interfaceC10208ze2;
        this.l = c2530Ve2;
        this.m = c9371we2;
        this.n = c0522Ce2;
        this.o = v73;
        this.p = v732;
        this.q = v733;
        this.r = v734;
        this.s = v735;
        this.x = c7912rR1;
        this.y = c7782qx1;
        this.z = zzcazVar;
        this.A = context;
        this.B = c7133oe2;
        this.C = c9455wv2;
        this.D = new HashMap();
        this.E = new ArrayList();
        this.F = c9749xz1;
    }

    public static boolean C(View view) {
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.M9)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
        }
        zzt.zzp();
        long jZzv = com.google.android.gms.ads.internal.util.zzt.zzv(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), null)) {
            if (jZzv >= ((Integer) zzba.zzc().b(AbstractC9820yE1.N9)).intValue()) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void U(C6575me2 c6575me2) {
        try {
            C7969re2 c7969re2 = c6575me2.j;
            int iP = c7969re2.P();
            if (iP == 1) {
                if (c6575me2.n.b() != null) {
                    c6575me2.G("Google", true);
                    c6575me2.n.b().x0((NG1) c6575me2.o.zzb());
                    return;
                }
                return;
            }
            if (iP == 2) {
                if (c6575me2.n.a() != null) {
                    c6575me2.G("Google", true);
                    c6575me2.n.a().C0((LG1) c6575me2.p.zzb());
                    return;
                }
                return;
            }
            if (iP == 3) {
                if (c6575me2.n.d(c7969re2.a()) != null) {
                    if (c6575me2.j.f0() != null) {
                        c6575me2.P("Google", true);
                    }
                    c6575me2.n.d(c6575me2.j.a()).y2((QG1) c6575me2.s.zzb());
                    return;
                }
                return;
            }
            if (iP == 6) {
                if (c6575me2.n.f() != null) {
                    c6575me2.G("Google", true);
                    c6575me2.n.f().v2((InterfaceC9553xH1) c6575me2.q.zzb());
                    return;
                }
                return;
            }
            if (iP != 7) {
                AbstractC4274eT1.zzg("Wrong native template id!");
                return;
            }
            C0522Ce2 c0522Ce2 = c6575me2.n;
            if (c0522Ce2.g() != null) {
                c0522Ce2.g().n2((InterfaceC4238eK1) c6575me2.r.zzb());
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("RemoteException when notifyAdLoad is called", e);
        }
    }

    public final synchronized boolean A() {
        return this.k.zzB();
    }

    public final boolean B() {
        return this.m.d();
    }

    public final synchronized boolean D(Bundle bundle) {
        if (this.v) {
            return true;
        }
        boolean zD = this.k.d(bundle);
        this.v = zD;
        return zD;
    }

    public final synchronized View E(Map map) {
        if (map == null) {
            return null;
        }
        OP2 op2 = G;
        int size = op2.size();
        int i = 0;
        while (i < size) {
            WeakReference weakReference = (WeakReference) map.get((String) op2.get(i));
            i++;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
        }
        return null;
    }

    public final synchronized ImageView.ScaleType F() {
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.L7)).booleanValue()) {
            return null;
        }
        InterfaceViewOnClickListenerC9097vf2 interfaceViewOnClickListenerC9097vf2 = this.t;
        if (interfaceViewOnClickListenerC9097vf2 == null) {
            AbstractC4274eT1.zze("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        InterfaceC7934rX interfaceC7934rXZzj = interfaceViewOnClickListenerC9097vf2.zzj();
        if (interfaceC7934rXZzj != null) {
            return (ImageView.ScaleType) BinderC7744qp0.I(interfaceC7934rXZzj);
        }
        return C2530Ve2.k;
    }

    public final void G(String str, boolean z) {
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.Y4)).booleanValue()) {
            P("Google", true);
            return;
        }
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0J0 = this.j.j0();
        if (interfaceFutureC8236sc0J0 == null) {
            return;
        }
        AbstractC7360pS2.r(interfaceFutureC8236sc0J0, new C6008ke2(this, "Google", true), this.i);
    }

    public final synchronized int H() {
        return this.k.zza();
    }

    public final synchronized void I(View view, Map map, Map map2) {
        this.l.d(this.t);
        this.k.b(view, map, map2, F());
        this.v = true;
    }

    public final void J(View view, AbstractC9841yJ2 abstractC9841yJ2) {
        InterfaceC9334wW1 interfaceC9334wW1E0 = this.j.e0();
        if (!this.m.d() || abstractC9841yJ2 == null || interfaceC9334wW1E0 == null || view == null) {
            return;
        }
        zzt.zzA().g(abstractC9841yJ2, view);
    }

    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final synchronized void b0(InterfaceViewOnClickListenerC9097vf2 interfaceViewOnClickListenerC9097vf2) {
        Iterator<String> itKeys;
        View view;
        try {
            if (this.u) {
                return;
            }
            this.t = interfaceViewOnClickListenerC9097vf2;
            this.l.e(interfaceViewOnClickListenerC9097vf2);
            this.k.f(interfaceViewOnClickListenerC9097vf2.zzf(), interfaceViewOnClickListenerC9097vf2.zzm(), interfaceViewOnClickListenerC9097vf2.zzn(), interfaceViewOnClickListenerC9097vf2, interfaceViewOnClickListenerC9097vf2);
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.s2)).booleanValue()) {
                this.y.c().zzo(interfaceViewOnClickListenerC9097vf2.zzf());
            }
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.I1)).booleanValue()) {
                C4498fF2 c4498fF2 = this.b;
                if (c4498fF2.m0 && (itKeys = c4498fF2.l0.keys()) != null) {
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        WeakReference weakReference = (WeakReference) this.t.zzl().get(next);
                        this.D.put(next, Boolean.FALSE);
                        if (weakReference != null && (view = (View) weakReference.get()) != null) {
                            ViewOnAttachStateChangeListenerC9470wz1 viewOnAttachStateChangeListenerC9470wz1 = new ViewOnAttachStateChangeListenerC9470wz1(this.A, view);
                            this.E.add(viewOnAttachStateChangeListenerC9470wz1);
                            viewOnAttachStateChangeListenerC9470wz1.c(new C5729je2(this, next));
                        }
                    }
                }
            }
            if (interfaceViewOnClickListenerC9097vf2.zzi() != null) {
                interfaceViewOnClickListenerC9097vf2.zzi().c(this.x);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final void c0(InterfaceViewOnClickListenerC9097vf2 interfaceViewOnClickListenerC9097vf2) {
        this.k.c(interfaceViewOnClickListenerC9097vf2.zzf(), interfaceViewOnClickListenerC9097vf2.zzl());
        if (interfaceViewOnClickListenerC9097vf2.zzh() != null) {
            interfaceViewOnClickListenerC9097vf2.zzh().setClickable(false);
            interfaceViewOnClickListenerC9097vf2.zzh().removeAllViews();
        }
        if (interfaceViewOnClickListenerC9097vf2.zzi() != null) {
            interfaceViewOnClickListenerC9097vf2.zzi().e(this.x);
        }
        this.t = null;
    }

    public final C7133oe2 M() {
        return this.B;
    }

    public final AbstractC9841yJ2 P(String str, boolean z) {
        String str2;
        EnumC2160Rq2 enumC2160Rq2;
        EnumC2056Qq2 enumC2056Qq2;
        if (!this.m.d() || TextUtils.isEmpty(str)) {
            return null;
        }
        C7969re2 c7969re2 = this.j;
        InterfaceC9334wW1 interfaceC9334wW1E0 = c7969re2.e0();
        InterfaceC9334wW1 interfaceC9334wW1F0 = c7969re2.f0();
        if (interfaceC9334wW1E0 == null && interfaceC9334wW1F0 == null) {
            AbstractC4274eT1.zzj("Omid display and video webview are null. Skipping initialization.");
            return null;
        }
        boolean z2 = false;
        boolean z3 = interfaceC9334wW1E0 != null;
        boolean z4 = interfaceC9334wW1F0 != null;
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.W4)).booleanValue()) {
            this.m.a();
            int iB = this.m.a().b();
            int i = iB - 1;
            if (i != 0) {
                if (i != 1) {
                    AbstractC4274eT1.zzj("Unknown omid media type: " + (iB != 1 ? iB != 2 ? "UNKNOWN" : "DISPLAY" : "VIDEO") + ". Not initializing Omid.");
                    return null;
                }
                if (interfaceC9334wW1E0 == null) {
                    AbstractC4274eT1.zzj("Omid media type was display but there was no display webview.");
                    return null;
                }
                z2 = true;
                z4 = false;
            } else {
                if (interfaceC9334wW1F0 == null) {
                    AbstractC4274eT1.zzj("Omid media type was video but there was no video webview.");
                    return null;
                }
                z4 = true;
            }
        } else {
            z2 = z3;
        }
        if (z2) {
            str2 = null;
        } else {
            str2 = "javascript";
            interfaceC9334wW1E0 = interfaceC9334wW1F0;
        }
        interfaceC9334wW1E0.j();
        if (!zzt.zzA().b(this.A)) {
            AbstractC4274eT1.zzj("Failed to initialize omid in InternalNativeAd");
            return null;
        }
        zzcaz zzcazVar = this.z;
        String str3 = zzcazVar.C + "." + zzcazVar.D;
        if (z4) {
            enumC2056Qq2 = EnumC2056Qq2.VIDEO;
            enumC2160Rq2 = EnumC2160Rq2.DEFINED_BY_JAVASCRIPT;
        } else {
            C7969re2 c7969re22 = this.j;
            EnumC2056Qq2 enumC2056Qq22 = EnumC2056Qq2.NATIVE_DISPLAY;
            enumC2160Rq2 = c7969re22.P() == 3 ? EnumC2160Rq2.UNSPECIFIED : EnumC2160Rq2.ONE_PIXEL;
            enumC2056Qq2 = enumC2056Qq22;
        }
        AbstractC9841yJ2 abstractC9841yJ2C = zzt.zzA().c(str3, interfaceC9334wW1E0.j(), "", "javascript", str2, str, enumC2160Rq2, enumC2056Qq2, this.b.n0);
        if (abstractC9841yJ2C == null) {
            AbstractC4274eT1.zzj("Failed to create omid session in InternalNativeAd");
            return null;
        }
        this.j.w(abstractC9841yJ2C);
        interfaceC9334wW1E0.e0(abstractC9841yJ2C);
        if (z4) {
            zzt.zzA().g(abstractC9841yJ2C, interfaceC9334wW1F0.h());
            this.w = true;
        }
        if (z) {
            zzt.zzA().d(abstractC9841yJ2C);
            interfaceC9334wW1E0.U("onSdkLoaded", new C2407Ua());
        }
        return abstractC9841yJ2C;
    }

    public final String Q() {
        return this.m.b();
    }

    public final synchronized JSONObject S(View view, Map map, Map map2) {
        return this.k.j(view, map, map2, F());
    }

    public final synchronized JSONObject T(View view, Map map, Map map2) {
        return this.k.n(view, map, map2, F());
    }

    public final void W(View view) {
        AbstractC9841yJ2 abstractC9841yJ2H0 = this.j.h0();
        if (!this.m.d() || abstractC9841yJ2H0 == null || view == null) {
            return;
        }
        zzt.zzA().e(abstractC9841yJ2H0, view);
    }

    public final synchronized void X() {
        this.k.zzh();
    }

    public final /* synthetic */ void Y() {
        this.k.zzi();
        this.j.i();
    }

    public final /* synthetic */ void Z(View view, boolean z, int i) {
        this.k.l(view, this.t.zzf(), this.t.zzl(), this.t.zzm(), z, F(), i);
    }

    @Override // com.daaw.AbstractC4448f42
    public final synchronized void a() {
        this.u = true;
        this.i.execute(new Runnable() { // from class: com.daaw.be2
            @Override // java.lang.Runnable
            public final void run() {
                this.B.Y();
            }
        });
        super.a();
    }

    public final /* synthetic */ void a0(boolean z) {
        this.k.l(null, this.t.zzf(), this.t.zzl(), this.t.zzm(), z, F(), 0);
    }

    @Override // com.daaw.AbstractC4448f42
    public final void b() {
        this.i.execute(new Runnable() { // from class: com.daaw.Yd2
            @Override // java.lang.Runnable
            public final void run() {
                C6575me2.U(this.B);
            }
        });
        if (this.j.P() != 7) {
            Executor executor = this.i;
            final InterfaceC10208ze2 interfaceC10208ze2 = this.k;
            interfaceC10208ze2.getClass();
            executor.execute(new Runnable() { // from class: com.daaw.Zd2
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC10208ze2.zzp();
                }
            });
        }
        super.b();
    }

    public final synchronized void d0(View view, Map map, Map map2, boolean z) {
        if (this.v) {
            return;
        }
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.I1)).booleanValue() && this.b.m0) {
            Iterator it = this.D.keySet().iterator();
            while (it.hasNext()) {
                if (!((Boolean) this.D.get((String) it.next())).booleanValue()) {
                    return;
                }
            }
        }
        if (!z) {
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.I3)).booleanValue() && map != null) {
                Iterator it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    View view2 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                    if (view2 != null && C(view2)) {
                        I(view, map, map2);
                        return;
                    }
                }
            }
            return;
        }
        View viewE = E(map);
        if (viewE == null) {
            I(view, map, map2);
            return;
        }
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.J3)).booleanValue()) {
            if (C(viewE)) {
                I(view, map, map2);
                return;
            }
            return;
        }
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.K3)).booleanValue()) {
            I(view, map, map2);
            return;
        }
        Rect rect = new Rect();
        if (viewE.getGlobalVisibleRect(rect, null) && viewE.getHeight() == rect.height() && viewE.getWidth() == rect.width()) {
            I(view, map, map2);
        }
    }

    public final synchronized void h(zzcw zzcwVar) {
        this.k.m(zzcwVar);
    }

    public final synchronized void i(View view, View view2, Map map, Map map2, boolean z) {
        this.l.c(this.t);
        this.k.g(view, view2, map, map2, z, F());
        if (this.w) {
            C7969re2 c7969re2 = this.j;
            if (c7969re2.f0() != null) {
                c7969re2.f0().U("onSdkAdUserInteractionClick", new C2407Ua());
            }
        }
    }

    public final synchronized void j(final View view, final int i) {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.ya)).booleanValue()) {
            InterfaceViewOnClickListenerC9097vf2 interfaceViewOnClickListenerC9097vf2 = this.t;
            if (interfaceViewOnClickListenerC9097vf2 == null) {
                AbstractC4274eT1.zze("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                final boolean z = interfaceViewOnClickListenerC9097vf2 instanceof ViewTreeObserverOnGlobalLayoutListenerC1882Pe2;
                this.i.execute(new Runnable() { // from class: com.daaw.ae2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.B.Z(view, z, i);
                    }
                });
            }
        }
    }

    public final synchronized void k(String str) {
        this.k.p(str);
    }

    public final synchronized void l(Bundle bundle) {
        this.k.h(bundle);
    }

    public final synchronized void m() {
        InterfaceViewOnClickListenerC9097vf2 interfaceViewOnClickListenerC9097vf2 = this.t;
        if (interfaceViewOnClickListenerC9097vf2 == null) {
            AbstractC4274eT1.zze("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            final boolean z = interfaceViewOnClickListenerC9097vf2 instanceof ViewTreeObserverOnGlobalLayoutListenerC1882Pe2;
            this.i.execute(new Runnable() { // from class: com.daaw.ie2
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.a0(z);
                }
            });
        }
    }

    public final synchronized void n() {
        if (this.v) {
            return;
        }
        this.k.zzr();
    }

    public final void o(View view) {
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.Y4)).booleanValue()) {
            J(view, this.j.h0());
            return;
        }
        BT1 bt1C0 = this.j.c0();
        if (bt1C0 == null) {
            return;
        }
        AbstractC7360pS2.r(bt1C0, new C6296le2(this, view), this.i);
    }

    public final synchronized void p(View view, MotionEvent motionEvent, View view2) {
        this.k.a(view, motionEvent, view2);
    }

    public final synchronized void q(Bundle bundle) {
        this.k.i(bundle);
    }

    public final synchronized void r(View view) {
        this.k.e(view);
    }

    public final synchronized void s() {
        this.k.zzv();
    }

    public final synchronized void t(zzcs zzcsVar) {
        this.k.k(zzcsVar);
    }

    public final synchronized void u(zzdg zzdgVar) {
        this.C.a(zzdgVar);
    }

    public final synchronized void v(InterfaceC8709uH1 interfaceC8709uH1) {
        this.k.o(interfaceC8709uH1);
    }

    public final synchronized void w(final InterfaceViewOnClickListenerC9097vf2 interfaceViewOnClickListenerC9097vf2) {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.G1)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.daaw.Wd2
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.b0(interfaceViewOnClickListenerC9097vf2);
                }
            });
        } else {
            b0(interfaceViewOnClickListenerC9097vf2);
        }
    }

    public final synchronized void x(final InterfaceViewOnClickListenerC9097vf2 interfaceViewOnClickListenerC9097vf2) {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.G1)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.daaw.Xd2
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.c0(interfaceViewOnClickListenerC9097vf2);
                }
            });
        } else {
            c0(interfaceViewOnClickListenerC9097vf2);
        }
    }

    public final boolean y() {
        return this.m.e();
    }

    public final synchronized boolean z() {
        return this.k.zzA();
    }
}
