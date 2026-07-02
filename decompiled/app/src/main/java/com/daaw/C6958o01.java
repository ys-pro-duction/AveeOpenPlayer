package com.daaw;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: com.daaw.o01, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6958o01 implements CU {
    public final Handler a;

    public C6958o01(Handler handler) {
        this.a = handler;
    }

    @Override // com.daaw.CU
    public Message a(int i, int i2, int i3) {
        return this.a.obtainMessage(i, i2, i3);
    }

    @Override // com.daaw.CU
    public boolean b(int i) {
        return this.a.sendEmptyMessage(i);
    }

    @Override // com.daaw.CU
    public Message c(int i, int i2, int i3, Object obj) {
        return this.a.obtainMessage(i, i2, i3, obj);
    }

    @Override // com.daaw.CU
    public boolean d(int i, long j) {
        return this.a.sendEmptyMessageAtTime(i, j);
    }

    @Override // com.daaw.CU
    public void e(int i) {
        this.a.removeMessages(i);
    }

    @Override // com.daaw.CU
    public Message f(int i, Object obj) {
        return this.a.obtainMessage(i, obj);
    }

    @Override // com.daaw.CU
    public Looper g() {
        return this.a.getLooper();
    }
}
