package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.lV1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6255lV1 implements HI1 {
    @Override // com.daaw.HI1
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        FU1 fu1 = (FU1) obj;
        UW1 uw1Zzq = fu1.zzq();
        if (uw1Zzq == null) {
            try {
                UW1 uw1 = new UW1(fu1, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                fu1.s(uw1);
                uw1Zzq = uw1;
            } catch (NullPointerException e) {
                e = e;
                Throwable th = e;
                AbstractC4274eT1.zzh("Unable to parse videoMeta message.", th);
                zzt.zzo().u(th, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e2) {
                e = e2;
                Throwable th2 = e;
                AbstractC4274eT1.zzh("Unable to parse videoMeta message.", th2);
                zzt.zzo().u(th2, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float f = Float.parseFloat((String) map.get("duration"));
        boolean zEquals = "1".equals(map.get("muted"));
        float f2 = Float.parseFloat((String) map.get("currentTime"));
        int i = Integer.parseInt((String) map.get("playbackState"));
        int i2 = 0;
        if (i >= 0 && i <= 3) {
            i2 = i;
        }
        String str = (String) map.get("aspectRatio");
        float f3 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (AbstractC4274eT1.zzm(3)) {
            AbstractC4274eT1.zze("Video Meta GMSG: currentTime : " + f2 + " , duration : " + f + " , isMuted : " + zEquals + " , playbackState : " + i2 + " , aspectRatio : " + str);
        }
        uw1Zzq.Z2(f2, f, i2, zEquals, f3);
    }
}
