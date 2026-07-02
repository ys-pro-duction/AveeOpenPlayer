package com.daaw;

import com.daaw.J80;

/* JADX INFO: renamed from: com.daaw.Hz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1132Hz implements J80.a {
    public final boolean a;
    public final InterfaceC1376Ki b;
    public final InterfaceC1376Ki c;

    public C1132Hz(boolean z, InterfaceC1376Ki interfaceC1376Ki, InterfaceC1376Ki interfaceC1376Ki2) {
        this.a = z;
        this.b = interfaceC1376Ki;
        this.c = interfaceC1376Ki2;
    }

    @Override // com.daaw.J80.a
    public boolean a(C71 c71, C71 c712) {
        return C1340Jz.h(this.a, this.b, this.c, c71, c712);
    }
}
