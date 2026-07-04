package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.db, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C4027db extends AbstractC2887Yq {
    public final NQ b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4027db(List list, NQ nq) {
        super(list);
        G10.g(list, "value");
        G10.g(nq, "computeType");
        this.b = nq;
    }

    @Override // com.daaw.AbstractC2887Yq
    public I80 a(InterfaceC2968Zk0 interfaceC2968Zk0) {
        G10.g(interfaceC2968Zk0, "module");
        I80 i80 = (I80) this.b.invoke(interfaceC2968Zk0);
        if (!AbstractC8670u80.c0(i80) && !AbstractC8670u80.q0(i80)) {
            AbstractC8670u80.D0(i80);
        }
        return i80;
    }
}
