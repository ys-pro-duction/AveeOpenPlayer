package com.daaw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Mm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1599Mm extends AbstractC1496Lm {
    public static ArrayList g(Object... objArr) {
        G10.g(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C1448La(objArr, true));
    }

    public static final Collection h(Object[] objArr) {
        G10.g(objArr, "<this>");
        return new C1448La(objArr, false);
    }

    public static final int i(List list, Comparable comparable, int i, int i2) {
        G10.g(list, "<this>");
        s(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int iA = AbstractC1188In.a((Comparable) list.get(i4), comparable);
            if (iA < 0) {
                i = i4 + 1;
            } else {
                if (iA <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    public static /* synthetic */ int j(List list, Comparable comparable, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        return i(list, comparable, i, i2);
    }

    public static List k() {
        return C6751nG.B;
    }

    public static H00 l(Collection collection) {
        G10.g(collection, "<this>");
        return new H00(0, collection.size() - 1);
    }

    public static int m(List list) {
        G10.g(list, "<this>");
        return list.size() - 1;
    }

    public static List n(Object... objArr) {
        G10.g(objArr, "elements");
        return objArr.length > 0 ? AbstractC5152hb.d(objArr) : k();
    }

    public static List o(Object obj) {
        return obj != null ? AbstractC1496Lm.e(obj) : k();
    }

    public static List p(Object... objArr) {
        G10.g(objArr, "elements");
        return AbstractC5431ib.D(objArr);
    }

    public static List q(Object... objArr) {
        G10.g(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C1448La(objArr, true));
    }

    public static final List r(List list) {
        G10.g(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : AbstractC1496Lm.e(list.get(0)) : k();
    }

    public static final void s(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException("fromIndex (" + i2 + ") is greater than toIndex (" + i3 + ").");
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i2 + ") is less than zero.");
        }
        if (i3 <= i) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is greater than size (" + i + ").");
    }

    public static void t() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void u() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
