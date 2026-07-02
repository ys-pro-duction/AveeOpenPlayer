package com.daaw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.oS0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C7079oS0 {
    public static final C7079oS0 a = new C7079oS0();

    public static final CharSequence k(String str) {
        G10.g(str, "it");
        return a.c(str);
    }

    public final String[] b(String... strArr) {
        G10.g(strArr, "signatures");
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final String c(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return 'L' + str + ';';
    }

    public final Set d(String str, String... strArr) {
        G10.g(str, "internalName");
        G10.g(strArr, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    public final Set e(String str, String... strArr) {
        G10.g(str, "name");
        G10.g(strArr, "signatures");
        return d(h(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final Set f(String str, String... strArr) {
        G10.g(str, "name");
        G10.g(strArr, "signatures");
        return d(i(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final String g(String str) {
        G10.g(str, "name");
        return "java/util/function/" + str;
    }

    public final String h(String str) {
        G10.g(str, "name");
        return "java/lang/" + str;
    }

    public final String i(String str) {
        G10.g(str, "name");
        return "java/util/" + str;
    }

    public final String j(String str, List list, String str2) {
        G10.g(str, "name");
        G10.g(list, "parameters");
        G10.g(str2, "ret");
        return str + '(' + AbstractC2455Um.n0(list, "", null, null, 0, null, C6800nS0.B, 30, null) + ')' + c(str2);
    }

    public final String l(String str, String str2) {
        G10.g(str, "internalName");
        G10.g(str2, "jvmDescriptor");
        return str + '.' + str2;
    }
}
