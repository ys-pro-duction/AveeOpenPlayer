package com.daaw;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.daaw.Ru1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2175Ru1 extends ThreadLocal {
    public C2175Ru1(AbstractC2281Su1 abstractC2281Su1) {
    }

    @Override // java.lang.ThreadLocal
    public final /* synthetic */ Object initialValue() {
        return ByteBuffer.allocate(32);
    }
}
