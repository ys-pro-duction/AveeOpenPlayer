package com.daaw;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class GN1 {
    public final InterfaceC9334wW1 a;
    public final String b;

    public GN1(InterfaceC9334wW1 interfaceC9334wW1, String str) {
        this.a = interfaceC9334wW1;
        this.b = str;
    }

    public final void b(int i, int i2, int i3, int i4) {
        try {
            this.a.l("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            AbstractC4274eT1.zzh("Error occurred while dispatching default position.", e);
        }
    }

    public final void c(String str) {
        try {
            JSONObject jSONObjectPut = new JSONObject().put("message", str).put("action", this.b);
            InterfaceC9334wW1 interfaceC9334wW1 = this.a;
            if (interfaceC9334wW1 != null) {
                interfaceC9334wW1.l("onError", jSONObjectPut);
            }
        } catch (JSONException e) {
            AbstractC4274eT1.zzh("Error occurred while dispatching error event.", e);
        }
    }

    public final void d(String str) {
        try {
            this.a.l("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e) {
            AbstractC4274eT1.zzh("Error occurred while dispatching ready Event.", e);
        }
    }

    public final void e(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.a.l("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", f).put("rotation", i5));
        } catch (JSONException e) {
            AbstractC4274eT1.zzh("Error occurred while obtaining screen information.", e);
        }
    }

    public final void f(int i, int i2, int i3, int i4) {
        try {
            this.a.l("onSizeChanged", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            AbstractC4274eT1.zzh("Error occurred while dispatching size change.", e);
        }
    }

    public final void g(String str) {
        try {
            this.a.l("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e) {
            AbstractC4274eT1.zzh("Error occurred while dispatching state change.", e);
        }
    }
}
