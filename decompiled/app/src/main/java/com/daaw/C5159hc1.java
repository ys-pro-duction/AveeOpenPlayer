package com.daaw;

import android.os.AsyncTask;
import com.daaw.AsyncTaskC2517Vb1;

/* JADX INFO: renamed from: com.daaw.hc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5159hc1 implements HX {
    public Object a;

    public C5159hc1(Object obj) {
        this.a = obj;
    }

    @Override // com.daaw.HX
    public void a(AsyncTaskC2517Vb1.b bVar) {
        bVar.a(this.a, false);
    }

    @Override // com.daaw.HX
    public boolean cancel(boolean z) {
        return false;
    }

    @Override // com.daaw.HX
    public AsyncTask.Status getStatus() {
        return null;
    }
}
