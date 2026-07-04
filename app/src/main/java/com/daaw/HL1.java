package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class HL1 implements WR2 {
    public final InterfaceC5368iL1 a;
    public final InterfaceC5648jL1 b;
    public final String c = "google.afma.activeView.handleUpdate";
    public final InterfaceFutureC8236sc0 d;

    public HL1(InterfaceFutureC8236sc0 interfaceFutureC8236sc0, String str, InterfaceC5648jL1 interfaceC5648jL1, InterfaceC5368iL1 interfaceC5368iL1) {
        this.d = interfaceFutureC8236sc0;
        this.b = interfaceC5648jL1;
        this.a = interfaceC5368iL1;
    }

    public final InterfaceFutureC8236sc0 a(final Object obj) {
        return AbstractC7360pS2.n(this.d, new WR2() { // from class: com.daaw.FL1
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj2) {
                return this.a.b(obj, (InterfaceC3964dL1) obj2);
            }
        }, AbstractC9322wT1.f);
    }

    public final /* synthetic */ InterfaceFutureC8236sc0 b(Object obj, InterfaceC3964dL1 interfaceC3964dL1) throws JSONException {
        BT1 bt1 = new BT1();
        zzt.zzp();
        String string = UUID.randomUUID().toString();
        GI1.o.c(string, new GL1(this, bt1));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", string);
        jSONObject.put("args", (JSONObject) obj);
        interfaceC3964dL1.y0(this.c, jSONObject);
        return bt1;
    }

    @Override // com.daaw.WR2
    public final InterfaceFutureC8236sc0 zza(Object obj) {
        return a(obj);
    }
}
