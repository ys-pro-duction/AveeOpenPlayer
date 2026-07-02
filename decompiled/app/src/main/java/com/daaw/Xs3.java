package com.daaw;

import j$.util.DesugarCollections;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Xs3 {
    public final String a;
    public final int b;
    public Boolean c;
    public Boolean d;
    public Long e;
    public Long f;

    public Xs3(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public static Boolean d(String str, int i, boolean z, String str2, List list, String str3, C6675mz2 c6675mz2) {
        if (i == 7) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && i != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i - 1) {
            case 1:
                if (str3 != null) {
                    try {
                    } catch (PatternSyntaxException unused) {
                        if (c6675mz2 != null) {
                            c6675mz2.t().b("Invalid regular expression in REGEXP audience filter. expression", str3);
                        }
                        return null;
                    }
                    break;
                }
                break;
            case 6:
                if (list != null) {
                    break;
                }
                break;
        }
        return null;
    }

    public static Boolean e(BigDecimal bigDecimal, C3583by2 c3583by2, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        AbstractC7506py0.l(c3583by2);
        if (c3583by2.H()) {
            if (c3583by2.M() != 1) {
                if (c3583by2.M() == 5) {
                    if (!c3583by2.L() || !c3583by2.K()) {
                        return null;
                    }
                } else if (!c3583by2.I()) {
                    return null;
                }
                int iM = c3583by2.M();
                if (c3583by2.M() == 5) {
                    if (Af3.P(c3583by2.F()) && Af3.P(c3583by2.E())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(c3583by2.F());
                            bigDecimal4 = new BigDecimal(c3583by2.E());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                }
                if (!Af3.P(c3583by2.D())) {
                    return null;
                }
                try {
                    bigDecimal2 = new BigDecimal(c3583by2.D());
                    bigDecimal3 = null;
                    bigDecimal4 = null;
                } catch (NumberFormatException unused2) {
                }
                if (iM == 5) {
                    if (bigDecimal3 == null) {
                        return null;
                    }
                } else if (bigDecimal2 == null) {
                    return null;
                }
                int i = iM - 1;
                if (i == 1) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                }
                if (i == 2) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                }
                if (i != 3) {
                    if (i == 4 && bigDecimal3 != null) {
                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) >= 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                    }
                    return null;
                }
                if (bigDecimal2 == null) {
                    return null;
                }
                if (d != 0.0d) {
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) > 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                }
                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
            }
        }
        return null;
    }

    public static Boolean f(String str, C5610jC2 c5610jC2, C6675mz2 c6675mz2) {
        List list;
        AbstractC7506py0.l(c5610jC2);
        if (str == null || !c5610jC2.J() || c5610jC2.K() == 1) {
            return null;
        }
        if (c5610jC2.K() == 7) {
            if (c5610jC2.B() == 0) {
                return null;
            }
        } else if (!c5610jC2.I()) {
            return null;
        }
        int iK = c5610jC2.K();
        boolean zG = c5610jC2.G();
        String strE = (zG || iK == 2 || iK == 7) ? c5610jC2.E() : c5610jC2.E().toUpperCase(Locale.ENGLISH);
        if (c5610jC2.B() == 0) {
            list = null;
        } else {
            List listF = c5610jC2.F();
            if (!zG) {
                ArrayList arrayList = new ArrayList(listF.size());
                Iterator it = listF.iterator();
                while (it.hasNext()) {
                    arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                }
                listF = DesugarCollections.unmodifiableList(arrayList);
            }
            list = listF;
        }
        return d(str, iK, zG, strE, list, iK == 2 ? strE : null, c6675mz2);
    }

    public static Boolean g(double d, C3583by2 c3583by2) {
        try {
            return e(new BigDecimal(d), c3583by2, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean h(long j, C3583by2 c3583by2) {
        try {
            return e(new BigDecimal(j), c3583by2, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean i(String str, C3583by2 c3583by2) {
        if (!Af3.P(str)) {
            return null;
        }
        try {
            return e(new BigDecimal(str), c3583by2, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean j(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    public abstract int a();

    public abstract boolean b();

    public abstract boolean c();
}
