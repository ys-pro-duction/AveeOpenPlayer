package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.daaw.Px2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1958Px2 implements InterfaceC1447Kz2 {
    public final Context a;
    public final PS2 b;

    public C1958Px2(Context context, PS2 ps2) {
        this.a = context;
        this.b = ps2;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 19;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        return this.b.S0(new Callable() { // from class: com.daaw.Ox2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String strZzj;
                String strZzk;
                String strE;
                zzt.zzp();
                C3641cA1 c3641cA1Zzg = zzt.zzo().h().zzg();
                Bundle bundle = null;
                if (c3641cA1Zzg != null && (!zzt.zzo().h().zzN() || !zzt.zzo().h().zzO())) {
                    if (c3641cA1Zzg.h()) {
                        c3641cA1Zzg.g();
                    }
                    C2301Sz1 c2301Sz1A = c3641cA1Zzg.a();
                    if (c2301Sz1A != null) {
                        strZzj = c2301Sz1A.d();
                        strE = c2301Sz1A.e();
                        strZzk = c2301Sz1A.f();
                        if (strZzj != null) {
                            zzt.zzo().h().zzw(strZzj);
                        }
                        if (strZzk != null) {
                            zzt.zzo().h().zzy(strZzk);
                        }
                    } else {
                        strZzj = zzt.zzo().h().zzj();
                        strZzk = zzt.zzo().h().zzk();
                        strE = null;
                    }
                    Bundle bundle2 = new Bundle(1);
                    if (!zzt.zzo().h().zzO()) {
                        if (strZzk == null || TextUtils.isEmpty(strZzk)) {
                            bundle2.putString("v_fp_vertical", "no_hash");
                        } else {
                            bundle2.putString("v_fp_vertical", strZzk);
                        }
                    }
                    if (strZzj != null && !zzt.zzo().h().zzN()) {
                        bundle2.putString("fingerprint", strZzj);
                        if (!strZzj.equals(strE)) {
                            bundle2.putString("v_fp", strE);
                        }
                    }
                    if (!bundle2.isEmpty()) {
                        bundle = bundle2;
                    }
                }
                return new C2084Qx2(bundle);
            }
        });
    }
}
