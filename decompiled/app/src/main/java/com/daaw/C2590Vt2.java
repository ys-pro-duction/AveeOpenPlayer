package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.Vt2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2590Vt2 implements InterfaceC2890Yq2 {
    public final C1115Hu2 a;
    public final C8826ui2 b;

    public C2590Vt2(C1115Hu2 c1115Hu2, C8826ui2 c8826ui2) {
        this.a = c1115Hu2;
        this.b = c8826ui2;
    }

    @Override // com.daaw.InterfaceC2890Yq2
    public final C2994Zq2 a(String str, JSONObject jSONObject) {
        ZM1 zm1B;
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.C1)).booleanValue()) {
            try {
                zm1B = this.b.b(str);
            } catch (RemoteException e) {
                AbstractC4274eT1.zzh("Coundn't create RTB adapter: ", e);
                zm1B = null;
            }
        } else {
            zm1B = this.a.a(str);
        }
        if (zm1B == null) {
            return null;
        }
        return new C2994Zq2(zm1B, new BinderC3558bs2(), str);
    }
}
