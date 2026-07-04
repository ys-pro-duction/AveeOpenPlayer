package com.daaw;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.Tz2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2406Tz2 implements InterfaceC1343Jz2 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final ArrayList h;
    public final String i;
    public final String j;
    public final String k;
    public final boolean l;
    public final String m;
    public final long n;
    public final boolean o;
    public final String p;
    public final int q;

    public C2406Tz2(boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, String str2, ArrayList arrayList, String str3, String str4, String str5, boolean z6, String str6, long j, boolean z7, String str7, int i) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = str2;
        this.h = arrayList;
        this.i = str3;
        this.j = str4;
        this.k = str5;
        this.l = z6;
        this.m = str6;
        this.n = j;
        this.o = z7;
        this.p = str7;
        this.q = i;
    }

    @Override // com.daaw.InterfaceC1343Jz2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putBoolean("cog", this.a);
        bundle.putBoolean("coh", this.b);
        bundle.putString("gl", this.c);
        bundle.putBoolean("simulator", this.d);
        bundle.putBoolean("is_latchsky", this.e);
        bundle.putInt("build_api_level", this.q);
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.ea)).booleanValue()) {
            bundle.putBoolean("is_sidewinder", this.f);
        }
        bundle.putString("hl", this.g);
        if (!this.h.isEmpty()) {
            bundle.putStringArrayList("hl_list", this.h);
        }
        bundle.putString("mv", this.i);
        bundle.putString("submodel", this.m);
        Bundle bundleA = RF2.a(bundle, "device");
        bundle.putBundle("device", bundleA);
        bundleA.putString("build", this.k);
        bundleA.putLong("remaining_data_partition_space", this.n);
        Bundle bundleA2 = RF2.a(bundleA, "browser");
        bundleA.putBundle("browser", bundleA2);
        bundleA2.putBoolean("is_browser_custom_tabs_capable", this.l);
        if (!TextUtils.isEmpty(this.j)) {
            Bundle bundleA3 = RF2.a(bundleA, "play_store");
            bundleA.putBundle("play_store", bundleA3);
            bundleA3.putString("package_version", this.j);
        }
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.ra)).booleanValue()) {
            bundle.putBoolean("is_bstar", this.o);
        }
        if (!TextUtils.isEmpty(this.p)) {
            bundle.putString("v_unity", this.p);
        }
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.pa)).booleanValue()) {
            RF2.g(bundle, "gotmt_l", true, ((Boolean) zzba.zzc().b(AbstractC9820yE1.ma)).booleanValue());
            RF2.g(bundle, "gotmt_i", true, ((Boolean) zzba.zzc().b(AbstractC9820yE1.la)).booleanValue());
        }
    }
}
