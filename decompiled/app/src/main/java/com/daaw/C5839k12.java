package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.k12, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5839k12 implements X02 {
    @Override // com.daaw.X02
    public final void a(Map map) {
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.C9)).booleanValue() || map.isEmpty()) {
            return;
        }
        String str = (String) map.get("is_topics_ad_personalization_allowed");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zzt.zzo().h().zzI(Boolean.parseBoolean(str));
    }
}
