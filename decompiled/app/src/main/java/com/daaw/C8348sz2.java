package com.daaw;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.daaw.sz2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8348sz2 implements InterfaceC1343Jz2 {
    public final String a;

    public C8348sz2(String str) {
        this.a = str;
    }

    @Override // com.daaw.InterfaceC1343Jz2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (TextUtils.isEmpty(this.a)) {
            return;
        }
        bundle.putString("query_info", this.a);
    }
}
