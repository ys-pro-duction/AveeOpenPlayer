package com.daaw;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: renamed from: com.daaw.Ye, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2839Ye extends AbstractC2013Qg {
    public static final String i = AbstractC1772Od0.f("BatteryNotLowTracker");

    public C2839Ye(Context context, InterfaceC8357t11 interfaceC8357t11) {
        super(context, interfaceC8357t11);
    }

    @Override // com.daaw.AbstractC2013Qg
    public IntentFilter g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // com.daaw.AbstractC2013Qg
    public void h(Context context, Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        AbstractC1772Od0.c().a(i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            d(Boolean.TRUE);
        } else if (action.equals("android.intent.action.BATTERY_LOW")) {
            d(Boolean.FALSE);
        }
    }

    @Override // com.daaw.AbstractC5232hr
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Boolean b() {
        Intent intentRegisterReceiver = this.b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return Boolean.valueOf(intentRegisterReceiver.getIntExtra("status", -1) == 1 || ((float) intentRegisterReceiver.getIntExtra("level", -1)) / ((float) intentRegisterReceiver.getIntExtra("scale", -1)) > 0.15f);
        }
        AbstractC1772Od0.c().b(i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }
}
