package com.daaw;

import android.media.MediaCodecInfo;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Eo3 {
    public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            String str = AbstractC9004vJ2.b;
            if (!str.equals("sabrina") && !str.equals("boreal")) {
                String str2 = AbstractC9004vJ2.d;
                if (!str2.startsWith("Lenovo TB-X605") && !str2.startsWith("Lenovo TB-X606") && !str2.startsWith("Lenovo TB-X616")) {
                    MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointA = Do3.a(i, i2, (int) d);
                    for (int i3 = 0; i3 < supportedPerformancePoints.size(); i3++) {
                        if (Bo3.a(supportedPerformancePoints.get(i3)).covers(performancePointA)) {
                            return 2;
                        }
                    }
                    return 1;
                }
            }
        }
        return 0;
    }
}
