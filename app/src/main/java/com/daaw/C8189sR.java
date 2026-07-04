package com.daaw;

import com.daaw.AbstractC9870yR;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.sR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C8189sR extends VS {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8189sR(InterfaceC10174zX0 interfaceC10174zX0, C7632qR c7632qR) {
        super(interfaceC10174zX0, c7632qR);
        G10.g(interfaceC10174zX0, "storageManager");
        G10.g(c7632qR, "containingClass");
    }

    @Override // com.daaw.VS
    public List j() {
        InterfaceC4923gl interfaceC4923glM = m();
        G10.e(interfaceC4923glM, "null cannot be cast to non-null type org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor");
        AbstractC9870yR abstractC9870yRU0 = ((C7632qR) interfaceC4923glM).U0();
        return G10.c(abstractC9870yRU0, AbstractC9870yR.a.e) ? AbstractC1496Lm.e(C9033vR.f0.a((C7632qR) m(), false)) : G10.c(abstractC9870yRU0, AbstractC9870yR.d.e) ? AbstractC1496Lm.e(C9033vR.f0.a((C7632qR) m(), true)) : AbstractC1599Mm.k();
    }
}
