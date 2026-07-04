package com.daaw;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.Hx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1125Hx0 {
    public final ArrayList a = new ArrayList();

    public final void a(InterfaceC1021Gx0 interfaceC1021Gx0) {
        G10.g(interfaceC1021Gx0, "listener");
        this.a.add(interfaceC1021Gx0);
    }

    public final void b() {
        for (int iM = AbstractC1599Mm.m(this.a); -1 < iM; iM--) {
            ((InterfaceC1021Gx0) this.a.get(iM)).a();
        }
    }

    public final void c(InterfaceC1021Gx0 interfaceC1021Gx0) {
        G10.g(interfaceC1021Gx0, "listener");
        this.a.remove(interfaceC1021Gx0);
    }
}
