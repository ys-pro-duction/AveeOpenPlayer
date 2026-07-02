package com.daaw;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.google.android.gms.ads.AdRequest;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public final class Fo3 {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public Fo3(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        this.e = z4;
        this.f = z6;
        this.h = AbstractC5959kT1.g(str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.daaw.Fo3 c(java.lang.String r11, java.lang.String r12, java.lang.String r13, android.media.MediaCodecInfo.CodecCapabilities r14, boolean r15, boolean r16, boolean r17, boolean r18, boolean r19) {
        /*
            com.daaw.Fo3 r0 = new com.daaw.Fo3
            r1 = 1
            r2 = 0
            if (r14 == 0) goto L3b
            int r3 = com.daaw.AbstractC9004vJ2.a
            java.lang.String r3 = "adaptive-playback"
            boolean r3 = r14.isFeatureSupported(r3)
            if (r3 == 0) goto L3b
            int r3 = com.daaw.AbstractC9004vJ2.a
            r4 = 22
            if (r3 > r4) goto L29
            java.lang.String r3 = com.daaw.AbstractC9004vJ2.d
            java.lang.String r4 = "ODROID-XU3"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L2b
            java.lang.String r4 = "Nexus 10"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L29
            goto L2b
        L29:
            r8 = 1
            goto L3c
        L2b:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto L3b
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r11)
            if (r3 == 0) goto L29
        L3b:
            r8 = 0
        L3c:
            r3 = 21
            if (r14 == 0) goto L4e
            int r4 = com.daaw.AbstractC9004vJ2.a
            if (r4 < r3) goto L4e
            java.lang.String r4 = "tunneled-playback"
            boolean r4 = r14.isFeatureSupported(r4)
            if (r4 == 0) goto L4e
            r9 = 1
            goto L4f
        L4e:
            r9 = 0
        L4f:
            if (r19 != 0) goto L5f
            if (r14 == 0) goto L6a
            int r4 = com.daaw.AbstractC9004vJ2.a
            if (r4 < r3) goto L6a
            java.lang.String r3 = "secure-playback"
            boolean r3 = r14.isFeatureSupported(r3)
            if (r3 == 0) goto L6a
        L5f:
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r10 = 1
            goto L74
        L6a:
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r10 = 0
        L74:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.Fo3.c(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean, boolean):com.daaw.Fo3");
    }

    public static Point i(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i3 = AbstractC9004vJ2.a;
        return new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public static boolean k(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point pointI = i(videoCapabilities, i, i2);
        int i3 = pointI.x;
        int i4 = pointI.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i3, i4) : videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    public final Point a(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return i(videoCapabilities, i, i2);
    }

    public final C9631xa3 b(C2485Ut1 c2485Ut1, C2485Ut1 c2485Ut12) {
        C2485Ut1 c2485Ut13;
        C2485Ut1 c2485Ut14;
        int i = true != AbstractC9004vJ2.e(c2485Ut1.l, c2485Ut12.l) ? 8 : 0;
        if (this.h) {
            if (c2485Ut1.t != c2485Ut12.t) {
                i |= 1024;
            }
            if (!this.e && (c2485Ut1.q != c2485Ut12.q || c2485Ut1.r != c2485Ut12.r)) {
                i |= AdRequest.MAX_CONTENT_URL_LENGTH;
            }
            if (!AbstractC9004vJ2.e(c2485Ut1.x, c2485Ut12.x)) {
                i |= 2048;
            }
            String str = this.a;
            if (AbstractC9004vJ2.d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !c2485Ut1.d(c2485Ut12)) {
                i |= 2;
            }
            if (i == 0) {
                return new C9631xa3(this.a, c2485Ut1, c2485Ut12, true != c2485Ut1.d(c2485Ut12) ? 2 : 3, 0);
            }
            c2485Ut13 = c2485Ut1;
            c2485Ut14 = c2485Ut12;
        } else {
            c2485Ut13 = c2485Ut1;
            c2485Ut14 = c2485Ut12;
            if (c2485Ut13.y != c2485Ut14.y) {
                i |= 4096;
            }
            if (c2485Ut13.z != c2485Ut14.z) {
                i |= 8192;
            }
            if (c2485Ut13.A != c2485Ut14.A) {
                i |= 16384;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.b)) {
                Pair pairB = AbstractC6352lp3.b(c2485Ut13);
                Pair pairB2 = AbstractC6352lp3.b(c2485Ut14);
                if (pairB != null && pairB2 != null) {
                    int iIntValue = ((Integer) pairB.first).intValue();
                    int iIntValue2 = ((Integer) pairB2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new C9631xa3(this.a, c2485Ut13, c2485Ut14, 3, 0);
                    }
                }
            }
            if (!c2485Ut13.d(c2485Ut14)) {
                i |= 32;
            }
            if ("audio/opus".equals(this.b)) {
                i |= 2;
            }
            if (i == 0) {
                return new C9631xa3(this.a, c2485Ut13, c2485Ut14, 1, 0);
            }
        }
        return new C9631xa3(this.a, c2485Ut13, c2485Ut14, 0, i);
    }

    public final boolean d(C2485Ut1 c2485Ut1) {
        return m(c2485Ut1) && l(c2485Ut1, false);
    }

    public final boolean e(C2485Ut1 c2485Ut1) {
        int i;
        if (!m(c2485Ut1) || !l(c2485Ut1, true)) {
            return false;
        }
        if (this.h) {
            int i2 = c2485Ut1.q;
            if (i2 <= 0 || (i = c2485Ut1.r) <= 0) {
                return true;
            }
            if (AbstractC9004vJ2.a >= 21) {
                return g(i2, i, c2485Ut1.s);
            }
            boolean z = i2 * i <= AbstractC6352lp3.a();
            if (!z) {
                j("legacyFrameSize, " + c2485Ut1.q + "x" + c2485Ut1.r);
            }
            return z;
        }
        int i3 = AbstractC9004vJ2.a;
        if (i3 >= 21) {
            int i4 = c2485Ut1.z;
            if (i4 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
                if (codecCapabilities == null) {
                    j("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    j("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i4)) {
                    j("sampleRate.support, " + i4);
                    return false;
                }
            }
            int i5 = c2485Ut1.y;
            if (i5 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.d;
                if (codecCapabilities2 == null) {
                    j("channelCount.caps");
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
                    if (audioCapabilities2 == null) {
                        j("channelCount.aCaps");
                    } else {
                        String str = this.a;
                        String str2 = this.b;
                        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                        if (maxInputChannelCount <= 1 && ((i3 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                            int i6 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                            AbstractC3305ay2.f("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i6 + "]");
                            maxInputChannelCount = i6;
                        }
                        if (maxInputChannelCount < i5) {
                            j("channelCount.support, " + i5);
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean f(C2485Ut1 c2485Ut1) {
        if (this.h) {
            return this.e;
        }
        Pair pairB = AbstractC6352lp3.b(c2485Ut1);
        return pairB != null && ((Integer) pairB.first).intValue() == 42;
    }

    public final boolean g(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            j("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            j("sizeAndRate.vCaps");
            return false;
        }
        if (AbstractC9004vJ2.a >= 29) {
            int iA = Eo3.a(videoCapabilities, i, i2, d);
            if (iA == 2) {
                return true;
            }
            if (iA == 1) {
                j("sizeAndRate.cover, " + i + "x" + i2 + "@" + d);
                return false;
            }
        }
        if (!k(videoCapabilities, i, i2, d)) {
            if (i >= i2 || (("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.a) && "mcv5a".equals(AbstractC9004vJ2.b)) || !k(videoCapabilities, i2, i, d))) {
                j("sizeAndRate.support, " + i + "x" + i2 + "@" + d);
                return false;
            }
            AbstractC3305ay2.b("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i + "x" + i2 + "@" + d) + "] [" + this.a + ", " + this.b + "] [" + AbstractC9004vJ2.e + "]");
        }
        return true;
    }

    public final MediaCodecInfo.CodecProfileLevel[] h() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public final void j(String str) {
        AbstractC3305ay2.b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.a + ", " + this.b + "] [" + AbstractC9004vJ2.e + "]");
    }

    public final boolean l(C2485Ut1 c2485Ut1, boolean z) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair pairB = AbstractC6352lp3.b(c2485Ut1);
        if (pairB == null) {
            return true;
        }
        int iIntValue = ((Integer) pairB.first).intValue();
        int iIntValue2 = ((Integer) pairB.second).intValue();
        int i = 8;
        if ("video/dolby-vision".equals(c2485Ut1.l)) {
            if ("video/avc".equals(this.b)) {
                iIntValue2 = 0;
                iIntValue = 8;
            } else if ("video/hevc".equals(this.b)) {
                iIntValue2 = 0;
                iIntValue = 2;
            }
        }
        if (!this.h && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrH = h();
        if (AbstractC9004vJ2.a <= 23 && "video/x-vnd.on2.vp9".equals(this.b) && codecProfileLevelArrH.length == 0) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
            int iIntValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
            if (iIntValue3 >= 180000000) {
                i = 1024;
            } else if (iIntValue3 >= 120000000) {
                i = AdRequest.MAX_CONTENT_URL_LENGTH;
            } else if (iIntValue3 >= 60000000) {
                i = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            } else if (iIntValue3 >= 30000000) {
                i = 128;
            } else if (iIntValue3 >= 18000000) {
                i = 64;
            } else if (iIntValue3 >= 12000000) {
                i = 32;
            } else if (iIntValue3 >= 7200000) {
                i = 16;
            } else if (iIntValue3 < 3600000) {
                i = iIntValue3 >= 1800000 ? 4 : iIntValue3 >= 800000 ? 2 : 1;
            }
            MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
            codecProfileLevel.profile = 1;
            codecProfileLevel.level = i;
            codecProfileLevelArrH = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArrH) {
            if (codecProfileLevel2.profile == iIntValue && (codecProfileLevel2.level >= iIntValue2 || !z)) {
                if ("video/hevc".equals(this.b) && iIntValue == 2) {
                    String str = AbstractC9004vJ2.b;
                    if ("sailfish".equals(str) || "marlin".equals(str)) {
                    }
                }
                return true;
            }
        }
        j("codec.profileLevel, " + c2485Ut1.i + ", " + this.c);
        return false;
    }

    public final boolean m(C2485Ut1 c2485Ut1) {
        return this.b.equals(c2485Ut1.l) || this.b.equals(AbstractC6352lp3.e(c2485Ut1));
    }

    public final String toString() {
        return this.a;
    }
}
