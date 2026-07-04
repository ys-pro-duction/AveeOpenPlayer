package com.daaw;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import j$.util.Objects;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Ch3 extends BroadcastReceiver {
    public boolean a;
    public final boolean b;
    public final /* synthetic */ Ei3 c;

    public Ch3(Ei3 ei3, boolean z) {
        this.c = ei3;
        this.b = z;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        try {
            if (this.a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Context context, IntentFilter intentFilter, String str) {
        Ch3 ch3;
        try {
            try {
                if (this.a) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    ch3 = this;
                    context.registerReceiver(ch3, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != this.b ? 4 : 2);
                } else {
                    ch3 = this;
                    context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                ch3.a = true;
                return;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        throw th;
    }

    public final synchronized void c(Context context) {
        if (!this.a) {
            JC1.j("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this);
            this.a = false;
        }
    }

    public final void d(Bundle bundle, com.android.billingclient.api.d dVar, int i) {
        if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") == null) {
            this.c.c.e(AbstractC7363pT1.a(23, i, dVar));
            return;
        }
        try {
            this.c.c.e(JS2.x(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), AU1.a()));
        } catch (Throwable unused) {
            JC1.j("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            JC1.j("BillingBroadcastManager", "Bundle is null.");
            VT1 vt1 = this.c.c;
            com.android.billingclient.api.d dVar = com.android.billingclient.api.i.j;
            vt1.e(AbstractC7363pT1.a(11, 1, dVar));
            Ei3 ei3 = this.c;
            if (ei3.b != null) {
                ei3.b.onPurchasesUpdated(dVar, null);
                return;
            }
            return;
        }
        com.android.billingclient.api.d dVarD = JC1.d(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        int i = true == Objects.equals(extras.getString("INTENT_SOURCE"), "LAUNCH_BILLING_FLOW") ? 2 : 1;
        if (action.equals("com.android.vending.billing.PURCHASES_UPDATED") || action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
            List listH = JC1.h(extras);
            if (dVarD.b() == 0) {
                this.c.c.a(AbstractC7363pT1.c(i));
            } else {
                d(extras, dVarD, i);
            }
            this.c.b.onPurchasesUpdated(dVarD, listH);
            return;
        }
        if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
            if (dVarD.b() != 0) {
                d(extras, dVarD, i);
                this.c.b.onPurchasesUpdated(dVarD, AbstractC9714xr1.H());
                return;
            }
            Ei3 ei32 = this.c;
            Ei3.a(ei32);
            Ei3.e(ei32);
            JC1.j("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
            VT1 vt12 = this.c.c;
            com.android.billingclient.api.d dVar2 = com.android.billingclient.api.i.j;
            vt12.e(AbstractC7363pT1.a(77, i, dVar2));
            this.c.b.onPurchasesUpdated(dVar2, AbstractC9714xr1.H());
        }
    }
}
