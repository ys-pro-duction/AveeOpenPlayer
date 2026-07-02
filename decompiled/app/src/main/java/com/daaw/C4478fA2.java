package com.daaw;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: renamed from: com.daaw.fA2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4478fA2 implements InterfaceC1343Jz2 {
    public final String a;
    public final int b;

    public /* synthetic */ C4478fA2(String str, int i, AbstractC4199eA2 abstractC4199eA2) {
        this.a = str;
        this.b = i;
    }

    @Override // com.daaw.InterfaceC1343Jz2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.C9)).booleanValue()) {
            if (!TextUtils.isEmpty(this.a)) {
                bundle.putString("topics", this.a);
            }
            int i = this.b;
            if (i != -1) {
                bundle.putInt("atps", i);
            }
        }
    }
}
