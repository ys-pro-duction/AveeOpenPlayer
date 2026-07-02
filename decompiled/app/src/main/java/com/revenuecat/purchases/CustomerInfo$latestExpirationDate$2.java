package com.revenuecat.purchases;

import com.daaw.AbstractC1188In;
import com.daaw.AbstractC2455Um;
import com.daaw.AbstractC4192e90;
import com.daaw.LQ;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/util/Date;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class CustomerInfo$latestExpirationDate$2 extends AbstractC4192e90 implements LQ {
    final /* synthetic */ CustomerInfo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerInfo$latestExpirationDate$2(CustomerInfo customerInfo) {
        super(0);
        this.this$0 = customerInfo;
    }

    @Override // com.daaw.LQ
    public final Date invoke() {
        List listH0 = AbstractC2455Um.H0(this.this$0.getAllExpirationDatesByProduct().values(), new Comparator() { // from class: com.revenuecat.purchases.CustomerInfo$latestExpirationDate$2$invoke$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return AbstractC1188In.a((Date) t, (Date) t2);
            }
        });
        if (listH0.isEmpty()) {
            listH0 = null;
        }
        if (listH0 != null) {
            return (Date) AbstractC2455Um.p0(listH0);
        }
        return null;
    }
}
