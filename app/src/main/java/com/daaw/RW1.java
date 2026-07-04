package com.daaw;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.daaw.AbstractC9820yE1;
import com.daaw.HandlerC8451tM2;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.zzch;
import com.google.android.gms.ads.internal.util.zzck;
import com.google.android.gms.ads.internal.util.zzco;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcaz;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class RW1 extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, InterfaceC9334wW1 {
    public static final /* synthetic */ int z0 = 0;
    public final C8215sX1 B;
    public final C7782qx1 C;
    public final C4497fF1 D;
    public final zzcaz E;
    public zzl F;
    public final zza G;
    public final DisplayMetrics H;
    public final float I;
    public C4498fF2 J;
    public C5622jF2 K;
    public boolean L;
    public boolean M;
    public FW1 N;
    public com.google.android.gms.ads.internal.overlay.zzl O;
    public AbstractC9841yJ2 P;
    public C8494tX1 Q;
    public final String R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public Boolean W;
    public boolean a0;
    public final String b0;
    public UW1 c0;
    public boolean d0;
    public boolean e0;
    public InterfaceC4790gG1 f0;
    public ZF1 g0;
    public InterfaceC8967vA1 h0;
    public int i0;
    public int j0;
    public NE1 k0;
    public final NE1 l0;
    public NE1 m0;
    public final OE1 n0;
    public int o0;
    public com.google.android.gms.ads.internal.overlay.zzl p0;
    public boolean q0;
    public final zzco r0;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public Map w0;
    public final WindowManager x0;
    public final C6454mB1 y0;

    public RW1(C8215sX1 c8215sX1, C8494tX1 c8494tX1, String str, boolean z, boolean z2, C7782qx1 c7782qx1, C4497fF1 c4497fF1, zzcaz zzcazVar, VE1 ve1, zzl zzlVar, zza zzaVar, C6454mB1 c6454mB1, C4498fF2 c4498fF2, C5622jF2 c5622jF2) {
        C5622jF2 c5622jF22;
        super(c8215sX1);
        this.L = false;
        this.M = false;
        this.a0 = true;
        this.b0 = "";
        this.s0 = -1;
        this.t0 = -1;
        this.u0 = -1;
        this.v0 = -1;
        this.B = c8215sX1;
        this.Q = c8494tX1;
        this.R = str;
        this.U = z;
        this.C = c7782qx1;
        this.D = c4497fF1;
        this.E = zzcazVar;
        this.F = zzlVar;
        this.G = zzaVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.x0 = windowManager;
        zzt.zzp();
        DisplayMetrics displayMetricsZzs = com.google.android.gms.ads.internal.util.zzt.zzs(windowManager);
        this.H = displayMetricsZzs;
        this.I = displayMetricsZzs.density;
        this.y0 = c6454mB1;
        this.J = c4498fF2;
        this.K = c5622jF2;
        this.r0 = new zzco(c8215sX1.a(), this, this, null);
        setBackgroundColor(0);
        final WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            AbstractC4274eT1.zzh("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.Da)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        settings.setUserAgentString(zzt.zzp().zzc(c8215sX1, zzcazVar.B));
        zzt.zzp();
        final Context context = getContext();
        zzch.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                HandlerC8451tM2 handlerC8451tM2 = zzt.zza;
                String absolutePath = context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath();
                WebSettings webSettings = settings;
                webSettings.setDatabasePath(absolutePath);
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(AbstractC9820yE1.J0)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return Boolean.TRUE;
            }
        });
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        K0();
        addJavascriptInterface(new C4290eX1(this, new C4012dX1(this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        S0();
        OE1 oe1 = new OE1(new VE1(true, "make_wv", this.R));
        this.n0 = oe1;
        oe1.a().c(null);
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.O1)).booleanValue() && (c5622jF22 = this.K) != null && c5622jF22.b != null) {
            oe1.a().d("gqi", this.K.b);
        }
        oe1.a();
        NE1 ne1F = VE1.f();
        this.l0 = ne1F;
        oe1.b("native:view_create", ne1F);
        this.m0 = null;
        this.k0 = null;
        zzck.zza().zzb(c8215sX1);
        zzt.zzo().r();
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void B(String str, HI1 hi1) {
        FW1 fw1 = this.N;
        if (fw1 != null) {
            fw1.d(str, hi1);
        }
    }

    public final FW1 B0() {
        return this.N;
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void C(String str, HI1 hi1) {
        FW1 fw1 = this.N;
        if (fw1 != null) {
            fw1.E0(str, hi1);
        }
    }

    public final synchronized Boolean C0() {
        return this.W;
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final synchronized void D(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.O;
        if (zzlVar != null) {
            zzlVar.zzy(this.N.n(), z);
        } else {
            this.S = z;
        }
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final synchronized void E(ZF1 zf1) {
        this.g0 = zf1;
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final synchronized void F(boolean z) {
        if (z) {
            try {
                setBackgroundColor(0);
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.O;
        if (zzlVar != null) {
            zzlVar.zzB(z);
        }
    }

    public final synchronized void F0(String str, ValueCallback valueCallback) {
        if (q()) {
            AbstractC4274eT1.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            evaluateJavascript(str, null);
        }
    }

    @Override // com.daaw.FU1
    public final synchronized String G() {
        C5622jF2 c5622jF2 = this.K;
        if (c5622jF2 == null) {
            return null;
        }
        return c5622jF2.b;
    }

    public final void G0(String str) {
        if (!AbstractC7494pv0.d()) {
            H0("javascript:".concat(str));
            return;
        }
        if (C0() == null) {
            T0();
        }
        if (C0().booleanValue()) {
            F0(str, null);
        } else {
            H0("javascript:".concat(str));
        }
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final synchronized void H(C8494tX1 c8494tX1) {
        this.Q = c8494tX1;
        requestLayout();
    }

    public final synchronized void H0(String str) {
        if (q()) {
            AbstractC4274eT1.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            loadUrl(str);
        }
    }

    public final void I0(Boolean bool) {
        synchronized (this) {
            this.W = bool;
        }
        zzt.zzo().v(bool);
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final boolean J(final boolean z, final int i) {
        destroy();
        this.y0.b(new InterfaceC6175lB1() { // from class: com.daaw.OW1
            @Override // com.daaw.InterfaceC6175lB1
            public final void a(C5891kC1 c5891kC1) {
                int i2 = RW1.z0;
                C3100aE1 c3100aE1M = C3379bE1.M();
                boolean zP = c3100aE1M.p();
                boolean z2 = z;
                if (zP != z2) {
                    c3100aE1M.n(z2);
                }
                c3100aE1M.o(i);
                c5891kC1.y((C3379bE1) c3100aE1M.j());
            }
        });
        this.y0.c(10003);
        return true;
    }

    public final boolean J0() {
        int i;
        int iZ;
        if (!this.N.n() && !this.N.m()) {
            return false;
        }
        zzay.zzb();
        DisplayMetrics displayMetrics = this.H;
        int iZ2 = XS1.z(displayMetrics, displayMetrics.widthPixels);
        zzay.zzb();
        DisplayMetrics displayMetrics2 = this.H;
        int iZ3 = XS1.z(displayMetrics2, displayMetrics2.heightPixels);
        Activity activityA = this.B.a();
        if (activityA == null || activityA.getWindow() == null) {
            i = iZ2;
            iZ = iZ3;
        } else {
            zzt.zzp();
            int[] iArrZzP = com.google.android.gms.ads.internal.util.zzt.zzP(activityA);
            zzay.zzb();
            int iZ4 = XS1.z(this.H, iArrZzP[0]);
            zzay.zzb();
            iZ = XS1.z(this.H, iArrZzP[1]);
            i = iZ4;
        }
        int i2 = this.t0;
        if (i2 == iZ2 && this.s0 == iZ3 && this.u0 == i && this.v0 == iZ) {
            return false;
        }
        boolean z = (i2 == iZ2 && this.s0 == iZ3) ? false : true;
        this.t0 = iZ2;
        this.s0 = iZ3;
        this.u0 = i;
        this.v0 = iZ;
        new GN1(this, "").e(iZ2, iZ3, i, iZ, this.H.density, this.x0.getDefaultDisplay().getRotation());
        return z;
    }

    public final synchronized void K0() {
        C4498fF2 c4498fF2 = this.J;
        if (c4498fF2 != null && c4498fF2.o0) {
            AbstractC4274eT1.zze("Disabling hardware acceleration on an overlay.");
            M0();
            return;
        }
        if (!this.U && !this.Q.i()) {
            AbstractC4274eT1.zze("Enabling hardware acceleration on an AdView.");
            O0();
            return;
        }
        AbstractC4274eT1.zze("Enabling hardware acceleration on an overlay.");
        O0();
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final synchronized void L(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.O = zzlVar;
    }

    public final synchronized void L0() {
        if (this.q0) {
            return;
        }
        this.q0 = true;
        zzt.zzo().q();
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final synchronized boolean M() {
        return this.a0;
    }

    public final synchronized void M0() {
        try {
            if (!this.V) {
                setLayerType(1, null);
            }
            this.V = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void N() {
        throw null;
    }

    public final void N0(boolean z) {
        HashMap map = new HashMap();
        map.put("isVisible", true != z ? "0" : "1");
        U("onAdVisibilityChanged", map);
    }

    public final synchronized void O0() {
        try {
            if (this.V) {
                setLayerType(0, null);
            }
            this.V = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.daaw.FU1
    public final synchronized void P(int i) {
        this.o0 = i;
    }

    public final synchronized void P0(String str) {
        try {
            super.loadUrl("about:blank");
        } catch (Throwable th) {
            zzt.zzo().u(th, "AdWebViewImpl.loadUrlUnsafe");
            AbstractC4274eT1.zzk("Could not call loadUrl in destroy(). ", th);
        }
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void Q(boolean z) {
        this.N.t0(z);
    }

    public final void Q0() {
        IE1.a(this.n0.a(), this.l0, "aeh2");
    }

    @Override // com.daaw.InterfaceC5696jX1
    public final void R(String str, String str2, int i) {
        this.N.y0(str, str2, 14);
    }

    public final synchronized void R0() {
        try {
            Map map = this.w0;
            if (map != null) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((AbstractC9330wV1) it.next()).i();
                }
            }
            this.w0 = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void S() {
        Q0();
        HashMap map = new HashMap(1);
        map.put("version", this.E.B);
        U("onhide", map);
    }

    public final void S0() {
        OE1 oe1 = this.n0;
        if (oe1 == null) {
            return;
        }
        VE1 ve1A = oe1.a();
        GE1 ge1F = zzt.zzo().f();
        if (ge1F != null) {
            ge1F.f(ve1A);
        }
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final synchronized void T(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar;
        int i = this.i0 + (true != z ? -1 : 1);
        this.i0 = i;
        if (i > 0 || (zzlVar = this.O) == null) {
            return;
        }
        zzlVar.zzE();
    }

    public final synchronized void T0() {
        Boolean boolK = zzt.zzo().k();
        this.W = boolK;
        if (boolK == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                I0(Boolean.TRUE);
            } catch (IllegalStateException unused) {
                I0(Boolean.FALSE);
            }
        }
    }

    @Override // com.daaw.InterfaceC7327pK1
    public final void U(String str, Map map) {
        try {
            l(str, zzay.zzb().m(map));
        } catch (JSONException unused) {
            AbstractC4274eT1.zzj("Could not convert parameters to JSON.");
        }
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void W(Context context) {
        this.B.setBaseContext(context);
        this.r0.zze(this.B.a());
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final synchronized void X(int i) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.O;
        if (zzlVar != null) {
            zzlVar.zzA(i);
        }
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void Z() {
        if (this.m0 == null) {
            this.n0.a();
            NE1 ne1F = VE1.f();
            this.m0 = ne1F;
            this.n0.b("native:view_load", ne1F);
        }
    }

    @Override // com.daaw.CK1, com.daaw.InterfaceC7884rK1
    public final void a(String str, String str2) {
        G0(str + "(" + str2 + ");");
    }

    @Override // com.daaw.InterfaceC5696jX1
    public final void a0(zzc zzcVar, boolean z) {
        this.N.x0(zzcVar, z);
    }

    @Override // com.daaw.InterfaceC9334wW1, com.daaw.InterfaceC5133hW1
    public final C4498fF2 b() {
        return this.J;
    }

    @Override // com.daaw.InterfaceC9191vz1
    public final void b0(C8912uz1 c8912uz1) {
        boolean z;
        synchronized (this) {
            z = c8912uz1.j;
            this.d0 = z;
        }
        N0(z);
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final synchronized com.google.android.gms.ads.internal.overlay.zzl c() {
        return this.O;
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final synchronized String c0() {
        return this.R;
    }

    @Override // com.daaw.FU1
    public final synchronized void d() {
        ZF1 zf1 = this.g0;
        if (zf1 != null) {
            final ViewTreeObserverOnGlobalLayoutListenerC1059Hg2 viewTreeObserverOnGlobalLayoutListenerC1059Hg2 = (ViewTreeObserverOnGlobalLayoutListenerC1059Hg2) zf1;
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.daaw.Fg2
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        viewTreeObserverOnGlobalLayoutListenerC1059Hg2.zzd();
                    } catch (RemoteException e) {
                        AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
                    }
                }
            });
        }
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void d0(C4498fF2 c4498fF2, C5622jF2 c5622jF2) {
        this.J = c4498fF2;
        this.K = c5622jF2;
    }

    @Override // android.webkit.WebView, com.daaw.InterfaceC9334wW1
    public final synchronized void destroy() {
        try {
            S0();
            this.r0.zza();
            com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.O;
            if (zzlVar != null) {
                zzlVar.zzb();
                this.O.zzm();
                this.O = null;
            }
            this.P = null;
            this.N.k0();
            this.h0 = null;
            this.F = null;
            setOnClickListener(null);
            setOnTouchListener(null);
            if (this.T) {
                return;
            }
            zzt.zzy().q(this);
            R0();
            this.T = true;
            if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.V9)).booleanValue()) {
                zze.zza("Destroying the WebView immediately...");
                u();
            } else {
                zze.zza("Initiating WebView self destruct sequence in 3...");
                zze.zza("Loading blank page in WebView, 2...");
                P0("about:blank");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final synchronized void e0(AbstractC9841yJ2 abstractC9841yJ2) {
        this.P = abstractC9841yJ2;
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(String str, ValueCallback valueCallback) {
        if (!q()) {
            super.evaluateJavascript(str, valueCallback);
            return;
        }
        AbstractC4274eT1.zzl("#004 The webview is destroyed. Ignoring action.", null);
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
    }

    @Override // com.daaw.InterfaceC9334wW1, com.daaw.InterfaceC6542mX1
    public final C7782qx1 f() {
        return this.C;
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final synchronized void f0(boolean z) {
        this.a0 = z;
    }

    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                try {
                    if (!this.T) {
                        this.N.k0();
                        zzt.zzy().q(this);
                        R0();
                        L0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final synchronized InterfaceC8967vA1 g() {
        return this.h0;
    }

    @Override // com.daaw.InterfaceC5696jX1
    public final void h0(boolean z, int i, String str, String str2, boolean z2) {
        this.N.C0(z, i, str, str2, z2);
    }

    @Override // com.daaw.InterfaceC9334wW1, com.daaw.FU1
    public final synchronized void i(String str, AbstractC9330wV1 abstractC9330wV1) {
        try {
            if (this.w0 == null) {
                this.w0 = new HashMap();
            }
            this.w0.put(str, abstractC9330wV1);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.daaw.InterfaceC1974Qb2
    public final void i0() {
        FW1 fw1 = this.N;
        if (fw1 != null) {
            fw1.i0();
        }
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void j0() {
        setBackgroundColor(0);
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final synchronized com.google.android.gms.ads.internal.overlay.zzl k() {
        return this.p0;
    }

    @Override // com.daaw.FU1
    public final synchronized String k0() {
        return this.b0;
    }

    @Override // com.daaw.InterfaceC7327pK1, com.daaw.InterfaceC7884rK1
    public final void l(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(string);
        sb.append(");");
        AbstractC4274eT1.zze("Dispatching AFMA event: ".concat(sb.toString()));
        G0(sb.toString());
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final synchronized void l0(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.p0 = zzlVar;
    }

    @Override // android.webkit.WebView, com.daaw.InterfaceC9334wW1
    public final synchronized void loadData(String str, String str2, String str3) {
        if (q()) {
            AbstractC4274eT1.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, com.daaw.InterfaceC9334wW1
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) throws Throwable {
        try {
            try {
                if (q()) {
                    AbstractC4274eT1.zzj("#004 The webview is destroyed. Ignoring action.");
                    return;
                } else {
                    super.loadDataWithBaseURL(str, str2, str3, str4, str5);
                    return;
                }
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        throw th;
    }

    @Override // android.webkit.WebView, com.daaw.InterfaceC9334wW1
    public final synchronized void loadUrl(String str) {
        if (q()) {
            AbstractC4274eT1.zzj("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            super.loadUrl(str);
        } catch (Throwable th) {
            zzt.zzo().u(th, "AdWebViewImpl.loadUrl");
            AbstractC4274eT1.zzk("Could not call loadUrl. ", th);
        }
    }

    @Override // com.daaw.FU1
    public final synchronized AbstractC9330wV1 m(String str) {
        Map map = this.w0;
        if (map == null) {
            return null;
        }
        return (AbstractC9330wV1) map.get(str);
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final synchronized InterfaceC4790gG1 n() {
        return this.f0;
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final synchronized void n0(String str, String str2, String str3) throws Throwable {
        Throwable th;
        String str4;
        try {
            try {
                if (q()) {
                    AbstractC4274eT1.zzj("#004 The webview is destroyed. Ignoring action.");
                    return;
                }
                String str5 = (String) zzba.zzc().b(AbstractC9820yE1.P);
                JSONObject jSONObject = new JSONObject();
                try {
                    try {
                        jSONObject.put("version", str5);
                        jSONObject.put("sdk", "Google Mobile Ads");
                        jSONObject.put("sdkVersion", "12.4.51-000");
                        str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                    } catch (JSONException e) {
                        AbstractC4274eT1.zzk("Unable to build MRAID_ENV", e);
                        str4 = null;
                    }
                    super.loadDataWithBaseURL(str, AbstractC5975kX1.a(str2, str4), "text/html", "UTF-8", null);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
        throw th;
    }

    @Override // com.daaw.InterfaceC5696jX1
    public final void o(boolean z, int i, String str, boolean z2, boolean z3) {
        this.N.D0(z, i, str, z2, z3);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        FW1 fw1 = this.N;
        if (fw1 != null) {
            fw1.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final synchronized void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            if (!q()) {
                this.r0.zzc();
            }
            boolean z = this.d0;
            FW1 fw1 = this.N;
            if (fw1 != null && fw1.m()) {
                if (!this.e0) {
                    this.N.U();
                    this.N.V();
                    this.e0 = true;
                }
                J0();
                z = true;
            }
            N0(z);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        FW1 fw1;
        synchronized (this) {
            try {
                if (!q()) {
                    this.r0.zzd();
                }
                super.onDetachedFromWindow();
                if (this.e0 && (fw1 = this.N) != null && fw1.m() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                    this.N.U();
                    this.N.V();
                    this.e0 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        N0(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.fa)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            zzt.zzp();
            com.google.android.gms.ads.internal.util.zzt.zzS(getContext(), intent);
        } catch (ActivityNotFoundException e) {
            AbstractC4274eT1.zze("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
            zzt.zzo().u(e, "AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (q()) {
            return;
        }
        if (Build.VERSION.SDK_INT == 21 && canvas.isHardwareAccelerated() && !isAttachedToWindow()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zJ0 = J0();
        com.google.android.gms.ads.internal.overlay.zzl zzlVarC = c();
        if (zzlVarC == null || !zJ0) {
            return;
        }
        zzlVarC.zzn();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void onMeasure(int r9, int r10) {
        /*
            Method dump skipped, instruction units count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.RW1.onMeasure(int, int):void");
    }

    @Override // android.webkit.WebView, com.daaw.InterfaceC9334wW1
    public final void onPause() {
        if (q()) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception e) {
            AbstractC4274eT1.zzh("Could not pause webview.", e);
        }
    }

    @Override // android.webkit.WebView, com.daaw.InterfaceC9334wW1
    public final void onResume() {
        if (q()) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception e) {
            AbstractC4274eT1.zzh("Could not resume webview.", e);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.N.m() || this.N.l()) {
            C7782qx1 c7782qx1 = this.C;
            if (c7782qx1 != null) {
                c7782qx1.d(motionEvent);
            }
            C4497fF1 c4497fF1 = this.D;
            if (c4497fF1 != null) {
                c4497fF1.b(motionEvent);
            }
        } else {
            synchronized (this) {
                try {
                    InterfaceC4790gG1 interfaceC4790gG1 = this.f0;
                    if (interfaceC4790gG1 != null) {
                        interfaceC4790gG1.a(motionEvent);
                    }
                } finally {
                }
            }
        }
        if (q()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final synchronized boolean p() {
        return this.i0 > 0;
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final synchronized void p0(InterfaceC8967vA1 interfaceC8967vA1) {
        this.h0 = interfaceC8967vA1;
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final synchronized boolean q() {
        return this.T;
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void q0() {
        this.r0.zzb();
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final synchronized void r0(boolean z) {
        try {
            boolean z2 = this.U;
            this.U = z;
            K0();
            if (z != z2) {
                if (((Boolean) zzba.zzc().b(AbstractC9820yE1.Q)).booleanValue()) {
                    if (!this.Q.i()) {
                    }
                }
                new GN1(this, "").g(true != z ? "default" : "expanded");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.daaw.InterfaceC9334wW1, com.daaw.FU1
    public final synchronized void s(UW1 uw1) {
        if (this.c0 != null) {
            AbstractC4274eT1.zzg("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.c0 = uw1;
        }
    }

    @Override // android.webkit.WebView, com.daaw.InterfaceC9334wW1
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof FW1) {
            this.N = (FW1) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (q()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e) {
            AbstractC4274eT1.zzh("Could not stop loading webview.", e);
        }
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final synchronized void u() {
        zze.zza("Destroying WebView!");
        L0();
        com.google.android.gms.ads.internal.util.zzt.zza.post(new QW1(this));
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void u0(String str, InterfaceC2920Yy0 interfaceC2920Yy0) {
        FW1 fw1 = this.N;
        if (fw1 != null) {
            fw1.e(str, interfaceC2920Yy0);
        }
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final synchronized boolean v() {
        return this.S;
    }

    @Override // com.daaw.InterfaceC5696jX1
    public final void v0(boolean z, int i, boolean z2) {
        this.N.A0(z, i, z2);
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final synchronized boolean w() {
        return this.U;
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final boolean x() {
        return false;
    }

    @Override // com.daaw.FU1
    public final void x0(boolean z, long j) {
        HashMap map = new HashMap(2);
        map.put("success", true != z ? "0" : "1");
        map.put("duration", Long.toString(j));
        U("onCacheAccessComplete", map);
    }

    @Override // com.daaw.CK1
    public final void y0(String str, JSONObject jSONObject) {
        a(str, jSONObject.toString());
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final synchronized void z(InterfaceC4790gG1 interfaceC4790gG1) {
        this.f0 = interfaceC4790gG1;
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void z0(int i) {
        if (i == 0) {
            OE1 oe1 = this.n0;
            IE1.a(oe1.a(), this.l0, "aebb2");
        }
        Q0();
        this.n0.a();
        this.n0.a().d("close_type", String.valueOf(i));
        HashMap map = new HashMap(2);
        map.put("closetype", String.valueOf(i));
        map.put("version", this.E.B);
        U("onhide", map);
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final Context zzE() {
        return this.B.b();
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final WebViewClient zzH() {
        return this.N;
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final /* synthetic */ InterfaceC7936rX1 zzN() {
        return this.N;
    }

    @Override // com.daaw.InterfaceC9334wW1, com.daaw.InterfaceC6263lX1
    public final synchronized C8494tX1 zzO() {
        return this.Q;
    }

    @Override // com.daaw.InterfaceC9334wW1, com.daaw.VW1
    public final C5622jF2 zzP() {
        return this.K;
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final synchronized AbstractC9841yJ2 zzQ() {
        return this.P;
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final InterfaceFutureC8236sc0 zzR() {
        C4497fF1 c4497fF1 = this.D;
        return c4497fF1 == null ? AbstractC7360pS2.h(null) : c4497fF1.a();
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void zzX() {
        if (this.k0 == null) {
            OE1 oe1 = this.n0;
            IE1.a(oe1.a(), this.l0, "aes2");
            this.n0.a();
            NE1 ne1F = VE1.f();
            this.k0 = ne1F;
            this.n0.b("native:view_show", ne1F);
        }
        HashMap map = new HashMap(1);
        map.put("version", this.E.B);
        U("onshow", map);
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final void zzY() {
        throw null;
    }

    @Override // com.daaw.CK1, com.daaw.InterfaceC7884rK1
    public final void zza(String str) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final synchronized void zzbj() {
        zzl zzlVar = this.F;
        if (zzlVar != null) {
            zzlVar.zzbj();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final synchronized void zzbk() {
        zzl zzlVar = this.F;
        if (zzlVar != null) {
            zzlVar.zzbk();
        }
    }

    @Override // com.daaw.FU1
    public final synchronized int zzf() {
        return this.o0;
    }

    @Override // com.daaw.FU1
    public final int zzg() {
        return getMeasuredHeight();
    }

    @Override // com.daaw.FU1
    public final int zzh() {
        return getMeasuredWidth();
    }

    @Override // com.daaw.InterfaceC9334wW1, com.daaw.InterfaceC4579fX1, com.daaw.FU1
    public final Activity zzi() {
        return this.B.a();
    }

    @Override // com.daaw.InterfaceC9334wW1, com.daaw.FU1
    public final zza zzj() {
        return this.G;
    }

    @Override // com.daaw.FU1
    public final NE1 zzk() {
        return this.l0;
    }

    @Override // com.daaw.InterfaceC9334wW1, com.daaw.FU1
    public final OE1 zzm() {
        return this.n0;
    }

    @Override // com.daaw.InterfaceC9334wW1, com.daaw.InterfaceC6821nX1, com.daaw.FU1
    public final zzcaz zzn() {
        return this.E;
    }

    @Override // com.daaw.FU1
    public final C7088oU1 zzo() {
        return null;
    }

    @Override // com.daaw.InterfaceC9334wW1, com.daaw.FU1
    public final synchronized UW1 zzq() {
        return this.c0;
    }

    @Override // com.daaw.InterfaceC1974Qb2
    public final void zzs() {
        FW1 fw1 = this.N;
        if (fw1 != null) {
            fw1.zzs();
        }
    }

    @Override // com.daaw.FU1
    public final void zzu() {
        com.google.android.gms.ads.internal.overlay.zzl zzlVarC = c();
        if (zzlVarC != null) {
            zzlVarC.zzd();
        }
    }

    @Override // com.daaw.FU1
    public final void zzz(boolean z) {
        this.N.a(false);
    }

    @Override // com.daaw.InterfaceC9334wW1, com.daaw.InterfaceC7100oX1
    public final View h() {
        return this;
    }

    @Override // com.daaw.InterfaceC9334wW1
    public final WebView j() {
        return this;
    }

    @Override // com.daaw.FU1
    public final void A(int i) {
    }

    @Override // com.daaw.FU1
    public final void t0(int i) {
    }

    @Override // com.daaw.FU1
    public final void w0(int i) {
    }
}
