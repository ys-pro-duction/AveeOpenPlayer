package com.daaw;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.s12, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8079s12 implements X02 {
    public final Context a;
    public final zzg b = zzt.zzo().h();

    public C8079s12(Context context) {
        this.a = context;
    }

    @Override // com.daaw.X02
    public final void a(Map map) {
        if (map.isEmpty()) {
            return;
        }
        String str = (String) map.get("gad_idless");
        if (str != null) {
            zzg zzgVar = this.b;
            boolean z = Boolean.parseBoolean(str);
            zzgVar.zzH(z);
            if (z) {
                Context context = this.a;
                if (((Boolean) zzba.zzc().b(AbstractC9820yE1.f6)).booleanValue()) {
                    context.deleteDatabase("OfflineUpload.db");
                }
                try {
                    C9574xM2 c9574xM2K = C9574xM2.k(context);
                    C9853yM2 c9853yM2J = C9853yM2.j(context);
                    c9574xM2K.l();
                    c9574xM2K.m();
                    c9853yM2J.k();
                    if (((Boolean) zzba.zzc().b(AbstractC9820yE1.M2)).booleanValue()) {
                        c9853yM2J.l();
                    }
                    if (((Boolean) zzba.zzc().b(AbstractC9820yE1.N2)).booleanValue()) {
                        c9853yM2J.m();
                    }
                } catch (IOException e) {
                    zzt.zzo().u(e, "clearStorageOnIdlessMode");
                }
            }
        }
        map.remove("gad_idless");
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        zzt.zzn().w(bundle);
    }
}
