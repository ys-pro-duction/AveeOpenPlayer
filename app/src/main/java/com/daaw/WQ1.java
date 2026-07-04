package com.daaw;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.ads.internal.util.zzbq;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbxr;
import com.google.android.gms.internal.ads.zzcaz;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class WQ1 implements InterfaceC3152aR1 {
    public static final List m = DesugarCollections.synchronizedList(new ArrayList());
    public final C6432m63 a;
    public final LinkedHashMap b;
    public final Context e;
    public boolean f;
    public final zzbxr g;
    public final XQ1 l;
    public final List c = new ArrayList();
    public final List d = new ArrayList();
    public final Object h = new Object();
    public HashSet i = new HashSet();
    public boolean j = false;
    public boolean k = false;

    public WQ1(Context context, zzcaz zzcazVar, zzbxr zzbxrVar, String str, XQ1 xq1) {
        AbstractC7506py0.m(zzbxrVar, "SafeBrowsing config is not present.");
        this.e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.b = new LinkedHashMap();
        this.l = xq1;
        this.g = zzbxrVar;
        Iterator it = zzbxrVar.F.iterator();
        while (it.hasNext()) {
            this.i.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.i.remove("cookie".toLowerCase(Locale.ENGLISH));
        C6432m63 c6432m63M = C5870k73.M();
        c6432m63M.C(9);
        c6432m63M.y(str);
        c6432m63M.w(str);
        C6711n63 c6711n63M = C6990o63.M();
        String str2 = this.g.B;
        if (str2 != null) {
            c6711n63M.n(str2);
        }
        c6432m63M.v((C6990o63) c6711n63M.j());
        C4185e73 c4185e73M = C4464f73.M();
        c4185e73M.p(C6878nj1.a(this.e).g());
        String str3 = zzcazVar.B;
        if (str3 != null) {
            c4185e73M.n(str3);
        }
        long jA = C9599xT.f().a(this.e);
        if (jA > 0) {
            c4185e73M.o(jA);
        }
        c6432m63M.u((C4464f73) c4185e73M.j());
        this.a = c6432m63M;
    }

    @Override // com.daaw.InterfaceC3152aR1
    public final void a(String str, Map map, int i) {
        synchronized (this.h) {
            if (i == 3) {
                try {
                    this.k = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.b.containsKey(str)) {
                if (i == 3) {
                    ((C3628c73) this.b.get(str)).t(4);
                }
                return;
            }
            C3628c73 c3628c73N = C3907d73.N();
            int iA = AbstractC3350b73.a(i);
            if (iA != 0) {
                c3628c73N.t(iA);
            }
            c3628c73N.o(this.b.size());
            c3628c73N.r(str);
            C10065z63 c10065z63M = C63.M();
            if (!this.i.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.i.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        C9507x63 c9507x63M = C9786y63.M();
                        c9507x63M.n(AbstractC9213w33.U(str2));
                        c9507x63M.o(AbstractC9213w33.U(str3));
                        c10065z63M.n((C9786y63) c9507x63M.j());
                    }
                }
            }
            c3628c73N.p((C63) c10065z63M.j());
            this.b.put(str, c3628c73N);
        }
    }

    @Override // com.daaw.InterfaceC3152aR1
    public final void b(View view) {
        Bitmap bitmapCreateBitmap;
        if (this.g.D && !this.j) {
            zzt.zzp();
            final Bitmap bitmap = null;
            if (view != null) {
                try {
                    boolean zIsDrawingCacheEnabled = view.isDrawingCacheEnabled();
                    view.setDrawingCacheEnabled(true);
                    Bitmap drawingCache = view.getDrawingCache();
                    bitmapCreateBitmap = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
                    try {
                        view.setDrawingCacheEnabled(zIsDrawingCacheEnabled);
                    } catch (RuntimeException e) {
                        e = e;
                        AbstractC4274eT1.zzh("Fail to capture the web view", e);
                    }
                } catch (RuntimeException e2) {
                    e = e2;
                    bitmapCreateBitmap = null;
                }
                if (bitmapCreateBitmap == null) {
                    try {
                        int width = view.getWidth();
                        int height = view.getHeight();
                        if (width == 0 || height == 0) {
                            AbstractC4274eT1.zzj("Width or height of view is zero");
                        } else {
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                            Canvas canvas = new Canvas(bitmapCreateBitmap2);
                            view.layout(0, 0, width, height);
                            view.draw(canvas);
                            bitmap = bitmapCreateBitmap2;
                        }
                    } catch (RuntimeException e3) {
                        AbstractC4274eT1.zzh("Fail to capture the webview", e3);
                    }
                } else {
                    bitmap = bitmapCreateBitmap;
                }
            }
            if (bitmap == null) {
                ZQ1.a("Failed to capture the webview bitmap.");
                return;
            }
            this.j = true;
            Runnable runnable = new Runnable() { // from class: com.daaw.SQ1
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.e(bitmap);
                }
            };
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                runnable.run();
            } else {
                AbstractC9322wT1.a.execute(runnable);
            }
        }
    }

    public final /* synthetic */ InterfaceFutureC8236sc0 c(Map map) {
        C3628c73 c3628c73;
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0M;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray jSONArrayOptJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (jSONArrayOptJSONArray != null) {
                        synchronized (this.h) {
                            try {
                                int length = jSONArrayOptJSONArray.length();
                                synchronized (this.h) {
                                    c3628c73 = (C3628c73) this.b.get(str);
                                }
                                if (c3628c73 == null) {
                                    ZQ1.a("Cannot find the corresponding resource object for " + str);
                                } else {
                                    for (int i = 0; i < length; i++) {
                                        c3628c73.n(jSONArrayOptJSONArray.getJSONObject(i).getString("threat_type"));
                                    }
                                    this.f = (length > 0) | this.f;
                                }
                            } finally {
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                if (((Boolean) JF1.b.e()).booleanValue()) {
                    AbstractC4274eT1.zzf("Failed to get SafeBrowsing metadata", e);
                }
                return AbstractC7360pS2.g(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.f) {
            synchronized (this.h) {
                this.a.C(10);
            }
        }
        boolean z = this.f;
        if (!(z && this.g.H) && (!(this.k && this.g.G) && (z || !this.g.E))) {
            return AbstractC7360pS2.h(null);
        }
        synchronized (this.h) {
            try {
                Iterator it = this.b.values().iterator();
                while (it.hasNext()) {
                    this.a.p((C3907d73) ((C3628c73) it.next()).j());
                }
                this.a.n(this.c);
                this.a.o(this.d);
                if (ZQ1.b()) {
                    StringBuilder sb = new StringBuilder("Sending SB report\n  url: " + this.a.A() + "\n  clickUrl: " + this.a.z() + "\n  resources: \n");
                    for (C3907d73 c3907d73 : this.a.B()) {
                        sb.append("    [");
                        sb.append(c3907d73.M());
                        sb.append("] ");
                        sb.append(c3907d73.P());
                    }
                    ZQ1.a(sb.toString());
                }
                InterfaceFutureC8236sc0 interfaceFutureC8236sc0Zzb = new zzbq(this.e).zzb(1, this.g.C, null, ((C5870k73) this.a.j()).h());
                if (ZQ1.b()) {
                    interfaceFutureC8236sc0Zzb.g(new Runnable() { // from class: com.daaw.TQ1
                        @Override // java.lang.Runnable
                        public final void run() {
                            ZQ1.a("Pinged SB successfully.");
                        }
                    }, AbstractC9322wT1.a);
                }
                interfaceFutureC8236sc0M = AbstractC7360pS2.m(interfaceFutureC8236sc0Zzb, new WN2() { // from class: com.daaw.UQ1
                    @Override // com.daaw.WN2
                    public final Object apply(Object obj) {
                        List list = WQ1.m;
                        return null;
                    }
                }, AbstractC9322wT1.f);
            } finally {
            }
        }
        return interfaceFutureC8236sc0M;
    }

    public final /* synthetic */ void e(Bitmap bitmap) {
        C8369t33 c8369t33R = AbstractC9213w33.R();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, c8369t33R);
        synchronized (this.h) {
            C6432m63 c6432m63 = this.a;
            V63 v63M = X63.M();
            v63M.n(c8369t33R.c());
            v63M.o("image/png");
            v63M.p(2);
            c6432m63.x((X63) v63M.j());
        }
    }

    @Override // com.daaw.InterfaceC3152aR1
    public final zzbxr zza() {
        return this.g;
    }

    @Override // com.daaw.InterfaceC3152aR1
    public final void zze() {
        synchronized (this.h) {
            this.b.keySet();
            InterfaceFutureC8236sc0 interfaceFutureC8236sc0H = AbstractC7360pS2.h(Collections.EMPTY_MAP);
            WR2 wr2 = new WR2() { // from class: com.daaw.RQ1
                @Override // com.daaw.WR2
                public final InterfaceFutureC8236sc0 zza(Object obj) {
                    return this.a.c((Map) obj);
                }
            };
            PS2 ps2 = AbstractC9322wT1.f;
            InterfaceFutureC8236sc0 interfaceFutureC8236sc0N = AbstractC7360pS2.n(interfaceFutureC8236sc0H, wr2, ps2);
            InterfaceFutureC8236sc0 interfaceFutureC8236sc0O = AbstractC7360pS2.o(interfaceFutureC8236sc0N, 10L, TimeUnit.SECONDS, AbstractC9322wT1.d);
            AbstractC7360pS2.r(interfaceFutureC8236sc0N, new VQ1(this, interfaceFutureC8236sc0O), ps2);
            m.add(interfaceFutureC8236sc0O);
        }
    }

    @Override // com.daaw.InterfaceC3152aR1
    public final void zzh(String str) {
        synchronized (this.h) {
            try {
                if (str == null) {
                    this.a.r();
                } else {
                    this.a.t(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.daaw.InterfaceC3152aR1
    public final boolean zzi() {
        return AbstractC7494pv0.d() && this.g.D && !this.j;
    }
}
