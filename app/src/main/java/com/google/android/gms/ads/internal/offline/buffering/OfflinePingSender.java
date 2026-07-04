package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.daaw.InterfaceC3697cO1;
import com.daaw.PL1;
import com.google.android.gms.ads.internal.client.zzay;

/* JADX INFO: loaded from: classes.dex */
public class OfflinePingSender extends Worker {
    public final InterfaceC3697cO1 H;

    public OfflinePingSender(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.H = zzay.zza().zzm(context, new PL1());
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.a doWork() {
        try {
            this.H.zzh();
            return ListenableWorker.a.c();
        } catch (RemoteException unused) {
            return ListenableWorker.a.a();
        }
    }
}
