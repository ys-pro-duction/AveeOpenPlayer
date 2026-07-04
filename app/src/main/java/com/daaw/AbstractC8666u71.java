package com.daaw;

import com.daaw.InterfaceC7829r71;

/* JADX INFO: renamed from: com.daaw.u71, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8666u71 {
    public static final C8387t71 a(C8387t71 c8387t71, InterfaceC3072a8 interfaceC3072a8) {
        C8387t71 c8387t71F;
        G10.g(c8387t71, "<this>");
        G10.g(interfaceC3072a8, "newAnnotations");
        if (AbstractC4465f8.a(c8387t71) == interfaceC3072a8) {
            return c8387t71;
        }
        C4186e8 c4186e8B = AbstractC4465f8.b(c8387t71);
        if (c4186e8B != null && (c8387t71F = c8387t71.F(c4186e8B)) != null) {
            c8387t71 = c8387t71F;
        }
        return (interfaceC3072a8.iterator().hasNext() || !interfaceC3072a8.isEmpty()) ? c8387t71.E(new C4186e8(interfaceC3072a8)) : c8387t71;
    }

    public static final C8387t71 b(InterfaceC3072a8 interfaceC3072a8) {
        G10.g(interfaceC3072a8, "<this>");
        return InterfaceC7829r71.a.a(C6668my.a, interfaceC3072a8, null, null, 6, null);
    }
}
