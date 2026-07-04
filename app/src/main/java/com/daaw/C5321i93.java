package com.daaw;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: renamed from: com.daaw.i93, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5321i93 extends ContentObserver {
    public C5321i93(C6447m93 c6447m93, Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        AbstractC6556ma3.c();
    }
}
