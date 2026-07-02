package com.revenuecat.purchases;

import com.daaw.G10;
import com.revenuecat.purchases.models.StoreProduct;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/revenuecat/purchases/Package;", "", "identifier", "", "packageType", "Lcom/revenuecat/purchases/PackageType;", "product", "Lcom/revenuecat/purchases/models/StoreProduct;", "offering", "(Ljava/lang/String;Lcom/revenuecat/purchases/PackageType;Lcom/revenuecat/purchases/models/StoreProduct;Ljava/lang/String;)V", "getIdentifier", "()Ljava/lang/String;", "getOffering", "getPackageType", "()Lcom/revenuecat/purchases/PackageType;", "getProduct", "()Lcom/revenuecat/purchases/models/StoreProduct;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class Package {
    private final String identifier;
    private final String offering;
    private final PackageType packageType;
    private final StoreProduct product;

    public Package(String str, PackageType packageType, StoreProduct storeProduct, String str2) {
        G10.g(str, "identifier");
        G10.g(packageType, "packageType");
        G10.g(storeProduct, "product");
        G10.g(str2, "offering");
        this.identifier = str;
        this.packageType = packageType;
        this.product = storeProduct;
        this.offering = str2;
    }

    public static /* synthetic */ Package copy$default(Package r0, String str, PackageType packageType, StoreProduct storeProduct, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = r0.identifier;
        }
        if ((i & 2) != 0) {
            packageType = r0.packageType;
        }
        if ((i & 4) != 0) {
            storeProduct = r0.product;
        }
        if ((i & 8) != 0) {
            str2 = r0.offering;
        }
        return r0.copy(str, packageType, storeProduct, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PackageType getPackageType() {
        return this.packageType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final StoreProduct getProduct() {
        return this.product;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOffering() {
        return this.offering;
    }

    public final Package copy(String identifier, PackageType packageType, StoreProduct product, String offering) {
        G10.g(identifier, "identifier");
        G10.g(packageType, "packageType");
        G10.g(product, "product");
        G10.g(offering, "offering");
        return new Package(identifier, packageType, product, offering);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Package)) {
            return false;
        }
        Package r5 = (Package) other;
        return G10.c(this.identifier, r5.identifier) && this.packageType == r5.packageType && G10.c(this.product, r5.product) && G10.c(this.offering, r5.offering);
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getOffering() {
        return this.offering;
    }

    public final PackageType getPackageType() {
        return this.packageType;
    }

    public final StoreProduct getProduct() {
        return this.product;
    }

    public int hashCode() {
        return (((((this.identifier.hashCode() * 31) + this.packageType.hashCode()) * 31) + this.product.hashCode()) * 31) + this.offering.hashCode();
    }

    public String toString() {
        return "Package(identifier=" + this.identifier + ", packageType=" + this.packageType + ", product=" + this.product + ", offering=" + this.offering + ')';
    }
}
