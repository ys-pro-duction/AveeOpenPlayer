package com.daaw;

import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class BP {
    public static final C2352Tm0 e = C2352Tm0.o("<root>");
    public static final Pattern f = Pattern.compile("\\.");
    public static final NQ g = new a();
    public final String a;
    public transient AP b;
    public transient BP c;
    public transient C2352Tm0 d;

    public static class a implements NQ {
        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2352Tm0 invoke(String str) {
            return C2352Tm0.k(str);
        }
    }

    public BP(String str, AP ap) {
        if (str == null) {
            a(0);
        }
        if (ap == null) {
            a(1);
        }
        this.a = str;
        this.b = ap;
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 15:
            case 16:
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                i2 = 2;
                break;
            case 9:
            case 15:
            case 16:
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        if (i != 1) {
            switch (i) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case 15:
                    objArr[0] = "segment";
                    break;
                case 16:
                    objArr[0] = "other";
                    break;
                case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case 9:
            case 15:
            case 16:
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
            case 10:
            case 11:
                objArr[1] = "shortName";
                break;
            case 12:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                objArr[1] = "toString";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case 15:
            case 16:
                objArr[2] = "startsWith";
                break;
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                throw new IllegalStateException(str2);
            case 9:
            case 15:
            case 16:
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static BP m(C2352Tm0 c2352Tm0) {
        if (c2352Tm0 == null) {
            a(17);
        }
        return new BP(c2352Tm0.c(), AP.c.j(), c2352Tm0);
    }

    public String b() {
        String str = this.a;
        if (str == null) {
            a(4);
        }
        return str;
    }

    public BP c(C2352Tm0 c2352Tm0) {
        String strC;
        if (c2352Tm0 == null) {
            a(9);
        }
        if (e()) {
            strC = c2352Tm0.c();
        } else {
            strC = this.a + "." + c2352Tm0.c();
        }
        return new BP(strC, this, c2352Tm0);
    }

    public final void d() {
        int iLastIndexOf = this.a.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            this.d = C2352Tm0.k(this.a.substring(iLastIndexOf + 1));
            this.c = new BP(this.a.substring(0, iLastIndexOf));
        } else {
            this.d = C2352Tm0.k(this.a);
            this.c = AP.c.j();
        }
    }

    public boolean e() {
        return this.a.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BP) && this.a.equals(((BP) obj).a);
    }

    public boolean f() {
        return this.b != null || b().indexOf(60) < 0;
    }

    public BP g() {
        BP bp = this.c;
        if (bp != null) {
            if (bp == null) {
                a(7);
            }
            return bp;
        }
        if (e()) {
            throw new IllegalStateException("root");
        }
        d();
        BP bp2 = this.c;
        if (bp2 == null) {
            a(8);
        }
        return bp2;
    }

    public List h() {
        List listT = e() ? Collections.EMPTY_LIST : AbstractC5431ib.T(f.split(this.a), g);
        if (listT == null) {
            a(14);
        }
        return listT;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public C2352Tm0 i() {
        C2352Tm0 c2352Tm0 = this.d;
        if (c2352Tm0 != null) {
            if (c2352Tm0 == null) {
                a(10);
            }
            return c2352Tm0;
        }
        if (e()) {
            throw new IllegalStateException("root");
        }
        d();
        C2352Tm0 c2352Tm02 = this.d;
        if (c2352Tm02 == null) {
            a(11);
        }
        return c2352Tm02;
    }

    public C2352Tm0 j() {
        if (e()) {
            C2352Tm0 c2352Tm0 = e;
            if (c2352Tm0 == null) {
                a(12);
            }
            return c2352Tm0;
        }
        C2352Tm0 c2352Tm0I = i();
        if (c2352Tm0I == null) {
            a(13);
        }
        return c2352Tm0I;
    }

    public boolean k(C2352Tm0 c2352Tm0) {
        if (c2352Tm0 == null) {
            a(15);
        }
        if (e()) {
            return false;
        }
        int iIndexOf = this.a.indexOf(46);
        if (iIndexOf == -1) {
            iIndexOf = this.a.length();
        }
        String strC = c2352Tm0.c();
        return iIndexOf == strC.length() && this.a.regionMatches(0, strC, 0, iIndexOf);
    }

    public AP l() {
        AP ap = this.b;
        if (ap != null) {
            if (ap == null) {
                a(5);
            }
            return ap;
        }
        AP ap2 = new AP(this);
        this.b = ap2;
        return ap2;
    }

    public String toString() {
        String strC = e() ? e.c() : this.a;
        if (strC == null) {
            a(18);
        }
        return strC;
    }

    public BP(String str) {
        if (str == null) {
            a(2);
        }
        this.a = str;
    }

    public BP(String str, BP bp, C2352Tm0 c2352Tm0) {
        if (str == null) {
            a(3);
        }
        this.a = str;
        this.c = bp;
        this.d = c2352Tm0;
    }
}
