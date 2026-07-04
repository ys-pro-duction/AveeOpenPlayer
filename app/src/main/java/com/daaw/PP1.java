package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzcaz;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class PP1 extends QP1 {
    public final Object a = new Object();
    public final Context b;
    public SharedPreferences c;
    public final InterfaceC4810gL1 d;

    public PP1(Context context, InterfaceC4810gL1 interfaceC4810gL1) {
        this.b = context.getApplicationContext();
        this.d = interfaceC4810gL1;
    }

    public static JSONObject c(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", zzcaz.e().B);
            jSONObject.put("mf", BF1.a.e());
            jSONObject.put("cl", "575948185");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 12451000);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.c(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", 12451000);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.daaw.QP1
    public final InterfaceFutureC8236sc0 a() {
        synchronized (this.a) {
            try {
                if (this.c == null) {
                    this.c = this.b.getSharedPreferences("google_ads_flags_meta", 0);
                }
            } finally {
            }
        }
        if (zzt.zzB().a() - this.c.getLong("js_last_update", 0L) < ((Long) BF1.b.e()).longValue()) {
            return AbstractC7360pS2.h(null);
        }
        return AbstractC7360pS2.m(this.d.a(c(this.b)), new WN2() { // from class: com.daaw.OP1
            @Override // com.daaw.WN2
            public final Object apply(Object obj) {
                this.a.b((JSONObject) obj);
                return null;
            }
        }, AbstractC9322wT1.f);
    }

    public final /* synthetic */ Void b(JSONObject jSONObject) {
        AbstractC7582qE1 abstractC7582qE1 = AbstractC9820yE1.a;
        zzba.zzb();
        SharedPreferences.Editor editorEdit = C8139sE1.a(this.b).edit();
        zzba.zza();
        C5344iF1 c5344iF1 = AbstractC6749nF1.a;
        zzba.zza().e(editorEdit, 1, jSONObject);
        zzba.zzb();
        editorEdit.commit();
        this.c.edit().putLong("js_last_update", zzt.zzB().a()).apply();
        return null;
    }
}
