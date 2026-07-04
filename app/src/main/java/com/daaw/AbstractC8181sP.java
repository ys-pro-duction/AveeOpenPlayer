package com.daaw;

import com.daaw.AbstractC0304Ac0;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: com.daaw.sP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8181sP extends AbstractC0304Ac0.d {
    @Override // com.daaw.AbstractC0304Ac0.d
    public AbstractC0304Ac0.h a(AbstractC0304Ac0.b bVar) {
        return g().a(bVar);
    }

    @Override // com.daaw.AbstractC0304Ac0.d
    public AbstractC6323lk b() {
        return g().b();
    }

    @Override // com.daaw.AbstractC0304Ac0.d
    public ScheduledExecutorService c() {
        return g().c();
    }

    @Override // com.daaw.AbstractC0304Ac0.d
    public ExecutorC3034a01 d() {
        return g().d();
    }

    @Override // com.daaw.AbstractC0304Ac0.d
    public void e() {
        g().e();
    }

    public abstract AbstractC0304Ac0.d g();

    public String toString() {
        return AbstractC6329ll0.b(this).d("delegate", g()).toString();
    }
}
