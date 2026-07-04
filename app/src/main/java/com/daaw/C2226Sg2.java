package com.daaw;

import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Sg2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2226Sg2 implements HI1 {
    public final InterfaceC3112aH1 a;
    public final C6023kh2 b;
    public final V73 c;

    public C2226Sg2(C0522Ce2 c0522Ce2, C7969re2 c7969re2, C6023kh2 c6023kh2, V73 v73) {
        this.a = c0522Ce2.c(c7969re2.a());
        this.b = c6023kh2;
        this.c = v73;
    }

    @Override // com.daaw.HI1
    public final void a(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.a.L2((QG1) this.c.zzb(), str);
        } catch (RemoteException e) {
            AbstractC4274eT1.zzk("Failed to call onCustomClick for asset " + str + ".", e);
        }
    }

    public final void b() {
        if (this.a == null) {
            return;
        }
        this.b.i("/nativeAdCustomClick", this);
    }
}
