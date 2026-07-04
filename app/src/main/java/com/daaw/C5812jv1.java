package com.daaw;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.daaw.jv1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5812jv1 extends F53 {
    public long c;
    public String d;
    public AccountManager e;
    public Boolean f;
    public long g;

    public C5812jv1(C9327wU2 c9327wU2) {
        super(c9327wU2);
    }

    @Override // com.daaw.F53
    public final boolean f() {
        Calendar calendar = Calendar.getInstance();
        this.c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.d = language.toLowerCase(locale2) + "-" + locale.getCountry().toLowerCase(locale2);
        return false;
    }

    public final long k() {
        d();
        return this.g;
    }

    public final long l() {
        g();
        return this.c;
    }

    public final String m() {
        g();
        return this.d;
    }

    public final void n() {
        d();
        this.f = null;
        this.g = 0L;
    }

    public final boolean o() {
        Account[] result;
        d();
        long jA = this.a.p().a();
        if (jA - this.g > 86400000) {
            this.f = null;
        }
        Boolean bool = this.f;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (AbstractC9438ws.a(this.a.v(), "android.permission.GET_ACCOUNTS") != 0) {
            this.a.w().y().a("Permission error checking for dasher/unicorn accounts");
            this.g = jA;
            this.f = Boolean.FALSE;
            return false;
        }
        if (this.e == null) {
            this.e = AccountManager.get(this.a.v());
        }
        try {
            result = this.e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
        } catch (AuthenticatorException e) {
            e = e;
            this.a.w().q().b("Exception checking account types", e);
        } catch (OperationCanceledException e2) {
            e = e2;
            this.a.w().q().b("Exception checking account types", e);
        } catch (IOException e3) {
            e = e3;
            this.a.w().q().b("Exception checking account types", e);
        }
        if (result != null && result.length > 0) {
            this.f = Boolean.TRUE;
            this.g = jA;
            return true;
        }
        Account[] result2 = this.e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
        if (result2 != null && result2.length > 0) {
            this.f = Boolean.TRUE;
            this.g = jA;
            return true;
        }
        this.g = jA;
        this.f = Boolean.FALSE;
        return false;
    }
}
