package com.daaw;

import j$.util.concurrent.ThreadLocalRandom;
import java.util.Random;

/* JADX INFO: renamed from: com.daaw.jv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5811jv0 extends AbstractC3589c0 {
    @Override // com.daaw.AbstractC6465mE0
    public long f(long j, long j2) {
        return ThreadLocalRandom.current().nextLong(j, j2);
    }

    @Override // com.daaw.AbstractC3589c0
    public Random g() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        G10.f(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
