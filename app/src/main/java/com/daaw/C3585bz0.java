package com.daaw;

import android.content.SharedPreferences;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;

/* JADX INFO: renamed from: com.daaw.bz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3585bz0 {
    public final InterfaceC7550q70 a;
    public final String b;
    public final Object c;
    public final SharedPreferences d;

    public C3585bz0(InterfaceC7550q70 interfaceC7550q70, String str, Object obj, SharedPreferences sharedPreferences) {
        G10.g(interfaceC7550q70, "type");
        G10.g(str, SubscriberAttributeKt.JSON_NAME_KEY);
        G10.g(sharedPreferences, "prefs");
        this.a = interfaceC7550q70;
        this.b = str;
        this.c = obj;
        this.d = sharedPreferences;
    }

    public final Object a() {
        if (!this.d.contains(this.b)) {
            return this.c;
        }
        InterfaceC5580j60 interfaceC5580j60J = this.a.j();
        J50 j50 = interfaceC5580j60J instanceof J50 ? (J50) interfaceC5580j60J : null;
        if (G10.c(j50, AbstractC5624jG0.b(Long.TYPE))) {
            SharedPreferences sharedPreferences = this.d;
            String str = this.b;
            Object obj = this.c;
            Long l = obj instanceof Long ? (Long) obj : null;
            return Long.valueOf(sharedPreferences.getLong(str, l != null ? l.longValue() : -1L));
        }
        if (G10.c(j50, AbstractC5624jG0.b(String.class))) {
            SharedPreferences sharedPreferences2 = this.d;
            String str2 = this.b;
            Object obj2 = this.c;
            return sharedPreferences2.getString(str2, obj2 instanceof String ? (String) obj2 : null);
        }
        if (G10.c(j50, AbstractC5624jG0.b(Integer.TYPE))) {
            SharedPreferences sharedPreferences3 = this.d;
            String str3 = this.b;
            Object obj3 = this.c;
            Integer num = obj3 instanceof Integer ? (Integer) obj3 : null;
            return Integer.valueOf(sharedPreferences3.getInt(str3, num != null ? num.intValue() : -1));
        }
        if (G10.c(j50, AbstractC5624jG0.b(Boolean.TYPE))) {
            SharedPreferences sharedPreferences4 = this.d;
            String str4 = this.b;
            Object obj4 = this.c;
            Boolean bool = obj4 instanceof Boolean ? (Boolean) obj4 : null;
            return Boolean.valueOf(sharedPreferences4.getBoolean(str4, bool != null ? bool.booleanValue() : false));
        }
        if (!G10.c(j50, AbstractC5624jG0.b(Float.TYPE))) {
            return this.c;
        }
        SharedPreferences sharedPreferences5 = this.d;
        String str5 = this.b;
        Object obj5 = this.c;
        Float f = obj5 instanceof Float ? (Float) obj5 : null;
        return Float.valueOf(sharedPreferences5.getFloat(str5, f != null ? f.floatValue() : -1.0f));
    }

    public final void b(Object obj) {
        SharedPreferences.Editor editorEdit = this.d.edit();
        if (obj == null) {
            editorEdit.remove(this.b);
        } else if (obj instanceof Long) {
            editorEdit.putLong(this.b, ((Number) obj).longValue());
        } else if (obj instanceof String) {
            editorEdit.putString(this.b, (String) obj);
        } else if (obj instanceof Integer) {
            editorEdit.putInt(this.b, ((Number) obj).intValue());
        } else if (obj instanceof Boolean) {
            editorEdit.putBoolean(this.b, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            editorEdit.putFloat(this.b, ((Number) obj).floatValue());
        }
        editorEdit.apply();
    }
}
