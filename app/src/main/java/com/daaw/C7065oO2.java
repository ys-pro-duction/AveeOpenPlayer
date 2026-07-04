package com.daaw;

import java.util.Map;

/* JADX INFO: renamed from: com.daaw.oO2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7065oO2 implements Bi3 {
    public final /* synthetic */ String a;
    public final /* synthetic */ QO2 b;

    public C7065oO2(QO2 qo2, String str) {
        this.b = qo2;
        this.a = str;
    }

    @Override // com.daaw.Bi3
    public final String zza(String str) {
        Map map = (Map) this.b.d.get(this.a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
