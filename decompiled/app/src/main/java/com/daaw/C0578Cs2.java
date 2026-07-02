package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.Cs2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0578Cs2 implements InterfaceC9441ws2 {
    public final AbstractC7686qd2 a;
    public final PS2 b;
    public final C1886Pf2 c;
    public final C4791gG2 d;
    public final C7706qh2 e;

    public C0578Cs2(AbstractC7686qd2 abstractC7686qd2, PS2 ps2, C1886Pf2 c1886Pf2, C4791gG2 c4791gG2, C7706qh2 c7706qh2) {
        this.a = abstractC7686qd2;
        this.b = ps2;
        this.c = c1886Pf2;
        this.d = c4791gG2;
        this.e = c7706qh2;
    }

    @Override // com.daaw.InterfaceC2682Wq2
    public final InterfaceFutureC8236sc0 a(final C9267wF2 c9267wF2, final C4498fF2 c4498fF2) {
        return AbstractC7360pS2.n(AbstractC7360pS2.n(this.d.a(), new WR2() { // from class: com.daaw.zs2
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                return this.a.e(c4498fF2, (C6023kh2) obj);
            }
        }, this.b), new WR2() { // from class: com.daaw.As2
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                return this.a.f(c9267wF2, c4498fF2, (JSONArray) obj);
            }
        }, this.b);
    }

    @Override // com.daaw.InterfaceC2682Wq2
    public final boolean b(C9267wF2 c9267wF2, C4498fF2 c4498fF2) {
        C6192lF2 c6192lF2 = c4498fF2.u;
        return (c6192lF2 == null || c6192lF2.c == null) ? false : true;
    }

    public final /* synthetic */ C6575me2 c(InterfaceFutureC8236sc0 interfaceFutureC8236sc0, InterfaceFutureC8236sc0 interfaceFutureC8236sc02, C9267wF2 c9267wF2, C4498fF2 c4498fF2, JSONObject jSONObject) throws Throwable {
        C7969re2 c7969re2 = (C7969re2) interfaceFutureC8236sc0.get();
        C6023kh2 c6023kh2 = (C6023kh2) interfaceFutureC8236sc02.get();
        AbstractC8248se2 abstractC8248se2C = this.a.c(new C10054z42(c9267wF2, c4498fF2, null), new C0635De2(c7969re2), new C1359Kd2(jSONObject, c6023kh2));
        abstractC8248se2C.j().b();
        abstractC8248se2C.k().a(c6023kh2);
        abstractC8248se2C.i().a(c7969re2.f0());
        abstractC8248se2C.l().a(this.e);
        return abstractC8248se2C.h();
    }

    public final /* synthetic */ InterfaceFutureC8236sc0 d(C6023kh2 c6023kh2, JSONObject jSONObject) throws C4521fL1 {
        this.d.b(AbstractC7360pS2.h(c6023kh2));
        if (jSONObject.optBoolean("success")) {
            return AbstractC7360pS2.h(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new C4521fL1("process json failed");
    }

    public final /* synthetic */ InterfaceFutureC8236sc0 e(C4498fF2 c4498fF2, final C6023kh2 c6023kh2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.o8)).booleanValue() && AbstractC7494pv0.k()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", c4498fF2.u.c);
        jSONObject2.put("sdk_params", jSONObject);
        return AbstractC7360pS2.n(c6023kh2.d("google.afma.nativeAds.preProcessJson", jSONObject2), new WR2() { // from class: com.daaw.ys2
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                return this.a.d(c6023kh2, (JSONObject) obj);
            }
        }, this.b);
    }

    public final /* synthetic */ InterfaceFutureC8236sc0 f(C9267wF2 c9267wF2, C4498fF2 c4498fF2, JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return AbstractC7360pS2.g(new C2350Tl2(3));
        }
        if (c9267wF2.a.a.k <= 1) {
            return AbstractC7360pS2.m(g(c9267wF2, c4498fF2, jSONArray.getJSONObject(0)), new WN2() { // from class: com.daaw.Bs2
                @Override // com.daaw.WN2
                public final Object apply(Object obj) {
                    return Collections.singletonList(AbstractC7360pS2.h((C6575me2) obj));
                }
            }, this.b);
        }
        int length = jSONArray.length();
        this.d.c(Math.min(length, c9267wF2.a.a.k));
        ArrayList arrayList = new ArrayList(c9267wF2.a.a.k);
        for (int i = 0; i < c9267wF2.a.a.k; i++) {
            if (i < length) {
                arrayList.add(g(c9267wF2, c4498fF2, jSONArray.getJSONObject(i)));
            } else {
                arrayList.add(AbstractC7360pS2.g(new C2350Tl2(3)));
            }
        }
        return AbstractC7360pS2.h(arrayList);
    }

    public final InterfaceFutureC8236sc0 g(final C9267wF2 c9267wF2, final C4498fF2 c4498fF2, final JSONObject jSONObject) {
        C1886Pf2 c1886Pf2 = this.c;
        final InterfaceFutureC8236sc0 interfaceFutureC8236sc0A = this.d.a();
        final InterfaceFutureC8236sc0 interfaceFutureC8236sc0A2 = c1886Pf2.a(c9267wF2, c4498fF2, jSONObject);
        return AbstractC7360pS2.c(interfaceFutureC8236sc0A, interfaceFutureC8236sc0A2).a(new Callable() { // from class: com.daaw.xs2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.c(interfaceFutureC8236sc0A2, interfaceFutureC8236sc0A, c9267wF2, c4498fF2, jSONObject);
            }
        }, this.b);
    }
}
