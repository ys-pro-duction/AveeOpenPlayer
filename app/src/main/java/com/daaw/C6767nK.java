package com.daaw;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.daaw.nK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6767nK {
    public static final Pattern b = Pattern.compile("[~*/\\[\\]]");
    public static final C6767nK c = new C6767nK(C6488mK.C);
    public final C6488mK a;

    public C6767nK(List list) {
        this.a = C6488mK.t(list);
    }

    public static C6767nK a(String str) {
        AbstractC8342sy0.c(str, "Provided field path must not be null.");
        AbstractC8342sy0.a(!b.matcher(str).find(), "Use FieldPath.of() for field names containing '~*/[]'.", new Object[0]);
        try {
            return c(str.split("\\.", -1));
        } catch (IllegalArgumentException unused) {
            throw new IllegalArgumentException("Invalid field path (" + str + "). Paths must not be empty, begin with '.', end with '.', or contain '..'");
        }
    }

    public static C6767nK c(String... strArr) {
        AbstractC8342sy0.a(strArr.length > 0, "Invalid field path. Provided path must not be empty.", new Object[0]);
        int i = 0;
        while (i < strArr.length) {
            String str = strArr[i];
            boolean z = (str == null || str.isEmpty()) ? false : true;
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid field name at argument ");
            i++;
            sb.append(i);
            sb.append(". Field names must not be null or empty.");
            AbstractC8342sy0.a(z, sb.toString(), new Object[0]);
        }
        return new C6767nK(Arrays.asList(strArr));
    }

    public C6488mK b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6767nK.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((C6767nK) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }

    public C6767nK(C6488mK c6488mK) {
        this.a = c6488mK;
    }
}
