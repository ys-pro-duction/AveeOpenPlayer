package com.daaw;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.gI1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4798gI1 implements HI1 {
    @Override // com.daaw.HI1
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        JSONObject jSONObjectZza;
        InterfaceC9334wW1 interfaceC9334wW1 = (InterfaceC9334wW1) obj;
        InterfaceC4790gG1 interfaceC4790gG1N = interfaceC9334wW1.n();
        if (interfaceC4790gG1N == null || (jSONObjectZza = interfaceC4790gG1N.zza()) == null) {
            interfaceC9334wW1.l("nativeAdViewSignalsReady", new JSONObject());
        } else {
            interfaceC9334wW1.l("nativeAdViewSignalsReady", jSONObjectZza);
        }
    }
}
