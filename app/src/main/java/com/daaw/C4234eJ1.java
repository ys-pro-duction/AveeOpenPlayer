package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbwi;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.eJ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4234eJ1 implements HI1 {
    public final XI1 a;

    public C4234eJ1(XI1 xi1) {
        this.a = xi1;
    }

    public static void b(InterfaceC9334wW1 interfaceC9334wW1, XI1 xi1) {
        interfaceC9334wW1.C("/reward", new C4234eJ1(xi1));
    }

    @Override // com.daaw.HI1
    public final void a(Object obj, Map map) {
        String str = (String) map.get("action");
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.a.zzc();
                return;
            } else {
                if ("video_complete".equals(str)) {
                    this.a.zzb();
                    return;
                }
                return;
            }
        }
        zzbwi zzbwiVar = null;
        try {
            int i = Integer.parseInt((String) map.get("amount"));
            String str2 = (String) map.get("type");
            if (!TextUtils.isEmpty(str2)) {
                zzbwiVar = new zzbwi(str2, i);
            }
        } catch (NumberFormatException e) {
            AbstractC4274eT1.zzk("Unable to parse reward amount.", e);
        }
        this.a.k0(zzbwiVar);
    }
}
