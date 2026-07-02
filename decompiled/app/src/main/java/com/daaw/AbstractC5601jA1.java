package com.daaw;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.jA1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5601jA1 {
    public final List a = new ArrayList();

    public abstract InterfaceC1637Mv1 a(String str, ES2 es2, List list);

    public final InterfaceC1637Mv1 b(String str) {
        if (this.a.contains(AbstractC7831r73.e(str))) {
            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
