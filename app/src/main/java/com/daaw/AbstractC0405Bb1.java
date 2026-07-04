package com.daaw;

import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.revenuecat.purchases.common.Constants;

/* JADX INFO: renamed from: com.daaw.Bb1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0405Bb1 {
    public static final boolean a;

    static {
        a = Build.VERSION.SDK_INT < 29;
    }

    public static String A(String str, String str2) {
        return (str == null || str.length() < 1) ? str2 : str;
    }

    public static void B(String str, int i, String[] strArr) {
        if (str == null) {
            strArr[0] = "";
            strArr[1] = "";
            return;
        }
        int iIndexOf = str.indexOf(i);
        if (iIndexOf < 0) {
            strArr[0] = "";
            strArr[1] = "";
        } else {
            strArr[0] = str.substring(0, iIndexOf);
            strArr[1] = str.substring(iIndexOf + 1);
        }
    }

    public static void C(String str, String str2, String[] strArr) {
        if (str == null) {
            strArr[0] = "";
            strArr[1] = "";
            return;
        }
        int iIndexOf = str.indexOf(str2);
        if (iIndexOf < 0) {
            strArr[0] = "";
            strArr[1] = "";
        } else {
            strArr[0] = str.substring(0, iIndexOf);
            strArr[1] = str.substring(iIndexOf + str2.length());
        }
    }

    public static String D(String str, int i, String str2) {
        int iIndexOf;
        return (str != null && (iIndexOf = str.indexOf(i)) >= 0) ? str.substring(iIndexOf + 1) : str2;
    }

    public static Integer E(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static long F() {
        return SystemClock.uptimeMillis();
    }

    public static String G(Uri uri) {
        String path = uri.getPath();
        int length = path.length();
        int iLastIndexOf = path.lastIndexOf(".");
        if (iLastIndexOf < 0) {
            iLastIndexOf = length - 1;
        }
        int iMax = Math.max(path.lastIndexOf(47, iLastIndexOf), 0) + 1;
        int iIndexOf = path.indexOf(47, iLastIndexOf);
        if (iIndexOf >= 0) {
            length = iIndexOf;
        }
        try {
            String strSubstring = path.substring(iMax, length);
            if (strSubstring.length() < 2) {
                return null;
            }
            return strSubstring;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String H(int i) {
        if (i == 0) {
            return "00";
        }
        if (i / 10 != 0) {
            return String.valueOf(i);
        }
        return "0" + i;
    }

    public static String a(String[] strArr, int i, String str) {
        return (i < 0 || strArr.length <= i) ? str : strArr[i];
    }

    public static boolean b(int i) {
        return i % 2 != 0;
    }

    public static boolean c(long j) {
        return (j & (j - 1)) == 0;
    }

    public static float d(float f) {
        return f < 0.0f ? -1.0f : 1.0f;
    }

    public static int e(String[] strArr, String str) {
        return f(strArr, str, -1);
    }

    public static int f(String[] strArr, String str, int i) {
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (strArr[i2].equals(str)) {
                return i2;
            }
        }
        return i;
    }

    public static boolean g(Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        return obj != null && obj.equals(obj2);
    }

    public static boolean h(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        return str != null && str.equals(str2);
    }

    public static Object i(InterfaceC4856gX interfaceC4856gX) {
        if (interfaceC4856gX == null) {
            return null;
        }
        interfaceC4856gX.a();
        return null;
    }

    public static float j(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    public static int k(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    public static String l(String str) {
        int iIndexOf = str.indexOf(0);
        return iIndexOf < 0 ? str : str.substring(0, iIndexOf);
    }

    public static String m() {
        return "1.2.252";
    }

    public static String n(int i, boolean z) {
        int i2 = i / 3600;
        int i3 = (i % 3600) / 60;
        int i4 = i % 60;
        if (z && i2 == 0) {
            return H(i3) + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + H(i4);
        }
        return H(i2) + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + H(i3) + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + H(i4);
    }

    public static String o(int i) {
        return p(i, true);
    }

    public static String p(int i, boolean z) {
        int i2 = i / 3600;
        int i3 = (i % 3600) / 60;
        int i4 = i % 60;
        if (z && i2 == 0) {
            return i3 + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + H(i4);
        }
        return i2 + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + i3 + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + H(i4);
    }

    public static String q(int i) {
        return Integer.toHexString(i).toUpperCase();
    }

    public static void r(float[] fArr, float[] fArr2, float[] fArr3, float f) {
        float f2 = 1.0f - f;
        fArr3[0] = (fArr[0] * f2) + (fArr2[0] * f);
        fArr3[1] = (fArr[1] * f2) + (fArr2[1] * f);
        fArr3[2] = (fArr[2] * f2) + (fArr2[2] * f);
        fArr3[3] = (fArr[3] * f2) + (fArr2[3] * f);
    }

    public static int s(int i, int i2) {
        if (i < 0) {
            return 0;
        }
        int i3 = i - 1;
        int i4 = i3 | (i3 >> 1);
        int i5 = i4 | (i4 >> 2);
        int i6 = i5 | (i5 >> 4);
        int i7 = i6 | (i6 >> 8);
        return Math.min((i7 | (i7 >> 16)) + 1, i2);
    }

    public static boolean t(String str, boolean z) {
        return (str == null || str.length() < 1) ? z : str.charAt(0) == 't' || str.charAt(0) == 'T' || str.charAt(0) == '1';
    }

    public static float u(String str) {
        return v(str, 0.0f);
    }

    public static float v(String str, float f) {
        if (str != null) {
            try {
                return Float.parseFloat(str);
            } catch (NumberFormatException unused) {
            }
        }
        return f;
    }

    public static int w(String str) {
        return x(str, 0);
    }

    public static int x(String str, int i) {
        if (str != null) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public static long y(String str) {
        return z(str, 0L);
    }

    public static long z(String str, long j) {
        if (str != null) {
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException unused) {
            }
        }
        return j;
    }
}
