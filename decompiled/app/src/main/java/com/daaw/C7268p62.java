package com.daaw;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.internal.ads.zzbvg;
import com.google.android.gms.internal.ads.zzcaz;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.daaw.p62, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7268p62 {
    public final YH2 a;
    public final zzcaz b;
    public final ApplicationInfo c;
    public final String d;
    public final List e;
    public final PackageInfo f;
    public final V73 g;
    public final String h;
    public final C1758Nz2 i;
    public final zzg j;
    public final FF2 k;
    public final C7949ra2 l;

    public C7268p62(YH2 yh2, zzcaz zzcazVar, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, V73 v73, zzg zzgVar, String str2, C1758Nz2 c1758Nz2, FF2 ff2, C7949ra2 c7949ra2) {
        this.a = yh2;
        this.b = zzcazVar;
        this.c = applicationInfo;
        this.d = str;
        this.e = list;
        this.f = packageInfo;
        this.g = v73;
        this.h = str2;
        this.i = c1758Nz2;
        this.j = zzgVar;
        this.k = ff2;
        this.l = c7949ra2;
    }

    public final /* synthetic */ zzbvg a(InterfaceFutureC8236sc0 interfaceFutureC8236sc0) {
        Bundle bundle = (Bundle) interfaceFutureC8236sc0.get();
        String str = (String) ((InterfaceFutureC8236sc0) this.g.zzb()).get();
        boolean z = ((Boolean) zzba.zzc().b(AbstractC9820yE1.e7)).booleanValue() && this.j.zzQ();
        String str2 = this.h;
        PackageInfo packageInfo = this.f;
        List list = this.e;
        return new zzbvg(bundle, this.b, this.c, this.d, list, packageInfo, str, str2, null, null, z, this.k.b());
    }

    public final InterfaceFutureC8236sc0 b() {
        this.l.zza();
        return IH2.c(this.i.a(new Bundle()), SH2.SIGNALS, this.a).a();
    }

    public final InterfaceFutureC8236sc0 c() {
        final InterfaceFutureC8236sc0 interfaceFutureC8236sc0B = b();
        return this.a.a(SH2.REQUEST_PARCEL, interfaceFutureC8236sc0B, (InterfaceFutureC8236sc0) this.g.zzb()).a(new Callable() { // from class: com.daaw.o62
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.a(interfaceFutureC8236sc0B);
            }
        }).a();
    }
}
