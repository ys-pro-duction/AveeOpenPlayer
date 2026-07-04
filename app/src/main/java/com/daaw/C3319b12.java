package com.daaw;

import com.google.android.gms.ads.internal.util.zzg;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.b12, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3319b12 implements X02 {
    public final zzg a;

    public C3319b12(zzg zzgVar) {
        this.a = zzgVar;
    }

    @Override // com.daaw.X02
    public final void a(Map map) {
        this.a.zzz(Boolean.parseBoolean((String) map.get("content_vertical_opted_out")));
    }
}
