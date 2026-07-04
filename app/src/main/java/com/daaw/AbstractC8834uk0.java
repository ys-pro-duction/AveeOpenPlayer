package com.daaw;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.uk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8834uk0 {
    public static final ArrayList a = new ArrayList();

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : AbstractC6280lb1.W(str, ",")) {
            String strD = d(str2);
            if (strD != null && k(strD)) {
                return strD;
            }
        }
        return null;
    }

    public static String b(String str) {
        ArrayList arrayList = a;
        if (arrayList.size() <= 0) {
            return null;
        }
        AbstractC6314li0.a(arrayList.get(0));
        throw null;
    }

    public static int c(String str) {
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
            case "audio/eac3":
                return 6;
            case "audio/vnd.dts":
                return 7;
            case "audio/ac3":
                return 5;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static String d(String str) {
        String strE = null;
        if (str == null) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.startsWith("avc1") || strTrim.startsWith("avc3")) {
            return "video/avc";
        }
        if (strTrim.startsWith("hev1") || strTrim.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (strTrim.startsWith("vp9") || strTrim.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (strTrim.startsWith("vp8") || strTrim.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (!strTrim.startsWith("mp4a")) {
            return (strTrim.startsWith("ac-3") || strTrim.startsWith("dac3")) ? "audio/ac3" : (strTrim.startsWith("ec-3") || strTrim.startsWith("dec3")) ? "audio/eac3" : strTrim.startsWith("ec+3") ? "audio/eac3-joc" : (strTrim.startsWith("dtsc") || strTrim.startsWith("dtse")) ? "audio/vnd.dts" : (strTrim.startsWith("dtsh") || strTrim.startsWith("dtsl")) ? "audio/vnd.dts.hd" : strTrim.startsWith("opus") ? "audio/opus" : strTrim.startsWith("vorbis") ? "audio/vorbis" : b(strTrim);
        }
        if (strTrim.startsWith("mp4a.")) {
            String strSubstring = strTrim.substring(5);
            if (strSubstring.length() >= 2) {
                try {
                    strE = e(Integer.parseInt(AbstractC6280lb1.b0(strSubstring.substring(0, 2)), 16));
                } catch (NumberFormatException unused) {
                }
            }
        }
        return strE == null ? "audio/mp4a-latm" : strE;
    }

    public static String e(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    default:
                        return null;
                }
        }
    }

    public static String f(String str) {
        if (str == null) {
            return null;
        }
        int iIndexOf = str.indexOf(47);
        if (iIndexOf != -1) {
            return str.substring(0, iIndexOf);
        }
        throw new IllegalArgumentException("Invalid mime type: " + str);
    }

    public static int g(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (k(str)) {
            return 1;
        }
        if (m(str)) {
            return 2;
        }
        if (l(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return 3;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-camera-motion".equals(str)) {
            return 4;
        }
        return h(str);
    }

    public static int h(String str) {
        ArrayList arrayList = a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        AbstractC6314li0.a(arrayList.get(0));
        throw null;
    }

    public static int i(String str) {
        return g(d(str));
    }

    public static String j(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : AbstractC6280lb1.W(str, ",")) {
            String strD = d(str2);
            if (strD != null && m(strD)) {
                return strD;
            }
        }
        return null;
    }

    public static boolean k(String str) {
        return "audio".equals(f(str));
    }

    public static boolean l(String str) {
        return "text".equals(f(str));
    }

    public static boolean m(String str) {
        return "video".equals(f(str));
    }
}
