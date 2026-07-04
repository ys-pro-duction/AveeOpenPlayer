package com.daaw;

import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class V5 implements InterfaceC3291av0 {
    @Override // com.daaw.InterfaceC3291av0
    public List a() {
        Locale locale = Locale.getDefault();
        G10.f(locale, "getDefault()");
        return AbstractC1496Lm.e(new U5(locale));
    }

    @Override // com.daaw.InterfaceC3291av0
    public InterfaceC3008Zu0 b(String str) {
        G10.g(str, "languageTag");
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        G10.f(localeForLanguageTag, "forLanguageTag(languageTag)");
        return new U5(localeForLanguageTag);
    }
}
