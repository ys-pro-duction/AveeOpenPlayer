package com.daaw;

import com.daaw.InterfaceC8157sJ;

/* JADX INFO: renamed from: com.daaw.kK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5921kK implements InterfaceC8157sJ {
    @Override // com.daaw.InterfaceC8157sJ
    public InterfaceC8157sJ.b a(InterfaceC1376Ki interfaceC1376Ki, InterfaceC1376Ki interfaceC1376Ki2, InterfaceC4923gl interfaceC4923gl) {
        G10.g(interfaceC1376Ki, "superDescriptor");
        G10.g(interfaceC1376Ki2, "subDescriptor");
        if (!(interfaceC1376Ki2 instanceof InterfaceC4476fA0) || !(interfaceC1376Ki instanceof InterfaceC4476fA0)) {
            return InterfaceC8157sJ.b.UNKNOWN;
        }
        InterfaceC4476fA0 interfaceC4476fA0 = (InterfaceC4476fA0) interfaceC1376Ki2;
        InterfaceC4476fA0 interfaceC4476fA02 = (InterfaceC4476fA0) interfaceC1376Ki;
        return !G10.c(interfaceC4476fA0.getName(), interfaceC4476fA02.getName()) ? InterfaceC8157sJ.b.UNKNOWN : (R20.a(interfaceC4476fA0) && R20.a(interfaceC4476fA02)) ? InterfaceC8157sJ.b.OVERRIDABLE : (R20.a(interfaceC4476fA0) || R20.a(interfaceC4476fA02)) ? InterfaceC8157sJ.b.INCOMPATIBLE : InterfaceC8157sJ.b.UNKNOWN;
    }

    @Override // com.daaw.InterfaceC8157sJ
    public InterfaceC8157sJ.a b() {
        return InterfaceC8157sJ.a.BOTH;
    }
}
