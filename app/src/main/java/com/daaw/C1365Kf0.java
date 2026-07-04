package com.daaw;

import com.daaw.C0592Cw0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Kf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1365Kf0 implements InterfaceC7927rV0 {
    public static final C8036rs[] a = {new C8036rs(new String[]{".mpcpl"}, new String[]{"text/plain"}, new C0592Cw0[]{new C0592Cw0(C0592Cw0.a.MEDIA_PLAYER_CLASSIC, true, null)}, "Media Player Classic Playlist")};

    private void d(List list, AbstractC3868d0 abstractC3868d0) {
        if (abstractC3868d0 instanceof LP0) {
            LP0 lp0 = (LP0) abstractC3868d0;
            if (lp0.a() < 0) {
                throw new IllegalArgumentException("A MPCPL playlist cannot handle a sequence repeated indefinitely");
            }
            AbstractC3868d0[] abstractC3868d0ArrB = lp0.b();
            for (int i = 0; i < lp0.a(); i++) {
                for (AbstractC3868d0 abstractC3868d02 : abstractC3868d0ArrB) {
                    d(list, abstractC3868d02);
                }
            }
        }
    }

    @Override // com.daaw.InterfaceC7927rV0
    public InterfaceC7649qV0 a(InputStream inputStream, String str, InterfaceC0412Bd0 interfaceC0412Bd0) throws IOException {
        if (str == null) {
            str = "UTF-8";
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, str));
        C1261Jf0 c1261Jf0 = new C1261Jf0();
        c1261Jf0.d(this);
        boolean z = false;
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return c1261Jf0;
            }
            String strTrim = line.trim();
            if (strTrim.length() > 0) {
                if (z) {
                    int iIndexOf = strTrim.indexOf(44);
                    if (iIndexOf <= 0) {
                        interfaceC0412Bd0.h("Malformed MPCPL playlist entry " + strTrim);
                        return null;
                    }
                    String strTrim2 = strTrim.substring(0, iIndexOf).trim();
                    String strSubstring = strTrim.substring(iIndexOf + 1);
                    int iIndexOf2 = strSubstring.indexOf(44);
                    if (iIndexOf2 <= 0) {
                        interfaceC0412Bd0.h("Malformed MPCPL playlist entry " + strSubstring);
                        return null;
                    }
                    String lowerCase = strSubstring.substring(0, iIndexOf2).trim().toLowerCase();
                    String strTrim3 = strSubstring.substring(iIndexOf2 + 1).trim();
                    try {
                        int i = Integer.parseInt(strTrim2);
                        int i2 = i - 1;
                        for (int size = c1261Jf0.c().size(); size < i; size++) {
                            c1261Jf0.c().add(new JI0());
                        }
                        JI0 ji0 = (JI0) c1261Jf0.c().get(i2);
                        if ("filename".equals(lowerCase)) {
                            ji0.d(strTrim3);
                        } else if ("type".equals(lowerCase)) {
                            ji0.f(strTrim3);
                        } else if ("subtitle".equals(lowerCase)) {
                            ji0.e(strTrim3);
                        } else {
                            interfaceC0412Bd0.g("Unknown MPCPL keyword " + lowerCase);
                        }
                    } catch (NumberFormatException e) {
                        interfaceC0412Bd0.h(e.toString());
                        return null;
                    }
                } else {
                    if (!strTrim.equalsIgnoreCase("MPCPLAYLIST")) {
                        throw new IllegalArgumentException("Not a MPCPL playlist format");
                    }
                    z = true;
                }
            }
        }
    }

    @Override // com.daaw.InterfaceC7927rV0
    public C8036rs[] b() {
        return (C8036rs[]) a.clone();
    }

    @Override // com.daaw.InterfaceC7927rV0
    public InterfaceC7649qV0 c(C0809Ew0 c0809Ew0) {
        C1261Jf0 c1261Jf0 = new C1261Jf0();
        c1261Jf0.d(this);
        d(c1261Jf0.c(), c0809Ew0.a());
        return c1261Jf0;
    }

    @Override // com.daaw.InterfaceC7927rV0
    public String getId() {
        return "mpcpl";
    }
}
