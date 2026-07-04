package com.daaw;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.daaw.gf3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4897gf3 implements Mf3 {
    public final /* synthetic */ C8812uf3 a;

    public C4897gf3(C8812uf3 c8812uf3) {
        this.a = c8812uf3;
    }

    @Override // com.daaw.Mf3
    public final void a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.a.x().z(new RunnableC4051df3(this, str, "_err", bundle));
            return;
        }
        C8812uf3 c8812uf3 = this.a;
        if (c8812uf3.l != null) {
            c8812uf3.l.w().n().b("AppId not known when logging event", "_err");
        }
    }
}
