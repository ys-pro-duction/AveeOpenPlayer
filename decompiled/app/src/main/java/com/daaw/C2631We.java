package com.daaw;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;

/* JADX INFO: renamed from: com.daaw.We, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2631We extends AbstractC2013Qg {
    public static final String i = AbstractC1772Od0.f("BatteryChrgTracker");

    public C2631We(Context context, InterfaceC8357t11 interfaceC8357t11) {
        super(context, interfaceC8357t11);
    }

    @Override // com.daaw.AbstractC2013Qg
    public IntentFilter g() {
        IntentFilter intentFilter = new IntentFilter();
        if (Build.VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.CHARGING");
            intentFilter.addAction("android.os.action.DISCHARGING");
            return intentFilter;
        }
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        return intentFilter;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    @Override // com.daaw.AbstractC2013Qg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(android.content.Context r6, android.content.Intent r7) {
        /*
            r5 = this;
            r6 = 1
            r0 = 0
            java.lang.String r7 = r7.getAction()
            if (r7 != 0) goto L9
            goto L54
        L9:
            com.daaw.Od0 r1 = com.daaw.AbstractC1772Od0.c()
            java.lang.String r2 = com.daaw.C2631We.i
            java.lang.String r3 = "Received %s"
            java.lang.Object[] r4 = new java.lang.Object[r6]
            r4[r0] = r7
            java.lang.String r3 = java.lang.String.format(r3, r4)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r0]
            r1.a(r2, r3, r4)
            r1 = -1
            int r2 = r7.hashCode()
            switch(r2) {
                case -1886648615: goto L47;
                case -54942926: goto L3e;
                case 948344062: goto L33;
                case 1019184907: goto L28;
                default: goto L26;
            }
        L26:
            r6 = -1
            goto L51
        L28:
            java.lang.String r6 = "android.intent.action.ACTION_POWER_CONNECTED"
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto L31
            goto L26
        L31:
            r6 = 3
            goto L51
        L33:
            java.lang.String r6 = "android.os.action.CHARGING"
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto L3c
            goto L26
        L3c:
            r6 = 2
            goto L51
        L3e:
            java.lang.String r0 = "android.os.action.DISCHARGING"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L51
            goto L26
        L47:
            java.lang.String r6 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto L50
            goto L26
        L50:
            r6 = 0
        L51:
            switch(r6) {
                case 0: goto L67;
                case 1: goto L61;
                case 2: goto L5b;
                case 3: goto L55;
                default: goto L54;
            }
        L54:
            return
        L55:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.d(r6)
            return
        L5b:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.d(r6)
            return
        L61:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.d(r6)
            return
        L67:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.d(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C2631We.h(android.content.Context, android.content.Intent):void");
    }

    @Override // com.daaw.AbstractC5232hr
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Boolean b() {
        Intent intentRegisterReceiver = this.b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return Boolean.valueOf(j(intentRegisterReceiver));
        }
        AbstractC1772Od0.c().b(i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }

    public final boolean j(Intent intent) {
        if (Build.VERSION.SDK_INT < 23) {
            return intent.getIntExtra("plugged", 0) != 0;
        }
        int intExtra = intent.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }
}
