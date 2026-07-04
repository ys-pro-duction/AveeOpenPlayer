package com.daaw;

import com.daaw.C0592Cw0;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Hf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1053Hf0 implements InterfaceC7927rV0 {
    public static final C8036rs[] a;

    static {
        C0592Cw0.a aVar = C0592Cw0.a.WINAMP;
        C0592Cw0 c0592Cw0 = new C0592Cw0(aVar, true, null);
        C0592Cw0 c0592Cw02 = new C0592Cw0(C0592Cw0.a.VLC_MEDIA_PLAYER, true, null);
        C0592Cw0 c0592Cw03 = new C0592Cw0(C0592Cw0.a.WINDOWS_MEDIA_PLAYER, true, null);
        C0592Cw0.a aVar2 = C0592Cw0.a.MEDIA_PLAYER_CLASSIC;
        C0592Cw0 c0592Cw04 = new C0592Cw0(aVar2, true, null);
        C0592Cw0.a aVar3 = C0592Cw0.a.FOOBAR2000;
        C0592Cw0 c0592Cw05 = new C0592Cw0(aVar3, true, null);
        C0592Cw0 c0592Cw06 = new C0592Cw0(C0592Cw0.a.MPLAYER, true, null);
        C0592Cw0 c0592Cw07 = new C0592Cw0(C0592Cw0.a.QUICKTIME, true, null);
        C0592Cw0 c0592Cw08 = new C0592Cw0(C0592Cw0.a.ITUNES, true, null);
        C0592Cw0.a aVar4 = C0592Cw0.a.REALPLAYER;
        a = new C8036rs[]{new C8036rs(new String[]{".m3u"}, new String[]{"audio/x-mpegurl", "audio/mpegurl"}, new C0592Cw0[]{c0592Cw0, c0592Cw02, c0592Cw03, c0592Cw04, c0592Cw05, c0592Cw06, c0592Cw07, c0592Cw08, new C0592Cw0(aVar4, false, null)}, "Winamp M3U"), new C8036rs(new String[]{".m3u8"}, new String[]{"audio/x-mpegurl", "audio/mpegurl"}, new C0592Cw0[]{new C0592Cw0(aVar, true, null), new C0592Cw0(aVar3, true, null)}, "Winamp M3U8"), new C8036rs(new String[]{".m4u"}, new String[]{"video/x-mpegurl"}, new C0592Cw0[0], "M4U Playlist"), new C8036rs(new String[]{".ram"}, new String[]{"audio/vnd.rn-realaudio", "audio/x-pn-realaudio"}, new C0592Cw0[]{new C0592Cw0(aVar2, false, null), new C0592Cw0(aVar4, false, null)}, "Real Audio Metadata (RAM)")};
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
    
        r3 = new com.daaw.LI0();
        r3.e(r2);
        r3.f(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
    
        if (r1 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
    
        r3.d(java.lang.Long.parseLong(r1));
     */
    @Override // com.daaw.InterfaceC7927rV0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.daaw.InterfaceC7649qV0 a(java.io.InputStream r7, java.lang.String r8, com.daaw.InterfaceC0412Bd0 r9) throws java.io.IOException {
        /*
            r6 = this;
            if (r8 != 0) goto L4
            java.lang.String r8 = "UTF-8"
        L4:
            java.io.BufferedReader r9 = new java.io.BufferedReader
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            r0.<init>(r7, r8)
            r9.<init>(r0)
            com.daaw.Gf0 r7 = new com.daaw.Gf0
            r7.<init>()
            r7.e(r6)
            r8 = 0
        L17:
            r0 = r8
            r1 = r0
        L19:
            java.lang.String r2 = r9.readLine()
            if (r2 == 0) goto L93
            java.lang.String r2 = r2.trim()
            int r3 = r2.length()
            if (r3 <= 0) goto L19
            r3 = 0
            char r4 = r2.charAt(r3)
            r5 = 60
            if (r4 == r5) goto L8b
            r5 = 91
            if (r4 == r5) goto L8b
            r5 = 35
            if (r4 != r5) goto L6f
            java.util.Locale r4 = java.util.Locale.ENGLISH
            java.lang.String r4 = r2.toUpperCase(r4)
            java.lang.String r5 = "#EXTINF"
            boolean r4 = r4.startsWith(r5)
            if (r4 == 0) goto L19
            r4 = 44
            int r4 = r2.indexOf(r4, r3)
            if (r4 < 0) goto L5a
            int r0 = r4 + 1
            int r5 = r2.length()
            java.lang.String r0 = r2.substring(r0, r5)
        L5a:
            r5 = 58
            int r3 = r2.indexOf(r5, r3)
            if (r3 < 0) goto L19
            if (r3 >= r4) goto L19
            int r3 = r3 + 1
            java.lang.String r1 = r2.substring(r3, r4)
            java.lang.String r1 = r1.trim()
            goto L19
        L6f:
            com.daaw.LI0 r3 = new com.daaw.LI0
            r3.<init>()
            r3.e(r2)
            r3.f(r0)
            if (r1 == 0) goto L83
            long r0 = java.lang.Long.parseLong(r1)
            r3.d(r0)
        L83:
            java.util.List r0 = r7.c()
            r0.add(r3)
            goto L17
        L8b:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Doesn't seem to be a M3U playlist (and related ones)"
            r7.<init>(r8)
            throw r7
        L93:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C1053Hf0.a(java.io.InputStream, java.lang.String, com.daaw.Bd0):com.daaw.qV0");
    }

    @Override // com.daaw.InterfaceC7927rV0
    public C8036rs[] b() {
        return (C8036rs[]) a.clone();
    }

    @Override // com.daaw.InterfaceC7927rV0
    public InterfaceC7649qV0 c(C0809Ew0 c0809Ew0) {
        C0949Gf0 c0949Gf0 = new C0949Gf0();
        c0949Gf0.e(this);
        d(c0949Gf0.c(), c0809Ew0.a());
        return c0949Gf0;
    }

    public final void d(List list, AbstractC3868d0 abstractC3868d0) {
        if (abstractC3868d0 instanceof LP0) {
            LP0 lp0 = (LP0) abstractC3868d0;
            if (lp0.a() < 0) {
                throw new IllegalArgumentException("A M3U playlist cannot handle a sequence repeated indefinitely");
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
    public String getId() {
        return "m3u";
    }
}
