package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import com.daaw.A2;
import com.daaw.AbstractActivityC5776jo;
import com.daaw.E2;
import com.daaw.F2;
import com.daaw.JC1;
import com.google.android.apps.common.proguard.UsedByReflection;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("PlatformActivityProxy")
public class ProxyBillingActivityV2 extends AbstractActivityC5776jo {
    public F2 X;
    public F2 Y;
    public ResultReceiver Z;
    public ResultReceiver a0;

    public final void a0(ActivityResult activityResult) {
        Intent data = activityResult.getData();
        int iB = JC1.d(data, "ProxyBillingActivityV2").b();
        ResultReceiver resultReceiver = this.Z;
        if (resultReceiver != null) {
            resultReceiver.send(iB, data == null ? null : data.getExtras());
        }
        if (activityResult.getResultCode() != -1 || iB != 0) {
            JC1.j("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + activityResult.getResultCode() + " and billing's responseCode: " + iB);
        }
        finish();
    }

    public final void b0(ActivityResult activityResult) {
        Intent data = activityResult.getData();
        int iB = JC1.d(data, "ProxyBillingActivityV2").b();
        ResultReceiver resultReceiver = this.a0;
        if (resultReceiver != null) {
            resultReceiver.send(iB, data == null ? null : data.getExtras());
        }
        if (activityResult.getResultCode() != -1 || iB != 0) {
            JC1.j("ProxyBillingActivityV2", String.format("External offer dialog finished with resultCode: %s and billing's responseCode: %s", Integer.valueOf(activityResult.getResultCode()), Integer.valueOf(iB)));
        }
        finish();
    }

    @Override // com.daaw.AbstractActivityC5776jo, com.daaw.AbstractActivityC7459po, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.X = Y(new E2(), new A2() { // from class: com.daaw.Z52
            @Override // com.daaw.A2
            public final void a(Object obj) {
                this.a.a0((ActivityResult) obj);
            }
        });
        this.Y = Y(new E2(), new A2() { // from class: com.daaw.F62
            @Override // com.daaw.A2
            public final void a(Object obj) {
                this.a.b0((ActivityResult) obj);
            }
        });
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.Z = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
                return;
            } else {
                if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                    this.a0 = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
                    return;
                }
                return;
            }
        }
        JC1.i("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.Z = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            this.X.a(new IntentSenderRequest.a(pendingIntent).a());
        } else if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.a0 = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            this.Y.a(new IntentSenderRequest.a(pendingIntent2).a());
        }
    }

    @Override // com.daaw.AbstractActivityC5776jo, com.daaw.AbstractActivityC7459po, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.Z;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.a0;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
    }
}
