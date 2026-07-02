package com.daaw;

import com.google.android.gms.ads.internal.client.zzay;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.qK1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC7606qK1 {
    public static void a(InterfaceC7884rK1 interfaceC7884rK1, String str, Map map) {
        try {
            interfaceC7884rK1.l(str, zzay.zzb().m(map));
        } catch (JSONException unused) {
            AbstractC4274eT1.zzj("Could not convert parameters to JSON.");
        }
    }

    public static void b(InterfaceC7884rK1 interfaceC7884rK1, String str, JSONObject jSONObject) {
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(string);
        sb.append(");");
        AbstractC4274eT1.zze("Dispatching AFMA event: ".concat(sb.toString()));
        interfaceC7884rK1.zza(sb.toString());
    }

    public static void c(InterfaceC7884rK1 interfaceC7884rK1, String str, String str2) {
        interfaceC7884rK1.zza(str + "(" + str2 + ");");
    }

    public static void d(InterfaceC7884rK1 interfaceC7884rK1, String str, JSONObject jSONObject) {
        interfaceC7884rK1.a(str, jSONObject.toString());
    }
}
