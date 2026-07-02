package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.daaw.AbstractC5179hg1;
import com.daaw.Nd3;
import com.daaw.Qd3;

/* JADX INFO: loaded from: classes3.dex */
public final class AppMeasurementService extends Service implements Nd3 {
    public Qd3 B;

    private final Qd3 d() {
        if (this.B == null) {
            this.B = new Qd3(this);
        }
        return this.B;
    }

    @Override // com.daaw.Nd3
    public final void a(Intent intent) {
        AbstractC5179hg1.b(intent);
    }

    @Override // com.daaw.Nd3
    public final void b(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // com.daaw.Nd3
    public final boolean c(int i) {
        return stopSelfResult(i);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return d().b(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        d().e();
    }

    @Override // android.app.Service
    public void onDestroy() {
        d().f();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        d().g(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        d().a(intent, i, i2);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        d().j(intent);
        return true;
    }
}
