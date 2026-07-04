package com.daaw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.mK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6488mK extends AbstractC0840Fe {
    public static final C6488mK C = v("__name__");
    public static final C6488mK D = new C6488mK(Collections.EMPTY_LIST);

    public C6488mK(List list) {
        super(list);
    }

    public static C6488mK t(List list) {
        return list.isEmpty() ? D : new C6488mK(list);
    }

    public static C6488mK u(String str) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        boolean z = false;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\\') {
                i++;
                if (i == str.length()) {
                    throw new IllegalArgumentException("Trailing escape character is not allowed");
                }
                sb.append(str.charAt(i));
            } else if (cCharAt == '.') {
                if (z) {
                    sb.append(cCharAt);
                } else {
                    String string = sb.toString();
                    if (string.isEmpty()) {
                        throw new IllegalArgumentException("Invalid field path (" + str + "). Paths must not be empty, begin with '.', end with '.', or contain '..'");
                    }
                    StringBuilder sb2 = new StringBuilder();
                    arrayList.add(string);
                    sb = sb2;
                }
            } else if (cCharAt == '`') {
                z = !z;
            } else {
                sb.append(cCharAt);
            }
            i++;
        }
        String string2 = sb.toString();
        if (!string2.isEmpty()) {
            arrayList.add(string2);
            return new C6488mK(arrayList);
        }
        throw new IllegalArgumentException("Invalid field path (" + str + "). Paths must not be empty, begin with '.', end with '.', or contain '..'");
    }

    public static C6488mK v(String str) {
        return new C6488mK(Collections.singletonList(str));
    }

    public static boolean x(String str) {
        if (str.isEmpty()) {
            return false;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt != '_' && ((cCharAt < 'a' || cCharAt > 'z') && (cCharAt < 'A' || cCharAt > 'Z'))) {
            return false;
        }
        for (int i = 1; i < str.length(); i++) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 != '_' && ((cCharAt2 < 'a' || cCharAt2 > 'z') && ((cCharAt2 < 'A' || cCharAt2 > 'Z') && (cCharAt2 < '0' || cCharAt2 > '9')))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.daaw.AbstractC0840Fe
    public String g() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.B.size(); i++) {
            if (i > 0) {
                sb.append(".");
            }
            String strReplace = ((String) this.B.get(i)).replace("\\", "\\\\").replace("`", "\\`");
            if (!x(strReplace)) {
                strReplace = '`' + strReplace + '`';
            }
            sb.append(strReplace);
        }
        return sb.toString();
    }

    @Override // com.daaw.AbstractC0840Fe
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public C6488mK k(List list) {
        return new C6488mK(list);
    }

    public boolean w() {
        return equals(C);
    }
}
