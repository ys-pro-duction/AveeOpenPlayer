package com.daaw;

import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.daaw.lK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6209lK {
    public static final char[] b = {'/', '-', ','};
    public static final Pattern c = Pattern.compile("[0-9]L", 2);
    public static final Pattern d = Pattern.compile("[0-9]W", 2);
    public final UJ a;

    public C6209lK(UJ uj) {
        this.a = (UJ) AbstractC6948ny0.c(uj, "FieldConstraints must not be null");
    }

    public final AbstractC3958dK a(String str, String str2) {
        String strTrim = str.trim();
        return ("*".equals(strTrim) && str2.equals("1")) ? g(str) : ("*".equals(strTrim) || "".equals(str.trim())) ? new C5631jI(new M00(Integer.parseInt(str2))) : new C5631jI(new C2676Wp0(f(str)), new M00(Integer.parseInt(str2)));
    }

    public final AbstractC3958dK b(String[] strArr) {
        C5013h4 c5013h4 = new C5013h4();
        for (String str : strArr) {
            c5013h4.e(h(str));
        }
        return c5013h4;
    }

    public final AbstractC3958dK c(String str, String[] strArr) {
        return strArr.length > 1 ? i(strArr) : q(str, str.split("/"));
    }

    public int d(Integer num) {
        Integer numB = this.a.b(num);
        return numB != null ? numB.intValue() : num.intValue();
    }

    public AbstractC9005vK e(String str) {
        for (EnumC5128hV0 enumC5128hV0 : EnumC5128hV0.values()) {
            if (enumC5128hV0.toString().equals(str)) {
                return new C5407iV0(enumC5128hV0);
            }
        }
        return new M00(r(str));
    }

    public M00 f(String str) {
        try {
            return new M00(d(Integer.valueOf(r(str))));
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(String.format("Invalid value. Expected some integer, found %s", str));
        }
    }

    public final AbstractC3958dK g(String str) {
        return "*".equals(str) ? AbstractC3958dK.b() : "?".equals(str) ? AbstractC3958dK.d() : j(str);
    }

    public AbstractC3958dK h(String str) {
        if (!AbstractC6266lY0.a(str, b)) {
            if (!str.contains("?") || this.a.c().contains(EnumC5128hV0.QUESTION_MARK)) {
                return g(str);
            }
            throw new IllegalArgumentException("Invalid expression: " + str);
        }
        String[] strArrSplit = str.split(",");
        if (strArrSplit.length > 1) {
            return b(strArrSplit);
        }
        String[] strArrSplit2 = str.split("-");
        if (!str.contains("-") || strArrSplit2.length == 2) {
            return strArrSplit2[0].equalsIgnoreCase("L") ? m(strArrSplit2[0], f(strArrSplit2[1])) : c(str, strArrSplit2);
        }
        throw new IllegalArgumentException("Missing values for range: " + str);
    }

    public AbstractC3958dK i(String[] strArr) {
        if (strArr[0].isEmpty() || strArr[1].isEmpty()) {
            throw new IllegalArgumentException(String.format("Invalid expression! Expression: %s-%s does not describe a range. Negative numbers are not allowed.", strArr[0], strArr[1]));
        }
        if (!strArr[1].contains("/")) {
            return new C4325ef(e(strArr[0]), e(strArr[1]));
        }
        String[] strArrSplit = strArr[1].split("/");
        return new C5631jI(new C4325ef(e(strArr[0]), e(strArrSplit[0])), f(strArrSplit[1]));
    }

    public C2676Wp0 j(String str) {
        return "?".equals(str) ? o(str) : str.contains("#") ? k(str) : str.contains("LW") ? n(str) : (c.matcher(str).find() || str.equalsIgnoreCase("L")) ? l(str) : d.matcher(str).find() ? p(str) : new C2676Wp0(f(str), new C5407iV0(EnumC5128hV0.NONE), new M00(-1));
    }

    public C2676Wp0 k(String str) {
        Set setC = this.a.c();
        EnumC5128hV0 enumC5128hV0 = EnumC5128hV0.HASH;
        if (!setC.contains(enumC5128hV0)) {
            throw new IllegalArgumentException("Invalid expression: " + str);
        }
        C5407iV0 c5407iV0 = new C5407iV0(enumC5128hV0);
        String[] strArrSplit = str.split("#");
        if (strArrSplit.length == 0) {
            throw new IllegalArgumentException("Invalid Position of # Character!");
        }
        M00 m00F = f(strArrSplit[1]);
        if (strArrSplit[0].isEmpty()) {
            throw new IllegalArgumentException("Time should be specified!");
        }
        return new C2676Wp0(f(strArrSplit[0]), c5407iV0, m00F);
    }

    public C2676Wp0 l(String str) {
        return m(str, new M00(-1));
    }

    public C2676Wp0 m(String str, M00 m00) {
        C5407iV0 c5407iV0 = new C5407iV0(EnumC5128hV0.L);
        String strReplace = str.replace("L", "");
        M00 m002 = new M00(-1);
        if (!"".equals(strReplace)) {
            m002 = f(strReplace);
        }
        return new C2676Wp0(m002, c5407iV0, m00);
    }

    public C2676Wp0 n(String str) {
        C5407iV0 c5407iV0 = new C5407iV0(EnumC5128hV0.LW);
        String strReplace = str.replace("LW", "");
        if ("".equals(strReplace)) {
            return new C2676Wp0(new M00(-1), c5407iV0, new M00(-1));
        }
        throw new IllegalArgumentException(String.format("Expected: LW, found: %s", strReplace));
    }

    public C2676Wp0 o(String str) {
        C5407iV0 c5407iV0 = new C5407iV0(EnumC5128hV0.QUESTION_MARK);
        String strReplace = str.replace("?", "");
        if ("".equals(strReplace)) {
            return new C2676Wp0(new M00(-1), c5407iV0, new M00(-1));
        }
        throw new IllegalArgumentException(String.format("Expected: '?', found: %s", strReplace));
    }

    public C2676Wp0 p(String str) {
        return new C2676Wp0(f(str.replace("W", "")), new C5407iV0(EnumC5128hV0.W), new M00(-1));
    }

    public final AbstractC3958dK q(String str, String[] strArr) {
        if (strArr.length == 2) {
            return a(strArr[0], strArr[1]);
        }
        if (strArr.length == 1) {
            throw new IllegalArgumentException("Missing steps for expression: " + str);
        }
        throw new IllegalArgumentException("Invalid expression: " + str);
    }

    public int r(String str) {
        Integer numF = this.a.f(str);
        if (numF != null) {
            return numF.intValue();
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(String.format("Invalid chars in expression! Expression: %s Invalid chars: %s", str, new C6824nY0(this.a).d(str)));
        }
    }
}
