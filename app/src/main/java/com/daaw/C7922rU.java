package com.daaw;

/* JADX INFO: renamed from: com.daaw.rU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C7922rU extends AbstractC2745Xg1 {
    public C7922rU(C5510ir c5510ir) {
        super(c5510ir);
        c5510ir.e.f();
        c5510ir.f.f();
        this.f = ((C7644qU) c5510ir).K0();
    }

    @Override // com.daaw.AbstractC2745Xg1, com.daaw.InterfaceC6393lz
    public void a(InterfaceC6393lz interfaceC6393lz) {
        C8066rz c8066rz = this.h;
        if (c8066rz.c && !c8066rz.j) {
            this.h.d((int) ((((C8066rz) c8066rz.l.get(0)).g * ((C7644qU) this.b).N0()) + 0.5f));
        }
    }

    @Override // com.daaw.AbstractC2745Xg1
    public void d() {
        C7644qU c7644qU = (C7644qU) this.b;
        int iL0 = c7644qU.L0();
        int iM0 = c7644qU.M0();
        c7644qU.N0();
        if (c7644qU.K0() == 1) {
            if (iL0 != -1) {
                this.h.l.add(this.b.N.e.h);
                this.b.N.e.h.k.add(this.h);
                this.h.f = iL0;
            } else if (iM0 != -1) {
                this.h.l.add(this.b.N.e.i);
                this.b.N.e.i.k.add(this.h);
                this.h.f = -iM0;
            } else {
                C8066rz c8066rz = this.h;
                c8066rz.b = true;
                c8066rz.l.add(this.b.N.e.i);
                this.b.N.e.i.k.add(this.h);
            }
            q(this.b.e.h);
            q(this.b.e.i);
            return;
        }
        if (iL0 != -1) {
            this.h.l.add(this.b.N.f.h);
            this.b.N.f.h.k.add(this.h);
            this.h.f = iL0;
        } else if (iM0 != -1) {
            this.h.l.add(this.b.N.f.i);
            this.b.N.f.i.k.add(this.h);
            this.h.f = -iM0;
        } else {
            C8066rz c8066rz2 = this.h;
            c8066rz2.b = true;
            c8066rz2.l.add(this.b.N.f.i);
            this.b.N.f.i.k.add(this.h);
        }
        q(this.b.f.h);
        q(this.b.f.i);
    }

    @Override // com.daaw.AbstractC2745Xg1
    public void e() {
        if (((C7644qU) this.b).K0() == 1) {
            this.b.F0(this.h.g);
        } else {
            this.b.G0(this.h.g);
        }
    }

    @Override // com.daaw.AbstractC2745Xg1
    public void f() {
        this.h.c();
    }

    @Override // com.daaw.AbstractC2745Xg1
    public boolean m() {
        return false;
    }

    public final void q(C8066rz c8066rz) {
        this.h.k.add(c8066rz);
        c8066rz.l.add(this.h);
    }
}
