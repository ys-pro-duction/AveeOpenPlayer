package com.daaw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Qr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2058Qr0 implements InterfaceC7927rV0 {
    public static final C8036rs[] a = {new C8036rs(new String[]{".plp"}, new String[]{"text/plain"}, new C0592Cw0[0], "Sansa Playlist File")};

    private void d(List list, AbstractC3868d0 abstractC3868d0) {
        if (abstractC3868d0 instanceof LP0) {
            LP0 lp0 = (LP0) abstractC3868d0;
            if (lp0.a() < 0) {
                throw new IllegalArgumentException("A PLP playlist cannot handle a sequence repeated indefinitely");
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
            str = "UTF-16LE";
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, str));
        C1932Pr0 c1932Pr0 = new C1932Pr0();
        c1932Pr0.e(this);
        String str2 = null;
        boolean z = false;
        boolean z2 = false;
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            String strTrim = line.trim();
            if (strTrim.length() > 0) {
                if (z) {
                    if (z2) {
                        int iIndexOf = strTrim.indexOf(44);
                        if (iIndexOf <= 0) {
                            interfaceC0412Bd0.h("Malformed PLP playlist (playlist entry line format)");
                            break;
                        }
                        String strTrim2 = strTrim.substring(0, iIndexOf).trim();
                        if (str2 != null) {
                            if (!str2.equals(strTrim2)) {
                                interfaceC0412Bd0.h("Malformed PLP playlist (inconsistent disk specifier)");
                                break;
                            }
                        } else {
                            str2 = strTrim2;
                        }
                        c1932Pr0.c().add(strTrim.substring(iIndexOf + 1).trim());
                    } else {
                        if (!"VERSION 1.20".equals(strTrim)) {
                            interfaceC0412Bd0.h("Malformed PLP playlist (no version information)");
                            break;
                        }
                        z2 = true;
                    }
                } else {
                    if (!"PLP PLAYLIST".equals(strTrim)) {
                        throw new IllegalArgumentException("Not a PLP playlist format");
                    }
                    z = true;
                }
            }
        }
        c1932Pr0 = null;
        if (c1932Pr0 != null && str2 != null) {
            c1932Pr0.d(str2);
        }
        return c1932Pr0;
    }

    @Override // com.daaw.InterfaceC7927rV0
    public C8036rs[] b() {
        return (C8036rs[]) a.clone();
    }

    @Override // com.daaw.InterfaceC7927rV0
    public InterfaceC7649qV0 c(C0809Ew0 c0809Ew0) {
        C1932Pr0 c1932Pr0 = new C1932Pr0();
        c1932Pr0.e(this);
        d(c1932Pr0.c(), c0809Ew0.a());
        return c1932Pr0;
    }

    @Override // com.daaw.InterfaceC7927rV0
    public String getId() {
        return "plp";
    }
}
