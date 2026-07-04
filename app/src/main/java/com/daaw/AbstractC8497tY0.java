package com.daaw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.tY0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8497tY0 extends AbstractC8218sY0 {

    /* JADX INFO: renamed from: com.daaw.tY0$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public static final a B = new a();

        public a() {
            super(1);
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str) {
            G10.g(str, "line");
            return str;
        }
    }

    /* JADX INFO: renamed from: com.daaw.tY0$b */
    public static final class b extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ String B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.B = str;
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str) {
            G10.g(str, "line");
            return this.B + str;
        }
    }

    public static final NQ b(String str) {
        return str.length() == 0 ? a.B : new b(str);
    }

    public static final int c(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (!AbstractC9956yk.c(str.charAt(i))) {
                break;
            }
            i++;
        }
        return i == -1 ? str.length() : i;
    }

    public static final String d(String str, String str2) {
        String str3;
        G10.g(str, "<this>");
        G10.g(str2, "newIndent");
        List listV = BY0.V(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listV) {
            if (!BY0.O((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1703Nm.v(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(c((String) it.next())));
        }
        Integer num = (Integer) AbstractC2455Um.u0(arrayList2);
        int i = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * listV.size());
        NQ nqB = b(str2);
        int iM = AbstractC1599Mm.m(listV);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listV) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC1599Mm.u();
            }
            String str4 = (String) obj2;
            if ((i == 0 || i == iM) && BY0.O(str4)) {
                str4 = null;
            } else {
                String strE0 = DY0.E0(str4, iIntValue);
                if (strE0 != null && (str3 = (String) nqB.invoke(strE0)) != null) {
                    str4 = str3;
                }
            }
            if (str4 != null) {
                arrayList3.add(str4);
            }
            i = i2;
        }
        String string = ((StringBuilder) AbstractC2455Um.k0(arrayList3, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
        G10.f(string, "toString(...)");
        return string;
    }

    public static String e(String str) {
        G10.g(str, "<this>");
        return d(str, "");
    }
}
