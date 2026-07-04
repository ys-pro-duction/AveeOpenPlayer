package com.daaw;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class YS0 extends AbstractC5708ja1 implements InterfaceC3159aT0, InterfaceC6993o71 {
    public YS0() {
        super(null);
    }

    public abstract YS0 U0(boolean z);

    public abstract YS0 V0(C8387t71 c8387t71);

    public String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            AbstractC9620xY0.f(sb, "[", AbstractC2923Yz.Q(AbstractC2923Yz.k, (O7) it.next(), null, 2, null), "] ");
        }
        sb.append(N0());
        if (!L0().isEmpty()) {
            AbstractC2455Um.k0(L0(), sb, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "<", (124 & 8) == 0 ? ">" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
        }
        if (O0()) {
            sb.append("?");
        }
        String string = sb.toString();
        G10.f(string, "toString(...)");
        return string;
    }
}
