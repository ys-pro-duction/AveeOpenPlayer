package com.daaw;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zzt;

/* JADX INFO: renamed from: com.daaw.Oy2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1858Oy2 implements InterfaceC1447Kz2, InterfaceC1343Jz2 {
    public final ApplicationInfo a;
    public final PackageInfo b;
    public final Context c;

    public C1858Oy2(ApplicationInfo applicationInfo, PackageInfo packageInfo, Context context) {
        this.a = applicationInfo;
        this.b = packageInfo;
        this.c = context;
    }

    @Override // com.daaw.InterfaceC1343Jz2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.a.packageName;
        PackageInfo packageInfo = this.b;
        Integer numValueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
        bundle.putString("pn", str);
        if (numValueOf != null) {
            bundle.putInt("vc", numValueOf.intValue());
        }
        PackageInfo packageInfo2 = this.b;
        String str2 = packageInfo2 != null ? packageInfo2.versionName : null;
        if (str2 != null) {
            bundle.putString("vnm", str2);
        }
        try {
            Context context = this.c;
            String str3 = this.a.packageName;
            HandlerC8451tM2 handlerC8451tM2 = zzt.zza;
            bundle.putString("dl", String.valueOf(C6878nj1.a(context).d(str3)));
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 29;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        return AbstractC7360pS2.h(this);
    }
}
