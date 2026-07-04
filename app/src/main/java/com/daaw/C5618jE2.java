package com.daaw;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: renamed from: com.daaw.jE2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5618jE2 extends BroadcastReceiver {
    public final C8812uf3 a;
    public boolean b;
    public boolean c;

    public C5618jE2(C8812uf3 c8812uf3) {
        AbstractC7506py0.l(c8812uf3);
        this.a = c8812uf3;
    }

    public final void b() {
        this.a.c();
        this.a.x().d();
        if (this.b) {
            return;
        }
        this.a.v().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.c = this.a.X().i();
        this.a.w().s().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.c));
        this.b = true;
    }

    public final void c() {
        this.a.c();
        this.a.x().d();
        this.a.x().d();
        if (this.b) {
            this.a.w().s().a("Unregistering connectivity change receiver");
            this.b = false;
            this.c = false;
            try {
                this.a.v().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.a.w().n().b("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.c();
        String action = intent.getAction();
        this.a.w().s().b("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            this.a.w().t().b("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean zI = this.a.X().i();
        if (this.c != zI) {
            this.c = zI;
            this.a.x().z(new FD2(this, zI));
        }
    }
}
