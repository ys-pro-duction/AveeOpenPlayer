package com.daaw;

import android.os.Bundle;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.pu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7490pu0 {
    public final InterfaceC7569qB0 a;
    public final Map b = DesugarCollections.synchronizedMap(new HashMap());

    public C7490pu0(InterfaceC7569qB0 interfaceC7569qB0) {
        this.a = interfaceC7569qB0;
    }

    public void a(String str, com.google.firebase.remoteconfig.internal.b bVar) {
        JSONObject jSONObjectOptJSONObject;
        W3 w3 = (W3) this.a.get();
        if (w3 == null) {
            return;
        }
        JSONObject jSONObjectH = bVar.h();
        if (jSONObjectH.length() < 1) {
            return;
        }
        JSONObject jSONObjectF = bVar.f();
        if (jSONObjectF.length() >= 1 && (jSONObjectOptJSONObject = jSONObjectH.optJSONObject(str)) != null) {
            String strOptString = jSONObjectOptJSONObject.optString("choiceId");
            if (strOptString.isEmpty()) {
                return;
            }
            synchronized (this.b) {
                try {
                    if (strOptString.equals(this.b.get(str))) {
                        return;
                    }
                    this.b.put(str, strOptString);
                    Bundle bundle = new Bundle();
                    bundle.putString("arm_key", str);
                    bundle.putString("arm_value", jSONObjectF.optString(str));
                    bundle.putString("personalization_id", jSONObjectOptJSONObject.optString("personalizationId"));
                    bundle.putInt("arm_index", jSONObjectOptJSONObject.optInt("armIndex", -1));
                    bundle.putString("group", jSONObjectOptJSONObject.optString("group"));
                    w3.c("fp", "personalization_assignment", bundle);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_fpid", strOptString);
                    w3.c("fp", "_fpc", bundle2);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
