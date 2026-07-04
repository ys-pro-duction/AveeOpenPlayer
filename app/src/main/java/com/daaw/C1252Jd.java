package com.daaw;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;

/* JADX INFO: renamed from: com.daaw.Jd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1252Jd {
    public static final C1252Jd a = new C1252Jd();

    public final AutofillId a(ViewStructure viewStructure) {
        G10.g(viewStructure, "structure");
        return viewStructure.getAutofillId();
    }

    public final boolean b(AutofillValue autofillValue) {
        G10.g(autofillValue, "value");
        return autofillValue.isDate();
    }

    public final boolean c(AutofillValue autofillValue) {
        G10.g(autofillValue, "value");
        return autofillValue.isList();
    }

    public final boolean d(AutofillValue autofillValue) {
        G10.g(autofillValue, "value");
        return autofillValue.isText();
    }

    public final boolean e(AutofillValue autofillValue) {
        G10.g(autofillValue, "value");
        return autofillValue.isToggle();
    }

    public final void f(ViewStructure viewStructure, String[] strArr) {
        G10.g(viewStructure, "structure");
        G10.g(strArr, "hints");
        viewStructure.setAutofillHints(strArr);
    }

    public final void g(ViewStructure viewStructure, AutofillId autofillId, int i) {
        G10.g(viewStructure, "structure");
        G10.g(autofillId, "parent");
        viewStructure.setAutofillId(autofillId, i);
    }

    public final void h(ViewStructure viewStructure, int i) {
        G10.g(viewStructure, "structure");
        viewStructure.setAutofillType(i);
    }

    public final CharSequence i(AutofillValue autofillValue) {
        G10.g(autofillValue, "value");
        CharSequence textValue = autofillValue.getTextValue();
        G10.f(textValue, "value.textValue");
        return textValue;
    }
}
