package com.daaw;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.util.zzbz;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbfc;
import com.google.android.gms.internal.ads.zzcaz;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.Id2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1151Id2 implements InterfaceC10208ze2 {
    public zzcs A;
    public final Context a;
    public final C0522Ce2 b;
    public final JSONObject c;
    public final C6023kh2 d;
    public final C7969re2 e;
    public final C7782qx1 f;
    public final C6715n72 g;
    public final P62 h;
    public final C1766Ob2 i;
    public final C4498fF2 j;
    public final zzcaz k;
    public final FF2 l;
    public final C6690n22 m;
    public final ViewOnClickListenerC2946Ze2 n;
    public final InterfaceC5485im o;
    public final C0831Fb2 p;
    public final C6487mJ2 q;
    public final TI2 r;
    public boolean t;
    public boolean s = false;
    public boolean u = false;
    public boolean v = false;
    public Point w = new Point();
    public Point x = new Point();
    public long y = 0;
    public long z = 0;

    public C1151Id2(Context context, C0522Ce2 c0522Ce2, JSONObject jSONObject, C6023kh2 c6023kh2, C7969re2 c7969re2, C7782qx1 c7782qx1, C6715n72 c6715n72, P62 p62, C1766Ob2 c1766Ob2, C4498fF2 c4498fF2, zzcaz zzcazVar, FF2 ff2, C6690n22 c6690n22, ViewOnClickListenerC2946Ze2 viewOnClickListenerC2946Ze2, InterfaceC5485im interfaceC5485im, C0831Fb2 c0831Fb2, C6487mJ2 c6487mJ2, TI2 ti2) {
        this.a = context;
        this.b = c0522Ce2;
        this.c = jSONObject;
        this.d = c6023kh2;
        this.e = c7969re2;
        this.f = c7782qx1;
        this.g = c6715n72;
        this.h = p62;
        this.i = c1766Ob2;
        this.j = c4498fF2;
        this.k = zzcazVar;
        this.l = ff2;
        this.m = c6690n22;
        this.n = viewOnClickListenerC2946Ze2;
        this.o = interfaceC5485im;
        this.p = c0831Fb2;
        this.q = c6487mJ2;
        this.r = ti2;
    }

    @Override // com.daaw.InterfaceC10208ze2
    public final void a(View view, MotionEvent motionEvent, View view2) {
        this.w = zzbz.zza(motionEvent, view2);
        long jA = this.o.a();
        this.z = jA;
        if (motionEvent.getAction() == 0) {
            this.y = jA;
            this.x = this.w;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        Point point = this.w;
        motionEventObtain.setLocation(point.x, point.y);
        this.f.d(motionEventObtain);
        motionEventObtain.recycle();
    }

    @Override // com.daaw.InterfaceC10208ze2
    public final void b(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.a;
        JSONObject jSONObjectZzd = zzbz.zzd(context, map, map2, view, scaleType);
        JSONObject jSONObjectZzg = zzbz.zzg(context, view);
        JSONObject jSONObjectZzf = zzbz.zzf(view);
        JSONObject jSONObjectZze = zzbz.zze(context, view);
        String strZzh = null;
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.m3)).booleanValue()) {
            try {
                strZzh = this.f.c().zzh(this.a, view, null);
            } catch (Exception unused) {
                AbstractC4274eT1.zzg("Exception getting data.");
            }
        }
        t(jSONObjectZzg, jSONObjectZzd, jSONObjectZzf, jSONObjectZze, strZzh, null, zzbz.zzh(this.a, this.j));
    }

    @Override // com.daaw.InterfaceC10208ze2
    public final void c(View view, Map map) {
        this.w = new Point();
        this.x = new Point();
        if (view != null) {
            this.p.C0(view);
        }
        this.t = false;
    }

    @Override // com.daaw.InterfaceC10208ze2
    public final boolean d(Bundle bundle) {
        if (r("impression_reporting")) {
            return t(null, null, null, null, null, zzay.zzb().n(bundle, null), false);
        }
        AbstractC4274eT1.zzg("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
        return false;
    }

    @Override // com.daaw.InterfaceC10208ze2
    public final void e(View view) {
        if (!this.c.optBoolean("custom_one_point_five_click_enabled", false)) {
            AbstractC4274eT1.zzj("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        ViewOnClickListenerC2946Ze2 viewOnClickListenerC2946Ze2 = this.n;
        if (view == null) {
            return;
        }
        view.setOnClickListener(viewOnClickListenerC2946Ze2);
        view.setClickable(true);
        viewOnClickListenerC2946Ze2.H = new WeakReference(view);
    }

    @Override // com.daaw.InterfaceC10208ze2
    public final void f(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.w = new Point();
        this.x = new Point();
        if (!this.t) {
            this.p.B0(view);
            this.t = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.m.m(this);
        boolean zZzi = zzbz.zzi(this.k.D);
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (view2 != null) {
                    if (zZzi) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            Iterator it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                View view3 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view3 != null) {
                    if (zZzi) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.daaw.InterfaceC10208ze2
    public final void g(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType) {
        Context context = this.a;
        JSONObject jSONObjectZzd = zzbz.zzd(context, map, map2, view2, scaleType);
        JSONObject jSONObjectZzg = zzbz.zzg(context, view2);
        JSONObject jSONObjectZzf = zzbz.zzf(view2);
        JSONObject jSONObjectZze = zzbz.zze(context, view2);
        String strQ = q(view, map);
        x(true == ((Boolean) zzba.zzc().b(AbstractC9820yE1.t3)).booleanValue() ? view2 : view, jSONObjectZzg, jSONObjectZzd, jSONObjectZzf, jSONObjectZze, strQ, zzbz.zzc(strQ, context, this.x, this.w), null, z, false);
    }

    @Override // com.daaw.InterfaceC10208ze2
    public final void h(Bundle bundle) {
        if (bundle == null) {
            AbstractC4274eT1.zze("Click data is null. No click is reported.");
        } else if (!r("click_reporting")) {
            AbstractC4274eT1.zzg("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            x(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, zzay.zzb().n(bundle, null), false, false);
        }
    }

    @Override // com.daaw.InterfaceC10208ze2
    public final void i(Bundle bundle) {
        if (bundle == null) {
            AbstractC4274eT1.zze("Touch event data is null. No touch event is reported.");
            return;
        }
        if (!r("touch_reporting")) {
            AbstractC4274eT1.zzg("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
            return;
        }
        this.f.c().zzl((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
    }

    @Override // com.daaw.InterfaceC10208ze2
    public final JSONObject j(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.a;
        JSONObject jSONObjectZzd = zzbz.zzd(context, map, map2, view, scaleType);
        JSONObject jSONObjectZzg = zzbz.zzg(context, view);
        JSONObject jSONObjectZzf = zzbz.zzf(view);
        JSONObject jSONObjectZze = zzbz.zze(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", jSONObjectZzd);
            jSONObject.put("ad_view_signal", jSONObjectZzg);
            jSONObject.put("scroll_view_signal", jSONObjectZzf);
            jSONObject.put("lock_screen_signal", jSONObjectZze);
            return jSONObject;
        } catch (JSONException e) {
            AbstractC4274eT1.zzh("Unable to create native ad view signals JSON.", e);
            return null;
        }
    }

    @Override // com.daaw.InterfaceC10208ze2
    public final void k(zzcs zzcsVar) {
        this.A = zzcsVar;
    }

    @Override // com.daaw.InterfaceC10208ze2
    public final void l(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i) {
        JSONObject jSONObject;
        boolean z2 = false;
        if (this.c.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.ya)).booleanValue()) {
                z2 = true;
            }
        }
        if (!z2) {
            if (!this.v) {
                AbstractC4274eT1.zze("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            } else if (!s()) {
                AbstractC4274eT1.zze("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        JSONObject jSONObjectZzd = zzbz.zzd(this.a, map, map2, view2, scaleType);
        JSONObject jSONObjectZzg = zzbz.zzg(this.a, view2);
        boolean z3 = z2;
        JSONObject jSONObjectZzf = zzbz.zzf(view2);
        JSONObject jSONObjectZze = zzbz.zze(this.a, view2);
        String strQ = q(view, map);
        JSONObject jSONObjectZzc = zzbz.zzc(strQ, this.a, this.x, this.w);
        if (z3) {
            try {
                JSONObject jSONObject2 = this.c;
                Point point = this.x;
                Point point2 = this.w;
                try {
                    jSONObject = new JSONObject();
                } catch (Exception e) {
                    e = e;
                    jSONObject = null;
                }
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    if (point != null) {
                        jSONObject3.put("x", point.x);
                        jSONObject3.put("y", point.y);
                    }
                    if (point2 != null) {
                        jSONObject4.put("x", point2.x);
                        jSONObject4.put("y", point2.y);
                    }
                    jSONObject.put("start_point", jSONObject3);
                    jSONObject.put("end_point", jSONObject4);
                    jSONObject.put("duration_ms", i);
                } catch (Exception e2) {
                    e = e2;
                    AbstractC4274eT1.zzh("Error occurred while grabbing custom click gesture signals.", e);
                }
                jSONObject2.put("custom_click_gesture_signal", jSONObject);
            } catch (JSONException e3) {
                AbstractC4274eT1.zzh("Error occurred while adding CustomClickGestureSignals to adJson.", e3);
                zzt.zzo().u(e3, "FirstPartyNativeAdCore.performCustomClickGesture");
            }
        }
        x(view2, jSONObjectZzg, jSONObjectZzd, jSONObjectZzf, jSONObjectZze, strQ, jSONObjectZzc, null, z, true);
    }

    @Override // com.daaw.InterfaceC10208ze2
    public final void m(zzcw zzcwVar) {
        try {
            if (this.u) {
                return;
            }
            if (zzcwVar == null) {
                C7969re2 c7969re2 = this.e;
                if (c7969re2.X() != null) {
                    this.u = true;
                    this.q.c(c7969re2.X().zzf(), this.r);
                    zzg();
                    return;
                }
            }
            this.u = true;
            this.q.c(zzcwVar.zzf(), this.r);
            zzg();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.daaw.InterfaceC10208ze2
    public final JSONObject n(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        JSONObject jSONObjectJ = j(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.v && s()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (jSONObjectJ != null) {
                jSONObject.put("nas", jSONObjectJ);
                return jSONObject;
            }
        } catch (JSONException e) {
            AbstractC4274eT1.zzh("Unable to create native click meta data JSON.", e);
        }
        return jSONObject;
    }

    @Override // com.daaw.InterfaceC10208ze2
    public final void o(InterfaceC8709uH1 interfaceC8709uH1) {
        if (this.c.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.n.c(interfaceC8709uH1);
        } else {
            AbstractC4274eT1.zzj("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        }
    }

    @Override // com.daaw.InterfaceC10208ze2
    public final void p(String str) {
        x(null, null, null, null, null, str, null, null, false, false);
    }

    public final String q(View view, Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int iP = this.e.P();
        if (iP == 1) {
            return "1099";
        }
        if (iP == 2) {
            return "2099";
        }
        if (iP != 6) {
            return null;
        }
        return "3099";
    }

    public final boolean r(String str) {
        JSONObject jSONObjectOptJSONObject = this.c.optJSONObject("allow_pub_event_reporting");
        return jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean(str, false);
    }

    public final boolean s() {
        return this.c.optBoolean("allow_custom_click_gesture", false);
    }

    public final boolean t(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z) {
        AbstractC7506py0.e("recordImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.c);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.m3)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z);
            Context context = this.a;
            JSONObject jSONObject7 = new JSONObject();
            zzt.zzp();
            DisplayMetrics displayMetricsZzs = com.google.android.gms.ads.internal.util.zzt.zzs((WindowManager) context.getSystemService("window"));
            AbstractC0735Ed2 abstractC0735Ed2 = null;
            byte b = 0;
            byte b2 = 0;
            try {
                jSONObject7.put("width", zzay.zzb().f(context, displayMetricsZzs.widthPixels));
                jSONObject7.put("height", zzay.zzb().f(context, displayMetricsZzs.heightPixels));
            } catch (JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.l8)).booleanValue()) {
                this.d.i("/clickRecorded", new C0839Fd2(this, abstractC0735Ed2));
            } else {
                this.d.i("/logScionEvent", new C0631Dd2(this, b == true ? 1 : 0));
            }
            this.d.i("/nativeImpression", new C1047Hd2(this, b2 == true ? 1 : 0));
            AbstractC10159zT1.a(this.d.d("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.s) {
                return true;
            }
            this.s = zzt.zzs().zzn(this.a, this.k.B, this.j.E.toString(), this.l.f);
            return true;
        } catch (JSONException e) {
            AbstractC4274eT1.zzh("Unable to create impression JSON.", e);
            return false;
        }
    }

    public final void x(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z, boolean z2) {
        String strZze;
        AbstractC7506py0.e("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.c);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            jSONObject7.put("has_custom_click_handler", this.b.c(this.e.a()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.e.P());
            jSONObject8.put("view_aware_api_used", z);
            zzbfc zzbfcVar = this.l.i;
            jSONObject8.put("custom_mute_requested", zzbfcVar != null && zzbfcVar.H);
            jSONObject8.put("custom_mute_enabled", (this.e.h().isEmpty() || this.e.X() == null) ? false : true);
            if (this.n.a() != null && this.c.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put(DiagnosticsEntry.Event.TIMESTAMP_KEY, this.o.a());
            if (this.v && s()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z2) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            jSONObject8.put("has_custom_click_handler", this.b.c(this.e.a()) != null);
            try {
                JSONObject jSONObjectOptJSONObject = this.c.optJSONObject("tracking_urls_and_actions");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                strZze = this.f.c().zze(this.a, jSONObjectOptJSONObject.optString("click_string"), view);
            } catch (Exception e) {
                AbstractC4274eT1.zzh("Exception obtaining click signals", e);
                strZze = null;
            }
            jSONObject8.put("click_signals", strZze);
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.v4)).booleanValue()) {
                jSONObject8.put("open_chrome_custom_tab", true);
            }
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.p8)).booleanValue() && AbstractC7494pv0.k()) {
                jSONObject8.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.q8)).booleanValue() && AbstractC7494pv0.k()) {
                jSONObject8.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long jA = this.o.a();
            jSONObject9.put("time_from_last_touch_down", jA - this.y);
            jSONObject9.put("time_from_last_touch", jA - this.z);
            jSONObject7.put("touch_signal", jSONObject9);
            AbstractC10159zT1.a(this.d.d("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e2) {
            AbstractC4274eT1.zzh("Unable to create click JSON.", e2);
        }
    }

    @Override // com.daaw.InterfaceC10208ze2
    public final boolean zzA() {
        if (zza() == 0) {
            return true;
        }
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.ya)).booleanValue()) {
            return this.l.i.K;
        }
        return true;
    }

    @Override // com.daaw.InterfaceC10208ze2
    public final boolean zzB() {
        return s();
    }

    @Override // com.daaw.InterfaceC10208ze2
    public final int zza() {
        if (this.l.i == null) {
            return 0;
        }
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.ya)).booleanValue()) {
            return this.l.i.J;
        }
        return 0;
    }

    @Override // com.daaw.InterfaceC10208ze2
    public final void zzg() {
        try {
            zzcs zzcsVar = this.A;
            if (zzcsVar != null) {
                zzcsVar.zze();
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.daaw.InterfaceC10208ze2
    public final void zzh() {
        if (this.c.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.n.b();
        }
    }

    @Override // com.daaw.InterfaceC10208ze2
    public final void zzi() {
        this.d.f();
    }

    @Override // com.daaw.InterfaceC10208ze2
    public final void zzp() {
        AbstractC7506py0.e("recordDownloadedImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.c);
            AbstractC10159zT1.a(this.d.d("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e) {
            AbstractC4274eT1.zzh("", e);
        }
    }

    @Override // com.daaw.InterfaceC10208ze2
    public final void zzr() {
        t(null, null, null, null, null, null, false);
    }

    @Override // com.daaw.InterfaceC10208ze2
    public final void zzv() {
        this.v = true;
    }
}
