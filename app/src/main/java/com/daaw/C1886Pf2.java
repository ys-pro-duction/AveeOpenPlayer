package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.Pf2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1886Pf2 {
    public final PS2 a;
    public final C4901gg2 b;
    public final C6306lg2 c;

    public C1886Pf2(PS2 ps2, C4901gg2 c4901gg2, C6306lg2 c6306lg2) {
        this.a = ps2;
        this.b = c4901gg2;
        this.c = c6306lg2;
    }

    public final InterfaceFutureC8236sc0 a(final C9267wF2 c9267wF2, final C4498fF2 c4498fF2, final JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0N;
        final InterfaceFutureC8236sc0 interfaceFutureC8236sc0S0 = this.a.S0(new Callable() { // from class: com.daaw.Nf2
            @Override // java.util.concurrent.Callable
            public final Object call() throws C6092kt2 {
                C7969re2 c7969re2 = new C7969re2();
                JSONObject jSONObject2 = jSONObject;
                c7969re2.B(jSONObject2.optInt("template_id", -1));
                c7969re2.k(jSONObject2.optString("custom_template_id"));
                JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("omid_settings");
                String strOptString = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("omid_partner_name") : null;
                C9267wF2 c9267wF22 = c9267wF2;
                c7969re2.v(strOptString);
                FF2 ff2 = c9267wF22.a.a;
                if (!ff2.g.contains(Integer.toString(c7969re2.P()))) {
                    throw new C6092kt2(1, "Invalid template ID: " + c7969re2.P());
                }
                if (c7969re2.P() == 3) {
                    if (c7969re2.a() == null) {
                        throw new C6092kt2(1, "No custom template id for custom template ad response.");
                    }
                    if (!ff2.h.contains(c7969re2.a())) {
                        throw new C6092kt2(1, "Unexpected custom template id in the response.");
                    }
                }
                C4498fF2 c4498fF22 = c4498fF2;
                c7969re2.y(jSONObject2.optDouble("rating", -1.0d));
                String strOptString2 = jSONObject2.optString("headline", null);
                if (c4498fF22.O) {
                    zzt.zzp();
                    strOptString2 = com.google.android.gms.ads.internal.util.zzt.zzx() + " : " + strOptString2;
                }
                c7969re2.z("headline", strOptString2);
                c7969re2.z("body", jSONObject2.optString("body", null));
                c7969re2.z("call_to_action", jSONObject2.optString("call_to_action", null));
                c7969re2.z(ProductResponseJsonKeys.STORE, jSONObject2.optString(ProductResponseJsonKeys.STORE, null));
                c7969re2.z("price", jSONObject2.optString("price", null));
                c7969re2.z("advertiser", jSONObject2.optString("advertiser", null));
                return c7969re2;
            }
        });
        final InterfaceFutureC8236sc0 interfaceFutureC8236sc0F = this.b.f(jSONObject, "images");
        C5622jF2 c5622jF2 = c9267wF2.b.b;
        C4901gg2 c4901gg2 = this.b;
        final InterfaceFutureC8236sc0 interfaceFutureC8236sc0G = c4901gg2.g(jSONObject, "images", c4498fF2, c5622jF2);
        final InterfaceFutureC8236sc0 interfaceFutureC8236sc0E = c4901gg2.e(jSONObject, "secondary_image");
        final InterfaceFutureC8236sc0 interfaceFutureC8236sc0E2 = c4901gg2.e(jSONObject, "app_icon");
        final InterfaceFutureC8236sc0 interfaceFutureC8236sc0D = c4901gg2.d(jSONObject, "attribution");
        final InterfaceFutureC8236sc0 interfaceFutureC8236sc0H = this.b.h(jSONObject, c4498fF2, c9267wF2.b.b);
        final InterfaceFutureC8236sc0 interfaceFutureC8236sc0A = this.c.a(jSONObject, "custom_assets");
        if (jSONObject.optBoolean("enable_omid") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings")) != null) {
            final String strOptString = jSONObjectOptJSONObject.optString("omid_html");
            if (TextUtils.isEmpty(strOptString)) {
                interfaceFutureC8236sc0N = AbstractC7360pS2.h(null);
            } else {
                final C4901gg2 c4901gg22 = this.b;
                interfaceFutureC8236sc0N = AbstractC7360pS2.n(AbstractC7360pS2.h(null), new WR2() { // from class: com.daaw.Vf2
                    @Override // com.daaw.WR2
                    public final InterfaceFutureC8236sc0 zza(Object obj) {
                        return c4901gg22.c(strOptString, obj);
                    }
                }, AbstractC9322wT1.e);
            }
        } else {
            interfaceFutureC8236sc0N = AbstractC7360pS2.h(null);
        }
        final InterfaceFutureC8236sc0 interfaceFutureC8236sc0 = interfaceFutureC8236sc0N;
        ArrayList arrayList = new ArrayList();
        arrayList.add(interfaceFutureC8236sc0S0);
        arrayList.add(interfaceFutureC8236sc0F);
        arrayList.add(interfaceFutureC8236sc0G);
        arrayList.add(interfaceFutureC8236sc0E);
        arrayList.add(interfaceFutureC8236sc0E2);
        arrayList.add(interfaceFutureC8236sc0D);
        arrayList.add(interfaceFutureC8236sc0H);
        arrayList.add(interfaceFutureC8236sc0A);
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.Y4)).booleanValue()) {
            arrayList.add(interfaceFutureC8236sc0);
        }
        return AbstractC7360pS2.a(arrayList).a(new Callable() { // from class: com.daaw.Of2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C7969re2 c7969re2 = (C7969re2) interfaceFutureC8236sc0S0.get();
                c7969re2.p((List) interfaceFutureC8236sc0F.get());
                c7969re2.m((InterfaceC8147sG1) interfaceFutureC8236sc0E2.get());
                c7969re2.q((InterfaceC8147sG1) interfaceFutureC8236sc0E.get());
                c7969re2.j((InterfaceC5907kG1) interfaceFutureC8236sc0D.get());
                JSONObject jSONObject2 = jSONObject;
                c7969re2.s(C4901gg2.j(jSONObject2));
                c7969re2.l(C4901gg2.i(jSONObject2));
                InterfaceC9334wW1 interfaceC9334wW1 = (InterfaceC9334wW1) interfaceFutureC8236sc0H.get();
                if (interfaceC9334wW1 != null) {
                    c7969re2.E(interfaceC9334wW1);
                    c7969re2.D(interfaceC9334wW1.h());
                    c7969re2.C(interfaceC9334wW1.zzq());
                }
                InterfaceC9334wW1 interfaceC9334wW12 = (InterfaceC9334wW1) interfaceFutureC8236sc0G.get();
                if (interfaceC9334wW12 != null) {
                    c7969re2.o(interfaceC9334wW12);
                    c7969re2.F(interfaceC9334wW12.h());
                }
                InterfaceFutureC8236sc0 interfaceFutureC8236sc02 = interfaceFutureC8236sc0;
                if (((Boolean) zzba.zzc().b(AbstractC9820yE1.Y4)).booleanValue()) {
                    c7969re2.u(interfaceFutureC8236sc02);
                    c7969re2.x(new BT1());
                } else {
                    InterfaceC9334wW1 interfaceC9334wW13 = (InterfaceC9334wW1) interfaceFutureC8236sc02.get();
                    if (interfaceC9334wW13 != null) {
                        c7969re2.t(interfaceC9334wW13);
                    }
                }
                for (C6018kg2 c6018kg2 : (List) interfaceFutureC8236sc0A.get()) {
                    if (c6018kg2.a != 1) {
                        c7969re2.n(c6018kg2.b, c6018kg2.d);
                    } else {
                        c7969re2.z(c6018kg2.b, c6018kg2.c);
                    }
                }
                return c7969re2;
            }
        }, this.a);
    }
}
