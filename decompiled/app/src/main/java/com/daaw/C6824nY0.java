package com.daaw;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.daaw.nY0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6824nY0 {
    public static final EnumC5128hV0[] c = {EnumC5128hV0.L, EnumC5128hV0.LW, EnumC5128hV0.W};
    public static final Pattern d = Pattern.compile("[#\\?/\\*0-9]");
    public final Pattern a;
    public final Pattern b;

    public C6824nY0(UJ uj) {
        this.b = a(uj.c());
        this.a = b(uj.e());
    }

    public Pattern a(Set set) {
        HashSet hashSet = new HashSet();
        for (EnumC5128hV0 enumC5128hV0 : c) {
            if (set.contains(enumC5128hV0)) {
                hashSet.add(enumC5128hV0.name());
            }
        }
        return c(hashSet);
    }

    public Pattern b(Set set) {
        return c(set);
    }

    public Pattern c(Set set) {
        StringBuilder sb = new StringBuilder("\\b(");
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            sb.append(")\\b");
            return Pattern.compile(sb.toString());
        }
        sb.append((String) it.next());
        while (it.hasNext()) {
            sb.append("|");
            sb.append((String) it.next());
        }
        sb.append(")\\b");
        return Pattern.compile(sb.toString());
    }

    public String d(String str) {
        return this.b.matcher(this.a.matcher(d.matcher(str.toUpperCase()).replaceAll("")).replaceAll("")).replaceAll("").replaceAll("\\s+", "").replaceAll(",", "").replaceAll("-", "");
    }
}
