package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import com.daaw.AbstractC7506py0;
import com.daaw.C10157zT;
import com.daaw.C9320wT;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepName;

/* JADX INFO: loaded from: classes.dex */
@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    public int B = 0;

    public static Intent a(Context context, PendingIntent pendingIntent, int i, boolean z) {
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", z);
        return intent;
    }

    public final void b() {
        GoogleApiActivity googleApiActivity;
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            finish();
            return;
        }
        if (pendingIntent == null) {
            C9320wT.n().o(this, ((Integer) AbstractC7506py0.l(num)).intValue(), 2, this);
            this.B = 1;
            return;
        }
        try {
            googleApiActivity = this;
        } catch (ActivityNotFoundException unused) {
            googleApiActivity = this;
        } catch (IntentSender.SendIntentException unused2) {
        }
        try {
            googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
            googleApiActivity.B = 1;
        } catch (ActivityNotFoundException unused3) {
            if (extras.getBoolean("notify_manager", true)) {
                C10157zT.t(this).B(new ConnectionResult(22, null), getIntent().getIntExtra("failing_client_id", -1));
            } else {
                String str = "Activity not found while launching " + pendingIntent.toString() + ".";
                if (Build.FINGERPRINT.contains("generic")) {
                    str.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                }
            }
            googleApiActivity.B = 1;
            finish();
        } catch (IntentSender.SendIntentException unused4) {
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.B = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                C10157zT c10157zTT = C10157zT.t(this);
                if (i2 == -1) {
                    c10157zTT.C();
                } else if (i2 == 0) {
                    c10157zTT.B(new ConnectionResult(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.B = 0;
            setResult(i2, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.B = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.B = bundle.getInt("resolution");
        }
        if (this.B != 1) {
            b();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.B);
        super.onSaveInstanceState(bundle);
    }
}
