package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public class BS implements WI0 {
    public final WI0 a;

    public BS(WI0 wi0) {
        this.a = wi0;
    }

    @Override // com.daaw.WI0
    public KI0 a(KI0 ki0) {
        AS as = (AS) ki0.get();
        KI0 ki0A = as.a();
        return ki0A != null ? this.a.a(ki0A) : as.b();
    }

    @Override // com.daaw.WI0
    public String getId() {
        return "GifBitmapWrapperDrawableTranscoder.com.bumptech.glide.load.resource.transcode";
    }
}
