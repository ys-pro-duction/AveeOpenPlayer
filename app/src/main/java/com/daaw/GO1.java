package com.daaw;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbzo;

/* JADX INFO: loaded from: classes3.dex */
public final class GO1 {
    public static InterfaceC3156aS1 e;
    public final Context a;
    public final AdFormat b;
    public final zzdx c;
    public final String d;

    public GO1(Context context, AdFormat adFormat, zzdx zzdxVar, String str) {
        this.a = context;
        this.b = adFormat;
        this.c = zzdxVar;
        this.d = str;
    }

    public static InterfaceC3156aS1 a(Context context) {
        InterfaceC3156aS1 interfaceC3156aS1;
        synchronized (GO1.class) {
            try {
                if (e == null) {
                    e = zzay.zza().zzr(context, new PL1());
                }
                interfaceC3156aS1 = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC3156aS1;
    }

    public final void b(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzl zzlVarZza;
        InterfaceC3156aS1 interfaceC3156aS1A = a(this.a);
        if (interfaceC3156aS1A == null) {
            queryInfoGenerationCallback.onFailure("Internal Error, query info generator is null.");
            return;
        }
        Context context = this.a;
        zzdx zzdxVar = this.c;
        InterfaceC7934rX interfaceC7934rXZ2 = BinderC7744qp0.Z2(context);
        if (zzdxVar == null) {
            zzlVarZza = new zzm().zza();
        } else {
            zzlVarZza = zzp.zza.zza(this.a, zzdxVar);
        }
        try {
            interfaceC3156aS1A.zze(interfaceC7934rXZ2, new zzbzo(this.d, this.b.name(), null, zzlVarZza), new FO1(this, queryInfoGenerationCallback));
        } catch (RemoteException unused) {
            queryInfoGenerationCallback.onFailure("Internal Error.");
        }
    }
}
