package com.daaw;

import com.daaw.AbstractC0304Ac0;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.yP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9862yP extends AbstractC0304Ac0.h {
    @Override // com.daaw.AbstractC0304Ac0.h
    public List b() {
        return i().b();
    }

    @Override // com.daaw.AbstractC0304Ac0.h
    public Object d() {
        return i().d();
    }

    @Override // com.daaw.AbstractC0304Ac0.h
    public void e() {
        i().e();
    }

    @Override // com.daaw.AbstractC0304Ac0.h
    public void f() {
        i().f();
    }

    @Override // com.daaw.AbstractC0304Ac0.h
    public void g(AbstractC0304Ac0.j jVar) {
        i().g(jVar);
    }

    public abstract AbstractC0304Ac0.h i();

    public String toString() {
        return AbstractC6329ll0.b(this).d("delegate", i()).toString();
    }
}
