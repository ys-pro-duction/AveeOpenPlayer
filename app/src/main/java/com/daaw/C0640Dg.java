package com.daaw;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.Dg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0640Dg implements InterfaceC3888d4, InterfaceC0848Fg {
    public InterfaceC0744Eg a;

    public static String c(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // com.daaw.InterfaceC0848Fg
    public void a(InterfaceC0744Eg interfaceC0744Eg) {
        this.a = interfaceC0744Eg;
        C2106Rd0.f().b("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    @Override // com.daaw.InterfaceC3888d4
    public void b(String str, Bundle bundle) {
        InterfaceC0744Eg interfaceC0744Eg = this.a;
        if (interfaceC0744Eg != null) {
            try {
                interfaceC0744Eg.a("$A$:" + c(str, bundle));
            } catch (JSONException unused) {
                C2106Rd0.f().k("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}
