package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.daaw.AbstractC10175zX1;
import com.daaw.AbstractC4274eT1;
import com.daaw.AbstractC4839gS2;
import com.daaw.AbstractC7307pF1;
import com.daaw.AbstractC7360pS2;
import com.daaw.AbstractC7582qE1;
import com.daaw.AbstractC9322wT1;
import com.daaw.AbstractC9820yE1;
import com.daaw.BO2;
import com.daaw.BinderC7744qp0;
import com.daaw.C0542Cj2;
import com.daaw.C10274zr3;
import com.daaw.C1590Mj2;
import com.daaw.C4394es3;
import com.daaw.C4791gG2;
import com.daaw.C6023kh2;
import com.daaw.C6487mJ2;
import com.daaw.C7782qx1;
import com.daaw.C8060rx1;
import com.daaw.DI2;
import com.daaw.EI2;
import com.daaw.EO1;
import com.daaw.Gt3;
import com.daaw.InterfaceC7934rX;
import com.daaw.InterfaceFutureC8236sc0;
import com.daaw.PS2;
import com.daaw.Qs3;
import com.daaw.RR2;
import com.daaw.TI2;
import com.daaw.W01;
import com.daaw.WI2;
import com.daaw.WN2;
import com.daaw.WR2;
import com.daaw.XR1;
import com.daaw.ZR1;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbz;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzbzo;
import com.google.android.gms.internal.ads.zzcaz;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzaa extends ZR1 {
    public static final List d0 = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));
    public static final List e0 = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    public static final List f0 = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));
    public static final List g0 = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public static final /* synthetic */ int zze = 0;
    public final AbstractC10175zX1 B;
    public Context C;
    public final C7782qx1 D;
    public final C4791gG2 E;
    public final PS2 G;
    public final ScheduledExecutorService H;
    public zzbtt I;
    public final zzc M;
    public final C1590Mj2 N;
    public final C6487mJ2 O;
    public final zzcaz W;
    public String X;
    public final List Z;
    public final List a0;
    public final List b0;
    public final List c0;
    public C0542Cj2 F = null;
    public Point J = new Point();
    public Point K = new Point();
    public final Set L = Collections.newSetFromMap(new WeakHashMap());
    public final AtomicInteger V = new AtomicInteger(0);
    public final boolean P = ((Boolean) zzba.zzc().b(AbstractC9820yE1.i7)).booleanValue();
    public final boolean Q = ((Boolean) zzba.zzc().b(AbstractC9820yE1.h7)).booleanValue();
    public final boolean R = ((Boolean) zzba.zzc().b(AbstractC9820yE1.k7)).booleanValue();
    public final boolean S = ((Boolean) zzba.zzc().b(AbstractC9820yE1.m7)).booleanValue();
    public final String T = (String) zzba.zzc().b(AbstractC9820yE1.l7);
    public final String U = (String) zzba.zzc().b(AbstractC9820yE1.n7);
    public final String Y = (String) zzba.zzc().b(AbstractC9820yE1.o7);

    public zzaa(AbstractC10175zX1 abstractC10175zX1, Context context, C7782qx1 c7782qx1, C4791gG2 c4791gG2, PS2 ps2, ScheduledExecutorService scheduledExecutorService, C1590Mj2 c1590Mj2, C6487mJ2 c6487mJ2, zzcaz zzcazVar) {
        List listX3;
        this.B = abstractC10175zX1;
        this.C = context;
        this.D = c7782qx1;
        this.E = c4791gG2;
        this.G = ps2;
        this.H = scheduledExecutorService;
        this.M = abstractC10175zX1.s();
        this.N = c1590Mj2;
        this.O = c6487mJ2;
        this.W = zzcazVar;
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.p7)).booleanValue()) {
            this.Z = x3((String) zzba.zzc().b(AbstractC9820yE1.q7));
            this.a0 = x3((String) zzba.zzc().b(AbstractC9820yE1.r7));
            this.b0 = x3((String) zzba.zzc().b(AbstractC9820yE1.s7));
            listX3 = x3((String) zzba.zzc().b(AbstractC9820yE1.t7));
        } else {
            this.Z = d0;
            this.a0 = e0;
            this.b0 = f0;
            listX3 = g0;
        }
        this.c0 = listX3;
    }

    public static /* bridge */ /* synthetic */ TI2 F3(InterfaceFutureC8236sc0 interfaceFutureC8236sc0, zzbzo zzbzoVar) {
        if (!WI2.a() || !((Boolean) AbstractC7307pF1.e.e()).booleanValue()) {
            return null;
        }
        try {
            TI2 ti2Zzb = ((zzh) AbstractC7360pS2.p(interfaceFutureC8236sc0)).zzb();
            ti2Zzb.d(new ArrayList(Collections.singletonList(zzbzoVar.C)));
            com.google.android.gms.ads.internal.client.zzl zzlVar = zzbzoVar.E;
            ti2Zzb.b(zzlVar == null ? "" : zzlVar.zzp);
            return ti2Zzb;
        } catch (ExecutionException e) {
            com.google.android.gms.ads.internal.zzt.zzo().u(e, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void e3(zzaa zzaaVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (zzaaVar.m3((Uri) it.next())) {
                zzaaVar.V.getAndIncrement();
                return;
            }
        }
    }

    public static /* bridge */ /* synthetic */ void f3(final zzaa zzaaVar, final String str, final String str2, final C0542Cj2 c0542Cj2) {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.T6)).booleanValue()) {
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.Z6)).booleanValue()) {
                AbstractC9322wT1.a.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzk
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.h3(str, str2, c0542Cj2);
                    }
                });
            } else {
                zzaaVar.M.zzd(str, str2, c0542Cj2);
            }
        }
    }

    public static final /* synthetic */ Uri o3(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? w3(uri, "nas", str) : uri;
    }

    public static boolean u3(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final Uri w3(Uri uri, String str, String str2) {
        String string = uri.toString();
        int iIndexOf = string.indexOf("&adurl=");
        if (iIndexOf == -1) {
            iIndexOf = string.indexOf("?adurl=");
        }
        if (iIndexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i = iIndexOf + 1;
        return Uri.parse(string.substring(0, i) + str + "=" + str2 + "&" + string.substring(i));
    }

    public static final List x3(String str) {
        String[] strArrSplit = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            if (!BO2.d(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public final /* synthetic */ Uri A3(Uri uri, InterfaceC7934rX interfaceC7934rX) throws Exception {
        try {
            uri = this.D.a(uri, this.C, (View) BinderC7744qp0.I(interfaceC7934rX), null);
        } catch (C8060rx1 e) {
            AbstractC4274eT1.zzk("", e);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    public final /* synthetic */ zzh E3(zzbzo zzbzoVar) {
        return p3(this.C, zzbzoVar.B, zzbzoVar.C, zzbzoVar.D, zzbzoVar.E);
    }

    public final /* synthetic */ InterfaceFutureC8236sc0 H3() {
        return p3(this.C, null, AdFormat.BANNER.name(), null, null).zzc();
    }

    public final /* synthetic */ InterfaceFutureC8236sc0 I3(C6023kh2[] c6023kh2Arr, String str, C6023kh2 c6023kh2) throws JSONException {
        c6023kh2Arr[0] = c6023kh2;
        Context context = this.C;
        zzbtt zzbttVar = this.I;
        Map map = zzbttVar.C;
        JSONObject jSONObjectZzd = zzbz.zzd(context, map, map, zzbttVar.B, null);
        JSONObject jSONObjectZzg = zzbz.zzg(this.C, this.I.B);
        JSONObject jSONObjectZzf = zzbz.zzf(this.I.B);
        JSONObject jSONObjectZze = zzbz.zze(this.C, this.I.B);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", jSONObjectZzd);
        jSONObject.put("ad_view_signal", jSONObjectZzg);
        jSONObject.put("scroll_view_signal", jSONObjectZzf);
        jSONObject.put("lock_screen_signal", jSONObjectZze);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", zzbz.zzc(null, this.C, this.K, this.J));
        }
        return c6023kh2.d(str, jSONObject);
    }

    public final /* synthetic */ InterfaceFutureC8236sc0 J3(final ArrayList arrayList) {
        return AbstractC7360pS2.m(q3("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new WN2() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzj
            @Override // com.daaw.WN2
            public final Object apply(Object obj) {
                return this.zza.a3(arrayList, (String) obj);
            }
        }, this.G);
    }

    public final /* synthetic */ ArrayList a3(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!n3(uri) || TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(w3(uri, "nas", str));
            }
        }
        return arrayList;
    }

    public final /* synthetic */ ArrayList b3(List list, InterfaceC7934rX interfaceC7934rX) throws Exception {
        this.D.c();
        String strZzh = this.D.c().zzh(this.C, (View) BinderC7744qp0.I(interfaceC7934rX), null);
        if (TextUtils.isEmpty(strZzh)) {
            throw new Exception("Failed to get view signals.");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (n3(uri)) {
                arrayList.add(w3(uri, "ms", strZzh));
            } else {
                AbstractC4274eT1.zzj("Not a Google URL: ".concat(String.valueOf(uri)));
                arrayList.add(uri);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Exception("Empty impression URLs result.");
        }
        return arrayList;
    }

    public final /* synthetic */ void g3(C6023kh2[] c6023kh2Arr) {
        C6023kh2 c6023kh2 = c6023kh2Arr[0];
        if (c6023kh2 != null) {
            this.E.b(AbstractC7360pS2.h(c6023kh2));
        }
    }

    public final /* synthetic */ void h3(String str, String str2, C0542Cj2 c0542Cj2) {
        this.M.zzd(str, str2, c0542Cj2);
    }

    public final boolean m3(Uri uri) {
        return u3(uri, this.Z, this.a0);
    }

    public final boolean n3(Uri uri) {
        return u3(uri, this.b0, this.c0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.ads.nonagon.signalgeneration.zzh p3(android.content.Context r8, java.lang.String r9, java.lang.String r10, com.google.android.gms.ads.internal.client.zzq r11, com.google.android.gms.ads.internal.client.zzl r12) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzaa.p3(android.content.Context, java.lang.String, java.lang.String, com.google.android.gms.ads.internal.client.zzq, com.google.android.gms.ads.internal.client.zzl):com.google.android.gms.ads.nonagon.signalgeneration.zzh");
    }

    public final InterfaceFutureC8236sc0 q3(final String str) {
        final C6023kh2[] c6023kh2Arr = new C6023kh2[1];
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0N = AbstractC7360pS2.n(this.E.a(), new WR2() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzl
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                return this.zza.I3(c6023kh2Arr, str, (C6023kh2) obj);
            }
        }, this.G);
        interfaceFutureC8236sc0N.g(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzm
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.g3(c6023kh2Arr);
            }
        }, this.G);
        return AbstractC7360pS2.e(AbstractC7360pS2.m((AbstractC4839gS2) AbstractC7360pS2.o(AbstractC4839gS2.C(interfaceFutureC8236sc0N), ((Integer) zzba.zzc().b(AbstractC9820yE1.A7)).intValue(), TimeUnit.MILLISECONDS, this.H), new WN2() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzs
            @Override // com.daaw.WN2
            public final Object apply(Object obj) {
                List list = zzaa.d0;
                return ((JSONObject) obj).optString("nas");
            }
        }, this.G), Exception.class, new WN2() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzt
            @Override // com.daaw.WN2
            public final Object apply(Object obj) {
                List list = zzaa.d0;
                AbstractC4274eT1.zzh("", (Exception) obj);
                return null;
            }
        }, this.G);
    }

    public final void r3() {
        zzaa zzaaVar;
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0Zzc;
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.h9)).booleanValue()) {
            if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.k9)).booleanValue()) {
                if (((Boolean) zzba.zzc().b(AbstractC9820yE1.ha)).booleanValue()) {
                    interfaceFutureC8236sc0Zzc = AbstractC7360pS2.k(new RR2() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzi
                        @Override // com.daaw.RR2
                        public final InterfaceFutureC8236sc0 zza() {
                            return this.zza.H3();
                        }
                    }, AbstractC9322wT1.a);
                    zzaaVar = this;
                } else {
                    zzaaVar = this;
                    interfaceFutureC8236sc0Zzc = zzaaVar.p3(this.C, null, AdFormat.BANNER.name(), null, null).zzc();
                }
                AbstractC7360pS2.r(interfaceFutureC8236sc0Zzc, new Gt3(this), zzaaVar.B.c());
            }
        }
    }

    public final void s3(List list, final InterfaceC7934rX interfaceC7934rX, EO1 eo1, boolean z) {
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0S0;
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.z7)).booleanValue()) {
            AbstractC4274eT1.zzj("The updating URL feature is not enabled.");
            try {
                eo1.a("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                AbstractC4274eT1.zzh("", e);
                return;
            }
        }
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (m3((Uri) it.next())) {
                i++;
            }
        }
        if (i > 1) {
            AbstractC4274eT1.zzj("Multiple google urls found: ".concat(String.valueOf(list)));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (m3(uri)) {
                interfaceFutureC8236sc0S0 = this.G.S0(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzn
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.zza.A3(uri, interfaceC7934rX);
                    }
                });
                if (v3()) {
                    interfaceFutureC8236sc0S0 = AbstractC7360pS2.n(interfaceFutureC8236sc0S0, new WR2() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzo
                        @Override // com.daaw.WR2
                        public final InterfaceFutureC8236sc0 zza(Object obj) {
                            zzaa zzaaVar = this.zza;
                            return AbstractC7360pS2.m(zzaaVar.q3("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new WN2() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzp
                                @Override // com.daaw.WN2
                                public final Object apply(Object obj2) {
                                    return zzaa.o3(uri, (String) obj2);
                                }
                            }, zzaaVar.G);
                        }
                    }, this.G);
                } else {
                    AbstractC4274eT1.zzi("Asset view map is empty.");
                }
            } else {
                AbstractC4274eT1.zzj("Not a Google URL: ".concat(String.valueOf(uri)));
                interfaceFutureC8236sc0S0 = AbstractC7360pS2.h(uri);
            }
            arrayList.add(interfaceFutureC8236sc0S0);
        }
        AbstractC7360pS2.r(AbstractC7360pS2.d(arrayList), new Qs3(this, eo1, z), this.B.c());
    }

    public final void t3(final List list, final InterfaceC7934rX interfaceC7934rX, EO1 eo1, boolean z) {
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.z7)).booleanValue()) {
            try {
                eo1.a("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                AbstractC4274eT1.zzh("", e);
                return;
            }
        }
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0S0 = this.G.S0(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.b3(list, interfaceC7934rX);
            }
        });
        if (v3()) {
            interfaceFutureC8236sc0S0 = AbstractC7360pS2.n(interfaceFutureC8236sc0S0, new WR2() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzv
                @Override // com.daaw.WR2
                public final InterfaceFutureC8236sc0 zza(Object obj) {
                    return this.zza.J3((ArrayList) obj);
                }
            }, this.G);
        } else {
            AbstractC4274eT1.zzi("Asset view map is empty.");
        }
        AbstractC7360pS2.r(interfaceFutureC8236sc0S0, new C4394es3(this, eo1, z), this.B.c());
    }

    public final boolean v3() {
        Map map;
        zzbtt zzbttVar = this.I;
        return (zzbttVar == null || (map = zzbttVar.C) == null || map.isEmpty()) ? false : true;
    }

    @Override // com.daaw.InterfaceC3156aS1
    public final void zze(InterfaceC7934rX interfaceC7934rX, final zzbzo zzbzoVar, XR1 xr1) {
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0H;
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0Zzc;
        Context context = (Context) BinderC7744qp0.I(interfaceC7934rX);
        this.C = context;
        EI2 ei2A = DI2.a(context, 22);
        ei2A.zzh();
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.ha)).booleanValue()) {
            PS2 ps2 = AbstractC9322wT1.a;
            interfaceFutureC8236sc0H = ps2.S0(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzq
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.E3(zzbzoVar);
                }
            });
            interfaceFutureC8236sc0Zzc = AbstractC7360pS2.n(interfaceFutureC8236sc0H, new WR2() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzr
                @Override // com.daaw.WR2
                public final InterfaceFutureC8236sc0 zza(Object obj) {
                    return ((zzh) obj).zzc();
                }
            }, ps2);
        } else {
            zzh zzhVarP3 = p3(this.C, zzbzoVar.B, zzbzoVar.C, zzbzoVar.D, zzbzoVar.E);
            interfaceFutureC8236sc0H = AbstractC7360pS2.h(zzhVarP3);
            interfaceFutureC8236sc0Zzc = zzhVarP3.zzc();
        }
        AbstractC7360pS2.r(interfaceFutureC8236sc0Zzc, new C10274zr3(this, interfaceFutureC8236sc0H, zzbzoVar, xr1, ei2A, com.google.android.gms.ads.internal.zzt.zzB().a()), this.B.c());
    }

    @Override // com.daaw.InterfaceC3156aS1
    public final void zzf(zzbtt zzbttVar) {
        this.I = zzbttVar;
        this.E.c(1);
    }

    @Override // com.daaw.InterfaceC3156aS1
    public final void zzg(List list, InterfaceC7934rX interfaceC7934rX, EO1 eo1) {
        s3(list, interfaceC7934rX, eo1, true);
    }

    @Override // com.daaw.InterfaceC3156aS1
    public final void zzh(List list, InterfaceC7934rX interfaceC7934rX, EO1 eo1) {
        t3(list, interfaceC7934rX, eo1, true);
    }

    @Override // com.daaw.InterfaceC3156aS1
    public final void zzi(InterfaceC7934rX interfaceC7934rX) {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.g9)).booleanValue()) {
            AbstractC7582qE1 abstractC7582qE1 = AbstractC9820yE1.y7;
            if (!((Boolean) zzba.zzc().b(abstractC7582qE1)).booleanValue()) {
                r3();
            }
            WebView webView = (WebView) BinderC7744qp0.I(interfaceC7934rX);
            if (webView == null) {
                AbstractC4274eT1.zzg("The webView cannot be null.");
                return;
            }
            if (this.L.contains(webView)) {
                AbstractC4274eT1.zzi("This webview has already been registered.");
                return;
            }
            this.L.add(webView);
            webView.addJavascriptInterface(new W01(webView, this.D, this.N, this.O), "gmaSdk");
            if (((Boolean) zzba.zzc().b(abstractC7582qE1)).booleanValue()) {
                r3();
            }
        }
    }

    @Override // com.daaw.InterfaceC3156aS1
    public final void zzj(InterfaceC7934rX interfaceC7934rX) {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.z7)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) BinderC7744qp0.I(interfaceC7934rX);
            zzbtt zzbttVar = this.I;
            this.J = zzbz.zza(motionEvent, zzbttVar == null ? null : zzbttVar.B);
            if (motionEvent.getAction() == 0) {
                this.K = this.J;
            }
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            Point point = this.J;
            motionEventObtain.setLocation(point.x, point.y);
            this.D.d(motionEventObtain);
            motionEventObtain.recycle();
        }
    }

    @Override // com.daaw.InterfaceC3156aS1
    public final void zzk(List list, InterfaceC7934rX interfaceC7934rX, EO1 eo1) {
        s3(list, interfaceC7934rX, eo1, false);
    }

    @Override // com.daaw.InterfaceC3156aS1
    public final void zzl(List list, InterfaceC7934rX interfaceC7934rX, EO1 eo1) {
        t3(list, interfaceC7934rX, eo1, false);
    }
}
