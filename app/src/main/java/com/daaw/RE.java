package com.daaw;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class RE extends US0 {
    public final SE o;

    public RE(List list) {
        super("DvbDecoder");
        C2584Vs0 c2584Vs0 = new C2584Vs0((byte[]) list.get(0));
        this.o = new SE(c2584Vs0.D(), c2584Vs0.D());
    }

    @Override // com.daaw.US0
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public TE z(byte[] bArr, int i, boolean z) {
        if (z) {
            this.o.r();
        }
        return new TE(this.o.b(bArr, i));
    }
}
