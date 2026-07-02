package com.daaw;

import android.net.Uri;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class IO1 extends DO1 {
    public final /* synthetic */ UpdateClickUrlCallback B;

    public IO1(MO1 mo1, UpdateClickUrlCallback updateClickUrlCallback) {
        this.B = updateClickUrlCallback;
    }

    @Override // com.daaw.EO1
    public final void a(String str) {
        this.B.onFailure(str);
    }

    @Override // com.daaw.EO1
    public final void s0(List list) {
        this.B.onSuccess((Uri) list.get(0));
    }
}
