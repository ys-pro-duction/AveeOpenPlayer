package com.daaw;

import com.daaw.C9510x71;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public class L0 implements NQ {
    public final Collection B;
    public final C9510x71 C;
    public final InterfaceC9515x81 D;
    public final InterfaceC3159aT0 E;

    public L0(Collection collection, C9510x71 c9510x71, InterfaceC9515x81 interfaceC9515x81, InterfaceC3159aT0 interfaceC3159aT0) {
        this.B = collection;
        this.C = c9510x71;
        this.D = interfaceC9515x81;
        this.E = interfaceC3159aT0;
    }

    @Override // com.daaw.NQ
    public Object invoke(Object obj) {
        return N0.x(this.B, this.C, this.D, this.E, (C9510x71.a) obj);
    }
}
