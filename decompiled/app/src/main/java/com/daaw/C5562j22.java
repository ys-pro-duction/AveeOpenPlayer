package com.daaw;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzac;
import com.google.android.gms.ads.internal.zzt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.j22, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5562j22 implements InterfaceC5648jL1 {
    public final Context a;
    public final C8068rz1 b;
    public final PowerManager c;

    public C5562j22(Context context, C8068rz1 c8068rz1) {
        this.a = context;
        this.b = c8068rz1;
        this.c = (PowerManager) context.getSystemService("power");
    }

    @Override // com.daaw.InterfaceC5648jL1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final JSONObject a(C6411m22 c6411m22) throws JSONException {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        C8912uz1 c8912uz1 = c6411m22.f;
        if (c8912uz1 == null) {
            jSONObject = new JSONObject();
        } else {
            if (this.b.d() == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z = c8912uz1.a;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("afmaVersion", this.b.b()).put("activeViewJSON", this.b.d()).put(DiagnosticsEntry.Event.TIMESTAMP_KEY, c6411m22.d).put("adFormat", this.b.a()).put("hashCode", this.b.c()).put("isMraid", false).put("isStopped", false).put("isPaused", c6411m22.b).put("isNative", this.b.e()).put("isScreenOn", this.c.isInteractive()).put("appMuted", zzt.zzr().zze()).put("appVolume", zzt.zzr().zza()).put("deviceVolume", zzac.zzb(this.a.getApplicationContext()));
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.E5)).booleanValue()) {
                AudioManager audioManager = (AudioManager) this.a.getApplicationContext().getSystemService("audio");
                Integer numValueOf = audioManager == null ? null : Integer.valueOf(audioManager.getMode());
                if (numValueOf != null) {
                    jSONObject3.put("audioMode", numValueOf);
                }
            }
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.a.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", c8912uz1.b).put("isAttachedToWindow", z).put("viewBox", new JSONObject().put("top", c8912uz1.c.top).put("bottom", c8912uz1.c.bottom).put("left", c8912uz1.c.left).put("right", c8912uz1.c.right)).put("adBox", new JSONObject().put("top", c8912uz1.d.top).put("bottom", c8912uz1.d.bottom).put("left", c8912uz1.d.left).put("right", c8912uz1.d.right)).put("globalVisibleBox", new JSONObject().put("top", c8912uz1.e.top).put("bottom", c8912uz1.e.bottom).put("left", c8912uz1.e.left).put("right", c8912uz1.e.right)).put("globalVisibleBoxVisible", c8912uz1.f).put("localVisibleBox", new JSONObject().put("top", c8912uz1.g.top).put("bottom", c8912uz1.g.bottom).put("left", c8912uz1.g.left).put("right", c8912uz1.g.right)).put("localVisibleBoxVisible", c8912uz1.h).put("hitBox", new JSONObject().put("top", c8912uz1.i.top).put("bottom", c8912uz1.i.bottom).put("left", c8912uz1.i.left).put("right", c8912uz1.i.right)).put("screenDensity", this.a.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", c6411m22.a);
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.n1)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = c8912uz1.k;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(c6411m22.e)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
