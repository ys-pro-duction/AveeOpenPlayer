package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class S12 {
    public final Context a;
    public final Map b = new HashMap();

    public S12(Context context) {
        this.a = context;
    }

    public final void b() {
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            ((SharedPreferences.Editor) it.next()).apply();
        }
    }

    public final boolean c(String str, Object obj) {
        C6685n12 c6685n12A = AbstractC9207w22.a(this.a, str);
        if (c6685n12A == null) {
            return false;
        }
        SharedPreferences.Editor editorD = d(c6685n12A.a);
        if (obj instanceof Integer) {
            editorD.putInt(c6685n12A.b, ((Integer) obj).intValue());
            return true;
        }
        if (obj instanceof Long) {
            editorD.putLong(c6685n12A.b, ((Long) obj).longValue());
            return true;
        }
        if (obj instanceof Double) {
            editorD.putFloat(c6685n12A.b, ((Double) obj).floatValue());
            return true;
        }
        if (obj instanceof Float) {
            editorD.putFloat(c6685n12A.b, ((Float) obj).floatValue());
            return true;
        }
        if (obj instanceof Boolean) {
            editorD.putBoolean(c6685n12A.b, ((Boolean) obj).booleanValue());
            return true;
        }
        if (!(obj instanceof String)) {
            return false;
        }
        editorD.putString(c6685n12A.b, (String) obj);
        return true;
    }

    public final SharedPreferences.Editor d(String str) {
        if (!this.b.containsKey(str)) {
            this.b.put(str, this.a.getSharedPreferences(str, 0).edit());
        }
        return (SharedPreferences.Editor) this.b.get(str);
    }
}
