package com.daaw;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class K80 implements NQ {
    public final C71 B;
    public final List C;
    public final C8387t71 D;
    public final boolean E;

    public K80(C71 c71, List list, C8387t71 c8387t71, boolean z) {
        this.B = c71;
        this.C = list;
        this.D = c8387t71;
        this.E = z;
    }

    @Override // com.daaw.NQ
    public Object invoke(Object obj) {
        return M80.l(this.B, this.C, this.D, this.E, (Q80) obj);
    }
}
