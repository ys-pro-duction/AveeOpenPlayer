package com.daaw;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Mb1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1557Mb1 {
    public static String[] a(String str, String str2) {
        return str2 == null ? new String[0] : TextUtils.split(str2, str);
    }

    public static List b(String str, String str2) {
        return str2 == null ? new ArrayList() : Arrays.asList(TextUtils.split(str2, str));
    }

    public static String c(char c, char c2, String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                StringBuilder sb = new StringBuilder(str.length());
                for (int i2 = 0; i2 < str.length(); i2++) {
                    if (str.charAt(i2) == c) {
                        sb.append(c2);
                    } else {
                        sb.append(str.charAt(i2));
                    }
                }
                return sb.toString();
            }
        }
        return str;
    }

    public static String d(CharSequence charSequence, Object[] objArr) {
        return TextUtils.join(charSequence, objArr);
    }

    public static String e(CharSequence charSequence, Iterable iterable) {
        return TextUtils.join(charSequence, iterable);
    }

    public static String f(CharSequence charSequence, Iterable iterable) {
        StringBuilder sb = new StringBuilder();
        Iterator it = iterable.iterator();
        boolean z = true;
        while (it.hasNext()) {
            String string = it.next().toString();
            if (!string.contains(charSequence)) {
                if (z) {
                    z = false;
                } else {
                    sb.append(charSequence);
                }
                sb.append(string);
            }
        }
        return sb.toString();
    }

    public static String g(CharSequence charSequence, Iterable iterable, Iterable iterable2, boolean z) {
        StringBuilder sb = new StringBuilder();
        Iterator it = iterable.iterator();
        boolean z2 = true;
        while (it.hasNext()) {
            String string = it.next().toString();
            if (!string.isEmpty() || !z) {
                if (!string.contains(charSequence)) {
                    if (z2) {
                        z2 = false;
                    } else {
                        sb.append(charSequence);
                    }
                    sb.append(string);
                }
            }
        }
        if (iterable2 != null) {
            Iterator it2 = iterable2.iterator();
            while (it2.hasNext()) {
                String string2 = it2.next().toString();
                if (!string2.isEmpty() || !z) {
                    if (!string2.contains(charSequence)) {
                        if (z2) {
                            z2 = false;
                        } else {
                            sb.append(charSequence);
                        }
                        sb.append(string2);
                    }
                }
            }
        }
        return sb.toString();
    }

    public static String h(CharSequence charSequence, Iterable iterable, Object obj, boolean z) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(obj);
        return g(charSequence, iterable, arrayList, z);
    }

    public static String i(CharSequence charSequence, Iterable iterable, Object obj, boolean z) {
        StringBuilder sb = new StringBuilder();
        boolean z2 = true;
        for (Object obj2 : iterable) {
            if (!obj2.equals(obj)) {
                String string = obj2.toString();
                if (!string.isEmpty() || !z) {
                    if (!string.contains(charSequence)) {
                        if (z2) {
                            z2 = false;
                        } else {
                            sb.append(charSequence);
                        }
                        sb.append(string);
                    }
                }
            }
        }
        return sb.toString();
    }
}
