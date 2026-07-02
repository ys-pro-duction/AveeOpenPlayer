package com.daaw;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.daaw.AbstractC8245se;
import com.daaw.AbstractC9878yT;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;

/* JADX INFO: renamed from: com.daaw.iS0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C5395iS0 extends AbstractC7640qT implements InterfaceC0870Fl1 {
    public static final /* synthetic */ int L = 0;
    public final boolean H;
    public final C2763Xl I;
    public final Bundle J;
    public final Integer K;

    public C5395iS0(Context context, Looper looper, boolean z, C2763Xl c2763Xl, Bundle bundle, AbstractC9878yT.a aVar, AbstractC9878yT.b bVar) {
        super(context, looper, 44, c2763Xl, aVar, bVar);
        this.H = true;
        this.I = c2763Xl;
        this.J = bundle;
        this.K = c2763Xl.g();
    }

    public static Bundle L(C2763Xl c2763Xl) {
        c2763Xl.f();
        Integer numG = c2763Xl.g();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c2763Xl.a());
        if (numG != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", numG.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override // com.daaw.InterfaceC0870Fl1
    public final void b(InterfaceC0974Gl1 interfaceC0974Gl1) {
        AbstractC7506py0.m(interfaceC0974Gl1, "Expecting a valid ISignInCallbacks");
        try {
            Account accountB = this.I.b();
            ((C1390Kl1) getService()).Z2(new zai(1, new zat(accountB, ((Integer) AbstractC7506py0.l(this.K)).intValue(), AbstractC8245se.DEFAULT_ACCOUNT.equals(accountB.name) ? C9058vX0.a(getContext()).b() : null)), interfaceC0974Gl1);
        } catch (RemoteException e) {
            try {
                interfaceC0974Gl1.t0(new zak(1, new ConnectionResult(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // com.daaw.InterfaceC0870Fl1
    public final void c() {
        connect(new AbstractC8245se.d());
    }

    @Override // com.daaw.AbstractC8245se
    public final /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof C1390Kl1 ? (C1390Kl1) iInterfaceQueryLocalInterface : new C1390Kl1(iBinder);
    }

    @Override // com.daaw.AbstractC8245se
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.daaw.AbstractC8245se
    public final Bundle h() {
        if (!getContext().getPackageName().equals(this.I.d())) {
            this.J.putString("com.google.android.gms.signin.internal.realClientPackageName", this.I.d());
        }
        return this.J;
    }

    @Override // com.daaw.AbstractC8245se
    public final String k() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.daaw.AbstractC8245se
    public final String l() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.daaw.AbstractC8245se, com.daaw.C5033h8.f
    public final boolean requiresSignIn() {
        return this.H;
    }
}
