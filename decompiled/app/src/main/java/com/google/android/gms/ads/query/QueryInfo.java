package com.google.android.gms.ads.query;

import android.content.Context;
import android.os.Bundle;
import com.daaw.AbstractC7506py0;
import com.daaw.AbstractC8701uF1;
import com.daaw.AbstractC9820yE1;
import com.daaw.GO1;
import com.daaw.TS1;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzem;

/* JADX INFO: loaded from: classes.dex */
public class QueryInfo {
    public final zzem a;

    public QueryInfo(zzem zzemVar) {
        this.a = zzemVar;
    }

    public static void a(final Context context, final AdFormat adFormat, final AdRequest adRequest, final String str, final QueryInfoGenerationCallback queryInfoGenerationCallback) {
        AbstractC9820yE1.a(context);
        if (((Boolean) AbstractC8701uF1.k.e()).booleanValue()) {
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.ma)).booleanValue()) {
                TS1.b.execute(new Runnable() { // from class: com.google.android.gms.ads.query.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        AdRequest adRequest2 = adRequest;
                        zzdx zzdxVarZza = adRequest2 == null ? null : adRequest2.zza();
                        new GO1(context, adFormat, zzdxVarZza, str).b(queryInfoGenerationCallback);
                    }
                });
                return;
            }
        }
        new GO1(context, adFormat, adRequest == null ? null : adRequest.zza(), str).b(queryInfoGenerationCallback);
    }

    public static void generate(Context context, AdFormat adFormat, AdRequest adRequest, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        a(context, adFormat, adRequest, null, queryInfoGenerationCallback);
    }

    public String getQuery() {
        return this.a.zzb();
    }

    public Bundle getQueryBundle() {
        return this.a.zza();
    }

    public String getRequestId() {
        return this.a.zzc();
    }

    public static void generate(Context context, AdFormat adFormat, AdRequest adRequest, String str, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        AbstractC7506py0.m(str, "AdUnitId cannot be null.");
        a(context, adFormat, adRequest, str, queryInfoGenerationCallback);
    }
}
