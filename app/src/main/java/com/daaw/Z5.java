package com.daaw;

import android.os.LocaleList;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class Z5 implements InterfaceC3291av0 {
    @Override // com.daaw.InterfaceC3291av0
    public List a() {
        LocaleList localeList = LocaleList.getDefault();
        G10.f(localeList, "getDefault()");
        ArrayList arrayList = new ArrayList();
        int size = localeList.size();
        for (int i = 0; i < size; i++) {
            Locale locale = localeList.get(i);
            G10.f(locale, "localeList[i]");
            arrayList.add(new U5(locale));
        }
        return arrayList;
    }

    @Override // com.daaw.InterfaceC3291av0
    public InterfaceC3008Zu0 b(String str) {
        G10.g(str, "languageTag");
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        G10.f(localeForLanguageTag, "forLanguageTag(languageTag)");
        return new U5(localeForLanguageTag);
    }
}
