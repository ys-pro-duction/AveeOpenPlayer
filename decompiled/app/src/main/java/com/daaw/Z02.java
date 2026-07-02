package com.daaw;

import com.google.android.gms.ads.internal.util.zzg;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class Z02 implements X02 {
    public final zzg a;

    public Z02(zzg zzgVar) {
        this.a = zzgVar;
    }

    @Override // com.daaw.X02
    public final void a(Map map) {
        this.a.zzx(Boolean.parseBoolean((String) map.get("content_url_opted_out")));
    }
}
