package com.daaw;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class KK2 extends FK2 {
    public KK2(C9008vK2 c9008vK2, HashSet hashSet, JSONObject jSONObject, long j) {
        super(c9008vK2, hashSet, jSONObject, j);
    }

    @Override // com.daaw.GK2
    /* JADX INFO: renamed from: a */
    public final void onPostExecute(String str) {
        PJ2 pj2A;
        if (!TextUtils.isEmpty(str) && (pj2A = PJ2.a()) != null) {
            for (CJ2 cj2 : pj2A.c()) {
                if (this.c.contains(cj2.h())) {
                    cj2.g().f(str, this.e);
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (AbstractC6491mK2.g(this.d, this.b.a())) {
            return null;
        }
        this.b.e(this.d);
        return this.d.toString();
    }

    @Override // com.daaw.GK2, android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }
}
