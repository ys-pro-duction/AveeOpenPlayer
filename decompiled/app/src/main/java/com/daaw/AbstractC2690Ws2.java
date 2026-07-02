package com.daaw;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.internal.client.zzc;
import com.google.android.gms.ads.internal.client.zzl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Ws2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2690Ws2 implements InterfaceC2682Wq2 {
    public static Bundle d(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    @Override // com.daaw.InterfaceC2682Wq2
    public final InterfaceFutureC8236sc0 a(C9267wF2 c9267wF2, C4498fF2 c4498fF2) {
        String strOptString = c4498fF2.x.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        FF2 ff2 = c9267wF2.a.a;
        DF2 df2 = new DF2();
        df2.G(ff2);
        df2.J(strOptString);
        Bundle bundleD = d(ff2.d.zzm);
        Bundle bundleD2 = d(bundleD.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        bundleD2.putInt("gw", 1);
        String strOptString2 = c4498fF2.x.optString("mad_hac", null);
        if (strOptString2 != null) {
            bundleD2.putString("mad_hac", strOptString2);
        }
        String strOptString3 = c4498fF2.x.optString("adJson", null);
        if (strOptString3 != null) {
            bundleD2.putString("_ad", strOptString3);
        }
        bundleD2.putBoolean("_noRefresh", true);
        Iterator<String> itKeys = c4498fF2.F.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString4 = c4498fF2.F.optString(next, null);
            if (next != null) {
                bundleD2.putString(next, strOptString4);
            }
        }
        bundleD.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundleD2);
        zzl zzlVar = ff2.d;
        Bundle bundle = zzlVar.zzn;
        List list = zzlVar.zzo;
        String str = zzlVar.zzp;
        int i = zzlVar.zzd;
        String str2 = zzlVar.zzq;
        List list2 = zzlVar.zze;
        boolean z = zzlVar.zzr;
        boolean z2 = zzlVar.zzf;
        zzc zzcVar = zzlVar.zzs;
        int i2 = zzlVar.zzg;
        int i3 = zzlVar.zzt;
        boolean z3 = zzlVar.zzh;
        String str3 = zzlVar.zzu;
        String str4 = zzlVar.zzi;
        List list3 = zzlVar.zzv;
        df2.e(new zzl(zzlVar.zza, zzlVar.zzb, bundleD2, i, list2, z2, i2, z3, str4, zzlVar.zzj, zzlVar.zzk, zzlVar.zzl, bundleD, bundle, list, str, str2, z, zzcVar, i3, str3, list3, zzlVar.zzw, zzlVar.zzx, zzlVar.zzy));
        FF2 ff2G = df2.g();
        Bundle bundle2 = new Bundle();
        C5622jF2 c5622jF2 = c9267wF2.b.b;
        Bundle bundle3 = new Bundle();
        bundle3.putStringArrayList("nofill_urls", new ArrayList<>(c5622jF2.a));
        bundle3.putInt("refresh_interval", c5622jF2.c);
        bundle3.putString("gws_query_id", c5622jF2.b);
        bundle2.putBundle("parent_common_config", bundle3);
        FF2 ff22 = c9267wF2.a.a;
        Bundle bundle4 = new Bundle();
        bundle4.putString("initial_ad_unit_id", ff22.f);
        bundle4.putString("allocation_id", c4498fF2.y);
        bundle4.putStringArrayList("click_urls", new ArrayList<>(c4498fF2.c));
        bundle4.putStringArrayList("imp_urls", new ArrayList<>(c4498fF2.d));
        bundle4.putStringArrayList("manual_tracking_urls", new ArrayList<>(c4498fF2.r));
        bundle4.putStringArrayList("fill_urls", new ArrayList<>(c4498fF2.o));
        bundle4.putStringArrayList("video_start_urls", new ArrayList<>(c4498fF2.i));
        bundle4.putStringArrayList("video_reward_urls", new ArrayList<>(c4498fF2.j));
        bundle4.putStringArrayList("video_complete_urls", new ArrayList<>(c4498fF2.k));
        bundle4.putString("transaction_id", c4498fF2.l);
        bundle4.putString("valid_from_timestamp", c4498fF2.m);
        bundle4.putBoolean("is_closable_area_disabled", c4498fF2.R);
        bundle4.putString("recursive_server_response_data", c4498fF2.q0);
        if (c4498fF2.n != null) {
            Bundle bundle5 = new Bundle();
            bundle5.putInt("rb_amount", c4498fF2.n.C);
            bundle5.putString("rb_type", c4498fF2.n.B);
            bundle4.putParcelableArray("rewards", new Bundle[]{bundle5});
        }
        bundle2.putBundle("parent_ad_config", bundle4);
        return c(ff2G, bundle2, c4498fF2, c9267wF2);
    }

    @Override // com.daaw.InterfaceC2682Wq2
    public final boolean b(C9267wF2 c9267wF2, C4498fF2 c4498fF2) {
        return !TextUtils.isEmpty(c4498fF2.x.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    public abstract InterfaceFutureC8236sc0 c(FF2 ff2, Bundle bundle, C4498fF2 c4498fF2, C9267wF2 c9267wF2);
}
