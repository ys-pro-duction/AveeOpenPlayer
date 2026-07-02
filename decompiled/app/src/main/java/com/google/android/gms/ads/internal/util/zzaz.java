package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.daaw.AbstractC4970gu1;
import com.daaw.AbstractC8327su1;
import com.daaw.AbstractC9820yE1;
import com.daaw.C1010Gu1;
import com.daaw.C1426Ku1;
import com.daaw.C3845cu1;
import com.daaw.C5249hu1;
import com.daaw.C6933nu1;
import com.daaw.C8606tu1;
import com.daaw.RJ1;
import com.daaw.XS1;
import java.io.File;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class zzaz extends C8606tu1 {
    public final Context d;

    public zzaz(Context context, AbstractC8327su1 abstractC8327su1) {
        super(abstractC8327su1);
        this.d = context;
    }

    public static C5249hu1 zzb(Context context) {
        C5249hu1 c5249hu1 = new C5249hu1(new C1010Gu1(new File(context.getCacheDir(), "admob_volley"), 20971520), new zzaz(context, new C1426Ku1()), 4);
        c5249hu1.d();
        return c5249hu1;
    }

    @Override // com.daaw.C8606tu1, com.daaw.InterfaceC2277St1
    public final C3845cu1 zza(AbstractC4970gu1 abstractC4970gu1) throws C6933nu1 {
        if (abstractC4970gu1.zza() == 0) {
            if (Pattern.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().b(AbstractC9820yE1.o4), abstractC4970gu1.zzk())) {
                Context context = this.d;
                com.google.android.gms.ads.internal.client.zzay.zzb();
                if (XS1.w(context, 13400000)) {
                    C3845cu1 c3845cu1Zza = new RJ1(this.d).zza(abstractC4970gu1);
                    if (c3845cu1Zza != null) {
                        zze.zza("Got gmscore asset response: ".concat(String.valueOf(abstractC4970gu1.zzk())));
                        return c3845cu1Zza;
                    }
                    zze.zza("Failed to get gmscore asset response: ".concat(String.valueOf(abstractC4970gu1.zzk())));
                }
            }
        }
        return super.zza(abstractC4970gu1);
    }
}
