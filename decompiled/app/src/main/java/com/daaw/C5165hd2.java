package com.daaw;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;

/* JADX INFO: renamed from: com.daaw.hd2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5165hd2 implements R62, InterfaceC8791ub2 {
    public final C7912rR1 B;
    public final Context C;
    public final JR1 D;
    public final View E;
    public String F;
    public final AB1 G;

    public C5165hd2(C7912rR1 c7912rR1, Context context, JR1 jr1, View view, AB1 ab1) {
        this.B = c7912rR1;
        this.C = context;
        this.D = jr1;
        this.E = view;
        this.G = ab1;
    }

    @Override // com.daaw.R62
    public final void t(VP1 vp1, String str, String str2) {
        if (this.D.z(this.C)) {
            try {
                JR1 jr1 = this.D;
                Context context = this.C;
                jr1.t(context, jr1.f(context), this.B.a(), vp1.zzc(), vp1.zzb());
            } catch (RemoteException e) {
                AbstractC4274eT1.zzk("Remote Exception to get reward item.", e);
            }
        }
    }

    @Override // com.daaw.R62
    public final void zza() {
        this.B.d(false);
    }

    @Override // com.daaw.R62
    public final void zzc() {
        View view = this.E;
        if (view != null && this.F != null) {
            this.D.x(view.getContext(), this.F);
        }
        this.B.d(true);
    }

    @Override // com.daaw.InterfaceC8791ub2
    public final void zzl() {
        if (this.G == AB1.APP_OPEN) {
            return;
        }
        String strI = this.D.i(this.C);
        this.F = strI;
        this.F = String.valueOf(strI).concat(this.G == AB1.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
    }

    @Override // com.daaw.R62
    public final void zzb() {
    }

    @Override // com.daaw.R62
    public final void zze() {
    }

    @Override // com.daaw.R62
    public final void zzf() {
    }

    @Override // com.daaw.InterfaceC8791ub2
    public final void zzk() {
    }
}
