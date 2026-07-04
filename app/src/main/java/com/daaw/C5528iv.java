package com.daaw;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.os.IBinder;

/* JADX INFO: renamed from: com.daaw.iv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5528iv {
    public final Object a = new Object();
    public final PW b;
    public final OW c;
    public final ComponentName d;
    public final PendingIntent e;

    public C5528iv(PW pw, OW ow, ComponentName componentName, PendingIntent pendingIntent) {
        this.b = pw;
        this.c = ow;
        this.d = componentName;
        this.e = pendingIntent;
    }

    public IBinder a() {
        return this.c.asBinder();
    }

    public ComponentName b() {
        return this.d;
    }

    public PendingIntent c() {
        return this.e;
    }
}
