package com.daaw;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: renamed from: com.daaw.ax2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3301ax2 implements InterfaceC1447Kz2 {
    public static final Object j = new Object();
    public final Context a;
    public final String b;
    public final String c;
    public final C5021h52 d;
    public final C7591qG2 e;
    public final FF2 f;
    public final zzg g = zzt.zzo().h();
    public final C0542Cj2 h;
    public final C9501x52 i;

    public C3301ax2(Context context, String str, String str2, C5021h52 c5021h52, C7591qG2 c7591qG2, FF2 ff2, C0542Cj2 c0542Cj2, C9501x52 c9501x52) {
        this.a = context;
        this.b = str;
        this.c = str2;
        this.d = c5021h52;
        this.e = c7591qG2;
        this.f = ff2;
        this.h = c0542Cj2;
        this.i = c9501x52;
    }

    public final /* synthetic */ void a(Bundle bundle, Bundle bundle2) {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.x5)).booleanValue()) {
            bundle2.putBundle("quality_signals", bundle);
        } else {
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.w5)).booleanValue()) {
                synchronized (j) {
                    this.d.d(this.f.d);
                    bundle2.putBundle("quality_signals", this.e.a());
                }
            } else {
                this.d.d(this.f.d);
                bundle2.putBundle("quality_signals", this.e.a());
            }
        }
        bundle2.putString("seq_num", this.b);
        if (!this.g.zzQ()) {
            bundle2.putString("session_id", this.c);
        }
        bundle2.putBoolean("client_purpose_one", !this.g.zzQ());
        zzt.zzp();
        bundle2.putString("_app_id", com.google.android.gms.ads.internal.util.zzt.zzp(this.a));
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.y5)).booleanValue() || this.f.f == null) {
            return;
        }
        Bundle bundle3 = new Bundle();
        bundle3.putLong("dload", this.i.b(this.f.f));
        bundle3.putInt("pcc", this.i.a(this.f.f));
        bundle2.putBundle("ad_unit_quality_signals", bundle3);
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 12;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        final Bundle bundle = new Bundle();
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.v7)).booleanValue()) {
            C0542Cj2 c0542Cj2 = this.h;
            c0542Cj2.a().put("seq_num", this.b);
        }
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.x5)).booleanValue()) {
            this.d.d(this.f.d);
            bundle.putAll(this.e.a());
        }
        return AbstractC7360pS2.h(new InterfaceC1343Jz2() { // from class: com.daaw.Zw2
            @Override // com.daaw.InterfaceC1343Jz2
            public final void a(Object obj) {
                this.a.a(bundle, (Bundle) obj);
            }
        });
    }
}
