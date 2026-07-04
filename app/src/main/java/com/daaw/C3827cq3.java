package com.daaw;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.daaw.cq3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3827cq3 extends AbstractC9435wr1 {
    public final Callable D;

    public C3827cq3(String str, Callable callable) {
        super("internal.appMetadata");
        this.D = callable;
    }

    @Override // com.daaw.AbstractC9435wr1
    public final InterfaceC1637Mv1 a(ES2 es2, List list) {
        try {
            return AbstractC4593fa3.b(this.D.call());
        } catch (Exception unused) {
            return InterfaceC1637Mv1.t;
        }
    }
}
