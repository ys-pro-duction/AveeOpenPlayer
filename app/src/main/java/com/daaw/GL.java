package com.daaw;

import android.content.SharedPreferences;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;

/* JADX INFO: loaded from: classes.dex */
public final class GL {
    public static final int d = 8;
    public final String a;
    public final Object b;
    public final SharedPreferences c;

    public GL(String str, Object obj, SharedPreferences sharedPreferences) {
        G10.g(str, SubscriberAttributeKt.JSON_NAME_KEY);
        G10.g(sharedPreferences, "prefs");
        this.a = str;
        this.b = obj;
        this.c = sharedPreferences;
    }

    public final String a() {
        return this.a;
    }

    public final Object b() {
        if (!this.c.contains(this.a)) {
            return this.b;
        }
        Object obj = this.b;
        return obj instanceof Boolean ? Boolean.valueOf(this.c.getBoolean(this.a, ((Boolean) obj).booleanValue())) : obj instanceof String ? this.c.getString(this.a, (String) obj) : obj instanceof Long ? Long.valueOf(this.c.getLong(this.a, ((Number) obj).longValue())) : obj instanceof Double ? Float.valueOf(this.c.getFloat(this.a, (float) ((Number) obj).doubleValue())) : obj instanceof Integer ? Integer.valueOf(this.c.getInt(this.a, ((Number) obj).intValue())) : obj;
    }

    public final void c(C3130aM c3130aM) {
        G10.g(c3130aM, "remoteConfig");
        InterfaceC5370iM interfaceC5370iML = c3130aM.l(this.a);
        G10.f(interfaceC5370iML, "getValue(...)");
        Object objValueOf = this.b;
        if (objValueOf instanceof Boolean) {
            objValueOf = Boolean.valueOf(interfaceC5370iML.d());
        } else if (objValueOf instanceof String) {
            objValueOf = interfaceC5370iML.c();
        } else if (objValueOf instanceof Long) {
            objValueOf = Long.valueOf(interfaceC5370iML.a());
        } else if (objValueOf instanceof Double) {
            objValueOf = Double.valueOf(interfaceC5370iML.b());
        } else if (objValueOf instanceof Integer) {
            objValueOf = Integer.valueOf((int) interfaceC5370iML.a());
        }
        SharedPreferences.Editor editorEdit = this.c.edit();
        if (objValueOf instanceof Boolean) {
            editorEdit.putBoolean(this.a, ((Boolean) objValueOf).booleanValue());
        } else if (objValueOf instanceof String) {
            editorEdit.putString(this.a, (String) objValueOf);
        } else if (objValueOf instanceof Long) {
            editorEdit.putLong(this.a, ((Number) objValueOf).longValue());
        } else if (objValueOf instanceof Double) {
            editorEdit.putFloat(this.a, (float) ((Number) objValueOf).doubleValue());
        } else if (objValueOf instanceof Integer) {
            editorEdit.putInt(this.a, ((Number) objValueOf).intValue());
        }
        editorEdit.apply();
    }
}
