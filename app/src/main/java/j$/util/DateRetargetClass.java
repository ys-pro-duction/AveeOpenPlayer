package j$.util;

import com.revenuecat.purchases.common.UtilsKt;
import j$.time.Instant;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DateRetargetClass {
    public static Instant toInstant(Date date) {
        long time = date.getTime();
        Instant instant = Instant.c;
        long j = 1000;
        return Instant.K(j$.com.android.tools.r8.a.T(time, j), ((int) j$.com.android.tools.r8.a.S(time, j)) * UtilsKt.MICROS_MULTIPLIER);
    }
}
