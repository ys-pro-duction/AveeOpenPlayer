package com.daaw;

import com.google.android.gms.ads.h5.OnH5AdsEventListener;

/* JADX INFO: renamed from: com.daaw.oJ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC7044oJ1 extends AbstractBinderC7602qJ1 {
    public final OnH5AdsEventListener B;

    public BinderC7044oJ1(OnH5AdsEventListener onH5AdsEventListener) {
        this.B = onH5AdsEventListener;
    }

    @Override // com.daaw.InterfaceC7880rJ1
    public final void zzb(String str) {
        this.B.onH5AdsEvent(str);
    }
}
