package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import com.daaw.AbstractC1772Od0;
import com.daaw.AbstractC3834cs0;
import com.daaw.C0537Ci1;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    public static final String a = AbstractC1772Od0.f("ConstrntProxyUpdtRecvr");

    public class a implements Runnable {
        public final /* synthetic */ Intent B;
        public final /* synthetic */ Context C;
        public final /* synthetic */ BroadcastReceiver.PendingResult D;

        public a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.B = intent;
            this.C = context;
            this.D = pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.B.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.B.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.B.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.B.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                AbstractC1772Od0.c().a(ConstraintProxyUpdateReceiver.a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)), new Throwable[0]);
                AbstractC3834cs0.a(this.C, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                AbstractC3834cs0.a(this.C, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                AbstractC3834cs0.a(this.C, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                AbstractC3834cs0.a(this.C, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.D.finish();
            }
        }
    }

    public static Intent a(Context context, boolean z, boolean z2, boolean z3, boolean z4) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            C0537Ci1.k(context).p().b(new a(intent, context, goAsync()));
        } else {
            AbstractC1772Od0.c().a(a, String.format("Ignoring unknown action %s", action), new Throwable[0]);
        }
    }
}
