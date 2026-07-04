package com.daaw;

import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public class I31 {
    public static final I31 c = new I31(null, null);
    public final Long a;
    public final TimeZone b;

    public I31(Long l, TimeZone timeZone) {
        this.a = l;
        this.b = timeZone;
    }

    public static I31 c() {
        return c;
    }

    public Calendar a() {
        return b(this.b);
    }

    public Calendar b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l = this.a;
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        return calendar;
    }
}
