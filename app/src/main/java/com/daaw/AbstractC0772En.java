package com.daaw;

import java.util.Set;

/* JADX INFO: renamed from: com.daaw.En, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0772En {
    public static final boolean a(C0668Dn c0668Dn, InterfaceC4923gl interfaceC4923gl) {
        G10.g(c0668Dn, "<this>");
        G10.g(interfaceC4923gl, "classDescriptor");
        if (!AbstractC7006oA.x(interfaceC4923gl)) {
            return false;
        }
        Set setB = c0668Dn.b();
        C6607ml c6607mlN = AbstractC8400tA.n(interfaceC4923gl);
        return AbstractC2455Um.W(setB, c6607mlN != null ? c6607mlN.e() : null);
    }
}
