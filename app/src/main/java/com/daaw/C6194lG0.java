package com.daaw;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.lG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C6194lG0 extends C5906kG0 {
    public static AbstractC7823r60 j(AbstractC1687Ni abstractC1687Ni) {
        InterfaceC6429m60 owner = abstractC1687Ni.getOwner();
        return owner instanceof AbstractC7823r60 ? (AbstractC7823r60) owner : C5623jG.E;
    }

    @Override // com.daaw.C5906kG0
    public InterfaceC8381t60 a(AbstractC9312wR abstractC9312wR) {
        return new C9504x60(j(abstractC9312wR), abstractC9312wR.getName(), abstractC9312wR.getSignature(), abstractC9312wR.getBoundReceiver());
    }

    @Override // com.daaw.C5906kG0
    public J50 b(Class cls) {
        return AbstractC10225zi.m(cls);
    }

    @Override // com.daaw.C5906kG0
    public InterfaceC6429m60 c(Class cls, String str) {
        return AbstractC10225zi.n(cls);
    }

    @Override // com.daaw.C5906kG0
    public F60 d(AbstractC6046km0 abstractC6046km0) {
        return new H60(j(abstractC6046km0), abstractC6046km0.getName(), abstractC6046km0.getSignature(), abstractC6046km0.getBoundReceiver());
    }

    @Override // com.daaw.C5906kG0
    public X60 e(AbstractC5882kA0 abstractC5882kA0) {
        return new C3068a70(j(abstractC5882kA0), abstractC5882kA0.getName(), abstractC5882kA0.getSignature(), abstractC5882kA0.getBoundReceiver());
    }

    @Override // com.daaw.C5906kG0
    public InterfaceC3347b70 f(AbstractC6449mA0 abstractC6449mA0) {
        return new C4182e70(j(abstractC6449mA0), abstractC6449mA0.getName(), abstractC6449mA0.getSignature(), abstractC6449mA0.getBoundReceiver());
    }

    @Override // com.daaw.C5906kG0
    public String g(InterfaceC7353pR interfaceC7353pR) {
        C9504x60 c9504x60C;
        InterfaceC8381t60 interfaceC8381t60A = AbstractC5068hG0.a(interfaceC7353pR);
        return (interfaceC8381t60A == null || (c9504x60C = AbstractC8511tb1.c(interfaceC8381t60A)) == null) ? super.g(interfaceC7353pR) : C7310pG0.a.h(c9504x60C.X());
    }

    @Override // com.daaw.C5906kG0
    public String h(AbstractC4192e90 abstractC4192e90) {
        return g(abstractC4192e90);
    }

    @Override // com.daaw.C5906kG0
    public InterfaceC7550q70 i(InterfaceC5580j60 interfaceC5580j60, List list, boolean z) {
        return interfaceC5580j60 instanceof InterfaceC2967Zk ? AbstractC10225zi.k(((InterfaceC2967Zk) interfaceC5580j60).b(), list, z) : AbstractC6150l60.b(interfaceC5580j60, list, z, Collections.EMPTY_LIST);
    }
}
