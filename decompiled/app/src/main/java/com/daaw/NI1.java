package com.daaw;

import com.google.android.gms.ads.internal.zzb;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class NI1 implements HI1 {
    public static final Map d = AbstractC1184Im.d(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});
    public final zzb a;
    public final AN1 b;
    public final HN1 c;

    public NI1(zzb zzbVar, AN1 an1, HN1 hn1) {
        this.a = zzbVar;
        this.b = an1;
        this.c = hn1;
    }

    @Override // com.daaw.HI1
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        InterfaceC9334wW1 interfaceC9334wW1 = (InterfaceC9334wW1) obj;
        int iIntValue = ((Integer) d.get((String) map.get("a"))).intValue();
        int i = 6;
        if (iIntValue != 5) {
            if (iIntValue != 7) {
                zzb zzbVar = this.a;
                if (!zzbVar.zzc()) {
                    zzbVar.zzb(null);
                    return;
                }
                if (iIntValue == 1) {
                    this.b.i(map);
                    return;
                }
                if (iIntValue == 3) {
                    new DN1(interfaceC9334wW1, map).i();
                    return;
                }
                if (iIntValue == 4) {
                    new C9856yN1(interfaceC9334wW1, map).j();
                    return;
                } else if (iIntValue != 5) {
                    if (iIntValue == 6) {
                        this.b.h(true);
                        return;
                    } else if (iIntValue != 7) {
                        AbstractC4274eT1.zzi("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.c.zzc();
            return;
        }
        String str = (String) map.get("forceOrientation");
        boolean z = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
        if (interfaceC9334wW1 == null) {
            AbstractC4274eT1.zzj("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            i = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            i = z ? -1 : 14;
        }
        interfaceC9334wW1.X(i);
    }
}
