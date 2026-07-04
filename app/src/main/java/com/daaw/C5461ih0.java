package com.daaw;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;

/* JADX INFO: renamed from: com.daaw.ih0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5461ih0<S> extends AbstractC9728xu0 {
    public int H0;
    public CalendarConstraints I0;

    /* JADX INFO: renamed from: com.daaw.ih0$a */
    public class a extends AbstractC0360Aq0 {
        public a() {
        }
    }

    public static C5461ih0 K1(DateSelector dateSelector, int i, CalendarConstraints calendarConstraints) {
        C5461ih0 c5461ih0 = new C5461ih0();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("DATE_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        c5461ih0.y1(bundle);
        return c5461ih0;
    }

    @Override // androidx.fragment.app.c
    public void N0(Bundle bundle) {
        super.N0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.H0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.I0);
    }

    @Override // androidx.fragment.app.c
    public void r0(Bundle bundle) {
        super.r0(bundle);
        if (bundle == null) {
            bundle = s();
        }
        this.H0 = bundle.getInt("THEME_RES_ID_KEY");
        AbstractC6314li0.a(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.I0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.c
    public View v0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(u(), this.H0));
        new a();
        throw null;
    }
}
