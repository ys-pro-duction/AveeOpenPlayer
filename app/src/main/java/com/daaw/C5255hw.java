package com.daaw;

import android.content.SharedPreferences;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import j$.time.LocalDateTime;
import j$.time.format.DateTimeFormatter;

/* JADX INFO: renamed from: com.daaw.hw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5255hw {
    public final DateTimeFormatter a;
    public final C3585bz0 b;

    public C5255hw(String str, LocalDateTime localDateTime, SharedPreferences sharedPreferences, DateTimeFormatter dateTimeFormatter) {
        G10.g(str, SubscriberAttributeKt.JSON_NAME_KEY);
        G10.g(sharedPreferences, "prefs");
        G10.g(dateTimeFormatter, "formatter");
        this.a = dateTimeFormatter;
        this.b = new C3585bz0(AbstractC5624jG0.f(String.class), str, localDateTime != null ? localDateTime.format(dateTimeFormatter) : null, sharedPreferences);
    }

    public final LocalDateTime a() {
        String str = (String) this.b.a();
        if (str != null) {
            return LocalDateTime.parse(str, this.a);
        }
        return null;
    }

    public final void b(LocalDateTime localDateTime) {
        this.b.b(localDateTime != null ? localDateTime.format(this.a) : null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C5255hw(String str, LocalDateTime localDateTime, SharedPreferences sharedPreferences, DateTimeFormatter dateTimeFormatter, int i, AbstractC2911Yw abstractC2911Yw) {
        if ((i & 8) != 0) {
            dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
            G10.f(dateTimeFormatter, "ISO_LOCAL_DATE_TIME");
        }
        this(str, localDateTime, sharedPreferences, dateTimeFormatter);
    }
}
