package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class LL1 {
    public static LL1 b;
    public final AtomicBoolean a = new AtomicBoolean(false);

    public static LL1 a() {
        if (b == null) {
            b = new LL1();
        }
        return b;
    }

    public final Thread b(final Context context, final String str) {
        if (!this.a.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new Runnable() { // from class: com.daaw.KL1
            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = context;
                AbstractC9820yE1.a(context2);
                Bundle bundle = new Bundle();
                bundle.putBoolean("measurementEnabled", ((Boolean) zzba.zzc().b(AbstractC9820yE1.h0)).booleanValue());
                if (((Boolean) zzba.zzc().b(AbstractC9820yE1.o0)).booleanValue()) {
                    bundle.putString("ad_storage", "denied");
                    bundle.putString("analytics_storage", "denied");
                }
                try {
                    ((InterfaceC9896yX1) AbstractC5400iT1.b(context2, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", new InterfaceC4842gT1() { // from class: com.daaw.JL1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.daaw.InterfaceC4842gT1
                        public final Object zza(Object obj) {
                            return AbstractBinderC9617xX1.Z2(obj);
                        }
                    })).Q1(BinderC7744qp0.Z2(context2), new IL1(Z9.k(context2, "FA-Ads", "am", str, bundle)));
                } catch (RemoteException | C5121hT1 | NullPointerException e) {
                    AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
                }
            }
        });
        thread.start();
        return thread;
    }
}
