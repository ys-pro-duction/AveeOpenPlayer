package com.daaw;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zzbw;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class KH1 implements HI1 {
    public final LH1 a;

    public KH1(LH1 lh1) {
        this.a = lh1;
    }

    @Override // com.daaw.HI1
    public final void a(Object obj, Map map) {
        if (this.a == null) {
            return;
        }
        String str = (String) map.get("name");
        if (str == null) {
            AbstractC4274eT1.zzi("Ad metadata with no name parameter.");
            str = "";
        }
        Bundle bundleZza = null;
        if (map.containsKey("info")) {
            try {
                bundleZza = zzbw.zza(new JSONObject((String) map.get("info")));
            } catch (JSONException e) {
                AbstractC4274eT1.zzh("Failed to convert ad metadata to JSON.", e);
            }
        }
        if (bundleZza == null) {
            AbstractC4274eT1.zzg("Failed to convert ad metadata to Bundle.");
        } else {
            this.a.t(str, bundleZza);
        }
    }
}
