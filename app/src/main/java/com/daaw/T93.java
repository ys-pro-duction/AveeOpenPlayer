package com.daaw;

import android.content.Context;
import android.os.Handler;

/* JADX INFO: loaded from: classes3.dex */
public final class T93 {
    public final Context a;
    public final N93 b;

    public T93(Context context, Handler handler, Q93 q93) {
        this.a = context.getApplicationContext();
        this.b = new N93(this, handler, q93);
    }
}
