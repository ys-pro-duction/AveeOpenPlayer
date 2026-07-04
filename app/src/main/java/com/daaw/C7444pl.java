package com.daaw;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.pl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C7444pl {
    public static final C7444pl a = new C7444pl();
    public static final String b = AbstractC2455Um.n0(AbstractC1599Mm.n('k', 'o', 't', 'l', 'i', 'n'), "", null, null, 0, null, null, 62, null);
    public static final Map c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listN = AbstractC1599Mm.n("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int iC = AbstractC2612Vz0.c(0, listN.size() - 1, 2);
        if (iC >= 0) {
            int i = 0;
            while (true) {
                StringBuilder sb = new StringBuilder();
                String str = b;
                sb.append(str);
                sb.append('/');
                sb.append((String) listN.get(i));
                int i2 = i + 1;
                linkedHashMap.put(sb.toString(), listN.get(i2));
                linkedHashMap.put(str + '/' + ((String) listN.get(i)) + "Array", '[' + ((String) listN.get(i2)));
                if (i == iC) {
                    break;
                } else {
                    i += 2;
                }
            }
        }
        linkedHashMap.put(b + "/Unit", "V");
        a(linkedHashMap, "Any", "java/lang/Object");
        a(linkedHashMap, "Nothing", "java/lang/Void");
        a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : AbstractC1599Mm.n("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            a(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : AbstractC1599Mm.n("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            a(linkedHashMap, "collections/" + str3, "java/util/" + str3);
            a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i3 = 0; i3 < 23; i3++) {
            StringBuilder sb2 = new StringBuilder();
            String str4 = b;
            sb2.append(str4);
            sb2.append("/jvm/functions/Function");
            sb2.append(i3);
            a(linkedHashMap, "Function" + i3, sb2.toString());
            a(linkedHashMap, "reflect/KFunction" + i3, str4 + "/reflect/KFunction");
        }
        for (String str5 : AbstractC1599Mm.n("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            a(linkedHashMap, str5 + ".Companion", b + "/jvm/internal/" + str5 + "CompanionObject");
        }
        c = linkedHashMap;
    }

    public static final void a(Map map, String str, String str2) {
        map.put(b + '/' + str, 'L' + str2 + ';');
    }

    public static final String b(String str) {
        G10.g(str, "classId");
        String str2 = (String) c.get(str);
        if (str2 != null) {
            return str2;
        }
        return 'L' + AY0.r(str, '.', '$', false, 4, null) + ';';
    }
}
