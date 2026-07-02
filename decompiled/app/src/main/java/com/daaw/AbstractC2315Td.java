package com.daaw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.Td, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2315Td {
    public static boolean a(String str, String str2, String str3) {
        if (str.equals(str3) || str2.equals(str3)) {
            return false;
        }
        int iH = h(str, str3);
        int iG = g(str2, str3);
        return iH > 0 && iG > 0 && iH + iG >= str3.length();
    }

    public static void b(Set set, String str, List list) {
        boolean z;
        for (Set set2 : i(set)) {
            if (set2.size() == 2) {
                Iterator it = set2.iterator();
                String str2 = null;
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    String str3 = (String) it.next();
                    if (str2 != null) {
                        z = true;
                        if (!a(str3, str2, str)) {
                            if (a(str2, str3, str)) {
                                list.add(str2);
                                str2 = str3;
                                break;
                            }
                        } else {
                            list.add(str3);
                            break;
                        }
                    }
                    str2 = str3;
                }
                if (str2 != null && z) {
                    list.add(str2);
                }
            }
        }
    }

    public static void c(String[] strArr, List list) {
        b(new HashSet(Arrays.asList(strArr)), strArr[strArr.length - 1], list);
    }

    public static List d(String str, String str2, String[]... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String[] strArr2 : strArr) {
            c(strArr2, arrayList);
        }
        return arrayList;
    }

    public static List e(List list) {
        String str = (String) list.get(list.size() - 2);
        String str2 = (String) list.get(list.size() - 1);
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
        }
        char cCharAt = str2.charAt(0);
        list.set(0, str2);
        list.set(1, str2);
        list.set(list.size() - 2, str);
        list.set(list.size() - 1, str);
        list.set(((cCharAt + list.size()) - 1) % list.size(), sb.toString());
        return list;
    }

    public static String f(List list) {
        Iterator it = list.iterator();
        int i = 0;
        int length = 0;
        int i2 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.length() > length) {
                length = str.length();
                i = i2;
            }
            i2++;
        }
        return (String) list.get(i);
    }

    public static int g(String str, String str2) {
        int length = str2.length() - 1;
        int i = 0;
        for (int i2 = 0; i2 < str.length() && length >= 0 && str.charAt(i2) == str2.charAt(length); i2++) {
            i++;
            length--;
        }
        return i;
    }

    public static int h(String str, String str2) {
        int i = 0;
        int i2 = 0;
        for (int length = str.length() - 1; length >= 0 && i2 < str2.length() && str.charAt(length) == str2.charAt(i2); length--) {
            i++;
            i2++;
        }
        return i;
    }

    public static Set i(Set set) {
        HashSet hashSet = new HashSet();
        if (set.isEmpty()) {
            hashSet.add(new HashSet());
            return hashSet;
        }
        ArrayList arrayList = new ArrayList(set);
        Object obj = arrayList.get(0);
        for (Set set2 : i(new HashSet(arrayList.subList(1, arrayList.size())))) {
            HashSet hashSet2 = new HashSet();
            hashSet2.add(obj);
            hashSet2.addAll(set2);
            hashSet.add(hashSet2);
            hashSet.add(set2);
        }
        return hashSet;
    }
}
