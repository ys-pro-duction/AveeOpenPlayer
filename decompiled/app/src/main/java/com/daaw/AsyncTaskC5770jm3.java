package com.daaw;

import android.os.AsyncTask;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.ads.internal.zzs;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: com.daaw.jm3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class AsyncTaskC5770jm3 extends AsyncTask {
    public final /* synthetic */ zzs a;

    public /* synthetic */ AsyncTaskC5770jm3(zzs zzsVar, zzp zzpVar) {
        this.a = zzsVar;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String doInBackground(Void... voidArr) {
        try {
            zzs zzsVar = this.a;
            zzsVar.I = (C7782qx1) zzsVar.D.get(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e = e;
            AbstractC4274eT1.zzk("", e);
        } catch (ExecutionException e2) {
            e = e2;
            AbstractC4274eT1.zzk("", e);
        } catch (TimeoutException e3) {
            AbstractC4274eT1.zzk("", e3);
        }
        return this.a.zzp();
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        zzs zzsVar = this.a;
        String str = (String) obj;
        if (zzsVar.G == null || str == null) {
            return;
        }
        zzsVar.G.loadUrl(str);
    }
}
