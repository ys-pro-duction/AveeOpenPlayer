package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.xV1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9609xV1 implements HI1 {
    public static final Integer b(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            AbstractC4274eT1.zzj("Precache invalid numeric parameter '" + str + "': " + ((String) map.get(str)));
            return null;
        }
    }

    @Override // com.daaw.HI1
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        AbstractC9330wV1 c10167zV1;
        int i;
        FU1 fu1 = (FU1) obj;
        if (AbstractC4274eT1.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            AbstractC4274eT1.zze("Precache GMSG: ".concat(jSONObject.toString()));
        }
        C7371pV1 c7371pV1Zzy = zzt.zzy();
        if (map.containsKey("abort")) {
            if (c7371pV1Zzy.q(fu1)) {
                return;
            }
            AbstractC4274eT1.zzj("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer numB = b(map, "periodicReportIntervalMs");
        Integer numB2 = b(map, "exoPlayerRenderingIntervalMs");
        Integer numB3 = b(map, "exoPlayerIdleIntervalMs");
        EU1 eu1 = new EU1((String) map.get("flags"));
        boolean z = eu1.l;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            C7092oV1 c7092oV1E = null;
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    i = 0;
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        try {
                            strArr2[i2] = jSONArray.getString(i2);
                        } catch (JSONException unused) {
                            AbstractC4274eT1.zzj("Malformed demuxed URL list for precache: ".concat(str2));
                            strArr = null;
                        }
                    }
                    strArr = strArr2;
                } catch (JSONException unused2) {
                    i = 0;
                }
            } else {
                i = 0;
            }
            if (strArr == null) {
                strArr = new String[1];
                strArr[i] = str;
            }
            if (z) {
                Iterator it = c7371pV1Zzy.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C7092oV1 c7092oV1 = (C7092oV1) it.next();
                    if (c7092oV1.c == fu1 && str.equals(c7092oV1.c())) {
                        c7092oV1E = c7092oV1;
                        break;
                    }
                }
            } else {
                c7092oV1E = c7371pV1Zzy.e(fu1);
            }
            if (c7092oV1E != null) {
                AbstractC4274eT1.zzj("Precache task is already running.");
                return;
            }
            if (fu1.zzj() == null) {
                AbstractC4274eT1.zzj("Precache requires a dependency provider.");
                return;
            }
            Integer numB4 = b(map, "player");
            if (numB4 == null) {
                numB4 = Integer.valueOf(i);
            }
            if (numB != null) {
                fu1.P(numB.intValue());
            }
            if (numB2 != null) {
                fu1.w0(numB2.intValue());
            }
            if (numB3 != null) {
                fu1.t0(numB3.intValue());
            }
            int iIntValue = numB4.intValue();
            C3725cV1 c3725cV1 = fu1.zzj().zzb;
            if (iIntValue > 0) {
                int i3 = eu1.h;
                int iQ = AbstractC7646qU1.Q();
                c10167zV1 = iQ < i3 ? new FV1(fu1, eu1) : iQ < eu1.b ? new CV1(fu1, eu1) : new AV1(fu1);
            } else {
                c10167zV1 = new C10167zV1(fu1);
            }
            new C7092oV1(fu1, c10167zV1, str, strArr).zzb();
        } else {
            C7092oV1 c7092oV1E2 = c7371pV1Zzy.e(fu1);
            if (c7092oV1E2 == null) {
                AbstractC4274eT1.zzj("Precache must specify a source.");
                return;
            }
            c10167zV1 = c7092oV1E2.d;
        }
        Integer numB5 = b(map, "minBufferMs");
        if (numB5 != null) {
            c10167zV1.u(numB5.intValue());
        }
        Integer numB6 = b(map, "maxBufferMs");
        if (numB6 != null) {
            c10167zV1.t(numB6.intValue());
        }
        Integer numB7 = b(map, "bufferForPlaybackMs");
        if (numB7 != null) {
            c10167zV1.r(numB7.intValue());
        }
        Integer numB8 = b(map, "bufferForPlaybackAfterRebufferMs");
        if (numB8 != null) {
            c10167zV1.s(numB8.intValue());
        }
    }
}
