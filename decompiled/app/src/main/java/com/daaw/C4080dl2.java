package com.daaw;

import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.internal.ads.zzbvg;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.dl2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4080dl2 implements U62, S82, S72 {
    public final C7447pl2 B;
    public final String C;
    public final String D;
    public K62 G;
    public zze H;
    public JSONObject L;
    public boolean M;
    public boolean N;
    public boolean O;
    public String I = "";
    public String J = "";
    public String K = "";
    public int E = 0;
    public EnumC3244al2 F = EnumC3244al2.AD_REQUESTED;

    public C4080dl2(C7447pl2 c7447pl2, FF2 ff2, String str) {
        this.B = c7447pl2;
        this.D = str;
        this.C = ff2.f;
    }

    public static JSONObject g(zze zzeVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", zzeVar.zzc);
        jSONObject.put("errorCode", zzeVar.zza);
        jSONObject.put("errorDescription", zzeVar.zzb);
        zze zzeVar2 = zzeVar.zzd;
        jSONObject.put("underlyingError", zzeVar2 == null ? null : g(zzeVar2));
        return jSONObject;
    }

    @Override // com.daaw.U62
    public final void P(zze zzeVar) {
        if (this.B.p()) {
            this.F = EnumC3244al2.AD_LOAD_FAILED;
            this.H = zzeVar;
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.d9)).booleanValue()) {
                this.B.f(this.C, this);
            }
        }
    }

    public final String a() {
        return this.D;
    }

    public final JSONObject b() throws JSONException {
        JSONObject jSONObjectH;
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.F);
        jSONObject.put("format", C4498fF2.a(this.E));
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.d9)).booleanValue()) {
            jSONObject.put("isOutOfContext", this.M);
            if (this.M) {
                jSONObject.put("shown", this.N);
            }
        }
        K62 k62 = this.G;
        if (k62 != null) {
            jSONObjectH = h(k62);
        } else {
            zze zzeVar = this.H;
            JSONObject jSONObjectH2 = null;
            if (zzeVar != null && (iBinder = zzeVar.zze) != null) {
                K62 k622 = (K62) iBinder;
                jSONObjectH2 = h(k622);
                if (k622.zzj().isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(g(this.H));
                    jSONObjectH2.put("errors", jSONArray);
                }
            }
            jSONObjectH = jSONObjectH2;
        }
        jSONObject.put("responseInfo", jSONObjectH);
        return jSONObject;
    }

    public final void c() {
        this.M = true;
    }

    public final void d() {
        this.N = true;
    }

    @Override // com.daaw.S72
    public final void e(AbstractC4448f42 abstractC4448f42) {
        if (this.B.p()) {
            this.G = abstractC4448f42.c();
            this.F = EnumC3244al2.AD_LOADED;
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.d9)).booleanValue()) {
                this.B.f(this.C, this);
            }
        }
    }

    public final boolean f() {
        return this.F != EnumC3244al2.AD_REQUESTED;
    }

    public final JSONObject h(K62 k62) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", k62.zzg());
        jSONObject.put("responseSecsSinceEpoch", k62.zzc());
        jSONObject.put("responseId", k62.zzi());
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.W8)).booleanValue()) {
            String strZzd = k62.zzd();
            if (!TextUtils.isEmpty(strZzd)) {
                AbstractC4274eT1.zze("Bidding data: ".concat(String.valueOf(strZzd)));
                jSONObject.put("biddingData", new JSONObject(strZzd));
            }
        }
        if (!TextUtils.isEmpty(this.I)) {
            jSONObject.put("adRequestUrl", this.I);
        }
        if (!TextUtils.isEmpty(this.J)) {
            jSONObject.put("postBody", this.J);
        }
        if (!TextUtils.isEmpty(this.K)) {
            jSONObject.put("adResponseBody", this.K);
        }
        Object obj = this.L;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.Z8)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.O);
        }
        JSONArray jSONArray = new JSONArray();
        for (zzu zzuVar : k62.zzj()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", zzuVar.zza);
            jSONObject2.put("latencyMillis", zzuVar.zzb);
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.X8)).booleanValue()) {
                jSONObject2.put("credentials", zzay.zzb().l(zzuVar.zzd));
            }
            zze zzeVar = zzuVar.zzc;
            jSONObject2.put("error", zzeVar == null ? null : g(zzeVar));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // com.daaw.S82
    public final void t0(C9267wF2 c9267wF2) {
        if (this.B.p()) {
            if (!c9267wF2.b.a.isEmpty()) {
                this.E = ((C4498fF2) c9267wF2.b.a.get(0)).b;
            }
            if (!TextUtils.isEmpty(c9267wF2.b.b.k)) {
                this.I = c9267wF2.b.b.k;
            }
            if (!TextUtils.isEmpty(c9267wF2.b.b.l)) {
                this.J = c9267wF2.b.b.l;
            }
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.Z8)).booleanValue()) {
                if (!this.B.r()) {
                    this.O = true;
                    return;
                }
                if (!TextUtils.isEmpty(c9267wF2.b.b.m)) {
                    this.K = c9267wF2.b.b.m;
                }
                if (c9267wF2.b.b.n.length() > 0) {
                    this.L = c9267wF2.b.b.n;
                }
                C7447pl2 c7447pl2 = this.B;
                JSONObject jSONObject = this.L;
                int length = jSONObject != null ? jSONObject.toString().length() : 0;
                if (!TextUtils.isEmpty(this.K)) {
                    length += this.K.length();
                }
                c7447pl2.j(length);
            }
        }
    }

    @Override // com.daaw.S82
    public final void v0(zzbvg zzbvgVar) {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.d9)).booleanValue() || !this.B.p()) {
            return;
        }
        this.B.f(this.C, this);
    }
}
