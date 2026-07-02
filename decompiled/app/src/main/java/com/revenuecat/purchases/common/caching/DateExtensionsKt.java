package com.revenuecat.purchases.common.caching;

import com.daaw.G10;
import com.daaw.LE;
import com.daaw.OE;
import com.daaw.PE;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.strings.ReceiptStrings;
import java.util.Arrays;
import java.util.Date;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a'\u0010\u0005\u001a\u00020\u0001*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\u0005\u001a\u00020\u0001*\u0004\u0018\u00010\u00002\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\"\u0017\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0017\u0010\r\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\r\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Ljava/util/Date;", "", "appInBackground", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "isCacheStale", "(Ljava/util/Date;ZLcom/revenuecat/purchases/common/DateProvider;)Z", "Lcom/daaw/LE;", "cacheDuration", "isCacheStale-8Mi8wO0", "(Ljava/util/Date;JLcom/revenuecat/purchases/common/DateProvider;)Z", "CACHE_REFRESH_PERIOD_IN_FOREGROUND", "J", "CACHE_REFRESH_PERIOD_IN_BACKGROUND", "purchases_defaultsRelease"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class DateExtensionsKt {
    private static final long CACHE_REFRESH_PERIOD_IN_BACKGROUND;
    private static final long CACHE_REFRESH_PERIOD_IN_FOREGROUND;

    static {
        LE.a aVar = LE.B;
        CACHE_REFRESH_PERIOD_IN_FOREGROUND = OE.o(5, PE.G);
        CACHE_REFRESH_PERIOD_IN_BACKGROUND = OE.o(25, PE.H);
    }

    public static final boolean isCacheStale(Date date, boolean z, DateProvider dateProvider) {
        G10.g(dateProvider, "dateProvider");
        if (date == null) {
            return true;
        }
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(ReceiptStrings.CHECKING_IF_CACHE_STALE, Arrays.copyOf(new Object[]{Boolean.valueOf(z)}, 1));
        G10.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        return m98isCacheStale8Mi8wO0(date, z ? CACHE_REFRESH_PERIOD_IN_BACKGROUND : CACHE_REFRESH_PERIOD_IN_FOREGROUND, dateProvider);
    }

    public static /* synthetic */ boolean isCacheStale$default(Date date, boolean z, DateProvider dateProvider, int i, Object obj) {
        if ((i & 2) != 0) {
            dateProvider = new DefaultDateProvider();
        }
        return isCacheStale(date, z, dateProvider);
    }

    /* JADX INFO: renamed from: isCacheStale-8Mi8wO0, reason: not valid java name */
    public static final boolean m98isCacheStale8Mi8wO0(Date date, long j, DateProvider dateProvider) {
        G10.g(dateProvider, "dateProvider");
        if (date == null) {
            return true;
        }
        LE.a aVar = LE.B;
        return LE.k(OE.p(dateProvider.getNow().getTime() - date.getTime(), PE.E), j) >= 0;
    }

    /* JADX INFO: renamed from: isCacheStale-8Mi8wO0$default, reason: not valid java name */
    public static /* synthetic */ boolean m99isCacheStale8Mi8wO0$default(Date date, long j, DateProvider dateProvider, int i, Object obj) {
        if ((i & 2) != 0) {
            dateProvider = new DefaultDateProvider();
        }
        return m98isCacheStale8Mi8wO0(date, j, dateProvider);
    }
}
