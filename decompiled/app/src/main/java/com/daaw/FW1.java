package com.daaw;

import android.content.Context;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.ads.AdSize;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzaxe;
import com.google.android.gms.internal.ads.zzaxh;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FW1 extends WebViewClient implements InterfaceC7936rX1 {
    public static final /* synthetic */ int g0 = 0;
    public final InterfaceC9334wW1 B;
    public final C6454mB1 C;
    public zza F;
    public zzo G;
    public InterfaceC7379pX1 H;
    public InterfaceC7658qX1 I;
    public LH1 J;
    public TH1 K;
    public InterfaceC1974Qb2 L;
    public boolean M;
    public boolean N;
    public boolean R;
    public boolean S;
    public boolean T;
    public zzz U;
    public FN1 V;
    public zzb W;
    public InterfaceC3152aR1 Y;
    public boolean Z;
    public boolean a0;
    public int b0;
    public boolean c0;
    public final BinderC9431wq2 e0;
    public View.OnAttachStateChangeListener f0;
    public final HashMap D = new HashMap();
    public final Object E = new Object();
    public int O = 0;
    public String P = "";
    public String Q = "";
    public AN1 X = null;
    public final HashSet d0 = new HashSet(Arrays.asList(((String) zzba.zzc().b(AbstractC9820yE1.A5)).split(",")));

    public FW1(InterfaceC9334wW1 interfaceC9334wW1, C6454mB1 c6454mB1, boolean z, FN1 fn1, AN1 an1, BinderC9431wq2 binderC9431wq2) {
        this.C = c6454mB1;
        this.B = interfaceC9334wW1;
        this.R = z;
        this.V = fn1;
        this.e0 = binderC9431wq2;
    }

    public static final boolean P(InterfaceC9334wW1 interfaceC9334wW1) {
        if (interfaceC9334wW1.b() != null) {
            return interfaceC9334wW1.b().k0;
        }
        return false;
    }

    public static final boolean R(boolean z, InterfaceC9334wW1 interfaceC9334wW1) {
        return (!z || interfaceC9334wW1.zzO().i() || interfaceC9334wW1.c0().equals("interstitial_mb")) ? false : true;
    }

    public static WebResourceResponse o() {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.I0)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    public final void A() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f0;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.B).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    public final void A0(boolean z, int i, boolean z2) {
        InterfaceC9334wW1 interfaceC9334wW1 = this.B;
        boolean zR = R(interfaceC9334wW1.w(), interfaceC9334wW1);
        boolean z3 = true;
        if (!zR && z2) {
            z3 = false;
        }
        zza zzaVar = zR ? null : this.F;
        zzo zzoVar = this.G;
        zzz zzzVar = this.U;
        InterfaceC9334wW1 interfaceC9334wW12 = this.B;
        B0(new AdOverlayInfoParcel(zzaVar, zzoVar, zzzVar, interfaceC9334wW12, z, i, interfaceC9334wW12.zzn(), z3 ? null : this.L, P(this.B) ? this.e0 : null));
    }

    public final void B0(AdOverlayInfoParcel adOverlayInfoParcel) {
        zzc zzcVar;
        AN1 an1 = this.X;
        boolean zL = an1 != null ? an1.l() : false;
        zzt.zzi();
        zzm.zza(this.B.getContext(), adOverlayInfoParcel, !zL);
        InterfaceC3152aR1 interfaceC3152aR1 = this.Y;
        if (interfaceC3152aR1 != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            interfaceC3152aR1.zzh(str);
        }
    }

    public final void C0(boolean z, int i, String str, String str2, boolean z2) {
        InterfaceC9334wW1 interfaceC9334wW1 = this.B;
        boolean zW = interfaceC9334wW1.w();
        boolean zR = R(zW, interfaceC9334wW1);
        boolean z3 = true;
        if (!zR && z2) {
            z3 = false;
        }
        zza zzaVar = zR ? null : this.F;
        CW1 cw1 = zW ? null : new CW1(this.B, this.G);
        LH1 lh1 = this.J;
        TH1 th1 = this.K;
        zzz zzzVar = this.U;
        InterfaceC9334wW1 interfaceC9334wW12 = this.B;
        B0(new AdOverlayInfoParcel(zzaVar, cw1, lh1, th1, zzzVar, interfaceC9334wW12, z, i, str, str2, interfaceC9334wW12.zzn(), z3 ? null : this.L, P(this.B) ? this.e0 : null));
    }

    public final void D0(boolean z, int i, String str, boolean z2, boolean z3) {
        InterfaceC9334wW1 interfaceC9334wW1 = this.B;
        boolean zW = interfaceC9334wW1.w();
        boolean zR = R(zW, interfaceC9334wW1);
        boolean z4 = true;
        if (!zR && z2) {
            z4 = false;
        }
        zza zzaVar = zR ? null : this.F;
        CW1 cw1 = zW ? null : new CW1(this.B, this.G);
        LH1 lh1 = this.J;
        TH1 th1 = this.K;
        zzz zzzVar = this.U;
        InterfaceC9334wW1 interfaceC9334wW12 = this.B;
        B0(new AdOverlayInfoParcel(zzaVar, cw1, lh1, th1, zzzVar, interfaceC9334wW12, z, i, str, interfaceC9334wW12.zzn(), z4 ? null : this.L, P(this.B) ? this.e0 : null, z3));
    }

    public final void E0(String str, HI1 hi1) {
        synchronized (this.E) {
            try {
                List copyOnWriteArrayList = (List) this.D.get(str);
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList();
                    this.D.put(str, copyOnWriteArrayList);
                }
                copyOnWriteArrayList.add(hi1);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void G(final View view, final InterfaceC3152aR1 interfaceC3152aR1, final int i) {
        if (!interfaceC3152aR1.zzi() || i <= 0) {
            return;
        }
        interfaceC3152aR1.b(view);
        if (interfaceC3152aR1.zzi()) {
            com.google.android.gms.ads.internal.util.zzt.zza.postDelayed(new Runnable() { // from class: com.daaw.xW1
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.w0(view, interfaceC3152aR1, i);
                }
            }, 100L);
        }
    }

    @Override // com.daaw.InterfaceC7936rX1
    public final void I(InterfaceC7379pX1 interfaceC7379pX1) {
        this.H = interfaceC7379pX1;
    }

    @Override // com.daaw.InterfaceC7936rX1
    public final void K(InterfaceC7658qX1 interfaceC7658qX1) {
        this.I = interfaceC7658qX1;
    }

    @Override // com.daaw.InterfaceC7936rX1
    public final void O(zza zzaVar, LH1 lh1, zzo zzoVar, TH1 th1, zzz zzzVar, boolean z, JI1 ji1, zzb zzbVar, HN1 hn1, InterfaceC3152aR1 interfaceC3152aR1, final C6077kq2 c6077kq2, final C6487mJ2 c6487mJ2, C1071Hj2 c1071Hj2, InterfaceC6483mI2 interfaceC6483mI2, C4802gJ1 c4802gJ1, final InterfaceC1974Qb2 interfaceC1974Qb2, C4513fJ1 c4513fJ1, TI1 ti1, final L12 l12) {
        zzb zzbVar2 = zzbVar == null ? new zzb(this.B.getContext(), interfaceC3152aR1, null) : zzbVar;
        this.X = new AN1(this.B, hn1);
        this.Y = interfaceC3152aR1;
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.Q0)).booleanValue()) {
            E0("/adMetadata", new KH1(lh1));
        }
        if (th1 != null) {
            E0("/appEvent", new SH1(th1));
        }
        E0("/backButton", GI1.j);
        E0("/refresh", GI1.k);
        E0("/canOpenApp", GI1.b);
        E0("/canOpenURLs", GI1.a);
        E0("/canOpenIntents", GI1.c);
        E0("/close", GI1.d);
        E0("/customClose", GI1.e);
        E0("/instrument", GI1.n);
        E0("/delayPageLoaded", GI1.p);
        E0("/delayPageClosed", GI1.q);
        E0("/getLocationInfo", GI1.r);
        E0("/log", GI1.g);
        E0("/mraid", new NI1(zzbVar2, this.X, hn1));
        FN1 fn1 = this.V;
        if (fn1 != null) {
            E0("/mraidLoaded", fn1);
        }
        zzb zzbVar3 = zzbVar2;
        E0("/open", new SI1(zzbVar3, this.X, c6077kq2, c1071Hj2, interfaceC6483mI2, l12));
        E0("/precache", new C9609xV1());
        E0("/touch", GI1.i);
        E0("/video", GI1.l);
        E0("/videoMeta", GI1.m);
        if (c6077kq2 == null || c6487mJ2 == null) {
            E0("/click", new ZH1(interfaceC1974Qb2, l12));
            E0("/httpTrack", GI1.f);
        } else {
            E0("/click", new HI1() { // from class: com.daaw.LF2
                @Override // com.daaw.HI1
                public final void a(Object obj, Map map) {
                    InterfaceC9334wW1 interfaceC9334wW1 = (InterfaceC9334wW1) obj;
                    GI1.c(map, interfaceC1974Qb2);
                    String str = (String) map.get("u");
                    if (str == null) {
                        AbstractC4274eT1.zzj("URL missing from click GMSG.");
                        return;
                    }
                    C6077kq2 c6077kq22 = c6077kq2;
                    C6487mJ2 c6487mJ22 = c6487mJ2;
                    AbstractC7360pS2.r(GI1.a(interfaceC9334wW1, str), new NF2(interfaceC9334wW1, l12, c6487mJ22, c6077kq22), AbstractC9322wT1.a);
                }
            });
            E0("/httpTrack", new HI1() { // from class: com.daaw.MF2
                @Override // com.daaw.HI1
                public final void a(Object obj, Map map) {
                    InterfaceC5133hW1 interfaceC5133hW1 = (InterfaceC5133hW1) obj;
                    String str = (String) map.get("u");
                    if (str == null) {
                        AbstractC4274eT1.zzj("URL missing from httpTrack GMSG.");
                    } else if (interfaceC5133hW1.b().k0) {
                        c6077kq2.j(new C6635mq2(zzt.zzB().a(), ((VW1) interfaceC5133hW1).zzP().b, str, 2));
                    } else {
                        c6487mJ2.c(str, null);
                    }
                }
            });
        }
        if (zzt.zzn().z(this.B.getContext())) {
            E0("/logScionEvent", new MI1(this.B.getContext()));
        }
        if (ji1 != null) {
            E0("/setInterstitialProperties", new II1(ji1));
        }
        if (c4802gJ1 != null) {
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.F8)).booleanValue()) {
                E0("/inspectorNetworkExtras", c4802gJ1);
            }
        }
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.Y8)).booleanValue() && c4513fJ1 != null) {
            E0("/shareSheet", c4513fJ1);
        }
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.d9)).booleanValue() && ti1 != null) {
            E0("/inspectorOutOfContextTest", ti1);
        }
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.xa)).booleanValue()) {
            E0("/bindPlayStoreOverlay", GI1.u);
            E0("/presentPlayStoreOverlay", GI1.v);
            E0("/expandPlayStoreOverlay", GI1.w);
            E0("/collapsePlayStoreOverlay", GI1.x);
            E0("/closePlayStoreOverlay", GI1.y);
        }
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.X2)).booleanValue()) {
            E0("/setPAIDPersonalizationEnabled", GI1.A);
            E0("/resetPAID", GI1.z);
        }
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.Pa)).booleanValue()) {
            InterfaceC9334wW1 interfaceC9334wW1 = this.B;
            if (interfaceC9334wW1.b() != null && interfaceC9334wW1.b().s0) {
                E0("/writeToLocalStorage", GI1.B);
                E0("/clearLocalStorageKeys", GI1.C);
            }
        }
        this.F = zzaVar;
        this.G = zzoVar;
        this.J = lh1;
        this.K = th1;
        this.U = zzzVar;
        this.W = zzbVar3;
        this.L = interfaceC1974Qb2;
        this.M = z;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener U() {
        synchronized (this.E) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener V() {
        synchronized (this.E) {
        }
        return null;
    }

    @Override // com.daaw.InterfaceC7936rX1
    public final void Y(boolean z) {
        synchronized (this.E) {
            this.S = true;
        }
    }

    public final void a(boolean z) {
        this.M = false;
    }

    public final WebResourceResponse a0(String str, Map map) {
        zzaxe zzaxeVarB;
        try {
            String strC = QR1.c(str, this.B.getContext(), this.c0);
            if (!strC.equals(str)) {
                return r(strC, map);
            }
            zzaxh zzaxhVarE = zzaxh.e(Uri.parse(str));
            if (zzaxhVarE != null && (zzaxeVarB = zzt.zzc().b(zzaxhVarE)) != null && zzaxeVarB.v()) {
                return new WebResourceResponse("", "", zzaxeVarB.p());
            }
            if (C3996dT1.k() && ((Boolean) AbstractC8143sF1.b.e()).booleanValue()) {
                return r(str, map);
            }
            return null;
        } catch (Exception e) {
            e = e;
            zzt.zzo().u(e, "AdWebViewClient.interceptRequest");
            return o();
        } catch (NoClassDefFoundError e2) {
            e = e2;
            zzt.zzo().u(e, "AdWebViewClient.interceptRequest");
            return o();
        }
    }

    public final void d(String str, HI1 hi1) {
        synchronized (this.E) {
            try {
                List list = (List) this.D.get(str);
                if (list == null) {
                    return;
                }
                list.remove(hi1);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(String str, InterfaceC2920Yy0 interfaceC2920Yy0) {
        synchronized (this.E) {
            try {
                List<HI1> list = (List) this.D.get(str);
                if (list == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (HI1 hi1 : list) {
                    if (interfaceC2920Yy0.apply(hi1)) {
                        arrayList.add(hi1);
                    }
                }
                list.removeAll(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h0() {
        if (this.H != null && ((this.Z && this.b0 <= 0) || this.a0 || this.N)) {
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.O1)).booleanValue() && this.B.zzm() != null) {
                IE1.a(this.B.zzm().a(), this.B.zzk(), "awfllc");
            }
            InterfaceC7379pX1 interfaceC7379pX1 = this.H;
            boolean z = false;
            if (!this.a0 && !this.N) {
                z = true;
            }
            interfaceC7379pX1.zza(z, this.O, this.P, this.Q);
            this.H = null;
        }
        this.B.Z();
    }

    @Override // com.daaw.InterfaceC1974Qb2
    public final void i0() {
        InterfaceC1974Qb2 interfaceC1974Qb2 = this.L;
        if (interfaceC1974Qb2 != null) {
            interfaceC1974Qb2.i0();
        }
    }

    public final void k0() {
        InterfaceC3152aR1 interfaceC3152aR1 = this.Y;
        if (interfaceC3152aR1 != null) {
            interfaceC3152aR1.zze();
            this.Y = null;
        }
        A();
        synchronized (this.E) {
            try {
                this.D.clear();
                this.F = null;
                this.G = null;
                this.H = null;
                this.I = null;
                this.J = null;
                this.K = null;
                this.M = false;
                this.R = false;
                this.S = false;
                this.U = null;
                this.W = null;
                this.V = null;
                AN1 an1 = this.X;
                if (an1 != null) {
                    an1.h(true);
                    this.X = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean l() {
        boolean z;
        synchronized (this.E) {
            z = this.T;
        }
        return z;
    }

    public final boolean m() {
        boolean z;
        synchronized (this.E) {
            z = this.S;
        }
        return z;
    }

    @Override // com.daaw.InterfaceC7936rX1
    public final void m0(boolean z) {
        synchronized (this.E) {
            this.T = z;
        }
    }

    @Override // com.daaw.InterfaceC7936rX1
    public final boolean n() {
        boolean z;
        synchronized (this.E) {
            z = this.R;
        }
        return z;
    }

    @Override // com.daaw.InterfaceC7936rX1
    public final void o0(Uri uri) {
        HashMap map = this.D;
        String path = uri.getPath();
        List list = (List) map.get(path);
        if (path == null || list == null) {
            zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.I6)).booleanValue() || zzt.zzo().f() == null) {
                return;
            }
            final String strSubstring = (path == null || path.length() < 2) ? "null" : path.substring(1);
            AbstractC9322wT1.a.execute(new Runnable() { // from class: com.daaw.zW1
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    int i = FW1.g0;
                    zzt.zzo().f().e(strSubstring);
                }
            });
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.z5)).booleanValue() && this.d0.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) zzba.zzc().b(AbstractC9820yE1.B5)).intValue()) {
                zze.zza("Parsing gmsg query params on BG thread: ".concat(path));
                AbstractC7360pS2.r(zzt.zzp().zzb(uri), new BW1(this, list, path, uri), AbstractC9322wT1.e);
                return;
            }
        }
        zzt.zzp();
        t(com.google.android.gms.ads.internal.util.zzt.zzO(uri), list, path);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zza zzaVar = this.F;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        zze.zza("Loading resource: ".concat(String.valueOf(str)));
        Uri uri = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            o0(uri);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.E) {
            try {
                if (this.B.q()) {
                    zze.zza("Blank page loaded, 1...");
                    this.B.u();
                    return;
                }
                this.Z = true;
                InterfaceC7658qX1 interfaceC7658qX1 = this.I;
                if (interfaceC7658qX1 != null) {
                    interfaceC7658qX1.zza();
                    this.I = null;
                }
                h0();
                if (this.B.c() != null) {
                    if (((Boolean) zzba.zzc().b(AbstractC9820yE1.Qa)).booleanValue()) {
                        this.B.c().zzG(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.N = true;
        this.O = i;
        this.P = str;
        this.Q = str2;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.B.J(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00fc, code lost:
    
        com.google.android.gms.ads.internal.zzt.zzp();
        com.google.android.gms.ads.internal.zzt.zzp();
        r0 = r11.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x010a, code lost:
    
        r6 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x010e, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0110, code lost:
    
        r13 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0112, code lost:
    
        r13 = r0.split(";")[0].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x011d, code lost:
    
        com.google.android.gms.ads.internal.zzt.zzp();
        r0 = r11.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0128, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x012a, code lost:
    
        r14 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x012c, code lost:
    
        r0 = r0.split(";");
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0131, code lost:
    
        if (r0.length != 1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0134, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0136, code lost:
    
        if (r3 >= r0.length) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0144, code lost:
    
        if (r0[r3].trim().startsWith("charset") == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0146, code lost:
    
        r5 = r0[r3].trim().split("=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0153, code lost:
    
        if (r5.length <= 1) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0155, code lost:
    
        r6 = r5[1].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x015c, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015f, code lost:
    
        r0 = r11.getHeaderFields();
        r3 = new java.util.HashMap(r0.size());
        r0 = r0.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0178, code lost:
    
        if (r0.hasNext() == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x017a, code lost:
    
        r4 = r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0184, code lost:
    
        if (r4.getKey() == null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x018a, code lost:
    
        if (r4.getValue() == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0196, code lost:
    
        if (r4.getValue().isEmpty() != false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0198, code lost:
    
        r3.put(r4.getKey(), r4.getValue().get(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01ae, code lost:
    
        r0 = com.google.android.gms.ads.internal.zzt.zzq().zzc(r13, r14, r11.getResponseCode(), r11.getResponseMessage(), r3, r11.getInputStream());
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01c4, code lost:
    
        android.net.TrafficStats.clearThreadStatsTag();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01c7, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.webkit.WebResourceResponse r(java.lang.String r20, java.util.Map r21) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.FW1.r(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    @Override // com.daaw.InterfaceC7936rX1
    public final void s0(int i, int i2, boolean z) {
        FN1 fn1 = this.V;
        if (fn1 != null) {
            fn1.h(i, i2);
        }
        AN1 an1 = this.X;
        if (an1 != null) {
            an1.j(i, i2, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return a0(str, Collections.EMPTY_MAP);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case AdSize.LARGE_AD_HEIGHT /* 90 */:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        zze.zza("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri uriA = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uriA.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uriA.getHost())) {
            o0(uriA);
        } else {
            if (this.M && webView == this.B.j()) {
                String scheme = uriA.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    zza zzaVar = this.F;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                        InterfaceC3152aR1 interfaceC3152aR1 = this.Y;
                        if (interfaceC3152aR1 != null) {
                            interfaceC3152aR1.zzh(str);
                        }
                        this.F = null;
                    }
                    InterfaceC1974Qb2 interfaceC1974Qb2 = this.L;
                    if (interfaceC1974Qb2 != null) {
                        interfaceC1974Qb2.i0();
                        this.L = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (this.B.j().willNotDraw()) {
                AbstractC4274eT1.zzj("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            } else {
                try {
                    C7782qx1 c7782qx1F = this.B.f();
                    if (c7782qx1F != null && c7782qx1F.f(uriA)) {
                        Context context = this.B.getContext();
                        InterfaceC9334wW1 interfaceC9334wW1 = this.B;
                        uriA = c7782qx1F.a(uriA, context, (View) interfaceC9334wW1, interfaceC9334wW1.zzi());
                    }
                } catch (C8060rx1 unused) {
                    AbstractC4274eT1.zzj("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                zzb zzbVar = this.W;
                if (zzbVar == null || zzbVar.zzc()) {
                    x0(new zzc("android.intent.action.VIEW", uriA.toString(), null, null, null, null, null, null), true);
                } else {
                    zzbVar.zzb(str);
                }
            }
        }
        return true;
    }

    public final void t(Map map, List list, String str) {
        if (zze.zzc()) {
            zze.zza("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                zze.zza("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((HI1) it.next()).a(this.B, map);
        }
    }

    public final void t0(boolean z) {
        this.c0 = z;
    }

    public final /* synthetic */ void v0() {
        this.B.q0();
        zzl zzlVarC = this.B.c();
        if (zzlVarC != null) {
            zzlVarC.zzz();
        }
    }

    public final /* synthetic */ void w0(View view, InterfaceC3152aR1 interfaceC3152aR1, int i) {
        G(view, interfaceC3152aR1, i - 1);
    }

    public final void x0(zzc zzcVar, boolean z) {
        InterfaceC9334wW1 interfaceC9334wW1 = this.B;
        boolean zW = interfaceC9334wW1.w();
        boolean zR = R(zW, interfaceC9334wW1);
        boolean z2 = true;
        if (!zR && z) {
            z2 = false;
        }
        zza zzaVar = zR ? null : this.F;
        zzo zzoVar = zW ? null : this.G;
        zzz zzzVar = this.U;
        InterfaceC9334wW1 interfaceC9334wW12 = this.B;
        B0(new AdOverlayInfoParcel(zzcVar, zzaVar, zzoVar, zzzVar, interfaceC9334wW12.zzn(), interfaceC9334wW12, z2 ? null : this.L));
    }

    @Override // com.daaw.InterfaceC7936rX1
    public final void y(int i, int i2) {
        AN1 an1 = this.X;
        if (an1 != null) {
            an1.k(i, i2);
        }
    }

    public final void y0(String str, String str2, int i) {
        BinderC9431wq2 binderC9431wq2 = this.e0;
        InterfaceC9334wW1 interfaceC9334wW1 = this.B;
        B0(new AdOverlayInfoParcel(interfaceC9334wW1, interfaceC9334wW1.zzn(), str, str2, 14, binderC9431wq2));
    }

    @Override // com.daaw.InterfaceC7936rX1
    public final void zzE() {
        synchronized (this.E) {
            this.M = false;
            this.R = true;
            AbstractC9322wT1.e.execute(new Runnable() { // from class: com.daaw.yW1
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.v0();
                }
            });
        }
    }

    @Override // com.daaw.InterfaceC7936rX1
    public final zzb zzd() {
        return this.W;
    }

    @Override // com.daaw.InterfaceC7936rX1
    public final void zzk() {
        C6454mB1 c6454mB1 = this.C;
        if (c6454mB1 != null) {
            c6454mB1.c(10005);
        }
        this.a0 = true;
        this.O = 10004;
        this.P = "Page loaded delay cancel.";
        h0();
        this.B.destroy();
    }

    @Override // com.daaw.InterfaceC7936rX1
    public final void zzl() {
        synchronized (this.E) {
        }
        this.b0++;
        h0();
    }

    @Override // com.daaw.InterfaceC7936rX1
    public final void zzm() {
        this.b0--;
        h0();
    }

    @Override // com.daaw.InterfaceC7936rX1
    public final void zzq() {
        InterfaceC3152aR1 interfaceC3152aR1 = this.Y;
        if (interfaceC3152aR1 != null) {
            WebView webViewJ = this.B.j();
            if (AbstractC2317Td1.T(webViewJ)) {
                G(webViewJ, interfaceC3152aR1, 10);
                return;
            }
            A();
            AW1 aw1 = new AW1(this, interfaceC3152aR1);
            this.f0 = aw1;
            ((View) this.B).addOnAttachStateChangeListener(aw1);
        }
    }

    @Override // com.daaw.InterfaceC1974Qb2
    public final void zzs() {
        InterfaceC1974Qb2 interfaceC1974Qb2 = this.L;
        if (interfaceC1974Qb2 != null) {
            interfaceC1974Qb2.zzs();
        }
    }
}
