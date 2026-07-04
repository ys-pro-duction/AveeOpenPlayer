package com.google.android.gms.ads.internal.client;

import com.daaw.AbstractBinderC7594qH1;
import com.daaw.BinderC7744qp0;
import com.daaw.InterfaceC7934rX;
import com.google.android.gms.ads.formats.ShouldDelayBannerRenderingListener;

/* JADX INFO: loaded from: classes.dex */
public final class zzfj extends AbstractBinderC7594qH1 {
    public final ShouldDelayBannerRenderingListener B;

    public zzfj(ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
        this.B = shouldDelayBannerRenderingListener;
    }

    @Override // com.daaw.InterfaceC7872rH1
    public final boolean zzb(InterfaceC7934rX interfaceC7934rX) {
        return this.B.shouldDelayBannerRendering((Runnable) BinderC7744qp0.I(interfaceC7934rX));
    }
}
