package com.revenuecat.purchases.common;

import com.daaw.G10;
import com.daaw.LE;
import com.daaw.OE;
import com.daaw.PE;
import java.util.Date;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a&\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lcom/daaw/LE$a;", "Ljava/util/Date;", "startTime", "endTime", "Lcom/daaw/LE;", "between", "(Lcom/daaw/LE$a;Ljava/util/Date;Ljava/util/Date;)J", "purchases_defaultsRelease"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class DurationExtensionsKt {
    public static final long between(LE.a aVar, Date date, Date date2) {
        G10.g(aVar, "<this>");
        G10.g(date, "startTime");
        G10.g(date2, "endTime");
        return OE.p(date2.getTime() - date.getTime(), PE.E);
    }
}
