package com.daaw;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzcn;
import com.google.android.gms.ads.internal.util.zze;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.kV1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5967kV1 implements HI1 {
    public boolean a;

    public static int b(Context context, Map map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                zzay.zzb();
                i = XS1.B(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                AbstractC4274eT1.zzj("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        if (zze.zzc()) {
            zze.zza("Parse pixels for " + str + ", got string " + str2 + ", int " + i + ".");
        }
        return i;
    }

    public static void c(C6809nU1 c6809nU1, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                c6809nU1.d(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                AbstractC4274eT1.zzj(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2));
                return;
            }
        }
        if (str2 != null) {
            c6809nU1.c(Integer.parseInt(str2));
        }
        if (str3 != null) {
            c6809nU1.B(Integer.parseInt(str3));
        }
        if (str4 != null) {
            c6809nU1.C(Integer.parseInt(str4));
        }
        if (str5 != null) {
            c6809nU1.f(Integer.parseInt(str5));
        }
    }

    @Override // com.daaw.HI1
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        int iMin;
        int iMin2;
        int i;
        Integer numValueOf;
        FU1 fu1 = (FU1) obj;
        String str = (String) map.get("action");
        if (str == null) {
            AbstractC4274eT1.zzj("Action missing from video GMSG.");
            return;
        }
        Integer numValueOf2 = map.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map.get("playerId"))) : null;
        Integer numB = fu1.zzo() != null ? fu1.zzo().b() : null;
        if (numValueOf2 != null && numB != null && !numValueOf2.equals(numB) && !str.equals("load")) {
            AbstractC4274eT1.zzi(String.format(Locale.US, "Event intended for player %s, but sent to player %d - event ignored", numValueOf2, numB));
            return;
        }
        if (AbstractC4274eT1.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            AbstractC4274eT1.zze("Video GMSG: " + str + " " + jSONObject.toString());
        }
        if ("background".equals(str)) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                AbstractC4274eT1.zzj("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                fu1.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                AbstractC4274eT1.zzj("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if ("playerBackground".equals(str)) {
            String str3 = (String) map.get("color");
            if (TextUtils.isEmpty(str3)) {
                AbstractC4274eT1.zzj("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                fu1.A(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused2) {
                AbstractC4274eT1.zzj("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        if ("decoderProps".equals(str)) {
            String str4 = (String) map.get("mimeTypes");
            if (str4 == null) {
                AbstractC4274eT1.zzj("No MIME types specified for decoder properties inspection.");
                HashMap map2 = new HashMap();
                map2.put("event", "decoderProps");
                map2.put("error", "missingMimeTypes");
                fu1.U("onVideoEvent", map2);
                return;
            }
            HashMap map3 = new HashMap();
            for (String str5 : str4.split(",")) {
                map3.put(str5, zzcn.zza(str5.trim()));
            }
            HashMap map4 = new HashMap();
            map4.put("event", "decoderProps");
            map4.put("mimeTypes", map3);
            fu1.U("onVideoEvent", map4);
            return;
        }
        C7088oU1 c7088oU1Zzo = fu1.zzo();
        if (c7088oU1Zzo == null) {
            AbstractC4274eT1.zzj("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean zEquals = "new".equals(str);
        boolean zEquals2 = "position".equals(str);
        if (zEquals || zEquals2) {
            Context context = fu1.getContext();
            int iB = b(context, map, "x", 0);
            int iB2 = b(context, map, "y", 0);
            int iB3 = b(context, map, "w", -1);
            AbstractC7582qE1 abstractC7582qE1 = AbstractC9820yE1.H3;
            if (((Boolean) zzba.zzc().b(abstractC7582qE1)).booleanValue()) {
                iMin = iB3 == -1 ? fu1.zzh() : Math.min(iB3, fu1.zzh());
            } else {
                if (zze.zzc()) {
                    zze.zza("Calculate width with original width " + iB3 + ", videoHost.getVideoBoundingWidth() " + fu1.zzh() + ", x " + iB + ".");
                }
                iMin = Math.min(iB3, fu1.zzh() - iB);
            }
            int i2 = iMin;
            int iB4 = b(context, map, "h", -1);
            if (((Boolean) zzba.zzc().b(abstractC7582qE1)).booleanValue()) {
                iMin2 = iB4 == -1 ? fu1.zzg() : Math.min(iB4, fu1.zzg());
            } else {
                if (zze.zzc()) {
                    zze.zza("Calculate height with original height " + iB4 + ", videoHost.getVideoBoundingHeight() " + fu1.zzg() + ", y " + iB2 + ".");
                }
                iMin2 = Math.min(iB4, fu1.zzg() - iB2);
            }
            int i3 = iMin2;
            try {
                i = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused3) {
                i = 0;
            }
            boolean z = Boolean.parseBoolean((String) map.get("spherical"));
            if (!zEquals || c7088oU1Zzo.a() != null) {
                c7088oU1Zzo.c(iB, iB2, i2, i3);
                return;
            }
            c7088oU1Zzo.d(iB, iB2, i2, i3, i, z, new EU1((String) map.get("flags")));
            C6809nU1 c6809nU1A = c7088oU1Zzo.a();
            if (c6809nU1A != null) {
                c(c6809nU1A, map);
                return;
            }
            return;
        }
        UW1 uw1Zzq = fu1.zzq();
        if (uw1Zzq != null) {
            if ("timeupdate".equals(str)) {
                String str6 = (String) map.get("currentTime");
                if (str6 == null) {
                    AbstractC4274eT1.zzj("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    uw1Zzq.d3(Float.parseFloat(str6));
                    return;
                } catch (NumberFormatException unused4) {
                    AbstractC4274eT1.zzj("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                    return;
                }
            }
            if ("skip".equals(str)) {
                uw1Zzq.zzu();
                return;
            }
        }
        C6809nU1 c6809nU1A2 = c7088oU1Zzo.a();
        if (c6809nU1A2 == null) {
            HashMap map5 = new HashMap();
            map5.put("event", "no_video_view");
            fu1.U("onVideoEvent", map5);
            return;
        }
        if ("click".equals(str)) {
            Context context2 = fu1.getContext();
            int iB5 = b(context2, map, "x", 0);
            float fB = b(context2, map, "y", 0);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, iB5, fB, 0);
            c6809nU1A2.A(motionEventObtain);
            motionEventObtain.recycle();
            return;
        }
        if ("currentTime".equals(str)) {
            String str7 = (String) map.get("time");
            if (str7 == null) {
                AbstractC4274eT1.zzj("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                c6809nU1A2.z((int) (Float.parseFloat(str7) * 1000.0f));
                return;
            } catch (NumberFormatException unused5) {
                AbstractC4274eT1.zzj("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                return;
            }
        }
        if ("hide".equals(str)) {
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.G)).booleanValue()) {
                c6809nU1A2.setVisibility(8);
                return;
            } else {
                c6809nU1A2.setVisibility(4);
                return;
            }
        }
        if ("load".equals(str)) {
            c6809nU1A2.u(numValueOf2);
            return;
        }
        if ("loadControl".equals(str)) {
            c(c6809nU1A2, map);
            return;
        }
        if ("muted".equals(str)) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                c6809nU1A2.v();
                return;
            } else {
                c6809nU1A2.k();
                return;
            }
        }
        if ("pause".equals(str)) {
            c6809nU1A2.x();
            return;
        }
        if ("play".equals(str)) {
            c6809nU1A2.y();
            return;
        }
        if ("show".equals(str)) {
            c6809nU1A2.setVisibility(0);
            return;
        }
        if ("src".equals(str)) {
            String str8 = (String) map.get("src");
            if (map.containsKey("periodicReportIntervalMs")) {
                try {
                    numValueOf = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                } catch (NumberFormatException unused6) {
                    AbstractC4274eT1.zzj("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
                    numValueOf = null;
                }
            } else {
                numValueOf = null;
            }
            String[] strArr = {str8};
            String str9 = (String) map.get("demuxed");
            if (str9 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str9);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                        strArr2[i4] = jSONArray.getString(i4);
                    }
                    strArr = strArr2;
                } catch (JSONException unused7) {
                    AbstractC4274eT1.zzj("Malformed demuxed URL list for playback: ".concat(str9));
                    strArr = new String[]{str8};
                }
            }
            if (numValueOf != null) {
                fu1.P(numValueOf.intValue());
            }
            c6809nU1A2.g(str8, strArr);
            return;
        }
        if ("touchMove".equals(str)) {
            Context context3 = fu1.getContext();
            c6809nU1A2.j(b(context3, map, "dx", 0), b(context3, map, "dy", 0));
            if (this.a) {
                return;
            }
            fu1.zzu();
            this.a = true;
            return;
        }
        if (!"volume".equals(str)) {
            if ("watermark".equals(str)) {
                c6809nU1A2.q();
                return;
            } else {
                AbstractC4274eT1.zzj("Unknown video action: ".concat(str));
                return;
            }
        }
        String str10 = (String) map.get("volume");
        if (str10 == null) {
            AbstractC4274eT1.zzj("Level parameter missing from volume video GMSG.");
            return;
        }
        try {
            c6809nU1A2.i(Float.parseFloat(str10));
        } catch (NumberFormatException unused8) {
            AbstractC4274eT1.zzj("Could not parse volume parameter from volume video GMSG: ".concat(str10));
        }
    }
}
