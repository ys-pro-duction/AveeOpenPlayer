package com.daaw;

import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class HO1 extends DO1 {
    public final /* synthetic */ UpdateImpressionUrlsCallback B;

    public HO1(MO1 mo1, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.B = updateImpressionUrlsCallback;
    }

    @Override // com.daaw.EO1
    public final void a(String str) {
        this.B.onFailure(str);
    }

    @Override // com.daaw.EO1
    public final void s0(List list) {
        this.B.onSuccess(list);
    }
}
