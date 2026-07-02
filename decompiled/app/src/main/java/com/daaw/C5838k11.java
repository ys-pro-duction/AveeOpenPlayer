package com.daaw;

import com.daaw.AbstractC5362iK;
import com.daaw.C4515fK;
import com.daaw.C4954gr0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.k11, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C5838k11 {
    public final String a;
    public C4515fK b;
    public final List c;
    public final List d;

    public C5838k11(Z01 z01) {
        this.a = z01.d() != null ? z01.d() : z01.n().l();
        this.d = z01.m();
        this.b = null;
        this.c = new ArrayList();
        Iterator it = z01.h().iterator();
        while (it.hasNext()) {
            C4515fK c4515fK = (C4515fK) ((ZK) it.next());
            if (c4515fK.j()) {
                C4515fK c4515fK2 = this.b;
                AbstractC6557mb.d(c4515fK2 == null || c4515fK2.g().equals(c4515fK.g()), "Only a single inequality is supported", new Object[0]);
                this.b = c4515fK;
            } else {
                this.c.add(c4515fK);
            }
        }
    }

    public final boolean a(AbstractC5362iK.c cVar) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            if (b((C4515fK) it.next(), cVar)) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(C4515fK c4515fK, AbstractC5362iK.c cVar) {
        if (c4515fK != null && c4515fK.g().equals(cVar.g())) {
            if (cVar.h().equals(AbstractC5362iK.c.a.CONTAINS) == (c4515fK.h().equals(C4515fK.b.ARRAY_CONTAINS) || c4515fK.h().equals(C4515fK.b.ARRAY_CONTAINS_ANY))) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(C4954gr0 c4954gr0, AbstractC5362iK.c cVar) {
        if (!c4954gr0.c().equals(cVar.g())) {
            return false;
        }
        if (cVar.h().equals(AbstractC5362iK.c.a.ASCENDING) && c4954gr0.b().equals(C4954gr0.a.ASCENDING)) {
            return true;
        }
        return cVar.h().equals(AbstractC5362iK.c.a.DESCENDING) && c4954gr0.b().equals(C4954gr0.a.DESCENDING);
    }

    public boolean d(AbstractC5362iK abstractC5362iK) {
        AbstractC6557mb.d(abstractC5362iK.d().equals(this.a), "Collection IDs do not match", new Object[0]);
        AbstractC5362iK.c cVarC = abstractC5362iK.c();
        if (cVarC != null && !a(cVarC)) {
            return false;
        }
        Iterator it = this.d.iterator();
        List listE = abstractC5362iK.e();
        int i = 0;
        while (i < listE.size() && a((AbstractC5362iK.c) listE.get(i))) {
            i++;
        }
        if (i == listE.size()) {
            return true;
        }
        if (this.b != null) {
            AbstractC5362iK.c cVar = (AbstractC5362iK.c) listE.get(i);
            if (!b(this.b, cVar) || !c((C4954gr0) it.next(), cVar)) {
                return false;
            }
            i++;
        }
        while (i < listE.size()) {
            AbstractC5362iK.c cVar2 = (AbstractC5362iK.c) listE.get(i);
            if (!it.hasNext() || !c((C4954gr0) it.next(), cVar2)) {
                return false;
            }
            i++;
        }
        return true;
    }
}
