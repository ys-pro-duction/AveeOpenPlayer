package com.daaw;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes.dex */
public class CX0 extends AbstractC2013Qg {
    public static final String i = AbstractC1772Od0.f("StorageNotLowTracker");

    public CX0(Context context, InterfaceC8357t11 interfaceC8357t11) {
        super(context, interfaceC8357t11);
    }

    @Override // com.daaw.AbstractC2013Qg
    public IntentFilter g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
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
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            d(Boolean.FALSE);
        } else if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            d(Boolean.TRUE);
        }
    }

    @Override // com.daaw.AbstractC5232hr
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Boolean b() {
        Intent intentRegisterReceiver = this.b.registerReceiver(null, g());
        if (intentRegisterReceiver == null || intentRegisterReceiver.getAction() == null) {
            return Boolean.TRUE;
        }
        String action = intentRegisterReceiver.getAction();
        action.getClass();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            return Boolean.FALSE;
        }
        if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return Boolean.TRUE;
        }
        return null;
    }
}
