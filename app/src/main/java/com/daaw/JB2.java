package com.daaw;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class JB2 implements InterfaceC1447Kz2 {
    public static final /* synthetic */ JB2 a = new JB2();

    @Override // com.daaw.InterfaceC1447Kz2
    public final /* synthetic */ int zza() {
        return 0;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        return AbstractC7360pS2.h(new InterfaceC1343Jz2() { // from class: com.daaw.KB2
            @Override // com.daaw.InterfaceC1343Jz2
            public final void a(Object obj) {
                try {
                    ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", 12451000);
                } catch (JSONException unused) {
                }
            }
        });
    }
}
