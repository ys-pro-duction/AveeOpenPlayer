package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class SX implements InterfaceC6678n00 {
    public static final Pattern g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");
    public final C7515q00 a;
    public final Context b;
    public final String c;
    public final RL d;
    public final C1739Nv e;
    public String f;

    public SX(Context context, String str, RL rl, C1739Nv c1739Nv) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.b = context;
        this.c = str;
        this.d = rl;
        this.e = c1739Nv;
        this.a = new C7515q00();
    }

    public static String c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        return g.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    public static boolean k(String str) {
        return str != null && str.startsWith("SYN_");
    }

    @Override // com.daaw.InterfaceC6678n00
    public synchronized String a() {
        try {
            String str = this.f;
            if (str != null) {
                return str;
            }
            C2106Rd0.f().i("Determining Crashlytics installation ID...");
            SharedPreferences sharedPreferencesS = AbstractC0555Cn.s(this.b);
            String string = sharedPreferencesS.getString("firebase.installation.id", null);
            C2106Rd0.f().i("Cached Firebase Installation ID: " + string);
            if (this.e.d()) {
                String strD = d();
                C2106Rd0.f().i("Fetched Firebase Installation ID: " + strD);
                if (strD == null) {
                    strD = string == null ? c() : string;
                }
                if (strD.equals(string)) {
                    this.f = l(sharedPreferencesS);
                } else {
                    this.f = b(strD, sharedPreferencesS);
                }
            } else if (k(string)) {
                this.f = l(sharedPreferencesS);
            } else {
                this.f = b(c(), sharedPreferencesS);
            }
            if (this.f == null) {
                C2106Rd0.f().k("Unable to determine Crashlytics Install Id, creating a new one.");
                this.f = b(c(), sharedPreferencesS);
            }
            C2106Rd0.f().i("Crashlytics installation ID: " + this.f);
            return this.f;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized String b(String str, SharedPreferences sharedPreferences) {
        String strE;
        strE = e(UUID.randomUUID().toString());
        C2106Rd0.f().i("Created new Crashlytics installation ID: " + strE + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", strE).putString("firebase.installation.id", str).apply();
        return strE;
    }

    public final String d() {
        try {
            return (String) AbstractC0622Db1.f(this.d.getId());
        } catch (Exception e) {
            C2106Rd0.f().l("Failed to retrieve Firebase Installations ID.", e);
            return null;
        }
    }

    public String f() {
        return this.c;
    }

    public String g() {
        return this.a.a(this.b);
    }

    public String h() {
        return String.format(Locale.US, "%s/%s", m(Build.MANUFACTURER), m(Build.MODEL));
    }

    public String i() {
        return m(Build.VERSION.INCREMENTAL);
    }

    public String j() {
        return m(Build.VERSION.RELEASE);
    }

    public final String l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    public final String m(String str) {
        return str.replaceAll(h, "");
    }
}
