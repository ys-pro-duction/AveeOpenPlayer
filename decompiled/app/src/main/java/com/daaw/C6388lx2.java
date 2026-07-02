package com.daaw;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.daaw.lx2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6388lx2 implements InterfaceC1447Kz2 {
    public final PS2 a;
    public final Context b;

    public C6388lx2(PS2 ps2, Context context) {
        this.a = ps2;
        this.b = context;
    }

    public final /* synthetic */ C6667mx2 a() {
        double d;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent intentRegisterReceiver = (!((Boolean) zzba.zzc().b(AbstractC9820yE1.ca)).booleanValue() || Build.VERSION.SDK_INT < 33) ? this.b.registerReceiver(null, intentFilter) : this.b.registerReceiver(null, intentFilter, 4);
        if (intentRegisterReceiver != null) {
            int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
            double intExtra2 = intentRegisterReceiver.getIntExtra("level", -1);
            double intExtra3 = intentRegisterReceiver.getIntExtra("scale", -1);
            z = intExtra == 2 || intExtra == 5;
            d = intExtra2 / intExtra3;
        } else {
            d = -1.0d;
        }
        return new C6667mx2(d, z);
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 14;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        return this.a.S0(new Callable() { // from class: com.daaw.kx2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.a();
            }
        });
    }
}
