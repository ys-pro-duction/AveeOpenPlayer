package com.daaw;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class CF0 {
    public static final C9823yF0 a(Annotation[] annotationArr, AP ap) {
        Annotation annotation;
        G10.g(annotationArr, "<this>");
        G10.g(ap, "fqName");
        int length = annotationArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i];
            if (G10.c(AbstractC9544xF0.e(X40.b(X40.a(annotation))).a(), ap)) {
                break;
            }
            i++;
        }
        if (annotation != null) {
            return new C9823yF0(annotation);
        }
        return null;
    }

    public static final List b(Annotation[] annotationArr) {
        G10.g(annotationArr, "<this>");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new C9823yF0(annotation));
        }
        return arrayList;
    }
}
