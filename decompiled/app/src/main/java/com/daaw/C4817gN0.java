package com.daaw;

import com.daaw.AbstractC2560Vm0;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.gN0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4817gN0 extends AbstractC2560Vm0.f {
    public final boolean a;
    public final int b;
    public final int c;
    public final C4878gc d;

    public C4817gN0(boolean z, int i, int i2, C4878gc c4878gc) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = (C4878gc) AbstractC7785qy0.o(c4878gc, "autoLoadBalancerFactory");
    }

    @Override // com.daaw.AbstractC2560Vm0.f
    public AbstractC2560Vm0.b a(Map map) {
        Object objC;
        try {
            AbstractC2560Vm0.b bVarF = this.d.f(map);
            if (bVarF == null) {
                objC = null;
            } else {
                if (bVarF.d() != null) {
                    return AbstractC2560Vm0.b.b(bVarF.d());
                }
                objC = bVarF.c();
            }
            return AbstractC2560Vm0.b.a(C7141og0.b(map, this.a, this.b, this.c, objC));
        } catch (RuntimeException e) {
            return AbstractC2560Vm0.b.b(C6262lX0.h.q("failed to parse service config").p(e));
        }
    }
}
