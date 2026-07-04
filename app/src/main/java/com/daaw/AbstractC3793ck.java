package com.daaw;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: com.daaw.ck, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3793ck extends AbstractC9472x implements InterfaceC3236ak {
    public final InterfaceC3236ak E;

    public AbstractC3793ck(InterfaceC4684ft interfaceC4684ft, InterfaceC3236ak interfaceC3236ak, boolean z, boolean z2) {
        super(interfaceC4684ft, z, z2);
        this.E = interfaceC3236ak;
    }

    public final InterfaceC3236ak V0() {
        return this.E;
    }

    @Override // com.daaw.QE0
    public Object b(InterfaceC1416Ks interfaceC1416Ks) {
        return this.E.b(interfaceC1416Ks);
    }

    @Override // com.daaw.HP0
    public Object e(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
        return this.E.e(obj, interfaceC1416Ks);
    }

    @Override // com.daaw.QE0
    public Object f() {
        return this.E.f();
    }

    @Override // com.daaw.HP0
    public boolean g(Throwable th) {
        return this.E.g(th);
    }

    @Override // com.daaw.QE0
    public InterfaceC5756jk iterator() {
        return this.E.iterator();
    }

    @Override // com.daaw.C3889d40, com.daaw.U30, com.daaw.QE0
    public final void j(CancellationException cancellationException) {
        if (e0()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new V30(B(), null, this);
        }
        y(cancellationException);
    }

    @Override // com.daaw.HP0
    public Object k(Object obj) {
        return this.E.k(obj);
    }

    @Override // com.daaw.C3889d40
    public void y(Throwable th) {
        CancellationException cancellationExceptionI0 = C3889d40.I0(this, th, null, 1, null);
        this.E.j(cancellationExceptionI0);
        v(cancellationExceptionI0);
    }
}
