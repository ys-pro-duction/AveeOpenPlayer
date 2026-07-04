package com.daaw;

import android.content.Context;
import android.content.res.Resources;
import com.daaw.AbstractC7382pY0;

/* JADX INFO: loaded from: classes.dex */
public abstract class EY0 {
    public static final String a(int i, InterfaceC5781jp interfaceC5781jp, int i2) {
        String string;
        interfaceC5781jp.e(-726638443);
        if (AbstractC6348lp.O()) {
            AbstractC6348lp.Z(-726638443, i2, -1, "androidx.compose.material.getString (Strings.android.kt:24)");
        }
        interfaceC5781jp.O(B5.f());
        Resources resources = ((Context) interfaceC5781jp.O(B5.g())).getResources();
        AbstractC7382pY0.a aVar = AbstractC7382pY0.a;
        if (AbstractC7382pY0.i(i, aVar.e())) {
            string = resources.getString(HD0.g);
            G10.f(string, "resources.getString(R.string.navigation_menu)");
        } else if (AbstractC7382pY0.i(i, aVar.a())) {
            string = resources.getString(HD0.a);
            G10.f(string, "resources.getString(R.string.close_drawer)");
        } else if (AbstractC7382pY0.i(i, aVar.b())) {
            string = resources.getString(HD0.b);
            G10.f(string, "resources.getString(R.string.close_sheet)");
        } else if (AbstractC7382pY0.i(i, aVar.c())) {
            string = resources.getString(HD0.c);
            G10.f(string, "resources.getString(R.st…ng.default_error_message)");
        } else if (AbstractC7382pY0.i(i, aVar.d())) {
            string = resources.getString(HD0.d);
            G10.f(string, "resources.getString(R.string.dropdown_menu)");
        } else if (AbstractC7382pY0.i(i, aVar.g())) {
            string = resources.getString(HD0.l);
            G10.f(string, "resources.getString(R.string.range_start)");
        } else if (AbstractC7382pY0.i(i, aVar.f())) {
            string = resources.getString(HD0.k);
            G10.f(string, "resources.getString(R.string.range_end)");
        } else {
            string = "";
        }
        if (AbstractC6348lp.O()) {
            AbstractC6348lp.Y();
        }
        interfaceC5781jp.L();
        return string;
    }
}
