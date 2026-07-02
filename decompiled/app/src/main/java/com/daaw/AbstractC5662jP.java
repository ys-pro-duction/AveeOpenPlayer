package com.daaw;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.daaw.jP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5662jP extends AbstractC5456ig0 {
    public abstract AbstractC5456ig0 e();

    @Override // com.daaw.AbstractC5456ig0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public AbstractC5662jP c(long j, TimeUnit timeUnit) {
        e().c(j, timeUnit);
        return g();
    }

    @Override // com.daaw.AbstractC5456ig0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public AbstractC5662jP d() {
        e().d();
        return g();
    }

    public String toString() {
        return AbstractC6329ll0.b(this).d("delegate", e()).toString();
    }

    public final AbstractC5662jP g() {
        return this;
    }
}
