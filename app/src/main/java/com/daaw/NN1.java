package com.daaw;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.android.billingclient.api.ProxyBillingActivity;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class NN1 extends AbstractBinderC9148vp3 {
    public final WeakReference B;
    public final ResultReceiver C;

    public /* synthetic */ NN1(WeakReference weakReference, ResultReceiver resultReceiver, AbstractC5656jN1 abstractC5656jN1) {
        this.B = weakReference;
        this.C = resultReceiver;
    }

    @Override // com.daaw.InterfaceC4105dq3
    public final void m2(Bundle bundle) {
        ResultReceiver resultReceiver = this.C;
        if (resultReceiver == null) {
            JC1.j("BillingClient", "Unable to send result for in-app messaging");
            return;
        }
        if (bundle == null) {
            resultReceiver.send(0, null);
            return;
        }
        Activity activity = (Activity) this.B.get();
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("KEY_LAUNCH_INTENT");
        if (activity == null || pendingIntent == null) {
            this.C.send(0, null);
            JC1.j("BillingClient", "Unable to launch intent for in-app messaging");
            return;
        }
        try {
            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
            intent.putExtra("in_app_message_result_receiver", this.C);
            intent.putExtra("IN_APP_MESSAGE_INTENT", pendingIntent);
            activity.startActivity(intent);
        } catch (CancellationException e) {
            this.C.send(0, null);
            JC1.k("BillingClient", "Exception caught while launching intent for in-app messaging.", e);
        }
    }
}
