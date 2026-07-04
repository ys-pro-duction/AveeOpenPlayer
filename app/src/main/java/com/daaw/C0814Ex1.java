package com.daaw;

import android.app.Application;
import android.content.SharedPreferences;
import com.daaw.InterfaceC2367Tq;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.Ex1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0814Ex1 {
    public static final AbstractC1247Jb2 d = AbstractC1247Jb2.G("IABTCF_TCString", "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String");
    public final Application a;
    public final SharedPreferences b;
    public final Set c;

    public C0814Ex1(Application application) {
        this.a = application;
        SharedPreferences sharedPreferences = application.getSharedPreferences("__GOOGLE_FUNDING_CHOICE_SDK_INTERNAL__", 0);
        this.b = sharedPreferences;
        this.c = new HashSet(sharedPreferences.getStringSet("written_values", Collections.EMPTY_SET));
    }

    public final int a() {
        return this.b.getInt("consent_status", 0);
    }

    public final Map b() {
        String string;
        Application application = this.a;
        Set<String> stringSet = this.b.getStringSet("stored_info", AbstractC1247Jb2.F());
        if (stringSet.isEmpty()) {
            stringSet = d;
        }
        HashMap map = new HashMap();
        for (String str : stringSet) {
            C6685n12 c6685n12A = AbstractC9207w22.a(application, str);
            if (c6685n12A == null) {
                "Fetching request info: failed for key: ".concat(String.valueOf(str));
            } else {
                Object obj = application.getSharedPreferences(c6685n12A.a, 0).getAll().get(c6685n12A.b);
                if (obj == null) {
                    "Stored info not exists: ".concat(String.valueOf(str));
                } else {
                    if (obj instanceof Boolean) {
                        string = true != ((Boolean) obj).booleanValue() ? "0" : "1";
                    } else if (obj instanceof Number) {
                        string = obj.toString();
                    } else if (obj instanceof String) {
                        string = (String) obj;
                    } else {
                        "Failed to fetch stored info: ".concat(String.valueOf(str));
                    }
                    map.put(str, string);
                }
            }
        }
        return map;
    }

    public final Set c() {
        return this.c;
    }

    public final void d() {
        this.b.edit().putStringSet("written_values", this.c).apply();
    }

    public final void e(int i) {
        this.b.edit().putInt("consent_status", i).apply();
    }

    public final void f(InterfaceC2367Tq.c cVar) {
        this.b.edit().putString("privacy_options_requirement_status", cVar.name()).apply();
    }

    public final void g(Set set) {
        this.b.edit().putStringSet("stored_info", set).apply();
    }
}
