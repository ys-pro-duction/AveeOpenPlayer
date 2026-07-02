package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AY0 extends AbstractC10178zY0 {
    public static String k(byte[] bArr) {
        G10.g(bArr, "<this>");
        return new String(bArr, C0335Ak.b);
    }

    public static final boolean l(String str, String str2, boolean z) {
        G10.g(str, "<this>");
        G10.g(str2, "suffix");
        return !z ? str.endsWith(str2) : n(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static /* synthetic */ boolean m(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return l(str, str2, z);
    }

    public static final boolean n(String str, int i, String str2, int i2, int i3, boolean z) {
        G10.g(str, "<this>");
        G10.g(str2, "other");
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    public static String o(CharSequence charSequence, int i) {
        G10.g(charSequence, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
        }
        if (i == 0) {
            return "";
        }
        int i2 = 1;
        if (i == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = charSequence.charAt(0);
            char[] cArr = new char[i];
            for (int i3 = 0; i3 < i; i3++) {
                cArr[i3] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(charSequence.length() * i);
        if (1 <= i) {
            while (true) {
                sb.append(charSequence);
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        String string = sb.toString();
        G10.d(string);
        return string;
    }

    public static final String p(String str, char c, char c2, boolean z) {
        G10.g(str, "<this>");
        if (!z) {
            String strReplace = str.replace(c, c2);
            G10.f(strReplace, "replace(...)");
            return strReplace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (AbstractC10235zk.d(cCharAt, c, z)) {
                cCharAt = c2;
            }
            sb.append(cCharAt);
        }
        String string = sb.toString();
        G10.f(string, "toString(...)");
        return string;
    }

    public static final String q(String str, String str2, String str3, boolean z) {
        G10.g(str, "<this>");
        G10.g(str2, "oldValue");
        G10.g(str3, "newValue");
        int i = 0;
        int I = BY0.I(str, str2, 0, z);
        if (I < 0) {
            return str;
        }
        int length = str2.length();
        int iD = AbstractC8417tE0.d(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i, I);
            sb.append(str3);
            i = I + length;
            if (I >= str.length()) {
                break;
            }
            I = BY0.I(str, str2, I + iD, z);
        } while (I > 0);
        sb.append((CharSequence) str, i, str.length());
        String string = sb.toString();
        G10.f(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String r(String str, char c, char c2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return p(str, c, c2, z);
    }

    public static /* synthetic */ String s(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return q(str, str2, str3, z);
    }

    public static final boolean t(String str, String str2, boolean z) {
        G10.g(str, "<this>");
        G10.g(str2, "prefix");
        return !z ? str.startsWith(str2) : n(str, 0, str2, 0, str2.length(), z);
    }

    public static /* synthetic */ boolean u(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return t(str, str2, z);
    }
}
