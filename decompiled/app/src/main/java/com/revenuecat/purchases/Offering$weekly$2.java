package com.revenuecat.purchases;

import com.daaw.AbstractC4192e90;
import com.daaw.LQ;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/Package;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class Offering$weekly$2 extends AbstractC4192e90 implements LQ {
    final /* synthetic */ Offering this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Offering$weekly$2(Offering offering) {
        super(0);
        this.this$0 = offering;
    }

    @Override // com.daaw.LQ
    public final Package invoke() {
        return this.this$0.findPackage(PackageType.WEEKLY);
    }
}
