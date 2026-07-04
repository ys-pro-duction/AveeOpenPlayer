package com.daaw;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.qE1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7582qE1 {
    public final int a;
    public final String b;
    public final Object c;

    public /* synthetic */ AbstractC7582qE1(int i, String str, Object obj, AbstractC5899kE1 abstractC5899kE1) {
        this.a = i;
        this.b = str;
        this.c = obj;
        zzba.zza().d(this);
    }

    public static AbstractC7582qE1 f(int i, String str, float f) {
        return new C5340iE1(1, str, Float.valueOf(f));
    }

    public static AbstractC7582qE1 g(int i, String str, int i2) {
        return new C4782gE1(1, str, Integer.valueOf(i2));
    }

    public static AbstractC7582qE1 h(int i, String str, long j) {
        return new C5061hE1(1, str, Long.valueOf(j));
    }

    public static AbstractC7582qE1 i(int i, String str, Boolean bool) {
        return new C4493fE1(i, str, bool);
    }

    public static AbstractC7582qE1 j(int i, String str, String str2) {
        return new C5617jE1(1, str, str2);
    }

    public static AbstractC7582qE1 k(int i, String str) {
        AbstractC7582qE1 abstractC7582qE1J = j(1, "gads:sdk_core_constants:experiment_id", null);
        zzba.zza().c(abstractC7582qE1J);
        return abstractC7582qE1J;
    }

    public abstract Object a(JSONObject jSONObject);

    public abstract Object b(Bundle bundle);

    public abstract Object c(SharedPreferences sharedPreferences);

    public abstract void d(SharedPreferences.Editor editor, Object obj);

    public final int e() {
        return this.a;
    }

    public final Object l() {
        return zzba.zzc().b(this);
    }

    public final Object m() {
        return this.c;
    }

    public final String n() {
        return this.b;
    }
}
