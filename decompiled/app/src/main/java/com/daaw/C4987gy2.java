package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.daaw.gy2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4987gy2 implements InterfaceC1447Kz2 {
    public final PS2 a;
    public final ViewGroup b;
    public final Context c;
    public final Set d;

    public C4987gy2(PS2 ps2, ViewGroup viewGroup, Context context, Set set) {
        this.a = ps2;
        this.d = set;
        this.b = viewGroup;
        this.c = context;
    }

    public final /* synthetic */ C5266hy2 a() {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.P5)).booleanValue() && this.b != null && this.d.contains("banner")) {
            return new C5266hy2(Boolean.valueOf(this.b.isHardwareAccelerated()));
        }
        Boolean boolValueOf = null;
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.Q5)).booleanValue() && this.d.contains("native")) {
            Context context = this.c;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                Window window = activity.getWindow();
                if (window == null || (window.getAttributes().flags & 16777216) == 0) {
                    try {
                        boolValueOf = Boolean.valueOf((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & AdRequest.MAX_CONTENT_URL_LENGTH) != 0);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                } else {
                    boolValueOf = Boolean.TRUE;
                }
                return new C5266hy2(boolValueOf);
            }
        }
        return new C5266hy2(null);
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 22;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        return this.a.S0(new Callable() { // from class: com.daaw.fy2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.a();
            }
        });
    }
}
