package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.zL1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10127zL1 implements InterfaceC4810gL1 {
    public final InterfaceC5368iL1 a;
    public final InterfaceC5648jL1 b;
    public final C3685cL1 c;
    public final String d;

    public C10127zL1(C3685cL1 c3685cL1, String str, InterfaceC5648jL1 interfaceC5648jL1, InterfaceC5368iL1 interfaceC5368iL1) {
        this.c = c3685cL1;
        this.d = str;
        this.b = interfaceC5648jL1;
        this.a = interfaceC5368iL1;
    }

    public static /* bridge */ /* synthetic */ void c(C10127zL1 c10127zL1, WK1 wk1, InterfaceC3964dL1 interfaceC3964dL1, Object obj, BT1 bt1) {
        try {
            zzt.zzp();
            String string = UUID.randomUUID().toString();
            GI1.o.c(string, new C9848yL1(c10127zL1, wk1, bt1));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", string);
            jSONObject.put("args", c10127zL1.b.a(obj));
            interfaceC3964dL1.y0(c10127zL1.d, jSONObject);
        } catch (Exception e) {
            try {
                bt1.c(e);
                AbstractC4274eT1.zzh("Unable to invokeJavascript", e);
            } finally {
                wk1.g();
            }
        }
    }

    @Override // com.daaw.InterfaceC4810gL1
    public final InterfaceFutureC8236sc0 a(Object obj) {
        BT1 bt1 = new BT1();
        WK1 wk1B = this.c.b(null);
        wk1B.e(new C9290wL1(this, wk1B, obj, bt1), new C9569xL1(this, bt1, wk1B));
        return bt1;
    }

    @Override // com.daaw.WR2
    public final InterfaceFutureC8236sc0 zza(Object obj) {
        return a(obj);
    }
}
