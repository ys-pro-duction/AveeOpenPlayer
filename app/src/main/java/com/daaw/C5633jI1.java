package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.jI1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5633jI1 implements HI1 {
    @Override // com.daaw.HI1
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        InterfaceC9334wW1 interfaceC9334wW1 = (InterfaceC9334wW1) obj;
        if (TextUtils.isEmpty((CharSequence) map.get("appId"))) {
            zze.zza("Missing App Id, cannot show LMD Overlay without it");
            return;
        }
        AbstractC4251eN2 abstractC4251eN2L = AbstractC5377iN2.l();
        abstractC4251eN2L.b((String) map.get("appId"));
        abstractC4251eN2L.h(interfaceC9334wW1.getWidth());
        abstractC4251eN2L.g(interfaceC9334wW1.h().getWindowToken());
        if (map.containsKey("gravityX") && map.containsKey("gravityY")) {
            abstractC4251eN2L.d(Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY")));
        } else {
            abstractC4251eN2L.d(81);
        }
        if (map.containsKey("verticalMargin")) {
            abstractC4251eN2L.e(Float.parseFloat((String) map.get("verticalMargin")));
        } else {
            abstractC4251eN2L.e(0.02f);
        }
        if (map.containsKey("enifd")) {
            abstractC4251eN2L.a((String) map.get("enifd"));
        }
        try {
            zzt.zzj().zzj(interfaceC9334wW1, abstractC4251eN2L.i());
        } catch (NullPointerException e) {
            zzt.zzo().u(e, "DefaultGmsgHandlers.ShowLMDOverlay");
            zze.zza("Missing parameters for LMD Overlay show request");
        }
    }
}
