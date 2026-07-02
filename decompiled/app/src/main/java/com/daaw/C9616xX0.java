package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: com.daaw.xX0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C9616xX0 {
    public static final C1980Qd0 b = new C1980Qd0(C9616xX0.class.getSimpleName());
    public P90 a;

    /* JADX INFO: renamed from: com.daaw.xX0$a */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.DEFAULT_APP_CHECK_TOKEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.UNKNOWN_APP_CHECK_TOKEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.xX0$b */
    public enum b {
        DEFAULT_APP_CHECK_TOKEN,
        UNKNOWN_APP_CHECK_TOKEN
    }

    public C9616xX0(final Context context, String str) {
        AbstractC7506py0.l(context);
        AbstractC7506py0.f(str);
        final String str2 = String.format("com.google.firebase.appcheck.store.%s", str);
        this.a = new P90(new InterfaceC7569qB0() { // from class: com.daaw.wX0
            @Override // com.daaw.InterfaceC7569qB0
            public final Object get() {
                return context.getSharedPreferences(str2, 0);
            }
        });
    }

    public void b() {
        ((SharedPreferences) this.a.get()).edit().remove("com.google.firebase.appcheck.APP_CHECK_TOKEN").remove("com.google.firebase.appcheck.TOKEN_TYPE").apply();
    }

    public L8 c() {
        String string = ((SharedPreferences) this.a.get()).getString("com.google.firebase.appcheck.TOKEN_TYPE", null);
        String string2 = ((SharedPreferences) this.a.get()).getString("com.google.firebase.appcheck.APP_CHECK_TOKEN", null);
        if (string != null && string2 != null) {
            try {
                int i = a.a[b.valueOf(string).ordinal()];
                if (i == 1) {
                    return C1639Mw.e(string2);
                }
                if (i == 2) {
                    return C1639Mw.d(string2);
                }
                b.d("Reached unreachable section in #retrieveAppCheckToken()");
                return null;
            } catch (IllegalArgumentException e) {
                b.d("Failed to parse TokenType of stored token  with type [" + string + "] with exception: " + e.getMessage());
                b();
            }
        }
        return null;
    }

    public void d(L8 l8) {
        if (l8 instanceof C1639Mw) {
            ((SharedPreferences) this.a.get()).edit().putString("com.google.firebase.appcheck.APP_CHECK_TOKEN", ((C1639Mw) l8).i()).putString("com.google.firebase.appcheck.TOKEN_TYPE", b.DEFAULT_APP_CHECK_TOKEN.name()).apply();
        } else {
            ((SharedPreferences) this.a.get()).edit().putString("com.google.firebase.appcheck.APP_CHECK_TOKEN", l8.b()).putString("com.google.firebase.appcheck.TOKEN_TYPE", b.UNKNOWN_APP_CHECK_TOKEN.name()).apply();
        }
    }
}
