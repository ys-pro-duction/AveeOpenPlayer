package com.daaw;

import com.daaw.InterfaceC3072a8;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class UG implements InterfaceC3072a8 {
    public final AP B;

    public UG(AP ap) {
        G10.g(ap, "fqNameToMatch");
        this.B = ap;
    }

    @Override // com.daaw.InterfaceC3072a8
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public TG i(AP ap) {
        G10.g(ap, "fqName");
        if (G10.c(ap, this.B)) {
            return TG.a;
        }
        return null;
    }

    @Override // com.daaw.InterfaceC3072a8
    public boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return AbstractC1599Mm.k().iterator();
    }

    @Override // com.daaw.InterfaceC3072a8
    public boolean z(AP ap) {
        return InterfaceC3072a8.b.b(this, ap);
    }
}
