package com.daaw;

import android.net.Uri;
import android.util.Base64;
import com.daaw.C3561bt0;
import com.daaw.C4284eW;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.daaw.hW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5131hW implements C3561bt0.a {
    public static final Pattern a = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    public static final Pattern b = Pattern.compile("AUDIO=\"(.+?)\"");
    public static final Pattern c = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern d = Pattern.compile("CODECS=\"(.+?)\"");
    public static final Pattern e = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern f = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern g = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern h = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern i = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern j = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern k = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern l = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern m = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern n = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern o = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(,|$)");
    public static final Pattern p = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    public static final Pattern q = Pattern.compile("URI=\"(.+?)\"");
    public static final Pattern r = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern s = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern t = Pattern.compile("LANGUAGE=\"(.+?)\"");
    public static final Pattern u = Pattern.compile("NAME=\"(.+?)\"");
    public static final Pattern v = Pattern.compile("GROUP-ID=\"(.+?)\"");
    public static final Pattern w = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern x = c("AUTOSELECT");
    public static final Pattern y = c("DEFAULT");
    public static final Pattern z = c("FORCED");

    /* JADX INFO: renamed from: com.daaw.hW$a */
    public static class a {
        public final BufferedReader a;
        public final Queue b;
        public String c;

        public a(Queue queue, BufferedReader bufferedReader) {
            this.b = queue;
            this.a = bufferedReader;
        }

        public boolean a() throws IOException {
            String strTrim;
            if (this.c != null) {
                return true;
            }
            if (!this.b.isEmpty()) {
                this.c = (String) this.b.poll();
                return true;
            }
            do {
                String line = this.a.readLine();
                this.c = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.c = strTrim;
            } while (strTrim.isEmpty());
            return true;
        }

        public String b() {
            if (!a()) {
                return null;
            }
            String str = this.c;
            this.c = null;
            return str;
        }
    }

    public static boolean b(BufferedReader bufferedReader) throws IOException {
        int i2 = bufferedReader.read();
        if (i2 == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            i2 = bufferedReader.read();
        }
        int iO = o(bufferedReader, true, i2);
        for (int i3 = 0; i3 < 7; i3++) {
            if (iO != "#EXTM3U".charAt(i3)) {
                return false;
            }
            iO = bufferedReader.read();
        }
        return AbstractC6280lb1.J(o(bufferedReader, false, iO));
    }

    public static Pattern c(String str) {
        return Pattern.compile(str + "=(NO|YES)");
    }

    public static boolean e(String str, Pattern pattern, boolean z2) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? matcher.group(1).equals("YES") : z2;
    }

    public static double f(String str, Pattern pattern) {
        return Double.parseDouble(m(str, pattern));
    }

    public static int g(String str, Pattern pattern) {
        return Integer.parseInt(m(str, pattern));
    }

    public static long h(String str, Pattern pattern) {
        return Long.parseLong(m(str, pattern));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.daaw.C3449bW i(com.daaw.C5131hW.a r27, java.lang.String r28) throws com.daaw.C3000Zs0 {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C5131hW.i(com.daaw.hW$a, java.lang.String):com.daaw.bW");
    }

    public static C4284eW j(a aVar, String str) throws C3000Zs0 {
        int i2;
        DrmInitData.SchemeData schemeDataN;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        long jF = -9223372036854775807L;
        long jA = 0;
        int i4 = 1;
        long jG = -9223372036854775807L;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long jH = 0;
        long jF2 = 0;
        long j5 = 0;
        DrmInitData drmInitData = null;
        C4284eW.a aVar2 = null;
        String strM = null;
        String str2 = null;
        long j6 = -1;
        boolean z2 = false;
        int i5 = 0;
        int iG = 1;
        boolean z3 = false;
        boolean z4 = false;
        int i6 = 0;
        loop0: while (true) {
            boolean z5 = false;
            while (aVar.a()) {
                String strB = aVar.b();
                if (strB.startsWith("#EXT")) {
                    arrayList2.add(strB);
                }
                if (strB.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                    String strM2 = m(strB, i);
                    if ("VOD".equals(strM2)) {
                        i3 = 1;
                    } else if ("EVENT".equals(strM2)) {
                        i3 = 2;
                    }
                } else if (strB.startsWith("#EXT-X-START")) {
                    jF = (long) (f(strB, l) * 1000000.0d);
                } else {
                    long j7 = j2;
                    if (strB.startsWith("#EXT-X-MAP")) {
                        String strM3 = m(strB, q);
                        String strK = k(strB, n);
                        if (strK != null) {
                            String[] strArrSplit = strK.split("@");
                            j6 = Long.parseLong(strArrSplit[0]);
                            if (strArrSplit.length > i4) {
                                j4 = Long.parseLong(strArrSplit[i4]);
                            }
                        }
                        C4284eW.a aVar3 = new C4284eW.a(strM3, j4, j6);
                        j6 = -1;
                        j2 = j7;
                        j4 = j2;
                        aVar2 = aVar3;
                    } else {
                        if (strB.startsWith("#EXT-X-TARGETDURATION")) {
                            jG = 1000000 * ((long) g(strB, g));
                        } else if (strB.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                            jH = h(strB, j);
                            j3 = jH;
                        } else if (strB.startsWith("#EXT-X-VERSION")) {
                            iG = g(strB, h);
                        } else if (strB.startsWith("#EXTINF")) {
                            jF2 = (long) (f(strB, k) * 1000000.0d);
                        } else {
                            if (strB.startsWith("#EXT-X-KEY")) {
                                String strK2 = k(strB, o);
                                String strK3 = k(strB, p);
                                if ("NONE".equals(strK2)) {
                                    i2 = i3;
                                    strM = null;
                                    str2 = null;
                                } else {
                                    String strK4 = k(strB, r);
                                    i2 = i3;
                                    if (!"identity".equals(strK3) && strK3 != null) {
                                        if (strK2 != null && (schemeDataN = n(strB, strK3)) != null) {
                                            str2 = strK4;
                                            drmInitData = new DrmInitData(("SAMPLE-AES-CENC".equals(strK2) || "SAMPLE-AES-CTR".equals(strK2)) ? "cenc" : "cbcs", schemeDataN);
                                        }
                                        strM = null;
                                    } else if ("AES-128".equals(strK2)) {
                                        strM = m(strB, q);
                                        str2 = strK4;
                                    }
                                    str2 = strK4;
                                    strM = null;
                                }
                            } else {
                                i2 = i3;
                                if (strB.startsWith("#EXT-X-BYTERANGE")) {
                                    String[] strArrSplit2 = m(strB, m).split("@");
                                    j6 = Long.parseLong(strArrSplit2[0]);
                                    if (strArrSplit2.length > 1) {
                                        j4 = Long.parseLong(strArrSplit2[1]);
                                    }
                                } else if (strB.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                    i5 = Integer.parseInt(strB.substring(strB.indexOf(58) + 1));
                                    j2 = j7;
                                    i3 = i2;
                                    i4 = 1;
                                    z2 = true;
                                } else if (strB.equals("#EXT-X-DISCONTINUITY")) {
                                    i6++;
                                } else if (strB.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                    if (jA == j7) {
                                        jA = AbstractC6025ki.a(AbstractC6280lb1.O(strB.substring(strB.indexOf(58) + 1))) - j5;
                                    }
                                } else if (strB.equals("#EXT-X-GAP")) {
                                    j2 = j7;
                                    i3 = i2;
                                    i4 = 1;
                                    z5 = true;
                                } else if (strB.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                    j2 = j7;
                                    i3 = i2;
                                    i4 = 1;
                                    z3 = true;
                                } else if (strB.equals("#EXT-X-ENDLIST")) {
                                    j2 = j7;
                                    i3 = i2;
                                    i4 = 1;
                                    z4 = true;
                                } else if (!strB.startsWith("#")) {
                                    String hexString = strM == null ? null : str2 != null ? str2 : Long.toHexString(jH);
                                    long j8 = jH + 1;
                                    long j9 = j6 == -1 ? j7 : j4;
                                    arrayList.add(new C4284eW.a(strB, aVar2, jF2, i6, j5, strM, hexString, j9, j6, z5));
                                    j5 += jF2;
                                    if (j6 != -1) {
                                        j9 += j6;
                                    }
                                    j4 = j9;
                                    jH = j8;
                                    j6 = -1;
                                    j2 = j7;
                                    jF2 = j2;
                                    i3 = i2;
                                    i4 = 1;
                                }
                            }
                            j2 = j7;
                            i3 = i2;
                            i4 = 1;
                        }
                        j2 = j7;
                    }
                }
            }
            break loop0;
        }
        return new C4284eW(i3, str, arrayList2, jF, jA, z2, i5, j3, iG, jG, z3, z4, jA != j2, drmInitData, arrayList);
    }

    public static String k(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    public static int l(String str) {
        return (e(str, y, false) ? 1 : 0) | (e(str, z, false) ? 2 : 0) | (e(str, x, false) ? 4 : 0);
    }

    public static String m(String str, Pattern pattern) throws C3000Zs0 {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find() && matcher.groupCount() == 1) {
            return matcher.group(1);
        }
        throw new C3000Zs0("Couldn't match " + pattern.pattern() + " in " + str);
    }

    public static DrmInitData.SchemeData n(String str, String str2) throws C3000Zs0 {
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String strM = m(str, q);
            return new DrmInitData.SchemeData(AbstractC6025ki.e, "video/mp4", Base64.decode(strM.substring(strM.indexOf(44)), 0));
        }
        if (!"com.widevine".equals(str2)) {
            return null;
        }
        try {
            return new DrmInitData.SchemeData(AbstractC6025ki.e, "hls", str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e2) {
            throw new C3000Zs0(e2);
        }
    }

    public static int o(BufferedReader bufferedReader, boolean z2, int i2) throws IOException {
        while (i2 != -1 && Character.isWhitespace(i2) && (z2 || !AbstractC6280lb1.J(i2))) {
            i2 = bufferedReader.read();
        }
        return i2;
    }

    @Override // com.daaw.C3561bt0.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public AbstractC4852gW a(Uri uri, InputStream inputStream) throws C3000Zs0 {
        String strTrim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (!b(bufferedReader)) {
                throw new Y91("Input does not start with the #EXTM3U header.", uri);
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    AbstractC6280lb1.i(bufferedReader);
                    throw new C3000Zs0("Failed to parse the playlist, could not identify any tags.");
                }
                strTrim = line.trim();
                if (!strTrim.isEmpty()) {
                    if (!strTrim.startsWith("#EXT-X-STREAM-INF")) {
                        if (strTrim.startsWith("#EXT-X-TARGETDURATION") || strTrim.startsWith("#EXT-X-MEDIA-SEQUENCE") || strTrim.startsWith("#EXTINF") || strTrim.startsWith("#EXT-X-KEY") || strTrim.startsWith("#EXT-X-BYTERANGE") || strTrim.equals("#EXT-X-DISCONTINUITY") || strTrim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") || strTrim.equals("#EXT-X-ENDLIST")) {
                            break;
                        }
                        arrayDeque.add(strTrim);
                    } else {
                        arrayDeque.add(strTrim);
                        return i(new a(arrayDeque, bufferedReader), uri.toString());
                    }
                }
            }
            arrayDeque.add(strTrim);
            return j(new a(arrayDeque, bufferedReader), uri.toString());
        } finally {
            AbstractC6280lb1.i(bufferedReader);
        }
    }
}
