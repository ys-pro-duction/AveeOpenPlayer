package com.daaw;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class Y93 implements Mf3 {
    public final /* synthetic */ Oa3 a;

    public Y93(Oa3 oa3) {
        this.a = oa3;
    }

    @Override // com.daaw.Mf3
    public final void a(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.a.n("auto", "_err", bundle);
        } else {
            this.a.q("auto", "_err", bundle, str);
        }
    }
}
