package com.daaw;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class II1 implements HI1 {
    public final JI1 a;

    public II1(JI1 ji1) {
        this.a = ji1;
    }

    @Override // com.daaw.HI1
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        InterfaceC9334wW1 interfaceC9334wW1 = (InterfaceC9334wW1) obj;
        boolean zEquals = "1".equals(map.get("transparentBackground"));
        boolean zEquals2 = "1".equals(map.get("blur"));
        float f = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e) {
            AbstractC4274eT1.zzh("Fail to parse float", e);
        }
        this.a.c(zEquals);
        this.a.b(zEquals2, f);
        interfaceC9334wW1.F(zEquals);
    }
}
