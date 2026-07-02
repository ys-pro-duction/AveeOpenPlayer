package com.revenuecat.purchases.common;

import com.daaw.AbstractC1473Lg0;
import com.daaw.G10;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PackageType;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.strings.OfferingStrings;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bH\u0007J(\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bJ4\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b2\u0006\u0010\u0012\u001a\u00020\tH\u0007J,\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b2\u0006\u0010\u0011\u001a\u00020\u0006H$¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/common/OfferingParser;", "", "()V", "createOffering", "Lcom/revenuecat/purchases/Offering;", "offeringJson", "Lorg/json/JSONObject;", "productsById", "", "", "", "Lcom/revenuecat/purchases/models/StoreProduct;", "createOfferings", "Lcom/revenuecat/purchases/Offerings;", "offeringsJson", "createPackage", "Lcom/revenuecat/purchases/Package;", "packageJson", "offeringIdentifier", "findMatchingProduct", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class OfferingParser {
    public final Offering createOffering(JSONObject offeringJson, Map<String, ? extends List<? extends StoreProduct>> productsById) throws JSONException {
        Map mapH;
        G10.g(offeringJson, "offeringJson");
        G10.g(productsById, "productsById");
        String string = offeringJson.getString("identifier");
        JSONObject jSONObjectOptJSONObject = offeringJson.optJSONObject("metadata");
        if (jSONObjectOptJSONObject == null || (mapH = JSONObjectExtensionsKt.toMap(jSONObjectOptJSONObject, true)) == null) {
            mapH = AbstractC1473Lg0.h();
        }
        JSONArray jSONArray = offeringJson.getJSONArray("packages");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            G10.f(jSONObject, "packageJson");
            G10.f(string, "offeringIdentifier");
            Package packageCreatePackage = createPackage(jSONObject, productsById, string);
            if (packageCreatePackage != null) {
                arrayList.add(packageCreatePackage);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        G10.f(string, "offeringIdentifier");
        String string2 = offeringJson.getString("description");
        G10.f(string2, "offeringJson.getString(\"description\")");
        return new Offering(string, string2, mapH, arrayList);
    }

    public final Offerings createOfferings(JSONObject offeringsJson, Map<String, ? extends List<? extends StoreProduct>> productsById) throws JSONException {
        G10.g(offeringsJson, "offeringsJson");
        G10.g(productsById, "productsById");
        JSONArray jSONArray = offeringsJson.getJSONArray("offerings");
        String string = offeringsJson.getString("current_offering_id");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            G10.f(jSONObject, "offeringJson");
            Offering offeringCreateOffering = createOffering(jSONObject, productsById);
            if (offeringCreateOffering != null) {
                linkedHashMap.put(offeringCreateOffering.getIdentifier(), offeringCreateOffering);
                if (offeringCreateOffering.getAvailablePackages().isEmpty()) {
                    String str = String.format(OfferingStrings.OFFERING_EMPTY, Arrays.copyOf(new Object[]{offeringCreateOffering.getIdentifier()}, 1));
                    G10.f(str, "format(this, *args)");
                    LogUtilsKt.warnLog(str);
                }
            }
        }
        return new Offerings((Offering) linkedHashMap.get(string), linkedHashMap);
    }

    public final Package createPackage(JSONObject packageJson, Map<String, ? extends List<? extends StoreProduct>> productsById, String offeringIdentifier) throws JSONException {
        G10.g(packageJson, "packageJson");
        G10.g(productsById, "productsById");
        G10.g(offeringIdentifier, "offeringIdentifier");
        String string = packageJson.getString("identifier");
        StoreProduct storeProductFindMatchingProduct = findMatchingProduct(productsById, packageJson);
        G10.f(string, "packageIdentifier");
        PackageType packageType = OfferingParserKt.toPackageType(string);
        if (storeProductFindMatchingProduct != null) {
            return new Package(string, packageType, storeProductFindMatchingProduct.copyWithOfferingId(offeringIdentifier), offeringIdentifier);
        }
        return null;
    }

    public abstract StoreProduct findMatchingProduct(Map<String, ? extends List<? extends StoreProduct>> productsById, JSONObject packageJson);
}
