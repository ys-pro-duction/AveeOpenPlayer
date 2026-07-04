package com.daaw;

import android.text.TextUtils;
import com.revenuecat.purchases.common.Constants;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.daaw.Ju, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1320Ju {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public final C2584Vs0 a = new C2584Vs0();
    public final StringBuilder b = new StringBuilder();

    public static boolean b(C2584Vs0 c2584Vs0) {
        int iC = c2584Vs0.c();
        int iD = c2584Vs0.d();
        byte[] bArr = c2584Vs0.a;
        if (iC + 2 > iD) {
            return false;
        }
        int i = iC + 1;
        if (bArr[iC] != 47) {
            return false;
        }
        int i2 = iC + 2;
        if (bArr[i] != 42) {
            return false;
        }
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= iD) {
                c2584Vs0.K(iD - c2584Vs0.c());
                return true;
            }
            if (((char) bArr[i2]) == '*' && ((char) bArr[i3]) == '/') {
                i2 += 2;
                iD = i2;
            } else {
                i2 = i3;
            }
        }
    }

    public static boolean c(C2584Vs0 c2584Vs0) {
        char cJ = j(c2584Vs0, c2584Vs0.c());
        if (cJ != '\t' && cJ != '\n' && cJ != '\f' && cJ != '\r' && cJ != ' ') {
            return false;
        }
        c2584Vs0.K(1);
        return true;
    }

    public static String e(C2584Vs0 c2584Vs0, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int iC = c2584Vs0.c();
        int iD = c2584Vs0.d();
        while (iC < iD && !z) {
            char c2 = (char) c2584Vs0.a[iC];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                iC++;
                sb.append(c2);
            }
        }
        c2584Vs0.K(iC - c2584Vs0.c());
        return sb.toString();
    }

    public static String f(C2584Vs0 c2584Vs0, StringBuilder sb) {
        m(c2584Vs0);
        if (c2584Vs0.a() == 0) {
            return null;
        }
        String strE = e(c2584Vs0, sb);
        if (!"".equals(strE)) {
            return strE;
        }
        return "" + ((char) c2584Vs0.x());
    }

    public static String g(C2584Vs0 c2584Vs0, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        while (!z) {
            int iC = c2584Vs0.c();
            String strF = f(c2584Vs0, sb);
            if (strF == null) {
                return null;
            }
            if ("}".equals(strF) || ";".equals(strF)) {
                c2584Vs0.J(iC);
                z = true;
            } else {
                sb2.append(strF);
            }
        }
        return sb2.toString();
    }

    public static String h(C2584Vs0 c2584Vs0, StringBuilder sb) {
        m(c2584Vs0);
        if (c2584Vs0.a() < 5 || !"::cue".equals(c2584Vs0.u(5))) {
            return null;
        }
        int iC = c2584Vs0.c();
        String strF = f(c2584Vs0, sb);
        if (strF == null) {
            return null;
        }
        if ("{".equals(strF)) {
            c2584Vs0.J(iC);
            return "";
        }
        String strK = "(".equals(strF) ? k(c2584Vs0) : null;
        String strF2 = f(c2584Vs0, sb);
        if (!")".equals(strF2) || strF2 == null) {
            return null;
        }
        return strK;
    }

    public static void i(C2584Vs0 c2584Vs0, C1474Lg1 c1474Lg1, StringBuilder sb) {
        m(c2584Vs0);
        String strE = e(c2584Vs0, sb);
        if (!"".equals(strE) && Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR.equals(f(c2584Vs0, sb))) {
            m(c2584Vs0);
            String strG = g(c2584Vs0, sb);
            if (strG == null || "".equals(strG)) {
                return;
            }
            int iC = c2584Vs0.c();
            String strF = f(c2584Vs0, sb);
            if (!";".equals(strF)) {
                if (!"}".equals(strF)) {
                    return;
                } else {
                    c2584Vs0.J(iC);
                }
            }
            if ("color".equals(strE)) {
                c1474Lg1.p(AbstractC4087dn.c(strG));
                return;
            }
            if ("background-color".equals(strE)) {
                c1474Lg1.n(AbstractC4087dn.c(strG));
                return;
            }
            if ("text-decoration".equals(strE)) {
                if ("underline".equals(strG)) {
                    c1474Lg1.w(true);
                }
            } else {
                if ("font-family".equals(strE)) {
                    c1474Lg1.q(strG);
                    return;
                }
                if ("font-weight".equals(strE)) {
                    if ("bold".equals(strG)) {
                        c1474Lg1.o(true);
                    }
                } else if ("font-style".equals(strE) && "italic".equals(strG)) {
                    c1474Lg1.r(true);
                }
            }
        }
    }

    public static char j(C2584Vs0 c2584Vs0, int i) {
        return (char) c2584Vs0.a[i];
    }

    public static String k(C2584Vs0 c2584Vs0) {
        int iC = c2584Vs0.c();
        int iD = c2584Vs0.d();
        boolean z = false;
        while (iC < iD && !z) {
            int i = iC + 1;
            z = ((char) c2584Vs0.a[iC]) == ')';
            iC = i;
        }
        return c2584Vs0.u((iC - 1) - c2584Vs0.c()).trim();
    }

    public static void l(C2584Vs0 c2584Vs0) {
        while (!TextUtils.isEmpty(c2584Vs0.k())) {
        }
    }

    public static void m(C2584Vs0 c2584Vs0) {
        while (true) {
            for (boolean z = true; c2584Vs0.a() > 0 && z; z = false) {
                if (c(c2584Vs0) || b(c2584Vs0)) {
                    break;
                }
            }
            return;
        }
    }

    public final void a(C1474Lg1 c1474Lg1, String str) {
        if ("".equals(str)) {
            return;
        }
        int iIndexOf = str.indexOf(91);
        if (iIndexOf != -1) {
            Matcher matcher = c.matcher(str.substring(iIndexOf));
            if (matcher.matches()) {
                c1474Lg1.v(matcher.group(1));
            }
            str = str.substring(0, iIndexOf);
        }
        String[] strArrW = AbstractC6280lb1.W(str, "\\.");
        String str2 = strArrW[0];
        int iIndexOf2 = str2.indexOf(35);
        if (iIndexOf2 != -1) {
            c1474Lg1.u(str2.substring(0, iIndexOf2));
            c1474Lg1.t(str2.substring(iIndexOf2 + 1));
        } else {
            c1474Lg1.u(str2);
        }
        if (strArrW.length > 1) {
            c1474Lg1.s((String[]) Arrays.copyOfRange(strArrW, 1, strArrW.length));
        }
    }

    public C1474Lg1 d(C2584Vs0 c2584Vs0) {
        this.b.setLength(0);
        int iC = c2584Vs0.c();
        l(c2584Vs0);
        this.a.H(c2584Vs0.a, c2584Vs0.c());
        this.a.J(iC);
        String strH = h(this.a, this.b);
        if (strH != null && "{".equals(f(this.a, this.b))) {
            C1474Lg1 c1474Lg1 = new C1474Lg1();
            a(c1474Lg1, strH);
            String strF = null;
            boolean z = false;
            while (!z) {
                int iC2 = this.a.c();
                strF = f(this.a, this.b);
                boolean z2 = strF == null || "}".equals(strF);
                if (!z2) {
                    this.a.J(iC2);
                    i(this.a, c1474Lg1, this.b);
                }
                z = z2;
            }
            if ("}".equals(strF)) {
                return c1474Lg1;
            }
        }
        return null;
    }
}
