package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class WI1 implements HI1 {
    public final Object a = new Object();
    public final Map b = new HashMap();

    @Override // com.daaw.HI1
    public final void a(Object obj, Map map) {
        String str = (String) map.get("id");
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        String strConcat = TextUtils.isEmpty(str4) ? "" : "\n".concat(String.valueOf(str4));
        synchronized (this.a) {
            try {
                VI1 vi1 = (VI1) this.b.remove(str);
                if (vi1 == null) {
                    AbstractC4274eT1.zzj("Received result for unexpected method invocation: " + str);
                    return;
                }
                if (!TextUtils.isEmpty(str2)) {
                    vi1.zza(str3 + strConcat);
                    return;
                }
                if (str5 == null) {
                    vi1.a(null);
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (zze.zzc()) {
                        zze.zza("Result GMSG: " + jSONObject.toString(2));
                    }
                    vi1.a(jSONObject);
                } catch (JSONException e) {
                    vi1.zza(e.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final InterfaceFutureC8236sc0 b(CK1 ck1, String str, JSONObject jSONObject) {
        BT1 bt1 = new BT1();
        zzt.zzp();
        String string = UUID.randomUUID().toString();
        c(string, new UI1(this, bt1));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", string);
            jSONObject2.put("args", jSONObject);
            ck1.y0(str, jSONObject2);
            return bt1;
        } catch (Exception e) {
            bt1.c(e);
            return bt1;
        }
    }

    public final void c(String str, VI1 vi1) {
        synchronized (this.a) {
            this.b.put(str, vi1);
        }
    }
}
