package com.daaw;

import com.daaw.D7;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class E7 {
    public static final D7 a = new D7("", null, null, 6, null);

    public static final boolean c(int i, int i2, int i3, int i4) {
        if (i <= i3 && i4 <= i2) {
            if (i2 == i4) {
                if ((i3 == i4) == (i == i2)) {
                }
            }
            return true;
        }
        return false;
    }

    public static final List d(List list, int i, int i2) {
        if (i > i2) {
            throw new IllegalArgumentException(("start (" + i + ") should be less than or equal to end (" + i2 + ')').toString());
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            D7.b bVar = (D7.b) obj;
            if (f(i, i2, bVar.f(), bVar.d())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            D7.b bVar2 = (D7.b) arrayList.get(i4);
            arrayList2.add(new D7.b(bVar2.e(), Math.max(i, bVar2.f()) - i, Math.min(i2, bVar2.d()) - i, bVar2.g()));
        }
        return arrayList2;
    }

    public static final List e(D7 d7, int i, int i2) {
        if (i == i2) {
            return AbstractC1599Mm.k();
        }
        if (i == 0 && i2 >= d7.g().length()) {
            return d7.e();
        }
        List listE = d7.e();
        ArrayList arrayList = new ArrayList(listE.size());
        int size = listE.size();
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = listE.get(i3);
            D7.b bVar = (D7.b) obj;
            if (f(i, i2, bVar.f(), bVar.d())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            D7.b bVar2 = (D7.b) arrayList.get(i4);
            arrayList2.add(new D7.b(bVar2.e(), AbstractC8417tE0.l(bVar2.f(), i, i2) - i, AbstractC8417tE0.l(bVar2.d(), i, i2) - i));
        }
        return arrayList2;
    }

    public static final boolean f(int i, int i2, int i3, int i4) {
        return Math.max(i, i3) < Math.min(i2, i4) || c(i, i2, i3, i4) || c(i3, i4, i, i2);
    }

    public static final List g(D7 d7, C1417Ks0 c1417Ks0) {
        G10.g(d7, "<this>");
        G10.g(c1417Ks0, "defaultParagraphStyle");
        int length = d7.g().length();
        List listD = d7.d();
        ArrayList arrayList = new ArrayList();
        int size = listD.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            D7.b bVar = (D7.b) listD.get(i);
            C1417Ks0 c1417Ks02 = (C1417Ks0) bVar.a();
            int iB = bVar.b();
            int iC = bVar.c();
            if (iB != i2) {
                arrayList.add(new D7.b(c1417Ks0, i2, iB));
            }
            arrayList.add(new D7.b(c1417Ks0.i(c1417Ks02), iB, iC));
            i++;
            i2 = iC;
        }
        if (i2 != length) {
            arrayList.add(new D7.b(c1417Ks0, i2, length));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new D7.b(c1417Ks0, 0, 0));
        }
        return arrayList;
    }

    public static final D7 h(D7 d7, int i, int i2) {
        String strSubstring;
        if (i != i2) {
            strSubstring = d7.g().substring(i, i2);
            G10.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            strSubstring = "";
        }
        return new D7(strSubstring, e(d7, i, i2), null, 4, null);
    }
}
