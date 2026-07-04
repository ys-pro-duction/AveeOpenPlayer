package com.daaw;

import java.util.Map;

/* JADX INFO: renamed from: com.daaw.zI2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10116zI2 implements InterfaceC6483mI2 {
    public final C9279wI2 a;
    public final C8714uI2 b;

    public C10116zI2(C9279wI2 c9279wI2, C8714uI2 c8714uI2) {
        this.a = c9279wI2;
        this.b = c8714uI2;
    }

    @Override // com.daaw.InterfaceC6483mI2
    public final String b(C6204lI2 c6204lI2) {
        C8714uI2 c8714uI2 = this.b;
        Map mapJ = c6204lI2.j();
        c8714uI2.a(mapJ);
        return this.a.a(mapJ);
    }

    @Override // com.daaw.InterfaceC6483mI2
    public final void a(C6204lI2 c6204lI2) {
    }
}
