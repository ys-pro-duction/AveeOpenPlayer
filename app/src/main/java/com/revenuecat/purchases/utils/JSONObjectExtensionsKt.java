package com.revenuecat.purchases.utils;

import com.daaw.AbstractC1473Lg0;
import com.daaw.AbstractC4192e90;
import com.daaw.C0576Cs0;
import com.daaw.D61;
import com.daaw.G10;
import com.daaw.KP0;
import com.daaw.NQ;
import com.daaw.SP0;
import com.daaw.UP0;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0000\u001a\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0016\u0010\b\u001a\u0004\u0018\u00010\u0004*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0000\u001a*\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u000b\u0018\u00010\n\"\u0004\b\u0000\u0010\u000b*\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\rH\u0000¨\u0006\u000e"}, d2 = {"getDate", "Ljava/util/Date;", "Lorg/json/JSONObject;", "jsonKey", "", "getNullableString", "name", "optDate", "optNullableString", "toMap", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "deep", "", "purchases_defaultsRelease"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class JSONObjectExtensionsKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.utils.JSONObjectExtensionsKt$toMap$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0016\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "kotlin.jvm.PlatformType", "jsonKey", "Lcom/daaw/Cs0;", "invoke", "(Ljava/lang/String;)Lcom/daaw/Cs0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class AnonymousClass1 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ boolean $deep;
        final /* synthetic */ JSONObject $this_toMap;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, JSONObject jSONObject) {
            super(1);
            this.$deep = z;
            this.$this_toMap = jSONObject;
        }

        @Override // com.daaw.NQ
        public final C0576Cs0 invoke(String str) throws JSONException {
            if (!this.$deep) {
                return D61.a(str, this.$this_toMap.get(str));
            }
            Object list = this.$this_toMap.get(str);
            if (list instanceof JSONObject) {
                list = JSONObjectExtensionsKt.toMap((JSONObject) list, true);
            } else if (list instanceof JSONArray) {
                list = JSONArrayExtensionsKt.toList((JSONArray) list);
            }
            return D61.a(str, list);
        }
    }

    public static final Date getDate(JSONObject jSONObject, String str) {
        G10.g(jSONObject, "<this>");
        G10.g(str, "jsonKey");
        Date date = Iso8601Utils.parse(jSONObject.getString(str));
        G10.f(date, "parse(getString(jsonKey))");
        return date;
    }

    public static final String getNullableString(JSONObject jSONObject, String str) {
        G10.g(jSONObject, "<this>");
        G10.g(str, "name");
        if (jSONObject.isNull(str)) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return jSONObject.getString(str);
        }
        return null;
    }

    public static final Date optDate(JSONObject jSONObject, String str) {
        G10.g(jSONObject, "<this>");
        G10.g(str, "jsonKey");
        if (jSONObject.isNull(str)) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return getDate(jSONObject, str);
        }
        return null;
    }

    public static final String optNullableString(JSONObject jSONObject, String str) {
        G10.g(jSONObject, "<this>");
        G10.g(str, "name");
        if (!jSONObject.has(str)) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return getNullableString(jSONObject, str);
        }
        return null;
    }

    public static final <T> Map<String, T> toMap(JSONObject jSONObject, boolean z) {
        KP0 kp0C;
        KP0 kp0T;
        G10.g(jSONObject, "<this>");
        Iterator<String> itKeys = jSONObject.keys();
        if (itKeys == null || (kp0C = SP0.c(itKeys)) == null || (kp0T = UP0.t(kp0C, new AnonymousClass1(z, jSONObject))) == null) {
            return null;
        }
        return AbstractC1473Lg0.r(kp0T);
    }

    public static /* synthetic */ Map toMap$default(JSONObject jSONObject, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return toMap(jSONObject, z);
    }
}
