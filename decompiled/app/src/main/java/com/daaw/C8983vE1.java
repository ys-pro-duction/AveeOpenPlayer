package com.daaw;

/* JADX INFO: renamed from: com.daaw.vE1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8983vE1 implements RF1 {
    public final /* synthetic */ SharedPreferencesOnSharedPreferenceChangeListenerC9262wE1 a;

    public C8983vE1(SharedPreferencesOnSharedPreferenceChangeListenerC9262wE1 sharedPreferencesOnSharedPreferenceChangeListenerC9262wE1) {
        this.a = sharedPreferencesOnSharedPreferenceChangeListenerC9262wE1;
    }

    @Override // com.daaw.RF1
    public final String a(String str, String str2) {
        return this.a.e.getString(str, str2);
    }

    @Override // com.daaw.RF1
    public final Double b(String str, double d) {
        try {
            return Double.valueOf(this.a.e.getFloat(str, (float) d));
        } catch (ClassCastException unused) {
            return Double.valueOf(this.a.e.getString(str, String.valueOf(d)));
        }
    }

    @Override // com.daaw.RF1
    public final Long c(String str, long j) {
        try {
            return Long.valueOf(this.a.e.getLong(str, j));
        } catch (ClassCastException unused) {
            return Long.valueOf(this.a.e.getInt(str, (int) j));
        }
    }

    @Override // com.daaw.RF1
    public final Boolean d(String str, boolean z) {
        try {
            return Boolean.valueOf(this.a.e.getBoolean(str, z));
        } catch (ClassCastException unused) {
            return Boolean.valueOf(this.a.e.getString(str, String.valueOf(z)));
        }
    }
}
