package com.daaw;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: loaded from: classes3.dex */
public final class L63 extends ContentObserver {
    public L63(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        AbstractC8954v73.e.set(true);
    }
}
