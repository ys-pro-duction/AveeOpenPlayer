package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class EU1 {
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final long n;
    public final long o;

    public EU1(String str) {
        String string;
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.a = a(jSONObject, "aggressive_media_codec_release", AbstractC9820yE1.J);
        this.b = b(jSONObject, "byte_buffer_precache_limit", AbstractC9820yE1.l);
        this.c = b(jSONObject, "exo_cache_buffer_size", AbstractC9820yE1.w);
        this.d = b(jSONObject, "exo_connect_timeout_millis", AbstractC9820yE1.h);
        AbstractC7582qE1 abstractC7582qE1 = AbstractC9820yE1.g;
        if (jSONObject != null) {
            try {
                string = jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
                string = (String) zzba.zzc().b(abstractC7582qE1);
            }
        } else {
            string = (String) zzba.zzc().b(abstractC7582qE1);
        }
        this.e = string;
        this.f = b(jSONObject, "exo_read_timeout_millis", AbstractC9820yE1.i);
        this.g = b(jSONObject, "load_check_interval_bytes", AbstractC9820yE1.j);
        this.h = b(jSONObject, "player_precache_limit", AbstractC9820yE1.k);
        this.i = b(jSONObject, "socket_receive_buffer_size", AbstractC9820yE1.m);
        this.j = a(jSONObject, "use_cache_data_source", AbstractC9820yE1.e4);
        b(jSONObject, "min_retry_count", AbstractC9820yE1.n);
        this.k = a(jSONObject, "treat_load_exception_as_non_fatal", AbstractC9820yE1.q);
        this.l = a(jSONObject, "enable_multiple_video_playback", AbstractC9820yE1.P1);
        this.m = a(jSONObject, "use_range_http_data_source", AbstractC9820yE1.R1);
        this.n = c(jSONObject, "range_http_data_source_high_water_mark", AbstractC9820yE1.S1);
        this.o = c(jSONObject, "range_http_data_source_low_water_mark", AbstractC9820yE1.T1);
    }

    public static final boolean a(JSONObject jSONObject, String str, AbstractC7582qE1 abstractC7582qE1) {
        boolean zBooleanValue = ((Boolean) zzba.zzc().b(abstractC7582qE1)).booleanValue();
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return zBooleanValue;
    }

    public static final int b(JSONObject jSONObject, String str, AbstractC7582qE1 abstractC7582qE1) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) zzba.zzc().b(abstractC7582qE1)).intValue();
    }

    public static final long c(JSONObject jSONObject, String str, AbstractC7582qE1 abstractC7582qE1) {
        if (jSONObject != null) {
            try {
                return jSONObject.getLong(str);
            } catch (JSONException unused) {
            }
        }
        return ((Long) zzba.zzc().b(abstractC7582qE1)).longValue();
    }
}
