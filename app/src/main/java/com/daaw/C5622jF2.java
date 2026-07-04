package com.daaw;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbw;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.jF2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5622jF2 {
    public final List a;
    public final String b;
    public final int c;
    public final String d;
    public final int e;
    public final long f;
    public final boolean g;
    public final String h;
    public final C5066hF2 i;
    public final Bundle j;
    public final String k;
    public final String l;
    public final String m;
    public final JSONObject n;
    public final String o;
    public final int p;

    public C5622jF2(JsonReader jsonReader) throws IOException {
        List listZzd = Collections.EMPTY_LIST;
        Bundle bundle = new Bundle();
        JSONObject jSONObject = new JSONObject();
        jsonReader.beginObject();
        String strNextString = "";
        String strNextString2 = "";
        String strNextString3 = strNextString2;
        String strNextString4 = strNextString3;
        String strNextString5 = strNextString4;
        String strNextString6 = strNextString5;
        C5066hF2 c5066hF2 = null;
        boolean zNextBoolean = false;
        int iNextInt = 0;
        int iNextInt2 = 0;
        long jNextLong = 0;
        int iMax = 1;
        String strNextString7 = strNextString6;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            String str = strNextString6;
            if ("nofill_urls".equals(strNextName)) {
                listZzd = zzbw.zzd(jsonReader);
            } else if ("refresh_interval".equals(strNextName)) {
                iNextInt = jsonReader.nextInt();
            } else if ("gws_query_id".equals(strNextName)) {
                strNextString = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(strNextName)) {
                strNextString2 = jsonReader.nextString();
            } else if ("is_idless".equals(strNextName)) {
                zNextBoolean = jsonReader.nextBoolean();
            } else if (DiagnosticsTracker.RESPONSE_CODE_KEY.equals(strNextName)) {
                iNextInt2 = jsonReader.nextInt();
            } else if ("latency".equals(strNextName)) {
                jNextLong = jsonReader.nextLong();
            } else {
                JSONObject jSONObject2 = jSONObject;
                if (((Boolean) zzba.zzc().b(AbstractC9820yE1.b8)).booleanValue() && "public_error".equals(strNextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    c5066hF2 = new C5066hF2(jsonReader);
                } else if ("bidding_data".equals(strNextName)) {
                    strNextString7 = jsonReader.nextString();
                } else {
                    if (((Boolean) zzba.zzc().b(AbstractC9820yE1.C9)).booleanValue() && AbstractC5345iF2.a(strNextName, "topics_should_record_observation")) {
                        jsonReader.nextBoolean();
                    } else if ("adapter_response_replacement_key".equals(strNextName)) {
                        strNextString6 = jsonReader.nextString();
                        jSONObject = jSONObject2;
                    } else if ("response_info_extras".equals(strNextName)) {
                        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.M6)).booleanValue()) {
                            try {
                                Bundle bundleZza = zzbw.zza(zzbw.zzh(jsonReader));
                                if (bundleZza != null) {
                                    bundle = bundleZza;
                                }
                            } catch (IOException | JSONException unused) {
                                strNextString6 = str;
                                jSONObject = jSONObject2;
                            } catch (IllegalStateException unused2) {
                                jsonReader.skipValue();
                                strNextString6 = str;
                                jSONObject = jSONObject2;
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestPostBody".equals(strNextName)) {
                        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.Y8)).booleanValue()) {
                            strNextString4 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestUrl".equals(strNextName)) {
                        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.Y8)).booleanValue()) {
                            strNextString3 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else {
                        AbstractC7582qE1 abstractC7582qE1 = AbstractC9820yE1.Z8;
                        if (((Boolean) zzba.zzc().b(abstractC7582qE1)).booleanValue() && AbstractC5345iF2.a(strNextName, "adResponseBody")) {
                            strNextString5 = jsonReader.nextString();
                        } else if (((Boolean) zzba.zzc().b(abstractC7582qE1)).booleanValue() && AbstractC5345iF2.a(strNextName, "adResponseHeaders")) {
                            jSONObject = zzbw.zzh(jsonReader);
                        } else {
                            if (AbstractC5345iF2.a(strNextName, "max_parallel_renderers")) {
                                iMax = Math.max(1, jsonReader.nextInt());
                            } else {
                                jsonReader.skipValue();
                            }
                            strNextString6 = str;
                            jSONObject = jSONObject2;
                        }
                    }
                    strNextString6 = str;
                    jSONObject = jSONObject2;
                }
                strNextString6 = str;
                jSONObject = jSONObject2;
            }
            strNextString6 = str;
        }
        jsonReader.endObject();
        this.a = listZzd;
        this.c = iNextInt;
        this.b = strNextString;
        this.d = strNextString2;
        this.e = iNextInt2;
        this.f = jNextLong;
        this.i = c5066hF2;
        this.g = zNextBoolean;
        this.h = strNextString7;
        this.j = bundle;
        this.k = strNextString3;
        this.l = strNextString4;
        this.m = strNextString5;
        this.n = jSONObject;
        this.o = strNextString6;
        C5344iF1 c5344iF1 = GF1.a;
        this.p = ((Long) c5344iF1.e()).longValue() > 0 ? ((Long) c5344iF1.e()).intValue() : iMax;
    }
}
