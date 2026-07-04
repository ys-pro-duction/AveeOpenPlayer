package com.daaw;

import com.daaw.C8066rz;

/* JADX INFO: loaded from: classes.dex */
public class VB extends C8066rz {
    public int m;

    public VB(AbstractC2745Xg1 abstractC2745Xg1) {
        super(abstractC2745Xg1);
        if (abstractC2745Xg1 instanceof C6815nW) {
            this.e = C8066rz.a.HORIZONTAL_DIMENSION;
        } else {
            this.e = C8066rz.a.VERTICAL_DIMENSION;
        }
    }

    @Override // com.daaw.C8066rz
    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (InterfaceC6393lz interfaceC6393lz : this.k) {
            interfaceC6393lz.a(interfaceC6393lz);
        }
    }
}
