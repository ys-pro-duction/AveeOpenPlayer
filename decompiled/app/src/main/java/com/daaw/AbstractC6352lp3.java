package com.daaw;

import android.media.MediaCodecInfo;
import android.util.Pair;
import com.google.android.gms.ads.AdRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: com.daaw.lp3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6352lp3 {
    public static final Pattern a = Pattern.compile("^\\D?(\\d+)$");
    public static final HashMap b = new HashMap();
    public static int c = -1;

    public static int a() {
        int i;
        int i2 = c;
        if (i2 != -1) {
            return i2;
        }
        int iMax = 0;
        Fo3 fo3C = c("video/avc", false, false);
        if (fo3C != null) {
            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrH = fo3C.h();
            int length = codecProfileLevelArrH.length;
            int iMax2 = 0;
            while (iMax < length) {
                int i3 = codecProfileLevelArrH[iMax].level;
                if (i3 != 1 && i3 != 2) {
                    switch (i3) {
                        case 8:
                        case 16:
                        case 32:
                            i = 101376;
                            break;
                        case 64:
                            i = 202752;
                            break;
                        case 128:
                        case PSKKeyManager.MAX_KEY_LENGTH_BYTES /* 256 */:
                            i = 414720;
                            break;
                        case AdRequest.MAX_CONTENT_URL_LENGTH /* 512 */:
                            i = 921600;
                            break;
                        case 1024:
                            i = 1310720;
                            break;
                        case 2048:
                        case 4096:
                            i = 2097152;
                            break;
                        case 8192:
                            i = 2228224;
                            break;
                        case 16384:
                            i = 5652480;
                            break;
                        case 32768:
                        case 65536:
                            i = 9437184;
                            break;
                        case 131072:
                        case 262144:
                        case 524288:
                            i = 35651584;
                            break;
                        default:
                            i = -1;
                            break;
                    }
                } else {
                    i = 25344;
                }
                iMax2 = Math.max(i, iMax2);
                iMax++;
            }
            iMax = Math.max(iMax2, AbstractC9004vJ2.a >= 21 ? 345600 : 172800);
        }
        c = iMax;
        return iMax;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:141:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x041e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair b(com.daaw.C2485Ut1 r26) {
        /*
            Method dump skipped, instruction units count: 2462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC6352lp3.b(com.daaw.Ut1):android.util.Pair");
    }

    public static Fo3 c(String str, boolean z, boolean z2) {
        List listG = g(str, false, false);
        if (listG.isEmpty()) {
            return null;
        }
        return (Fo3) listG.get(0);
    }

    public static Fo3 d() {
        return c("audio/raw", false, false);
    }

    public static String e(C2485Ut1 c2485Ut1) {
        Pair pairB;
        if ("audio/eac3-joc".equals(c2485Ut1.l)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(c2485Ut1.l) || (pairB = b(c2485Ut1)) == null) {
            return null;
        }
        int iIntValue = ((Integer) pairB.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return "video/hevc";
        }
        if (iIntValue == 512) {
            return "video/avc";
        }
        return null;
    }

    public static List f(Uo3 uo3, C2485Ut1 c2485Ut1, boolean z, boolean z2) {
        String strE = e(c2485Ut1);
        return strE == null ? OP2.J() : g(strE, z, z2);
    }

    public static synchronized List g(String str, boolean z, boolean z2) {
        try {
            Zo3 zo3 = new Zo3(str, z, z2);
            HashMap map = b;
            List list = (List) map.get(zo3);
            if (list != null) {
                return list;
            }
            int i = AbstractC9004vJ2.a;
            ArrayList arrayListJ = j(zo3, i >= 21 ? new C4668fp3(z, z2) : new C4379ep3(null));
            if (z && arrayListJ.isEmpty() && i >= 21 && i <= 23) {
                arrayListJ = j(zo3, new C4379ep3(null));
                if (!arrayListJ.isEmpty()) {
                    AbstractC3305ay2.f("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((Fo3) arrayListJ.get(0)).a);
                }
            }
            if ("audio/raw".equals(str)) {
                if (i < 26 && AbstractC9004vJ2.b.equals("R9") && arrayListJ.size() == 1 && ((Fo3) arrayListJ.get(0)).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    arrayListJ.add(Fo3.c("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                }
                k(arrayListJ, new InterfaceC4947gp3() { // from class: com.daaw.Wo3
                    @Override // com.daaw.InterfaceC4947gp3
                    public final int zza(Object obj) {
                        Pattern pattern = AbstractC6352lp3.a;
                        String str2 = ((Fo3) obj).a;
                        if (str2.startsWith("OMX.google") || str2.startsWith("c2.android")) {
                            return 1;
                        }
                        return (AbstractC9004vJ2.a >= 26 || !str2.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
                    }
                });
            }
            if (i < 21 && arrayListJ.size() > 1) {
                String str2 = ((Fo3) arrayListJ.get(0)).a;
                if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                    k(arrayListJ, new InterfaceC4947gp3() { // from class: com.daaw.Xo3
                        @Override // com.daaw.InterfaceC4947gp3
                        public final int zza(Object obj) {
                            Pattern pattern = AbstractC6352lp3.a;
                            return ((Fo3) obj).a.startsWith("OMX.google") ? 1 : 0;
                        }
                    });
                }
            }
            if (i < 32 && arrayListJ.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((Fo3) arrayListJ.get(0)).a)) {
                arrayListJ.add((Fo3) arrayListJ.remove(0));
            }
            OP2 op2H = OP2.H(arrayListJ);
            map.put(zo3, op2H);
            return op2H;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static List h(Uo3 uo3, C2485Ut1 c2485Ut1, boolean z, boolean z2) {
        List listG = g(c2485Ut1.l, z, z2);
        List listF = f(uo3, c2485Ut1, z, z2);
        LP2 lp2 = new LP2();
        lp2.i(listG);
        lp2.i(listF);
        return lp2.j();
    }

    public static List i(List list, final C2485Ut1 c2485Ut1) {
        ArrayList arrayList = new ArrayList(list);
        k(arrayList, new InterfaceC4947gp3() { // from class: com.daaw.Yo3
            @Override // com.daaw.InterfaceC4947gp3
            public final int zza(Object obj) {
                Pattern pattern = AbstractC6352lp3.a;
                return ((Fo3) obj).d(c2485Ut1) ? 1 : 0;
            }
        });
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01f2 A[Catch: Exception -> 0x01f9, TryCatch #2 {Exception -> 0x01f9, blocks: (B:120:0x01c1, B:126:0x01d8, B:132:0x01ec, B:134:0x01f2, B:138:0x0202), top: B:195:0x01c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0202 A[Catch: Exception -> 0x01f9, TRY_LEAVE, TryCatch #2 {Exception -> 0x01f9, blocks: (B:120:0x01c1, B:126:0x01d8, B:132:0x01ec, B:134:0x01f2, B:138:0x0202), top: B:195:0x01c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0217 A[Catch: Exception -> 0x021c, TryCatch #1 {Exception -> 0x021c, blocks: (B:143:0x020d, B:145:0x0217, B:157:0x0246, B:148:0x0221, B:150:0x0231, B:152:0x0239), top: B:193:0x020d }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0221 A[Catch: Exception -> 0x021c, TryCatch #1 {Exception -> 0x021c, blocks: (B:143:0x020d, B:145:0x0217, B:157:0x0246, B:148:0x0221, B:150:0x0231, B:152:0x0239), top: B:193:0x020d }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x029c A[Catch: Exception -> 0x0034, TRY_ENTER, TryCatch #4 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001c, B:7:0x0026, B:13:0x0037, B:17:0x0045, B:23:0x0056, B:25:0x005e, B:27:0x0066, B:29:0x006e, B:31:0x0076, B:33:0x007e, B:37:0x008c, B:39:0x0094, B:41:0x009c, B:43:0x00a4, B:45:0x00ae, B:47:0x00b6, B:49:0x00be, B:51:0x00c6, B:53:0x00ce, B:55:0x00d6, B:57:0x00de, B:61:0x00ec, B:63:0x00f4, B:65:0x00fc, B:67:0x0106, B:69:0x010e, B:71:0x0114, B:73:0x011c, B:76:0x0126, B:78:0x012e, B:82:0x013a, B:84:0x0142, B:86:0x014a, B:88:0x0152, B:179:0x0294, B:182:0x029c, B:184:0x02a2, B:185:0x02bc, B:186:0x02dd, B:91:0x015b, B:92:0x015e, B:94:0x0166, B:97:0x0171, B:99:0x0179, B:104:0x0187, B:106:0x018f, B:109:0x019a, B:111:0x01a2, B:114:0x01ad, B:116:0x01b5), top: B:199:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x024f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02bc A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList j(com.daaw.Zo3 r23, com.daaw.InterfaceC3822cp3 r24) throws com.daaw.C3544bp3 {
        /*
            Method dump skipped, instruction units count: 748
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC6352lp3.j(com.daaw.Zo3, com.daaw.cp3):java.util.ArrayList");
    }

    public static void k(List list, final InterfaceC4947gp3 interfaceC4947gp3) {
        Collections.sort(list, new Comparator() { // from class: com.daaw.Vo3
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                Pattern pattern = AbstractC6352lp3.a;
                InterfaceC4947gp3 interfaceC4947gp32 = interfaceC4947gp3;
                return interfaceC4947gp32.zza(obj2) - interfaceC4947gp32.zza(obj);
            }
        });
    }

    public static boolean l(MediaCodecInfo mediaCodecInfo, String str) {
        if (AbstractC9004vJ2.a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (AbstractC5959kT1.f(str)) {
            return true;
        }
        String strA = ON2.a(mediaCodecInfo.getName());
        if (strA.startsWith("arc.")) {
            return false;
        }
        if (strA.startsWith("omx.google.") || strA.startsWith("omx.ffmpeg.") || ((strA.startsWith("omx.sec.") && strA.contains(".sw.")) || strA.equals("omx.qcom.video.decoder.hevcswvdec") || strA.startsWith("c2.android.") || strA.startsWith("c2.google."))) {
            return true;
        }
        return (strA.startsWith("omx.") || strA.startsWith("c2.")) ? false : true;
    }
}
