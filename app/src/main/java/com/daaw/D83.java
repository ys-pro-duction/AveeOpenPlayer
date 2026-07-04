package com.daaw;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: loaded from: classes3.dex */
public final class D83 extends ContentObserver {
    public final /* synthetic */ H83 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D83(H83 h83, Handler handler) {
        super(null);
        this.a = h83;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.e();
    }
}
