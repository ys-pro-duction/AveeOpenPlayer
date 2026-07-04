package com.revenuecat.purchases.common.caching;

import com.daaw.AbstractC4192e90;
import com.daaw.LQ;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class DeviceCache$productEntitlementMappingCacheKey$2 extends AbstractC4192e90 implements LQ {
    final /* synthetic */ DeviceCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceCache$productEntitlementMappingCacheKey$2(DeviceCache deviceCache) {
        super(0);
        this.this$0 = deviceCache;
    }

    @Override // com.daaw.LQ
    public final String invoke() {
        return this.this$0.getApiKeyPrefix() + ".productEntitlementMapping";
    }
}
