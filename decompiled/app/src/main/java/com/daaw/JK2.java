package com.daaw;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class JK2 extends FK2 {
    public JK2(C9008vK2 c9008vK2, HashSet hashSet, JSONObject jSONObject, long j) {
        super(c9008vK2, hashSet, jSONObject, j);
    }

    @Override // com.daaw.GK2
    /* JADX INFO: renamed from: a */
    public final void onPostExecute(String str) {
        c(str);
        super.onPostExecute(str);
    }

    public final void c(String str) {
        PJ2 pj2A = PJ2.a();
        if (pj2A != null) {
            for (CJ2 cj2 : pj2A.c()) {
                if (this.c.contains(cj2.h())) {
                    cj2.g().d(str, this.e);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.d.toString();
    }

    @Override // com.daaw.GK2, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        c(str);
        super.onPostExecute(str);
    }
}
