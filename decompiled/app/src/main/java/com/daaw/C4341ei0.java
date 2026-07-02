package com.daaw;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;

/* JADX INFO: renamed from: com.daaw.ei0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4341ei0 {
    public final String a;
    public final String b;
    public final MediaCodecInfo.CodecCapabilities c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public C4341ei0(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        this.a = (String) AbstractC7115ob.e(str);
        this.b = str2;
        this.c = codecCapabilities;
        this.g = z;
        boolean z4 = false;
        this.d = (z2 || codecCapabilities == null || !e(codecCapabilities)) ? false : true;
        this.e = codecCapabilities != null && l(codecCapabilities);
        if (z3 || (codecCapabilities != null && j(codecCapabilities))) {
            z4 = true;
        }
        this.f = z4;
    }

    public static int a(String str, String str2, int i) {
        if (i > 1 || ((AbstractC6280lb1.a >= 26 && i > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i;
        }
        if ("audio/ac3".equals(str2)) {
            return 6;
        }
        return "audio/eac3".equals(str2) ? 16 : 30;
    }

    public static boolean c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        return (d == -1.0d || d <= 0.0d) ? videoCapabilities.isSizeSupported(i, i2) : videoCapabilities.areSizeAndRateSupported(i, i2, d);
    }

    public static boolean e(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return AbstractC6280lb1.a >= 19 && f(codecCapabilities);
    }

    public static boolean f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    public static boolean j(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return AbstractC6280lb1.a >= 21 && k(codecCapabilities);
    }

    public static boolean k(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    public static boolean l(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return AbstractC6280lb1.a >= 21 && m(codecCapabilities);
    }

    public static boolean m(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    public static C4341ei0 q(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        return new C4341ei0(str, str2, codecCapabilities, false, z, z2);
    }

    public static C4341ei0 r(String str) {
        return new C4341ei0(str, null, null, true, false, false);
    }

    public Point b(int i, int i2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.c;
        if (codecCapabilities == null) {
            p("align.caps");
            return null;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            p("align.vCaps");
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(AbstractC6280lb1.f(i, widthAlignment) * widthAlignment, AbstractC6280lb1.f(i2, heightAlignment) * heightAlignment);
    }

    public MediaCodecInfo.CodecProfileLevel[] d() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.c;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean g(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.c;
        if (codecCapabilities == null) {
            p("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            p("channelCount.aCaps");
            return false;
        }
        if (a(this.a, this.b, audioCapabilities.getMaxInputChannelCount()) >= i) {
            return true;
        }
        p("channelCount.support, " + i);
        return false;
    }

    public boolean h(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.c;
        if (codecCapabilities == null) {
            p("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            p("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        }
        p("sampleRate.support, " + i);
        return false;
    }

    public boolean i(String str) {
        String strD;
        if (str == null || this.b == null || (strD = AbstractC8834uk0.d(str)) == null) {
            return true;
        }
        if (!this.b.equals(strD)) {
            p("codec.mime " + str + ", " + strD);
            return false;
        }
        Pair pairE = AbstractC5188hi0.e(str);
        if (pairE == null) {
            return true;
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : d()) {
            if (codecProfileLevel.profile == ((Integer) pairE.first).intValue() && codecProfileLevel.level >= ((Integer) pairE.second).intValue()) {
                return true;
            }
        }
        p("codec.profileLevel, " + str + ", " + strD);
        return false;
    }

    public boolean n(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.c;
        if (codecCapabilities == null) {
            p("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            p("sizeAndRate.vCaps");
            return false;
        }
        if (c(videoCapabilities, i, i2, d)) {
            return true;
        }
        if (i >= i2 || !c(videoCapabilities, i2, i, d)) {
            p("sizeAndRate.support, " + i + "x" + i2 + "x" + d);
            return false;
        }
        o("sizeAndRate.rotated, " + i + "x" + i2 + "x" + d);
        return true;
    }

    public final void o(String str) {
        int i = AbstractC6280lb1.a;
    }

    public final void p(String str) {
        int i = AbstractC6280lb1.a;
    }
}
