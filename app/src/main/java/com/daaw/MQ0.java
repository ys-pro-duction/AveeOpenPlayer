package com.daaw;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class MQ0 {
    public final InterfaceC1735Nu a;

    public MQ0(InterfaceC1735Nu interfaceC1735Nu) {
        this.a = interfaceC1735Nu;
    }

    public static NQ0 a(int i) {
        if (i == 3) {
            return new RQ0();
        }
        C2106Rd0.f().d("Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.");
        return new C2185Rx();
    }

    public BQ0 b(JSONObject jSONObject) {
        return a(jSONObject.getInt("settings_version")).a(this.a, jSONObject);
    }
}
