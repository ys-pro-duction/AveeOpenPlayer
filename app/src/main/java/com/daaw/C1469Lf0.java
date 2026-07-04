package com.daaw;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Lf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1469Lf0 {
    public final List a;
    public float b = 0.0f;

    public C1469Lf0(C1477Lh0 c1477Lh0) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.add(c1477Lh0);
    }

    public static C1469Lf0 a(float f) {
        return new C1469Lf0(new C1477Lh0("Constant", f));
    }

    public static C1469Lf0 b(float f, float f2) {
        return new C1469Lf0(new C1477Lh0("Constant", f, f2));
    }

    public static C1469Lf0 c(String str, C1469Lf0 c1469Lf0) {
        String[] strArrSplit = TextUtils.split(str, ";");
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str2 : strArrSplit) {
            C1477Lh0 c1477Lh0B = C1477Lh0.b(str2, null);
            if (c1477Lh0B != null) {
                arrayList.add(c1477Lh0B);
            }
        }
        return arrayList.size() <= 0 ? c1469Lf0 : new C1469Lf0(arrayList);
    }

    public String d(Context context) {
        StringBuilder sb = new StringBuilder();
        if (this.a.size() > 1) {
            int i = 0;
            while (true) {
                ((C1477Lh0) this.a.get(i)).s(sb, false, context);
                i++;
                if (i >= this.a.size()) {
                    break;
                }
                sb.append("+");
            }
        } else if (this.a.size() == 1) {
            ((C1477Lh0) this.a.get(0)).s(sb, true, context);
        }
        return sb.toString();
    }

    public String e(Context context) {
        StringBuilder sb = new StringBuilder();
        if (this.a.size() > 1) {
            int i = 0;
            while (true) {
                ((C1477Lh0) this.a.get(i)).t(sb, false, context);
                i++;
                if (i >= this.a.size()) {
                    break;
                }
                sb.append("+");
            }
        } else if (this.a.size() == 1) {
            ((C1477Lh0) this.a.get(0)).t(sb, true, context);
        }
        return sb.toString();
    }

    public float f() {
        float f = 0.0f;
        if (this.a.size() <= 1) {
            if (this.a.size() == 1) {
                return ((C1477Lh0) this.a.get(0)).f();
            }
            return 0.0f;
        }
        for (int i = 0; i < this.a.size(); i++) {
            f += ((C1477Lh0) this.a.get(i)).f();
        }
        return f / this.a.size();
    }

    public C1477Lh0 g(int i) {
        return (C1477Lh0) this.a.get(i);
    }

    public int h() {
        return this.a.size();
    }

    public float i(C6036kk0 c6036kk0) {
        this.b = 0.0f;
        for (int i = 0; i < this.a.size(); i++) {
            this.b += ((C1477Lh0) this.a.get(i)).i(c6036kk0);
        }
        return this.b;
    }

    public C1458Lc1 j(C6036kk0 c6036kk0, C1458Lc1 c1458Lc1) {
        c1458Lc1.a = 0.0f;
        c1458Lc1.b = 0.0f;
        for (int i = 0; i < this.a.size(); i++) {
            C1458Lc1 c1458Lc1L = ((C1477Lh0) this.a.get(i)).l(c6036kk0);
            c1458Lc1.a += c1458Lc1L.a;
            c1458Lc1.b += c1458Lc1L.b;
        }
        return c1458Lc1;
    }

    public void k(int i, C1477Lh0 c1477Lh0) {
        this.a.set(i, c1477Lh0);
    }

    public String toString() {
        if (this.a.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            ((C1477Lh0) this.a.get(i)).u(sb);
            i++;
            if (i >= this.a.size()) {
                return sb.toString();
            }
            sb.append(";");
        }
    }

    public C1469Lf0(C1469Lf0 c1469Lf0, int i, int i2) {
        this.a = new ArrayList(i2);
        int i3 = 0;
        while (i < c1469Lf0.a.size() && i2 > i3) {
            i3++;
            this.a.add(new C1477Lh0((C1477Lh0) c1469Lf0.a.get(i)));
            i++;
        }
    }

    public C1469Lf0(C1469Lf0 c1469Lf0, C1477Lh0 c1477Lh0) {
        this.a = new ArrayList(c1469Lf0.a.size() + 1);
        for (int i = 0; i < c1469Lf0.a.size(); i++) {
            this.a.add(new C1477Lh0((C1477Lh0) c1469Lf0.a.get(i)));
        }
        this.a.add(new C1477Lh0(c1477Lh0));
    }

    public C1469Lf0(C1469Lf0 c1469Lf0) {
        this.a = new ArrayList(c1469Lf0.a.size());
        for (int i = 0; i < c1469Lf0.a.size(); i++) {
            this.a.add(new C1477Lh0((C1477Lh0) c1469Lf0.a.get(i)));
        }
    }

    public C1469Lf0(List list) {
        this.a = list;
    }
}
