package com.daaw;

import android.app.Activity;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: renamed from: com.daaw.iy1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5542iy1 extends AbstractCallableC3025Zy1 {
    public final Activity i;
    public final View j;

    public C5542iy1(C2813Xx1 c2813Xx1, String str, String str2, C9733xv1 c9733xv1, int i, int i2, View view, Activity activity) {
        super(c2813Xx1, "XCj6cS5OVeEeObzd394PGDbjTuQh+vSye2UT6221ugsKtO2/oznWOSes2cnebrVR", "/UZ99NhZDGBVc8wZVXmC2wC/MG54XdFcRWhDAwHbwWE=", c9733xv1, i, 62);
        this.j = view;
        this.i = activity;
    }

    @Override // com.daaw.AbstractCallableC3025Zy1
    public final void a() {
        if (this.j == null) {
            return;
        }
        Boolean bool = (Boolean) zzba.zzc().b(AbstractC9820yE1.r2);
        boolean zBooleanValue = bool.booleanValue();
        Object[] objArr = (Object[]) this.f.invoke(null, this.j, this.i, bool);
        synchronized (this.e) {
            try {
                this.e.d0(((Long) objArr[0]).longValue());
                this.e.f0(((Long) objArr[1]).longValue());
                if (zBooleanValue) {
                    this.e.e0((String) objArr[2]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
