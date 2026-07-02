package com.daaw;

import com.google.android.gms.internal.ads.zzbvg;

/* JADX INFO: loaded from: classes3.dex */
public final class ID2 implements WN2 {
    public final /* synthetic */ LD2 a;

    public ID2(LD2 ld2) {
        this.a = ld2;
    }

    @Override // com.daaw.WN2
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        zzbvg zzbvgVar = (zzbvg) obj;
        this.a.d = new KD2(zzbvgVar, new LG2(zzbvgVar.K), null);
        return this.a.d;
    }
}
