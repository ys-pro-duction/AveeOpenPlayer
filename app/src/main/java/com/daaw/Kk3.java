package com.daaw;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.gms.ads.internal.overlay.zzr;

/* JADX INFO: loaded from: classes.dex */
public final class Kk3 extends AnimatorListenerAdapter {
    public final /* synthetic */ zzr a;

    public Kk3(zzr zzrVar) {
        this.a = zzrVar;
    }

    public final void a(boolean z) {
        this.a.setEnabled(z);
        this.a.B.setEnabled(z);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        a(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        a(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        a(false);
    }
}
