package com.daaw;

import android.os.AsyncTask;

/* JADX INFO: loaded from: classes3.dex */
public abstract class GK2 extends AsyncTask {
    public HK2 a;
    public final C9008vK2 b;

    public GK2(C9008vK2 c9008vK2) {
        this.b = c9008vK2;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        HK2 hk2 = this.a;
        if (hk2 != null) {
            hk2.a(this);
        }
    }

    public final void b(HK2 hk2) {
        this.a = hk2;
    }
}
