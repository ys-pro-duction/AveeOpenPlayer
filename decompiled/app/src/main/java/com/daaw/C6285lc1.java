package com.daaw;

import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.lc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6285lc1 implements InterfaceC4236eK {
    public final UJ a;
    public final C6824nY0 b;

    public C6285lc1(UJ uj) {
        this.a = uj;
        this.b = new C6824nY0(uj);
    }

    public final void g(AbstractC3958dK abstractC3958dK) {
        String strD = this.b.d(abstractC3958dK.c());
        if (!strD.isEmpty()) {
            throw new IllegalArgumentException(String.format("Invalid chars in expression! Expression: %s Invalid chars: %s", abstractC3958dK.c(), strD));
        }
    }

    public boolean h(AbstractC9005vK abstractC9005vK) {
        return (abstractC9005vK instanceof M00) && ((M00) abstractC9005vK).a().intValue() == -1;
    }

    public void i(AbstractC9005vK abstractC9005vK) {
        if (abstractC9005vK instanceof M00) {
            Integer numA = ((M00) abstractC9005vK).a();
            if (!this.a.g(numA.intValue())) {
                throw new IllegalArgumentException(String.format("Value %s not in range [%s, %s]", numA, Integer.valueOf(this.a.d()), Integer.valueOf(this.a.a())));
            }
        }
    }

    public void j(AbstractC9005vK abstractC9005vK) {
        if (abstractC9005vK instanceof M00) {
            Integer numA = ((M00) abstractC9005vK).a();
            if (!this.a.h(numA.intValue())) {
                throw new IllegalArgumentException(String.format("Period %s not in range [%s, %s]", numA, Integer.valueOf(this.a.d()), Integer.valueOf(this.a.a())));
            }
        }
    }

    public boolean k(AbstractC9005vK abstractC9005vK) {
        return (abstractC9005vK instanceof C5407iV0) && !EnumC5128hV0.L.equals(abstractC9005vK.a());
    }

    public final void l(C4325ef c4325ef) {
        i(c4325ef.e());
        i(c4325ef.f());
        if (k(c4325ef.e()) || k(c4325ef.f())) {
            throw new IllegalArgumentException("No special characters allowed in range, except for 'L'");
        }
    }

    @Override // com.daaw.InterfaceC4236eK
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Q3 d(Q3 q3) {
        g(q3);
        return q3;
    }

    @Override // com.daaw.InterfaceC4236eK
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public C5013h4 f(C5013h4 c5013h4) {
        g(c5013h4);
        Iterator it = c5013h4.f().iterator();
        while (it.hasNext()) {
            ((AbstractC3958dK) it.next()).a(this);
        }
        return c5013h4;
    }

    @Override // com.daaw.InterfaceC4236eK
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public C4325ef a(C4325ef c4325ef) {
        g(c4325ef);
        l(c4325ef);
        if (this.a.i() && (c4325ef.e() instanceof M00) && (c4325ef.f() instanceof M00)) {
            Integer numA = ((M00) c4325ef.e()).a();
            int iIntValue = numA.intValue();
            Integer numA2 = ((M00) c4325ef.f()).a();
            if (iIntValue > numA2.intValue()) {
                throw new IllegalArgumentException(String.format("Invalid range! [%s,%s]", numA, numA2));
            }
        }
        return c4325ef;
    }

    @Override // com.daaw.InterfaceC4236eK
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public C5631jI b(C5631jI c5631jI) {
        g(c5631jI);
        if (c5631jI.e() != null) {
            c5631jI.e().a(this);
        }
        j(c5631jI.f());
        return c5631jI;
    }

    @Override // com.daaw.InterfaceC4236eK
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public C2676Wp0 c(C2676Wp0 c2676Wp0) {
        g(c2676Wp0);
        if (!h(c2676Wp0.h())) {
            i(c2676Wp0.h());
        }
        if (!h(c2676Wp0.e())) {
            i(c2676Wp0.e());
        }
        return c2676Wp0;
    }

    @Override // com.daaw.InterfaceC4236eK
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public C8688uC0 e(C8688uC0 c8688uC0) {
        g(c8688uC0);
        return c8688uC0;
    }
}
