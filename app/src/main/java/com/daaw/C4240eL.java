package com.daaw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.eL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4240eL implements InterfaceC3072a8 {
    public final InterfaceC3072a8 B;
    public final boolean C;
    public final NQ D;

    public C4240eL(InterfaceC3072a8 interfaceC3072a8, boolean z, NQ nq) {
        G10.g(interfaceC3072a8, "delegate");
        G10.g(nq, "fqNameFilter");
        this.B = interfaceC3072a8;
        this.C = z;
        this.D = nq;
    }

    public final boolean e(O7 o7) {
        AP apD = o7.d();
        return apD != null && ((Boolean) this.D.invoke(apD)).booleanValue();
    }

    @Override // com.daaw.InterfaceC3072a8
    public O7 i(AP ap) {
        G10.g(ap, "fqName");
        if (((Boolean) this.D.invoke(ap)).booleanValue()) {
            return this.B.i(ap);
        }
        return null;
    }

    @Override // com.daaw.InterfaceC3072a8
    public boolean isEmpty() {
        boolean z;
        InterfaceC3072a8 interfaceC3072a8 = this.B;
        if ((interfaceC3072a8 instanceof Collection) && ((Collection) interfaceC3072a8).isEmpty()) {
            z = false;
        } else {
            Iterator it = interfaceC3072a8.iterator();
            while (it.hasNext()) {
                if (e((O7) it.next())) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        return this.C ? !z : z;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        InterfaceC3072a8 interfaceC3072a8 = this.B;
        ArrayList arrayList = new ArrayList();
        for (Object obj : interfaceC3072a8) {
            if (e((O7) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList.iterator();
    }

    @Override // com.daaw.InterfaceC3072a8
    public boolean z(AP ap) {
        G10.g(ap, "fqName");
        if (((Boolean) this.D.invoke(ap)).booleanValue()) {
            return this.B.z(ap);
        }
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4240eL(InterfaceC3072a8 interfaceC3072a8, NQ nq) {
        this(interfaceC3072a8, false, nq);
        G10.g(interfaceC3072a8, "delegate");
        G10.g(nq, "fqNameFilter");
    }
}
