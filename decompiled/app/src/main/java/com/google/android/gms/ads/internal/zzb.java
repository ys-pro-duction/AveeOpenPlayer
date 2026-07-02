package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.daaw.InterfaceC3152aR1;
import com.google.android.gms.internal.ads.zzbum;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzb {
    public final Context a;
    public boolean b;
    public final InterfaceC3152aR1 c;
    public final zzbum d = new zzbum(false, Collections.EMPTY_LIST);

    public zzb(Context context, InterfaceC3152aR1 interfaceC3152aR1, zzbum zzbumVar) {
        this.a = context;
        this.c = interfaceC3152aR1;
    }

    public final boolean a() {
        InterfaceC3152aR1 interfaceC3152aR1 = this.c;
        return (interfaceC3152aR1 != null && interfaceC3152aR1.zza().G) || this.d.B;
    }

    public final void zza() {
        this.b = true;
    }

    public final void zzb(String str) {
        List<String> list;
        if (a()) {
            if (str == null) {
                str = "";
            }
            InterfaceC3152aR1 interfaceC3152aR1 = this.c;
            if (interfaceC3152aR1 != null) {
                interfaceC3152aR1.a(str, null, 3);
                return;
            }
            zzbum zzbumVar = this.d;
            if (!zzbumVar.B || (list = zzbumVar.C) == null) {
                return;
            }
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    String strReplace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                    Context context = this.a;
                    zzt.zzp();
                    com.google.android.gms.ads.internal.util.zzt.zzK(context, "", strReplace);
                }
            }
        }
    }

    public final boolean zzc() {
        return !a() || this.b;
    }
}
