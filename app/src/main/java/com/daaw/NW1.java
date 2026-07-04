package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.util.zzac;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcaz;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class NW1 extends FrameLayout implements InterfaceC9334wW1 {
    public final InterfaceC9334wW1 B;
    public final C7088oU1 C;
    public final AtomicBoolean D;

    /* JADX WARN: Multi-variable type inference failed */
    public NW1(InterfaceC9334wW1 interfaceC9334wW1) {
        super(interfaceC9334wW1.getContext());
        this.D = new AtomicBoolean();
        this.B = interfaceC9334wW1;
        this.C = new C7088oU1(interfaceC9334wW1.zzE(), this, this);
        addView((View) interfaceC9334wW1);
    }

    @Override // com.daaw.FU1
    public final void A(int i) {
        this.C.g(i);
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void B(String str, HI1 hi1) {
        this.B.B(str, hi1);
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void C(String str, HI1 hi1) {
        this.B.C(str, hi1);
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void D(boolean z) {
        this.B.D(z);
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void E(ZF1 zf1) {
        this.B.E(zf1);
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void F(boolean z) {
        this.B.F(z);
    }

    @Override // com.daaw.FU1
    public final String G() {
        return this.B.G();
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void H(C8494tX1 c8494tX1) {
        this.B.H(c8494tX1);
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final boolean J(boolean z, int i) {
        if (!this.D.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.K0)).booleanValue()) {
            return false;
        }
        if (this.B.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.B.getParent()).removeView((View) this.B);
        }
        this.B.J(z, i);
        return true;
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void L(zzl zzlVar) {
        this.B.L(zzlVar);
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final boolean M() {
        return this.B.M();
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void N() {
        TextView textView = new TextView(getContext());
        zzt.zzp();
        textView.setText(com.google.android.gms.ads.internal.util.zzt.zzx());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    @Override // com.daaw.FU1
    public final void P(int i) {
        this.B.P(i);
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void Q(boolean z) {
        this.B.Q(z);
    }

    @Override // com.daaw.InterfaceC5696jX1
    public final void R(String str, String str2, int i) {
        this.B.R(str, str2, 14);
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void S() {
        this.B.S();
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void T(boolean z) {
        this.B.T(z);
    }

    @Override // com.daaw.InterfaceC7327pK1
    public final void U(String str, Map map) {
        this.B.U(str, map);
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void W(Context context) {
        this.B.W(context);
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void X(int i) {
        this.B.X(i);
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void Z() {
        this.B.Z();
    }

    @Override // com.daaw.CK1, com.daaw.InterfaceC7884rK1
    public final void a(String str, String str2) {
        this.B.a("window.inspectorInfo", str2);
    }

    @Override // com.daaw.InterfaceC5696jX1
    public final void a0(zzc zzcVar, boolean z) {
        this.B.a0(zzcVar, z);
    }

    @Override // com.daaw.InterfaceC9334wW1, com.daaw.InterfaceC5133hW1
    public final C4498fF2 b() {
        return this.B.b();
    }

    @Override // com.daaw.InterfaceC9191vz1
    public final void b0(C8912uz1 c8912uz1) {
        this.B.b0(c8912uz1);
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final zzl c() {
        return this.B.c();
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final String c0() {
        return this.B.c0();
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final boolean canGoBack() {
        return this.B.canGoBack();
    }

    @Override // com.daaw.FU1
    public final void d() {
        this.B.d();
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void d0(C4498fF2 c4498fF2, C5622jF2 c5622jF2) {
        this.B.d0(c4498fF2, c5622jF2);
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void destroy() {
        final AbstractC9841yJ2 abstractC9841yJ2ZzQ = zzQ();
        if (abstractC9841yJ2ZzQ == null) {
            this.B.destroy();
            return;
        }
        HandlerC8451tM2 handlerC8451tM2 = com.google.android.gms.ads.internal.util.zzt.zza;
        handlerC8451tM2.post(new Runnable() { // from class: com.daaw.LW1
            @Override // java.lang.Runnable
            public final void run() {
                zzt.zzA().f(abstractC9841yJ2ZzQ);
            }
        });
        final InterfaceC9334wW1 interfaceC9334wW1 = this.B;
        interfaceC9334wW1.getClass();
        handlerC8451tM2.postDelayed(new Runnable() { // from class: com.daaw.MW1
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC9334wW1.destroy();
            }
        }, ((Integer) zzba.zzc().b(AbstractC9820yE1.T4)).intValue());
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void e0(AbstractC9841yJ2 abstractC9841yJ2) {
        this.B.e0(abstractC9841yJ2);
    }

    @Override // com.daaw.InterfaceC9334wW1, com.daaw.InterfaceC6542mX1
    public final C7782qx1 f() {
        return this.B.f();
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void f0(boolean z) {
        this.B.f0(z);
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final InterfaceC8967vA1 g() {
        return this.B.g();
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void goBack() {
        this.B.goBack();
    }

    @Override // com.daaw.InterfaceC5696jX1
    public final void h0(boolean z, int i, String str, String str2, boolean z2) {
        this.B.h0(z, i, str, str2, z2);
    }

    @Override // com.daaw.InterfaceC9334wW1, com.daaw.FU1
    public final void i(String str, AbstractC9330wV1 abstractC9330wV1) {
        this.B.i(str, abstractC9330wV1);
    }

    @Override // com.daaw.InterfaceC1974Qb2
    public final void i0() {
        InterfaceC9334wW1 interfaceC9334wW1 = this.B;
        if (interfaceC9334wW1 != null) {
            interfaceC9334wW1.i0();
        }
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final WebView j() {
        return (WebView) this.B;
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void j0() {
        setBackgroundColor(0);
        this.B.setBackgroundColor(0);
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final zzl k() {
        return this.B.k();
    }

    @Override // com.daaw.FU1
    public final String k0() {
        return this.B.k0();
    }

    @Override // com.daaw.InterfaceC7327pK1, com.daaw.InterfaceC7884rK1
    public final void l(String str, JSONObject jSONObject) {
        this.B.l(str, jSONObject);
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void l0(zzl zzlVar) {
        this.B.l0(zzlVar);
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void loadData(String str, String str2, String str3) {
        this.B.loadData(str, "text/html", str3);
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.B.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void loadUrl(String str) {
        this.B.loadUrl(str);
    }

    @Override // com.daaw.FU1
    public final AbstractC9330wV1 m(String str) {
        return this.B.m(str);
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final InterfaceC4790gG1 n() {
        return this.B.n();
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void n0(String str, String str2, String str3) {
        this.B.n0(str, str2, null);
    }

    @Override // com.daaw.InterfaceC5696jX1
    public final void o(boolean z, int i, String str, boolean z2, boolean z3) {
        this.B.o(z, i, str, z2, z3);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        InterfaceC9334wW1 interfaceC9334wW1 = this.B;
        if (interfaceC9334wW1 != null) {
            interfaceC9334wW1.onAdClicked();
        }
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void onPause() {
        this.C.f();
        this.B.onPause();
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void onResume() {
        this.B.onResume();
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final boolean p() {
        return this.B.p();
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void p0(InterfaceC8967vA1 interfaceC8967vA1) {
        this.B.p0(interfaceC8967vA1);
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final boolean q() {
        return this.B.q();
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void q0() {
        this.B.q0();
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void r0(boolean z) {
        this.B.r0(z);
    }

    @Override // com.daaw.InterfaceC9334wW1, com.daaw.FU1
    public final void s(UW1 uw1) {
        this.B.s(uw1);
    }

    @Override // android.view.View, com.daaw.InterfaceC9334wW1
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.B.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.daaw.InterfaceC9334wW1
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.B.setOnTouchListener(onTouchListener);
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.B.setWebChromeClient(webChromeClient);
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.B.setWebViewClient(webViewClient);
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void u() {
        this.C.e();
        this.B.u();
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void u0(String str, InterfaceC2920Yy0 interfaceC2920Yy0) {
        this.B.u0(str, interfaceC2920Yy0);
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final boolean v() {
        return this.B.v();
    }

    @Override // com.daaw.InterfaceC5696jX1
    public final void v0(boolean z, int i, boolean z2) {
        this.B.v0(z, i, z2);
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final boolean w() {
        return this.B.w();
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final boolean x() {
        return this.D.get();
    }

    @Override // com.daaw.FU1
    public final void x0(boolean z, long j) {
        this.B.x0(z, j);
    }

    @Override // com.daaw.CK1
    public final void y0(String str, JSONObject jSONObject) {
        ((RW1) this.B).a(str, jSONObject.toString());
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void z(InterfaceC4790gG1 interfaceC4790gG1) {
        this.B.z(interfaceC4790gG1);
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void z0(int i) {
        this.B.z0(i);
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final Context zzE() {
        return this.B.zzE();
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final WebViewClient zzH() {
        return this.B.zzH();
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final InterfaceC7936rX1 zzN() {
        return ((RW1) this.B).B0();
    }

    @Override // com.daaw.InterfaceC9334wW1, com.daaw.InterfaceC6263lX1
    public final C8494tX1 zzO() {
        return this.B.zzO();
    }

    @Override // com.daaw.InterfaceC9334wW1, com.daaw.VW1
    public final C5622jF2 zzP() {
        return this.B.zzP();
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final AbstractC9841yJ2 zzQ() {
        return this.B.zzQ();
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final InterfaceFutureC8236sc0 zzR() {
        return this.B.zzR();
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void zzX() {
        this.B.zzX();
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void zzY() {
        HashMap map = new HashMap(3);
        map.put("app_muted", String.valueOf(zzt.zzr().zze()));
        map.put("app_volume", String.valueOf(zzt.zzr().zza()));
        RW1 rw1 = (RW1) this.B;
        map.put("device_volume", String.valueOf(zzac.zzb(rw1.getContext())));
        rw1.U("volume", map);
    }

    @Override // com.daaw.CK1, com.daaw.InterfaceC7884rK1
    public final void zza(String str) {
        ((RW1) this.B).G0(str);
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final void zzbj() {
        this.B.zzbj();
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final void zzbk() {
        this.B.zzbk();
    }

    @Override // com.daaw.FU1
    public final int zzf() {
        return this.B.zzf();
    }

    @Override // com.daaw.FU1
    public final int zzg() {
        return ((Boolean) zzba.zzc().b(AbstractC9820yE1.H3)).booleanValue() ? this.B.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // com.daaw.FU1
    public final int zzh() {
        return ((Boolean) zzba.zzc().b(AbstractC9820yE1.H3)).booleanValue() ? this.B.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // com.daaw.InterfaceC9334wW1, com.daaw.InterfaceC4579fX1, com.daaw.FU1
    public final Activity zzi() {
        return this.B.zzi();
    }

    @Override // com.daaw.InterfaceC9334wW1, com.daaw.FU1
    public final zza zzj() {
        return this.B.zzj();
    }

    @Override // com.daaw.FU1
    public final NE1 zzk() {
        return this.B.zzk();
    }

    @Override // com.daaw.InterfaceC9334wW1, com.daaw.FU1
    public final OE1 zzm() {
        return this.B.zzm();
    }

    @Override // com.daaw.InterfaceC9334wW1, com.daaw.InterfaceC6821nX1, com.daaw.FU1
    public final zzcaz zzn() {
        return this.B.zzn();
    }

    @Override // com.daaw.FU1
    public final C7088oU1 zzo() {
        return this.C;
    }

    @Override // com.daaw.InterfaceC9334wW1, com.daaw.FU1
    public final UW1 zzq() {
        return this.B.zzq();
    }

    @Override // com.daaw.InterfaceC1974Qb2
    public final void zzs() {
        InterfaceC9334wW1 interfaceC9334wW1 = this.B;
        if (interfaceC9334wW1 != null) {
            interfaceC9334wW1.zzs();
        }
    }

    @Override // com.daaw.FU1
    public final void zzu() {
        this.B.zzu();
    }

    @Override // com.daaw.FU1
    public final void zzz(boolean z) {
        this.B.zzz(false);
    }

    @Override // com.daaw.InterfaceC9334wW1, com.daaw.InterfaceC7100oX1
    public final View h() {
        return this;
    }

    @Override // com.daaw.FU1
    public final void t0(int i) {
    }

    @Override // com.daaw.FU1
    public final void w0(int i) {
    }
}
