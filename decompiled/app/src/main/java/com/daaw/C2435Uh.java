package com.daaw;

import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* JADX INFO: renamed from: com.daaw.Uh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2435Uh {
    public final SimpleDateFormat a;
    public final MG0 b;

    public C2435Uh(MG0 mg0) {
        this.b = mg0;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
        this.a = simpleDateFormat;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("UTC"));
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        simpleDateFormat.setCalendar(gregorianCalendar);
    }
}
