package com.daaw;

import com.daaw.P80;
import com.daaw.Q80;

/* JADX INFO: renamed from: com.daaw.vl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9124vl {
    public static final C9510x71 a(boolean z, boolean z2, InterfaceC9403wl interfaceC9403wl, P80 p80, Q80 q80) {
        G10.g(interfaceC9403wl, "typeSystemContext");
        G10.g(p80, "kotlinTypePreparator");
        G10.g(q80, "kotlinTypeRefiner");
        return new C9510x71(z, z2, true, interfaceC9403wl, p80, q80);
    }

    public static /* synthetic */ C9510x71 b(boolean z, boolean z2, InterfaceC9403wl interfaceC9403wl, P80 p80, Q80 q80, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            interfaceC9403wl = CS0.a;
        }
        if ((i & 8) != 0) {
            p80 = P80.a.a;
        }
        if ((i & 16) != 0) {
            q80 = Q80.a.a;
        }
        return a(z, z2, interfaceC9403wl, p80, q80);
    }
}
