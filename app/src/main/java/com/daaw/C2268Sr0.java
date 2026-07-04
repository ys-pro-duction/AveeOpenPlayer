package com.daaw;

import com.daaw.C0592Cw0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Sr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2268Sr0 implements InterfaceC7927rV0 {
    public static final C8036rs[] a = {new C8036rs(new String[]{".pls"}, new String[]{"audio/x-scpls"}, new C0592Cw0[]{new C0592Cw0(C0592Cw0.a.WINAMP, true, null), new C0592Cw0(C0592Cw0.a.VLC_MEDIA_PLAYER, false, null), new C0592Cw0(C0592Cw0.a.MEDIA_PLAYER_CLASSIC, true, null), new C0592Cw0(C0592Cw0.a.FOOBAR2000, false, null), new C0592Cw0(C0592Cw0.a.MPLAYER, true, null), new C0592Cw0(C0592Cw0.a.QUICKTIME, true, null), new C0592Cw0(C0592Cw0.a.ITUNES, true, null), new C0592Cw0(C0592Cw0.a.REALPLAYER, false, null)}, "Winamp PLSv2 Playlist")};

    private void d(List list, AbstractC3868d0 abstractC3868d0) {
        if (abstractC3868d0 instanceof LP0) {
            LP0 lp0 = (LP0) abstractC3868d0;
            if (lp0.a() < 0) {
                throw new IllegalArgumentException("A PLS playlist cannot handle a sequence repeated indefinitely");
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
        C2162Rr0 c2162Rr0 = new C2162Rr0();
        c2162Rr0.d(this);
        int i = -1;
        boolean z = false;
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            String strTrim = line.trim();
            if (strTrim.length() > 0) {
                if (z) {
                    int iIndexOf = strTrim.indexOf(61);
                    if (iIndexOf <= 0) {
                        interfaceC0412Bd0.h("Malformed PLS playlist");
                        break;
                    }
                    String lowerCase = strTrim.substring(0, iIndexOf).trim().toLowerCase();
                    String strTrim2 = strTrim.substring(iIndexOf + 1).trim();
                    if (!"numberofentries".equals(lowerCase)) {
                        if (!lowerCase.startsWith("file")) {
                            if (!lowerCase.startsWith("title")) {
                                if (!lowerCase.startsWith("length")) {
                                    if ("version".equals(lowerCase)) {
                                        if (!"2".equals(strTrim2)) {
                                            interfaceC0412Bd0.h("Unknown PLS version " + strTrim2);
                                            break;
                                        }
                                    } else {
                                        interfaceC0412Bd0.g("Unknown PLS keyword " + lowerCase);
                                    }
                                } else {
                                    try {
                                        int i2 = Integer.parseInt(lowerCase.substring(6));
                                        int i3 = i2 - 1;
                                        for (int size = c2162Rr0.c().size(); size < i2; size++) {
                                            c2162Rr0.c().add(new LI0());
                                        }
                                        try {
                                            ((LI0) c2162Rr0.c().get(i3)).d(Long.parseLong(strTrim2));
                                        } catch (NumberFormatException e) {
                                            interfaceC0412Bd0.h(e.toString());
                                        }
                                    } catch (NumberFormatException e2) {
                                        interfaceC0412Bd0.h(e2.toString());
                                    }
                                }
                            } else {
                                try {
                                    int i4 = Integer.parseInt(lowerCase.substring(5));
                                    int i5 = i4 - 1;
                                    for (int size2 = c2162Rr0.c().size(); size2 < i4; size2++) {
                                        c2162Rr0.c().add(new LI0());
                                    }
                                    ((LI0) c2162Rr0.c().get(i5)).f(strTrim2);
                                } catch (NumberFormatException e3) {
                                    interfaceC0412Bd0.h(e3.toString());
                                }
                            }
                        } else {
                            try {
                                int i6 = Integer.parseInt(lowerCase.substring(4));
                                int i7 = i6 - 1;
                                for (int size3 = c2162Rr0.c().size(); size3 < i6; size3++) {
                                    c2162Rr0.c().add(new LI0());
                                }
                                ((LI0) c2162Rr0.c().get(i7)).e(strTrim2);
                            } catch (NumberFormatException e4) {
                                interfaceC0412Bd0.h(e4.toString());
                            }
                        }
                    } else {
                        try {
                            int i8 = Integer.parseInt(strTrim2);
                            if (i8 < 0) {
                                interfaceC0412Bd0.g("Invalid NumberOfEntries in PLS playlist: " + i8);
                                break;
                            }
                            if (i >= 0 && i != i8) {
                                interfaceC0412Bd0.h("PLS playlist number of entries already specified with a different value");
                                break;
                            }
                            i = i8;
                        } catch (NumberFormatException e5) {
                            interfaceC0412Bd0.h(e5.toString());
                        }
                    }
                } else {
                    if (!strTrim.equalsIgnoreCase("[playlist]")) {
                        throw new IllegalArgumentException("Not a PLS playlist format");
                    }
                    z = true;
                }
            }
        }
        c2162Rr0 = null;
        if (c2162Rr0 != null) {
            if (i < 0) {
                interfaceC0412Bd0.g("No number of entries in PLS playlist");
            } else {
                int size4 = c2162Rr0.c().size() - i;
                if (size4 > 0) {
                    interfaceC0412Bd0.g("Ignoring " + size4 + " extra resources according to the specified number of entries " + i);
                }
                for (int i9 = 0; i9 < size4; i9++) {
                    c2162Rr0.c().remove(i);
                }
            }
        }
        return c2162Rr0;
    }

    @Override // com.daaw.InterfaceC7927rV0
    public C8036rs[] b() {
        return (C8036rs[]) a.clone();
    }

    @Override // com.daaw.InterfaceC7927rV0
    public InterfaceC7649qV0 c(C0809Ew0 c0809Ew0) {
        C2162Rr0 c2162Rr0 = new C2162Rr0();
        c2162Rr0.d(this);
        d(c2162Rr0.c(), c0809Ew0.a());
        return c2162Rr0;
    }

    @Override // com.daaw.InterfaceC7927rV0
    public String getId() {
        return "pls";
    }
}
