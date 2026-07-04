package com.daaw;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.daaw.InterfaceC0992Gq;

/* JADX INFO: renamed from: com.daaw.Xw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2807Xw implements InterfaceC0992Gq {
    public final Context B;
    public final InterfaceC0992Gq.a C;
    public boolean D;
    public boolean E;
    public final BroadcastReceiver F = new a();

    /* JADX INFO: renamed from: com.daaw.Xw$a */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean z = C2807Xw.this.D;
            C2807Xw c2807Xw = C2807Xw.this;
            c2807Xw.D = c2807Xw.n(context);
            if (z != C2807Xw.this.D) {
                C2807Xw.this.C.a(C2807Xw.this.D);
            }
        }
    }

    public C2807Xw(Context context, InterfaceC0992Gq.a aVar) {
        this.B = context.getApplicationContext();
        this.C = aVar;
    }

    @Override // com.daaw.InterfaceC1556Mb0
    public void a() {
        p();
    }

    @Override // com.daaw.InterfaceC1556Mb0
    public void b() {
        o();
    }

    public final boolean n(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final void o() {
        if (this.E) {
            return;
        }
        this.D = n(this.B);
        this.B.registerReceiver(this.F, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.E = true;
    }

    public final void p() {
        if (this.E) {
            this.B.unregisterReceiver(this.F);
            this.E = false;
        }
    }

    @Override // com.daaw.InterfaceC1556Mb0
    public void onDestroy() {
    }
}
