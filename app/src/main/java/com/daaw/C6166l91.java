package com.daaw;

import com.daaw.YV0;

/* JADX INFO: renamed from: com.daaw.l91, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C6166l91 extends AbstractC4591fa1 {
    public C6166l91(byte b) {
        super(Byte.valueOf(b));
    }

    @Override // com.daaw.AbstractC2887Yq
    public I80 a(InterfaceC2968Zk0 interfaceC2968Zk0) {
        YS0 ys0S;
        G10.g(interfaceC2968Zk0, "module");
        InterfaceC4923gl interfaceC4923glB = AbstractC5366iL.b(interfaceC2968Zk0, YV0.a.D0);
        return (interfaceC4923glB == null || (ys0S = interfaceC4923glB.s()) == null) ? BH.d(AH.Y0, "UByte") : ys0S;
    }

    @Override // com.daaw.AbstractC2887Yq
    public String toString() {
        return ((Number) b()).intValue() + ".toUByte()";
    }
}
