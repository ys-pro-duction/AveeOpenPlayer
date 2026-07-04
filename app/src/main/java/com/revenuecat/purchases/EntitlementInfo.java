package com.revenuecat.purchases;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC2911Yw;
import com.daaw.AbstractC8813ug;
import com.daaw.G10;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.models.RawDataContainer;
import com.revenuecat.purchases.utils.JSONObjectParceler;
import java.util.Date;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0091\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cB\u0089\u0001\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0003¢\u0006\u0004\b\u001b\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\"H\u0096\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b)\u0010!J\u0010\u0010*\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b,\u0010+J\u0010\u0010-\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b1\u00100J\u0012\u00102\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b2\u00100J\u0010\u00103\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b5\u0010!J\u0012\u00106\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b6\u0010!J\u0010\u00107\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b7\u0010+J\u0012\u00108\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b8\u00100J\u0012\u00109\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b9\u00100J\u0010\u0010:\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u0019HÆ\u0003¢\u0006\u0004\b<\u0010=J¸\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u0019HÆ\u0001¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020&HÖ\u0001¢\u0006\u0004\b@\u0010(J \u0010E\u001a\u00020D2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020&HÖ\u0001¢\u0006\u0004\bE\u0010FR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010G\u001a\u0004\bH\u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010I\u001a\u0004\b\u0007\u0010+R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010I\u001a\u0004\bJ\u0010+R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010K\u001a\u0004\bL\u0010.R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010M\u001a\u0004\bN\u00100R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010M\u001a\u0004\bO\u00100R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010M\u001a\u0004\bP\u00100R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010Q\u001a\u0004\bR\u00104R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010G\u001a\u0004\bS\u0010!R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010G\u001a\u0004\bT\u0010!R\u0017\u0010\u0013\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010I\u001a\u0004\b\u0013\u0010+R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010M\u001a\u0004\bU\u00100R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010M\u001a\u0004\bV\u00100R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010W\u001a\u0004\bX\u0010;R\u0014\u0010\u0018\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010YR\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010Z\u001a\u0004\b[\u0010=R\u001a\u0010_\u001a\u00020\u00038VX\u0096\u0004¢\u0006\f\u0012\u0004\b]\u0010^\u001a\u0004\b\\\u0010\u001f¨\u0006`"}, d2 = {"Lcom/revenuecat/purchases/EntitlementInfo;", "Landroid/os/Parcelable;", "Lcom/revenuecat/purchases/models/RawDataContainer;", "Lorg/json/JSONObject;", "", "identifier", "", "isActive", "willRenew", "Lcom/revenuecat/purchases/PeriodType;", "periodType", "Ljava/util/Date;", "latestPurchaseDate", "originalPurchaseDate", "expirationDate", "Lcom/revenuecat/purchases/Store;", ProductResponseJsonKeys.STORE, "productIdentifier", "productPlanIdentifier", "isSandbox", "unsubscribeDetectedAt", "billingIssueDetectedAt", "Lcom/revenuecat/purchases/OwnershipType;", "ownershipType", "jsonObject", "Lcom/revenuecat/purchases/VerificationResult;", "verification", "<init>", "(Ljava/lang/String;ZZLcom/revenuecat/purchases/PeriodType;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lcom/revenuecat/purchases/Store;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lcom/revenuecat/purchases/OwnershipType;Lorg/json/JSONObject;Lcom/revenuecat/purchases/VerificationResult;)V", "(Ljava/lang/String;ZZLcom/revenuecat/purchases/PeriodType;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lcom/revenuecat/purchases/Store;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lcom/revenuecat/purchases/OwnershipType;Lorg/json/JSONObject;)V", "component15", "()Lorg/json/JSONObject;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "component1", "component2", "()Z", "component3", "component4", "()Lcom/revenuecat/purchases/PeriodType;", "component5", "()Ljava/util/Date;", "component6", "component7", "component8", "()Lcom/revenuecat/purchases/Store;", "component9", "component10", "component11", "component12", "component13", "component14", "()Lcom/revenuecat/purchases/OwnershipType;", "component16", "()Lcom/revenuecat/purchases/VerificationResult;", "copy", "(Ljava/lang/String;ZZLcom/revenuecat/purchases/PeriodType;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lcom/revenuecat/purchases/Store;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lcom/revenuecat/purchases/OwnershipType;Lorg/json/JSONObject;Lcom/revenuecat/purchases/VerificationResult;)Lcom/revenuecat/purchases/EntitlementInfo;", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lcom/daaw/G91;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getIdentifier", "Z", "getWillRenew", "Lcom/revenuecat/purchases/PeriodType;", "getPeriodType", "Ljava/util/Date;", "getLatestPurchaseDate", "getOriginalPurchaseDate", "getExpirationDate", "Lcom/revenuecat/purchases/Store;", "getStore", "getProductIdentifier", "getProductPlanIdentifier", "getUnsubscribeDetectedAt", "getBillingIssueDetectedAt", "Lcom/revenuecat/purchases/OwnershipType;", "getOwnershipType", "Lorg/json/JSONObject;", "Lcom/revenuecat/purchases/VerificationResult;", "getVerification", "getRawData", "getRawData$annotations", "()V", "rawData", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class EntitlementInfo implements Parcelable, RawDataContainer<JSONObject> {
    public static final Parcelable.Creator<EntitlementInfo> CREATOR = new Creator();
    private final Date billingIssueDetectedAt;
    private final Date expirationDate;
    private final String identifier;
    private final boolean isActive;
    private final boolean isSandbox;
    private final JSONObject jsonObject;
    private final Date latestPurchaseDate;
    private final Date originalPurchaseDate;
    private final OwnershipType ownershipType;
    private final PeriodType periodType;
    private final String productIdentifier;
    private final String productPlanIdentifier;
    private final Store store;
    private final Date unsubscribeDetectedAt;
    private final VerificationResult verification;
    private final boolean willRenew;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EntitlementInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EntitlementInfo createFromParcel(Parcel parcel) {
            G10.g(parcel, "parcel");
            return new EntitlementInfo(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, PeriodType.valueOf(parcel.readString()), (Date) parcel.readSerializable(), (Date) parcel.readSerializable(), (Date) parcel.readSerializable(), Store.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (Date) parcel.readSerializable(), (Date) parcel.readSerializable(), OwnershipType.valueOf(parcel.readString()), JSONObjectParceler.INSTANCE.create(parcel), VerificationResult.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EntitlementInfo[] newArray(int i) {
            return new EntitlementInfo[i];
        }
    }

    public EntitlementInfo(String str, boolean z, boolean z2, PeriodType periodType, Date date, Date date2, Date date3, Store store, String str2, String str3, boolean z3, Date date4, Date date5, OwnershipType ownershipType, JSONObject jSONObject, VerificationResult verificationResult) {
        G10.g(str, "identifier");
        G10.g(periodType, "periodType");
        G10.g(date, "latestPurchaseDate");
        G10.g(date2, "originalPurchaseDate");
        G10.g(store, ProductResponseJsonKeys.STORE);
        G10.g(str2, "productIdentifier");
        G10.g(ownershipType, "ownershipType");
        G10.g(jSONObject, "jsonObject");
        G10.g(verificationResult, "verification");
        this.identifier = str;
        this.isActive = z;
        this.willRenew = z2;
        this.periodType = periodType;
        this.latestPurchaseDate = date;
        this.originalPurchaseDate = date2;
        this.expirationDate = date3;
        this.store = store;
        this.productIdentifier = str2;
        this.productPlanIdentifier = str3;
        this.isSandbox = z3;
        this.unsubscribeDetectedAt = date4;
        this.billingIssueDetectedAt = date5;
        this.ownershipType = ownershipType;
        this.jsonObject = jSONObject;
        this.verification = verificationResult;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    private final JSONObject getJsonObject() {
        return this.jsonObject;
    }

    public static /* synthetic */ void getRawData$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getProductPlanIdentifier() {
        return this.productPlanIdentifier;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getIsSandbox() {
        return this.isSandbox;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Date getUnsubscribeDetectedAt() {
        return this.unsubscribeDetectedAt;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Date getBillingIssueDetectedAt() {
        return this.billingIssueDetectedAt;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final OwnershipType getOwnershipType() {
        return this.ownershipType;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final VerificationResult getVerification() {
        return this.verification;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getWillRenew() {
        return this.willRenew;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PeriodType getPeriodType() {
        return this.periodType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Date getLatestPurchaseDate() {
        return this.latestPurchaseDate;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Date getOriginalPurchaseDate() {
        return this.originalPurchaseDate;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Date getExpirationDate() {
        return this.expirationDate;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Store getStore() {
        return this.store;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getProductIdentifier() {
        return this.productIdentifier;
    }

    public final EntitlementInfo copy(String identifier, boolean isActive, boolean willRenew, PeriodType periodType, Date latestPurchaseDate, Date originalPurchaseDate, Date expirationDate, Store store, String productIdentifier, String productPlanIdentifier, boolean isSandbox, Date unsubscribeDetectedAt, Date billingIssueDetectedAt, OwnershipType ownershipType, JSONObject jsonObject, VerificationResult verification) {
        G10.g(identifier, "identifier");
        G10.g(periodType, "periodType");
        G10.g(latestPurchaseDate, "latestPurchaseDate");
        G10.g(originalPurchaseDate, "originalPurchaseDate");
        G10.g(store, ProductResponseJsonKeys.STORE);
        G10.g(productIdentifier, "productIdentifier");
        G10.g(ownershipType, "ownershipType");
        G10.g(jsonObject, "jsonObject");
        G10.g(verification, "verification");
        return new EntitlementInfo(identifier, isActive, willRenew, periodType, latestPurchaseDate, originalPurchaseDate, expirationDate, store, productIdentifier, productPlanIdentifier, isSandbox, unsubscribeDetectedAt, billingIssueDetectedAt, ownershipType, jsonObject, verification);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!G10.c(EntitlementInfo.class, other != null ? other.getClass() : null)) {
            return false;
        }
        G10.e(other, "null cannot be cast to non-null type com.revenuecat.purchases.EntitlementInfo");
        EntitlementInfo entitlementInfo = (EntitlementInfo) other;
        return G10.c(this.identifier, entitlementInfo.identifier) && this.isActive == entitlementInfo.isActive && this.willRenew == entitlementInfo.willRenew && this.periodType == entitlementInfo.periodType && G10.c(this.latestPurchaseDate, entitlementInfo.latestPurchaseDate) && G10.c(this.originalPurchaseDate, entitlementInfo.originalPurchaseDate) && G10.c(this.expirationDate, entitlementInfo.expirationDate) && this.store == entitlementInfo.store && G10.c(this.productIdentifier, entitlementInfo.productIdentifier) && G10.c(this.productPlanIdentifier, entitlementInfo.productPlanIdentifier) && this.isSandbox == entitlementInfo.isSandbox && G10.c(this.unsubscribeDetectedAt, entitlementInfo.unsubscribeDetectedAt) && G10.c(this.billingIssueDetectedAt, entitlementInfo.billingIssueDetectedAt) && this.ownershipType == entitlementInfo.ownershipType && this.verification == entitlementInfo.verification;
    }

    public final Date getBillingIssueDetectedAt() {
        return this.billingIssueDetectedAt;
    }

    public final Date getExpirationDate() {
        return this.expirationDate;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final Date getLatestPurchaseDate() {
        return this.latestPurchaseDate;
    }

    public final Date getOriginalPurchaseDate() {
        return this.originalPurchaseDate;
    }

    public final OwnershipType getOwnershipType() {
        return this.ownershipType;
    }

    public final PeriodType getPeriodType() {
        return this.periodType;
    }

    public final String getProductIdentifier() {
        return this.productIdentifier;
    }

    public final String getProductPlanIdentifier() {
        return this.productPlanIdentifier;
    }

    public final Store getStore() {
        return this.store;
    }

    public final Date getUnsubscribeDetectedAt() {
        return this.unsubscribeDetectedAt;
    }

    public final VerificationResult getVerification() {
        return this.verification;
    }

    public final boolean getWillRenew() {
        return this.willRenew;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.identifier.hashCode() * 31) + AbstractC8813ug.a(this.isActive)) * 31) + AbstractC8813ug.a(this.willRenew)) * 31) + this.periodType.hashCode()) * 31) + this.latestPurchaseDate.hashCode()) * 31) + this.originalPurchaseDate.hashCode()) * 31;
        Date date = this.expirationDate;
        int iHashCode2 = (((((iHashCode + (date != null ? date.hashCode() : 0)) * 31) + this.store.hashCode()) * 31) + this.productIdentifier.hashCode()) * 31;
        String str = this.productPlanIdentifier;
        int iHashCode3 = (((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + AbstractC8813ug.a(this.isSandbox)) * 31;
        Date date2 = this.unsubscribeDetectedAt;
        int iHashCode4 = (iHashCode3 + (date2 != null ? date2.hashCode() : 0)) * 31;
        Date date3 = this.billingIssueDetectedAt;
        return ((iHashCode4 + (date3 != null ? date3.hashCode() : 0)) * 31) + this.ownershipType.hashCode();
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final boolean isSandbox() {
        return this.isSandbox;
    }

    public String toString() {
        return "EntitlementInfo(identifier='" + this.identifier + "', isActive=" + this.isActive + ", willRenew=" + this.willRenew + ", periodType=" + this.periodType + ", latestPurchaseDate=" + this.latestPurchaseDate + ", originalPurchaseDate=" + this.originalPurchaseDate + ", expirationDate=" + this.expirationDate + ", store=" + this.store + ", productIdentifier='" + this.productIdentifier + "', productPlanIdentifier='" + this.productPlanIdentifier + "', isSandbox=" + this.isSandbox + ", unsubscribeDetectedAt=" + this.unsubscribeDetectedAt + ", billingIssueDetectedAt=" + this.billingIssueDetectedAt + ", ownershipType=" + this.ownershipType + ", verification=" + this.verification + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        G10.g(parcel, "out");
        parcel.writeString(this.identifier);
        parcel.writeInt(this.isActive ? 1 : 0);
        parcel.writeInt(this.willRenew ? 1 : 0);
        parcel.writeString(this.periodType.name());
        parcel.writeSerializable(this.latestPurchaseDate);
        parcel.writeSerializable(this.originalPurchaseDate);
        parcel.writeSerializable(this.expirationDate);
        parcel.writeString(this.store.name());
        parcel.writeString(this.productIdentifier);
        parcel.writeString(this.productPlanIdentifier);
        parcel.writeInt(this.isSandbox ? 1 : 0);
        parcel.writeSerializable(this.unsubscribeDetectedAt);
        parcel.writeSerializable(this.billingIssueDetectedAt);
        parcel.writeString(this.ownershipType.name());
        JSONObjectParceler.INSTANCE.write(this.jsonObject, parcel, flags);
        parcel.writeString(this.verification.name());
    }

    @Override // com.revenuecat.purchases.models.RawDataContainer
    public JSONObject getRawData() {
        return this.jsonObject;
    }

    public /* synthetic */ EntitlementInfo(String str, boolean z, boolean z2, PeriodType periodType, Date date, Date date2, Date date3, Store store, String str2, String str3, boolean z3, Date date4, Date date5, OwnershipType ownershipType, JSONObject jSONObject, VerificationResult verificationResult, int i, AbstractC2911Yw abstractC2911Yw) {
        this(str, z, z2, periodType, date, date2, date3, store, str2, str3, z3, date4, date5, ownershipType, jSONObject, (i & 32768) != 0 ? VerificationResult.NOT_REQUESTED : verificationResult);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EntitlementInfo(String str, boolean z, boolean z2, PeriodType periodType, Date date, Date date2, Date date3, Store store, String str2, String str3, boolean z3, Date date4, Date date5, OwnershipType ownershipType, JSONObject jSONObject) {
        this(str, z, z2, periodType, date, date2, date3, store, str2, str3, z3, date4, date5, ownershipType, jSONObject, VerificationResult.NOT_REQUESTED);
        G10.g(str, "identifier");
        G10.g(periodType, "periodType");
        G10.g(date, "latestPurchaseDate");
        G10.g(date2, "originalPurchaseDate");
        G10.g(store, ProductResponseJsonKeys.STORE);
        G10.g(str2, "productIdentifier");
        G10.g(ownershipType, "ownershipType");
        G10.g(jSONObject, "jsonObject");
    }
}
