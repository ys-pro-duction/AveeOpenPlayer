package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.LinearLayout;
import com.daaw.BinderC7744qp0;
import com.daaw.PL1;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdj;

/* JADX INFO: loaded from: classes.dex */
public final class OutOfContextTestingActivity extends Activity {
    public static final String AD_UNIT_KEY = "adUnit";
    public static final String CLASS_NAME = "com.google.android.gms.ads.OutOfContextTestingActivity";

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zzdj zzdjVarZzf = zzay.zza().zzf(this, new PL1());
        if (zzdjVarZzf == null) {
            finish();
            return;
        }
        setContentView(R.layout.admob_empty_layout);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layout);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra(AD_UNIT_KEY);
        if (stringExtra == null) {
            finish();
            return;
        }
        try {
            zzdjVarZzf.zze(stringExtra, BinderC7744qp0.Z2(this), BinderC7744qp0.Z2(linearLayout));
        } catch (RemoteException unused) {
            finish();
        }
    }
}
