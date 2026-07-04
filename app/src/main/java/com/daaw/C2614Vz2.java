package com.daaw;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.daaw.Vz2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2614Vz2 implements InterfaceC1447Kz2 {
    public final PS2 a;
    public final Context b;

    public C2614Vz2(PS2 ps2, Context context) {
        this.a = ps2;
        this.b = context;
    }

    public static ResolveInfo b(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ com.daaw.C2406Tz2 a() {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C2614Vz2.a():com.daaw.Tz2");
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 38;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        return this.a.S0(new Callable() { // from class: com.daaw.Uz2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.a();
            }
        });
    }
}
