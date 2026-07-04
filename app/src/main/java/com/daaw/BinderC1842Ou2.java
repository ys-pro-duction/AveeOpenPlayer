package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.Ou2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC1842Ou2 extends AbstractBinderC3415bN1 {
    public final String B;
    public final ZM1 C;
    public final BT1 D;
    public final JSONObject E;
    public final long F;
    public boolean G;

    public BinderC1842Ou2(String str, ZM1 zm1, BT1 bt1, long j) {
        JSONObject jSONObject = new JSONObject();
        this.E = jSONObject;
        this.G = false;
        this.D = bt1;
        this.B = str;
        this.C = zm1;
        this.F = j;
        try {
            jSONObject.put("adapter_version", zm1.zzf().toString());
            jSONObject.put("sdk_version", zm1.zzg().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    public static synchronized void Z2(String str, BT1 bt1) {
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("name", str);
                jSONObject.put("signal_error", "Adapter failed to instantiate");
                if (((Boolean) zzba.zzc().b(AbstractC9820yE1.y1)).booleanValue()) {
                    jSONObject.put("signal_error_code", 1);
                }
                bt1.b(jSONObject);
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.daaw.InterfaceC3693cN1
    public final synchronized void T(zze zzeVar) {
        a3(zzeVar.zzb, 2);
    }

    @Override // com.daaw.InterfaceC3693cN1
    public final synchronized void a(String str) {
        if (this.G) {
            return;
        }
        if (str == null) {
            e("Adapter returned null signals");
            return;
        }
        try {
            this.E.put("signals", str);
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.z1)).booleanValue()) {
                this.E.put("latency", zzt.zzB().b() - this.F);
            }
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.y1)).booleanValue()) {
                this.E.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.D.b(this.E);
        this.G = true;
    }

    public final synchronized void a3(String str, int i) {
        try {
            if (this.G) {
                return;
            }
            try {
                this.E.put("signal_error", str);
                if (((Boolean) zzba.zzc().b(AbstractC9820yE1.z1)).booleanValue()) {
                    this.E.put("latency", zzt.zzB().b() - this.F);
                }
                if (((Boolean) zzba.zzc().b(AbstractC9820yE1.y1)).booleanValue()) {
                    this.E.put("signal_error_code", i);
                }
            } catch (JSONException unused) {
            }
            this.D.b(this.E);
            this.G = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.daaw.InterfaceC3693cN1
    public final synchronized void e(String str) {
        a3(str, 2);
    }

    public final synchronized void zzc() {
        a3("Signal collection timeout.", 3);
    }

    public final synchronized void zzd() {
        if (this.G) {
            return;
        }
        try {
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.y1)).booleanValue()) {
                this.E.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.D.b(this.E);
        this.G = true;
    }
}
