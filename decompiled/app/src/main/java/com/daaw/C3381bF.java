package com.daaw;

import com.revenuecat.purchases.common.Constants;
import java.util.Locale;

/* JADX INFO: renamed from: com.daaw.bF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3381bF {
    public static final C3381bF c = new C3381bF("Unnamed", 0);
    public final String a;
    public a[] b;

    /* JADX INFO: renamed from: com.daaw.bF$a */
    public static class a {
        public float a;
        public float b;

        public a(float f, float f2) {
            this.a = f;
            this.b = f2;
        }

        public static a a(String str) {
            a aVar = new a(0.0f, 0.0f);
            int iIndexOf = str.indexOf(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
            if (iIndexOf < 0) {
                return aVar;
            }
            aVar.a = AbstractC0405Bb1.u(str.substring(0, iIndexOf));
            aVar.b = AbstractC0405Bb1.u(str.substring(iIndexOf + 1));
            return aVar;
        }

        public String toString() {
            return String.format(Locale.US, "%.3f:%.3f", Float.valueOf(this.a), Float.valueOf(this.b));
        }
    }

    public C3381bF(String str, int i) {
        this.a = str;
        this.b = new a[i];
    }

    public static C3381bF a(C3381bF c3381bF) {
        C3381bF c3381bF2 = new C3381bF(c3381bF.a, c3381bF.b.length);
        int i = 0;
        while (true) {
            a[] aVarArr = c3381bF.b;
            if (i >= aVarArr.length) {
                return c3381bF2;
            }
            a[] aVarArr2 = c3381bF2.b;
            a aVar = aVarArr[i];
            aVarArr2[i] = new a(aVar.a, aVar.b);
            i++;
        }
    }

    public static C3381bF b(String str) {
        String[] strArrA = AbstractC1557Mb1.a(";", str);
        C3381bF c3381bF = new C3381bF("Default", strArrA.length);
        for (int i = 0; i < strArrA.length; i++) {
            c3381bF.b[i] = a.a(strArrA[i]);
        }
        return c3381bF;
    }

    public static String e(C3381bF c3381bF) {
        return AbstractC1557Mb1.d(";", c3381bF.b);
    }

    public void c(float f) {
        for (a aVar : this.b) {
            aVar.b /= f;
        }
    }

    public void d(int i) {
        this.b = new a[i];
    }
}
