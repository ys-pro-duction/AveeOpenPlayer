package com.revenuecat.purchases.subscriberattributes;

import com.daaw.AbstractC1473Lg0;
import com.daaw.AbstractC4192e90;
import com.daaw.C0576Cs0;
import com.daaw.D61;
import com.daaw.G10;
import com.daaw.NQ;
import com.daaw.SP0;
import com.daaw.UP0;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u0000\u001a\u001c\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0006*\u00020\u0004H\u0000\u001a0\u0010\u0007\u001a&\u0012\b\u0012\u00060\u0002j\u0002`\b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u00060\u0001j\u0002`\t*\u00020\u0004H\u0000¨\u0006\n"}, d2 = {"buildLegacySubscriberAttributes", "", "", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttribute;", "Lorg/json/JSONObject;", "buildSubscriberAttributesMap", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributeMap;", "buildSubscriberAttributesMapPerUser", "Lcom/revenuecat/purchases/subscriberattributes/caching/AppUserID;", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesPerAppUserIDMap;", "purchases_defaultsRelease"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class SubscriberAttributesFactoriesKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesFactoriesKt$buildSubscriberAttributesMap$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0016\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "kotlin.jvm.PlatformType", "attributeKey", "Lcom/daaw/Cs0;", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttribute;", "invoke", "(Ljava/lang/String;)Lcom/daaw/Cs0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class AnonymousClass1 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ JSONObject $this_buildSubscriberAttributesMap;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(JSONObject jSONObject) {
            super(1);
            this.$this_buildSubscriberAttributesMap = jSONObject;
        }

        @Override // com.daaw.NQ
        public final C0576Cs0 invoke(String str) throws JSONException {
            Object obj = this.$this_buildSubscriberAttributesMap.get(str);
            G10.e(obj, "null cannot be cast to non-null type org.json.JSONObject");
            return D61.a(str, new SubscriberAttribute((JSONObject) obj));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesFactoriesKt$buildSubscriberAttributesMapPerUser$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00060\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "kotlin.jvm.PlatformType", "userId", "Lcom/daaw/Cs0;", "", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttribute;", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributeMap;", "invoke", "(Ljava/lang/String;)Lcom/daaw/Cs0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103691 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ JSONObject $attributesJSONObject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103691(JSONObject jSONObject) {
            super(1);
            this.$attributesJSONObject = jSONObject;
        }

        @Override // com.daaw.NQ
        public final C0576Cs0 invoke(String str) throws JSONException {
            Object obj = this.$attributesJSONObject.get(str);
            G10.e(obj, "null cannot be cast to non-null type org.json.JSONObject");
            return D61.a(str, SubscriberAttributesFactoriesKt.buildSubscriberAttributesMap((JSONObject) obj));
        }
    }

    public static final Map<String, SubscriberAttribute> buildLegacySubscriberAttributes(JSONObject jSONObject) throws JSONException {
        G10.g(jSONObject, "<this>");
        JSONObject jSONObject2 = jSONObject.getJSONObject("attributes");
        G10.f(jSONObject2, "attributesJSONObject");
        return buildSubscriberAttributesMap(jSONObject2);
    }

    public static final Map<String, SubscriberAttribute> buildSubscriberAttributesMap(JSONObject jSONObject) {
        G10.g(jSONObject, "<this>");
        Iterator<String> itKeys = jSONObject.keys();
        G10.f(itKeys, "this.keys()");
        return AbstractC1473Lg0.r(UP0.t(SP0.c(itKeys), new AnonymousClass1(jSONObject)));
    }

    public static final Map<String, Map<String, SubscriberAttribute>> buildSubscriberAttributesMapPerUser(JSONObject jSONObject) throws JSONException {
        G10.g(jSONObject, "<this>");
        JSONObject jSONObject2 = jSONObject.getJSONObject("attributes");
        Iterator<String> itKeys = jSONObject2.keys();
        G10.f(itKeys, "attributesJSONObject.keys()");
        return AbstractC1473Lg0.r(UP0.t(SP0.c(itKeys), new C103691(jSONObject2)));
    }
}
