package com.daaw;

import j$.util.DesugarCollections;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.ob1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7117ob1 {
    public static final String[] a = new String[0];
    public static final Charset b = Charset.forName("UTF-8");

    public static List a(Object[] objArr) {
        return DesugarCollections.unmodifiableList(Arrays.asList((Object[]) objArr.clone()));
    }

    public static List b(Object[] objArr, Object[] objArr2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            int length = objArr2.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    Object obj2 = objArr2[i];
                    if (obj.equals(obj2)) {
                        arrayList.add(obj2);
                        break;
                    }
                    i++;
                }
            }
        }
        return arrayList;
    }

    public static Object[] c(Class cls, Object[] objArr, Object[] objArr2) {
        List listB = b(objArr, objArr2);
        return listB.toArray((Object[]) Array.newInstance((Class<?>) cls, listB.size()));
    }
}
