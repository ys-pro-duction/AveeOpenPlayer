package com.daaw;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CE1 {
    public static List a() {
        ArrayList arrayList = new ArrayList();
        c(arrayList, C5344iF1.c("gad:dynamite_module:experiment_id", ""));
        c(arrayList, AbstractC8422tF1.a);
        c(arrayList, AbstractC8422tF1.b);
        c(arrayList, AbstractC8422tF1.c);
        c(arrayList, AbstractC8422tF1.d);
        c(arrayList, AbstractC8422tF1.e);
        c(arrayList, AbstractC8422tF1.u);
        c(arrayList, AbstractC8422tF1.f);
        c(arrayList, AbstractC8422tF1.m);
        c(arrayList, AbstractC8422tF1.n);
        c(arrayList, AbstractC8422tF1.o);
        c(arrayList, AbstractC8422tF1.p);
        c(arrayList, AbstractC8422tF1.q);
        c(arrayList, AbstractC8422tF1.r);
        c(arrayList, AbstractC8422tF1.s);
        c(arrayList, AbstractC8422tF1.t);
        c(arrayList, AbstractC8422tF1.g);
        c(arrayList, AbstractC8422tF1.h);
        c(arrayList, AbstractC8422tF1.i);
        c(arrayList, AbstractC8422tF1.j);
        c(arrayList, AbstractC8422tF1.k);
        c(arrayList, AbstractC8422tF1.l);
        return arrayList;
    }

    public static List b() {
        ArrayList arrayList = new ArrayList();
        c(arrayList, MF1.a);
        return arrayList;
    }

    public static void c(List list, C5344iF1 c5344iF1) {
        String str = (String) c5344iF1.e();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        list.add(str);
    }
}
