package com.daaw;

import com.daaw.YV0;

/* JADX INFO: renamed from: com.daaw.q91, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C7561q91 extends AbstractC4591fa1 {
    public C7561q91(short s) {
        super(Short.valueOf(s));
    }

    @Override // com.daaw.AbstractC2887Yq
    public I80 a(InterfaceC2968Zk0 interfaceC2968Zk0) {
        YS0 ys0S;
        G10.g(interfaceC2968Zk0, "module");
        InterfaceC4923gl interfaceC4923glB = AbstractC5366iL.b(interfaceC2968Zk0, YV0.a.E0);
        return (interfaceC4923glB == null || (ys0S = interfaceC4923glB.s()) == null) ? BH.d(AH.Y0, "UShort") : ys0S;
    }

    @Override // com.daaw.AbstractC2887Yq
    public String toString() {
        return ((Number) b()).intValue() + ".toUShort()";
    }
}
