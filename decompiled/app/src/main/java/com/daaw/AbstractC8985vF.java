package com.daaw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.vF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8985vF extends AbstractC8699uF {
    public List G;

    public AbstractC8985vF() {
        super(2, 1.0f, 1.0f);
        this.G = new ArrayList();
    }

    @Override // com.daaw.AbstractC8699uF
    public void G(InterfaceC9336wX interfaceC9336wX, AbstractC7070oQ abstractC7070oQ) {
        super.G(interfaceC9336wX, abstractC7070oQ);
        for (AbstractC8699uF abstractC8699uF : this.G) {
            if (abstractC8699uF.W()) {
                abstractC8699uF.G(interfaceC9336wX, abstractC7070oQ);
            }
        }
    }

    public abstract AbstractC8699uF Y(int i, String str, String str2);

    public void Z(AbstractC8699uF abstractC8699uF) {
        AbstractC6278lb.c("addChildAtEnd", null, abstractC8699uF.g);
        this.G.add(abstractC8699uF);
        abstractC8699uF.g = this;
    }

    public void a0(InterfaceC9336wX interfaceC9336wX, AbstractC7070oQ abstractC7070oQ, MW mw) {
        Iterator it = this.G.iterator();
        while (it.hasNext()) {
            ((AbstractC8699uF) it.next()).y(interfaceC9336wX, abstractC7070oQ, mw);
        }
    }

    public boolean b0(RW rw, InterfaceC4577fX interfaceC4577fX) {
        if (rw == null) {
            return false;
        }
        int size = this.G.size();
        for (int i = 0; i < size; i++) {
            if (!((AbstractC8699uF) this.G.get(i)).g((C2591Vu) rw.b(), 0, interfaceC4577fX)) {
                return false;
            }
        }
        return true;
    }

    public AbstractC8699uF c0(int i) {
        AbstractC8699uF abstractC8699uF = (AbstractC8699uF) this.G.remove(i);
        abstractC8699uF.g = null;
        return abstractC8699uF;
    }

    @Override // com.daaw.AbstractC8699uF
    public void d() {
        Iterator it = this.G.iterator();
        while (it.hasNext()) {
            ((AbstractC8699uF) it.next()).d();
        }
        super.d();
    }

    public void d0(TH0 th0, AbstractC7070oQ abstractC7070oQ) {
        for (AbstractC8699uF abstractC8699uF : this.G) {
            if (abstractC8699uF.W()) {
                abstractC8699uF.B(th0, abstractC7070oQ);
                abstractC8699uF.D(th0);
            } else {
                abstractC8699uF.E(th0, abstractC7070oQ);
            }
        }
    }

    @Override // com.daaw.AbstractC8699uF
    public AbstractC8699uF e(int i) {
        AbstractC8699uF abstractC8699uFE = super.e(i);
        if (abstractC8699uFE != null) {
            return abstractC8699uFE;
        }
        Iterator it = this.G.iterator();
        while (it.hasNext()) {
            AbstractC8699uF abstractC8699uFE2 = ((AbstractC8699uF) it.next()).e(i);
            if (abstractC8699uFE2 != null) {
                return abstractC8699uFE2;
            }
        }
        return null;
    }

    public void e0(TH0 th0) {
        for (AbstractC8699uF abstractC8699uF : this.G) {
            if (abstractC8699uF.W()) {
                abstractC8699uF.F(th0);
            }
        }
    }

    public boolean f0(RW rw) {
        if (rw == null) {
            return false;
        }
        int iC = rw.c();
        int size = 0;
        for (int i = 0; i < iC; i++) {
            C2591Vu c2591Vu = (C2591Vu) rw.a(i);
            String strC = c2591Vu.C();
            String strE = c2591Vu.E();
            if (size >= this.G.size()) {
                AbstractC8699uF abstractC8699uFY = Y(i, strC, strE);
                if (abstractC8699uFY != null) {
                    Z(abstractC8699uFY);
                    size = this.G.size() - 1;
                }
            } else if (!C2533Vf1.a((AbstractC8699uF) this.G.get(size), strC, strE)) {
                ((AbstractC8699uF) this.G.get(size)).d();
                AbstractC8699uF abstractC8699uFY2 = Y(i, strC, strE);
                if (abstractC8699uFY2 != null) {
                    this.G.set(size, abstractC8699uFY2);
                }
            }
            ((AbstractC8699uF) this.G.get(size)).K((C2591Vu) rw.a(i), i);
            size++;
        }
        while (size < this.G.size()) {
            List list = this.G;
            ((AbstractC8699uF) list.remove(list.size() - 1)).d();
        }
        return true;
    }

    @Override // com.daaw.AbstractC8699uF
    public void l() {
        super.l();
        Iterator it = this.G.iterator();
        while (it.hasNext()) {
            ((AbstractC8699uF) it.next()).l();
        }
    }

    @Override // com.daaw.AbstractC8699uF
    public void y(InterfaceC9336wX interfaceC9336wX, AbstractC7070oQ abstractC7070oQ, MW mw) {
        super.y(interfaceC9336wX, abstractC7070oQ, mw);
        a0(interfaceC9336wX, abstractC7070oQ, mw);
    }

    @Override // com.daaw.AbstractC8699uF
    public void t(C2591Vu c2591Vu) {
    }

    @Override // com.daaw.AbstractC8699uF
    public void z(C2591Vu c2591Vu, InterfaceC4577fX interfaceC4577fX) {
    }
}
