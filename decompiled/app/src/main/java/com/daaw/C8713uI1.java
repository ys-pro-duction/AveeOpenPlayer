package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.uI1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8713uI1 extends AbstractC5601jA1 {
    @Override // com.daaw.AbstractC5601jA1
    public final InterfaceC1637Mv1 a(String str, ES2 es2, List list) {
        if (str == null || str.isEmpty() || !es2.h(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", str));
        }
        InterfaceC1637Mv1 interfaceC1637Mv1D = es2.d(str);
        if (interfaceC1637Mv1D instanceof AbstractC9435wr1) {
            return ((AbstractC9435wr1) interfaceC1637Mv1D).a(es2, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", str));
    }
}
