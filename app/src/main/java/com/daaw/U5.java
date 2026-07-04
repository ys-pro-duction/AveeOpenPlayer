package com.daaw;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class U5 implements InterfaceC3008Zu0 {
    public final Locale a;

    public U5(Locale locale) {
        G10.g(locale, "javaLocale");
        this.a = locale;
    }

    @Override // com.daaw.InterfaceC3008Zu0
    public String a() {
        String languageTag = this.a.toLanguageTag();
        G10.f(languageTag, "javaLocale.toLanguageTag()");
        return languageTag;
    }

    public final Locale b() {
        return this.a;
    }
}
