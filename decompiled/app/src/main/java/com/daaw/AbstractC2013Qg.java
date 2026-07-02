package com.daaw;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: renamed from: com.daaw.Qg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2013Qg extends AbstractC5232hr {
    public static final String h = AbstractC1772Od0.f("BrdcstRcvrCnstrntTrckr");
    public final BroadcastReceiver g;

    /* JADX INFO: renamed from: com.daaw.Qg$a */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                AbstractC2013Qg.this.h(context, intent);
            }
        }
    }

    public AbstractC2013Qg(Context context, InterfaceC8357t11 interfaceC8357t11) {
        super(context, interfaceC8357t11);
        this.g = new a();
    }

    @Override // com.daaw.AbstractC5232hr
    public void e() {
        AbstractC1772Od0.c().a(h, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.b.registerReceiver(this.g, g());
    }

    @Override // com.daaw.AbstractC5232hr
    public void f() {
        AbstractC1772Od0.c().a(h, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.b.unregisterReceiver(this.g);
    }

    public abstract IntentFilter g();

    public abstract void h(Context context, Intent intent);
}
