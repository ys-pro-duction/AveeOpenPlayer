package com.daaw;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: renamed from: com.daaw.nl1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6888nl1 {
    public static final BS0 a = new BS0();
    public static Locale b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return C6878nj1.a(context).d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i) {
        Resources resources = context.getResources();
        return i != 1 ? i != 2 ? i != 3 ? resources.getString(R.string.ok) : resources.getString(LD0.a) : resources.getString(LD0.j) : resources.getString(LD0.d);
    }

    public static String c(Context context, int i) {
        Resources resources = context.getResources();
        String strA = a(context);
        if (i == 1) {
            return resources.getString(LD0.e, strA);
        }
        if (i == 2) {
            return HB.g(context) ? resources.getString(LD0.n) : resources.getString(LD0.k, strA);
        }
        if (i == 3) {
            return resources.getString(LD0.b, strA);
        }
        if (i == 5) {
            return g(context, "common_google_play_services_invalid_account_text", strA);
        }
        if (i == 7) {
            return g(context, "common_google_play_services_network_error_text", strA);
        }
        if (i == 9) {
            return resources.getString(LD0.i, strA);
        }
        if (i == 20) {
            return g(context, "common_google_play_services_restricted_profile_text", strA);
        }
        switch (i) {
            case 16:
                return g(context, "common_google_play_services_api_unavailable_text", strA);
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return g(context, "common_google_play_services_sign_in_failed_text", strA);
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return resources.getString(LD0.m, strA);
            default:
                return resources.getString(MD0.a, strA);
        }
    }

    public static String d(Context context, int i) {
        return (i == 6 || i == 19) ? g(context, "common_google_play_services_resolution_required_text", a(context)) : c(context, i);
    }

    public static String e(Context context, int i) {
        String strH = i == 6 ? h(context, "common_google_play_services_resolution_required_title") : f(context, i);
        return strH == null ? context.getResources().getString(LD0.h) : strH;
    }

    public static String f(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(LD0.f);
            case 2:
                return resources.getString(LD0.l);
            case 3:
                return resources.getString(LD0.c);
            case 4:
            case 6:
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return null;
            case 5:
                return h(context, "common_google_play_services_invalid_account_title");
            case 7:
                return h(context, "common_google_play_services_network_error_title");
            case 8:
            case 9:
            case 10:
            case 11:
            case 16:
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                return null;
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return h(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                return h(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String g(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strH = h(context, str);
        if (strH == null) {
            strH = resources.getString(MD0.a);
        }
        return String.format(resources.getConfiguration().locale, strH, str2);
    }

    public static String h(Context context, String str) {
        BS0 bs0 = a;
        synchronized (bs0) {
            try {
                Locale localeD = AbstractC9707xq.a(context.getResources().getConfiguration()).d(0);
                if (!localeD.equals(b)) {
                    bs0.clear();
                    b = localeD;
                }
                String str2 = (String) bs0.get(str);
                if (str2 != null) {
                    return str2;
                }
                Resources resourcesE = DT.e(context);
                if (resourcesE == null) {
                    return null;
                }
                int identifier = resourcesE.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    return null;
                }
                String string = resourcesE.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    return null;
                }
                bs0.put(str, string);
                return string;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
