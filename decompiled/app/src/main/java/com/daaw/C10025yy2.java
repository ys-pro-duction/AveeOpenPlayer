package com.daaw;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.daaw.yy2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10025yy2 implements InterfaceC1447Kz2 {
    public final PS2 a;
    public final FF2 b;
    public final PackageInfo c;
    public final zzg d;

    public C10025yy2(PS2 ps2, FF2 ff2, PackageInfo packageInfo, zzg zzgVar) {
        this.a = ps2;
        this.b = ff2;
        this.c = packageInfo;
        this.d = zzgVar;
    }

    public static /* synthetic */ InterfaceC10304zy2 a(final C10025yy2 c10025yy2) {
        final ArrayList arrayList = c10025yy2.b.g;
        return arrayList == null ? new InterfaceC10304zy2() { // from class: com.daaw.vy2
            @Override // com.daaw.InterfaceC1343Jz2
            public final void a(Object obj) {
            }
        } : arrayList.isEmpty() ? new InterfaceC10304zy2() { // from class: com.daaw.wy2
            @Override // com.daaw.InterfaceC1343Jz2
            public final void a(Object obj) {
                ((Bundle) obj).putInt("native_version", 0);
            }
        } : new InterfaceC10304zy2() { // from class: com.daaw.xy2
            @Override // com.daaw.InterfaceC1343Jz2
            public final void a(Object obj) {
                this.a.b(arrayList, (Bundle) obj);
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void b(java.util.ArrayList r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C10025yy2.b(java.util.ArrayList, android.os.Bundle):void");
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 26;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        return this.a.S0(new Callable() { // from class: com.daaw.uy2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C10025yy2.a(this.a);
            }
        });
    }
}
