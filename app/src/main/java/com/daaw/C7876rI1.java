package com.daaw;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: com.daaw.rI1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7876rI1 implements HI1 {
    @Override // com.daaw.HI1
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        InterfaceC9334wW1 interfaceC9334wW1 = (InterfaceC9334wW1) obj;
        try {
            JSONArray jSONArray = new JSONArray((String) map.get("args"));
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(interfaceC9334wW1.getContext()).edit();
            for (int i = 0; i < jSONArray.length(); i++) {
                editorEdit.remove(jSONArray.getString(i));
            }
            editorEdit.apply();
        } catch (JSONException e) {
            zzt.zzo().u(e, "GMSG clear local storage keys handler");
        }
    }
}
