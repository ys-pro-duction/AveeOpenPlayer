package com.daaw;

/* JADX INFO: renamed from: com.daaw.Fh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0853Fh0 {
    public static final String[] a = {"Constant", "Beat", "TotalTime", "TotalTimeBackward", "TotalTimeWhenPlaying", "TotalTimeAndBeat", "TrackPosition", "BeatRandomShake", "BeatCamShakeRotMore", "BeatCamShakeRotLess", "ConstantShakeRotMore", "ConstantShakeRotLess", "PeakBarIndex", "BeatTriggerAnim"};
    public static final String[] b = {"Constant", "Beat", "TotalTime", "TotalTimeBackward", "TotalTimeWhenPlaying", "TotalTimeAndBeat", "TrackPosition", "BeatRandomShake", "BeatCamShakeMore", "BeatCamShakeLess", "ConstantShakeMore", "ConstantShake"};
    public static final String[] c = {"Nothing", "Beat", "TotalTime", "TotalTimeBackward", "TotalTimeWhenPlaying", "TotalTimeAndBeat", "TrackPosition", "BeatRandomShake", "BeatCamShakeRotMore", "BeatCamShakeRotLess", "ConstantShakeRotMore", "ConstantShakeRotLess", "BeatTriggerAnim"};
    public static final a[] d = {new a("IsPlaying", "", ""), new a("Constant", "X", "Y"), new a("Nothing", "X", "Y"), new a("Beat", "X Amount", "Y Amount"), new a("TotalTime", "X Speed", "Y Speed"), new a("TotalTimeBackward", "X Speed", "Y Speed"), new a("TotalTimeWhenPlaying", "X Speed", "Y Speed"), new a("TotalTimeAndBeat", "Speed", "Beat Amount", true), new a("TrackPosition", "Amount", "Amount"), new a("BeatRandomShake", "Amount", "Speed", true), new a("BeatCamShakeMore", "Amount", "Speed", true), new a("BeatCamShakeLess", "Amount", "Speed", true), new a("BeatCamShakeRotMore", "Amount", "Speed", true), new a("BeatCamShakeRotLess", "Amount", "Speed", true), new a("ConstantShake", "Amount", "Speed", true), new a("ConstantShake", "Amount", "Speed", true), new a("ConstantShakeRotMore", "Amount", "Speed", true), new a("ConstantShakeRotLess", "Amount", "Speed", true), new a("PeakBarIndex", "Amount", "Smoothness", true), new a("BeatTriggerAnim", "Threshold", "Speed", true)};

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(java.lang.String r2) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC0853Fh0.a(java.lang.String):int");
    }

    public static String b(String str) {
        a aVarE = e(str);
        if (aVarE != null) {
            return aVarE.b;
        }
        return null;
    }

    public static String c(String str) {
        a aVarE = e(str);
        if (aVarE != null) {
            return aVarE.c;
        }
        return null;
    }

    public static boolean d(String str) {
        a aVarE = e(str);
        if (aVarE != null) {
            return aVarE.d;
        }
        return false;
    }

    public static a e(String str) {
        int i = 0;
        while (true) {
            a[] aVarArr = d;
            if (i >= aVarArr.length) {
                return null;
            }
            if (aVarArr[i].a.equals(str)) {
                return aVarArr[i];
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Fh0$a */
    public static class a {
        public final String a;
        public final String b;
        public final String c;
        public boolean d;

        public a(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = false;
        }

        public a(String str, String str2, String str3, boolean z) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = z;
        }
    }
}
