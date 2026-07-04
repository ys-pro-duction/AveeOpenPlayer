package com.daaw;

import android.os.Bundle;

/* JADX INFO: renamed from: com.daaw.vS1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9039vS1 {
    public static final Ub3 a = Ub3.F("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");
    public static final Rb3 b = Rb3.G("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");
    public static final Rb3 c = Rb3.F("auto", "app", "am");
    public static final Rb3 d = Rb3.E("_r", "_dbg");
    public static final Rb3 e;
    public static final Rb3 f;

    static {
        Ab3 ab3 = new Ab3();
        ab3.a(F83.a);
        ab3.a(F83.b);
        e = ab3.b();
        f = Rb3.E("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(java.lang.String r5, java.lang.String r6, android.os.Bundle r7) {
        /*
            java.lang.String r0 = "_cmp"
            boolean r6 = r0.equals(r6)
            r0 = 1
            if (r6 != 0) goto La
            return r0
        La:
            boolean r6 = d(r5)
            r1 = 0
            if (r6 != 0) goto L12
            return r1
        L12:
            if (r7 != 0) goto L15
            return r1
        L15:
            com.daaw.Rb3 r6 = com.daaw.AbstractC9039vS1.d
            int r2 = r6.size()
            r3 = 0
        L1c:
            if (r3 >= r2) goto L2d
            java.lang.Object r4 = r6.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r7.containsKey(r4)
            int r3 = r3 + 1
            if (r4 == 0) goto L1c
            return r1
        L2d:
            int r6 = r5.hashCode()
            r2 = 101200(0x18b50, float:1.41811E-40)
            r3 = 2
            if (r6 == r2) goto L56
            r2 = 101230(0x18b6e, float:1.41853E-40)
            if (r6 == r2) goto L4c
            r2 = 3142703(0x2ff42f, float:4.403865E-39)
            if (r6 == r2) goto L42
            goto L60
        L42:
            java.lang.String r6 = "fiam"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L60
            r5 = 2
            goto L61
        L4c:
            java.lang.String r6 = "fdl"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L60
            r5 = 1
            goto L61
        L56:
            java.lang.String r6 = "fcm"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L60
            r5 = 0
            goto L61
        L60:
            r5 = -1
        L61:
            java.lang.String r6 = "_cis"
            if (r5 == 0) goto L76
            if (r5 == r0) goto L70
            if (r5 == r3) goto L6a
            return r1
        L6a:
            java.lang.String r5 = "fiam_integration"
            r7.putString(r6, r5)
            return r0
        L70:
            java.lang.String r5 = "fdl_integration"
            r7.putString(r6, r5)
            return r0
        L76:
            java.lang.String r5 = "fcm_integration"
            r7.putString(r6, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC9039vS1.a(java.lang.String, java.lang.String, android.os.Bundle):boolean");
    }

    public static boolean b(String str, Bundle bundle) {
        if (b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        Rb3 rb3 = d;
        int size = rb3.size();
        int i = 0;
        while (i < size) {
            boolean zContainsKey = bundle.containsKey((String) rb3.get(i));
            i++;
            if (zContainsKey) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(String str) {
        return !a.contains(str);
    }

    public static boolean d(String str) {
        return !c.contains(str);
    }

    public static boolean e(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (e.contains(str2)) {
            return false;
        }
        Rb3 rb3 = f;
        int size = rb3.size();
        int i = 0;
        while (i < size) {
            boolean zMatches = str2.matches((String) rb3.get(i));
            i++;
            if (zMatches) {
                return false;
            }
        }
        return true;
    }
}
