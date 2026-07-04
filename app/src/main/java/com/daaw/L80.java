package com.daaw;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class L80 implements NQ {
    public final C71 B;
    public final List C;
    public final C8387t71 D;
    public final boolean E;
    public final InterfaceC4346ej0 F;

    public L80(C71 c71, List list, C8387t71 c8387t71, boolean z, InterfaceC4346ej0 interfaceC4346ej0) {
        this.B = c71;
        this.C = list;
        this.D = c8387t71;
        this.E = z;
        this.F = interfaceC4346ej0;
    }

    @Override // com.daaw.NQ
    public Object invoke(Object obj) {
        return M80.o(this.B, this.C, this.D, this.E, this.F, (Q80) obj);
    }
}
