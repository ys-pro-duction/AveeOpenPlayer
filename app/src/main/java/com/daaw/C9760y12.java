package com.daaw;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.y12, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9760y12 implements X02 {
    public final CookieManager a;

    public C9760y12(Context context) {
        this.a = zzt.zzq().zzb(context);
    }

    @Override // com.daaw.X02
    public final void a(Map map) {
        if (this.a == null) {
            return;
        }
        if (((String) map.get("clear")) == null) {
            String str = (String) map.get("cookie");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.a.setCookie((String) zzba.zzc().b(AbstractC9820yE1.M0), str);
            return;
        }
        String str2 = (String) zzba.zzc().b(AbstractC9820yE1.M0);
        String cookie = this.a.getCookie(str2);
        if (cookie == null) {
            return;
        }
        List listF = C10140zO2.c(TN2.b(';')).f(cookie);
        for (int i = 0; i < listF.size(); i++) {
            CookieManager cookieManager = this.a;
            Iterator it = C10140zO2.c(TN2.b('=')).d((String) listF.get(i)).iterator();
            it.getClass();
            if (!it.hasNext()) {
                throw new IndexOutOfBoundsException("position (0) must be less than the number of elements that remained (0)");
            }
            cookieManager.setCookie(str2, String.valueOf((String) it.next()).concat(String.valueOf((String) zzba.zzc().b(AbstractC9820yE1.w0))));
        }
    }
}
