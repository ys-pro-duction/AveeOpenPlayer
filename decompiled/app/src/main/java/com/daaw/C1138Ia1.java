package com.daaw;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.Ia1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1138Ia1 {
    public final EnumC1450La1 a;
    public final Set b = new HashSet();
    public final ArrayList c = new ArrayList();

    public C1138Ia1(EnumC1450La1 enumC1450La1) {
        this.a = enumC1450La1;
    }

    public void b(C6488mK c6488mK) {
        this.b.add(c6488mK);
    }

    public void c(C6488mK c6488mK, InterfaceC6146l51 interfaceC6146l51) {
        this.c.add(new C8161sK(c6488mK, interfaceC6146l51));
    }

    public List d() {
        return this.c;
    }

    public C1242Ja1 e() {
        return new C1242Ja1(this, C6488mK.D, false, null);
    }

    public C1346Ka1 f(C7465pp0 c7465pp0) {
        return new C1346Ka1(c7465pp0, C5642jK.a(this.b), DesugarCollections.unmodifiableList(this.c));
    }
}
