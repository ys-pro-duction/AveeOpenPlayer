package com.daaw;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.zzt;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.qI1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7598qI1 implements HI1 {
    @Override // com.daaw.HI1
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        InterfaceC9334wW1 interfaceC9334wW1 = (InterfaceC9334wW1) obj;
        try {
            JSONObject jSONObject = new JSONObject((String) map.get("args"));
            Iterator<String> itKeys = jSONObject.keys();
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(interfaceC9334wW1.getContext()).edit();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj2 = jSONObject.get(next);
                if (obj2 instanceof Integer) {
                    editorEdit.putInt(next, ((Integer) obj2).intValue());
                } else if (obj2 instanceof Long) {
                    editorEdit.putLong(next, ((Long) obj2).longValue());
                } else if (obj2 instanceof Double) {
                    editorEdit.putFloat(next, ((Double) obj2).floatValue());
                } else if (obj2 instanceof Float) {
                    editorEdit.putFloat(next, ((Float) obj2).floatValue());
                } else if (obj2 instanceof Boolean) {
                    editorEdit.putBoolean(next, ((Boolean) obj2).booleanValue());
                } else if (obj2 instanceof String) {
                    editorEdit.putString(next, (String) obj2);
                }
            }
            editorEdit.apply();
        } catch (JSONException e) {
            zzt.zzo().u(e, "GMSG write local storage KV pairs handler");
        }
    }
}
