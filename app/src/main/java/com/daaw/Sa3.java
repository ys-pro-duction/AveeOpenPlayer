package com.daaw;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class Sa3 extends AbstractC4004dV1 {
    public static final InterfaceC9666xh3 Q = new InterfaceC9666xh3() { // from class: com.daaw.Pa3
    };
    public static final String R = Integer.toString(1001, 36);
    public static final String S = Integer.toString(1002, 36);
    public static final String T = Integer.toString(1003, 36);
    public static final String U = Integer.toString(1004, 36);
    public static final String V = Integer.toString(1005, 36);
    public static final String W = Integer.toString(1006, 36);
    public final int J;
    public final String K;
    public final int L;
    public final C2485Ut1 M;
    public final int N;
    public final Vp3 O;
    public final boolean P;

    public Sa3(int i, Throwable th, int i2) {
        this(i, th, null, i2, null, -1, null, 4, false);
    }

    public static Sa3 b(Throwable th, String str, int i, C2485Ut1 c2485Ut1, int i2, boolean z, int i3) {
        return new Sa3(1, th, null, i3, str, i, c2485Ut1, c2485Ut1 == null ? 4 : i2, z);
    }

    public static Sa3 c(IOException iOException, int i) {
        return new Sa3(0, iOException, i);
    }

    public static Sa3 d(RuntimeException runtimeException, int i) {
        return new Sa3(2, runtimeException, i);
    }

    public final Sa3 a(Vp3 vp3) {
        String message = getMessage();
        int i = AbstractC9004vJ2.a;
        return new Sa3(message, getCause(), this.B, this.J, this.K, this.L, this.M, this.N, vp3, this.C, this.P);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Sa3(int i, Throwable th, String str, int i2, String str2, int i3, C2485Ut1 c2485Ut1, int i4, boolean z) {
        String str3;
        int i5;
        String string;
        String str4;
        if (i == 0) {
            str3 = str2;
            i5 = i3;
            string = "Source error";
        } else if (i != 1) {
            string = "Unexpected runtime error";
            str3 = str2;
            i5 = i3;
        } else {
            String strValueOf = String.valueOf(c2485Ut1);
            int i6 = AbstractC9004vJ2.a;
            if (i4 == 0) {
                str4 = "NO";
            } else if (i4 == 1) {
                str4 = "NO_UNSUPPORTED_TYPE";
            } else if (i4 == 2) {
                str4 = "NO_UNSUPPORTED_DRM";
            } else if (i4 == 3) {
                str4 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i4 != 4) {
                    throw new IllegalStateException();
                }
                str4 = "YES";
            }
            StringBuilder sb = new StringBuilder();
            str3 = str2;
            sb.append(str3);
            sb.append(" error, index=");
            i5 = i3;
            sb.append(i5);
            sb.append(", format=");
            sb.append(strValueOf);
            sb.append(", format_supported=");
            sb.append(str4);
            string = sb.toString();
        }
        this(TextUtils.isEmpty(null) ? string : string.concat(": null"), th, i2, i, str3, i5, c2485Ut1, i4, null, SystemClock.elapsedRealtime(), z);
    }

    public Sa3(String str, Throwable th, int i, int i2, String str2, int i3, C2485Ut1 c2485Ut1, int i4, Vp3 vp3, long j, boolean z) {
        boolean z2;
        super(str, th, i, j);
        if (!z) {
            z2 = true;
        } else if (i2 == 1) {
            i2 = 1;
            z2 = true;
        } else {
            z2 = false;
        }
        AbstractC6048km2.d(z2);
        AbstractC6048km2.d(th != null);
        this.J = i2;
        this.K = str2;
        this.L = i3;
        this.M = c2485Ut1;
        this.N = i4;
        this.O = vp3;
        this.P = z;
    }
}
