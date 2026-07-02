package com.daaw;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.vw2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9180vw2 implements InterfaceC1343Jz2 {
    public final zzq a;
    public final String b;
    public final boolean c;
    public final String d;
    public final float e;
    public final int f;
    public final int g;
    public final String h;
    public final boolean i;

    public C9180vw2(zzq zzqVar, String str, boolean z, String str2, float f, int i, int i2, String str3, boolean z2) {
        AbstractC7506py0.m(zzqVar, "the adSize must not be null");
        this.a = zzqVar;
        this.b = str;
        this.c = z;
        this.d = str2;
        this.e = f;
        this.f = i;
        this.g = i2;
        this.h = str3;
        this.i = z2;
    }

    @Override // com.daaw.InterfaceC1343Jz2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        RF2.f(bundle, "smart_w", "full", this.a.zze == -1);
        RF2.f(bundle, "smart_h", "auto", this.a.zzb == -2);
        RF2.g(bundle, "ene", true, this.a.zzj);
        RF2.f(bundle, "rafmt", "102", this.a.zzm);
        RF2.f(bundle, "rafmt", "103", this.a.zzn);
        RF2.f(bundle, "rafmt", "105", this.a.zzo);
        RF2.g(bundle, "inline_adaptive_slot", true, this.i);
        RF2.g(bundle, "interscroller_slot", true, this.a.zzo);
        RF2.c(bundle, "format", this.b);
        RF2.f(bundle, "fluid", "height", this.c);
        RF2.f(bundle, "sz", this.d, !TextUtils.isEmpty(this.d));
        bundle.putFloat("u_sd", this.e);
        bundle.putInt("sw", this.f);
        bundle.putInt("sh", this.g);
        RF2.f(bundle, "sc", this.h, !TextUtils.isEmpty(this.h));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        zzq[] zzqVarArr = this.a.zzg;
        if (zzqVarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", this.a.zzb);
            bundle2.putInt("width", this.a.zze);
            bundle2.putBoolean("is_fluid_height", this.a.zzi);
            arrayList.add(bundle2);
        } else {
            for (zzq zzqVar : zzqVarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", zzqVar.zzi);
                bundle3.putInt("height", zzqVar.zzb);
                bundle3.putInt("width", zzqVar.zze);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
