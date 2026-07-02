package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.daaw.AH1;
import com.daaw.AbstractC4274eT1;
import com.daaw.C0597Cx1;
import com.daaw.C10111zH1;
import com.daaw.C10307zz1;
import com.daaw.C1625Ms1;
import com.daaw.C1809Om1;
import com.daaw.C2087Qy1;
import com.daaw.C2381Tt1;
import com.daaw.C3258ao1;
import com.daaw.C4406ev1;
import com.daaw.C4822gO1;
import com.daaw.C5224hp1;
import com.daaw.C6076kq1;
import com.daaw.C8312sr1;
import com.daaw.CG1;
import com.daaw.InterfaceC3156aS1;
import com.daaw.InterfaceC3697cO1;
import com.daaw.InterfaceC5660jO1;
import com.daaw.InterfaceC8187sQ1;
import com.daaw.InterfaceC8717uJ1;
import com.daaw.InterfaceC9270wG1;
import com.daaw.JQ1;
import com.daaw.SL1;
import com.daaw.ZO1;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zzaw {
    public final zzk a;
    public final zzi b;
    public final zzeq c;
    public final C10111zH1 d;
    public final JQ1 e;
    public final C4822gO1 f;
    public final AH1 g;
    public ZO1 h;

    public zzaw(zzk zzkVar, zzi zziVar, zzeq zzeqVar, C10111zH1 c10111zH1, JQ1 jq1, C4822gO1 c4822gO1, AH1 ah1) {
        this.a = zzkVar;
        this.b = zziVar;
        this.c = zzeqVar;
        this.d = c10111zH1;
        this.e = jq1;
        this.f = c4822gO1;
        this.g = ah1;
    }

    public static /* bridge */ /* synthetic */ void i(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzay.zzb().r(context, zzay.zzc().B, "gmob-apps", bundle, true);
    }

    public final zzbq zzc(Context context, String str, SL1 sl1) {
        return (zzbq) new C4406ev1(this, context, str, sl1).d(context, false);
    }

    public final zzbu zzd(Context context, zzq zzqVar, String str, SL1 sl1) {
        return (zzbu) new C1625Ms1(this, context, zzqVar, str, sl1).d(context, false);
    }

    public final zzbu zze(Context context, zzq zzqVar, String str, SL1 sl1) {
        return (zzbu) new C2381Tt1(this, context, zzqVar, str, sl1).d(context, false);
    }

    public final zzdj zzf(Context context, SL1 sl1) {
        return (zzdj) new C3258ao1(this, context, sl1).d(context, false);
    }

    public final InterfaceC9270wG1 zzh(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (InterfaceC9270wG1) new C0597Cx1(this, frameLayout, frameLayout2, context).d(context, false);
    }

    public final CG1 zzi(View view, HashMap map, HashMap map2) {
        return (CG1) new C2087Qy1(this, view, map, map2).d(view.getContext(), false);
    }

    public final InterfaceC8717uJ1 zzl(Context context, SL1 sl1, OnH5AdsEventListener onH5AdsEventListener) {
        return (InterfaceC8717uJ1) new C8312sr1(this, context, sl1, onH5AdsEventListener).d(context, false);
    }

    public final InterfaceC3697cO1 zzm(Context context, SL1 sl1) {
        return (InterfaceC3697cO1) new C6076kq1(this, context, sl1).d(context, false);
    }

    public final InterfaceC5660jO1 zzo(Activity activity) {
        C1809Om1 c1809Om1 = new C1809Om1(this, activity);
        Intent intent = activity.getIntent();
        boolean booleanExtra = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            booleanExtra = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            AbstractC4274eT1.zzg("useClientJar flag not found in activity intent extras.");
        }
        return (InterfaceC5660jO1) c1809Om1.d(activity, booleanExtra);
    }

    public final InterfaceC8187sQ1 zzq(Context context, String str, SL1 sl1) {
        return (InterfaceC8187sQ1) new C10307zz1(this, context, str, sl1).d(context, false);
    }

    public final InterfaceC3156aS1 zzr(Context context, SL1 sl1) {
        return (InterfaceC3156aS1) new C5224hp1(this, context, sl1).d(context, false);
    }
}
