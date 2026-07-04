package com.daaw;

import com.daaw.C8066rz;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class NV extends AbstractC2745Xg1 {
    public NV(C5510ir c5510ir) {
        super(c5510ir);
    }

    private void q(C8066rz c8066rz) {
        this.h.k.add(c8066rz);
        c8066rz.l.add(this.h);
    }

    @Override // com.daaw.AbstractC2745Xg1, com.daaw.InterfaceC6393lz
    public void a(InterfaceC6393lz interfaceC6393lz) {
        C5726je c5726je = (C5726je) this.b;
        int iL0 = c5726je.L0();
        Iterator it = this.h.l.iterator();
        int i = 0;
        int i2 = -1;
        while (it.hasNext()) {
            int i3 = ((C8066rz) it.next()).g;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (iL0 == 0 || iL0 == 2) {
            this.h.d(i2 + c5726je.M0());
        } else {
            this.h.d(i + c5726je.M0());
        }
    }

    @Override // com.daaw.AbstractC2745Xg1
    public void d() {
        C5510ir c5510ir = this.b;
        if (c5510ir instanceof C5726je) {
            this.h.b = true;
            C5726je c5726je = (C5726je) c5510ir;
            int iL0 = c5726je.L0();
            boolean zK0 = c5726je.K0();
            int i = 0;
            if (iL0 == 0) {
                this.h.e = C8066rz.a.LEFT;
                while (i < c5726je.x0) {
                    C5510ir c5510ir2 = c5726je.w0[i];
                    if (zK0 || c5510ir2.O() != 8) {
                        C8066rz c8066rz = c5510ir2.e.h;
                        c8066rz.k.add(this.h);
                        this.h.l.add(c8066rz);
                    }
                    i++;
                }
                q(this.b.e.h);
                q(this.b.e.i);
                return;
            }
            if (iL0 == 1) {
                this.h.e = C8066rz.a.RIGHT;
                while (i < c5726je.x0) {
                    C5510ir c5510ir3 = c5726je.w0[i];
                    if (zK0 || c5510ir3.O() != 8) {
                        C8066rz c8066rz2 = c5510ir3.e.i;
                        c8066rz2.k.add(this.h);
                        this.h.l.add(c8066rz2);
                    }
                    i++;
                }
                q(this.b.e.h);
                q(this.b.e.i);
                return;
            }
            if (iL0 == 2) {
                this.h.e = C8066rz.a.TOP;
                while (i < c5726je.x0) {
                    C5510ir c5510ir4 = c5726je.w0[i];
                    if (zK0 || c5510ir4.O() != 8) {
                        C8066rz c8066rz3 = c5510ir4.f.h;
                        c8066rz3.k.add(this.h);
                        this.h.l.add(c8066rz3);
                    }
                    i++;
                }
                q(this.b.f.h);
                q(this.b.f.i);
                return;
            }
            if (iL0 != 3) {
                return;
            }
            this.h.e = C8066rz.a.BOTTOM;
            while (i < c5726je.x0) {
                C5510ir c5510ir5 = c5726je.w0[i];
                if (zK0 || c5510ir5.O() != 8) {
                    C8066rz c8066rz4 = c5510ir5.f.i;
                    c8066rz4.k.add(this.h);
                    this.h.l.add(c8066rz4);
                }
                i++;
            }
            q(this.b.f.h);
            q(this.b.f.i);
        }
    }

    @Override // com.daaw.AbstractC2745Xg1
    public void e() {
        C5510ir c5510ir = this.b;
        if (c5510ir instanceof C5726je) {
            int iL0 = ((C5726je) c5510ir).L0();
            if (iL0 == 0 || iL0 == 1) {
                this.b.F0(this.h.g);
            } else {
                this.b.G0(this.h.g);
            }
        }
    }

    @Override // com.daaw.AbstractC2745Xg1
    public void f() {
        this.c = null;
        this.h.c();
    }

    @Override // com.daaw.AbstractC2745Xg1
    public boolean m() {
        return false;
    }
}
