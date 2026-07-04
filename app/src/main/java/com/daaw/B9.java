package com.daaw;

import android.content.res.Configuration;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: classes.dex */
public abstract class B9 extends PreferenceActivity {
    public Z8 B;

    public final Z8 a() {
        if (this.B == null) {
            this.B = Z8.l(this, null);
        }
        return this.B;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().f(view, layoutParams);
    }

    public AbstractC6687n2 b() {
        return a().w();
    }

    public void c(Toolbar toolbar) {
        a().Q(toolbar);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return a().t();
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        a().y();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a().A(configuration);
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a().x();
        a().B(bundle);
        super.onCreate(bundle);
    }

    @Override // android.preference.PreferenceActivity, android.app.ListActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        a().C();
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        a().D(bundle);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        a().E();
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        a().H();
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        a().S(charSequence);
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        a().M(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        a().N(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().O(view, layoutParams);
    }
}
