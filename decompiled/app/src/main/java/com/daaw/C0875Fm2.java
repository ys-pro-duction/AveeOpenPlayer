package com.daaw;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzc;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcaz;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.Fm2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0875Fm2 {
    public final AbstractC10175zX1 a;
    public final Context b;
    public final zzcaz c;
    public final FF2 d;
    public final Executor e;
    public final String f;
    public final TI2 g;
    public final WF2 h;
    public final C0542Cj2 i;

    public C0875Fm2(AbstractC10175zX1 abstractC10175zX1, Context context, zzcaz zzcazVar, FF2 ff2, Executor executor, String str, TI2 ti2, C0542Cj2 c0542Cj2) {
        this.a = abstractC10175zX1;
        this.b = context;
        this.c = zzcazVar;
        this.d = ff2;
        this.e = executor;
        this.f = str;
        this.g = ti2;
        this.h = abstractC10175zX1.A();
        this.i = c0542Cj2;
    }

    public static final String e(String str) {
        try {
            return new JSONObject(str).optString(ProxyAmazonBillingActivity.EXTRAS_REQUEST_ID, "");
        } catch (JSONException unused) {
            return "";
        }
    }

    public final InterfaceFutureC8236sc0 a() {
        String strB = this.d.d.zzx;
        if (!TextUtils.isEmpty(strB)) {
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.T6)).booleanValue()) {
                String strE = e(strB);
                AbstractC7582qE1 abstractC7582qE1 = AbstractC9820yE1.f7;
                if (((Boolean) zzba.zzc().b(abstractC7582qE1)).booleanValue() && strE.isEmpty()) {
                    int iLastIndexOf = strB.lastIndexOf("&request_id=");
                    strE = iLastIndexOf != -1 ? strB.substring(iLastIndexOf + 12) : "";
                }
                if (TextUtils.isEmpty(strE)) {
                    return AbstractC7360pS2.g(new C6092kt2(15, "Invalid ad string."));
                }
                String strZzb = this.a.s().zzb(strE, this.i);
                if (((Boolean) zzba.zzc().b(abstractC7582qE1)).booleanValue()) {
                    C0542Cj2 c0542Cj2 = this.i;
                    if (!TextUtils.isEmpty(strZzb)) {
                        Boolean bool = new JSONObject(strZzb).optString("is_gbid").equals("true") ? Boolean.TRUE : Boolean.FALSE;
                        if (bool.booleanValue()) {
                            int iLastIndexOf2 = strB.lastIndexOf("&");
                            String string = null;
                            String strSubstring = iLastIndexOf2 != -1 ? strB.substring(0, iLastIndexOf2) : null;
                            if (!TextUtils.isEmpty(strSubstring)) {
                                try {
                                    byte[] bArrDecode = Base64.decode(strSubstring, 11);
                                    byte[] bytes = strE.getBytes("UTF-8");
                                    try {
                                        string = new JSONObject(strZzb).getString("arek");
                                    } catch (JSONException e) {
                                        zze.zza("Failed to get key from QueryJSONMap".concat(e.toString()));
                                        zzt.zzo().u(e, "CryptoUtils.getKeyFromQueryJsonMap");
                                    }
                                    strB = WF2.b(bArrDecode, bytes, string, c0542Cj2);
                                } catch (UnsupportedEncodingException e2) {
                                    zze.zza("Failed to decode the adResponse. ".concat(e2.toString()));
                                    zzt.zzo().u(e2, "PreloadedLoader.decryptAdResponseIfNecessary");
                                }
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(strZzb)) {
                    return c(strB, d(strZzb));
                }
            }
        }
        zzc zzcVar = this.d.d.zzs;
        if (zzcVar != null) {
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.R6)).booleanValue()) {
                String str = zzcVar.zza;
                String str2 = zzcVar.zzb;
                String strE2 = e(str);
                String strE3 = e(str2);
                if (TextUtils.isEmpty(strE3) || !strE2.equals(strE3)) {
                    this.i.a().put("ridmm", "true");
                } else {
                    this.a.s().zzf(strE2);
                    this.i.a().put("rid", strE2);
                }
            }
            return c(zzcVar.zza, d(zzcVar.zzb));
        }
        return AbstractC7360pS2.g(new C6092kt2(14, "Mismatch request IDs."));
    }

    public final /* synthetic */ InterfaceFutureC8236sc0 b(JSONObject jSONObject) {
        return AbstractC7360pS2.h(new C9267wF2(new C8423tF2(this.d), C8988vF2.a(new StringReader(jSONObject.toString()))));
    }

    public final InterfaceFutureC8236sc0 c(final String str, final String str2) {
        EI2 ei2A = DI2.a(this.b, 11);
        ei2A.zzh();
        C9011vL1 c9011vL1A = zzt.zzf().a(this.b, this.c, this.a.D());
        InterfaceC5927kL1 interfaceC5927kL1 = AbstractC6773nL1.b;
        final InterfaceC4810gL1 interfaceC4810gL1A = c9011vL1A.a("google.afma.response.normalize", interfaceC5927kL1, interfaceC5927kL1);
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0N = AbstractC7360pS2.n(AbstractC7360pS2.n(AbstractC7360pS2.n(AbstractC7360pS2.h(""), new WR2() { // from class: com.daaw.Cm2
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) throws JSONException {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                String str3 = str;
                String str4 = str2;
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put("body", str3);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str4));
                    jSONObject.put("request", jSONObject2);
                    jSONObject.put("response", jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return AbstractC7360pS2.h(jSONObject);
                } catch (JSONException e) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e.getCause())));
                }
            }
        }, this.e), new WR2() { // from class: com.daaw.Dm2
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                return interfaceC4810gL1A.a((JSONObject) obj);
            }
        }, this.e), new WR2() { // from class: com.daaw.Em2
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                return this.a.b((JSONObject) obj);
            }
        }, this.e);
        SI2.a(interfaceFutureC8236sc0N, this.g, ei2A);
        return interfaceFutureC8236sc0N;
    }

    public final String d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.f));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            AbstractC4274eT1.zzj("Failed to update the ad types for rendering. ".concat(e.toString()));
            return str;
        }
    }
}
