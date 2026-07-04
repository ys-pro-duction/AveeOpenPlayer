package com.google.android.gms.ads.internal.util;

import android.R;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.daaw.AbstractC4274eT1;
import com.daaw.BinderC9431wq2;
import com.daaw.C5416iX1;
import com.daaw.C6454mB1;
import com.daaw.FW1;
import com.daaw.InterfaceC9334wW1;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class zzu extends zzab {
    public zzu() {
        super(null);
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final int zza() {
        return R.style.Theme.Material.Dialog.Alert;
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final CookieManager zzb(Context context) {
        com.google.android.gms.ads.internal.zzt.zzp();
        if (zzt.zzE()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            AbstractC4274eT1.zzh("Failed to obtain CookieManager.", th);
            com.google.android.gms.ads.internal.zzt.zzo().t(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final WebResourceResponse zzc(String str, String str2, int i, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i, str3, map, inputStream);
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final FW1 zzd(InterfaceC9334wW1 interfaceC9334wW1, C6454mB1 c6454mB1, boolean z, BinderC9431wq2 binderC9431wq2) {
        return new C5416iX1(interfaceC9334wW1, c6454mB1, z, binderC9431wq2);
    }
}
