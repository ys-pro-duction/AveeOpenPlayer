package com.daaw;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import java.util.Locale;

/* JADX INFO: renamed from: com.daaw.ky, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6110ky implements Y41 {
    public final Resources a;

    public C6110ky(Resources resources) {
        this.a = (Resources) AbstractC7115ob.e(resources);
    }

    public static int g(Format format) {
        int iG = AbstractC8834uk0.g(format.G);
        if (iG != -1) {
            return iG;
        }
        if (AbstractC8834uk0.j(format.D) != null) {
            return 2;
        }
        if (AbstractC8834uk0.a(format.D) != null) {
            return 1;
        }
        if (format.K == -1 && format.L == -1) {
            return (format.S == -1 && format.T == -1) ? -1 : 1;
        }
        return 2;
    }

    @Override // com.daaw.Y41
    public String a(Format format) {
        int iG = g(format);
        String strH = iG == 2 ? h(f(format), c(format)) : iG == 1 ? h(d(format), b(format), c(format)) : d(format);
        return strH.length() == 0 ? this.a.getString(KD0.k) : strH;
    }

    public final String b(Format format) {
        int i = format.S;
        return (i == -1 || i < 1) ? "" : i != 1 ? i != 2 ? (i == 6 || i == 7) ? this.a.getString(KD0.i) : i != 8 ? this.a.getString(KD0.h) : this.a.getString(KD0.j) : this.a.getString(KD0.g) : this.a.getString(KD0.c);
    }

    public final String c(Format format) {
        int i = format.C;
        return i == -1 ? "" : this.a.getString(KD0.b, Float.valueOf(i / 1000000.0f));
    }

    public final String d(Format format) {
        String str = format.Z;
        return (TextUtils.isEmpty(str) || "und".equals(str)) ? "" : e(str);
    }

    public final String e(String str) {
        return (AbstractC6280lb1.a >= 21 ? Locale.forLanguageTag(str) : new Locale(str)).getDisplayLanguage();
    }

    public final String f(Format format) {
        int i = format.K;
        int i2 = format.L;
        return (i == -1 || i2 == -1) ? "" : this.a.getString(KD0.d, Integer.valueOf(i), Integer.valueOf(i2));
    }

    public final String h(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : this.a.getString(KD0.a, string, str);
            }
        }
        return string;
    }
}
