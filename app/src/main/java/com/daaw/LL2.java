package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class LL2 {
    public final File a;
    public final File b;
    public final SharedPreferences c;
    public final int d;

    public LL2(Context context, int i) {
        this.c = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        ML2.a(dir, false);
        this.a = dir;
        File dir2 = context.getDir("tmppccache", 0);
        ML2.a(dir2, true);
        this.b = dir2;
        this.d = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(com.daaw.C5269hz1 r8, com.daaw.PL2 r9) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.LL2.a(com.daaw.hz1, com.daaw.PL2):boolean");
    }

    public final C6116kz1 b(int i) {
        String string = i == 1 ? this.c.getString(f(), null) : this.c.getString(e(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] bArrC = RV.c(string);
            AbstractC9213w33 abstractC9213w33 = AbstractC9213w33.C;
            C6116kz1 c6116kz1S = C6116kz1.S(AbstractC9213w33.T(bArrC, 0, bArrC.length));
            String strV = c6116kz1S.V();
            File fileB = ML2.b(strV, "pcam.jar", d());
            if (!fileB.exists()) {
                fileB = ML2.b(strV, "pcam", d());
            }
            File fileB2 = ML2.b(strV, "pcbc", d());
            if (fileB.exists()) {
                if (fileB2.exists()) {
                    return c6116kz1S;
                }
            }
        } catch (C8939v43 unused) {
        }
        return null;
    }

    public final KL2 c(int i) {
        C6116kz1 c6116kz1B = b(1);
        if (c6116kz1B == null) {
            return null;
        }
        String strV = c6116kz1B.V();
        File fileB = ML2.b(strV, "pcam.jar", d());
        if (!fileB.exists()) {
            fileB = ML2.b(strV, "pcam", d());
        }
        return new KL2(c6116kz1B, fileB, ML2.b(strV, "pcbc", d()), ML2.b(strV, "pcopt", d()));
    }

    public final File d() {
        File file = new File(this.a, Integer.toString(this.d - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public final String e() {
        StringBuilder sb = new StringBuilder();
        sb.append("FBAMTD");
        sb.append(this.d - 1);
        return sb.toString();
    }

    public final String f() {
        StringBuilder sb = new StringBuilder();
        sb.append("LATMTD");
        sb.append(this.d - 1);
        return sb.toString();
    }
}
