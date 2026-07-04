package com.daaw;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.daaw.C1577Mg1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.daaw.Ng1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1681Ng1 {
    public static final Pattern b = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    public static final Pattern c = Pattern.compile("(\\S+?):(\\S+)");
    public final StringBuilder a = new StringBuilder();

    /* JADX INFO: renamed from: com.daaw.Ng1$a */
    public static final class a {
        public static final String[] e = new String[0];
        public final String a;
        public final int b;
        public final String c;
        public final String[] d;

        public a(String str, int i, String str2, String[] strArr) {
            this.b = i;
            this.a = str;
            this.c = str2;
            this.d = strArr;
        }

        public static a a(String str, int i) {
            String str2;
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return null;
            }
            int iIndexOf = strTrim.indexOf(" ");
            if (iIndexOf == -1) {
                str2 = "";
            } else {
                String strTrim2 = strTrim.substring(iIndexOf).trim();
                strTrim = strTrim.substring(0, iIndexOf);
                str2 = strTrim2;
            }
            String[] strArrW = AbstractC6280lb1.W(strTrim, "\\.");
            return new a(strArrW[0], i, str2, strArrW.length > 1 ? (String[]) Arrays.copyOfRange(strArrW, 1, strArrW.length) : e);
        }

        public static a b() {
            return new a("", 0, "", new String[0]);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ng1$b */
    public static final class b implements Comparable {
        public final int B;
        public final C1474Lg1 C;

        public b(int i, C1474Lg1 c1474Lg1) {
            this.B = i;
            this.C = c1474Lg1;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            return this.B - bVar.B;
        }
    }

    public static void a(String str, SpannableStringBuilder spannableStringBuilder) {
        str.getClass();
        switch (str) {
            case "gt":
                spannableStringBuilder.append('>');
                break;
            case "lt":
                spannableStringBuilder.append('<');
                break;
            case "amp":
                spannableStringBuilder.append('&');
                break;
            case "nbsp":
                spannableStringBuilder.append(' ');
                break;
        }
    }

    public static void b(String str, a aVar, SpannableStringBuilder spannableStringBuilder, List list, List list2) {
        int i;
        int length;
        i = aVar.b;
        length = spannableStringBuilder.length();
        String str2 = aVar.a;
        str2.getClass();
        switch (str2) {
            case "":
            case "c":
            case "v":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i, length, 33);
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                break;
            default:
                return;
        }
        list2.clear();
        e(list, str, aVar, list2);
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            c(spannableStringBuilder, ((b) list2.get(i2)).C, i, length);
        }
    }

    public static void c(SpannableStringBuilder spannableStringBuilder, C1474Lg1 c1474Lg1, int i, int i2) {
        if (c1474Lg1 == null) {
            return;
        }
        if (c1474Lg1.g() != -1) {
            spannableStringBuilder.setSpan(new StyleSpan(c1474Lg1.g()), i, i2, 33);
        }
        if (c1474Lg1.k()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (c1474Lg1.l()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (c1474Lg1.j()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(c1474Lg1.b()), i, i2, 33);
        }
        if (c1474Lg1.i()) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(c1474Lg1.a()), i, i2, 33);
        }
        if (c1474Lg1.c() != null) {
            spannableStringBuilder.setSpan(new TypefaceSpan(c1474Lg1.c()), i, i2, 33);
        }
        if (c1474Lg1.h() != null) {
            spannableStringBuilder.setSpan(new AlignmentSpan.Standard(c1474Lg1.h()), i, i2, 33);
        }
        int iE = c1474Lg1.e();
        if (iE == 1) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) c1474Lg1.d(), true), i, i2, 33);
        } else if (iE == 2) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(c1474Lg1.d()), i, i2, 33);
        } else {
            if (iE != 3) {
                return;
            }
            spannableStringBuilder.setSpan(new RelativeSizeSpan(c1474Lg1.d() / 100.0f), i, i2, 33);
        }
    }

    public static int d(String str, int i) {
        int iIndexOf = str.indexOf(62, i);
        return iIndexOf == -1 ? str.length() : iIndexOf + 1;
    }

    public static void e(List list, String str, a aVar, List list2) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C1474Lg1 c1474Lg1 = (C1474Lg1) list.get(i);
            int iF = c1474Lg1.f(str, aVar.a, aVar.d, aVar.c);
            if (iF > 0) {
                list2.add(new b(iF, c1474Lg1));
            }
        }
        Collections.sort(list2);
    }

    public static String f(String str) {
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return null;
        }
        return AbstractC6280lb1.X(strTrim, "[ \\.]")[0];
    }

    public static boolean g(String str) {
        str.getClass();
        switch (str) {
            case "b":
            case "c":
            case "i":
            case "u":
            case "v":
            case "lang":
                return true;
            default:
                return false;
        }
    }

    public static boolean i(String str, Matcher matcher, C2584Vs0 c2584Vs0, C1577Mg1.b bVar, StringBuilder sb, List list) {
        try {
            bVar.j(AbstractC2015Qg1.c(matcher.group(1))).d(AbstractC2015Qg1.c(matcher.group(2)));
            j(matcher.group(3), bVar);
            sb.setLength(0);
            while (true) {
                String strK = c2584Vs0.k();
                if (TextUtils.isEmpty(strK)) {
                    k(str, sb.toString(), bVar, list);
                    return true;
                }
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strK.trim());
            }
        } catch (NumberFormatException unused) {
            matcher.group();
            return false;
        }
    }

    public static void j(String str, C1577Mg1.b bVar) {
        Matcher matcher = c.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            try {
                if ("line".equals(strGroup)) {
                    l(strGroup2, bVar);
                } else if ("align".equals(strGroup)) {
                    bVar.l(o(strGroup2));
                } else if ("position".equals(strGroup)) {
                    n(strGroup2, bVar);
                } else if ("size".equals(strGroup)) {
                    bVar.m(AbstractC2015Qg1.b(strGroup2));
                }
            } catch (NumberFormatException unused) {
                matcher.group();
            }
        }
    }

    public static void k(String str, String str2, C1577Mg1.b bVar, List list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str2.length()) {
            char cCharAt = str2.charAt(i);
            if (cCharAt == '&') {
                i++;
                int iIndexOf = str2.indexOf(59, i);
                int iIndexOf2 = str2.indexOf(32, i);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    a(str2.substring(i, iIndexOf), spannableStringBuilder);
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append(" ");
                    }
                    i = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i++;
            } else {
                int iD = i + 1;
                if (iD < str2.length()) {
                    boolean z = str2.charAt(iD) == '/';
                    iD = d(str2, iD);
                    int i2 = iD - 2;
                    boolean z2 = str2.charAt(i2) == '/';
                    int i3 = i + (z ? 2 : 1);
                    if (!z2) {
                        i2 = iD - 1;
                    }
                    String strSubstring = str2.substring(i3, i2);
                    String strF = f(strSubstring);
                    if (strF != null && g(strF)) {
                        if (z) {
                            while (!arrayDeque.isEmpty()) {
                                a aVar = (a) arrayDeque.pop();
                                b(str, aVar, spannableStringBuilder, list, arrayList);
                                if (aVar.a.equals(strF)) {
                                    break;
                                }
                            }
                        } else if (!z2) {
                            arrayDeque.push(a.a(strSubstring, spannableStringBuilder.length()));
                        }
                    }
                }
                i = iD;
            }
        }
        while (!arrayDeque.isEmpty()) {
            b(str, (a) arrayDeque.pop(), spannableStringBuilder, list, arrayList);
        }
        b(str, a.b(), spannableStringBuilder, list, arrayList);
        bVar.k(spannableStringBuilder);
    }

    public static void l(String str, C1577Mg1.b bVar) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            bVar.f(m(str.substring(iIndexOf + 1)));
            str = str.substring(0, iIndexOf);
        } else {
            bVar.f(Integer.MIN_VALUE);
        }
        if (str.endsWith("%")) {
            bVar.e(AbstractC2015Qg1.b(str)).g(0);
            return;
        }
        int i = Integer.parseInt(str);
        if (i < 0) {
            i--;
        }
        bVar.e(i).g(1);
    }

    public static int m(String str) {
        str.getClass();
        switch (str) {
            case "center":
            case "middle":
                return 1;
            case "end":
                return 2;
            case "start":
                return 0;
            default:
                return Integer.MIN_VALUE;
        }
    }

    public static void n(String str, C1577Mg1.b bVar) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            bVar.i(m(str.substring(iIndexOf + 1)));
            str = str.substring(0, iIndexOf);
        } else {
            bVar.i(Integer.MIN_VALUE);
        }
        bVar.h(AbstractC2015Qg1.b(str));
    }

    public static Layout.Alignment o(String str) {
        str.getClass();
        switch (str) {
            case "center":
            case "middle":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    public boolean h(C2584Vs0 c2584Vs0, C1577Mg1.b bVar, List list) {
        String strK = c2584Vs0.k();
        if (strK == null) {
            return false;
        }
        Pattern pattern = b;
        Matcher matcher = pattern.matcher(strK);
        if (matcher.matches()) {
            return i(null, matcher, c2584Vs0, bVar, this.a, list);
        }
        String strK2 = c2584Vs0.k();
        if (strK2 == null) {
            return false;
        }
        Matcher matcher2 = pattern.matcher(strK2);
        if (matcher2.matches()) {
            return i(strK.trim(), matcher2, c2584Vs0, bVar, this.a, list);
        }
        return false;
    }
}
