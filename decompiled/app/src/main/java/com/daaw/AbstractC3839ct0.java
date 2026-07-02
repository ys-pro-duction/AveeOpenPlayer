package com.daaw;

/* JADX INFO: renamed from: com.daaw.ct0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3839ct0 extends AbstractC1699Nl {
    @Override // com.daaw.AbstractC1699Nl
    public void a(String str, Throwable th) {
        f().a(str, th);
    }

    @Override // com.daaw.AbstractC1699Nl
    public void b() {
        f().b();
    }

    @Override // com.daaw.AbstractC1699Nl
    public void c(int i) {
        f().c(i);
    }

    public abstract AbstractC1699Nl f();

    public String toString() {
        return AbstractC6329ll0.b(this).d("delegate", f()).toString();
    }
}
