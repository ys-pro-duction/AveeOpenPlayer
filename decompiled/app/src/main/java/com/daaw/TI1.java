package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class TI1 implements HI1 {
    public final BinderC1702Nl2 a;

    public TI1(BinderC1702Nl2 binderC1702Nl2) {
        this.a = binderC1702Nl2;
    }

    @Override // com.daaw.HI1
    public final void a(Object obj, Map map) {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.d9)).booleanValue()) {
            String str = (String) map.get("action");
            String str2 = (String) map.get("adUnitId");
            String str3 = (String) map.get("redirectUrl");
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                return;
            }
            String str4 = (String) map.get("format");
            if (str.equals("load") && !TextUtils.isEmpty(str4)) {
                this.a.e3(str2, str4, str3);
            } else if (str.equals("show")) {
                this.a.f3(str2, str3);
            }
        }
    }
}
