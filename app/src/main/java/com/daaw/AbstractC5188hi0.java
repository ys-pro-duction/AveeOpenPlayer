package com.daaw;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import com.google.android.gms.ads.AdRequest;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: com.daaw.hi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5188hi0 {
    public static final SparseIntArray d;
    public static final SparseIntArray e;
    public static final Map f;
    public static final C4341ei0 a = C4341ei0.r("OMX.google.raw.decoder");
    public static final Pattern b = Pattern.compile("^\\D?(\\d+)$");
    public static final HashMap c = new HashMap();
    public static int g = -1;

    /* JADX INFO: renamed from: com.daaw.hi0$b */
    public static final class b {
        public final String a;
        public final boolean b;

        public b(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == b.class) {
                b bVar = (b) obj;
                if (TextUtils.equals(this.a, bVar.a) && this.b == bVar.b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            String str = this.a;
            return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.b ? 1231 : 1237);
        }
    }

    /* JADX INFO: renamed from: com.daaw.hi0$c */
    public static class c extends Exception {
        public c(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    /* JADX INFO: renamed from: com.daaw.hi0$d */
    public interface d {
        MediaCodecInfo a(int i);

        boolean b(String str, MediaCodecInfo.CodecCapabilities codecCapabilities);

        int c();

        boolean d();
    }

    /* JADX INFO: renamed from: com.daaw.hi0$e */
    public static final class e implements d {
        public e() {
        }

        @Override // com.daaw.AbstractC5188hi0.d
        public MediaCodecInfo a(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        @Override // com.daaw.AbstractC5188hi0.d
        public boolean b(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "video/avc".equals(str);
        }

        @Override // com.daaw.AbstractC5188hi0.d
        public int c() {
            return MediaCodecList.getCodecCount();
        }

        @Override // com.daaw.AbstractC5188hi0.d
        public boolean d() {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.daaw.hi0$f */
    public static final class f implements d {
        public final int a;
        public MediaCodecInfo[] b;

        public f(boolean z) {
            this.a = z ? 1 : 0;
        }

        @Override // com.daaw.AbstractC5188hi0.d
        public MediaCodecInfo a(int i) {
            e();
            return this.b[i];
        }

        @Override // com.daaw.AbstractC5188hi0.d
        public boolean b(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported("secure-playback");
        }

        @Override // com.daaw.AbstractC5188hi0.d
        public int c() {
            e();
            return this.b.length;
        }

        @Override // com.daaw.AbstractC5188hi0.d
        public boolean d() {
            return true;
        }

        public final void e() {
            if (this.b == null) {
                this.b = new MediaCodecList(this.a).getCodecInfos();
            }
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        d = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        e = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        sparseIntArray2.put(31, AdRequest.MAX_CONTENT_URL_LENGTH);
        sparseIntArray2.put(32, 1024);
        sparseIntArray2.put(40, 2048);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, 65536);
        HashMap map = new HashMap();
        f = map;
        map.put("L30", 1);
        map.put("L60", 4);
        map.put("L63", 16);
        map.put("L90", 64);
        map.put("L93", Integer.valueOf(PSKKeyManager.MAX_KEY_LENGTH_BYTES));
        map.put("L120", 1024);
        map.put("L123", 4096);
        map.put("L150", 16384);
        map.put("L153", 65536);
        map.put("L156", 262144);
        map.put("L180", 1048576);
        map.put("L183", 4194304);
        map.put("L186", 16777216);
        map.put("H30", 2);
        map.put("H60", 8);
        map.put("H63", 32);
        map.put("H90", 128);
        map.put("H93", Integer.valueOf(AdRequest.MAX_CONTENT_URL_LENGTH));
        map.put("H120", 2048);
        map.put("H123", 8192);
        map.put("H150", 32768);
        map.put("H153", 131072);
        map.put("H156", 524288);
        map.put("H180", 2097152);
        map.put("H183", 8388608);
        map.put("H186", 33554432);
    }

    public static void a(List list) {
        if (AbstractC6280lb1.a < 26) {
            if (list.size() <= 1 || !"OMX.MTK.AUDIO.DECODER.RAW".equals(((C4341ei0) list.get(0)).a)) {
                return;
            }
            for (int i = 1; i < list.size(); i++) {
                C4341ei0 c4341ei0 = (C4341ei0) list.get(i);
                if ("OMX.google.raw.decoder".equals(c4341ei0.a)) {
                    list.remove(i);
                    list.add(0, c4341ei0);
                    return;
                }
            }
        }
    }

    public static int b(int i) {
        if (i == 1 || i == 2) {
            return 25344;
        }
        switch (i) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case PSKKeyManager.MAX_KEY_LENGTH_BYTES /* 256 */:
                return 414720;
            case AdRequest.MAX_CONTENT_URL_LENGTH /* 512 */:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            default:
                return -1;
        }
    }

    public static boolean c(String str) {
        if (AbstractC6280lb1.a > 22) {
            return false;
        }
        String str2 = AbstractC6280lb1.d;
        if ("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) {
            return "OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str);
        }
        return false;
    }

    public static Pair d(String str, String[] strArr) {
        Integer numValueOf;
        Integer numValueOf2;
        int i;
        if (strArr.length < 2) {
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                numValueOf = Integer.valueOf(Integer.parseInt(strArr[1].substring(0, 2), 16));
                numValueOf2 = Integer.valueOf(Integer.parseInt(strArr[1].substring(4), 16));
            } else {
                if (strArr.length < 3) {
                    return null;
                }
                numValueOf = Integer.valueOf(Integer.parseInt(strArr[1]));
                numValueOf2 = Integer.valueOf(Integer.parseInt(strArr[2]));
            }
            int i2 = d.get(numValueOf.intValue(), -1);
            if (i2 == -1 || (i = e.get(numValueOf2.intValue(), -1)) == -1) {
                return null;
            }
            return new Pair(Integer.valueOf(i2), Integer.valueOf(i));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair e(java.lang.String r6) {
        /*
            r0 = 0
            r1 = 0
            if (r6 != 0) goto L5
            return r1
        L5:
            java.lang.String r2 = "\\."
            java.lang.String[] r2 = r6.split(r2)
            r3 = r2[r0]
            r3.getClass()
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case 3006243: goto L3b;
                case 3006244: goto L30;
                case 3199032: goto L25;
                case 3214780: goto L1a;
                default: goto L18;
            }
        L18:
            r0 = -1
            goto L44
        L1a:
            java.lang.String r0 = "hvc1"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L23
            goto L18
        L23:
            r0 = 3
            goto L44
        L25:
            java.lang.String r0 = "hev1"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L2e
            goto L18
        L2e:
            r0 = 2
            goto L44
        L30:
            java.lang.String r0 = "avc2"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L39
            goto L18
        L39:
            r0 = 1
            goto L44
        L3b:
            java.lang.String r5 = "avc1"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L44
            goto L18
        L44:
            switch(r0) {
                case 0: goto L4d;
                case 1: goto L4d;
                case 2: goto L48;
                case 3: goto L48;
                default: goto L47;
            }
        L47:
            return r1
        L48:
            android.util.Pair r6 = i(r6, r2)
            return r6
        L4d:
            android.util.Pair r6 = d(r6, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC5188hi0.e(java.lang.String):android.util.Pair");
    }

    public static C4341ei0 f(String str, boolean z) {
        List listG = g(str, z);
        if (listG.isEmpty()) {
            return null;
        }
        return (C4341ei0) listG.get(0);
    }

    public static synchronized List g(String str, boolean z) {
        try {
            b bVar = new b(str, z);
            HashMap map = c;
            List list = (List) map.get(bVar);
            if (list != null) {
                return list;
            }
            int i = AbstractC6280lb1.a;
            d fVar = i >= 21 ? new f(z) : new e();
            ArrayList arrayListH = h(bVar, fVar, str);
            if (z && arrayListH.isEmpty() && 21 <= i && i <= 23) {
                fVar = new e();
                arrayListH = h(bVar, fVar, str);
                if (!arrayListH.isEmpty()) {
                    String str2 = ((C4341ei0) arrayListH.get(0)).a;
                }
            }
            if ("audio/eac3-joc".equals(str)) {
                arrayListH.addAll(h(new b("audio/eac3", bVar.b), fVar, str));
            }
            a(arrayListH);
            List listUnmodifiableList = DesugarCollections.unmodifiableList(arrayListH);
            map.put(bVar, listUnmodifiableList);
            return listUnmodifiableList;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList h(com.daaw.AbstractC5188hi0.b r16, com.daaw.AbstractC5188hi0.d r17, java.lang.String r18) throws com.daaw.AbstractC5188hi0.c {
        /*
            r1 = r16
            r2 = r17
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Exception -> L99
            r3.<init>()     // Catch: java.lang.Exception -> L99
            java.lang.String r4 = r1.a     // Catch: java.lang.Exception -> L99
            int r5 = r2.c()     // Catch: java.lang.Exception -> L99
            boolean r6 = r2.d()     // Catch: java.lang.Exception -> L99
            r8 = 0
        L14:
            if (r8 >= r5) goto L98
            android.media.MediaCodecInfo r9 = r2.a(r8)     // Catch: java.lang.Exception -> L99
            java.lang.String r10 = r9.getName()     // Catch: java.lang.Exception -> L99
            r11 = r18
            boolean r0 = k(r9, r10, r6, r11)     // Catch: java.lang.Exception -> L99
            if (r0 == 0) goto L92
            java.lang.String[] r12 = r9.getSupportedTypes()     // Catch: java.lang.Exception -> L99
            int r13 = r12.length     // Catch: java.lang.Exception -> L99
            r14 = 0
        L2c:
            if (r14 >= r13) goto L92
            r0 = r12[r14]     // Catch: java.lang.Exception -> L99
            boolean r15 = r0.equalsIgnoreCase(r4)     // Catch: java.lang.Exception -> L99
            if (r15 == 0) goto L8d
            android.media.MediaCodecInfo$CodecCapabilities r0 = r9.getCapabilitiesForType(r0)     // Catch: java.lang.Exception -> L4b
            boolean r15 = r2.b(r4, r0)     // Catch: java.lang.Exception -> L4b
            boolean r7 = c(r10)     // Catch: java.lang.Exception -> L4b
            if (r6 == 0) goto L4d
            boolean r2 = r1.b     // Catch: java.lang.Exception -> L4b
            if (r2 == r15) goto L49
            goto L4d
        L49:
            r2 = 0
            goto L54
        L4b:
            r0 = move-exception
            goto L7f
        L4d:
            if (r6 != 0) goto L5c
            boolean r2 = r1.b     // Catch: java.lang.Exception -> L5e
            if (r2 != 0) goto L5c
            goto L49
        L54:
            com.daaw.ei0 r0 = com.daaw.C4341ei0.q(r10, r4, r0, r7, r2)     // Catch: java.lang.Exception -> L4b
            r3.add(r0)     // Catch: java.lang.Exception -> L4b
            goto L8d
        L5c:
            r2 = 0
            goto L61
        L5e:
            r0 = move-exception
            r2 = 0
            goto L7f
        L61:
            if (r6 != 0) goto L8d
            if (r15 == 0) goto L8d
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4b
            r15.<init>()     // Catch: java.lang.Exception -> L4b
            r15.append(r10)     // Catch: java.lang.Exception -> L4b
            java.lang.String r2 = ".secure"
            r15.append(r2)     // Catch: java.lang.Exception -> L4b
            java.lang.String r2 = r15.toString()     // Catch: java.lang.Exception -> L4b
            r15 = 1
            com.daaw.ei0 r0 = com.daaw.C4341ei0.q(r2, r4, r0, r7, r15)     // Catch: java.lang.Exception -> L4b
            r3.add(r0)     // Catch: java.lang.Exception -> L4b
            goto L98
        L7f:
            int r2 = com.daaw.AbstractC6280lb1.a     // Catch: java.lang.Exception -> L99
            r7 = 23
            if (r2 > r7) goto L8c
            boolean r2 = r3.isEmpty()     // Catch: java.lang.Exception -> L99
            if (r2 != 0) goto L8c
            goto L8d
        L8c:
            throw r0     // Catch: java.lang.Exception -> L99
        L8d:
            int r14 = r14 + 1
            r2 = r17
            goto L2c
        L92:
            int r8 = r8 + 1
            r2 = r17
            goto L14
        L98:
            return r3
        L99:
            r0 = move-exception
            com.daaw.hi0$c r1 = new com.daaw.hi0$c
            r2 = 0
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC5188hi0.h(com.daaw.hi0$b, com.daaw.hi0$d, java.lang.String):java.util.ArrayList");
    }

    public static Pair i(String str, String[] strArr) {
        int i;
        if (strArr.length < 4) {
            return null;
        }
        Matcher matcher = b.matcher(strArr[1]);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        if ("1".equals(strGroup)) {
            i = 1;
        } else {
            if (!"2".equals(strGroup)) {
                return null;
            }
            i = 2;
        }
        Integer num = (Integer) f.get(strArr[3]);
        if (num != null) {
            return new Pair(Integer.valueOf(i), num);
        }
        matcher.group(1);
        return null;
    }

    public static C4341ei0 j() {
        return a;
    }

    public static boolean k(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i = AbstractC6280lb1.a;
        if (i < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i < 18 && "OMX.SEC.MP3.Decoder".equals(str)) {
            return false;
        }
        if (i < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = AbstractC6280lb1.b;
            if ("a70".equals(str3) || ("Xiaomi".equals(AbstractC6280lb1.c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = AbstractC6280lb1.b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = AbstractC6280lb1.b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(AbstractC6280lb1.c))) {
            String str6 = AbstractC6280lb1.b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(AbstractC6280lb1.c)) {
            String str7 = AbstractC6280lb1.b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i <= 19 && AbstractC6280lb1.b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return ("audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static int l() {
        if (g == -1) {
            int iMax = 0;
            C4341ei0 c4341ei0F = f("video/avc", false);
            if (c4341ei0F != null) {
                MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrD = c4341ei0F.d();
                int length = codecProfileLevelArrD.length;
                int iMax2 = 0;
                while (iMax < length) {
                    iMax2 = Math.max(b(codecProfileLevelArrD[iMax].level), iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, AbstractC6280lb1.a >= 21 ? 345600 : 172800);
            }
            g = iMax;
        }
        return g;
    }
}
