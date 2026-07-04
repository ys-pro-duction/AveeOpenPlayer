package com.daaw;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class QR1 {
    public static Uri a(String str, String str2, String str3) {
        int iIndexOf = str.indexOf("&adurl");
        if (iIndexOf == -1) {
            iIndexOf = str.indexOf("?adurl");
        }
        if (iIndexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i = iIndexOf + 1;
        return Uri.parse(str.substring(0, i) + str2 + "=" + str3 + "&" + str.substring(i));
    }

    public static String b(Uri uri, Context context) {
        if (!zzt.zzn().z(context)) {
            return uri.toString();
        }
        String strF = zzt.zzn().f(context);
        if (strF == null) {
            return uri.toString();
        }
        String str = (String) zzba.zzc().b(AbstractC9820yE1.e0);
        String string = uri.toString();
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.d0)).booleanValue() && string.contains(str)) {
            zzt.zzn().r(context, strF);
            return d(string, context).replace(str, strF);
        }
        if (!TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            return string;
        }
        String string2 = a(d(string, context), "fbs_aeid", strF).toString();
        zzt.zzn().r(context, strF);
        return string2;
    }

    public static String c(String str, Context context, boolean z) {
        String strF;
        if ((((Boolean) zzba.zzc().b(AbstractC9820yE1.l0)).booleanValue() && !z) || !zzt.zzn().z(context) || TextUtils.isEmpty(str) || (strF = zzt.zzn().f(context)) == null) {
            return str;
        }
        String str2 = (String) zzba.zzc().b(AbstractC9820yE1.e0);
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.d0)).booleanValue() && str.contains(str2)) {
            if (zzt.zzp().zzi(str)) {
                zzt.zzn().r(context, strF);
                return d(str, context).replace(str2, strF);
            }
            if (!zzt.zzp().zzj(str)) {
                return str;
            }
            zzt.zzn().s(context, strF);
            return d(str, context).replace(str2, strF);
        }
        if (str.contains("fbs_aeid")) {
            return str;
        }
        if (zzt.zzp().zzi(str)) {
            zzt.zzn().r(context, strF);
            return a(d(str, context), "fbs_aeid", strF).toString();
        }
        if (!zzt.zzp().zzj(str)) {
            return str;
        }
        zzt.zzn().s(context, strF);
        return a(d(str, context), "fbs_aeid", strF).toString();
    }

    public static String d(String str, Context context) {
        String strJ = zzt.zzn().j(context);
        String strH = zzt.zzn().h(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(strJ)) {
            str = a(str, "gmp_app_id", strJ).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(strH)) ? str : a(str, "fbs_aiid", strH).toString();
    }
}
