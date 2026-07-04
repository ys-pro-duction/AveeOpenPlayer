package com.daaw;

import j$.time.LocalDateTime;
import j$.time.ZonedDateTime;
import j$.time.chrono.ChronoLocalDateTime;
import j$.util.Optional;

/* JADX INFO: renamed from: com.daaw.Cu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0583Cu {
    public static final C0583Cu a = new C0583Cu();

    public static /* synthetic */ LocalDateTime d(C0583Cu c0583Cu, InterfaceC6094ku interfaceC6094ku, ZonedDateTime zonedDateTime, int i, Object obj) {
        if ((i & 1) != 0) {
            zonedDateTime = ZonedDateTime.now();
            G10.f(zonedDateTime, "now(...)");
        }
        return c0583Cu.c(interfaceC6094ku, zonedDateTime);
    }

    public final boolean a(LocalDateTime localDateTime, String str) {
        InterfaceC6094ku interfaceC6094kuB = str != null ? a.b(str) : null;
        if (interfaceC6094kuB == null) {
            return false;
        }
        LocalDateTime localDateTimeD = d(this, interfaceC6094kuB, null, 1, null);
        if (localDateTime == null) {
            localDateTime = LocalDateTime.MIN;
        }
        return localDateTime.compareTo((ChronoLocalDateTime<?>) localDateTimeD) < 0;
    }

    public final InterfaceC6094ku b(String str) {
        G10.g(str, "text");
        try {
            return new C10006yu(C7489pu.d(EnumC0479Bu.UNIX)).f(str);
        } catch (Exception e) {
            C0583Cu.class.toString();
            e.getMessage();
            return null;
        }
    }

    public final LocalDateTime c(InterfaceC6094ku interfaceC6094ku, ZonedDateTime zonedDateTime) {
        G10.g(interfaceC6094ku, "<this>");
        G10.g(zonedDateTime, "now");
        Optional optionalA = AbstractC10113zI.a(interfaceC6094ku).a(zonedDateTime);
        G10.f(optionalA, "lastExecution(...)");
        ZonedDateTime zonedDateTime2 = (ZonedDateTime) AbstractC4107dr0.a(optionalA);
        if (zonedDateTime2 != null) {
            return zonedDateTime2.A();
        }
        return null;
    }
}
