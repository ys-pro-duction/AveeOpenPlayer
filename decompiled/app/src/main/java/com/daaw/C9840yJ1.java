package com.daaw;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: renamed from: com.daaw.yJ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9840yJ1 {
    public final Context a;
    public final OnH5AdsEventListener b;
    public InterfaceC8717uJ1 c;

    public C9840yJ1(Context context, OnH5AdsEventListener onH5AdsEventListener) {
        AbstractC7506py0.p(true, "Android version must be Lollipop or higher");
        AbstractC7506py0.l(context);
        AbstractC7506py0.l(onH5AdsEventListener);
        this.a = context;
        this.b = onH5AdsEventListener;
        AbstractC9820yE1.a(context);
    }

    public static final boolean c(String str) {
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.o9)).booleanValue()) {
            return false;
        }
        AbstractC7506py0.l(str);
        if (str.length() > ((Integer) zzba.zzc().b(AbstractC9820yE1.q9)).intValue()) {
            AbstractC4274eT1.zze("H5 GMSG exceeds max length");
            return false;
        }
        Uri uri = Uri.parse(str);
        return "gmsg".equals(uri.getScheme()) && "mobileads.google.com".equals(uri.getHost()) && "/h5ads".equals(uri.getPath());
    }

    public final void a() {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.o9)).booleanValue()) {
            d();
            InterfaceC8717uJ1 interfaceC8717uJ1 = this.c;
            if (interfaceC8717uJ1 != null) {
                try {
                    interfaceC8717uJ1.zze();
                } catch (RemoteException e) {
                    AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final boolean b(String str) {
        if (!c(str)) {
            return false;
        }
        d();
        InterfaceC8717uJ1 interfaceC8717uJ1 = this.c;
        if (interfaceC8717uJ1 == null) {
            return false;
        }
        try {
            interfaceC8717uJ1.e(str);
            return true;
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
            return true;
        }
    }

    public final void d() {
        if (this.c != null) {
            return;
        }
        this.c = zzay.zza().zzl(this.a, new PL1(), this.b);
    }
}
