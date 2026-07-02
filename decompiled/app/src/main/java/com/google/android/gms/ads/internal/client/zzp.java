package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import com.daaw.XS1;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.search.SearchAdRequest;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zzp {
    public static final zzp zza = new zzp();

    public final zzl zza(Context context, zzdx zzdxVar) {
        String strU;
        Date dateZzn = zzdxVar.zzn();
        long time = dateZzn != null ? dateZzn.getTime() : -1L;
        String strZzk = zzdxVar.zzk();
        int iZza = zzdxVar.zza();
        Set setZzq = zzdxVar.zzq();
        List listUnmodifiableList = !setZzq.isEmpty() ? DesugarCollections.unmodifiableList(new ArrayList(setZzq)) : null;
        boolean zZzs = zzdxVar.zzs(context);
        Bundle bundleZzf = zzdxVar.zzf(AdMobAdapter.class);
        String strZzl = zzdxVar.zzl();
        SearchAdRequest searchAdRequestZzi = zzdxVar.zzi();
        zzfh zzfhVar = searchAdRequestZzi != null ? new zzfh(searchAdRequestZzi) : null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            zzay.zzb();
            strU = XS1.u(Thread.currentThread().getStackTrace(), packageName);
        } else {
            strU = null;
        }
        boolean zZzr = zzdxVar.zzr();
        RequestConfiguration requestConfigurationZzc = zzej.zzf().zzc();
        return new zzl(8, time, bundleZzf, iZza, listUnmodifiableList, zZzs, Math.max(zzdxVar.zzc(), requestConfigurationZzc.getTagForChildDirectedTreatment()), false, strZzl, zzfhVar, null, strZzk, zzdxVar.zzg(), zzdxVar.zze(), DesugarCollections.unmodifiableList(new ArrayList(zzdxVar.zzp())), zzdxVar.zzm(), strU, zZzr, null, requestConfigurationZzc.getTagForUnderAgeOfConsent(), (String) Collections.max(Arrays.asList(null, requestConfigurationZzc.getMaxAdContentRating()), new Comparator() { // from class: com.google.android.gms.ads.internal.client.zzo
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list = RequestConfiguration.zza;
                return list.indexOf((String) obj) - list.indexOf((String) obj2);
            }
        }), zzdxVar.zzo(), zzdxVar.zzb(), zzdxVar.zzj(), requestConfigurationZzc.getPublisherPrivacyPersonalizationState().getValue());
    }
}
