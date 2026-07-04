package com.daaw;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.Wg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2641Wg1 extends C5510ir {
    public ArrayList w0 = new ArrayList();

    public abstract void K0();

    public void L0(C5510ir c5510ir) {
        this.w0.remove(c5510ir);
        c5510ir.w0(null);
    }

    public void M0() {
        this.w0.clear();
    }

    @Override // com.daaw.C5510ir
    public void Y() {
        this.w0.clear();
        super.Y();
    }

    @Override // com.daaw.C5510ir
    public void a0(C6871ni c6871ni) {
        super.a0(c6871ni);
        int size = this.w0.size();
        for (int i = 0; i < size; i++) {
            ((C5510ir) this.w0.get(i)).a0(c6871ni);
        }
    }

    public void c(C5510ir c5510ir) {
        this.w0.add(c5510ir);
        if (c5510ir.G() != null) {
            ((AbstractC2641Wg1) c5510ir.G()).L0(c5510ir);
        }
        c5510ir.w0(this);
    }
}
