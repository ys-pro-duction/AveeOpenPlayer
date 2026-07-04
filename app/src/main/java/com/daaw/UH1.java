package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class UH1 implements HI1 {
    @Override // com.daaw.HI1
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        InterfaceC9334wW1 interfaceC9334wW1 = (InterfaceC9334wW1) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get(DiagnosticsEntry.Event.TIMESTAMP_KEY);
            if (TextUtils.isEmpty(str2)) {
                AbstractC4274eT1.zzj("No label given for CSI tick.");
                return;
            }
            if (TextUtils.isEmpty(str4)) {
                AbstractC4274eT1.zzj("No timestamp given for CSI tick.");
                return;
            }
            try {
                long jB = zzt.zzB().b() + (Long.parseLong(str4) - zzt.zzB().a());
                if (true == TextUtils.isEmpty(str3)) {
                    str3 = "native:view_load";
                }
                interfaceC9334wW1.zzm().c(str2, str3, jB);
                return;
            } catch (NumberFormatException e) {
                AbstractC4274eT1.zzk("Malformed timestamp for CSI tick.", e);
                return;
            }
        }
        if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                AbstractC4274eT1.zzj("No value given for CSI experiment.");
                return;
            } else {
                interfaceC9334wW1.zzm().a().d("e", str5);
                return;
            }
        }
        if ("extra".equals(str)) {
            String str6 = (String) map.get("name");
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                AbstractC4274eT1.zzj("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                AbstractC4274eT1.zzj("No name given for CSI extra.");
            } else {
                interfaceC9334wW1.zzm().a().d(str6, str7);
            }
        }
    }
}
