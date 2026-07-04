package com.daaw;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: renamed from: com.daaw.ml1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6609ml1 extends BroadcastReceiver {
    public Context a;
    public final AbstractC6330ll1 b;

    public C6609ml1(AbstractC6330ll1 abstractC6330ll1) {
        this.b = abstractC6330ll1;
    }

    public final void a(Context context) {
        this.a = context;
    }

    public final synchronized void b() {
        try {
            Context context = this.a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.b.a();
            b();
        }
    }
}
