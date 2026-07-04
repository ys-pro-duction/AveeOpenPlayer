package com.daaw;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: com.daaw.Nb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1659Nb implements InterfaceC4610fe0 {
    public final AtomicLong a = new AtomicLong();

    @Override // com.daaw.InterfaceC4610fe0
    public void a(long j) {
        this.a.getAndAdd(j);
    }
}
