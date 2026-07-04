package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: com.daaw.qx1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7782qx1 {
    public static final String[] d = {"/aclk", "/pcs/click", "/dbm/clk"};
    public final String a = "ad.doubleclick.net";
    public final String[] b = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
    public final InterfaceC6666mx1 c;

    public C7782qx1(InterfaceC6666mx1 interfaceC6666mx1) {
        this.c = interfaceC6666mx1;
    }

    public final Uri a(Uri uri, Context context, View view, Activity activity) throws C8060rx1 {
        try {
            return g(uri, this.c.zzf(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new C8060rx1("Provided Uri is not in a valid state");
        }
    }

    public final Uri b(Uri uri, Context context) {
        return g(uri, this.c.zzg(context));
    }

    public final InterfaceC6666mx1 c() {
        return this.c;
    }

    public final void d(MotionEvent motionEvent) {
        this.c.zzk(motionEvent);
    }

    public final boolean e(Uri uri) {
        if (f(uri)) {
            String[] strArr = d;
            for (int i = 0; i < 3; i++) {
                if (uri.getPath().endsWith(strArr[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean f(Uri uri) {
        uri.getClass();
        try {
            String host = uri.getHost();
            String[] strArr = this.b;
            for (int i = 0; i < 3; i++) {
                if (host.endsWith(strArr[i])) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }

    public final Uri g(Uri uri, String str) throws C8060rx1 {
        try {
            if (uri == null) {
                throw null;
            }
            try {
                if (uri.getHost().equals(this.a)) {
                    if (uri.getPath().contains(";")) {
                        if (uri.toString().contains("dc_ms=")) {
                            throw new C8060rx1("Parameter already exists: dc_ms");
                        }
                        String string = uri.toString();
                        int iIndexOf = string.indexOf(";adurl");
                        if (iIndexOf != -1) {
                            int i = iIndexOf + 1;
                            return Uri.parse(string.substring(0, i) + "dc_ms=" + str + ";" + string.substring(i));
                        }
                        String encodedPath = uri.getEncodedPath();
                        int iIndexOf2 = string.indexOf(encodedPath);
                        return Uri.parse(string.substring(0, encodedPath.length() + iIndexOf2) + ";dc_ms=" + str + ";" + string.substring(iIndexOf2 + encodedPath.length()));
                    }
                }
            } catch (NullPointerException unused) {
            }
            if (uri.getQueryParameter("ms") != null) {
                throw new C8060rx1("Query parameter already exists: ms");
            }
            String string2 = uri.toString();
            int iIndexOf3 = string2.indexOf("&adurl");
            if (iIndexOf3 == -1) {
                iIndexOf3 = string2.indexOf("?adurl");
            }
            if (iIndexOf3 == -1) {
                return uri.buildUpon().appendQueryParameter("ms", str).build();
            }
            int i2 = iIndexOf3 + 1;
            return Uri.parse(string2.substring(0, i2) + "ms=" + str + "&" + string2.substring(i2));
        } catch (UnsupportedOperationException unused2) {
            throw new C8060rx1("Provided Uri is not in a valid state");
        }
    }
}
