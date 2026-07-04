package com.revenuecat.purchases.common;

import com.daaw.AY0;
import com.daaw.G10;
import com.revenuecat.purchases.PackageType;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"toPackageType", "Lcom/revenuecat/purchases/PackageType;", "", "purchases_defaultsRelease"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class OfferingParserKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final PackageType toPackageType(String str) {
        PackageType packageType;
        PackageType[] packageTypeArrValues = PackageType.values();
        int length = packageTypeArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                packageType = null;
                break;
            }
            packageType = packageTypeArrValues[i];
            if (G10.c(packageType.getIdentifier(), str)) {
                break;
            }
            i++;
        }
        return packageType == null ? AY0.u(str, "$rc_", false, 2, null) ? PackageType.UNKNOWN : PackageType.CUSTOM : packageType;
    }
}
