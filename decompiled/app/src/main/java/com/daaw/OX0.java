package com.daaw;

import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class OX0 implements NI0 {
    public final com.bumptech.glide.load.resource.bitmap.a a;
    public InterfaceC1883Pf b;
    public EnumC0591Cw c;
    public String d;

    public OX0(InterfaceC1883Pf interfaceC1883Pf, EnumC0591Cw enumC0591Cw) {
        this(com.bumptech.glide.load.resource.bitmap.a.c, interfaceC1883Pf, enumC0591Cw);
    }

    @Override // com.daaw.NI0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public KI0 c(InputStream inputStream, int i, int i2) {
        return C2113Rf.d(this.a.a(inputStream, this.b, i, i2, this.c), this.b);
    }

    @Override // com.daaw.NI0
    public String getId() {
        if (this.d == null) {
            this.d = "StreamBitmapDecoder.com.bumptech.glide.load.resource.bitmap" + this.a.getId() + this.c.name();
        }
        return this.d;
    }

    public OX0(com.bumptech.glide.load.resource.bitmap.a aVar, InterfaceC1883Pf interfaceC1883Pf, EnumC0591Cw enumC0591Cw) {
        this.a = aVar;
        this.b = interfaceC1883Pf;
        this.c = enumC0591Cw;
    }
}
