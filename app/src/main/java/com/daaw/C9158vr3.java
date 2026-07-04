package com.daaw;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.daaw.vr3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9158vr3 extends AbstractC9435wr1 {
    public final Nb3 D;
    public final Map E;

    public C9158vr3(Nb3 nb3) {
        super("require");
        this.E = new HashMap();
        this.D = nb3;
    }

    @Override // com.daaw.AbstractC9435wr1
    public final InterfaceC1637Mv1 a(ES2 es2, List list) {
        InterfaceC1637Mv1 interfaceC1637Mv1;
        AbstractC7831r73.h("require", 1, list);
        String strZzi = es2.b((InterfaceC1637Mv1) list.get(0)).zzi();
        if (this.E.containsKey(strZzi)) {
            return (InterfaceC1637Mv1) this.E.get(strZzi);
        }
        Nb3 nb3 = this.D;
        if (nb3.a.containsKey(strZzi)) {
            try {
                interfaceC1637Mv1 = (InterfaceC1637Mv1) ((Callable) nb3.a.get(strZzi)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(strZzi)));
            }
        } else {
            interfaceC1637Mv1 = InterfaceC1637Mv1.t;
        }
        if (interfaceC1637Mv1 instanceof AbstractC9435wr1) {
            this.E.put(strZzi, (AbstractC9435wr1) interfaceC1637Mv1);
        }
        return interfaceC1637Mv1;
    }
}
