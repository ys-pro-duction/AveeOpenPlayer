package com.google.android.gms.ads.internal.util;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Range;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzcn {
    public static List b;
    public static final Map a = new HashMap();
    public static final Object c = new Object();

    public static Integer[] a(Range range) {
        return new Integer[]{(Integer) range.getLower(), (Integer) range.getUpper()};
    }

    public static List zza(String str) {
        ArrayList arrayList;
        Object obj = c;
        synchronized (obj) {
            Map map = a;
            if (map.containsKey(str)) {
                return (List) map.get(str);
            }
            try {
                synchronized (obj) {
                    try {
                        if (b == null) {
                            b = Arrays.asList(new MediaCodecList(0).getCodecInfos());
                        }
                        arrayList = new ArrayList();
                        for (MediaCodecInfo mediaCodecInfo : b) {
                            if (!mediaCodecInfo.isEncoder() && Arrays.asList(mediaCodecInfo.getSupportedTypes()).contains(str)) {
                                HashMap map2 = new HashMap();
                                map2.put("codecName", mediaCodecInfo.getName());
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                                ArrayList arrayList2 = new ArrayList();
                                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                                    arrayList2.add(new Integer[]{Integer.valueOf(codecProfileLevel.profile), Integer.valueOf(codecProfileLevel.level)});
                                }
                                map2.put("profileLevels", arrayList2);
                                int i = Build.VERSION.SDK_INT;
                                MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                                map2.put("bitRatesBps", a(videoCapabilities.getBitrateRange()));
                                map2.put("widthAlignment", Integer.valueOf(videoCapabilities.getWidthAlignment()));
                                map2.put("heightAlignment", Integer.valueOf(videoCapabilities.getHeightAlignment()));
                                map2.put("frameRates", a(videoCapabilities.getSupportedFrameRates()));
                                map2.put("widths", a(videoCapabilities.getSupportedWidths()));
                                map2.put("heights", a(videoCapabilities.getSupportedHeights()));
                                if (i >= 23) {
                                    map2.put("instancesLimit", Integer.valueOf(capabilitiesForType.getMaxSupportedInstances()));
                                }
                                arrayList.add(map2);
                            }
                        }
                        a.put(str, arrayList);
                    } finally {
                    }
                }
                return arrayList;
            } catch (LinkageError e) {
                e = e;
                HashMap map3 = new HashMap();
                map3.put("error", e.getClass().getSimpleName());
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(map3);
                a.put(str, arrayList3);
                return arrayList3;
            } catch (RuntimeException e2) {
                e = e2;
                HashMap map32 = new HashMap();
                map32.put("error", e.getClass().getSimpleName());
                ArrayList arrayList32 = new ArrayList();
                arrayList32.add(map32);
                a.put(str, arrayList32);
                return arrayList32;
            }
        }
    }
}
