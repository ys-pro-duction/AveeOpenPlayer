package com.daaw;

import com.daaw.AbstractC0304Ac0;
import com.daaw.AbstractC2560Vm0;
import com.daaw.AbstractC3983dQ0;
import com.daaw.C8032rr0;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.tr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8590tr0 extends AbstractC0408Bc0 {
    @Override // com.daaw.AbstractC0304Ac0.c
    public AbstractC0304Ac0 a(AbstractC0304Ac0.d dVar) {
        return new C8032rr0(dVar, G31.a);
    }

    @Override // com.daaw.AbstractC0408Bc0
    public String b() {
        return "outlier_detection_experimental";
    }

    @Override // com.daaw.AbstractC0408Bc0
    public int c() {
        return 5;
    }

    @Override // com.daaw.AbstractC0408Bc0
    public boolean d() {
        return true;
    }

    @Override // com.daaw.AbstractC0408Bc0
    public AbstractC2560Vm0.b e(Map map) {
        Long l = AbstractC8650u40.l(map, "interval");
        Long l2 = AbstractC8650u40.l(map, "baseEjectionTime");
        Long l3 = AbstractC8650u40.l(map, "maxEjectionTime");
        Integer numI = AbstractC8650u40.i(map, "maxEjectionPercentage");
        C8032rr0.g.a aVar = new C8032rr0.g.a();
        if (l != null) {
            aVar.e(l);
        }
        if (l2 != null) {
            aVar.b(l2);
        }
        if (l3 != null) {
            aVar.g(l3);
        }
        if (numI != null) {
            aVar.f(numI);
        }
        Map mapJ = AbstractC8650u40.j(map, "successRateEjection");
        if (mapJ != null) {
            C8032rr0.g.c.a aVar2 = new C8032rr0.g.c.a();
            Integer numI2 = AbstractC8650u40.i(mapJ, "stdevFactor");
            Integer numI3 = AbstractC8650u40.i(mapJ, "enforcementPercentage");
            Integer numI4 = AbstractC8650u40.i(mapJ, "minimumHosts");
            Integer numI5 = AbstractC8650u40.i(mapJ, "requestVolume");
            if (numI2 != null) {
                aVar2.e(numI2);
            }
            if (numI3 != null) {
                aVar2.b(numI3);
            }
            if (numI4 != null) {
                aVar2.c(numI4);
            }
            if (numI5 != null) {
                aVar2.d(numI5);
            }
            aVar.h(aVar2.a());
        }
        Map mapJ2 = AbstractC8650u40.j(map, "failurePercentageEjection");
        if (mapJ2 != null) {
            C8032rr0.g.b.a aVar3 = new C8032rr0.g.b.a();
            Integer numI6 = AbstractC8650u40.i(mapJ2, "threshold");
            Integer numI7 = AbstractC8650u40.i(mapJ2, "enforcementPercentage");
            Integer numI8 = AbstractC8650u40.i(mapJ2, "minimumHosts");
            Integer numI9 = AbstractC8650u40.i(mapJ2, "requestVolume");
            if (numI6 != null) {
                aVar3.e(numI6);
            }
            if (numI7 != null) {
                aVar3.b(numI7);
            }
            if (numI8 != null) {
                aVar3.c(numI8);
            }
            if (numI9 != null) {
                aVar3.d(numI9);
            }
            aVar.d(aVar3.a());
        }
        List listA = AbstractC3983dQ0.A(AbstractC8650u40.f(map, "childPolicy"));
        if (listA == null || listA.isEmpty()) {
            return AbstractC2560Vm0.b.b(C6262lX0.t.q("No child policy in outlier_detection_experimental LB policy: " + map));
        }
        AbstractC2560Vm0.b bVarY = AbstractC3983dQ0.y(listA, C0512Cc0.b());
        if (bVarY.d() != null) {
            return bVarY;
        }
        aVar.c((AbstractC3983dQ0.b) bVarY.c());
        return AbstractC2560Vm0.b.a(aVar.a());
    }
}
