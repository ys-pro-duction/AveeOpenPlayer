package com.daaw;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public class LS implements InterfaceC6983o51 {
    public final InterfaceC6983o51 a;
    public final InterfaceC1883Pf b;

    public LS(InterfaceC6983o51 interfaceC6983o51, InterfaceC1883Pf interfaceC1883Pf) {
        this.a = interfaceC6983o51;
        this.b = interfaceC1883Pf;
    }

    @Override // com.daaw.InterfaceC6983o51
    public KI0 a(KI0 ki0, int i, int i2) {
        IS is = (IS) ki0.get();
        Bitmap bitmapF = ((IS) ki0.get()).f();
        Bitmap bitmap = (Bitmap) this.a.a(new C2113Rf(bitmapF, this.b), i, i2).get();
        return !bitmap.equals(bitmapF) ? new KS(new IS(is, bitmap, this.a)) : ki0;
    }

    @Override // com.daaw.InterfaceC6983o51
    public String getId() {
        return this.a.getId();
    }
}
