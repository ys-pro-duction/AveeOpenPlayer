package com.daaw;

import android.text.Html;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.daaw.aZ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3183aZ0 extends US0 {
    public static final Pattern p = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))?\\s*");
    public final StringBuilder o;

    public C3183aZ0() {
        super("SubripDecoder");
        this.o = new StringBuilder();
    }

    public static long D(Matcher matcher, int i) {
        return ((Long.parseLong(matcher.group(i + 1)) * 3600000) + (Long.parseLong(matcher.group(i + 2)) * 60000) + (Long.parseLong(matcher.group(i + 3)) * 1000) + Long.parseLong(matcher.group(i + 4))) * 1000;
    }

    @Override // com.daaw.US0
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public C3462bZ0 z(byte[] bArr, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        C4043de0 c4043de0 = new C4043de0();
        C2584Vs0 c2584Vs0 = new C2584Vs0(bArr, i);
        while (true) {
            String strK = c2584Vs0.k();
            if (strK == null) {
                break;
            }
            if (strK.length() != 0) {
                try {
                    Integer.parseInt(strK);
                    String strK2 = c2584Vs0.k();
                    if (strK2 == null) {
                        break;
                    }
                    Matcher matcher = p.matcher(strK2);
                    if (matcher.matches()) {
                        boolean z2 = true;
                        c4043de0.a(D(matcher, 1));
                        if (TextUtils.isEmpty(matcher.group(6))) {
                            z2 = false;
                        } else {
                            c4043de0.a(D(matcher, 6));
                        }
                        this.o.setLength(0);
                        while (true) {
                            String strK3 = c2584Vs0.k();
                            if (TextUtils.isEmpty(strK3)) {
                                break;
                            }
                            if (this.o.length() > 0) {
                                this.o.append("<br>");
                            }
                            this.o.append(strK3.trim());
                        }
                        arrayList.add(new C1631Mu(Html.fromHtml(this.o.toString())));
                        if (z2) {
                            arrayList.add(null);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        C1631Mu[] c1631MuArr = new C1631Mu[arrayList.size()];
        arrayList.toArray(c1631MuArr);
        return new C3462bZ0(c1631MuArr, c4043de0.d());
    }
}
