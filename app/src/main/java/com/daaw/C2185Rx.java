package com.daaw;

import com.daaw.BQ0;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.Rx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2185Rx implements NQ0 {
    public static BQ0 b(InterfaceC1735Nu interfaceC1735Nu) {
        return new BQ0(interfaceC1735Nu.getCurrentTimeMillis() + ((long) 3600000), new BQ0.b(8, 4), new BQ0.a(true, false, false), 0, 3600, 10.0d, 1.2d, 60);
    }

    @Override // com.daaw.NQ0
    public BQ0 a(InterfaceC1735Nu interfaceC1735Nu, JSONObject jSONObject) {
        return b(interfaceC1735Nu);
    }
}
