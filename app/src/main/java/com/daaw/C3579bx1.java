package com.daaw;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.bx1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3579bx1 extends QueryInfoGenerationCallback {
    public final /* synthetic */ String a;
    public final /* synthetic */ W01 b;

    public C3579bx1(W01 w01, String str) {
        this.b = w01;
        this.a = str;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        AbstractC4274eT1.zzj("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
        this.b.b.evaluateJavascript(String.format("window.postMessage({'paw_id': '%1$s', 'error': '%2$s'}, '*');", this.a, str), null);
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        String str;
        String query = queryInfo.getQuery();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", this.a);
            jSONObject.put("signal", query);
            str = String.format("window.postMessage(%1$s, '*');", jSONObject);
        } catch (JSONException unused) {
            str = String.format("window.postMessage({'paw_id': '%1$s', 'signal': '%2$s'}, '*');", this.a, queryInfo.getQuery());
        }
        this.b.b.evaluateJavascript(str, null);
    }
}
