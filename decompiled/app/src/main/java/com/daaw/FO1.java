package com.daaw;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzem;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

/* JADX INFO: loaded from: classes3.dex */
public final class FO1 extends WR1 {
    public final /* synthetic */ QueryInfoGenerationCallback B;

    public FO1(GO1 go1, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        this.B = queryInfoGenerationCallback;
    }

    @Override // com.daaw.XR1
    public final void u0(String str, String str2, Bundle bundle) {
        this.B.onSuccess(new QueryInfo(new zzem(str, bundle, str2)));
    }

    @Override // com.daaw.XR1
    public final void zzb(String str) {
        this.B.onFailure(str);
    }
}
