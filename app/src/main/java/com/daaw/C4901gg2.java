package com.daaw;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzel;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzbw;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbfc;
import com.google.android.gms.internal.ads.zzcaz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.gg2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4901gg2 {
    public final Context a;
    public final C1471Lf2 b;
    public final C7782qx1 c;
    public final zzcaz d;
    public final zza e;
    public final C6454mB1 f;
    public final Executor g;
    public final zzbfc h;
    public final C0530Cg2 i;
    public final C2958Zh2 j;
    public final ScheduledExecutorService k;
    public final C7706qh2 l;
    public final C1071Hj2 m;
    public final InterfaceC6483mI2 n;
    public final C6487mJ2 o;
    public final C6077kq2 p;
    public final BinderC9431wq2 q;

    public C4901gg2(Context context, C1471Lf2 c1471Lf2, C7782qx1 c7782qx1, zzcaz zzcazVar, zza zzaVar, C6454mB1 c6454mB1, Executor executor, FF2 ff2, C0530Cg2 c0530Cg2, C2958Zh2 c2958Zh2, ScheduledExecutorService scheduledExecutorService, C1071Hj2 c1071Hj2, InterfaceC6483mI2 interfaceC6483mI2, C6487mJ2 c6487mJ2, C6077kq2 c6077kq2, C7706qh2 c7706qh2, BinderC9431wq2 binderC9431wq2) {
        this.a = context;
        this.b = c1471Lf2;
        this.c = c7782qx1;
        this.d = zzcazVar;
        this.e = zzaVar;
        this.f = c6454mB1;
        this.g = executor;
        this.h = ff2.i;
        this.i = c0530Cg2;
        this.j = c2958Zh2;
        this.k = scheduledExecutorService;
        this.m = c1071Hj2;
        this.n = interfaceC6483mI2;
        this.o = c6487mJ2;
        this.p = c6077kq2;
        this.l = c7706qh2;
        this.q = binderC9431wq2;
    }

    public static final zzel i(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("mute");
        if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return r(jSONObjectOptJSONObject);
    }

    public static final List j(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mute");
        if (jSONObjectOptJSONObject == null) {
            return OP2.J();
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("reasons");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return OP2.J();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            zzel zzelVarR = r(jSONArrayOptJSONArray.optJSONObject(i));
            if (zzelVarR != null) {
                arrayList.add(zzelVarR);
            }
        }
        return OP2.H(arrayList);
    }

    public static InterfaceFutureC8236sc0 l(InterfaceFutureC8236sc0 interfaceFutureC8236sc0, Object obj) {
        final Object obj2 = null;
        return AbstractC7360pS2.f(interfaceFutureC8236sc0, Exception.class, new WR2(obj2) { // from class: com.daaw.eg2
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj3) {
                zze.zzb("Error during loading assets.", (Exception) obj3);
                return AbstractC7360pS2.h(null);
            }
        }, AbstractC9322wT1.f);
    }

    public static InterfaceFutureC8236sc0 m(boolean z, final InterfaceFutureC8236sc0 interfaceFutureC8236sc0, Object obj) {
        return z ? AbstractC7360pS2.n(interfaceFutureC8236sc0, new WR2() { // from class: com.daaw.fg2
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj2) {
                return obj2 != null ? interfaceFutureC8236sc0 : AbstractC7360pS2.g(new C6092kt2(1, "Retrieve required value in native ad response failed."));
            }
        }, AbstractC9322wT1.f) : l(interfaceFutureC8236sc0, null);
    }

    public static Integer q(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final zzel r(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("reason");
        String strOptString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return null;
        }
        return new zzel(strOptString, strOptString2);
    }

    public final /* synthetic */ XF1 a(JSONObject jSONObject, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String strOptString = jSONObject.optString("text");
        Integer numQ = q(jSONObject, "bg_color");
        Integer numQ2 = q(jSONObject, "text_color");
        int iOptInt = jSONObject.optInt("text_size", -1);
        boolean zOptBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int iOptInt2 = jSONObject.optInt("animation_ms", 1000);
        return new XF1(strOptString, list, numQ, numQ2, iOptInt > 0 ? Integer.valueOf(iOptInt) : null, jSONObject.optInt("presentation_ms", 4000) + iOptInt2, this.h.F, zOptBoolean);
    }

    public final /* synthetic */ InterfaceFutureC8236sc0 b(zzq zzqVar, C4498fF2 c4498fF2, C5622jF2 c5622jF2, String str, String str2, Object obj) {
        InterfaceC9334wW1 interfaceC9334wW1A = this.j.a(zzqVar, c4498fF2, c5622jF2);
        final AT1 at1D = AT1.d(interfaceC9334wW1A);
        C6869nh2 c6869nh2B = this.l.b();
        interfaceC9334wW1A.zzN().O(c6869nh2B, c6869nh2B, c6869nh2B, c6869nh2B, c6869nh2B, false, null, new zzb(this.a, null, null), null, null, this.p, this.o, this.m, this.n, null, c6869nh2B, null, null, null);
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.C3)).booleanValue()) {
            interfaceC9334wW1A.C("/getNativeAdViewSignals", GI1.s);
        }
        interfaceC9334wW1A.C("/getNativeClickMeta", GI1.t);
        interfaceC9334wW1A.zzN().I(new InterfaceC7379pX1() { // from class: com.daaw.ag2
            @Override // com.daaw.InterfaceC7379pX1
            public final void zza(boolean z, int i, String str3, String str4) {
                AT1 at1 = at1D;
                if (z) {
                    at1.e();
                    return;
                }
                at1.c(new C6092kt2(1, "Image Web View failed to load. Error code: " + i + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        interfaceC9334wW1A.n0(str, str2, null);
        return at1D;
    }

    public final /* synthetic */ InterfaceFutureC8236sc0 c(String str, Object obj) throws JW1 {
        zzt.zzz();
        InterfaceC9334wW1 interfaceC9334wW1A = KW1.a(this.a, C8494tX1.a(), "native-omid", false, false, this.c, null, this.d, null, null, this.e, this.f, null, null, this.q);
        final AT1 at1D = AT1.d(interfaceC9334wW1A);
        interfaceC9334wW1A.zzN().I(new InterfaceC7379pX1() { // from class: com.daaw.cg2
            @Override // com.daaw.InterfaceC7379pX1
            public final void zza(boolean z, int i, String str2, String str3) {
                at1D.e();
            }
        });
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.V4)).booleanValue()) {
            interfaceC9334wW1A.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
            return at1D;
        }
        interfaceC9334wW1A.loadData(str, "text/html", "UTF-8");
        return at1D;
    }

    public final InterfaceFutureC8236sc0 d(JSONObject jSONObject, String str) {
        final JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("attribution");
        if (jSONObjectOptJSONObject == null) {
            return AbstractC7360pS2.h(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("images");
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("image");
        if (jSONArrayOptJSONArray == null && jSONObjectOptJSONObject2 != null) {
            jSONArrayOptJSONArray = new JSONArray();
            jSONArrayOptJSONArray.put(jSONObjectOptJSONObject2);
        }
        return m(jSONObjectOptJSONObject.optBoolean("require"), AbstractC7360pS2.m(o(jSONArrayOptJSONArray, false, true), new WN2() { // from class: com.daaw.dg2
            @Override // com.daaw.WN2
            public final Object apply(Object obj) {
                return this.a.a(jSONObjectOptJSONObject, (List) obj);
            }
        }, this.g), null);
    }

    public final InterfaceFutureC8236sc0 e(JSONObject jSONObject, String str) {
        return n(jSONObject.optJSONObject(str), this.h.C);
    }

    public final InterfaceFutureC8236sc0 f(JSONObject jSONObject, String str) {
        zzbfc zzbfcVar = this.h;
        return o(jSONObject.optJSONArray("images"), zzbfcVar.C, zzbfcVar.E);
    }

    public final InterfaceFutureC8236sc0 g(JSONObject jSONObject, String str, final C4498fF2 c4498fF2, final C5622jF2 c5622jF2) {
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.t9)).booleanValue()) {
            return AbstractC7360pS2.h(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return AbstractC7360pS2.h(null);
        }
        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
        if (jSONObjectOptJSONObject == null) {
            return AbstractC7360pS2.h(null);
        }
        final String strOptString = jSONObjectOptJSONObject.optString("base_url");
        final String strOptString2 = jSONObjectOptJSONObject.optString("html");
        final zzq zzqVarK = k(jSONObjectOptJSONObject.optInt("width", 0), jSONObjectOptJSONObject.optInt("height", 0));
        if (TextUtils.isEmpty(strOptString2)) {
            return AbstractC7360pS2.h(null);
        }
        final InterfaceFutureC8236sc0 interfaceFutureC8236sc0N = AbstractC7360pS2.n(AbstractC7360pS2.h(null), new WR2() { // from class: com.daaw.Yf2
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                return this.a.b(zzqVarK, c4498fF2, c5622jF2, strOptString, strOptString2, obj);
            }
        }, AbstractC9322wT1.e);
        return AbstractC7360pS2.n(interfaceFutureC8236sc0N, new WR2() { // from class: com.daaw.Zf2
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) throws C6092kt2 {
                if (((InterfaceC9334wW1) obj) != null) {
                    return interfaceFutureC8236sc0N;
                }
                throw new C6092kt2(1, "Retrieve Web View from image ad response failed.");
            }
        }, AbstractC9322wT1.f);
    }

    public final InterfaceFutureC8236sc0 h(JSONObject jSONObject, C4498fF2 c4498fF2, C5622jF2 c5622jF2) {
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0A;
        JSONObject jSONObjectZzg = zzbw.zzg(jSONObject, "html_containers", "instream");
        if (jSONObjectZzg != null) {
            return p(jSONObjectZzg, c4498fF2, c5622jF2);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("video");
        if (jSONObjectOptJSONObject == null) {
            return AbstractC7360pS2.h(null);
        }
        String strOptString = jSONObjectOptJSONObject.optString("vast_xml");
        boolean z = false;
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.s9)).booleanValue() && jSONObjectOptJSONObject.has("html")) {
            z = true;
        }
        if (!TextUtils.isEmpty(strOptString)) {
            if (!z) {
                interfaceFutureC8236sc0A = this.i.a(jSONObjectOptJSONObject);
            }
            return l(AbstractC7360pS2.o(interfaceFutureC8236sc0A, ((Integer) zzba.zzc().b(AbstractC9820yE1.D3)).intValue(), TimeUnit.SECONDS, this.k), null);
        }
        if (!z) {
            AbstractC4274eT1.zzj("Required field 'vast_xml' or 'html' is missing");
            return AbstractC7360pS2.h(null);
        }
        interfaceFutureC8236sc0A = p(jSONObjectOptJSONObject, c4498fF2, c5622jF2);
        return l(AbstractC7360pS2.o(interfaceFutureC8236sc0A, ((Integer) zzba.zzc().b(AbstractC9820yE1.D3)).intValue(), TimeUnit.SECONDS, this.k), null);
    }

    public final zzq k(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                return zzq.zzc();
            }
            i = 0;
        }
        return new zzq(this.a, new AdSize(i, i2));
    }

    public final InterfaceFutureC8236sc0 n(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return AbstractC7360pS2.h(null);
        }
        final String strOptString = jSONObject.optString("url");
        if (TextUtils.isEmpty(strOptString)) {
            return AbstractC7360pS2.h(null);
        }
        final double dOptDouble = jSONObject.optDouble("scale", 1.0d);
        boolean zOptBoolean = jSONObject.optBoolean("is_transparent", true);
        final int iOptInt = jSONObject.optInt("width", -1);
        final int iOptInt2 = jSONObject.optInt("height", -1);
        if (z) {
            return AbstractC7360pS2.h(new BinderC4501fG1(null, Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2));
        }
        return m(jSONObject.optBoolean("require"), AbstractC7360pS2.m(this.b.b(strOptString, dOptDouble, zOptBoolean), new WN2() { // from class: com.daaw.Wf2
            @Override // com.daaw.WN2
            public final Object apply(Object obj) {
                return new BinderC4501fG1(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2);
            }
        }, this.g), null);
    }

    public final InterfaceFutureC8236sc0 o(JSONArray jSONArray, boolean z, boolean z2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return AbstractC7360pS2.h(Collections.EMPTY_LIST);
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            arrayList.add(n(jSONArray.optJSONObject(i), z));
        }
        return AbstractC7360pS2.m(AbstractC7360pS2.d(arrayList), new WN2() { // from class: com.daaw.bg2
            @Override // com.daaw.WN2
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (BinderC4501fG1 binderC4501fG1 : (List) obj) {
                    if (binderC4501fG1 != null) {
                        arrayList2.add(binderC4501fG1);
                    }
                }
                return arrayList2;
            }
        }, this.g);
    }

    public final InterfaceFutureC8236sc0 p(JSONObject jSONObject, C4498fF2 c4498fF2, C5622jF2 c5622jF2) {
        final InterfaceFutureC8236sc0 interfaceFutureC8236sc0B = this.i.b(jSONObject.optString("base_url"), jSONObject.optString("html"), c4498fF2, c5622jF2, k(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
        return AbstractC7360pS2.n(interfaceFutureC8236sc0B, new WR2() { // from class: com.daaw.Xf2
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) throws C6092kt2 {
                InterfaceC9334wW1 interfaceC9334wW1 = (InterfaceC9334wW1) obj;
                if (interfaceC9334wW1 == null || interfaceC9334wW1.zzq() == null) {
                    throw new C6092kt2(1, "Retrieve video view in html5 ad response failed.");
                }
                return interfaceFutureC8236sc0B;
            }
        }, AbstractC9322wT1.f);
    }
}
