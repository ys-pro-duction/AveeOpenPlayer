package com.daaw;

/* JADX INFO: renamed from: com.daaw.Tm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2352Tm0 implements Comparable {
    public final String B;
    public final boolean C;

    public C2352Tm0(String str, boolean z) {
        if (str == null) {
            a(0);
        }
        this.B = str;
        this.C = z;
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 1 || i == 2 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4) ? 2 : 3];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i == 1) {
            objArr[1] = "asString";
        } else if (i == 2) {
            objArr[1] = "getIdentifier";
        } else if (i == 3 || i == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "identifierIfValid";
                break;
            case 8:
                objArr[2] = "special";
                break;
            case 9:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static C2352Tm0 k(String str) {
        if (str == null) {
            a(9);
        }
        return str.startsWith("<") ? o(str) : l(str);
    }

    public static C2352Tm0 l(String str) {
        if (str == null) {
            a(5);
        }
        return new C2352Tm0(str, false);
    }

    public static boolean n(String str) {
        if (str == null) {
            a(6);
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '.' || cCharAt == '/' || cCharAt == '\\') {
                return false;
            }
        }
        return true;
    }

    public static C2352Tm0 o(String str) {
        if (str == null) {
            a(8);
        }
        if (str.startsWith("<")) {
            return new C2352Tm0(str, true);
        }
        throw new IllegalArgumentException("special name must start with '<': " + str);
    }

    public String c() {
        String str = this.B;
        if (str == null) {
            a(1);
        }
        return str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2352Tm0)) {
            return false;
        }
        C2352Tm0 c2352Tm0 = (C2352Tm0) obj;
        return this.C == c2352Tm0.C && this.B.equals(c2352Tm0.B);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compareTo(C2352Tm0 c2352Tm0) {
        return this.B.compareTo(c2352Tm0.B);
    }

    public String h() {
        if (this.C) {
            throw new IllegalStateException("not identifier: " + this);
        }
        String strC = c();
        if (strC == null) {
            a(2);
        }
        return strC;
    }

    public int hashCode() {
        return (this.B.hashCode() * 31) + (this.C ? 1 : 0);
    }

    public boolean m() {
        return this.C;
    }

    public String toString() {
        return this.B;
    }
}
