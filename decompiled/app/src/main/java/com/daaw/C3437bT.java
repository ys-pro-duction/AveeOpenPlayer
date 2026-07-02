package com.daaw;

import android.content.res.Resources;
import android.graphics.Bitmap;

/* JADX INFO: renamed from: com.daaw.bT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3437bT implements WI0 {
    public final Resources a;
    public final InterfaceC1883Pf b;

    public C3437bT(Resources resources, InterfaceC1883Pf interfaceC1883Pf) {
        this.a = resources;
        this.b = interfaceC1883Pf;
    }

    @Override // com.daaw.WI0
    public KI0 a(KI0 ki0) {
        return new C3158aT(new ZS(this.a, (Bitmap) ki0.get()), this.b);
    }

    @Override // com.daaw.WI0
    public String getId() {
        return "GlideBitmapDrawableTranscoder.com.bumptech.glide.load.resource.transcode";
    }
}
