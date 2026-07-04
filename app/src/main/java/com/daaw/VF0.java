package com.daaw;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class VF0 extends OF0 implements InterfaceC5565j30 {
    public final AP a;

    public VF0(AP ap) {
        G10.g(ap, "fqName");
        this.a = ap;
    }

    @Override // com.daaw.InterfaceC5565j30
    public Collection K(NQ nq) {
        G10.g(nq, "nameFilter");
        return AbstractC1599Mm.k();
    }

    @Override // com.daaw.InterfaceC5565j30
    public AP d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof VF0) && G10.c(d(), ((VF0) obj).d());
    }

    public int hashCode() {
        return d().hashCode();
    }

    @Override // com.daaw.InterfaceC9205w20
    public InterfaceC7525q20 i(AP ap) {
        G10.g(ap, "fqName");
        return null;
    }

    @Override // com.daaw.InterfaceC9205w20
    public boolean n() {
        return false;
    }

    public String toString() {
        return VF0.class.getName() + ": " + d();
    }

    @Override // com.daaw.InterfaceC5565j30
    public Collection z() {
        return AbstractC1599Mm.k();
    }

    @Override // com.daaw.InterfaceC9205w20
    public List getAnnotations() {
        return AbstractC1599Mm.k();
    }
}
