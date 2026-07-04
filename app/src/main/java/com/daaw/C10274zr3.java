package com.daaw;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import com.google.android.gms.ads.nonagon.signalgeneration.zzam;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import com.google.android.gms.internal.ads.zzbzo;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.zr3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C10274zr3 implements InterfaceC6244lS2 {
    public final /* synthetic */ InterfaceFutureC8236sc0 a;
    public final /* synthetic */ zzbzo b;
    public final /* synthetic */ XR1 c;
    public final /* synthetic */ EI2 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ zzaa f;

    public C10274zr3(zzaa zzaaVar, InterfaceFutureC8236sc0 interfaceFutureC8236sc0, zzbzo zzbzoVar, XR1 xr1, EI2 ei2, long j) {
        this.f = zzaaVar;
        this.a = interfaceFutureC8236sc0;
        this.b = zzbzoVar;
        this.c = xr1;
        this.d = ei2;
        this.e = j;
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        zzam zzamVar = (zzam) obj;
        TI2 ti2F3 = zzaa.F3(this.a, this.b);
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.z7)).booleanValue()) {
            try {
                this.c.zzb("QueryInfo generation has been disabled.");
            } catch (RemoteException e) {
                AbstractC4274eT1.zzg("QueryInfo generation has been disabled.".concat(e.toString()));
            }
            if (!((Boolean) AbstractC7307pF1.e.e()).booleanValue() || ti2F3 == null) {
                return;
            }
            EI2 ei2 = this.d;
            ei2.o("QueryInfo generation has been disabled.");
            ei2.zzf(false);
            ti2F3.a(ei2);
            ti2F3.g();
            return;
        }
        long jA = zzt.zzB().a() - this.e;
        try {
            try {
                if (zzamVar == null) {
                    this.c.u0(null, null, null);
                    zzaa zzaaVar = this.f;
                    zzf.zzc(zzaaVar.N, zzaaVar.F, "sgs", new Pair("rid", "-1"));
                    this.d.zzf(true);
                    if (!((Boolean) AbstractC7307pF1.e.e()).booleanValue() || ti2F3 == null) {
                        return;
                    }
                    ti2F3.a(this.d);
                    ti2F3.g();
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(zzamVar.zzb);
                    String strOptString = jSONObject.optString(ProxyAmazonBillingActivity.EXTRAS_REQUEST_ID, "");
                    if (TextUtils.isEmpty(strOptString)) {
                        AbstractC4274eT1.zzj("The request ID is empty in request JSON.");
                        this.c.zzb("Internal error: request ID is empty in request JSON.");
                        zzaa zzaaVar2 = this.f;
                        zzf.zzc(zzaaVar2.N, zzaaVar2.F, "sgf", new Pair("sgf_reason", "rid_missing"));
                        EI2 ei22 = this.d;
                        ei22.o("Request ID empty");
                        ei22.zzf(false);
                        if (!((Boolean) AbstractC7307pF1.e.e()).booleanValue() || ti2F3 == null) {
                            return;
                        }
                        ti2F3.a(this.d);
                        ti2F3.g();
                        return;
                    }
                    zzaa zzaaVar3 = this.f;
                    zzaa.f3(zzaaVar3, strOptString, zzamVar.zzb, zzaaVar3.F);
                    Bundle bundle = zzamVar.zzc;
                    zzaa zzaaVar4 = this.f;
                    if (zzaaVar4.S && bundle != null && bundle.getInt(zzaaVar4.U, -1) == -1) {
                        zzaa zzaaVar5 = this.f;
                        bundle.putInt(zzaaVar5.U, zzaaVar5.V.get());
                    }
                    zzaa zzaaVar6 = this.f;
                    if (zzaaVar6.R && bundle != null && TextUtils.isEmpty(bundle.getString(zzaaVar6.T))) {
                        if (TextUtils.isEmpty(this.f.X)) {
                            zzaa zzaaVar7 = this.f;
                            com.google.android.gms.ads.internal.util.zzt zztVarZzp = zzt.zzp();
                            zzaa zzaaVar8 = this.f;
                            zzaaVar7.X = zztVarZzp.zzc(zzaaVar8.C, zzaaVar8.W.B);
                        }
                        zzaa zzaaVar9 = this.f;
                        bundle.putString(zzaaVar9.T, zzaaVar9.X);
                    }
                    this.c.u0(zzamVar.zza, zzamVar.zzb, bundle);
                    zzaa zzaaVar10 = this.f;
                    C1590Mj2 c1590Mj2 = zzaaVar10.N;
                    C0542Cj2 c0542Cj2 = zzaaVar10.F;
                    Pair pair = new Pair("tqgt", String.valueOf(jA));
                    String str = "na";
                    if (((Boolean) zzba.zzc().b(AbstractC9820yE1.m9)).booleanValue()) {
                        try {
                            str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                        } catch (JSONException e2) {
                            AbstractC4274eT1.zzh("Error retrieving JSONObject from the requestJson, ", e2);
                        }
                    }
                    zzf.zzc(c1590Mj2, c0542Cj2, "sgs", pair, new Pair("tpc", str));
                    this.d.zzf(true);
                    if (!((Boolean) AbstractC7307pF1.e.e()).booleanValue() || ti2F3 == null) {
                        return;
                    }
                    ti2F3.a(this.d);
                    ti2F3.g();
                } catch (JSONException e3) {
                    AbstractC4274eT1.zzj("Failed to create JSON object from the request string.");
                    this.c.zzb("Internal error for request JSON: " + e3.toString());
                    zzaa zzaaVar11 = this.f;
                    zzf.zzc(zzaaVar11.N, zzaaVar11.F, "sgf", new Pair("sgf_reason", "request_invalid"));
                    EI2 ei23 = this.d;
                    ei23.e(e3);
                    ei23.zzf(false);
                    zzt.zzo().u(e3, "SignalGeneratorImpl.generateSignals.onSuccess");
                    if (!((Boolean) AbstractC7307pF1.e.e()).booleanValue() || ti2F3 == null) {
                        return;
                    }
                    ti2F3.a(this.d);
                    ti2F3.g();
                }
            } catch (RemoteException e4) {
                EI2 ei24 = this.d;
                ei24.e(e4);
                ei24.zzf(false);
                AbstractC4274eT1.zzh("", e4);
                zzt.zzo().u(e4, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (!((Boolean) AbstractC7307pF1.e.e()).booleanValue() || ti2F3 == null) {
                    return;
                }
                ti2F3.a(this.d);
                ti2F3.g();
            }
        } catch (Throwable th) {
            if (((Boolean) AbstractC7307pF1.e.e()).booleanValue() && ti2F3 != null) {
                ti2F3.a(this.d);
                ti2F3.g();
            }
            throw th;
        }
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final void b(Throwable th) {
        long jA = zzt.zzB().a() - this.e;
        String message = th.getMessage();
        zzt.zzo().u(th, "SignalGeneratorImpl.generateSignals");
        zzaa zzaaVar = this.f;
        zzf.zzc(zzaaVar.N, zzaaVar.F, "sgf", new Pair("sgf_reason", message), new Pair("tqgt", String.valueOf(jA)));
        TI2 ti2F3 = zzaa.F3(this.a, this.b);
        if (((Boolean) AbstractC7307pF1.e.e()).booleanValue() && ti2F3 != null) {
            EI2 ei2 = this.d;
            ei2.e(th);
            ei2.zzf(false);
            ti2F3.a(ei2);
            ti2F3.g();
        }
        try {
            this.c.zzb("Internal error. " + message);
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
        }
    }
}
