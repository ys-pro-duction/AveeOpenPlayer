package com.daaw.avee;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.EditTextPreference;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceGroup;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.daaw.AbstractC0405Bb1;
import com.daaw.AbstractC5056hD0;
import com.daaw.AbstractC5339iE0;
import com.daaw.AbstractC6339ln0;
import com.daaw.AbstractC6687n2;
import com.daaw.AbstractC9815yD0;
import com.daaw.B9;
import com.daaw.C0746Eg1;
import com.daaw.C10217zg1;
import com.daaw.C2980Zn0;
import com.daaw.C9938yg1;
import com.daaw.DialogFragmentC1037Hb0;
import com.daaw.GD0;
import com.daaw.IL;
import com.daaw.JD0;
import com.daaw.SharedPreferencesOnSharedPreferenceChangeListenerC5706ja;
import com.daaw.WB0;
import com.daaw.avee.SettingsActivity;

/* JADX INFO: loaded from: classes.dex */
public class SettingsActivity extends B9 {
    public static C10217zg1 C = new C10217zg1();
    public static C10217zg1 D = new C10217zg1();
    public static C10217zg1 E = new C10217zg1();
    public static C9938yg1 F = new C9938yg1();
    public static C9938yg1 G = new C9938yg1();

    public static class a extends PreferenceFragment {

        /* JADX INFO: renamed from: com.daaw.avee.SettingsActivity$a$a, reason: collision with other inner class name */
        public class C0149a implements Preference.OnPreferenceClickListener {

            /* JADX INFO: renamed from: com.daaw.avee.SettingsActivity$a$a$a, reason: collision with other inner class name */
            public class DialogInterfaceOnClickListenerC0150a implements DialogInterface.OnClickListener {
                public DialogInterfaceOnClickListenerC0150a() {
                }

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    a aVar = a.this;
                    aVar.k(aVar.getActivity().getApplicationContext());
                }
            }

            public C0149a() {
            }

            @Override // android.preference.Preference.OnPreferenceClickListener
            public boolean onPreferenceClick(Preference preference) {
                AlertDialog.Builder builder = new AlertDialog.Builder(a.this.getActivity());
                builder.setTitle(JD0.C4);
                builder.setMessage(JD0.B4);
                builder.setPositiveButton(JD0.Z0, new DialogInterfaceOnClickListenerC0150a());
                builder.setNegativeButton(JD0.S0, (DialogInterface.OnClickListener) null);
                builder.create().show();
                return true;
            }
        }

        public class b implements Preference.OnPreferenceChangeListener {
            public b() {
            }

            @Override // android.preference.Preference.OnPreferenceChangeListener
            public boolean onPreferenceChange(Preference preference, Object obj) {
                SettingsActivity.C.a(obj);
                return true;
            }
        }

        public class c implements Preference.OnPreferenceClickListener {
            public c() {
            }

            @Override // android.preference.Preference.OnPreferenceClickListener
            public boolean onPreferenceClick(Preference preference) {
                SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().S();
                return true;
            }
        }

        public class d implements Preference.OnPreferenceClickListener {
            public d() {
            }

            @Override // android.preference.Preference.OnPreferenceClickListener
            public boolean onPreferenceClick(Preference preference) {
                DialogFragmentC1037Hb0.e(a.this.getFragmentManager(), true, GD0.E, JD0.z4, "");
                return true;
            }
        }

        public class e implements Preference.OnPreferenceClickListener {
            public e() {
            }

            @Override // android.preference.Preference.OnPreferenceClickListener
            public boolean onPreferenceClick(Preference preference) {
                DialogFragmentC1037Hb0.e(a.this.getFragmentManager(), true, GD0.D, JD0.A4, "");
                return true;
            }
        }

        public class f implements Preference.OnPreferenceChangeListener {
            public f() {
            }

            @Override // android.preference.Preference.OnPreferenceChangeListener
            public boolean onPreferenceChange(Preference preference, Object obj) {
                preference.setSummary(obj.toString());
                return true;
            }
        }

        public class g implements Preference.OnPreferenceChangeListener {
            public g() {
            }

            @Override // android.preference.Preference.OnPreferenceChangeListener
            public boolean onPreferenceChange(Preference preference, Object obj) {
                preference.setSummary(obj.toString());
                SettingsActivity.E.a(Integer.valueOf(AbstractC0405Bb1.x(obj.toString(), 0)));
                return true;
            }
        }

        public static /* synthetic */ boolean c(Preference preference) {
            SettingsActivity.G.a();
            return true;
        }

        public static /* synthetic */ boolean e(Preference preference, Object obj) {
            SettingsActivity.D.a((Boolean) obj);
            return true;
        }

        public static /* synthetic */ boolean f(Preference preference) {
            SettingsActivity.F.a();
            return true;
        }

        public final void g() {
            findPreference("pref_resetToDefault").setOnPreferenceClickListener(new C0149a());
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) findPreference("pref_disableHeaderAds");
            C0746Eg1 c0746Eg1 = WB0.m;
            Boolean bool = Boolean.FALSE;
            checkBoxPreference.setEnabled(((Boolean) c0746Eg1.a(bool)).booleanValue());
            if (!((Boolean) WB0.m.a(bool)).booleanValue()) {
                checkBoxPreference.setWidgetLayoutResource(AbstractC9815yD0.t0);
            }
            checkBoxPreference.setChecked(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().K(getActivity(), "pref_disableHeaderAds", false));
            checkBoxPreference.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() { // from class: com.daaw.EQ0
                @Override // android.preference.Preference.OnPreferenceChangeListener
                public final boolean onPreferenceChange(Preference preference, Object obj) {
                    return this.a.h(preference, obj);
                }
            });
            CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference) findPreference("pref_alwaysHideAppLogo");
            checkBoxPreference2.setEnabled(((Boolean) WB0.m.a(bool)).booleanValue());
            if (!((Boolean) WB0.m.a(bool)).booleanValue()) {
                checkBoxPreference2.setWidgetLayoutResource(AbstractC9815yD0.t0);
            }
            checkBoxPreference2.setChecked(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().K(getActivity(), "pref_alwaysHideAppLogo", false));
            checkBoxPreference2.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() { // from class: com.daaw.FQ0
                @Override // android.preference.Preference.OnPreferenceChangeListener
                public final boolean onPreferenceChange(Preference preference, Object obj) {
                    return this.a.i(preference, obj);
                }
            });
            Preference preferenceFindPreference = findPreference("pref_appTheme");
            preferenceFindPreference.setOnPreferenceClickListener(new C2980Zn0(getActivity()));
            preferenceFindPreference.setOnPreferenceChangeListener(new b());
            findPreference("pref_resetTips").setOnPreferenceClickListener(new c());
            findPreference("pref_fontsLicenses").setOnPreferenceClickListener(new d());
            findPreference("pref_openSourceLicenses").setOnPreferenceClickListener(new e());
            EditTextPreference editTextPreference = (EditTextPreference) findPreference("pref_playlistDefaultPath");
            editTextPreference.setSummary(editTextPreference.getText());
            editTextPreference.setOnPreferenceChangeListener(new f());
            EditTextPreference editTextPreference2 = (EditTextPreference) findPreference("pref_audioVisOffset");
            editTextPreference2.setSummary(editTextPreference2.getText());
            editTextPreference2.setOnPreferenceChangeListener(new g());
            ((CheckBoxPreference) findPreference("pref_highQualityBlur")).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() { // from class: com.daaw.GQ0
                @Override // android.preference.Preference.OnPreferenceChangeListener
                public final boolean onPreferenceChange(Preference preference, Object obj) {
                    return SettingsActivity.a.e(preference, obj);
                }
            });
            findPreference("pref_clearCache").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: com.daaw.HQ0
                @Override // android.preference.Preference.OnPreferenceClickListener
                public final boolean onPreferenceClick(Preference preference) {
                    return SettingsActivity.a.f(preference);
                }
            });
            findPreference("pref_eula").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: com.daaw.IQ0
                @Override // android.preference.Preference.OnPreferenceClickListener
                public final boolean onPreferenceClick(Preference preference) {
                    return SettingsActivity.a.c(preference);
                }
            });
            findPreference("pref_privacyPolicy").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: com.daaw.JQ0
                @Override // android.preference.Preference.OnPreferenceClickListener
                public final boolean onPreferenceClick(Preference preference) {
                    return this.a.j(preference);
                }
            });
        }

        public final /* synthetic */ boolean h(Preference preference, Object obj) {
            if (!(obj instanceof Boolean)) {
                return true;
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().Q(getActivity(), "pref_disableHeaderAds", ((Boolean) obj).booleanValue());
            return true;
        }

        public final /* synthetic */ boolean i(Preference preference, Object obj) {
            if (!(obj instanceof Boolean)) {
                return true;
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().Q(getActivity(), "pref_alwaysHideAppLogo", ((Boolean) obj).booleanValue());
            return true;
        }

        public final /* synthetic */ boolean j(Preference preference) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.aveeplayer.com/policy.html")));
            return true;
        }

        public void k(Context context) {
            PreferenceManager.getDefaultSharedPreferences(context).edit().clear().commit();
            PreferenceManager.setDefaultValues(context, AbstractC5339iE0.a, true);
            setPreferenceScreen(null);
            addPreferencesFromResource(AbstractC5339iE0.a);
            g();
        }

        public final void l(PreferenceGroup preferenceGroup) {
            if (preferenceGroup == null) {
                return;
            }
            for (int i = 0; i < preferenceGroup.getPreferenceCount(); i++) {
                Preference preference = preferenceGroup.getPreference(i);
                preference.setSingleLineTitle(false);
                if (preference instanceof PreferenceGroup) {
                    l((PreferenceGroup) preference);
                }
            }
        }

        @Override // android.preference.PreferenceFragment, android.app.Fragment
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().T(getActivity());
            addPreferencesFromResource(AbstractC5339iE0.a);
            g();
        }

        @Override // android.preference.PreferenceFragment
        public void setPreferenceScreen(PreferenceScreen preferenceScreen) {
            if (Build.VERSION.SDK_INT >= 26) {
                l(preferenceScreen);
            }
            super.setPreferenceScreen(preferenceScreen);
        }
    }

    public void d() {
        AbstractC6687n2 abstractC6687n2B = b();
        if (abstractC6687n2B != null) {
            abstractC6687n2B.x(getString(JD0.H));
            abstractC6687n2B.s(true);
        }
    }

    @Override // com.daaw.B9, android.preference.PreferenceActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        IL.a().c("SettingsActivity onCreate");
        setContentView(AbstractC9815yD0.z0);
        c((Toolbar) findViewById(AbstractC5056hD0.y3));
        d();
        getFragmentManager().beginTransaction().replace(AbstractC5056hD0.D0, new a()).commit();
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        AbstractC6339ln0.e(this);
        return true;
    }
}
