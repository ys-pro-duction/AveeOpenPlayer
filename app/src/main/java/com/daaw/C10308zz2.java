package com.daaw;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzcaz;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.daaw.zz2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10308zz2 implements InterfaceC1447Kz2 {
    public final PS2 a;
    public final Context b;
    public final zzcaz c;
    public final String d;

    public C10308zz2(PS2 ps2, Context context, zzcaz zzcazVar, String str) {
        this.a = ps2;
        this.b = context;
        this.c = zzcazVar;
        this.d = str;
    }

    public final /* synthetic */ C0398Az2 a() {
        boolean zG = C6878nj1.a(this.b).g();
        zzt.zzp();
        boolean zZzD = com.google.android.gms.ads.internal.util.zzt.zzD(this.b);
        String str = this.c.B;
        zzt.zzp();
        boolean zZzE = com.google.android.gms.ads.internal.util.zzt.zzE();
        zzt.zzp();
        ApplicationInfo applicationInfo = this.b.getApplicationInfo();
        int i = applicationInfo == null ? 0 : applicationInfo.targetSdkVersion;
        Context context = this.b;
        return new C0398Az2(zG, zZzD, str, zZzE, i, DynamiteModule.c(context, ModuleDescriptor.MODULE_ID), DynamiteModule.a(context, ModuleDescriptor.MODULE_ID), this.d);
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 35;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        return this.a.S0(new Callable() { // from class: com.daaw.yz2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.a();
            }
        });
    }
}
