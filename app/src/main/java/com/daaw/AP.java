package com.daaw;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class AP {
    public static final AP c = new AP("");
    public final BP a;
    public transient AP b;

    public AP(String str) {
        if (str == null) {
            a(1);
        }
        this.a = new BP(str, this);
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 8:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                i2 = 2;
                break;
            case 8:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "fqName";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 12:
                objArr[0] = "segment";
                break;
            case 13:
                objArr[0] = "other";
                break;
            case 14:
                objArr[0] = "shortName";
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
                objArr[1] = "toUnsafe";
                break;
            case 6:
            case 7:
                objArr[1] = "parent";
                break;
            case 8:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 9:
                objArr[1] = "shortName";
                break;
            case 10:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 11:
                objArr[1] = "pathSegments";
                break;
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[2] = "<init>";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                break;
            case 8:
                objArr[2] = "child";
                break;
            case 12:
            case 13:
                objArr[2] = "startsWith";
                break;
            case 14:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "fromSegments";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(str2);
            case 8:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static AP k(C2352Tm0 c2352Tm0) {
        if (c2352Tm0 == null) {
            a(14);
        }
        return new AP(BP.m(c2352Tm0));
    }

    public String b() {
        String strB = this.a.b();
        if (strB == null) {
            a(4);
        }
        return strB;
    }

    public AP c(C2352Tm0 c2352Tm0) {
        if (c2352Tm0 == null) {
            a(8);
        }
        return new AP(this.a.c(c2352Tm0), this);
    }

    public boolean d() {
        return this.a.e();
    }

    public AP e() {
        AP ap = this.b;
        if (ap != null) {
            if (ap == null) {
                a(6);
            }
            return ap;
        }
        if (d()) {
            throw new IllegalStateException("root");
        }
        AP ap2 = new AP(this.a.g());
        this.b = ap2;
        return ap2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AP) && this.a.equals(((AP) obj).a);
    }

    public List f() {
        List listH = this.a.h();
        if (listH == null) {
            a(11);
        }
        return listH;
    }

    public C2352Tm0 g() {
        C2352Tm0 c2352Tm0I = this.a.i();
        if (c2352Tm0I == null) {
            a(9);
        }
        return c2352Tm0I;
    }

    public C2352Tm0 h() {
        C2352Tm0 c2352Tm0J = this.a.j();
        if (c2352Tm0J == null) {
            a(10);
        }
        return c2352Tm0J;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean i(C2352Tm0 c2352Tm0) {
        if (c2352Tm0 == null) {
            a(12);
        }
        return this.a.k(c2352Tm0);
    }

    public BP j() {
        BP bp = this.a;
        if (bp == null) {
            a(5);
        }
        return bp;
    }

    public String toString() {
        return this.a.toString();
    }

    public AP(BP bp) {
        if (bp == null) {
            a(2);
        }
        this.a = bp;
    }

    public AP(BP bp, AP ap) {
        if (bp == null) {
            a(3);
        }
        this.a = bp;
        this.b = ap;
    }
}
