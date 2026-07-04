package com.daaw;

import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes.dex */
public class FK implements NI0 {
    public final C0942Gd1 a;
    public final InterfaceC1883Pf b;
    public EnumC0591Cw c;

    public FK(InterfaceC1883Pf interfaceC1883Pf, EnumC0591Cw enumC0591Cw) {
        this(new C0942Gd1(), interfaceC1883Pf, enumC0591Cw);
    }

    @Override // com.daaw.NI0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public KI0 c(ParcelFileDescriptor parcelFileDescriptor, int i, int i2) {
        return C2113Rf.d(this.a.a(parcelFileDescriptor, this.b, i, i2, this.c), this.b);
    }

    @Override // com.daaw.NI0
    public String getId() {
        return "FileDescriptorBitmapDecoder.com.bumptech.glide.load.data.bitmap";
    }

    public FK(C0942Gd1 c0942Gd1, InterfaceC1883Pf interfaceC1883Pf, EnumC0591Cw enumC0591Cw) {
        this.a = c0942Gd1;
        this.b = interfaceC1883Pf;
        this.c = enumC0591Cw;
    }
}
