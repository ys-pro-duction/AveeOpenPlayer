package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public class Y40 {
    public final String a;
    public AP b;

    public Y40(String str) {
        if (str == null) {
            a(7);
        }
        this.a = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(int r9) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.Y40.a(int):void");
    }

    public static Y40 b(C6607ml c6607ml) {
        if (c6607ml == null) {
            a(1);
        }
        return new Y40(h(c6607ml));
    }

    public static Y40 c(AP ap) {
        if (ap == null) {
            a(4);
        }
        Y40 y40 = new Y40(ap.b().replace('.', '/'));
        y40.b = ap;
        return y40;
    }

    public static Y40 d(String str) {
        if (str == null) {
            a(0);
        }
        return new Y40(str);
    }

    public static String h(C6607ml c6607ml) {
        if (c6607ml == null) {
            a(2);
        }
        AP apF = c6607ml.f();
        String strReplace = c6607ml.g().b().replace('.', '$');
        if (!apF.d()) {
            strReplace = apF.b().replace('.', '/') + "/" + strReplace;
        }
        if (strReplace == null) {
            a(3);
        }
        return strReplace;
    }

    public AP e() {
        return new AP(this.a.replace('/', '.'));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((Y40) obj).a);
    }

    public String f() {
        String str = this.a;
        if (str == null) {
            a(10);
        }
        return str;
    }

    public AP g() {
        int iLastIndexOf = this.a.lastIndexOf("/");
        if (iLastIndexOf != -1) {
            return new AP(this.a.substring(0, iLastIndexOf).replace('/', '.'));
        }
        AP ap = AP.c;
        if (ap == null) {
            a(9);
        }
        return ap;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a;
    }
}
