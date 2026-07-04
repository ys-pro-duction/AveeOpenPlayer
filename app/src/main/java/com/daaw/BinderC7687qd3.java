package com.daaw;

import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.qd3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC7687qd3 extends Qb3 {
    public final byte[] C;

    public BinderC7687qd3(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.C = bArr;
    }

    @Override // com.daaw.Qb3
    public final byte[] Z2() {
        return this.C;
    }
}
