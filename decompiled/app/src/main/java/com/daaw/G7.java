package com.daaw;

import com.daaw.C8966vA0;

/* JADX INFO: loaded from: classes4.dex */
public final class G7 extends AbstractC4992h implements F7 {
    public final Q7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G7(InterfaceC2968Zk0 interfaceC2968Zk0, C0560Co0 c0560Co0, YP0 yp0) {
        super(yp0);
        G10.g(interfaceC2968Zk0, "module");
        G10.g(c0560Co0, "notFoundClasses");
        G10.g(yp0, "protocol");
        this.b = new Q7(interfaceC2968Zk0, c0560Co0);
    }

    @Override // com.daaw.R7
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public O7 k(C8966vA0 c8966vA0, InterfaceC2664Wm0 interfaceC2664Wm0) {
        G10.g(c8966vA0, "proto");
        G10.g(interfaceC2664Wm0, "nameResolver");
        return this.b.a(c8966vA0, interfaceC2664Wm0);
    }

    @Override // com.daaw.F7
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public AbstractC2887Yq e(TA0 ta0, HA0 ha0, I80 i80) {
        G10.g(ta0, "container");
        G10.g(ha0, "proto");
        G10.g(i80, "expectedType");
        return null;
    }

    @Override // com.daaw.F7
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public AbstractC2887Yq g(TA0 ta0, HA0 ha0, I80 i80) {
        G10.g(ta0, "container");
        G10.g(ha0, "proto");
        G10.g(i80, "expectedType");
        C8966vA0.b.c cVar = (C8966vA0.b.c) SA0.a(ha0, m().b());
        if (cVar == null) {
            return null;
        }
        return this.b.f(i80, cVar, ta0.b());
    }
}
